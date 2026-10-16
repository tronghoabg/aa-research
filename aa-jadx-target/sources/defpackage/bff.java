package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bff {
    public static final defpackage.cdz b = defpackage.bxi.k(new defpackage.abw(7), new defpackage.bev(6));
    public long a;
    private defpackage.cjj c;
    private final defpackage.bwx d;
    private final defpackage.byh e;
    private final defpackage.byh f;
    private final defpackage.byj g;

    public bff(defpackage.apn apnVar, float f) {
        this.e = new androidx.compose.runtime.ParcelableSnapshotMutableFloatState(f);
        this.f = new androidx.compose.runtime.ParcelableSnapshotMutableFloatState(0.0f);
        this.g = new androidx.compose.runtime.ParcelableSnapshotMutableIntState(0);
        this.c = defpackage.cjj.a;
        this.a = defpackage.dgc.a;
        this.d = new androidx.compose.runtime.ParcelableSnapshotMutableState(apnVar, defpackage.bxv.c);
    }

    public final float a() {
        return this.f.e();
    }

    public final float b() {
        return this.e.e();
    }

    public final defpackage.apn c() {
        return (defpackage.apn) this.d.a();
    }

    public final void d(float f) {
        this.e.h(f);
    }

    public final void e(defpackage.apn apnVar, defpackage.cjj cjjVar, int i, int i2) {
        float f;
        float f2 = i2 - i;
        this.f.h(f2);
        defpackage.cjj cjjVar2 = this.c;
        float f3 = cjjVar2.b;
        float f4 = cjjVar.b;
        if (f4 != f3 || cjjVar.c != cjjVar2.c) {
            boolean z = apnVar == defpackage.apn.a;
            if (z) {
                f4 = cjjVar.c;
            }
            float f5 = z ? cjjVar.e : cjjVar.d;
            float fB = b();
            float f6 = i;
            float f7 = fB + f6;
            if (f5 <= f7 && (f4 >= fB || f5 - f4 <= f6)) {
                f = (f4 >= fB || f5 - f4 > f6) ? 0.0f : f4 - fB;
            } else {
                f = f5 - f7;
            }
            d(b() + f);
            this.c = cjjVar;
        }
        d(defpackage.afqt.d(b(), 0.0f, f2));
        this.g.h(i);
    }

    public bff() {
        this(defpackage.apn.a, 0.0f);
    }
}
