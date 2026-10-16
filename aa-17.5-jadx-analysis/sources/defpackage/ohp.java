package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import android.widget.FrameLayout;
import com.google.android.apps.auto.components.telecom.PhoneCall;
import com.google.android.apps.auto.components.telecom.call.CarCall;
import com.google.android.projection.gearhead.R;
import j$.util.Collection;
import j$.util.Objects;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
public final class ohp extends mlq {
    public static final yph a = yph.c("GH.CallViewController");
    public Context b;
    public boolean c;
    public boolean d;
    public oho e;
    public onf f;
    public one g;
    PhoneCall h;
    public FrameLayout i;
    public ncp j;
    public final ebf k;
    private ygr l;
    private PhoneCall m;
    private boolean n;

    public ohp() {
        super(null);
        this.k = new odl("GH.CallViewController", new ohn(this));
    }

    private static void Y(yzy yzyVar, PhoneCall phoneCall) {
        rrb rrbVarH = rrc.h(yxy.GEARHEAD, yzz.PHONE_FACET, yzyVar);
        if (phoneCall != null) {
            rrbVarH.p(phoneCall.f);
        }
        ebf.j().F(rrbVarH.l());
    }

    @Override // defpackage.mlq
    public final void C() {
        ((ype) a.l().ai((char) 5920)).u("Audio route pressed");
        Y(yzy.T, this.h);
        oho ohoVar = this.e;
        if (ohoVar != null) {
            ohoVar.e();
        }
    }

    @Override // defpackage.mlq
    public final void D() {
        yph yphVar = a;
        ((ype) yphVar.l().ai((char) 5922)).u("end call clicked.");
        PhoneCall phoneCall = this.h;
        if (phoneCall == null) {
            if (this.n) {
                ((ype) ((ype) yphVar.h()).ai((char) 5924)).u("Current call was lost before ending call");
                return;
            } else {
                Y(yzy.Kn, null);
                return;
            }
        }
        Y(yzy.I, phoneCall);
        odj odjVarA = ebf.A();
        PhoneCall phoneCall2 = this.h;
        phoneCall2.getClass();
        if (odjVarA.y(phoneCall2.a)) {
            return;
        }
        ((ype) ((ype) yphVar.h()).ai(5923)).y("Call could not be ended. %s", this.h);
    }

    @Override // defpackage.mlq
    public final void E() {
        yph yphVar = a;
        ((ype) yphVar.l().ai((char) 5925)).u("hold call clicked");
        Y(yzy.M, this.h);
        PhoneCall phoneCall = this.h;
        if (phoneCall == null) {
            ((ype) ((ype) yphVar.h()).ai((char) 5929)).u("onHoldCallPressed should not be triggered with no currentCall.");
            return;
        }
        CarCall carCallE = odn.a().e(phoneCall.a);
        if (carCallE == null) {
            ((ype) ((ype) yphVar.h()).ai((char) 5928)).u("onHoldCallPressed could not convert PhoneCall to valid CarCall");
        } else if (carCallE.e == 3) {
            ((ype) ((ype) yphVar.f()).ai((char) 5927)).u("Unholding currently held call");
            ebf.A().w(carCallE);
        } else {
            ((ype) ((ype) yphVar.f()).ai((char) 5926)).u("Holding call");
            ebf.A().n(carCallE);
        }
    }

    @Override // defpackage.mlq
    public final void F() {
        ((ype) a.l().ai((char) 5930)).u("merge call clicked");
        Y(yzy.L, this.h);
        ebf.A().o();
    }

    @Override // defpackage.mlq
    public final void G() {
        yph yphVar = a;
        ((ype) yphVar.l().ai((char) 5931)).u("mute call clicked");
        Y(yzy.J, this.h);
        PhoneCall phoneCall = this.h;
        if (phoneCall == null) {
            ((ype) ((ype) yphVar.h()).ai((char) 5932)).u("onMutePressed should not be triggered with no currentCall.");
            return;
        }
        odj odjVarA = ebf.A();
        odj odjVarA2 = ebf.A();
        odjVarA.u(phoneCall.a, !odjVarA2.z(r3));
    }

    @Override // defpackage.mlq
    public final void H() {
        ComponentName componentName;
        yph yphVar = a;
        ((ype) yphVar.l().ai((char) 5933)).u("swap call clicked");
        PhoneCall phoneCall = this.h;
        Y(yzy.N, phoneCall);
        PhoneCall phoneCallE = ebf.A().e();
        if (this.e == null || phoneCallE == null || phoneCall == null) {
            return;
        }
        if (phoneCall.equals(phoneCallE)) {
            ((ype) ((ype) yphVar.f()).ai((char) 5935)).u("Swapped to current call so not starting other app");
            return;
        }
        String packageName = phoneCallE.f.getPackageName();
        if (packageName.equals("com.google.android.projection.gearhead")) {
            componentName = mkn.b;
        } else {
            yfq yfqVar = (yfq) Collection.EL.stream(ogb.d().b(kio.b().e(), nyj.b())).map(new ijt(18)).collect(ycm.a);
            jud judVar = new jud(packageName, 0);
            yfqVar.getClass();
            Iterator<E> it = new ycn(yfqVar, judVar).iterator();
            componentName = (ComponentName) (it.hasNext() ? yrm.Y(it) : null);
        }
        if (componentName != null) {
            mpe.a().j(new mqb(componentName));
        }
        ((ype) ((ype) yphVar.f()).ai((char) 5934)).y("Swapped to active call so starting %s", packageName);
    }

