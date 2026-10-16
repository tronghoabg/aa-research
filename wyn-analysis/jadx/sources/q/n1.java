package q;

import android.content.Context;
import android.view.View;
import android.view.Window;
import p.C3750a;

/* loaded from: classes.dex */
public final class n1 implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final C3750a f43842a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o1 f43843b;

    public n1(o1 o1Var) {
        this.f43843b = o1Var;
        Context context = o1Var.f43850a.getContext();
        CharSequence charSequence = o1Var.f43857h;
        C3750a c3750a = new C3750a();
        c3750a.f42985e = 4096;
        c3750a.f42987g = 4096;
        c3750a.f42991l = null;
        c3750a.f42992m = null;
        c3750a.f42993n = false;
        c3750a.f42994o = false;
        c3750a.f42995p = 16;
        c3750a.f42989i = context;
        c3750a.f42981a = charSequence;
        this.f43842a = c3750a;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        o1 o1Var = this.f43843b;
        Window.Callback callback = o1Var.k;
        if (callback == null || !o1Var.f43860l) {
            return;
        }
        callback.onMenuItemSelected(0, this.f43842a);
    }
}
