package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
abstract class xut extends defpackage.xup {
    private final defpackage.xvk a;

    public xut(java.lang.String str, defpackage.xvq xvqVar, defpackage.xvk xvkVar, defpackage.nrr nrrVar) {
        super(str, xvqVar, nrrVar);
        if (!xvkVar.d) {
            throw new java.lang.IllegalArgumentException();
        }
        this.a = xvkVar;
    }

    @Override // defpackage.xvq
    public final defpackage.xvk h() {
        return defpackage.xvk.d(this.a, i());
    }

    public xut(java.lang.String str, java.util.UUID uuid, java.lang.String str2, defpackage.xvk xvkVar, defpackage.nrr nrrVar) {
        super(str, uuid, str2, nrrVar);
        if (xvkVar.d) {
            this.a = xvkVar;
            return;
        }
        throw new java.lang.IllegalArgumentException();
    }
}
