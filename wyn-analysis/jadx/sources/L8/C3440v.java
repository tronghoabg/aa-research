package l8;

import java.util.Map;

/* renamed from: l8.v, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3440v extends AbstractC3432n {

    /* renamed from: a, reason: collision with root package name */
    public final Object f40168a;

    /* renamed from: b, reason: collision with root package name */
    public int f40169b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3441w f40170c;

    public C3440v(C3441w c3441w, int i5) {
        this.f40170c = c3441w;
        Object obj = C3441w.f40171j;
        this.f40168a = c3441w.k()[i5];
        this.f40169b = i5;
    }

    public final void a() {
        int i5 = this.f40169b;
        Object obj = this.f40168a;
        C3441w c3441w = this.f40170c;
        if (i5 != -1 && i5 < c3441w.size()) {
            if (Fe.b.v(obj, c3441w.k()[this.f40169b])) {
                return;
            }
        }
        Object obj2 = C3441w.f40171j;
        this.f40169b = c3441w.f(obj);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f40168a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        C3441w c3441w = this.f40170c;
        Map mapD = c3441w.d();
        if (mapD != null) {
            return mapD.get(this.f40168a);
        }
        a();
        int i5 = this.f40169b;
        if (i5 == -1) {
            return null;
        }
        return c3441w.l()[i5];
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        C3441w c3441w = this.f40170c;
        Map mapD = c3441w.d();
        Object obj2 = this.f40168a;
        if (mapD != null) {
            return mapD.put(obj2, obj);
        }
        a();
        int i5 = this.f40169b;
        if (i5 == -1) {
            c3441w.put(obj2, obj);
            return null;
        }
        Object obj3 = c3441w.l()[i5];
        c3441w.l()[this.f40169b] = obj;
        return obj3;
    }
}
