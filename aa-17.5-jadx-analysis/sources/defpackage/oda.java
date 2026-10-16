package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.view.View;

/* loaded from: classes.dex */
public final class oda extends ocd {
    final /* synthetic */ odc b;

    public oda(odc odcVar) {
        this.b = odcVar;
    }

    @Override // defpackage.ocd
    public final int a() {
        cst cstVar = this.b.c;
        if (cstVar != null) {
            return (int) (cstVar.h() & 4294967295L);
        }
        return 0;
    }

    @Override // defpackage.ocd
    public final int b() {
        cst cstVar = this.b.c;
        if (cstVar != null) {
            return (int) (cstVar.h() >> 32);
        }
        return 0;
    }

    @Override // defpackage.ocd
    public final Context c() {
        return (Context) bzi.x(this.b, daa.b);
    }

    @Override // defpackage.ocd
    public final Point d() {
        cst cstVar = this.b.c;
        if (cstVar != null) {
            cja cjaVar = new cja(cstVar.k(0L));
            if ((((cjaVar.a & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) != 0) {
                cjaVar = null;
            }
            if (cjaVar != null) {
                long j = cjaVar.a;
                return new Point((int) Float.intBitsToFloat((int) (j >> 32)), (int) Float.intBitsToFloat((int) (j & 4294967295L)));
            }
        }
        return new Point(0, 0);
    }

    @Override // defpackage.ocd
    public final void e(Runnable runnable) {
        odc odcVar = this.b;
        if (odcVar.c == null) {
            odcVar.d.add(runnable);
        } else {
            runnable.run();
        }
    }

    @Override // defpackage.ocd
    public final void h(Runnable runnable) {
        ((View) bzi.x(this.b, daa.f)).post(runnable);
    }

    @Override // defpackage.ocd
    public final void i() {
        odc odcVar = this.b;
        if (odcVar.A) {
            lv.p(odcVar);
        } else {
            ((ype) odc.a.h()).u("Tooltip anchor not attached, unable to request focus");
        }
    }

    @Override // defpackage.ocd
    public final void f() {
    }

    @Override // defpackage.ocd
    public final void g() {
    }
}
