package Pc;

import java.util.ArrayList;

/* loaded from: classes5.dex */
public final class E {

    /* renamed from: a, reason: collision with root package name */
    public String f9314a;

    /* renamed from: b, reason: collision with root package name */
    public String f9315b;

    /* renamed from: c, reason: collision with root package name */
    public Long f9316c;

    /* renamed from: d, reason: collision with root package name */
    public String f9317d;

    public static E a(ArrayList arrayList) {
        Long lValueOf;
        E e7 = new E();
        String str = (String) arrayList.get(0);
        if (str == null) {
            throw new IllegalStateException("Nonnull field \"providerId\" is null.");
        }
        e7.f9314a = str;
        String str2 = (String) arrayList.get(1);
        if (str2 == null) {
            throw new IllegalStateException("Nonnull field \"signInMethod\" is null.");
        }
        e7.f9315b = str2;
        Object obj = arrayList.get(2);
        if (obj == null) {
            lValueOf = null;
        } else {
            lValueOf = Long.valueOf(obj instanceof Integer ? ((Integer) obj).intValue() : ((Long) obj).longValue());
        }
        if (lValueOf == null) {
            throw new IllegalStateException("Nonnull field \"nativeId\" is null.");
        }
        e7.f9316c = lValueOf;
        e7.f9317d = (String) arrayList.get(3);
        return e7;
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(this.f9314a);
        arrayList.add(this.f9315b);
        arrayList.add(this.f9316c);
        arrayList.add(this.f9317d);
        return arrayList;
    }
}
