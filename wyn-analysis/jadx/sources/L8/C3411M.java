package l8;

/* renamed from: l8.M, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3411M {

    /* renamed from: a, reason: collision with root package name */
    public final Object f40057a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f40058b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f40059c;

    public C3411M(Object obj, Object obj2, Object obj3) {
        this.f40057a = obj;
        this.f40058b = obj2;
        this.f40059c = obj3;
    }

    public final IllegalArgumentException a() {
        StringBuilder sb2 = new StringBuilder("Multiple entries with same key: ");
        Object obj = this.f40057a;
        sb2.append(obj);
        sb2.append("=");
        sb2.append(this.f40058b);
        sb2.append(" and ");
        sb2.append(obj);
        sb2.append("=");
        sb2.append(this.f40059c);
        return new IllegalArgumentException(sb2.toString());
    }
}
