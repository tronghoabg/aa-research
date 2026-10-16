package defpackage;

import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.Window;

/* loaded from: classes.dex */
public final /* synthetic */ class ap implements Runnable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ap(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                ((Fragment) this.a).m106lambda$performAttach$2$androidsupportv4appFragment();
                return;
            case 1:
                ao aoVar = (ao) this.a;
                aoVar.a.onDismiss(aoVar.e);
                return;
            case 2:
                ((Fragment) this.a).onStart();
                return;
            case 3:
                ((Fragment) this.a).m119lambda$performStart$9$androidsupportv4appFragment();
                return;
            case 4:
                ((Fragment) this.a).m118lambda$performStart$10$androidsupportv4appFragment();
                return;
            case 5:
                ((Fragment) this.a).m109lambda$performCreateView$5$androidsupportv4appFragment();
                return;
            case 6:
                ((Fragment) this.a).onResume();
                return;
            case 7:
                ((Fragment) this.a).m115lambda$performResume$11$androidsupportv4appFragment();
                return;
            case 8:
                ((Fragment) this.a).m116lambda$performResume$12$androidsupportv4appFragment();
                return;
            case 9:
                ((Fragment) this.a).m124lambda$restoreViewState$1$androidsupportv4appFragment();
                return;
            case 10:
                ((Fragment) this.a).m113lambda$performPause$14$androidsupportv4appFragment();
                return;
            case 11:
                ((Fragment) this.a).m114lambda$performPause$15$androidsupportv4appFragment();
                return;
            case 12:
                ((Fragment) this.a).onPause();
                return;
            case 13:
                ((Fragment) this.a).m108lambda$performCreate$4$androidsupportv4appFragment();
                return;
            case 14:
                ((Fragment) this.a).startPostponedEnterTransition();
                return;
            case 15:
                ((bt) this.a).an(true);
                return;
            case 16:
                fe feVar = (fe) this.a;
                if ((feVar.G & 1) != 0) {
                    feVar.F(0);
                }
                if ((feVar.G & 4096) != 0) {
                    feVar.F(108);
                }
                feVar.F = false;
                feVar.G = 0;
                return;
            case 17:
                Object obj = this.a;
                Menu menuV = ((fl) obj).v();
                Menu menu = true != (menuV instanceof hg) ? null : menuV;
                if (menu != null) {
                    ((hg) menu).s();
                }
                try {
                    menuV.clear();
                    Window.Callback callback = ((fl) obj).a;
                    if (!callback.onCreatePanelMenu(0, menuV) || !callback.onPreparePanel(0, null, menuV)) {
                        menuV.clear();
                    }
                    if (menu != null) {
                        ((hg) menu).r();
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    if (menu != null) {
                        ((hg) menu).r();
                    }
                    throw th;
                }
            case 18:
                ((RecyclerView) this.a).t = false;
                return;
            case 19:
                RecyclerView recyclerView = (RecyclerView) this.a;
                if (!recyclerView.s || recyclerView.isLayoutRequested()) {
                    return;
                }
                if (!recyclerView.q) {
                    recyclerView.requestLayout();
                    return;
                } else if (recyclerView.v) {
                    recyclerView.u = true;
                    return;
                } else {
                    recyclerView.z();
                    return;
                }
            default:
                RecyclerView recyclerView2 = (RecyclerView) this.a;
                lw lwVar = recyclerView2.E;
                if (lwVar != null) {
                    lwVar.e();
                }
                recyclerView2.Q = false;
                return;
        }
    }

    public ap(Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
