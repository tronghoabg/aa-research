package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RemoteViews;
import com.google.android.apps.auto.sdk.MenuItem;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final class qft extends qgr {
    final ViewGroup s;

    public qft(View view) {
        super(view);
        this.s = (ViewGroup) view.findViewById(R.id.remote_views);
    }

    @Override // defpackage.qgr
    public final void E(MenuItem menuItem, Context context, Context context2) {
        super.E(menuItem, context, context2);
        ViewGroup viewGroup = this.s;
        viewGroup.removeAllViews();
        RemoteViews remoteViews = menuItem.n;
        if (remoteViews == null) {
            return;
        }
        viewGroup.setVisibility(0);
        viewGroup.addView(remoteViews.apply(viewGroup.getContext(), viewGroup));
    }
}
