package Uc;

import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes5.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public String f12763a;

    /* renamed from: b, reason: collision with root package name */
    public Map f12764b;

    /* renamed from: c, reason: collision with root package name */
    public w f12765c;

    public static r a(ArrayList arrayList) {
        r rVar = new r();
        String str = (String) arrayList.get(0);
        if (str == null) {
            throw new IllegalStateException("Nonnull field \"path\" is null.");
        }
        rVar.f12763a = str;
        rVar.f12764b = (Map) arrayList.get(1);
        Object obj = arrayList.get(2);
        w wVarA = obj == null ? null : w.a((ArrayList) obj);
        if (wVarA == null) {
            throw new IllegalStateException("Nonnull field \"metadata\" is null.");
        }
        rVar.f12765c = wVarA;
        return rVar;
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(this.f12763a);
        arrayList.add(this.f12764b);
        w wVar = this.f12765c;
        arrayList.add(wVar == null ? null : wVar.b());
        return arrayList;
    }
}
