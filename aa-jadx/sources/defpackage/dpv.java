package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class dpv extends defpackage.dpp {
    public static defpackage.dpv a(java.lang.String str) {
        defpackage.dpv dpvVar = new defpackage.dpv(str.toCharArray());
        dpvVar.B();
        dpvVar.z(str.length() - 1);
        return dpvVar;
    }

    @Override // defpackage.dpp
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof defpackage.dpv) && x().equals(((defpackage.dpv) obj).x())) {
            return true;
        }
        return super.equals(obj);
    }
}
