package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class vtj {
    public float a;
    public defpackage.afak b;
    public byte c;
    public int d;
    private int e;
    private final defpackage.xyn f = defpackage.xxe.a;

    public final defpackage.vtk a() {
        int i;
        if (this.c == 3 && (i = this.d) != 0) {
            defpackage.vtk vtkVar = new defpackage.vtk(i, this.a, this.e, this.b, this.f);
            float f = vtkVar.a;
            defpackage.ysr.aY(f > 0.0f && f <= 100.0f, "StartupSamplePercentage should be a floating number > 0 and <= 100.");
            return vtkVar;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.d == 0) {
            sb.append(" enablement");
        }
        if ((this.c & 1) == 0) {
            sb.append(" startupSamplePercentage");
        }
        if ((this.c & 2) == 0) {
            sb.append(" debugLogsSize");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(int i) {
        this.e = i;
        this.c = (byte) (this.c | 2);
    }
}
