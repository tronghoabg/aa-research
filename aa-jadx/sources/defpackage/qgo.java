package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qgo extends defpackage.qhm {
    final android.view.ViewGroup s;

    public qgo(android.view.View view) {
        super(view);
        this.s = (android.view.ViewGroup) view.findViewById(com.google.android.projection.gearhead.R.id.remote_views);
    }

    @Override // defpackage.qhm
    public final void E(com.google.android.apps.auto.sdk.MenuItem menuItem, android.content.Context context, android.content.Context context2) {
        super.E(menuItem, context, context2);
        android.view.ViewGroup viewGroup = this.s;
        viewGroup.removeAllViews();
        android.widget.RemoteViews remoteViews = menuItem.n;
        if (remoteViews == null) {
            return;
        }
        viewGroup.setVisibility(0);
        viewGroup.addView(remoteViews.apply(viewGroup.getContext(), viewGroup));
    }
}
