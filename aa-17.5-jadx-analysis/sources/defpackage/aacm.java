package defpackage;

import android.location.Location;
import androidx.car.app.model.Alert;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.projection.gearhead.R;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class aacm extends tqp implements zxb {
    public final aabp a;
    public final aaew b;
    public final aaex c;
    public zxa d;
    boolean e;
    private final Executor f;
    private boolean g;
    private final twq h;
    private final ncp i;
    private final gjt j;

    public aacm(twq twqVar, gjt gjtVar, aabp aabpVar, ncp ncpVar) {
        aaew aaewVar = new aaew();
        aaex aaexVar = new aaex();
        Executor executorB = zrz.b();
        zkt.n(twqVar, "phoenixGoogleMap");
        this.h = twqVar;
        zkt.n(gjtVar, "contextManager");
        this.j = gjtVar;
        this.a = aabpVar;
        this.i = ncpVar;
        this.b = aaewVar;
        this.c = aaexVar;
        this.f = executorB;
        this.e = false;
        this.g = false;
        this.d = null;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, tpu] */
    @Override // defpackage.zxb
    public final void a() {
        this.b.b.a(BitmapDescriptorFactory.HUE_RED);
        aaex aaexVar = this.c;
        aaexVar.a.a(BitmapDescriptorFactory.HUE_RED);
        aaexVar.g.f.b(aaexVar.a);
        aaexVar.e = false;
    }

    @Override // defpackage.tqq
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        this.f.execute(new aabr(this, 3));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, tpr] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, tpu] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, tpu] */
    @Override // defpackage.zxb
    public final void c() {
        boolean z;
        if (this.e) {
            z = true;
        } else {
            aaew aaewVar = this.b;
            twq twqVar = this.h;
            gjt gjtVar = this.j;
            ncp ncpVar = this.i;
            aacl aaclVar = aacl.b;
            zkt.n(aaclVar, "multiZoomStyleFactoryPhoenix");
            aaewVar.e = twqVar;
            aaewVar.c = gjtVar;
            zkt.n(aaclVar, "multiZoomStyleFactoryPhoenix");
            aaewVar.d = aaclVar;
            abnp abnpVarN = abes.a.n();
            int iV = ((gjt) aaewVar.c).v(R.color.maps_accuracy_circle_line_color);
            abnpVarN.t();
            abes abesVar = (abes) abnpVarN.b;
            abesVar.b |= 1;
            abesVar.c = iV;
            int iRound = Math.round((2.0f / ((gjt) aaewVar.c).t()) * 8.0f);
            abnpVarN.t();
            abes abesVar2 = (abes) abnpVarN.b;
            abesVar2.b |= 8;
            abesVar2.e = iRound;
            int iD = ((aacl) aaewVar.d).d((twq) aaewVar.e, abnpVarN, ((gjt) aaewVar.c).v(R.color.maps_accuracy_circle_fill_color), Float.MAX_VALUE);
            aaewVar.a = iD;
            aaewVar.b = ncpVar.s(0.0d, 0.0d, 100, ((typ) ((twq) aaewVar.e).b).g.b(iD), true, 3, 2147483646, 0);
            aaewVar.b.a(BitmapDescriptorFactory.HUE_RED);
            twqVar.f.d(aaewVar.b);
            aaex aaexVar = this.c;
            aaexVar.g = twqVar;
            aaexVar.h = gjtVar;
            zkt.n(aaclVar, "multiZoomStyleFactoryPhoenix");
            aaexVar.b = aaclVar;
            aaexVar.a = ncpVar.s(0.0d, 0.0d, 4, aaexVar.a(R.drawable.maps_blue_dot), false, 3, Alert.DURATION_SHOW_INDEFINITELY, 0);
            tpt tptVarC = aaexVar.a.c();
            tptVarC.d(gjtVar.J(), tps.a);
            aaexVar.a.d(tptVarC);
            aaexVar.a.a(BitmapDescriptorFactory.HUE_RED);
            aaexVar.c = null;
            aaexVar.e = false;
            if (this.g) {
                aaexVar.c(this);
            }
            z = true;
            this.e = true;
        }
        this.b.b.a(1.0f);
        aaex aaexVar2 = this.c;
        aaexVar2.e = z;
        aaexVar2.a.a(1.0f);
        aaexVar2.b();
    }

    @Override // defpackage.zxb
    public final void d(boolean z) {
        this.g = z;
        if (this.e) {
            aaex aaexVar = this.c;
            if (z) {
                aaexVar.c(this);
            } else {
                zkt.n(aaexVar.a, "dot");
                aaexVar.a.e();
            }
        }
    }

    @Override // defpackage.zxb
    public final void e(zxa zxaVar) {
        this.d = zxaVar;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, tpu] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, tpu] */
    @Override // defpackage.zxb
    public final void f(Location location) {
        zkt.m(location);
        too tooVarL = too.l(location.getLatitude(), location.getLongitude());
        float accuracy = location.getAccuracy();
        aaew aaewVar = this.b;
        tpt tptVarC = aaewVar.b.c();
        tptVarC.b(tooVarL);
        float fCos = (float) ((accuracy + accuracy) * (5.36870912E8d / (Math.cos(tooVarL.a() * 0.017453292519943295d) * 2.001511821194711E7d)));
        tptVarC.b.n(fCos, fCos);
        tptVarC.c = tps.b;
        aaewVar.b.d(tptVarC);
        aaex aaexVar = this.c;
        too tooVar = aaexVar.c;
        aaexVar.c = tooVarL;
        tpt tptVarC2 = aaexVar.a.c();
        tptVarC2.b(tooVarL);
        if (aaexVar.d) {
            tptVarC2.c(tptVarC2.d, tooVarL);
        }
        aaexVar.a.d(tptVarC2);
        if (tooVar == null) {
            aaexVar.b();
        }
        boolean zHasBearing = location.hasBearing();
        zkt.n(aaexVar.h, "contextManager");
        zkt.n(aaexVar.g, "phoenixGoogleMap");
        if (aaexVar.d != zHasBearing) {
            aaexVar.d = zHasBearing;
            if (!zHasBearing) {
                tpt tptVarC3 = aaexVar.a.c();
                tptVarC3.c(BitmapDescriptorFactory.HUE_RED, new too());
                aaexVar.a.d(tptVarC3);
            }
            tpu tpuVar = aaexVar.a;
            int i = true != zHasBearing ? R.drawable.maps_blue_dot : R.drawable.maps_chevron;
            int i2 = aaexVar.f.get(i, -1);
            tpuVar.b(i2 == -1 ? aaexVar.a(i) : ((typ) aaexVar.g.b).g.b(i2));
        }
        if (zHasBearing) {
            float bearing = location.getBearing();
            if (aaexVar.d) {
                tpt tptVarC4 = aaexVar.a.c();
                tptVarC4.c(bearing, tptVarC4.a);
                aaexVar.a.d(tptVarC4);
            }
        }
    }
}
