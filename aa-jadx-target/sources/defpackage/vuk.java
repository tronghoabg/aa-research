package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class vuk implements defpackage.vrp {
    public final java.lang.String a;
    private final int b;

    public vuk(int i, java.lang.String str) {
        this.b = i;
        this.a = str;
    }

    public static final defpackage.vuj d() {
        defpackage.vuj vujVar = new defpackage.vuj();
        vujVar.a = 1;
        vujVar.b = "";
        return vujVar;
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
        int i = this.b;
        return i == 3 || i == 1;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof defpackage.vuk)) {
            return false;
        }
        defpackage.vuk vukVar = (defpackage.vuk) obj;
        int i = this.b;
        int i2 = vukVar.b;
        if (i != 0) {
            return i == i2 && this.a.equals(vukVar.a);
        }
        throw null;
    }

    public final int hashCode() {
        int i = this.b;
        defpackage.a.aI(i);
        return (this.a.hashCode() ^ ((i ^ 1000003) * 1000003)) * 1000003;
    }

    public final java.lang.String toString() {
        return "ApplicationExitConfigurations{enablement=" + defpackage.vrq.a(this.b) + ", reportingProcessShortName=" + this.a + ", metricExtensionProvider=null}";
    }

    public vuk() {
        throw null;
    }
}
