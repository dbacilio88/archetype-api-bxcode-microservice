INSERT INTO public.bc_demo
(de_id,de_uuid,de_code,de_name)
VALUES (nextval('BC_DEMO_SEQ'),gen_random_uuid(),'CODE_TEST_1','CODE TEST NUMBER 1');

SELECT * FROM public.bc_demo;
