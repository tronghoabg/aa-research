package R4;

import Y4.m;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class a implements d {

    /* renamed from: a, reason: collision with root package name */
    public boolean f10231a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f10232b;

    /* renamed from: c, reason: collision with root package name */
    public Object f10233c = Collections.newSetFromMap(new WeakHashMap());

    public void a() {
        this.f10231a = true;
        Iterator it = m.d((Set) this.f10233c).iterator();
        while (it.hasNext()) {
            ((e) it.next()).b();
        }
    }

    @Override // R4.d
    public void e(e eVar) {
        ((Set) this.f10233c).remove(eVar);
    }

    @Override // R4.d
    public void f(e eVar) {
        ((Set) this.f10233c).add(eVar);
        if (this.f10232b) {
            eVar.onDestroy();
        } else if (this.f10231a) {
            eVar.b();
        } else {
            eVar.a();
        }
    }
}
