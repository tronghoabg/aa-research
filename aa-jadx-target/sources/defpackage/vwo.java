package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class vwo implements defpackage.vrp {
    public final int a;
    public final boolean b;
    public final defpackage.xyn c;
    public final defpackage.ygw d;
    private final int e;

    public vwo(int i, int i2, boolean z, defpackage.xyn xynVar, defpackage.ygw ygwVar) {
        this.e = i;
        this.a = i2;
        this.b = z;
        this.c = xynVar;
        this.d = ygwVar;
    }

    public static final defpackage.vwn d() {
        defpackage.vwn vwnVar = new defpackage.vwn();
        vwnVar.b(false);
        vwnVar.a = 50;
        vwnVar.c = (byte) (vwnVar.c | 1);
        vwnVar.b = defpackage.xxe.a;
        vwnVar.d = 1;
        return vwnVar;
    }

    @Override // defpackage.vrp
    public final /* synthetic */ int a() {
        return Integer.MAX_VALUE;
    }

    @Override // defpackage.vrp
    public final /* synthetic */ defpackage.afak b() {
        return null;
    }

    @Override // defpackage.vrp
    public final boolean c() {
        return this.e == 3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof defpackage.vwo)) {
            return false;
        }
        defpackage.vwo vwoVar = (defpackage.vwo) obj;
        int i = this.e;
        int i2 = vwoVar.e;
        if (i != 0) {
            return i == i2 && this.a == vwoVar.a && this.b == vwoVar.b && this.c.equals(vwoVar.c) && defpackage.ysr.W(this.d, vwoVar.d);
        }
        throw null;
    }

    public final int hashCode() {
        int i = this.e;
        defpackage.a.aI(i);
        return this.d.hashCode() ^ ((((((((i ^ 1000003) * 1000003) ^ this.a) * (-721379959)) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ 2040732332) * 1000003);
    }

    public final java.lang.String toString() {
        defpackage.ygw ygwVar = this.d;
        return "NetworkConfigurations{enablement=" + defpackage.vrq.a(this.e) + ", batchSize=" + this.a + ", urlSanitizer=null, enableUrlAutoSanitization=" + this.b + ", metricExtensionProvider=" + java.lang.String.valueOf(this.c) + ", customDomainAllowlist=" + java.lang.String.valueOf(ygwVar) + "}";
    }

    public vwo() {
        throw null;
    }
}
