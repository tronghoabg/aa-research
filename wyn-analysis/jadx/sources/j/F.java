package j;

import U8.v0;
import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.unity3d.services.UnityAdsConstants;
import java.util.WeakHashMap;
import k1.S;

/* loaded from: classes.dex */
public final class F extends v0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38377a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ H f38378b;

    public /* synthetic */ F(H h10, int i5) {
        this.f38377a = i5;
        this.f38378b = h10;
    }

    @Override // k1.Y
    public final void e() {
        View view;
        H h10 = this.f38378b;
        switch (this.f38377a) {
            case 0:
                if (h10.f38403t && (view = h10.f38395l) != null) {
                    view.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    h10.f38393i.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                }
                h10.f38393i.setVisibility(8);
                h10.f38393i.setTransitioning(false);
                h10.f38407x = null;
                Y2.B b5 = h10.f38399p;
                if (b5 != null) {
                    b5.w(h10.f38398o);
                    h10.f38398o = null;
                    h10.f38399p = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = h10.f38392h;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = S.f38779a;
                    k1.H.c(actionBarOverlayLayout);
                    break;
                }
                break;
            default:
                h10.f38407x = null;
                h10.f38393i.requestLayout();
                break;
        }
    }
}
