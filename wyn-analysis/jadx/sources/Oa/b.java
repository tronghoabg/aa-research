package Oa;

import Ma.j;
import android.view.View;
import j$.util.DesugarCollections;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class b extends e {

    /* renamed from: d, reason: collision with root package name */
    public static final b f8929d = new b();

    @Override // Oa.e
    public final void a(boolean z2) {
        Iterator it = DesugarCollections.unmodifiableCollection(c.f8930c.f8931a).iterator();
        while (it.hasNext()) {
            Qa.a aVar = ((j) it.next()).f7610e;
            if (aVar.f9930b.get() != 0) {
                g.f8938a.a(aVar.e(), "setState", z2 ? "foregrounded" : "backgrounded", aVar.f9929a);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Oa.e
    public final boolean c() {
        Iterator it = DesugarCollections.unmodifiableCollection(c.f8930c.f8932b).iterator();
        while (it.hasNext()) {
            View view = (View) ((j) it.next()).f7609d.get();
            if (view != null && view.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }
}
