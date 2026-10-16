package android.support.v7.view.menu;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class v extends FrameLayout implements android.support.v7.view.c {

    /* renamed from: a, reason: collision with root package name */
    final CollapsibleActionView f856a;

    /* JADX WARN: Multi-variable type inference failed */
    v(View view) {
        super(view.getContext());
        this.f856a = (CollapsibleActionView) view;
        addView(view);
    }

    @Override // android.support.v7.view.c
    public final void a() {
        this.f856a.onActionViewCollapsed();
    }

    @Override // android.support.v7.view.c
    public final void b() {
        this.f856a.onActionViewExpanded();
    }
}
