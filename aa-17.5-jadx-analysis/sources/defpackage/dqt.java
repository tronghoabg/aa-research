package defpackage;

/* loaded from: classes.dex */
public final class dqt {
    static final boolean[] a = new boolean[3];

    static void a(dqo dqoVar, doy doyVar, dqn dqnVar) {
        dqnVar.z = -1;
        dqnVar.A = -1;
        int[] iArr = dqoVar.aA;
        if (iArr[0] != 2 && dqnVar.aA[0] == 4) {
            dqm dqmVar = dqnVar.T;
            int i = dqmVar.f;
            int iJ = dqoVar.j();
            dqm dqmVar2 = dqnVar.V;
            int i2 = iJ - dqmVar2.f;
            dqmVar.h = doyVar.b(dqmVar);
            dqmVar2.h = doyVar.b(dqmVar2);
            doyVar.f(dqmVar.h, i);
            doyVar.f(dqmVar2.h, i2);
            dqnVar.z = 2;
            dqnVar.aj = i;
            int i3 = i2 - i;
            dqnVar.af = i3;
            int i4 = dqnVar.am;
            if (i3 < i4) {
                dqnVar.af = i4;
            }
        }
        if (iArr[1] == 2 || dqnVar.aA[1] != 4) {
            return;
        }
        dqm dqmVar3 = dqnVar.U;
        int i5 = dqmVar3.f;
        int iH = dqoVar.h();
        dqm dqmVar4 = dqnVar.W;
        int i6 = iH - dqmVar4.f;
        dqmVar3.h = doyVar.b(dqmVar3);
        dqmVar4.h = doyVar.b(dqmVar4);
        doyVar.f(dqmVar3.h, i5);
        doyVar.f(dqmVar4.h, i6);
        if (dqnVar.al > 0 || dqnVar.ar == 8) {
            dqm dqmVar5 = dqnVar.X;
            dqmVar5.h = doyVar.b(dqmVar5);
            doyVar.f(dqmVar5.h, dqnVar.al + i5);
        }
        dqnVar.A = 2;
        dqnVar.ak = i5;
        int i7 = i6 - i5;
        dqnVar.ag = i7;
        int i8 = dqnVar.an;
        if (i7 < i8) {
            dqnVar.ag = i8;
        }
    }
}
