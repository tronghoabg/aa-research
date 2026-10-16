package android.support.v7.view.menu;

import android.content.Context;
import android.view.ActionProvider;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.core.view.ActionProvider;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class u extends ActionProvider implements ActionProvider.VisibilityListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ y f853a;

    /* renamed from: b, reason: collision with root package name */
    private ActionProvider.VisibilityListener f854b;

    /* renamed from: c, reason: collision with root package name */
    private final android.view.ActionProvider f855c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    u(y yVar, Context context, android.view.ActionProvider actionProvider) {
        super(context);
        this.f853a = yVar;
        this.f855c = actionProvider;
    }

    @Override // androidx.core.view.ActionProvider
    public final boolean hasSubMenu() {
        return this.f855c.hasSubMenu();
    }

    @Override // androidx.core.view.ActionProvider
    public final boolean isVisible() {
        return this.f855c.isVisible();
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z) {
        ActionProvider.VisibilityListener visibilityListener = this.f854b;
        if (visibilityListener != null) {
            visibilityListener.onActionProviderVisibilityChanged(z);
        }
    }

    @Override // androidx.core.view.ActionProvider
    public final View onCreateActionView() {
        return this.f855c.onCreateActionView();
    }

    @Override // androidx.core.view.ActionProvider
    public final boolean onPerformDefaultAction() {
        return this.f855c.onPerformDefaultAction();
    }

    @Override // androidx.core.view.ActionProvider
    public final void onPrepareSubMenu(SubMenu subMenu) {
        this.f855c.onPrepareSubMenu(this.f853a.b(subMenu));
    }

    @Override // androidx.core.view.ActionProvider
    public final boolean overridesItemVisibility() {
        return this.f855c.overridesItemVisibility();
    }

    @Override // androidx.core.view.ActionProvider
    public final void refreshVisibility() {
        this.f855c.refreshVisibility();
    }

    @Override // androidx.core.view.ActionProvider
    public final void setVisibilityListener(ActionProvider.VisibilityListener visibilityListener) {
        this.f854b = visibilityListener;
        this.f855c.setVisibilityListener(visibilityListener != null ? this : null);
    }

    @Override // androidx.core.view.ActionProvider
    public final View onCreateActionView(MenuItem menuItem) {
        return this.f855c.onCreateActionView(menuItem);
    }
}
