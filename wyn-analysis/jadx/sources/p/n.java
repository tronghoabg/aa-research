package p;

import android.content.Context;
import android.view.ActionProvider;
import android.view.View;

/* loaded from: classes.dex */
public final class n implements ActionProvider.VisibilityListener {

    /* renamed from: a, reason: collision with root package name */
    public final Context f43093a;

    /* renamed from: b, reason: collision with root package name */
    public final ActionProvider f43094b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f43095c;

    /* renamed from: d, reason: collision with root package name */
    public com.google.android.gms.ads.nativead.l f43096d;

    public n(r rVar, Context context, ActionProvider actionProvider) {
        this.f43095c = rVar;
        this.f43093a = context;
        this.f43094b = actionProvider;
    }

    public final View a(m mVar) {
        return this.f43094b.onCreateActionView(mVar);
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z2) {
        com.google.android.gms.ads.nativead.l lVar = this.f43096d;
        if (lVar != null) {
            k kVar = ((m) lVar.f26356b).f43080n;
            kVar.f43046h = true;
            kVar.p(true);
        }
    }
}
