insert into client (id, name, voitures, adresse) values (1, 'Chiara', '1', 1);
insert into client (id, name, voitures, adresse) values (1, 'Jean-Francois', '2,3', 2);
insert into client (id, name, voitures, adresse) values (1, 'Julien', '4', 3);

insert into voiture (id, name, marque, numeroDeSerie, dateImmatriculation, couleur, nombrePortes, categorie, voiture_id)
values (1, 'C2', 'Citroen', 475641, 'bleu foncé', 3, 'citadine', 1);
insert into voiture (id, name, marque, numeroDeSerie, dateImmatriculation, couleur, nombrePortes, categorie, voiture_id)
values (2, 'Fabia', 'Skoda', 276541, 'rouge torino', 5, 'compacte', 2);
insert into voiture (id, name, marque, numeroDeSerie, dateImmatriculation, couleur, nombrePortes, categorie, voiture_id)
values (3, '307', 'Peugeot', 521468, 'bleu foncé', 3, 'compacte', 3);
insert into voiture (id, name, marque, numeroDeSerie, dateImmatriculation, couleur, nombrePortes, categorie, voiture_id)
values (4, '3', 'Tesla', 521468, 'blanc', 3, 'berline', 4);

insert into adresse (id, numero, rue, ville, codePostal) values (1, 54, 'rue Pere Fouras', 'Maubeuge', 59300);
insert into adresse (id, numero, rue, ville, codePostal) values (2, 15, 'avenue Mc Donagal', 'Landrecies', 59550);
insert into adresse (id, numero, rue, ville, codePostal) values (3, 731, 'avenue Tom Jedusor', 'Lille', 59000);