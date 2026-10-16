package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class jiz {
    private static final defpackage.yqm a = defpackage.yqm.c("CAR.WinDecorAnimCtrl");
    private volatile android.graphics.Rect c;
    private boolean d;
    private final java.lang.String f;
    private volatile defpackage.jiw b = defpackage.jiw.a;
    private com.google.android.gms.car.ProjectionWindowDecorationParams e = com.google.android.gms.car.ProjectionWindowDecorationParams.a();

    public jiz(java.lang.String str) {
        this.f = str;
    }

    private static float f(float f, float f2, float f3) {
        return java.lang.Math.abs(f - f2) / java.lang.Math.abs(f3 - f2);
    }

    public final synchronized defpackage.jix a(defpackage.jhm jhmVar, defpackage.jhm jhmVar2) {
        float f;
        float f2;
        float f3;
        com.google.android.gms.car.ProjectionWindowDecorationParams projectionWindowDecorationParams = this.e;
        if (!projectionWindowDecorationParams.h && !projectionWindowDecorationParams.i) {
            return new defpackage.jix(projectionWindowDecorationParams.f, 0.0f, 0.0f, 0.0f, 0.0f);
        }
        android.graphics.Rect rect = this.c;
        defpackage.jiw jiwVar = this.b;
        defpackage.jiw jiwVar2 = defpackage.jiw.a;
        float fA = 1.0f;
        float f4 = 0.0f;
        if (jiwVar != jiwVar2) {
            defpackage.jiw jiwVar3 = this.b;
            defpackage.jiw jiwVar4 = defpackage.jiw.b;
            float f5 = jiwVar3 == jiwVar4 ? 1.0f : 0.0f;
            fA = this.b == jiwVar4 ? 0.0f : 1.0f;
            if (rect.left != 0) {
                defpackage.jiy jiyVar = this.b.d;
                float f6 = jhmVar2.a;
                float f7 = jhmVar.a;
                fA = jiyVar.a(fA, f(f6, f7, rect.left + f7));
            }
            if (rect.top != 0) {
                defpackage.jiy jiyVar2 = this.b.d;
                float f8 = jhmVar2.d;
                float f9 = jhmVar.d;
                fA = jiyVar2.a(fA, f(f8, f9, rect.top + f9));
            }
            if (rect.right != 0) {
                defpackage.jiy jiyVar3 = this.b.d;
                float f10 = jhmVar2.c;
                float f11 = jhmVar.c;
                fA = jiyVar3.a(fA, f(f10, f11, rect.right + f11));
            }
            if (rect.bottom != 0) {
                defpackage.jiy jiyVar4 = this.b.d;
                float f12 = jhmVar2.b;
                float f13 = jhmVar.b;
                fA = jiyVar4.a(fA, f(f12, f13, rect.bottom + f13));
            }
            if (fA == f5) {
                if (this.b == jiwVar4) {
                    this.d = true;
                } else {
                    this.d = false;
                }
                this.b = jiwVar2;
            }
        } else if (!this.d) {
            fA = 0.0f;
        }
        java.util.concurrent.TimeUnit.SECONDS.getClass();
        com.google.android.gms.car.ProjectionWindowDecorationParams projectionWindowDecorationParams2 = this.e;
        if (projectionWindowDecorationParams2.h) {
            float f14 = projectionWindowDecorationParams2.a;
            float f15 = projectionWindowDecorationParams2.b;
            float f16 = projectionWindowDecorationParams2.c;
            float f17 = projectionWindowDecorationParams2.d;
            f2 = f14 - (f14 * fA);
            f = f16 - (f16 * fA);
            f3 = f17 - (f17 * fA);
            f4 = f15 - (f15 * fA);
        } else {
            f = 0.0f;
            f2 = 0.0f;
            f3 = 0.0f;
        }
        return new defpackage.jix(projectionWindowDecorationParams2.i ? projectionWindowDecorationParams2.f * fA : projectionWindowDecorationParams2.f, f2, f4, f, f3);
    }

    public final synchronized void b(boolean z) {
        ((defpackage.yqj) a.l().ai(2232)).N("%s decoration forced to shown(%b)", this.f, z);
        this.b = defpackage.jiw.a;
        this.d = z;
    }

    public final synchronized void c(android.graphics.Rect rect) {
        ((defpackage.yqj) a.l().ai(2236)).M("Scheduling enter animation for %s due to inset change: %s", this.f, rect);
        if (!this.d || this.b != defpackage.jiw.a) {
            defpackage.jiw jiwVar = this.b;
            defpackage.jiw jiwVar2 = defpackage.jiw.b;
            if (jiwVar != jiwVar2) {
                this.b = jiwVar2;
                this.c = rect;
            }
        }
    }

    public final synchronized void d(android.graphics.Rect rect) {
        ((defpackage.yqj) a.l().ai(2237)).M("Scheduling exit animation for %s due to inset change: %s", this.f, rect);
        if (this.d || this.b != defpackage.jiw.a) {
            defpackage.jiw jiwVar = this.b;
            defpackage.jiw jiwVar2 = defpackage.jiw.c;
            if (jiwVar != jiwVar2) {
                this.b = jiwVar2;
                this.c = rect;
            }
        }
    }

    public final synchronized void e(com.google.android.gms.car.ProjectionWindowDecorationParams projectionWindowDecorationParams) {
        this.e = projectionWindowDecorationParams;
    }
}
