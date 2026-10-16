package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.content.ComponentName;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.os.RemoteException;
import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.auto.components.turncard.TurnCardFragment;
import com.google.android.apps.auto.components.ui.speedbump.SpeedbumpView;
import com.google.android.apps.auto.components.ui.widget.navigation.DetailedNavigationStepView;
import com.google.android.gearhead.demand.DemandClientService;
import com.google.android.gms.car.animation.ProjectionWindowAnimationParams;
import com.google.android.projection.gearhead.R;
import com.google.android.projection.gearhead.companion.settings.LauncherAppSettingsActivity;
import j$.util.Optional;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class ntw implements eqn {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ntw(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.eqn
    public final void eS(Object obj) {
        Optional optional;
        ComponentName componentNameA = null;
        switch (this.b) {
            case 0:
                ygp ygpVar = new ygp();
                for (nuh nuhVar : (yfq) obj) {
                    nur nurVar = nuhVar.c;
                    mqa mqaVar = nurVar.C ? mqa.a : mqa.b;
                    ComponentName componentName = nurVar.B;
                    ntx ntxVarA = componentName != null ? ntx.a(componentName, mqaVar) : new ntx(null, nurVar.f, mqaVar);
                    nue nueVar = nuhVar.i;
                    yzy yzyVar = yzy.oD;
                    if (nueVar.equals(nue.a) && nuhVar.f()) {
                        ygpVar.c(ntxVarA);
                        yzyVar = yzy.oC;
                    }
                    ohu ohuVarA = ohu.a();
                    rrb rrbVarH = rrc.h(yxy.GEARHEAD, yzz.SYSTEM_UI_NOTIFICATION, yzyVar);
                    rrbVarH.p((ComponentName) new ntn(ntxVarA.a).i(new ComponentName(ntxVarA.b, "")));
                    ohuVarA.b((rrc) rrbVarH.l());
                }
                Object obj2 = this.a;
                ygr ygrVarG = ygpVar.g();
                ((ype) nty.a.l().ai((char) 5458)).y("Setting badgeable packages to %s", ygrVarG);
                ((eqj) obj2).m(ygrVarG);
                return;
            case 1:
                krz krzVar = (krz) obj;
                yph yphVar = ntc.a;
                View view = (View) this.a;
                Context context = view.getContext();
                view.setBackgroundColor(krr.q.b(context, krzVar));
                ImageView imageView = (ImageView) view.findViewById(R.id.error_icon);
                if (imageView != null) {
                    imageView.setImageTintList(ColorStateList.valueOf(krr.w.b(context, krzVar)));
                }
                TextView textView = (TextView) view.findViewById(R.id.error_text);
                if (textView != null) {
                    textView.setTextColor(krr.s.b(context, krzVar));
                    return;
                }
                return;
            case 2:
                nxm.a.l().u("Closing due to CarActivity changing.");
                ((nwz) this.a).b().d();
                return;
            case 3:
                TurnCardFragment turnCardFragment = (TurnCardFragment) this.a;
                turnCardFragment.c.b((String) obj);
                turnCardFragment.b();
                return;
            case 4:
                TurnCardFragment turnCardFragment2 = (TurnCardFragment) this.a;
                turnCardFragment2.c.a((String) obj);
                turnCardFragment2.b();
                return;
            case 5:
                int iIntValue = ((Integer) obj).intValue();
                TurnCardFragment turnCardFragment3 = (TurnCardFragment) this.a;
                turnCardFragment3.e = iIntValue;
                if (iIntValue == 2 || iIntValue == 4 || iIntValue == 0) {
                    turnCardFragment3.a();
                    return;
                } else {
                    turnCardFragment3.b();
                    return;
                }
            case 6:
                TurnCardFragment turnCardFragment4 = (TurnCardFragment) this.a;
                turnCardFragment4.d.a((String) obj);
                turnCardFragment4.b();
                return;
            case 7:
                TurnCardFragment turnCardFragment5 = (TurnCardFragment) this.a;
                turnCardFragment5.d.b((String) obj);
                turnCardFragment5.b();
                return;
            case 8:
                old oldVar = (old) obj;
                Object obj3 = this.a;
                if (oldVar != null) {
                    byte[] bArr = oldVar.b;
                    if (bArr != null) {
                        ((TurnCardFragment) obj3).c.c(new BitmapDrawable(((Fragment) obj3).getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length)));
                    } else {
                        DetailedNavigationStepView detailedNavigationStepView = ((TurnCardFragment) obj3).c;
                        int i = oldVar.a;
                        boolean z = oldVar.c;
                        detailedNavigationStepView.a.setImageResource(i);
                        detailedNavigationStepView.a.setScaleX(true != z ? 1.0f : -1.0f);
                        detailedNavigationStepView.a.setVisibility(0);
                    }
                } else {
                    ((TurnCardFragment) obj3).c.c(null);
                }
                ((TurnCardFragment) obj3).b();
                return;
            case 9:
                ((SpeedbumpView) this.a).e = true;
                return;
            case 10:
                ((oqx) this.a).u((Optional) obj);
                return;
            case 11:
                Optional optional2 = (Optional) obj;
                mla mlaVar = new mla(this.a, i);
                if (true != optional2.isPresent()) {
                    return;
                }
                Object obj4 = optional2.get();
                Object obj5 = mlaVar.a;
                if (oqx.a.contains(((oct) obj4).a)) {
                    oqx oqxVar = (oqx) obj5;
                    oqxVar.u(oqxVar.b());
                    return;
                }
                return;
            case 12:
                ((eqj) this.a).j((yfs) obj);
                return;
            case 13:
                Optional optional3 = (Optional) obj;
                mla mlaVar2 = new mla(this.a, 8);
                if (true != optional3.isPresent()) {
                    return;
                }
                Object obj6 = optional3.get();
                Object obj7 = mlaVar2.a;
                if (oqy.a.contains(((oct) obj6).a)) {
                    ((eqj) obj7).j(((oqy) obj7).a());
                    return;
                }
                return;
            case 14:
                int iIntValue2 = ((Integer) obj).intValue();
                Object obj8 = this.a;
                int i2 = 12;
                if (iIntValue2 != 12) {
                    if (iIntValue2 == 10) {
                        int i3 = oqi.i;
                        ((eqj) obj8).m(Optional.ofNullable(new oqh()));
                        return;
                    }
                    return;
                }
                synchronized (((oqz) obj8).a) {
                    if (((oqz) obj8).h.isPresent()) {
                        Object obj9 = ((oqz) obj8).h.get();
                        synchronized (obj9) {
                            optional = ((oqi) obj9).e;
                        }
                        ((eqj) obj8).m(optional);
                        return;
                    }
                    Context context2 = ((oqz) obj8).i;
                    int i4 = ((oqz) obj8).j;
                    oqi oqiVar = new oqi(BluetoothAdapter.getDefaultAdapter(), new kok(obj8, 14), new oez(obj8, i2));
                    synchronized (oqiVar) {
                        oqiVar.f = i4;
                        oqiVar.h.postDelayed(oqiVar.g, 1000L);
                        oqiVar.b.getProfileProxy(context2, oqiVar, i4);
                    }
                    ((oqz) obj8).h = Optional.of(oqiVar);
                    return;
                }
            case 15:
                mqc mqcVar = (mqc) obj;
                Object obj10 = this.a;
                if (mqcVar == null || !mkn.e.equals(mqcVar.a())) {
                    if (mqcVar != null) {
                        oxs oxsVar = (oxs) obj10;
                        if (oxsVar.d == null) {
                            oxsVar.h(true);
                        }
                    }
                    if (mqcVar == null) {
                        oxs oxsVar2 = (oxs) obj10;
                        if (oxsVar2.d != null) {
                            oxsVar2.h(false);
                            if (lea.a().f()) {
                                mua.a().q();
                            }
                        }
                    }
                    if (mqcVar != null) {
                        componentNameA = mqcVar.a();
                    }
                }
                ((oxs) obj10).d = componentNameA;
                return;
            case 16:
                Boolean bool = (Boolean) obj;
                boolean zBooleanValue = bool.booleanValue();
                if (acxa.aK()) {
                    ((ype) ((ype) oxs.a.f()).ai((char) 6129)).y("Stopping immersives due to notification center state change: %b", bool);
                    nqd.a().h();
                }
                if (nsr.c().b().m() != nsv.e) {
                    return;
                }
                Object obj11 = this.a;
                if (zBooleanValue) {
                    oxs oxsVar3 = (oxs) obj11;
                    oxsVar3.g = mua.a().t();
                    ((ype) oxs.a.l().ai((char) 6128)).y("Notification Center opened, hiding dashboard with restore: %s", Boolean.valueOf(oxsVar3.g));
                    mmc.c();
                    if (mmc.h()) {
                        mua.a().h(true, new ProjectionWindowAnimationParams(R.anim.dashboard_fade_out, false, null, 0));
                        return;
                    } else {
                        mua.a().g(true);
                        return;
                    }
                }
                if (!oxs.k() && ((oxs) obj11).g) {
                    ((ype) oxs.a.l().ai((char) 6127)).u("Showing dashboard due to NC closing");
                    mmc.c();
                    if (mmc.h()) {
                        mua.a().p(true, new ProjectionWindowAnimationParams(R.anim.dashboard_fade_in, false, null, 0));
                    } else {
                        mua.a().n();
                    }
                }
                ((oxs) obj11).g = false;
                return;
            case 17:
                oxu oxuVar = (oxu) this.a;
                oxuVar.j(oxuVar.h(), oxuVar.g());
                return;
            case 18:
                Integer num = (Integer) obj;
                if (num != null) {
                    Iterator it = ((DemandClientService) this.a).d.values().iterator();
                    while (it.hasNext()) {
                        try {
                            ((qhs) it.next()).a.e(num.intValue());
                        } catch (RemoteException e) {
                            ((ype) ((ype) ((ype) DemandClientService.a.h()).p(e)).ai((char) 7266)).y("remote exception reporting state %d", num);
                        }
                    }
                    return;
                }
                return;
            case 19:
                ser serVar = (ser) obj;
                int i5 = serVar.a;
                float f = serVar.b * 100.0f;
                Object obj12 = this.a;
                if (i5 == 1) {
                    sfd sfdVar = (sfd) obj12;
                    sfdVar.i.g.L(yzz.FRX_PRESETUP_INTRO_DOWNLOAD, yzy.bQ);
                    sfdVar.h.g.l(((Fragment) obj12).getViewLifecycleOwner());
                    sga sgaVar = sfdVar.i;
                    sgaVar.h(sgaVar.d == 2 ? 11 : 7);
                    return;
                }
                if (i5 == 4) {
                    sfd sfdVar2 = (sfd) obj12;
                    sfdVar2.g.setIndeterminate(false);
                    sfdVar2.g.setProgress((int) f);
                    return;
                } else {
                    if (i5 != 5) {
                        ((sfd) obj12).g.setIndeterminate(true);
                        return;
                    }
                    sfd sfdVar3 = (sfd) obj12;
                    sfdVar3.i.g.L(yzz.FRX_PRESETUP_INTRO_DOWNLOAD, yzy.bU);
                    sfdVar3.h.g.l(((Fragment) obj12).getViewLifecycleOwner());
                    sfdVar3.i.h(5);
                    return;
                }
            default:
                List<mqz> list = (List) obj;
                xai xaiVar = ((LauncherAppSettingsActivity) this.a).q;
                if (acsi.e()) {
                    xaiVar.m = new xad();
                }
                List list2 = xaiVar.e;
                yfq yfqVarO = yfq.o(list2);
                List list3 = xaiVar.f;
                list3.clear();
                List list4 = xaiVar.g;
                list4.clear();
                xaiVar.k = new xag();
                xaiVar.l = new xah();
                for (mqz mqzVar : list) {
                    if (nrz.e().h(mqzVar.c.a())) {
                        list3.add(mqzVar);
                    } else {
                        list4.add(mqzVar);
                    }
                }
                xaiVar.v();
                gi.a(new xaj(yfqVarO, list2)).a(new gb(xaiVar));
                return;
        }
    }
}
