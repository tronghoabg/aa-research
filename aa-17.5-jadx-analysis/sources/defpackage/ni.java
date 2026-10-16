package defpackage;

import android.view.View;
import android.view.Window;

/* loaded from: classes.dex */
final class ni implements View.OnClickListener {
    final gv a;
    final /* synthetic */ nk b;

    public ni(nk nkVar) {
        this.b = nkVar;
        this.a = new gv(nkVar.a.getContext(), nkVar.c);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        nk nkVar = this.b;
        Window.Callback callback = nkVar.d;
        if (callback == null || !nkVar.e) {
            return;
        }
        callback.onMenuItemSelected(0, this.a);
    }
}
