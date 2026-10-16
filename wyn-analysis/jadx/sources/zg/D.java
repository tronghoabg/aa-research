package zg;

import j$.util.Objects;

/* loaded from: classes5.dex */
public final class D extends a0 {

    /* renamed from: b, reason: collision with root package name */
    public final String f48526b;

    /* renamed from: c, reason: collision with root package name */
    public final C4662a f48527c;

    public D(String str) {
        C4662a c4662a = C4662a.f48614b;
        Objects.requireNonNull(str, "name == null");
        this.f48526b = str;
        this.f48527c = c4662a;
    }

    @Override // zg.a0
    public final void a(N n10, Object obj) {
        if (obj == null) {
            return;
        }
        this.f48527c.getClass();
        String string = obj.toString();
        if (string == null) {
            return;
        }
        n10.b(this.f48526b, string);
    }
}