    @Override // defpackage.mlq
    public final void I() {
        ((ype) a.l().ai((char) 5921)).u("Dialpad pressed");
        Y(yzy.F, this.h);
        oho ohoVar = this.e;
        if (ohoVar != null) {
            ohoVar.f();
        }
    }

    public final void V() {
        ((ype) a.l().ai((char) 5936)).u("Resetting");
        this.h = null;
        this.m = null;
        this.n = false;
        ond ondVarA = one.a();
        ondVarA.b(ncp.k(2));
        this.g = ondVarA.a();
        this.f.a();
        this.f.d(null);
    }

    public final void W(Set set) {
        this.l = ygr.n(set);
        if (this.c) {
            X();
        }
    }

    public final void X() {
        odj odjVarA = ebf.A();
        List listI = odjVarA.i();
        ygr ygrVar = this.l;
        List listJ = ygrVar != null ? ebf.A().j(ygrVar) : listI;
        yph yphVar = a;
        ((ype) yphVar.l().ai((char) 5938)).y("updateCallViewState: calls: %s", listJ);
        PhoneCall phoneCall = this.h;
        int size = listJ.size();
        boolean z = false;
        PhoneCall phoneCall2 = null;
        PhoneCall phoneCall3 = size > 0 ? (PhoneCall) listJ.get(0) : null;
        PhoneCall phoneCall4 = size > 1 ? (PhoneCall) listJ.get(1) : null;
        if (phoneCall3 != null && phoneCall3.a()) {
            if (phoneCall4 == null || !phoneCall4.a()) {
                phoneCall4 = null;
            }
            phoneCall2 = phoneCall3;
        } else if (phoneCall4 == null || !phoneCall4.a()) {
            phoneCall4 = null;
        } else {
            phoneCall2 = phoneCall4;
            phoneCall4 = null;
        }
        ((ype) ((ype) yphVar.f()).ai(5943)).R("calls:%d p:%s s:%s", Integer.valueOf(listJ.size()), phoneCall2, phoneCall4);
        if (this.h != null && phoneCall2 == null) {
            ((ype) yphVar.l().ai((char) 5944)).u("Replacing current call with null primary call");
            this.n = true;
        }
        this.h = phoneCall2;
        this.m = phoneCall4;
        if (phoneCall2 == null) {
            ((ype) ((ype) yphVar.f()).ai((char) 5942)).u("Current primary phone call is null. Nothing to update");
            return;
        }
        odo odoVarA = odn.a();
        int i = phoneCall2.a;
        CarCall carCallE = odoVarA.e(i);
        if (carCallE == null) {
            ((ype) ((ype) yphVar.g()).ai((char) 5941)).u("No car call found for current primary phone call. Nothing to update.");
            return;
        }
        int iB = mcd.B(listI);
        ond ondVar = new ond(this.g);
        boolean z2 = this.d && phoneCall2.b();
        ondVar.b(ncp.k(odjVarA.a()));
        ondVar.g(odjVarA.z(i));
        odm odmVar = phoneCall2.b;
        ondVar.h(odmVar == odm.HOLDING);
        String str = phoneCall2.c;
        ondVar.a = str;
        ondVar.d(iB);
        ondVar.k(odn.a().D(carCallE));
        ondVar.i(z2);
        if (phoneCall2.b() && phoneCall4 != null && phoneCall4.b()) {
            z = true;
        }
        ondVar.j(z);
        ondVar.f = mcd.A().j(carCallE);
        ondVar.g = mcd.A().h(carCallE);
        if (odn.a().H(this.b)) {
            String str2 = phoneCall2.g;
            if (!TextUtils.isEmpty(str2)) {
                ondVar.e = odn.a().z(this.b, odmVar.l, str2);
            }
        }
        if (jri.a()) {
            if (odjVarA.B()) {
                ondVar.e("");
            } else {
                ondVar.e(this.b.getString(R.string.error_no_hfp));
            }
        }
        ondVar.b = phoneCall2.e;
        if (phoneCall2.a()) {
            ondVar.c(carCallE.f.d);
        }
        ondVar.f(phoneCall2.a());
        Uri uriF = mcd.A().f(carCallE);
        if (uriF != null) {
            ondVar.d = uriF;
        } else {
            one oneVar = this.g;
            if ((oneVar.i == null && oneVar.j == null) || !Objects.equals(phoneCall2, phoneCall)) {
                Bitmap bitmap = phoneCall2.h;
                if (bitmap != null) {
                    ((ype) yphVar.l().ai((char) 5940)).u("Loading contact bitmap from call icon.");
                    ondVar.c = bitmap;
                } else {
                    ((ype) yphVar.l().ai((char) 5939)).u("Loading contact bitmap from contact photo model.");
                    ondVar.d = jxn.c().b(phoneCall2.d, str);
                }
            }
        }
        one oneVarA = ondVar.a();
        this.g = oneVarA;
        this.f.b(oneVarA);
    }
}
