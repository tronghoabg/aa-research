package l8;

import j$.util.Objects;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: l8.u, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3439u extends AbstractSet {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40166a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3441w f40167b;

    public /* synthetic */ C3439u(C3441w c3441w, int i5) {
        this.f40166a = i5;
        this.f40167b = c3441w;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f40166a) {
            case 0:
                this.f40167b.clear();
                break;
            default:
                this.f40167b.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f40166a) {
            case 0:
                C3441w c3441w = this.f40167b;
                Map mapD = c3441w.d();
                if (mapD != null) {
                    return mapD.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int iF = c3441w.f(entry.getKey());
                    if (iF != -1 && Fe.b.v(c3441w.l()[iF], entry.getValue())) {
                        return true;
                    }
                }
                return false;
            default:
                return this.f40167b.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f40166a) {
            case 0:
                C3441w c3441w = this.f40167b;
                Map mapD = c3441w.d();
                return mapD != null ? mapD.entrySet().iterator() : new C3438t(c3441w, 1);
            default:
                C3441w c3441w2 = this.f40167b;
                Map mapD2 = c3441w2.d();
                return mapD2 != null ? mapD2.keySet().iterator() : new C3438t(c3441w2, 0);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f40166a) {
            case 0:
                C3441w c3441w = this.f40167b;
                Map mapD = c3441w.d();
                if (mapD != null) {
                    return mapD.entrySet().remove(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (!c3441w.h()) {
                        int iE = c3441w.e();
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        Object obj2 = c3441w.f40172a;
                        Objects.requireNonNull(obj2);
                        int iP = AbstractC3437s.p(key, value, iE, obj2, c3441w.j(), c3441w.k(), c3441w.l());
                        if (iP != -1) {
                            c3441w.g(iP, iE);
                            c3441w.f40177f--;
                            c3441w.f40176e += 32;
                            return true;
                        }
                    }
                }
                return false;
            default:
                C3441w c3441w2 = this.f40167b;
                Map mapD2 = c3441w2.d();
                return mapD2 != null ? mapD2.keySet().remove(obj) : c3441w2.i(obj) != C3441w.f40171j;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f40166a) {
        }
        return this.f40167b.size();
    }
}
