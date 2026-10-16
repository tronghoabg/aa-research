package B9;

import J9.C0656o;
import android.app.Activity;
import android.view.View;
import z9.EnumC4624C;
import z9.InterfaceC4626E;

/* loaded from: classes4.dex */
public final class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f1614a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f1615b;

    public a(f fVar, Activity activity) {
        this.f1615b = fVar;
        this.f1614a = activity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        f fVar = this.f1615b;
        InterfaceC4626E interfaceC4626E = fVar.k;
        if (interfaceC4626E != null) {
            ((C0656o) interfaceC4626E).f(EnumC4624C.f48423c);
        }
        Activity activity = this.f1614a;
        D9.e.a("Dismissing fiam");
        fVar.e(activity);
        fVar.f1636j = null;
        fVar.k = null;
    }
}
