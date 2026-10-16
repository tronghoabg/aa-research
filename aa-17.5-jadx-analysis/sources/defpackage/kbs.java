package defpackage;

import android.animation.AnimatorSet;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;
import androidx.car.app.model.ActionStrip;
import androidx.car.app.navigation.model.NavigationTemplate;
import com.google.android.apps.auto.components.apphost.view.widgets.common.ActionStripView;
import com.google.android.apps.auto.components.apphost.view.widgets.common.BleedingCardView;
import com.google.android.apps.auto.components.apphost.view.widgets.common.ContentModerationWrapperLayout;
import com.google.android.apps.auto.components.apphost.view.widgets.common.InputSignInView;
import com.google.android.apps.auto.components.apphost.view.widgets.common.MaterialSearchHeaderView;

/* loaded from: classes2.dex */
public final /* synthetic */ class kbs implements Runnable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ kbs(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // java.lang.Runnable
    public final void run() throws Resources.NotFoundException, kdb {
        switch (this.b) {
            case 0:
                Object obj = this.a;
                if (((hlf) obj).H()) {
                    kbu kbuVar = (kbu) obj;
                    if (!kbuVar.d.hasMessages(2) && kbuVar.f) {
                        kbuVar.c.requestFocus();
                    }
                }
                kbu kbuVar2 = (kbu) obj;
                kbuVar2.f = kbuVar2.a.c();
                break;
            case 1:
                kbu kbuVar3 = (kbu) this.a;
                MaterialSearchHeaderView materialSearchHeaderView = kbuVar3.b;
                hlf.J(yfq.q(materialSearchHeaderView.a), yfq.r(kbuVar3.c, materialSearchHeaderView), false);
                break;
            case 2:
                Object obj2 = this.a;
                if (((hlf) obj2).H()) {
                    Handler handler = ((kbu) obj2).d;
                    if (!handler.hasMessages(2)) {
                        handler.removeMessages(1);
                        handler.sendMessageDelayed(handler.obtainMessage(1), 200L);
                        break;
                    }
                }
                break;
            case 3:
                Object obj3 = this.a;
                geu geuVar = ((hlf) obj3).i;
                kbu kbuVar4 = (kbu) obj3;
                boolean z = kbuVar4.e;
                geuVar.w();
                boolean zB = jwl.b();
                kbuVar4.e = zB;
                if (z != zB) {
                    kbuVar4.f(!zB);
                    break;
                }
                break;
            case 4:
                Object obj4 = this.a;
                if (((hlf) obj4).H()) {
                    kby kbyVar = (kby) obj4;
                    if (kbyVar.e) {
                        InputSignInView inputSignInView = kbyVar.d;
                        if (inputSignInView.getVisibility() == 0) {
                            inputSignInView.requestFocus();
                        }
                    }
                }
                kby kbyVar2 = (kby) obj4;
                kbyVar2.e = kbyVar2.a.c();
                break;
            case 5:
                Object obj5 = this.a;
                geu geuVar2 = ((hlf) obj5).i;
                kby kbyVar3 = (kby) obj5;
                boolean z2 = kbyVar3.q;
                geuVar2.w();
                boolean zB2 = jwl.b();
                kbyVar3.q = zB2;
                if (z2 != zB2) {
                    kbyVar3.h(!zB2);
                    break;
                }
                break;
            case 6:
                ((kca) this.a).r();
                break;
            case 7:
                new Handler(Looper.getMainLooper()).post(new kbs(this.a, 6));
                break;
            case 8:
                ((kce) this.a).h();
                break;
            case 9:
                ((kcj) this.a).v();
                break;
            case 10:
                Object obj6 = this.a;
                hlf hlfVar = (hlf) obj6;
                NavigationTemplate navigationTemplate = (NavigationTemplate) hlfVar.C();
                ActionStrip actionStrip = navigationTemplate.getActionStrip();
                ghu ghuVar = ghu.b;
                geu geuVar3 = hlfVar.i;
                kcj kcjVar = (kcj) obj6;
                kcjVar.t.b(geuVar3, actionStrip, ghuVar, false, true);
                ActionStrip mapActionStrip = navigationTemplate.getMapActionStrip();
                kcjVar.u.h(geuVar3, mapActionStrip != null ? ((hld) obj6).d.e(geuVar3, mapActionStrip) : null, ghu.c, false, true);
                kcjVar.M();
                break;
            case 11:
                Object obj7 = this.a;
                NavigationTemplate navigationTemplate2 = (NavigationTemplate) ((hlf) obj7).C();
                kcj kcjVar2 = (kcj) obj7;
                kcjVar2.s();
                BleedingCardView bleedingCardView = kcjVar2.g;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) bleedingCardView.getLayoutParams();
                int marginStart = marginLayoutParams.getMarginStart() + marginLayoutParams.width;
                ActionStripView actionStripView = kcjVar2.t;
                int width = kcjVar2.a.a - actionStripView.getWidth();
                if (bleedingCardView.getVisibility() == 0 && actionStripView.getVisibility() == 0 && marginStart > width) {
                    kcjVar2.x(navigationTemplate2.getActionStrip(), true);
                }
                int bottom = actionStripView.getBottom() + 32;
                ActionStripView actionStripView2 = kcjVar2.u;
                int top = actionStripView2.getTop();
                if (actionStripView.getVisibility() == 0 && actionStripView2.getVisibility() == 0 && bottom > top) {
                    kcjVar2.L(navigationTemplate2.getMapActionStrip(), true);
                    break;
                }
                break;
            case 12:
                ((hld) this.a).fb();
                break;
            case 13:
                ((hld) this.a).fb();
                break;
            case 14:
                ((hld) this.a).fb();
                break;
            case 15:
                Object obj8 = this.a;
                ((kcu) obj8).c.h(new kbs(obj8, 12));
                ((hld) obj8).fb();
                break;
            case 16:
                ((hld) this.a).fb();
                break;
            case 17:
                ((hld) this.a).fb();
                break;
            case 18:
                Object obj9 = this.a;
                ((kcu) obj9).c.h(new kbs(obj9, 16));
                ((hld) obj9).fb();
                break;
            case 19:
                yph yphVar = ActionStripView.a;
                ((AnimatorSet) this.a).start();
                break;
            default:
                ((ContentModerationWrapperLayout) this.a).b();
                break;
        }
    }
}
