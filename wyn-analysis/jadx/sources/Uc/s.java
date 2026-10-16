package Uc;

import java.util.ArrayList;

/* loaded from: classes5.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public Boolean f12766a;

    /* renamed from: b, reason: collision with root package name */
    public String f12767b;

    /* renamed from: c, reason: collision with root package name */
    public Boolean f12768c;

    /* renamed from: d, reason: collision with root package name */
    public Long f12769d;

    /* renamed from: e, reason: collision with root package name */
    public Boolean f12770e;

    public static s a(ArrayList arrayList) {
        Long lValueOf;
        s sVar = new s();
        sVar.f12766a = (Boolean) arrayList.get(0);
        sVar.f12767b = (String) arrayList.get(1);
        sVar.f12768c = (Boolean) arrayList.get(2);
        Object obj = arrayList.get(3);
        if (obj == null) {
            lValueOf = null;
        } else {
            lValueOf = Long.valueOf(obj instanceof Integer ? ((Integer) obj).intValue() : ((Long) obj).longValue());
        }
        sVar.f12769d = lValueOf;
        Boolean bool = (Boolean) arrayList.get(4);
        if (bool == null) {
            throw new IllegalStateException("Nonnull field \"ignoreUndefinedProperties\" is null.");
        }
        sVar.f12770e = bool;
        return sVar;
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList(5);
        arrayList.add(this.f12766a);
        arrayList.add(this.f12767b);
        arrayList.add(this.f12768c);
        arrayList.add(this.f12769d);
        arrayList.add(this.f12770e);
        return arrayList;
    }
}
