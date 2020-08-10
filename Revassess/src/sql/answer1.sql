SELECT *
FROM app_user a
INNER JOIN user_role u
ON u.role_id = a.role_id
WHERE u.name = 'BASIC_USER';