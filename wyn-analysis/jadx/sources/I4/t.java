package I4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class t implements C4.e, C4.d {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f5359a;

    /* renamed from: b, reason: collision with root package name */
    public final Dd.c f5360b;

    /* renamed from: c, reason: collision with root package name */
    public int f5361c;

    /* renamed from: d, reason: collision with root package name */
    public com.bumptech.glide.d f5362d;

    /* renamed from: e, reason: collision with root package name */
    public C4.d f5363e;

    /* renamed from: f, reason: collision with root package name */
    public List f5364f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f5365g;

    public t(ArrayList arrayList, Dd.c cVar) {
        this.f5360b = cVar;
        if (arrayList.isEmpty()) {
            throw new IllegalArgumentException("Must not be empty.");
        }
        this.f5359a = arrayList;
        this.f5361c = 0;
    }

    @Override // C4.e
    public final void a() {
        List list = this.f5364f;
        if (list != null) {
            this.f5360b.O(list);
        }
        this.f5364f = null;
        Iterator it = this.f5359a.iterator();
        while (it.hasNext()) {
            ((C4.e) it.next()).a();
        }
    }

    @Override // C4.e
    public final Class b() {
        return ((C4.e) this.f5359a.get(0)).b();
    }

    @Override // C4.d
    public final void c(Exception exc) {
        List list = this.f5364f;
        gc.b.k(list, "Argument must not be null");
        list.add(exc);
        f();
    }

    @Override // C4.e
    public final void cancel() {
        this.f5365g = true;
        Iterator it = this.f5359a.iterator();
        while (it.hasNext()) {
            ((C4.e) it.next()).cancel();
        }
    }

    @Override // C4.e
    public final int d() {
        return ((C4.e) this.f5359a.get(0)).d();
    }

    @Override // C4.e
    public final void e(com.bumptech.glide.d dVar, C4.d dVar2) {
        this.f5362d = dVar;
        this.f5363e = dVar2;
        this.f5364f = (List) this.f5360b.z();
        ((C4.e) this.f5359a.get(this.f5361c)).e(dVar, this);
        if (this.f5365g) {
            cancel();
        }
    }

    public final void f() {
        if (this.f5365g) {
            return;
        }
        if (this.f5361c < this.f5359a.size() - 1) {
            this.f5361c++;
            e(this.f5362d, this.f5363e);
        } else {
            gc.b.j(this.f5364f);
            this.f5363e.c(new E4.w("Fetch failed", new ArrayList(this.f5364f)));
        }
    }

    @Override // C4.d
    public final void i(Object obj) {
        if (obj != null) {
            this.f5363e.i(obj);
        } else {
            f();
        }
    }
}
