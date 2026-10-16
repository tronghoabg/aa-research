package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.Fragment;
import android.view.View;
import com.google.android.apps.auto.components.system.facetbar.hotseat.RailHotseatItemView;
import com.google.android.apps.auto.components.system.facetbar.widget.RailWidgetView;
import com.google.android.apps.auto.components.system.statusbar.RailStatusBarFragment;
import com.google.android.apps.auto.components.telecom.dialpad.StandardDialpadView;
import com.google.android.apps.auto.components.turncard.TurnCardFragment;
import com.google.android.apps.auto.components.ui.actionpanel.ExpandingActionPanel;
import com.google.android.apps.auto.components.ui.actionpanel.MaterialInCallViewExpandingActionPanel;
import com.google.android.apps.auto.components.ui.media.MediaPlaybackView;
import com.google.android.material.card.MaterialCardView;
import com.google.android.projection.gearhead.R;
import j$.time.Duration;

/* loaded from: classes2.dex */
public final /* synthetic */ class nmp implements View.OnClickListener {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public nmp(MediaPlaybackView mediaPlaybackView, int i) {
        this.b = i;
        this.a = mediaPlaybackView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        nmj nmjVar = null;
        switch (this.b) {
            case 0:
                yph yphVar = RailHotseatItemView.a;
                ((nmj) this.a).f.invoke();
                return;
            case 1:
                Object obj = this.a;
                niy niyVar = (niy) obj;
                niyVar.a().p(niyVar.e, niyVar.f, ((Fragment) obj).requireContext(), true);
                return;
            case 2:
                yph yphVar2 = RailHotseatItemView.a;
                ((nmj) this.a).f.invoke();
                return;
            case 3:
                nmj nmjVar2 = ((RailHotseatItemView) this.a).e;
                if (nmjVar2 == null) {
                    affa.d("currentHotseatItem");
                } else {
                    nmjVar = nmjVar2;
                }
                nmjVar.f.invoke();
                return;
            case 4:
                Duration duration = RailWidgetView.a;
                ((nnk) this.a).b.invoke();
                return;
            case 5:
                Duration duration2 = RailWidgetView.a;
                ((nnl) this.a).n.invoke();
                return;
            case 6:
                Duration duration3 = RailWidgetView.a;
                ((nnl) this.a).b.b.invoke();
                return;
            case 7:
                Duration duration4 = RailWidgetView.a;
                nnk nnkVar = ((nnl) this.a).c;
                nnkVar.getClass();
                nnkVar.b.invoke();
                return;
            case 8:
                Context context = ((View) this.a).getContext();
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://search?q=navigation"));
                intent.setPackage("com.android.vending");
                intent.addFlags(268435456);
                mfe.a();
                mfe.c(context, intent, context.getString(R.string.navigation_fallback_play_store_activity_name), yzz.SYSTEM_UI);
                return;
            case 9:
                nwf nwfVar = (nwf) this.a;
                nwr nwrVar = nwfVar.c;
                if (nwrVar.c) {
                    mcd.J(nwrVar, yzy.nZ);
                    nwfVar.c.g.run();
                    return;
                }
                return;
            case 10:
                yph yphVar3 = RailStatusBarFragment.b;
                ((MaterialCardView) this.a).performClick();
                return;
            case 11:
                ((RailStatusBarFragment) this.a).f().f();
                return;
            case 12:
                ebf.j().F(odn.a().k(yzz.PHONE_DIALPAD, yzy.O).l());
                StandardDialpadView standardDialpadView = (StandardDialpadView) this.a;
                if (standardDialpadView.e.length() > 0) {
                    standardDialpadView.e.deleteCharAt(r5.length() - 1);
                    standardDialpadView.e();
                    return;
                }
                return;
            case 13:
                StandardDialpadView standardDialpadView2 = (StandardDialpadView) this.a;
                if (standardDialpadView2.e.length() == 0) {
                    obs.a().f(standardDialpadView2.getContext(), mkn.b, R.string.dial_a_number, 0);
                    return;
                }
                ((ype) StandardDialpadView.a.l().ai(5595)).y("Calling %s", standardDialpadView2.e);
                ohs ohsVarJ = ebf.j();
                yxy yxyVar = yxy.GEARHEAD;
                yzz yzzVar = yzz.PHONE_DIALPAD;
                ohsVarJ.F(rrc.h(yxyVar, yzzVar, yzy.Q).l());
                if (standardDialpadView2.e.toString().equals(null)) {
                    ohsVarJ.o(yzzVar, yzy.Y);
                }
                ebf.A().p(standardDialpadView2.e.toString());
                return;
            case 14:
                yph yphVar4 = TurnCardFragment.a;
                ComponentName componentName = (ComponentName) ((ole) this.a).i.e();
                if (componentName == null) {
                    ((ype) ((ype) TurnCardFragment.a.h()).ai((char) 5992)).u("Can't start navigation on primary display as navigation component is null");
                    return;
                } else {
                    ((mpk) msd.a().i().i(mpk.class)).a(new Intent().setComponent(componentName));
                    return;
                }
            case 15:
                yph yphVar5 = ExpandingActionPanel.a;
                ((View) this.a).performClick();
                return;
            case 16:
                ExpandingActionPanel expandingActionPanel = (ExpandingActionPanel) this.a;
                expandingActionPanel.b(!expandingActionPanel.c);
                boolean z = expandingActionPanel.c;
                woy.N(expandingActionPanel.e != yzz.UNKNOWN_CONTEXT);
                rrb rrbVarH = rrc.h(yxy.GEARHEAD, expandingActionPanel.e, z ? yzy.h : yzy.i);
                ComponentName componentName2 = expandingActionPanel.f;
                if (componentName2 != null) {
                    rrbVarH.p(componentName2);
                }
                ebf.j().F(rrbVarH.l());
                return;
            case 17:
                yph yphVar6 = ExpandingActionPanel.a;
                ((View) this.a).performClick();
                return;
            case 18:
                int i = MaterialInCallViewExpandingActionPanel.n;
                ((View) this.a).performClick();
                return;
            case 19:
                MaterialInCallViewExpandingActionPanel materialInCallViewExpandingActionPanel = (MaterialInCallViewExpandingActionPanel) this.a;
                materialInCallViewExpandingActionPanel.a(!materialInCallViewExpandingActionPanel.b);
                boolean z2 = materialInCallViewExpandingActionPanel.b;
                woy.N(materialInCallViewExpandingActionPanel.d != yzz.UNKNOWN_CONTEXT);
                ebf.j().F(rrc.h(yxy.GEARHEAD, materialInCallViewExpandingActionPanel.d, z2 ? yzy.h : yzy.i).l());
                return;
            default:
                MediaPlaybackView mediaPlaybackView = (MediaPlaybackView) this.a;
                if (!mediaPlaybackView.e.j(mediaPlaybackView.d)) {
                    ((ype) ((ype) MediaPlaybackView.a.g()).ai((char) 6020)).y("Unable to send action for %s. The MediaModel is not connected.", view);
                    return;
                }
                if ((view.getTag() instanceof omh) && ((omh) view.getTag()).c != null) {
                    mediaPlaybackView.e.e(mediaPlaybackView.d, yzz.MEDIA_FACET, ((omh) view.getTag()).c);
                    return;
                }
                if (view == mediaPlaybackView.j) {
                    mediaPlaybackView.e.g(mediaPlaybackView.d, yzz.MEDIA_FACET);
                    return;
                } else if (view == mediaPlaybackView.k) {
                    mediaPlaybackView.e.h(mediaPlaybackView.d, yzz.MEDIA_FACET);
                    return;
                } else {
                    if (view != mediaPlaybackView.n) {
                        throw new IllegalStateException("Unknown button press: ".concat(String.valueOf(String.valueOf(view))));
                    }
                    mediaPlaybackView.e.f(mediaPlaybackView.d, yzz.MEDIA_FACET);
                    return;
                }
        }
    }

    public /* synthetic */ nmp(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }
}
