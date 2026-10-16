package defpackage;

import android.support.v7.widget.RecyclerView;
import android.widget.FrameLayout;
import com.google.android.apps.auto.components.apphost.view.widgets.common.RowListView;

/* loaded from: classes2.dex */
public final class ked extends osq {
    final /* synthetic */ RowListView a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ked(RowListView rowListView) {
        super(null);
        this.a = rowListView;
    }

    @Override // defpackage.osq
    public final void b(RecyclerView recyclerView, int i, int i2) {
        RowListView rowListView = this.a;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) rowListView.e.getLayoutParams();
        layoutParams.topMargin -= i2;
        rowListView.e.setLayoutParams(layoutParams);
    }
}
