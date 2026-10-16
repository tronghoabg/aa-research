package android.support.v7.view.menu;

import androidx.core.view.ActionProvider;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class s implements ActionProvider.VisibilityListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ t f840a;

    s(t tVar) {
        this.f840a = tVar;
    }

    @Override // androidx.core.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z) {
        this.f840a.f841a.I();
    }
}
