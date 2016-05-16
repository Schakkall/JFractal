%:- initialization(fractal).
fractal(L) :-
	prepararAmbiente,
	drawTree(400, 500, -90, 3, L).
	%write(L).
 
 
drawTree(_, _, _, 0, []).
drawTree(X1, Y1, Angle, Depth, Lista) :-
    X2 is X1 + cos(Angle * pi / 180.0) * Depth * 10.0,
    Y2 is Y1 + sin(Angle * pi / 180.0) * Depth * 10.0,
	A1 is Angle - 30,
	A2 is Angle + 30,
	De is Depth - 1,
    drawTree(X2, Y2, A1, De, L1),
    drawTree(X2, Y2, A2, De, L2),
    append([[X1, Y1, X2, Y2]], L1, Concat1),
    append(Concat1, L2, Lista).

prepararAmbiente() :-
	% Remove abreviação
	set_prolog_flag(answer_write_options,
                   [ quoted(true),
                     portray(true),
                     spacing(next_argument)
                   ]).    
