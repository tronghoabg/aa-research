package Pc;

import java.util.ArrayList;

/* loaded from: classes5.dex */
public final class O {

    /* renamed from: a, reason: collision with root package name */
    public String f9351a;

    /* renamed from: b, reason: collision with root package name */
    public String f9352b;

    /* renamed from: c, reason: collision with root package name */
    public String f9353c;

    /* renamed from: d, reason: collision with root package name */
    public String f9354d;

    /* renamed from: e, reason: collision with root package name */
    public String f9355e;

    /* renamed from: f, reason: collision with root package name */
    public Boolean f9356f;

    /* renamed from: g, reason: collision with root package name */
    public Boolean f9357g;

    /* renamed from: h, reason: collision with root package name */
    public String f9358h;

    /* renamed from: i, reason: collision with root package name */
    public String f9359i;

    /* renamed from: j, reason: collision with root package name */
    public String f9360j;
    public Long k;

    /* renamed from: l, reason: collision with root package name */
    public Long f9361l;

    public static O a(ArrayList arrayList) {
        Long lValueOf;
        O o7 = new O();
        String str = (String) arrayList.get(0);
        if (str == null) {
            throw new IllegalStateException("Nonnull field \"uid\" is null.");
        }
        o7.f9351a = str;
        o7.f9352b = (String) arrayList.get(1);
        o7.f9353c = (String) arrayList.get(2);
        o7.f9354d = (String) arrayList.get(3);
        o7.f9355e = (String) arrayList.get(4);
        Boolean bool = (Boolean) arrayList.get(5);
        if (bool == null) {
            throw new IllegalStateException("Nonnull field \"isAnonymous\" is null.");
        }
        o7.f9356f = bool;
        Boolean bool2 = (Boolean) arrayList.get(6);
        if (bool2 == null) {
            throw new IllegalStateException("Nonnull field \"isEmailVerified\" is null.");
        }
        o7.f9357g = bool2;
        o7.f9358h = (String) arrayList.get(7);
        o7.f9359i = (String) arrayList.get(8);
        o7.f9360j = (String) arrayList.get(9);
        Object obj = arrayList.get(10);
        Long lValueOf2 = null;
        if (obj == null) {
            lValueOf = null;
        } else {
            lValueOf = Long.valueOf(obj instanceof Integer ? ((Integer) obj).intValue() : ((Long) obj).longValue());
        }
        o7.k = lValueOf;
        Object obj2 = arrayList.get(11);
        if (obj2 != null) {
            lValueOf2 = Long.valueOf(obj2 instanceof Integer ? ((Integer) obj2).intValue() : ((Long) obj2).longValue());
        }
        o7.f9361l = lValueOf2;
        return o7;
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList(12);
        arrayList.add(this.f9351a);
        arrayList.add(this.f9352b);
        arrayList.add(this.f9353c);
        arrayList.add(this.f9354d);
        arrayList.add(this.f9355e);
        arrayList.add(this.f9356f);
        arrayList.add(this.f9357g);
        arrayList.add(this.f9358h);
        arrayList.add(this.f9359i);
        arrayList.add(this.f9360j);
        arrayList.add(this.k);
        arrayList.add(this.f9361l);
        return arrayList;
    }
}
