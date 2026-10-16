package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class tuc implements defpackage.tue {
    public static final android.animation.TimeInterpolator b = defpackage.pjc.a;
    public static final android.animation.TypeEvaluator c = new defpackage.tua(0);
    public static final android.animation.TypeEvaluator d = new defpackage.tua(2);
    private long a;
    protected long e;
    public defpackage.tuj f;
    public boolean g;
    protected volatile int h;
    protected final defpackage.tub i;
    protected final defpackage.tub j;
    protected final defpackage.tub k;
    protected final defpackage.tub l;
    protected final defpackage.tub m;
    protected final defpackage.tub n;
    protected final defpackage.tub o;
    protected final defpackage.tub p;
    protected final defpackage.tub[] q;

    public tuc(defpackage.vjx vjxVar) {
        defpackage.tub[] tubVarArr = new defpackage.tub[defpackage.tuj.b];
        this.q = tubVarArr;
        vjxVar.getClass();
        defpackage.tub tubVar = new defpackage.tub(this);
        this.i = tubVar;
        defpackage.tub tubVar2 = new defpackage.tub(this);
        this.j = tubVar2;
        defpackage.tub tubVar3 = new defpackage.tub(this);
        this.k = tubVar3;
        defpackage.tub tubVar4 = new defpackage.tub(this);
        this.l = tubVar4;
        defpackage.tub tubVar5 = new defpackage.tub(this);
        this.m = tubVar5;
        defpackage.tub tubVar6 = new defpackage.tub(this);
        this.n = tubVar6;
        defpackage.tub tubVar7 = new defpackage.tub(this);
        this.o = tubVar7;
        defpackage.tub tubVar8 = new defpackage.tub(this);
        this.p = tubVar8;
        tubVarArr[0] = tubVar;
        tubVarArr[1] = tubVar2;
        tubVarArr[2] = tubVar3;
        tubVarArr[3] = tubVar4;
        tubVarArr[4] = tubVar5;
        tubVarArr[5] = tubVar6;
        tubVarArr[6] = tubVar7;
        tubVarArr[7] = tubVar8;
    }

    @Override // defpackage.tue
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public int a(long j) {
        int i;
        if (this.f == null || this.h == 0) {
            return 0;
        }
        long j2 = j - this.e;
        if (j2 < 0) {
            i = 0;
            j2 = 0;
        } else {
            long j3 = this.a;
            if (j2 >= j3) {
                i = 0;
                j2 = j3;
            } else {
                i = 6;
            }
        }
        defpackage.tub[] tubVarArr = this.q;
        synchronized (tubVarArr) {
            int[] iArrQ = defpackage.tan.q();
            for (int i2 = 0; i2 < 8; i2++) {
                int i3 = iArrQ[i2];
                if (p(i3)) {
                    int i4 = i3 - 1;
                    if (i3 == 0) {
                        throw null;
                    }
                    defpackage.tub tubVar = tubVarArr[i4];
                    tubVar.setCurrentPlayTime(java.lang.Math.max(0L, java.lang.Math.min(j2 - tubVar.getStartDelay(), tubVar.getDuration())));
                }
            }
        }
        return i;
    }

    @Override // defpackage.tue
    public int b() {
        return this.h;
    }

    @Override // defpackage.tue
    public long c() {
        return this.a;
    }

    @Override // defpackage.tue
    public boolean d() {
        return false;
    }

    @Override // defpackage.tue
    public boolean e() {
        return false;
    }

    @Override // defpackage.tue
    public java.lang.Object f(int i) {
        java.lang.Object animatedValue;
        defpackage.tub[] tubVarArr = this.q;
        synchronized (tubVarArr) {
            animatedValue = tubVarArr[i - 1].getAnimatedValue();
        }
        return animatedValue;
    }

    @Override // defpackage.tue
    public java.lang.Object g(int i) {
        defpackage.tuj tujVar = this.f;
        if (tujVar == null) {
            return null;
        }
        return tujVar.c(i);
    }

    @Override // defpackage.tue
    public final void h(defpackage.tue tueVar, int i) {
        if (tueVar != this) {
            o(i, false);
        }
    }

    @Override // defpackage.tue
    public boolean j(defpackage.tue tueVar) {
        return true;
    }

    @Override // defpackage.tue
    public void k(int i) {
        this.g = false;
        this.e = android.view.animation.AnimationUtils.currentAnimationTimeMillis();
        this.h = i;
        defpackage.tub[] tubVarArr = this.q;
        synchronized (tubVarArr) {
            int[] iArrQ = defpackage.tan.q();
            for (int i2 = 0; i2 < 8; i2++) {
                int i3 = iArrQ[i2];
                if (p(i3)) {
                    int i4 = i3 - 1;
                    if (i3 == 0) {
                        throw null;
                    }
                    tubVarArr[i4].start();
                }
            }
        }
    }

    public final void m(long j) {
        defpackage.ysr.bk(this.g, "Cannot set duration outside of initialization window.");
        this.a = j;
        defpackage.tub[] tubVarArr = this.q;
        synchronized (tubVarArr) {
            for (defpackage.tub tubVar : tubVarArr) {
                if (tubVar != null) {
                    tubVar.a(j);
                }
            }
        }
    }

    public final void n() {
        defpackage.tub[] tubVarArr = this.q;
        synchronized (tubVarArr) {
            this.a = 0L;
            int[] iArrQ = defpackage.tan.q();
            for (int i = 0; i < 8; i++) {
                int i2 = iArrQ[i];
                if (p(i2)) {
                    long j = this.a;
                    int i3 = i2 - 1;
                    if (i2 == 0) {
                        throw null;
                    }
                    this.a = java.lang.Math.max(j, tubVarArr[i3].getStartDelay() + tubVarArr[i3].getDuration());
                }
            }
        }
    }

    protected final void o(int i, boolean z) {
        int i2 = 1 << (i - 1);
        int i3 = this.h;
        this.h = z ? i2 | i3 : (~i2) & i3;
    }

    protected final boolean p(int i) {
        int i2 = this.h;
        if (i != 0) {
            return (i2 & (1 << (i + (-1)))) != 0;
        }
        throw null;
    }

    @Override // defpackage.tue
    public final void i() {
    }
}
