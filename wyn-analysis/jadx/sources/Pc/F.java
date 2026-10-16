package Pc;

import java.util.ArrayList;

/* loaded from: classes5.dex */
public final class F {

    /* renamed from: a, reason: collision with root package name */
    public Boolean f9318a;

    /* renamed from: b, reason: collision with root package name */
    public String f9319b;

    /* renamed from: c, reason: collision with root package name */
    public String f9320c;

    /* renamed from: d, reason: collision with root package name */
    public String f9321d;

    /* renamed from: e, reason: collision with root package name */
    public Boolean f9322e;

    public static F a(ArrayList arrayList) {
        F f10 = new F();
        Boolean bool = (Boolean) arrayList.get(0);
        if (bool == null) {
            throw new IllegalStateException("Nonnull field \"appVerificationDisabledForTesting\" is null.");
        }
        f10.f9318a = bool;
        f10.f9319b = (String) arrayList.get(1);
        f10.f9320c = (String) arrayList.get(2);
        f10.f9321d = (String) arrayList.get(3);
        f10.f9322e = (Boolean) arrayList.get(4);
        return f10;
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList(5);
        arrayList.add(this.f9318a);
        arrayList.add(this.f9319b);
        arrayList.add(this.f9320c);
        arrayList.add(this.f9321d);
        arrayList.add(this.f9322e);
        return arrayList;
    }
}
