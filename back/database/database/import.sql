INSERT INTO public.role (id, name) VALUES (DEFAULT, 'admin');
INSERT INTO public.role (id, name) VALUES (DEFAULT, 'customer');

INSERT INTO public."user" (id, role_id, username, password, status) VALUES (DEFAULT, 1, 'admin', '123', 'A');
INSERT INTO public."user" (id, role_id, username, password, status) VALUES (DEFAULT, 2, 'rain', '123', 'A');
INSERT INTO public."user" (id, role_id, username, password, status) VALUES (DEFAULT, 2, 'mitteaktiivne', '123', 'D');

INSERT INTO public.city (id, name) VALUES (DEFAULT, 'Pärnu');
INSERT INTO public.city (id, name) VALUES (DEFAULT, 'Tallinn');
INSERT INTO public.city (id, name) VALUES (DEFAULT, 'Tartu');