package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class vtk implements defpackage.vrp {
    public final float a;
    public final int b;
    public final defpackage.xyn c;
    private final defpackage.afak d;
    private final int e;

    public vtk(int i, float f, int i2, defpackage.afak afakVar, defpackage.xyn xynVar) {
        this.e = i;
        this.a = f;
        this.b = i2;
        this.d = afakVar;
        this.c = xynVar;
    }

    public static final defpackage.vtj d() {
        defpackage.vtj vtjVar = new defpackage.vtj();
        vtjVar.a = 100.0f;
        vtjVar.c = (byte) (vtjVar.c | 1);
        vtjVar.d = 1;
        vtjVar.b(100);
        return vtjVar;
    }

    @Override // defpackage.vrp
    public final /* synthetic */ int a() {
        return Integer.MAX_VALUE;
    }

    @Override // defpackage.vrp
    public final defpackage.afak b() {
        return this.d;
    }

    @Override // defpackage.vrp
    public final boolean c() {
        int i = this.e;
        return i == 3 || i == 1;
    }

    public final boolean equals(java.lang.Object obj) {
        defpackage.afak afakVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof defpackage.vtk)) {
            return false;
        }
        defpackage.vtk vtkVar = (defpackage.vtk) obj;
        int i = this.e;
        int i2 = vtkVar.e;
        if (i == 0) {
            throw null;
        }
        if (i == i2) {
            if (java.lang.Float.floatToIntBits(this.a) == java.lang.Float.floatToIntBits(vtkVar.a) && this.b == vtkVar.b && ((afakVar = this.d) != null ? afakVar.equals(vtkVar.d) : vtkVar.d == null) && this.c.equals(vtkVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.e;
        defpackage.a.aI(i);
        int iFloatToIntBits = ((i ^ 1000003) * 1000003) ^ java.lang.Float.floatToIntBits(this.a);
        defpackage.afak afakVar = this.d;
        return ((((this.b ^ (iFloatToIntBits * 1000003)) * 1000003) ^ (afakVar == null ? 0 : afakVar.hashCode())) * 1000003) ^ 2040732332;
    }

    public final java.lang.String toString() {
        defpackage.xyn xynVar = this.c;
        return "CrashConfigurations{enablement=" + defpackage.vrq.a(this.e) + ", startupSamplePercentage=" + this.a + ", debugLogsSize=" + this.b + ", generalConfigurationsMetricExtension=" + java.lang.String.valueOf(this.d) + ", crashLoopListener=" + java.lang.String.valueOf(xynVar) + "}";
    }

    public vtk() {
        throw null;
    }
}
