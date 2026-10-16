package q;

import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.unity3d.services.UnityAdsConstants;

/* renamed from: q.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC3802b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f43740a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActionBarOverlayLayout f43741b;

    public /* synthetic */ RunnableC3802b(ActionBarOverlayLayout actionBarOverlayLayout, int i5) {
        this.f43740a = i5;
        this.f43741b = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f43740a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.f43741b;
                actionBarOverlayLayout.h();
                actionBarOverlayLayout.f17836w = actionBarOverlayLayout.f17818d.animate().translationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setListener(actionBarOverlayLayout.f17837x);
                break;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f43741b;
                actionBarOverlayLayout2.h();
                actionBarOverlayLayout2.f17836w = actionBarOverlayLayout2.f17818d.animate().translationY(-actionBarOverlayLayout2.f17818d.getHeight()).setListener(actionBarOverlayLayout2.f17837x);
                break;
        }
    }
}
