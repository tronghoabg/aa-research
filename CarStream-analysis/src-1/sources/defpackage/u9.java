package defpackage;

import android.view.View;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class u9 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ w9 b;

    public /* synthetic */ u9(w9 w9Var, int i) {
        this.a = i;
        this.b = w9Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.b.a.c();
                break;
            case 1:
                t9 t9Var = this.b.b.a;
                rc rcVar = t9Var.g;
                if (rcVar != null && rcVar.d) {
                    rcVar.a();
                    t9Var.i(null, false);
                    break;
                } else {
                    t9Var.j(false);
                    break;
                }
                break;
            default:
                this.b.b.a.c();
                break;
        }
    }
}
