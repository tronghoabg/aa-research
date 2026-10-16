package defpackage;

import android.view.View;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class k8 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ m8 b;
    public final /* synthetic */ int c;

    public /* synthetic */ k8(m8 m8Var, int i, int i2) {
        this.a = i2;
        this.b = m8Var;
        this.c = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                m8 m8Var = this.b;
                if (m8Var != null) {
                    m8Var.b(this.c);
                    break;
                }
                break;
            default:
                m8 m8Var2 = this.b;
                if (m8Var2 != null) {
                    m8Var2.b(this.c);
                    break;
                }
                break;
        }
    }
}
