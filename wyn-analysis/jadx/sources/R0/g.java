package R0;

import java.util.Iterator;

/* loaded from: classes.dex */
public class g extends f {

    /* renamed from: m, reason: collision with root package name */
    public int f10069m;

    public g(o oVar) {
        super(oVar);
        if (oVar instanceof k) {
            this.f10062e = 2;
        } else {
            this.f10062e = 3;
        }
    }

    @Override // R0.f
    public final void d(int i5) {
        if (this.f10067j) {
            return;
        }
        this.f10067j = true;
        this.f10064g = i5;
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            dVar.a(dVar);
        }
    }
}
