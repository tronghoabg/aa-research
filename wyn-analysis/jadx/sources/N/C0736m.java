package N;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import jf.InterfaceC3108h;

/* renamed from: N.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0736m extends AbstractC0743q {

    /* renamed from: a, reason: collision with root package name */
    public final int f7807a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f7808b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f7809c;

    /* renamed from: d, reason: collision with root package name */
    public HashSet f7810d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashSet f7811e = new LinkedHashSet();

    /* renamed from: f, reason: collision with root package name */
    public final Y f7812f = C0718d.G(V.h.f12864d, P.f7728d);

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0740o f7813g;

    public C0736m(C0740o c0740o, int i5, boolean z2, boolean z10, P p10) {
        this.f7813g = c0740o;
        this.f7807a = i5;
        this.f7808b = z2;
        this.f7809c = z10;
    }

    @Override // N.AbstractC0743q
    public final void a(C0744s c0744s, V.d dVar) {
        this.f7813g.f7846b.a(c0744s, dVar);
    }

    @Override // N.AbstractC0743q
    public final void b() {
        C0740o c0740o = this.f7813g;
        c0740o.f7869z--;
    }

    @Override // N.AbstractC0743q
    public final boolean c() {
        return this.f7813g.f7846b.c();
    }

    @Override // N.AbstractC0743q
    public final boolean d() {
        return this.f7808b;
    }

    @Override // N.AbstractC0743q
    public final boolean e() {
        return this.f7809c;
    }

    @Override // N.AbstractC0743q
    public final InterfaceC0717c0 f() {
        return (InterfaceC0717c0) this.f7812f.getValue();
    }

    @Override // N.AbstractC0743q
    public final int g() {
        return this.f7807a;
    }

    @Override // N.AbstractC0743q
    public final InterfaceC3108h h() {
        return this.f7813g.f7846b.h();
    }

    @Override // N.AbstractC0743q
    public final void i(C0744s c0744s) {
        C0740o c0740o = this.f7813g;
        c0740o.f7846b.i(c0740o.f7851g);
        c0740o.f7846b.i(c0744s);
    }

    @Override // N.AbstractC0743q
    public final void j(Set set) {
        HashSet hashSet = this.f7810d;
        if (hashSet == null) {
            hashSet = new HashSet();
            this.f7810d = hashSet;
        }
        hashSet.add(set);
    }

    @Override // N.AbstractC0743q
    public final void k(C0740o c0740o) {
        this.f7811e.add(c0740o);
    }

    @Override // N.AbstractC0743q
    public final void l(C0744s c0744s) {
        this.f7813g.f7846b.l(c0744s);
    }

    @Override // N.AbstractC0743q
    public final void m() {
        this.f7813g.f7869z++;
    }

    @Override // N.AbstractC0743q
    public final void n(C0740o c0740o) {
        HashSet hashSet = this.f7810d;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((Set) it.next()).remove(c0740o.f7847c);
            }
        }
        LinkedHashSet linkedHashSet = this.f7811e;
        kotlin.jvm.internal.K.a(linkedHashSet);
        linkedHashSet.remove(c0740o);
    }

    @Override // N.AbstractC0743q
    public final void o(C0744s c0744s) {
        this.f7813g.f7846b.o(c0744s);
    }

    public final void p() {
        LinkedHashSet<C0740o> linkedHashSet = this.f7811e;
        if (linkedHashSet.isEmpty()) {
            return;
        }
        HashSet hashSet = this.f7810d;
        if (hashSet != null) {
            for (C0740o c0740o : linkedHashSet) {
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    ((Set) it.next()).remove(c0740o.f7847c);
                }
            }
        }
        linkedHashSet.clear();
    }
}
