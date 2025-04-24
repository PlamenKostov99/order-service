CREATE TABLE orders (
    id int not null ,
    sender_name varchar not null,
    receiver_name varchar not null,
    pick_up_address varchar not null,
    delivery_address varchar not null,
    package_details varchar not null,
    status varchar not null,
    create_at timestamp not null,
    updated_at timestamp not null
);
