package p;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;
import o.InterfaceC3621b;

/* loaded from: classes.dex */
public final class o extends FrameLayout implements InterfaceC3621b {

    /* renamed from: a, reason: collision with root package name */
    public final CollapsibleActionView f43097a;

    /* JADX WARN: Multi-variable type inference failed */
    public o(View view) {
        super(view.getContext());
        this.f43097a = (CollapsibleActionView) view;
        addView(view);
    }

    @Override // o.InterfaceC3621b
    public final void b() {
        this.f43097a.onActionViewExpanded();
    }

    @Override // o.InterfaceC3621b
    public final void e() {
        this.f43097a.onActionViewCollapsed();
    }
}
