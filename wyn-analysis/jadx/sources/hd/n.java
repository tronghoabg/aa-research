package hd;

import java.util.ArrayList;
import java.util.Iterator;
import uc.C4271h;
import uc.InterfaceC4270g;

/* loaded from: classes5.dex */
public final class n implements InterfaceC4270g {

    /* renamed from: a, reason: collision with root package name */
    public C4271h f36418a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f36419b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final boolean f36420c = false;

    @Override // uc.InterfaceC4270g
    public final void a(Object obj) {
        if (!this.f36420c) {
            this.f36419b.add(obj);
        }
        b();
    }

    public final void b() {
        if (this.f36418a == null) {
            return;
        }
        ArrayList arrayList = this.f36419b;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof l) {
                this.f36418a.b();
            } else if (next instanceof m) {
                m mVar = (m) next;
                this.f36418a.c(mVar.f36415a, mVar.f36416b, mVar.f36417c);
            } else {
                this.f36418a.a(next);
            }
        }
        arrayList.clear();
    }
}
