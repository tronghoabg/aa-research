package e.a;

import java.util.Arrays;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class bi {

    /* renamed from: a, reason: collision with root package name */
    private final List f46487a;

    /* renamed from: b, reason: collision with root package name */
    private final c f46488b;

    /* renamed from: c, reason: collision with root package name */
    private final Object[][] f46489c;

    /* synthetic */ bi(List list, c cVar, Object[][] objArr) {
        com.google.d.b.an.C(list, "addresses are not set");
        this.f46487a = list;
        com.google.d.b.an.C(cVar, "attrs");
        this.f46488b = cVar;
        com.google.d.b.an.C(objArr, "customOptions");
        this.f46489c = objArr;
    }

    public static bg b() {
        return new bg();
    }

    public final c a() {
        return this.f46488b;
    }

    public final Object c(bh bhVar) {
        int i2 = 0;
        while (true) {
            Object[][] objArr = this.f46489c;
            if (i2 >= objArr.length) {
                return bhVar.f46486b;
            }
            if (bhVar.equals(objArr[i2][0])) {
                return objArr[i2][1];
            }
            i2++;
        }
    }

    public final List d() {
        return this.f46487a;
    }

    public final String toString() {
        com.google.d.b.z zVarH = com.google.d.b.an.H(this);
        zVarH.d("addrs", this.f46487a);
        zVarH.d("attrs", this.f46488b);
        zVarH.d("customOptions", Arrays.deepToString(this.f46489c));
        return zVarH.toString();
    }
}
