package defpackage;

/* loaded from: classes2.dex */
public final class icg extends hst {
    public static icg b() {
        icg icgVar = new icg();
        icgVar.d(new urf());
        return icgVar;
    }

    public final void c(iez iezVar) {
        this.a = iezVar;
    }

    public final void d(urf urfVar) {
        c(urfVar.a());
    }

    @Override // defpackage.hst
    public final boolean equals(Object obj) {
        return (obj instanceof icg) && super.equals(obj);
    }
}
