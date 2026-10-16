package Uc;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public Boolean f12761a;

    /* renamed from: b, reason: collision with root package name */
    public List f12762b;

    public static q a(ArrayList arrayList) {
        q qVar = new q();
        qVar.f12761a = (Boolean) arrayList.get(0);
        qVar.f12762b = (List) arrayList.get(1);
        return qVar;
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(this.f12761a);
        arrayList.add(this.f12762b);
        return arrayList;
    }
}
