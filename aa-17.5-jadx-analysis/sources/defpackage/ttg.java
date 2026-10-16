package defpackage;

import android.animation.TimeInterpolator;
import android.animation.TypeEvaluator;
import android.view.animation.AnimationUtils;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

/* loaded from: classes3.dex */
public class ttg implements tti {
    public static final TimeInterpolator b = pig.a;
    public static final TypeEvaluator c = new tte(0);
    public static final TypeEvaluator d = new tte(2);
    private long a;
    protected long e;
    public ttn f;
    public boolean g;
    protected volatile int h;
    protected final ttf i;
    protected final ttf j;
    protected final ttf k;
    protected final ttf l;
    protected final ttf m;
    protected final ttf n;
    protected final ttf o;
    protected final ttf p;
    protected final ttf[] q;

    public ttg(std stdVar) {
        ttf[] ttfVarArr = new ttf[ttn.b];
        this.q = ttfVarArr;
        stdVar.getClass();
        ttf ttfVar = new ttf(this);
        this.i = ttfVar;
        ttf ttfVar2 = new ttf(this);
        this.j = ttfVar2;
        ttf ttfVar3 = new ttf(this);
        this.k = ttfVar3;
        ttf ttfVar4 = new ttf(this);
        this.l = ttfVar4;
        ttf ttfVar5 = new ttf(this);
        this.m = ttfVar5;
        ttf ttfVar6 = new ttf(this);
        this.n = ttfVar6;
        ttf ttfVar7 = new ttf(this);
        this.o = ttfVar7;
        ttf ttfVar8 = new ttf(this);
        this.p = ttfVar8;
        ttfVarArr[0] = ttfVar;
        ttfVarArr[1] = ttfVar2;
        ttfVarArr[2] = ttfVar3;
        ttfVarArr[3] = ttfVar4;
        ttfVarArr[4] = ttfVar5;
        ttfVarArr[5] = ttfVar6;
        ttfVarArr[6] = ttfVar7;
        ttfVarArr[7] = ttfVar8;
    }

    @Override // defpackage.tti
    @ResultIgnorabilityUnspecified
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
        ttf[] ttfVarArr = this.q;
        synchronized (ttfVarArr) {
            int[] iArrV = tmo.v();
            for (int i2 = 0; i2 < 8; i2++) {
                int i3 = iArrV[i2];
                if (p(i3)) {
                    int i4 = i3 - 1;
                    if (i3 == 0) {
                        throw null;
                    }
                    ttf ttfVar = ttfVarArr[i4];
                    ttfVar.setCurrentPlayTime(Math.max(0L, Math.min(j2 - ttfVar.getStartDelay(), ttfVar.getDuration())));
                }
            }
        }
        return i;
    }

    @Override // defpackage.tti
    public int b() {
        return this.h;
    }

    @Override // defpackage.tti
    public long c() {
        return this.a;
    }

    @Override // defpackage.tti
    public boolean d() {
        return false;
    }

    @Override // defpackage.tti
    public boolean e() {
        return false;
    }

    @Override // defpackage.tti
    public Object f(int i) {
        Object animatedValue;
        ttf[] ttfVarArr = this.q;
        synchronized (ttfVarArr) {
            animatedValue = ttfVarArr[i - 1].getAnimatedValue();
        }
        return animatedValue;
    }

    @Override // defpackage.tti
    public Object g(int i) {
        ttn ttnVar = this.f;
        if (ttnVar == null) {
            return null;
        }
        return ttnVar.c(i);
    }

    @Override // defpackage.tti
    public final void h(tti ttiVar, int i) {
        if (ttiVar != this) {
            o(i, false);
        }
    }

    @Override // defpackage.tti
    public boolean j(tti ttiVar) {
        return true;
    }

    @Override // defpackage.tti
    public void k(int i) {
        this.g = false;
        this.e = AnimationUtils.currentAnimationTimeMillis();
        this.h = i;
        ttf[] ttfVarArr = this.q;
        synchronized (ttfVarArr) {
            int[] iArrV = tmo.v();
            for (int i2 = 0; i2 < 8; i2++) {
                int i3 = iArrV[i2];
                if (p(i3)) {
                    int i4 = i3 - 1;
                    if (i3 == 0) {
                        throw null;
                    }
                    ttfVarArr[i4].start();
                }
            }
        }
    }

    public final void m(long j) {
        woy.aa(this.g, "Cannot set duration outside of initialization window.");
        this.a = j;
        ttf[] ttfVarArr = this.q;
        synchronized (ttfVarArr) {
            for (ttf ttfVar : ttfVarArr) {
                if (ttfVar != null) {
                    ttfVar.a(j);
                }
            }
        }
    }

    public final void n() {
        ttf[] ttfVarArr = this.q;
        synchronized (ttfVarArr) {
            this.a = 0L;
            int[] iArrV = tmo.v();
            for (int i = 0; i < 8; i++) {
                int i2 = iArrV[i];
                if (p(i2)) {
                    long j = this.a;
                    int i3 = i2 - 1;
                    if (i2 == 0) {
                        throw null;
                    }
                    this.a = Math.max(j, ttfVarArr[i3].getStartDelay() + ttfVarArr[i3].getDuration());
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

    @Override // defpackage.tti
    public final void i() {
    }
}
