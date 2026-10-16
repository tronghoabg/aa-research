package defpackage;

import android.content.Context;
import android.view.View;
import com.carstream.tech.launcher.CarLauncherActivity;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final /* synthetic */ class h0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ h0(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                i0 i0Var = (i0) this.b;
                j0 j0Var = (j0) this.c;
                xc.m(i0Var.a, "appHien_" + j0Var.a, false);
                i0Var.b();
                if (i0Var.e) {
                    i0Var.c();
                }
                i0Var.b.run();
                break;
            case 1:
                i0 i0Var2 = (i0) this.b;
                j0 j0Var2 = (j0) this.c;
                Context context = i0Var2.a;
                xc.m(context, "appHien_" + j0Var2.a, true);
                if (i0Var2.c.a(context).size() > 12) {
                    i0Var2.b();
                    i0Var2.c();
                } else {
                    i0Var2.e = false;
                    i0Var2.a();
                }
                i0Var2.b.run();
                break;
            default:
                ((CarLauncherActivity) this.b).lambda$mapCard$6((String) this.c, view);
                break;
        }
    }
}
