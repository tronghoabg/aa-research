package defpackage;

import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public final class lze extends lzc {
    private static final yph g = yph.c("GH.SpeedBump");
    public lyz e;
    public float f;
    private long h;
    private int i;
    private long j;
    private final Runnable k;

    public lze() {
        lyz lyzVar = new lyz(0.2f, 6.0f, 600L);
        this.k = new lqj(this, 13);
        this.e = lyzVar;
        this.h = 5833L;
        this.f = 6.0f;
        this.j = 2L;
    }

    private final void p() {
        if (this.c == lzb.a) {
            return;
        }
        yph yphVar = g;
        ((ype) yphVar.l().ai(4484)).y("enableModeration: Moderation state before: %s", this.c);
        this.e.d = false;
        j(lzb.c);
        ((ype) yphVar.l().ai(4485)).y("enableModeration: Moderation state after: %s", this.c);
    }

    @Override // defpackage.lzc
    protected final void h(gsn gsnVar, yzz yzzVar) {
        boolean z = true;
        switch (gsnVar.ordinal()) {
            case 9:
                yph yphVar = g;
                ((ype) yphVar.l().ai((char) 4491)).u("internalOnUserAction: VEHICLE_PARKED received");
                if (acow.h()) {
                    p();
                } else {
                    ((ype) yphVar.l().ai(4482)).y("disableModeration: Moderation state before: %s", this.c);
                    wer.f(this.k);
                    this.e.d = true;
                    j(lzb.d);
                    ((ype) yphVar.l().ai(4483)).y("disableModeration: Moderation state after: %s", this.c);
                }
                ((ype) yphVar.l().ai(4492)).y("internalOnUserAction: Moderation state after VEHICLE_PARKED: %s", this.c);
                break;
            case 10:
                yph yphVar2 = g;
                ((ype) yphVar2.l().ai((char) 4493)).u("internalOnUserAction: VEHICLE_DRIVING received");
                p();
                ((ype) yphVar2.l().ai(4494)).y("internalOnUserAction: Moderation state after VEHICLE_DRIVING: %s", this.c);
                break;
            case 11:
                ((ype) g.l().ai((char) 4495)).u("internalOnUserAction: VEHICLE_SPEED_UNKNOWN received");
                p();
                break;
            default:
                lzb lzbVar = this.c;
                lzb lzbVar2 = lzb.a;
                if (lzbVar != lzbVar2 && lzbVar != lzb.d) {
                    if (gsnVar == gsn.e) {
                        int i = this.i + 1;
                        this.i = i;
                        if (i <= this.j) {
                        }
                    } else {
                        this.i = 0;
                    }
                    lyz lyzVar = this.e;
                    wer.c();
                    woy.Q(true, "Requested permits (%s) must be positive", 1);
                    if (lyzVar.d) {
                        ((ype) lyz.a.l().ai((char) 4470)).u("Unlimited mode is enabled.");
                    } else {
                        float fB = lyzVar.b();
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        float f = lyzVar.e;
                        float f2 = lyzVar.b;
                        if (fB <= 1.0f) {
                            lyzVar.d(BitmapDescriptorFactory.HUE_RED, jElapsedRealtime + lyzVar.c);
                            z = false;
                        } else if (jElapsedRealtime >= lyzVar.f || !lyzVar.g) {
                            lyzVar.d(fB - 1.0f, jElapsedRealtime + lyzVar.c);
                            float f3 = lyzVar.e;
                            boolean z2 = lyzVar.g;
                            lyzVar.g = true;
                        } else {
                            lyzVar.d(fB, jElapsedRealtime + lyzVar.c);
                            lyzVar.g = false;
                            ((ype) lyz.a.l().ai((char) 4469)).u("Used up free secondary permit");
                        }
                    }
                    i(yzzVar, yzy.bD);
                    if (!z) {
                        i(yzzVar, yzy.bE);
                        j(lzbVar2);
                        wer.d(this.k, this.h);
                        break;
                    }
                } else {
                    ((ype) g.l().ai(4487)).y("Not acquiring a permit because we are %s", this.c);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.lzc
    public final void m() {
        wer.f(this.k);
        super.m();
    }

    @Override // defpackage.lzc
    public final void n(Bundle bundle) {
        if (bundle == null) {
            ((ype) ((ype) g.g()).ai((char) 4498)).u("params bundle was null!");
            return;
        }
        float fA = this.e.a();
        float f = bundle.getFloat("permits_per_sec");
        float f2 = bundle.getFloat("max_permits");
        long j = bundle.getLong("fill_delay_ms");
        long j2 = bundle.getLong("lockout_ms");
        float f3 = bundle.getFloat("permits_after_lockout");
        long j3 = bundle.getLong("unrestricted_consecutive_page_ups");
        lyz lyzVar = new lyz(f, f2, j);
        this.e = lyzVar;
        lyzVar.c(Math.min(fA, f2));
        this.h = j2;
        this.f = f3;
        this.j = j3;
    }

    @Override // defpackage.lzc
    public final void o() {
    }
}
