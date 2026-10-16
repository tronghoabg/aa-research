package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class jvz implements defpackage.qsy {
    public final int a;
    public final int b;
    public final int c;
    public int d;
    private final defpackage.rvc e;

    public jvz(int i, int i2, defpackage.rvc rvcVar, int i3) {
        this.b = i;
        this.c = i2;
        this.e = rvcVar;
        this.a = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.car.app.hardware.ICarHardwareResult, java.lang.Object] */
    public final void b(java.lang.Object obj) {
        this.d++;
        defpackage.rvc rvcVar = this.e;
        ((defpackage.jvx) rvcVar.b).b(rvcVar.a, obj, rvcVar.c);
    }
}
