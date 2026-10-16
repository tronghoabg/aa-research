package Pc;

import java.util.ArrayList;

/* loaded from: classes5.dex */
public final class H {

    /* renamed from: a, reason: collision with root package name */
    public String f9330a;

    /* renamed from: b, reason: collision with root package name */
    public Double f9331b;

    /* renamed from: c, reason: collision with root package name */
    public String f9332c;

    /* renamed from: d, reason: collision with root package name */
    public String f9333d;

    /* renamed from: e, reason: collision with root package name */
    public String f9334e;

    public static H a(ArrayList arrayList) {
        H h10 = new H();
        h10.f9330a = (String) arrayList.get(0);
        Double d3 = (Double) arrayList.get(1);
        if (d3 == null) {
            throw new IllegalStateException("Nonnull field \"enrollmentTimestamp\" is null.");
        }
        h10.f9331b = d3;
        h10.f9332c = (String) arrayList.get(2);
        String str = (String) arrayList.get(3);
        if (str == null) {
            throw new IllegalStateException("Nonnull field \"uid\" is null.");
        }
        h10.f9333d = str;
        h10.f9334e = (String) arrayList.get(4);
        return h10;
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList(5);
        arrayList.add(this.f9330a);
        arrayList.add(this.f9331b);
        arrayList.add(this.f9332c);
        arrayList.add(this.f9333d);
        arrayList.add(this.f9334e);
        return arrayList;
    }
}
