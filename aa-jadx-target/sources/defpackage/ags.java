package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ags implements defpackage.aey {
    public final int a;
    public final int b;
    private final defpackage.aez c;

    public /* synthetic */ ags(int i, defpackage.aez aezVar, int i2) {
        this(1 == (i2 & 1) ? 300 : i, 0, (i2 & 4) != 0 ? defpackage.afc.a : aezVar);
    }

    @Override // defpackage.aej
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ defpackage.agu c(defpackage.bil bilVar) {
        return d();
    }

    @Override // defpackage.aey
    public final /* bridge */ /* synthetic */ defpackage.agx b(defpackage.bil bilVar) {
        return d();
    }

    @Override // defpackage.afd
    public final /* bridge */ /* synthetic */ defpackage.agy c(defpackage.bil bilVar) {
        return d();
    }

    public final defpackage.ahi d() {
        return new defpackage.ahi(this.a, this.b, this.c);
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.ags)) {
            return false;
        }
        defpackage.ags agsVar = (defpackage.ags) obj;
        return agsVar.a == this.a && agsVar.b == this.b && defpackage.afga.f(agsVar.c, this.c);
    }

    public final int hashCode() {
        return (((this.a * 31) + this.c.hashCode()) * 31) + this.b;
    }

    public ags(int i, int i2, defpackage.aez aezVar) {
        this.a = i;
        this.b = i2;
        this.c = aezVar;
    }

    public ags() {
        this(0, (defpackage.aez) null, 7);
    }
}
