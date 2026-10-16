package defpackage;

import android.content.Intent;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
final class okh extends oji {
    final /* synthetic */ oki a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public okh(oki okiVar) {
        super(okiVar);
        this.a = okiVar;
    }

    @Override // defpackage.ojn
    public final xxh a() {
        return xxh.h(new okg(this));
    }

    @Override // defpackage.ojn
    public final String b() {
        return this.a.a.getString(R.string.startup_diagnostic_heading);
    }

    @Override // defpackage.ojn
    public final String c() {
        return this.a.a.getString(R.string.startup_diagnostic_message);
    }

    @Override // defpackage.ojn
    public final boolean e() {
        return !this.a.e();
    }

    @Override // defpackage.ojn
    public final int f() {
        return this.a.f();
    }

    @Override // defpackage.ojn
    public final int g() {
        return acxj.e() ? 2 : 0;
    }

    @Override // defpackage.ojn
    public final int h() {
        return acxj.e() ? 1 : -1;
    }

    @Override // defpackage.ojn
    public final xxh i() {
        Intent intentC = oki.c();
        intentC.addFlags(335544320);
        return xxh.h(intentC);
    }

    @Override // defpackage.ojn
    public final xxh j() {
        return xxh.h(yxi.TROUBLESHOOTER_STARTUP_DIAGNOSTIC_DETECTED);
    }

    @Override // defpackage.ojn
    public final xxh l() {
        return xxh.h(yxi.TROUBLESHOOTER_STARTUP_DIAGNOSTIC_NOTIFIED);
    }

    @Override // defpackage.ojn
    public final xxh m() {
        return xxh.h(yxi.TROUBLESHOOTER_STARTUP_DIAGNOSTIC_RESOLVED);
    }

    @Override // defpackage.ojn
    public final String o() {
        if (acxj.e()) {
            mas.c();
            return "gearhead_alerts";
        }
        mas.c();
        return "gearhead_connection_status";
    }

    @Override // defpackage.ojn
    public final int q() {
        return 2;
    }
}
