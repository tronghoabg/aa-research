package defpackage;

import android.content.Context;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import j$.util.Objects;
import java.util.Collections;

/* loaded from: classes.dex */
public final class odd {
    private final int a;
    private final xyc b;
    private final int c;
    private final yzz d;
    private final boolean e;
    private final acai f;

    public odd(int i, int i2, boolean z, acai acaiVar, yzz yzzVar) {
        this.a = i;
        this.b = new joa(7);
        this.c = i2;
        this.d = yzzVar;
        this.e = z;
        this.f = acaiVar;
    }

    @ResultIgnorabilityUnspecified
    public final ocq a(final oco ocoVar, nge ngeVar) {
        String str = (String) this.b.gu();
        if (str == null) {
            int i = this.a;
            int i2 = this.c;
            ocd ocdVar = ocoVar.c;
            Context contextC = ocdVar.c();
            if (i2 != 0) {
                ocoVar.c(contextC.getText(i), contextC.getDrawable(i2));
            } else {
                ocoVar.b(ocdVar.c().getText(i));
            }
        } else {
            int i3 = this.c;
            Context contextC2 = ocoVar.c.c();
            if (i3 != 0) {
                ocoVar.c(str, contextC2.getDrawable(i3));
            } else {
                ocoVar.b(str);
            }
        }
        ocoVar.g = this.d;
        ngf.g().i(ngeVar);
        ebf.j().n(Collections.singletonList(this.f));
        try {
            boolean z = this.e;
            if (ocoVar.g == yzz.UNKNOWN_CONTEXT) {
                throw new IllegalStateException("Tooltip.Builder.setTelemetryContext(UiContext) must be called before showing.");
            }
            final ocx ocxVar = ocoVar.h;
            if (ocxVar == oco.a) {
                throw new IllegalStateException("No view has been set for this tooltip builder");
            }
            if (z) {
                ocoVar.a(yzy.lN);
                ocn ocnVar = new ocn(ocoVar.g);
                ocp ocpVar = ocoVar.f;
                if (ocpVar != null) {
                    ocoVar.c.h(new nqw(ocpVar, 13));
                }
                return ocnVar;
            }
            nrd nrdVarA = nrd.a();
            final boolean z2 = (nrdVarA.c() || nrdVarA.e()) ? false : true;
            mki.a.g();
            final sab sabVarU = ols.u(kio.b().e());
            ocl oclVar = new ocl();
            ocoVar.c.e(new Runnable() { // from class: oce
                /* JADX WARN: Removed duplicated region for block: B:31:0x01a2  */
                /* JADX WARN: Removed duplicated region for block: B:34:0x01b6  */
                /* JADX WARN: Removed duplicated region for block: B:35:0x01d0  */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void run() {
                    /*
                        Method dump skipped, instructions count: 529
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.oce.run():void");
                }
            });
            return oclVar;
        } catch (qrz | qsa e) {
            tss.r("GH.TooltipPresenter", e, "Unable to show tooltip", new Object[0]);
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof odd)) {
            return false;
        }
        odd oddVar = (odd) obj;
        return this.a == oddVar.a && this.c == oddVar.c && this.e == oddVar.e && Objects.equals(this.b.gu(), oddVar.b.gu()) && this.d == oddVar.d && this.f == oddVar.f;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), this.b, Integer.valueOf(this.c), this.d, Boolean.valueOf(this.e), this.f);
    }

    public odd(xyc xycVar, int i, boolean z, acai acaiVar, yzz yzzVar) {
        this.a = 0;
        this.b = xycVar;
        this.c = i;
        this.d = yzzVar;
        this.e = z;
        this.f = acaiVar;
    }

    public odd(String str, int i, boolean z, acai acaiVar, yzz yzzVar) {
        this(new inl(str, 10), i, z, acaiVar, yzzVar);
    }
}
