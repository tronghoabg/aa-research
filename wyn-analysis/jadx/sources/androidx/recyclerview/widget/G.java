package androidx.recyclerview.widget;

import android.view.View;

/* loaded from: classes.dex */
public final class G implements z0, N {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f18766a;

    public /* synthetic */ G(RecyclerView recyclerView) {
        this.f18766a = recyclerView;
    }

    public void a(C1462a c1462a) {
        int i5 = c1462a.f18816a;
        RecyclerView recyclerView = this.f18766a;
        if (i5 == 1) {
            recyclerView.mLayout.onItemsAdded(recyclerView, c1462a.f18817b, c1462a.f18819d);
            return;
        }
        if (i5 == 2) {
            recyclerView.mLayout.onItemsRemoved(recyclerView, c1462a.f18817b, c1462a.f18819d);
        } else if (i5 == 4) {
            recyclerView.mLayout.onItemsUpdated(recyclerView, c1462a.f18817b, c1462a.f18819d, c1462a.f18818c);
        } else {
            if (i5 != 8) {
                return;
            }
            recyclerView.mLayout.onItemsMoved(recyclerView, c1462a.f18817b, c1462a.f18819d, 1);
        }
    }

    public void b(int i5) {
        RecyclerView recyclerView = this.f18766a;
        View childAt = recyclerView.getChildAt(i5);
        if (childAt != null) {
            recyclerView.dispatchChildDetached(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i5);
    }
}
