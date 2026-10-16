package defpackage;

import android.view.View;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class ta implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ bd b;
    public final /* synthetic */ ua c;

    public /* synthetic */ ta(ua uaVar, bd bdVar, int i) {
        this.a = i;
        this.c = uaVar;
        this.b = bdVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                r8 r8Var = this.c.b;
                if (r8Var != null) {
                    r8Var.b(this.b);
                    break;
                }
                break;
            default:
                r8 r8Var2 = this.c.b;
                if (r8Var2 != null) {
                    r8Var2.b(this.b);
                    break;
                }
                break;
        }
    }
}
