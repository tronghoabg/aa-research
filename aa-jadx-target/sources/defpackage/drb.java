package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class drb {
    static final boolean[] a = new boolean[3];

    static void a(defpackage.dqw dqwVar, defpackage.dpg dpgVar, defpackage.dqv dqvVar) {
        dqvVar.z = -1;
        dqvVar.A = -1;
        int[] iArr = dqwVar.aA;
        if (iArr[0] != 2 && dqvVar.aA[0] == 4) {
            defpackage.dqu dquVar = dqvVar.T;
            int i = dquVar.f;
            int iJ = dqwVar.j();
            defpackage.dqu dquVar2 = dqvVar.V;
            int i2 = iJ - dquVar2.f;
            dquVar.h = dpgVar.b(dquVar);
            dquVar2.h = dpgVar.b(dquVar2);
            dpgVar.f(dquVar.h, i);
            dpgVar.f(dquVar2.h, i2);
            dqvVar.z = 2;
            dqvVar.aj = i;
            int i3 = i2 - i;
            dqvVar.af = i3;
            int i4 = dqvVar.am;
            if (i3 < i4) {
                dqvVar.af = i4;
            }
        }
        if (iArr[1] == 2 || dqvVar.aA[1] != 4) {
            return;
        }
        defpackage.dqu dquVar3 = dqvVar.U;
        int i5 = dquVar3.f;
        int iH = dqwVar.h();
        defpackage.dqu dquVar4 = dqvVar.W;
        int i6 = iH - dquVar4.f;
        dquVar3.h = dpgVar.b(dquVar3);
        dquVar4.h = dpgVar.b(dquVar4);
        dpgVar.f(dquVar3.h, i5);
        dpgVar.f(dquVar4.h, i6);
        if (dqvVar.al > 0 || dqvVar.ar == 8) {
            defpackage.dqu dquVar5 = dqvVar.X;
            dquVar5.h = dpgVar.b(dquVar5);
            dpgVar.f(dquVar5.h, dqvVar.al + i5);
        }
        dqvVar.A = 2;
        dqvVar.ak = i5;
        int i7 = i6 - i5;
        dqvVar.ag = i7;
        int i8 = dqvVar.an;
        if (i7 < i8) {
            dqvVar.ag = i8;
        }
    }
}
