package Pc;

import java.util.ArrayList;

/* loaded from: classes5.dex */
public final class M {

    /* renamed from: a, reason: collision with root package name */
    public N f9346a;

    /* renamed from: b, reason: collision with root package name */
    public D f9347b;

    /* renamed from: c, reason: collision with root package name */
    public E f9348c;

    public static M a(ArrayList arrayList) {
        M m10 = new M();
        m10.f9346a = (N) arrayList.get(0);
        m10.f9347b = (D) arrayList.get(1);
        m10.f9348c = (E) arrayList.get(2);
        return m10;
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(this.f9346a);
        arrayList.add(this.f9347b);
        arrayList.add(this.f9348c);
        return arrayList;
    }
}
