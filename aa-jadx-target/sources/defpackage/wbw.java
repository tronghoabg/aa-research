package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class wbw {
    public final boolean a;

    public wbw() {
        boolean z = defpackage.wbn.b;
        this.a = false;
    }

    public final vqj a() {
        if (!this.a) {
            return vqj.a;
        }
        boolean z = defpackage.tfv.a;
        return new vqj((defpackage.vqk[]) defpackage.tfv.e.values().toArray(new defpackage.vqk[0]));
    }

    public final defpackage.iwy b(defpackage.xlk xlkVar, iwq iwqVar) {
        int iOrdinal = xlkVar.ordinal();
        if (iOrdinal == 2) {
            return new defpackage.iwl(iwqVar, this.a);
        }
        if (iOrdinal == 6) {
            return new defpackage.iwm(iwqVar, this.a);
        }
        throw new java.lang.IllegalStateException("Unsupported codec type: " + xlkVar.h);
    }

    public wbw(boolean z, byte[] bArr) {
        this.a = z;
    }

    public wbw(boolean z) {
        this.a = z;
    }
}
