package A;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.InterfaceC1457v;
import java.util.WeakHashMap;
import kotlin.jvm.internal.AbstractC3340k;
import u0.ComponentCallbacks2C4201y;

/* loaded from: classes.dex */
public final class V implements N.B {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f89a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f90b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f91c;

    public /* synthetic */ V(int i5, Object obj, Object obj2) {
        this.f89a = i5;
        this.f90b = obj;
        this.f91c = obj2;
    }

    @Override // N.B
    public final void dispose() {
        Object obj = this.f91c;
        Object obj2 = this.f90b;
        switch (this.f89a) {
            case 0:
                U u10 = (U) obj2;
                u10.getClass();
                U transition = (U) obj;
                AbstractC3340k.e(transition, "transition");
                u10.f87i.remove(transition);
                break;
            case 1:
                U u11 = (U) obj2;
                M deferredAnimation = (M) obj;
                AbstractC3340k.e(deferredAnimation, "deferredAnimation");
                S3.i iVar = deferredAnimation.f55c;
                if (iVar != null) {
                    u11.f86h.remove((O) iVar.f10961a);
                    break;
                }
                break;
            case 2:
                O animation = (O) obj;
                AbstractC3340k.e(animation, "animation");
                ((U) obj2).f86h.remove(animation);
                break;
            case 3:
                E.S s10 = (E.S) obj2;
                s10.getClass();
                View view = (View) obj;
                AbstractC3340k.e(view, "view");
                int i5 = s10.f2729q - 1;
                s10.f2729q = i5;
                if (i5 == 0) {
                    WeakHashMap weakHashMap = k1.S.f38779a;
                    k1.J.l(view, null);
                    k1.S.o(view, null);
                    view.removeOnAttachStateChangeListener(s10.f2730r);
                    break;
                }
                break;
            case 4:
                ((G.e) obj2).f4129a.k((G.g) obj);
                break;
            case 5:
                ((InterfaceC1457v) obj2).getLifecycle().c((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.g) obj);
                break;
            case 6:
                ((InterfaceC1457v) obj2).getLifecycle().c((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.g) obj);
                break;
            default:
                ((Context) obj2).getApplicationContext().unregisterComponentCallbacks((ComponentCallbacks2C4201y) obj);
                break;
        }
    }
}
