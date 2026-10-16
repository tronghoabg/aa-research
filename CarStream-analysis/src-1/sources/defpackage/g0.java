package defpackage;

import android.view.View;
import com.carstream.tech.launcher.QsActivity;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final /* synthetic */ class g0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                i0 i0Var = (i0) this.b;
                i0Var.e = !i0Var.e;
                i0Var.a();
                break;
            case 1:
                ((Runnable) this.b).run();
                break;
            default:
                ((QsActivity) this.b).lambda$onCreate$0(view);
                break;
        }
    }
}
