package defpackage;

import java.text.BreakIterator;

/* loaded from: classes.dex */
public final class dit implements diz {
    @Override // defpackage.diz
    public final void a(dja djaVar) {
        if (djaVar.k()) {
            djaVar.g(djaVar.c, djaVar.d);
            return;
        }
        if (djaVar.b() == -1) {
            int i = djaVar.a;
            int i2 = djaVar.b;
            djaVar.j(i, i);
            djaVar.g(i, i2);
            return;
        }
        if (djaVar.b() == 0) {
            return;
        }
        String string = djaVar.toString();
        int iB = djaVar.b();
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(string);
        djaVar.g(characterInstance.preceding(iB), djaVar.b());
    }

    public final boolean equals(Object obj) {
        return obj instanceof dit;
    }

    public final int hashCode() {
        return affw.b(getClass()).hashCode();
    }

    public final String toString() {
        return "BackspaceCommand()";
    }
}
