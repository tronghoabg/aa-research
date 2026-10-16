package Uc;

import java.util.ArrayList;

/* loaded from: classes5.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public Boolean f12785a;

    /* renamed from: b, reason: collision with root package name */
    public Boolean f12786b;

    public static w a(ArrayList arrayList) {
        w wVar = new w();
        Boolean bool = (Boolean) arrayList.get(0);
        if (bool == null) {
            throw new IllegalStateException("Nonnull field \"hasPendingWrites\" is null.");
        }
        wVar.f12785a = bool;
        Boolean bool2 = (Boolean) arrayList.get(1);
        if (bool2 == null) {
            throw new IllegalStateException("Nonnull field \"isFromCache\" is null.");
        }
        wVar.f12786b = bool2;
        return wVar;
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(this.f12785a);
        arrayList.add(this.f12786b);
        return arrayList;
    }
}
