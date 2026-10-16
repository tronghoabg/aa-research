package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class esk extends defpackage.esi {
    public esk(defpackage.esi esiVar) {
        esiVar.getClass();
        this.b.putAll(esiVar.b);
    }

    @Override // defpackage.esi
    public final java.lang.Object a(defpackage.esh eshVar) {
        return this.b.get(eshVar);
    }

    public final void b(defpackage.esh eshVar, java.lang.Object obj) {
        this.b.put(eshVar, obj);
    }

    public esk() {
        throw null;
    }

    public /* synthetic */ esk(byte[] bArr) {
        this(defpackage.esg.a);
    }
}
