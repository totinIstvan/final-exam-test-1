### Mit kéne kiírni? Te döntöd el!

Egy junior fejlesztői pozíciós interjún vagy. A feladatod a következő:

Implementálj egy metódust, amelynek két paramétere van:

- egy string array
- egy integer

Ha az integer osztható `3`-al, akkor return-öld az **első** elemét a _string array_-nek.
Ha az integer osztható `7`-el, akkor return-öld a **második** elemét a _string array_-nek.
Ha az integer osztható `3`-al és `7`-el, akkor return-ölj egy az array **első és második** elemeiből konkatenált _string_-et (ugyanabban a sorrendben, mint amilyenben az arrayben vannak).
Minden másik esetben, return-ölj egy **üres string**-et.

Példák:
A string array input `{"Code", "Cool"}`
Ha az integer input `9`, a metódus `"Code"`-ot return-öl.
Ha az integer input `14`, a metódus `"Cool"`-t return-öl.
Ha az integer input `21`, a metódus `"CodeCool"`-t return-öl.
Ha az integer input `2`, a metódus `""`-ot return-öl.

Megjegyzés: a string array input mindig fog tartalmazni legalább két elemet.