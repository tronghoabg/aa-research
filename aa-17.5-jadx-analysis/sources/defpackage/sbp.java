package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.v4.app.Fragment;
import com.google.android.gms.carsetup.CarInfoInternal;
import com.google.android.gms.carsetup.CarSetupServiceImpl;
import java.util.List;

/* loaded from: classes.dex */
public final class sbp implements sdf, sdi {
    public static final ypf a = ols.R("CAR.SETUP");
    public final Context b;
    public final qst c;
    public final sdg d;
    public final int e = 0;
    public final boolean f;
    public final boolean g;
    public final int h;
    public final sdl i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public final rod o;
    public ykd p;
    private final CarInfoInternal q;
    private final sak r;

    public sbp(Context context, CarInfoInternal carInfoInternal, qst qstVar, sdg sdgVar, boolean z, boolean z2, boolean z3, rod rodVar, sak sakVar, int i) {
        this.b = context;
        this.q = carInfoInternal;
        this.c = qstVar;
        this.d = sdgVar;
        this.f = z;
        this.o = rodVar;
        this.r = sakVar;
        this.h = i;
        sdl sdlVar = adbi.a.gu().b() ? new sdl(context, new rob(carInfoInternal), new sbo(new shm(qstVar)), new sad(context, this)) : null;
        this.i = sdlVar;
        if (sdlVar == null ? !z2 : !sdlVar.b.a()) {
            this.g = true;
            this.l = false;
        } else if (sdlVar == null ? !z3 : !sdlVar.c()) {
            this.g = false;
            this.l = false;
        } else {
            this.g = false;
            this.l = true;
        }
    }

    @Override // defpackage.sdi
    public final int a() {
        return this.q.a.e;
    }

    @Override // defpackage.sdi
    public final int b() {
        return this.q.a.f;
    }

    public final shm c() {
        return new shm(this.c);
    }

    public final List d() {
        sdl sdlVar = this.i;
        return sdlVar != null ? sdlVar.a() : new sad(this.b, this).e();
    }

    public final void e(yxb yxbVar, yxc yxcVar) {
        if (this.j) {
            a.f().ai(8721).u("Dropping clearcut event. Setup already finished");
        } else {
            this.r.d(yxbVar, yxcVar);
        }
    }

    public final void f(yzy yzyVar, yzl[] yzlVarArr) {
        abnp abnpVarN = zab.a.n();
        abnpVarN.t();
        zab zabVar = (zab) abnpVarN.b;
        zabVar.b |= 1;
        zabVar.d = 399;
        int iA = yzyVar.a();
        abnpVarN.t();
        zab zabVar2 = (zab) abnpVarN.b;
        zabVar2.b |= 2;
        zabVar2.e = iA;
        if (yzyVar == yzy.hy) {
            abnpVarN.t();
            zab zabVar3 = (zab) abnpVarN.b;
            zabVar3.c |= 8;
            zabVar3.K = 0;
        }
        if (yzlVarArr != null) {
            List listAx = wub.ax(woy.dP(yzlVarArr));
            abnpVarN.t();
            zab zabVar4 = (zab) abnpVarN.b;
            abod abodVar = zabVar4.J;
            if (!abodVar.c()) {
                zabVar4.J = abnv.G(abodVar);
            }
            abmc.i(listAx, zabVar4.J);
        }
        abnp abnpVarN2 = yxb.a.n();
        abnpVarN2.t();
        yxb yxbVar = (yxb) abnpVarN2.b;
        zab zabVar5 = (zab) abnpVarN.q();
        zabVar5.getClass();
        yxbVar.o = zabVar5;
        yxbVar.b |= 4096;
        e((yxb) abnpVarN2.q(), yxc.UI);
    }

    public final void g(yzy yzyVar) {
        yzz yzzVar = yzz.CAR_SETUP_NOTIFICATION;
        abnp abnpVarN = zab.a.n();
        int i = yzzVar.he;
        abnpVarN.t();
        zab zabVar = (zab) abnpVarN.b;
        zabVar.b |= 1;
        zabVar.d = i;
        int iA = yzyVar.a();
        abnpVarN.t();
        zab zabVar2 = (zab) abnpVarN.b;
        zabVar2.b |= 2;
        zabVar2.e = iA;
        zab zabVar3 = (zab) abnpVarN.q();
        abnp abnpVarN2 = yxb.a.n();
        abnpVarN2.t();
        yxb yxbVar = (yxb) abnpVarN2.b;
        zabVar3.getClass();
        yxbVar.o = zabVar3;
        yxbVar.b |= 4096;
        e((yxb) abnpVarN2.q(), yxc.UI);
    }

