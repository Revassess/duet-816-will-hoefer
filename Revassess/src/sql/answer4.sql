SELECT u.username, cg.name, f.question, f.answer
FROM app_user u
INNER JOIN study_set s
ON s.owner_id = u.user_id
INNER JOIN study_set_card sc 
ON sc.study_set_id = s.study_set_id
INNER JOIN flashcard f 
ON sc.flashcard_id = f.flashcard_id
INNER JOIN category cg 
ON cg.category_id = f.category_id
WHERE s.owner_id = 4;