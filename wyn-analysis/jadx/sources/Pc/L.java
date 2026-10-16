package Pc;

import java.util.ArrayList;

/* loaded from: classes5.dex */
public final class L {

    /* renamed from: a, reason: collision with root package name */
    public Long f9341a;

    /* renamed from: b, reason: collision with root package name */
    public Long f9342b;

    /* renamed from: c, reason: collision with root package name */
    public Long f9343c;

    /* renamed from: d, reason: collision with root package name */
    public String f9344d;

    /* renamed from: e, reason: collision with root package name */
    public String f9345e;

    public static L a(ArrayList arrayList) {
        Long lValueOf;
        Long lValueOf2;
        L l10 = new L();
        Object obj = arrayList.get(0);
        Long lValueOf3 = null;
        if (obj == null) {
            lValueOf = null;
        } else {
            lValueOf = Long.valueOf(obj instanceof Integer ? ((Integer) obj).intValue() : ((Long) obj).longValue());
        }
        l10.f9341a = lValueOf;
        Object obj2 = arrayList.get(1);
        if (obj2 == null) {
            lValueOf2 = null;
        } else {
            lValueOf2 = Long.valueOf(obj2 instanceof Integer ? ((Integer) obj2).intValue() : ((Long) obj2).longValue());
        }
        l10.f9342b = lValueOf2;
        Object obj3 = arrayList.get(2);
        if (obj3 != null) {
            lValueOf3 = Long.valueOf(obj3 instanceof Integer ? ((Integer) obj3).intValue() : ((Long) obj3).longValue());
        }
        l10.f9343c = lValueOf3;
        l10.f9344d = (String) arrayList.get(3);
        String str = (String) arrayList.get(4);
        if (str == null) {
            throw new IllegalStateException("Nonnull field \"secretKey\" is null.");
        }
        l10.f9345e = str;
        return l10;
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList(5);
        arrayList.add(this.f9341a);
        arrayList.add(this.f9342b);
        arrayList.add(this.f9343c);
        arrayList.add(this.f9344d);
        arrayList.add(this.f9345e);
        return arrayList;
    }
}
