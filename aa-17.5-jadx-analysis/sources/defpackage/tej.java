package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final /* synthetic */ class tej implements tek {
    private final /* synthetic */ int a;

    public /* synthetic */ tej(int i) {
        this.a = i;
    }

    @Override // defpackage.tek
    public final boolean a(Enum r5, Enum r6, tei teiVar) {
        int i = this.a;
        if (i == 0) {
            r5.getClass();
            ((ype) teiVar.c.h()).M("Illegal state transition from %s to %s! Allowing anyway.", r5, r6);
            return true;
        }
        if (i == 1) {
            jmd jmdVar = (jmd) r5;
            jmd jmdVar2 = (jmd) r6;
            jlw jlwVar = jme.a;
            jmdVar.getClass();
            return ((jmdVar == jmd.b && jmdVar2 == jmd.d) ? jme.e : jme.d).a(jmdVar, jmdVar2, teiVar);
        }
        if (i != 2) {
            r5.getClass();
            ((ype) teiVar.c.h()).M("Illegal state transition from %s to %s!", r5, r6);
            return false;
        }
        r5.getClass();
        String str = String.format("Illegal state transition from %s to %s!", Arrays.copyOf(new Object[]{r5, r6}, 2));
        str.getClass();
        throw new IllegalArgumentException(str);
    }
}
