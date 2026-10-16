package defpackage;

/* loaded from: classes2.dex */
public abstract class jvv implements qse {
    public final int a;
    public final int b;
    public final int c;
    public int d;
    private final ruj e;

    public jvv(int i, int i2, ruj rujVar, int i3) {
        this.b = i;
        this.c = i2;
        this.e = rujVar;
        this.a = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.car.app.hardware.ICarHardwareResult, java.lang.Object] */
    public final void b(Object obj) {
        this.d++;
        ruj rujVar = this.e;
        ((jvt) rujVar.b).b(rujVar.a, obj, rujVar.c);
    }
}
