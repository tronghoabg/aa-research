package defpackage;

import android.graphics.Rect;
import com.google.android.gms.car.ProjectionWindowDecorationParams;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class jis {
    private static final yph a = yph.c("CAR.WinDecorAnimCtrl");
    private volatile Rect c;
    private boolean d;
    private final String f;
    private volatile jip b = jip.a;
    private ProjectionWindowDecorationParams e = ProjectionWindowDecorationParams.a();

    public jis(String str) {
        this.f = str;
    }

    private static float f(float f, float f2, float f3) {
        return Math.abs(f - f2) / Math.abs(f3 - f2);
    }

    public final synchronized jiq a(jhg jhgVar, jhg jhgVar2) {
        float f;
        float f2;
        float f3;
        ProjectionWindowDecorationParams projectionWindowDecorationParams = this.e;
        if (!projectionWindowDecorationParams.h && !projectionWindowDecorationParams.i) {
            return new jiq(projectionWindowDecorationParams.f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        }
        Rect rect = this.c;
        jip jipVar = this.b;
        jip jipVar2 = jip.a;
        float f4 = BitmapDescriptorFactory.HUE_RED;
        if (jipVar != jipVar2) {
            jip jipVar3 = this.b;
            jip jipVar4 = jip.b;
            float f5 = jipVar3 == jipVar4 ? 1.0f : 0.0f;
            fA = this.b == jipVar4 ? 0.0f : 1.0f;
            if (rect.left != 0) {
                jir jirVar = this.b.d;
                float f6 = jhgVar2.a;
                float f7 = jhgVar.a;
                fA = jirVar.a(fA, f(f6, f7, rect.left + f7));
            }
            if (rect.top != 0) {
                jir jirVar2 = this.b.d;
                float f8 = jhgVar2.d;
                float f9 = jhgVar.d;
                fA = jirVar2.a(fA, f(f8, f9, rect.top + f9));
            }
            if (rect.right != 0) {
                jir jirVar3 = this.b.d;
                float f10 = jhgVar2.c;
                float f11 = jhgVar.c;
                fA = jirVar3.a(fA, f(f10, f11, rect.right + f11));
            }
            if (rect.bottom != 0) {
                jir jirVar4 = this.b.d;
                float f12 = jhgVar2.b;
                float f13 = jhgVar.b;
                fA = jirVar4.a(fA, f(f12, f13, rect.bottom + f13));
            }
            if (fA == f5) {
                if (this.b == jipVar4) {
                    this.d = true;
                } else {
                    this.d = false;
                }
                this.b = jipVar2;
            }
        } else if (!this.d) {
            fA = 0.0f;
        }
        TimeUnit.SECONDS.getClass();
        ProjectionWindowDecorationParams projectionWindowDecorationParams2 = this.e;
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
        return new jiq(projectionWindowDecorationParams2.i ? projectionWindowDecorationParams2.f * fA : projectionWindowDecorationParams2.f, f2, f4, f, f3);
    }

    public final synchronized void b(boolean z) {
        ((ype) a.l().ai(2231)).N("%s decoration forced to shown(%b)", this.f, z);
        this.b = jip.a;
        this.d = z;
    }

    public final synchronized void c(Rect rect) {
        ((ype) a.l().ai(2235)).M("Scheduling enter animation for %s due to inset change: %s", this.f, rect);
        if (!this.d || this.b != jip.a) {
            jip jipVar = this.b;
            jip jipVar2 = jip.b;
            if (jipVar != jipVar2) {
                this.b = jipVar2;
                this.c = rect;
            }
        }
    }

    public final synchronized void d(Rect rect) {
        ((ype) a.l().ai(2236)).M("Scheduling exit animation for %s due to inset change: %s", this.f, rect);
        if (this.d || this.b != jip.a) {
            jip jipVar = this.b;
            jip jipVar2 = jip.c;
            if (jipVar != jipVar2) {
                this.b = jipVar2;
                this.c = rect;
            }
        }
    }

    public final synchronized void e(ProjectionWindowDecorationParams projectionWindowDecorationParams) {
        this.e = projectionWindowDecorationParams;
    }
}
