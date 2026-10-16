package Pc;

import java.util.ArrayList;

/* loaded from: classes5.dex */
public final class C {

    /* renamed from: a, reason: collision with root package name */
    public String f9302a;

    /* renamed from: b, reason: collision with root package name */
    public String f9303b;

    /* renamed from: c, reason: collision with root package name */
    public Boolean f9304c;

    /* renamed from: d, reason: collision with root package name */
    public String f9305d;

    /* renamed from: e, reason: collision with root package name */
    public String f9306e;

    /* renamed from: f, reason: collision with root package name */
    public Boolean f9307f;

    /* renamed from: g, reason: collision with root package name */
    public String f9308g;

    public static C a(ArrayList arrayList) {
        C c10 = new C();
        String str = (String) arrayList.get(0);
        if (str == null) {
            throw new IllegalStateException("Nonnull field \"url\" is null.");
        }
        c10.f9302a = str;
        c10.f9303b = (String) arrayList.get(1);
        Boolean bool = (Boolean) arrayList.get(2);
        if (bool == null) {
            throw new IllegalStateException("Nonnull field \"handleCodeInApp\" is null.");
        }
        c10.f9304c = bool;
        c10.f9305d = (String) arrayList.get(3);
        c10.f9306e = (String) arrayList.get(4);
        Boolean bool2 = (Boolean) arrayList.get(5);
        if (bool2 == null) {
            throw new IllegalStateException("Nonnull field \"androidInstallApp\" is null.");
        }
        c10.f9307f = bool2;
        c10.f9308g = (String) arrayList.get(6);
        return c10;
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList(7);
        arrayList.add(this.f9302a);
        arrayList.add(this.f9303b);
        arrayList.add(this.f9304c);
        arrayList.add(this.f9305d);
        arrayList.add(this.f9306e);
        arrayList.add(this.f9307f);
        arrayList.add(this.f9308g);
        return arrayList;
    }
}
