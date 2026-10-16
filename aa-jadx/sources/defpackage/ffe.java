package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class ffe extends android.widget.FrameLayout {
    public final android.view.ViewGroup a;
    public boolean b;

    public ffe(android.view.ViewGroup viewGroup) {
        super(viewGroup.getContext());
        setClipChildren(false);
        this.a = viewGroup;
        viewGroup.setTag(com.google.android.projection.gearhead.R.id.ghost_view_holder, this);
        defpackage.ebt.i(viewGroup, this);
        this.b = true;
    }

    public static void a(android.view.View view, java.util.ArrayList arrayList) {
        java.lang.Object parent = view.getParent();
        if (parent instanceof android.view.ViewGroup) {
            a((android.view.View) parent, arrayList);
        }
        arrayList.add(view);
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(android.view.View view) {
        if (!this.b) {
            throw new java.lang.IllegalStateException("This GhostViewHolder is detached!");
        }
        super.onViewAdded(view);
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(android.view.View view) {
        super.onViewRemoved(view);
        if ((getChildCount() == 1 && getChildAt(0) == view) || getChildCount() == 0) {
            android.view.ViewGroup viewGroup = this.a;
            viewGroup.setTag(com.google.android.projection.gearhead.R.id.ghost_view_holder, null);
            viewGroup.getOverlay().remove(this);
            this.b = false;
        }
    }
}
