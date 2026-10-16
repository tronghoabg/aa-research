package defpackage;

import android.view.View;
import com.carstream.tech.car.e;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class t3 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ t3(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                y6 y6VarN = z6.n();
                if (y6VarN != null) {
                    e eVar = (e) y6VarN;
                    if (z6.b) {
                        eVar.r();
                    } else {
                        eVar.t();
                    }
                    ((v3) this.b).e();
                    break;
                }
                break;
            case 1:
                ((a8) this.b).a.k();
                break;
            case 2:
                ((c8) this.b).b.f();
                break;
            default:
                ((aa) this.b).run();
                break;
        }
    }
}
