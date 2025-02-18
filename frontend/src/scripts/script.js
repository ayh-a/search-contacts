
let searchButton = document.querySelector('#searchButton');

searchButton.addEventListener('click', function() {
    let query = document.querySelector('#query').value;
    console.log(query);

    const url = `http://localhost:8080/search?value=${query}`;

    fetch(url)
        .then((response) => {
            console.log(response);
            return response.json();
    })
    .then(data => {
        console.log(data);
        console.log(typeof data);

        processData(data);
    })
});

function processData(contacts) {
    let list = document.createElement('ul');
    list.classList.add('divide-y', 'divide-gray-200')

    let container = document.getElementById('contacts');
    container.innerHTML = "";

    if(contacts.length == 0) {
        container.innerHTML = "No contacts found";
        return;
    }

    contacts.forEach(contact => {
        let fullName = contact.fullName;
        let phone = contact.phoneNum;
        let location = contact.location;

        processContact(fullName, phone, location, list);
        container.appendChild(list);
    });

    function processContact(name, phone, location, list) {
        let listItem = document.createElement('li');
        listItem.classList.add('flex', 'items-center', 'justify-between', 'w-full', 'px-20', 'py-1')

        let contactContainer = document.createElement('div');
        contactContainer.innerHTML = `<h6 class="text-slate-800 font-medium">
                                        ${name}
                                      </h6>
                                      <p class="text-sm text-gray-500 truncate dark:text-gray-400">
                                        ${phone}
                                      </p>`;
        
        let locationDiv = document.createElement('div');
        locationDiv.classList.add('inline-flex', 'items-center', 'text-base', 'font-semibold', 'text-gray-900', 'ml-10');
        locationDiv.textContent = location;

        listItem.appendChild(contactContainer);
        listItem.appendChild(locationDiv);
        list.appendChild(listItem);
    }
}