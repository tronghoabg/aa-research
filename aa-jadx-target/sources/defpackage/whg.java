package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class whg {
    public final android.net.Uri a;
    public final defpackage.abpy b;
    public final defpackage.xyn c;
    public final defpackage.ygw d;
    public final defpackage.wht e;
    public final boolean f;

    public whg(android.net.Uri uri, defpackage.abpy abpyVar, defpackage.xyn xynVar, defpackage.ygw ygwVar, defpackage.wht whtVar, boolean z) {
        this.a = uri;
        this.b = abpyVar;
        this.c = xynVar;
        this.d = ygwVar;
        this.e = whtVar;
        this.f = z;
    }

    public static defpackage.whf a() {
        defpackage.whf whfVar = new defpackage.whf();
        whfVar.a = defpackage.whp.a;
        whfVar.b();
        whfVar.b = true;
        whfVar.c = (byte) (1 | whfVar.c);
        return whfVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.whg) {
            defpackage.whg whgVar = (defpackage.whg) obj;
            if (this.a.equals(whgVar.a) && this.b.equals(whgVar.b) && this.c.equals(whgVar.c) && defpackage.ysr.W(this.d, whgVar.d) && this.e.equals(whgVar.e) && this.f == whgVar.f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((true != this.f ? 1237 : 1231) ^ ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003)) * 1000003) ^ 1237;
    }

    public final java.lang.String toString() {
        defpackage.wht whtVar = this.e;
        defpackage.ygw ygwVar = this.d;
        defpackage.xyn xynVar = this.c;
        defpackage.abpy abpyVar = this.b;
        return "ProtoDataStoreConfig{uri=" + java.lang.String.valueOf(this.a) + ", schema=" + java.lang.String.valueOf(abpyVar) + ", handler=" + java.lang.String.valueOf(xynVar) + ", migrations=" + java.lang.String.valueOf(ygwVar) + ", variantConfig=" + java.lang.String.valueOf(whtVar) + ", useGeneratedExtensionRegistry=" + this.f + ", enableTracing=false}";
    }

    public whg() {
        throw null;
    }
}
