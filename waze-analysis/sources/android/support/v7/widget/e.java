package android.support.v7.widget;

import android.view.ViewParent;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Object f1383a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f1384b;

    e(Object obj, int i2) {
        this.f1384b = i2;
        this.f1383a = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1384b) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f1383a;
                actionBarOverlayLayout.b();
                actionBarOverlayLayout.f884d = actionBarOverlayLayout.f882b.animate().translationY(-actionBarOverlayLayout.f882b.getHeight()).setListener(actionBarOverlayLayout.f885e);
                break;
            case 1:
                ActionBarOverlayLayout actionBarOverlayLayout2 = (ActionBarOverlayLayout) this.f1383a;
                actionBarOverlayLayout2.b();
                actionBarOverlayLayout2.f884d = actionBarOverlayLayout2.f882b.animate().translationY(0.0f).setListener(actionBarOverlayLayout2.f885e);
                break;
            case 2:
                ViewParent parent = ((cr) this.f1383a).f1272c.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    break;
                }
                break;
            case 3:
                ((cr) this.f1383a).d();
                break;
            case 4:
                ((dm) this.f1383a).x();
                break;
            case 5:
                dm dmVar = (dm) this.f1383a;
                cl clVar = dmVar.f1353c;
                if (clVar != null && clVar.isAttachedToWindow() && dmVar.f1353c.getCount() > dmVar.f1353c.getChildCount() && dmVar.f1353c.getChildCount() <= dmVar.f1354d) {
                    dmVar.f1356f.setInputMethodMode(2);
                    dmVar.s();
                    break;
                }
                break;
            case 6:
                RecyclerView recyclerView = (RecyclerView) this.f1383a;
                if (recyclerView.s && !recyclerView.isLayoutRequested()) {
                    if (!recyclerView.q) {
                        recyclerView.requestLayout();
                        break;
                    } else if (!recyclerView.u) {
                        recyclerView.H();
                        break;
                    } else {
                        recyclerView.t = true;
                        break;
                    }
                }
                break;
            case 7:
                RecyclerView recyclerView2 = (RecyclerView) this.f1383a;
                eh ehVar = recyclerView2.y;
                if (ehVar != null) {
                    ehVar.k();
                }
                recyclerView2.H = false;
                break;
            case 8:
                ((StaggeredGridLayoutManager) this.f1383a).K();
                break;
            default:
                ((Toolbar) this.f1383a).B();
                break;
        }
    }
}
