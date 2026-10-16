package defpackage;

import com.google.android.libraries.handwriting.networkrecognizer.CloudRecognizerProtocolStrings;

/* loaded from: classes3.dex */
public final class vwy extends vmc {
    public vwy(vmb vmbVar, ajgu ajguVar) {
        super(vmbVar, ajguVar);
    }

    @Override // defpackage.vmc
    public final String e() {
        ajgu ajguVar = this.a;
        ajgv ajgvVar = ajguVar.g;
        if (ajgvVar == null) {
            ajgvVar = ajgv.a;
        }
        String strF = f(Long.valueOf(ajgvVar.c));
        ajgv ajgvVar2 = ajguVar.g;
        int iAy = a.ay((ajgvVar2 == null ? ajgv.a : ajgvVar2).d);
        if (iAy == 0) {
            iAy = 1;
        }
        String strConcat = "Duration: ".concat(strF);
        if (iAy == 1) {
            return strConcat;
        }
        if (ajgvVar2 == null) {
            ajgvVar2 = ajgv.a;
        }
        int iAy2 = a.ay(ajgvVar2.d);
        return a.bJ((iAy2 == 0 || iAy2 == 1) ? "UNKNOWN_STATUS" : iAy2 != 2 ? iAy2 != 3 ? "CANCEL" : "ERROR" : CloudRecognizerProtocolStrings.SUCCESS, strConcat, " Status: ");
    }

    @Override // defpackage.vmc
    public final String g() {
        return (String) xxh.g(c()).d("Unknown timer event name");
    }

    @Override // defpackage.vmc
    protected final boolean h() {
        return (this.a.b & 16) != 0;
    }
}
