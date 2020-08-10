SELECT *
FROM app_user u
INNER JOIN study_set s
ON s.owner_id = u.user_id
WHERE u.user_id = 5;
