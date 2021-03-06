-- Marques
insert into marque (id, name) values (1, 'Citroen');
insert into marque (id, name) values (2, 'Skoda');
insert into marque (id, name) values (3, 'Tesla');
insert into marque (id, name) values (4, 'Peugeot');
insert into marque (id, name) values (5, 'Renault');
insert into marque (id, name) values (6, 'Ford');
insert into marque (id, name) values (7, 'Hyundai');

-- concessionaires
insert into concessionnaire (id, name, adresse) values (1, 'Car service Maubeuge', 4);
insert into concessionnaire (id, name, adresse) values (2, 'Car service Saint-Saulve', 5);
insert into concessionnaire (id, name, adresse) values (3, 'Gibaud pere et fils', 2);
insert into concessionnaire (id, name, adresse) values (4, 'Ring and vroum', 3);
insert into concessionnaire (id, name, adresse) values (5, 'La routourne va tourner', 1);

-- Adresses
insert into adresse (id, numero, rue, ville, code_postal) values (1, 54, 'rue Pere Fouras', 'Maubeuge', 59300);
insert into adresse (id, numero, rue, ville, code_postal) values (2, 15, 'avenue Mc Donagal', 'Landrecies', 59550);
insert into adresse (id, numero, rue, ville, code_postal) values (3, 731, 'avenue Tom Jedusor', 'Lille', 59000);
insert into adresse (id, numero, rue, ville, code_postal) values (4, 741, 'ZI Yolo', 'Maubeuge', 59300);
insert into adresse (id, numero, rue, ville, code_postal) values (5, 54, 'ZI Balmain', 'Saint-Saulve', 59300);

-- Clients
insert into client (id, name, voitures) values (1, 'Chiara', '1');
insert into client (id, name, voitures) values (2, 'Jean-Francois', '2,3');
insert into client (id, name, voitures) values (3, 'Julien', '4');
insert into client (id, name, voitures) values (4, 'Tiffany', '2');
insert into client (id, name, voitures) values (5, 'Adrien', '1');
insert into client (id, name, voitures) values (6, 'Celine', '2');
insert into client (id, name, voitures) values (7, 'Christelle', '4');
insert into client (id, name, voitures) values (8, 'Bernadette', '1');
insert into client (id, name, voitures) values (9, 'Sylvie', '1');
insert into client (id, name, voitures) values (10, 'Kenzo', '1');
insert into client (id, name, voitures) values (11, 'Romain', '1');

-- Voitures
insert into voiture (id, name, marque, numero_de_serie, date_immatriculation, couleur, nombre_portes, categorie)
values (1, 'C2', 'Citroen', 475641, '2006-08-05', 'bleu foncé', 3, 'citadine');
insert into voiture (id, name, marque, numero_de_serie, date_immatriculation, couleur, nombre_portes, categorie)
values (2, 'Fabia', 'Skoda', 276541, '2016-08-05', 'rouge torino', 5, 'compacte');
insert into voiture (id, name, marque, numero_de_serie, date_immatriculation, couleur, nombre_portes, categorie)
values (3, '307', 'Peugeot', 521468, '2006-08-05', 'bleu foncé', 3, 'compacte');
insert into voiture (id, name, marque, numero_de_serie, date_immatriculation, couleur, nombre_portes, categorie)
values (4, '3', 'Tesla', 521468, '2019-08-05', 'blanc', 3, 'berline');
insert into voiture (id, name, marque, numero_de_serie, date_immatriculation, couleur, nombre_portes, categorie)
values (5, '206', 'Peugeot', 2566321, '2005-05-04', 'blanche', '3', 'citatdine');
insert into voiture (id, name, marque, numero_de_serie, date_immatriculation, couleur, nombre_portes, categorie)
values (6, 'Clio_3', 'Renault', 274563, '2009-08-04', 'grise', '3', 'citadine');
insert into voiture (id, name, marque, numero_de_serie, date_immatriculation, couleur, nombre_portes, categorie)
values (7, '3', 'Tesla', 102350, '2020-01-02', 'rouge', 3, 'berline');
insert into voiture (id, name, marque, numero_de_serie, date_immatriculation, couleur, nombre_portes, categorie)
values (8, '307', 'Peugeot', 011468, '2008-10-10', 'noire', 3, 'compacte');
insert into voiture (id, name, marque, numero_de_serie, date_immatriculation, couleur, nombre_portes, categorie)
values (9, '206', 'Peugeot', 568964, '2004-10-12', 'noire', 3, 'compacte');
insert into voiture (id, name, marque, numero_de_serie, date_immatriculation, couleur, nombre_portes, categorie)
values (10, 'C2', 'Citroen', 0819950, '2002-01-03', 'grise', 3, 'compacte');