package Pc;

import java.util.ArrayList;

/* loaded from: classes5.dex */
public final class Q {

    /* renamed from: a, reason: collision with root package name */
    public String f9366a;

    /* renamed from: b, reason: collision with root package name */
    public Long f9367b;

    /* renamed from: c, reason: collision with root package name */
    public Long f9368c;

    /* renamed from: d, reason: collision with root package name */
    public String f9369d;

    /* renamed from: e, reason: collision with root package name */
    public String f9370e;

    /* renamed from: f, reason: collision with root package name */
    public String f9371f;

    public static Q a(ArrayList arrayList) {
        Long lValueOf;
        Q q4 = new Q();
        q4.f9366a = (String) arrayList.get(0);
        Object obj = arrayList.get(1);
        Long lValueOf2 = null;
        if (obj == null) {
            lValueOf = null;
        } else {
            lValueOf = Long.valueOf(obj instanceof Integer ? ((Integer) obj).intValue() : ((Long) obj).longValue());
        }
        if (lValueOf == null) {
            throw new IllegalStateException("Nonnull field \"timeout\" is null.");
        }
        q4.f9367b = lValueOf;
        Object obj2 = arrayList.get(2);
        if (obj2 != null) {
            lValueOf2 = Long.valueOf(obj2 instanceof Integer ? ((Integer) obj2).intValue() : ((Long) obj2).longValue());
        }
        q4.f9368c = lValueOf2;
        q4.f9369d = (String) arrayList.get(3);
        q4.f9370e = (String) arrayList.get(4);
        q4.f9371f = (String) arrayList.get(5);
        return q4;
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList(6);
        arrayList.add(this.f9366a);
        arrayList.add(this.f9367b);
        arrayList.add(this.f9368c);
        arrayList.add(this.f9369d);
        arrayList.add(this.f9370e);
        arrayList.add(this.f9371f);
        return arrayList;
    }
}
