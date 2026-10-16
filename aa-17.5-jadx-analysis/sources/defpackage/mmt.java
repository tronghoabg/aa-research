package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.SystemClock;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.auto.components.system.facetbar.hotseat.RailHotseatItemView;
import com.google.android.apps.auto.sdk.nav.state.TurnEvent;
import com.google.android.material.tabs.TabLayout;
import com.google.android.projection.gearhead.R;
import j$.util.Objects;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class mmt implements eqn {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ mmt(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r10v58, types: [aitx, java.lang.Object] */
    @Override // defpackage.eqn
    public final void eS(Object obj) {
        wwg wwgVarC;
        int i = 3;
        RailHotseatItemView railHotseatItemView = null;
        RailHotseatItemView railHotseatItemView2 = null;
        RailHotseatItemView railHotseatItemView3 = null;
        switch (this.b) {
            case 0:
                jez jezVar = (jez) obj;
                Object obj2 = this.a;
                mmu mmuVar = (mmu) obj2;
                if (mmuVar.g != jezVar) {
                    ((ype) mmu.f.l().ai(5085)).M("onSettingChanged(%s -> %s): invalidating", mmuVar.g, jezVar);
                    mmuVar.g = jezVar;
                    qw qwVar = (qw) obj2;
                    qwVar.j();
                    obs.a().f(qwVar.a, mkn.v, R.string.settings_takes_effect_on_restart, 1);
                    break;
                } else {
                    ((ype) mmu.f.l().ai((char) 5086)).y("onSettingChanged(%s): ignoring because unchanged", jezVar);
                    break;
                }
            case 1:
                jey jeyVar = (jey) obj;
                Object obj3 = this.a;
                mmr mmrVar = (mmr) obj3;
                if (mmrVar.g != jeyVar) {
                    ((ype) mmr.f.l().ai(5070)).M("onSettingChanged(%s -> %s): invalidating", mmrVar.g, jeyVar);
                    ((qw) obj3).j();
                    break;
                } else {
                    ((ype) mmr.f.l().ai((char) 5071)).y("onSettingChanged(%s): ignoring because unchanged", jeyVar);
                    break;
                }
            case 2:
                jfe jfeVar = (jfe) obj;
                Object obj4 = this.a;
                mmv mmvVar = (mmv) obj4;
                if (mmvVar.g != jfeVar) {
                    ((ype) mmv.f.l().ai(5089)).M("onSettingChanged(%s -> %s): invalidating", mmvVar.g, jfeVar);
                    qw qwVar2 = (qw) obj4;
                    qwVar2.j();
                    obs.a().f(qwVar2.a, mkn.v, R.string.settings_takes_effect_on_restart, 1);
                    break;
                } else {
                    ((ype) mmv.f.l().ai((char) 5090)).y("onSettingChanged(%s): ignoring because unchanged", jfeVar);
                    break;
                }
            case 3:
                jfb jfbVar = (jfb) obj;
                mme.b();
                jfd jfdVarA = jfd.a(jfbVar, mme.h(kio.b().e()));
                Object obj5 = this.a;
                mmw mmwVar = (mmw) obj5;
                if (jfdVarA != mmwVar.g) {
                    mmwVar.g = jfdVarA;
                    ((ype) mmw.f.l().ai((char) 5091)).M("onAuxiliaryDisplaySettingChanged(%s -> %s): invalidating", jfbVar, jfdVarA);
                    ((qw) obj5).j();
                    break;
                } else {
                    ((ype) mmw.f.l().ai((char) 5092)).y("onAuxiliaryDisplaySettingChanged(%s): ignoring because unchanged", jfbVar);
                    break;
                }
            case 4:
                jfc jfcVar = (jfc) obj;
                mme.b();
                jfd jfdVarA2 = jfd.a(mme.g(kio.b().e()), jfcVar);
                Object obj6 = this.a;
                mmw mmwVar2 = (mmw) obj6;
                if (jfdVarA2 != mmwVar2.g) {
                    mmwVar2.g = jfdVarA2;
                    ((ype) mmw.f.l().ai((char) 5093)).M("onClusterDisplaySettingChanged(%s -> %s): invalidating", jfcVar, jfdVarA2);
                    ((qw) obj6).j();
                    break;
                } else {
                    ((ype) mmw.f.l().ai((char) 5094)).y("onClusterDisplaySettingChanged(%s): ignoring because unchanged", jfdVarA2);
                    break;
                }
            case 5:
                Bitmap bitmap = (Bitmap) obj;
                ((ype) ((ype) mrq.a.f()).ai((char) 5233)).u("Phone wallpaper changed");
                Object obj7 = this.a;
                if (bitmap != null) {
                    Context context = mki.a.c;
                    hsq hsqVarE = hrt.c(context).b().n(iek.a(new omd(context)).B(hty.a)).e(bitmap);
                    mrq mrqVar = (mrq) obj7;
                    if (mrqVar.h == null) {
                        mrqVar.h = new mro(mrqVar);
                    }
                    hsqVarE.q(mrqVar.h);
                    ebf.j().F(rrc.h(yxy.GEARHEAD, yzz.SYSTEM_UI_BACKDROP, yzy.Jv).l());
                    break;
                } else {
                    ((mrq) obj7).b.b(null);
                    break;
                }
            case 6:
                mrn mrnVar = ((mrq) this.a).b.a;
                if (mrnVar != null) {
                    wer.c();
                    mrnVar.b = mrnVar.a();
                    if (mrnVar.a == null) {
                        mrnVar.invalidate();
                        break;
                    }
                }
                break;
            case 7:
                List list = (List) obj;
                mrv mrvVar = (mrv) this.a;
                int iA = mrvVar.b.a();
                ((ype) mrv.a.l().ai(5243)).D("populateTabs activeIndex=%d items=%s", iA, list);
                mrvVar.b.i();
                TabLayout tabLayout = mrvVar.b;
                mru mruVar = mrvVar.d;
                mruVar.getClass();
                tabLayout.j(mruVar);
                mrvVar.c = list;
                int i2 = 0;
                while (i2 < list.size()) {
                    wwg wwgVarD = mrvVar.b.d();
                    wwgVarD.g.setBackground(null);
                    wwgVarD.h = i2;
                    wwi wwiVar = wwgVarD.g;
                    if (wwiVar != null) {
                        wwiVar.setId(i2);
                    }
                    mrvVar.b.f(wwgVarD, i2 == iA);
                    i2++;
                }
                if (mrvVar.b.a() < 0 && (wwgVarC = mrvVar.b.c(0)) != null) {
                    wwgVarC.a();
                }
                TabLayout tabLayout2 = mrvVar.b;
                mru mruVar2 = mrvVar.d;
                mruVar2.getClass();
                tabLayout2.e(mruVar2);
                break;
            case 8:
                TurnEvent turnEvent = (TurnEvent) obj;
                Object obj8 = this.a;
                if (turnEvent == null) {
                    nfs nfsVar = (nfs) obj8;
                    nfsVar.h = -1;
                    nfsVar.g = -1L;
                    nfsVar.f = -1L;
                } else {
                    nfs nfsVar2 = (nfs) obj8;
                    nfsVar2.f = SystemClock.uptimeMillis();
                    if (turnEvent.j()) {
                        nfsVar2.i = 0;
                    } else {
                        int i3 = nfsVar2.i + 1;
                        nfsVar2.i = i3;
                        if (i3 >= 5) {
                            ((ype) ((ype) nfs.a.h()).ai((char) 5258)).u("hit bad updates threshold");
                            nfsVar2.h = -1;
                            nfsVar2.g = -1L;
                        }
                    }
                    if (turnEvent.j()) {
                        int i4 = turnEvent.h;
                        nfsVar2.h = i4;
                        if (i4 <= nfs.c.toSeconds()) {
                            nfsVar2.g = SystemClock.uptimeMillis();
                        }
                    }
                }
                nfs nfsVar3 = (nfs) obj8;
                Handler handler = nfsVar3.l;
                handler.removeMessages(1);
                handler.sendMessage(handler.obtainMessage(1));
                if (nfsVar3.f != -1) {
                    handler.sendMessageAtTime(handler.obtainMessage(1), nfsVar3.f + nfs.b.toMillis());
                }
                if (nfsVar3.g != -1) {
                    handler.sendMessageAtTime(handler.obtainMessage(1), nfsVar3.g + nfs.e.toMillis());
                    break;
                }
                break;
            case 9:
                nmj nmjVar = (nmj) obj;
                nmjVar.getClass();
                RailHotseatItemView railHotseatItemView4 = ((niy) this.a).I;
                if (railHotseatItemView4 == null) {
                    affa.d("hotseatTwo");
                } else {
                    railHotseatItemView = railHotseatItemView4;
                }
                niy.m(railHotseatItemView, nmjVar);
                break;
            case 10:
                nmj nmjVar2 = (nmj) obj;
                nmjVar2.getClass();
                RailHotseatItemView railHotseatItemView5 = ((niy) this.a).J;
                if (railHotseatItemView5 == null) {
                    affa.d("hotseatThree");
                } else {
                    railHotseatItemView3 = railHotseatItemView5;
                }
                niy.m(railHotseatItemView3, nmjVar2);
                break;
            case 11:
                nmj nmjVar3 = (nmj) obj;
                nmjVar3.getClass();
                RailHotseatItemView railHotseatItemView6 = ((niy) this.a).K;
                if (railHotseatItemView6 == null) {
                    affa.d("hotseatFour");
                } else {
                    railHotseatItemView2 = railHotseatItemView6;
                }
                niy.m(railHotseatItemView2, nmjVar3);
                break;
            case 12:
                mqc mqcVar = (mqc) obj;
                if (mqcVar != null) {
                    Object obj9 = this.a;
                    nmt nmtVar = (nmt) obj9;
                    if (!mqcVar.equals(nmtVar.a)) {
                        if (mqcVar.b != mpz.f || kmo.c(acwu.b(), mqcVar.a().flattenToString())) {
                            ((eqj) obj9).m(nmtVar.a);
                            nmtVar.a = mqcVar;
                            break;
                        }
                    }
                }
                break;
            case 13:
                ((nnm) this.a).a((nuh) obj);
                break;
            case 14:
                mqc mqcVar2 = (mqc) obj;
                yph yphVar = nnm.a;
                ype ypeVar = (ype) yphVar.l().ai(5292);
                Object obj10 = this.a;
                nnm nnmVar = (nnm) obj10;
                ypeVar.M("updatePreviousApp: current=%s new=%s", nnmVar.j, mqcVar2);
                nnmVar.j = mqcVar2;
                if (nnmVar.i == null || nnmVar.m || !nnmVar.n) {
                    ((ype) yphVar.l().ai((char) 5293)).u("Using inactive state");
                    ((eqj) obj10).m(nnl.a);
                    break;
                }
                break;
            case 15:
                Boolean bool = (Boolean) obj;
                boolean zBooleanValue = bool.booleanValue();
                ((ype) nnm.a.l().ai((char) 5289)).y("updateDashboardOpenState: %s", bool);
                nnm nnmVar2 = (nnm) this.a;
                nnmVar2.m = zBooleanValue;
                nnmVar2.a(nnmVar2.i);
                break;
            case 16:
                Boolean bool2 = (Boolean) obj;
                boolean zBooleanValue2 = bool2.booleanValue();
                ((ype) nnm.a.l().ai((char) 5288)).y("showRailWidget: %s", bool2);
                nnm nnmVar3 = (nnm) this.a;
                nnmVar3.n = zBooleanValue2;
                nnmVar3.a(nnmVar3.i);
                break;
            case 17:
                kkf kkfVar = (kkf) obj;
                kkfVar.getClass();
                ugn ugnVar = (ugn) this.a;
                ahnc.d(ugnVar.i, null, 0, new nkn(ugnVar, kkfVar, (afck) null, 6), 3);
                break;
            case 18:
                mqc mqcVar3 = (mqc) obj;
                ComponentName componentNameA = mqcVar3 != null ? mqcVar3.a() : null;
                if (!mkn.e.equals(componentNameA)) {
                    nrq nrqVar = (nrq) this.a;
                    ComponentName componentName = nrqVar.c;
                    if (componentName == null || !componentName.equals(componentNameA)) {
                        nrqVar.d = nrqVar.c;
                        nrqVar.c = componentNameA;
                        break;
                    }
                }
                break;
            case 19:
                Object obj11 = this.a;
                Handler handler2 = ((nrx) obj11).f;
                handler2.removeCallbacksAndMessages(null);
                if (!Objects.equals((Boolean) obj, true)) {
                    handler2.postDelayed(new nqw(obj11, i), nrx.b.toMillis());
                    break;
                } else {
                    handler2.postDelayed(new nqw(obj11, 2), nrx.b.toMillis());
                    break;
                }
            default:
                krz krzVar = (krz) obj;
                View view = (View) this.a;
                Context context2 = view.getContext();
                view.setBackgroundColor(krr.q.b(context2, krzVar));
                TextView textView = (TextView) view.findViewById(R.id.error_title);
                if (textView != null) {
                    textView.setTextColor(krr.s.b(context2, krzVar));
                }
                TextView textView2 = (TextView) view.findViewById(R.id.error_subtitle);
                if (textView2 != null) {
                    textView2.setTextColor(krr.w.b(context2, krzVar));
                    break;
                }
                break;
        }
    }
}
