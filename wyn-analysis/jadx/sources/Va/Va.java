package Va;

import android.os.Handler;
import android.view.Choreographer;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class Va extends Ba {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f13797c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Xa f13798d;

    @Override // Va.Ba
    public final void c() {
        switch (this.f13797c) {
            case 0:
                Xa xa2 = this.f13798d;
                if (!xa2.f13857b) {
                    xa2.f13860e = null;
                    break;
                } else {
                    HashMap map = new HashMap((HashMap) xa2.f13858c);
                    Iterator it = map.keySet().iterator();
                    while (it.hasNext()) {
                        ((Handler) xa2.f13859d).post((Runnable) map.get((InterfaceC1180va) it.next()));
                    }
                    if (((Ua) xa2.f13860e) == null) {
                        Ua ua2 = new Ua();
                        ua2.f13761a = this;
                        xa2.f13860e = ua2;
                    }
                    Choreographer.getInstance().postFrameCallback((Ua) xa2.f13860e);
                    break;
                }
            case 1:
                Xa xa3 = this.f13798d;
                if (((C1105q) xa3.f13861f) == null) {
                    xa3.f13861f = new C1105q(this, 3);
                    ((Handler) xa3.f13859d).post(new C1169v(this, 20));
                    break;
                }
                break;
            default:
                this.f13798d.f13857b = false;
                break;
        }
    }

    public Va(Xa xa2) {
        this.f13797c = 1;
        this.f13798d = xa2;
    }
}