    public final void h() {
        this.n = true;
        if (!this.k) {
            a.h().ai(8722).u("Setup not running. Will not notify listener.");
        } else {
            a.f().ai(8723).u("CarService started. Notifying listener.");
            ((seg) this.p.a).d.f("EVENT_CAR_SERVICE_STARTED", null);
        }
    }

    @Override // defpackage.sdf
    public final void i(final int i) {
        final ykd ykdVar = this.p;
        if (ykdVar != null) {
            Object obj = ykdVar.a;
            if (((scr) obj).a) {
                ((seg) obj).d.i(new sef() { // from class: scq
                    @Override // defpackage.sef
                    public final void a(seh sehVar) {
                        ykd ykdVar2 = ykdVar;
                        ((bc) ((Fragment) ykdVar2.a).getContext()).runOnUiThread(new rgm(ykdVar2, i, 6, null));
                    }
                });
            }
        }
    }

    public final void j(int i) {
        SharedPreferences.Editor editorEdit = this.c.b.edit();
        editorEdit.putInt("times_show_reminder_notification", i);
        editorEdit.apply();
    }

    public final boolean k() {
        return this.q.c;
    }

    public final void l(int i, yzy yzyVar, yzl[] yzlVarArr) {
        abnp abnpVarN = yye.a.n();
        abnpVarN.t();
        yye yyeVar = (yye) abnpVarN.b;
        yyeVar.b |= 1;
        yyeVar.c = i - 1;
        if (yzlVarArr != null) {
            List listAx = wub.ax(woy.dP(yzlVarArr));
            abnpVarN.t();
            yye yyeVar2 = (yye) abnpVarN.b;
            abod abodVar = yyeVar2.d;
            if (!abodVar.c()) {
                yyeVar2.d = abnv.G(abodVar);
            }
            abmc.i(listAx, yyeVar2.d);
        }
        abnp abnpVarN2 = yxb.a.n();
        yye yyeVar3 = (yye) abnpVarN.q();
        abnpVarN2.t();
        yxb yxbVar = (yxb) abnpVarN2.b;
        yyeVar3.getClass();
        yxbVar.E = yyeVar3;
        yxbVar.b |= Integer.MIN_VALUE;
        e((yxb) abnpVarN2.q(), yxc.FRX_START);
        if (adbi.a.gu().a()) {
            f(yzyVar, yzlVarArr);
        }
    }

    public final void m(Boolean bool) {
        a.f().ai(8712).y("Setup finished: supported=%b", true);
        if (this.k) {
            this.p = null;
            this.k = false;
            ((sdv) this.d).a.remove(this);
            if (bool != null) {
                boolean zBooleanValue = bool.booleanValue();
                rod rodVar = this.o;
                if (zBooleanValue) {
                    rrx rrxVar = rrx.b;
                    Object obj = rodVar.a;
                    Context context = (Context) obj;
                    ols.K(context, "com.google.android.gms.car.FRX", rrxVar.ordinal(), null);
                    ols.Q(context, rrxVar, 0);
                    CarSetupServiceImpl carSetupServiceImpl = (CarSetupServiceImpl) obj;
                    if (carSetupServiceImpl.l()) {
                        carSetupServiceImpl.t.b();
                    } else {
                        try {
                            Bundle bundle = new Bundle();
                            ((CarSetupServiceImpl) obj).d.j(bundle);
                            ((CarSetupServiceImpl) obj).k.a.f(bundle);
                        } catch (RemoteException unused) {
                        }
                    }
                    carSetupServiceImpl.k = null;
                    carSetupServiceImpl.i = null;
                    carSetupServiceImpl.c();
                } else {
                    rrx rrxVar2 = rrx.c;
                    Object obj2 = rodVar.a;
                    ols.K((Context) obj2, "com.google.android.gms.car.FRX", rrxVar2.ordinal(), null);
                    ((CarSetupServiceImpl) obj2).n(3);
                }
            }
            this.j = true;
        }
    }

    public final void n() {
        a.f().ai(8724).u("setup failed");
        m(Boolean.FALSE);
    }
}
