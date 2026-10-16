package l7;

import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC1732v;
import f4.C2555b;
import f7.AbstractC2614a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public final class h extends AbstractC2614a {
    public static final Parcelable.Creator<h> CREATOR = new C2555b(13);

    /* renamed from: a, reason: collision with root package name */
    public final int f40035a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f40036b;

    /* renamed from: c, reason: collision with root package name */
    public final String f40037c;

    public h(int i5, String str, ArrayList arrayList) {
        this.f40035a = i5;
        HashMap map = new HashMap();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            f fVar = (f) arrayList.get(i10);
            String str2 = fVar.f40030b;
            HashMap map2 = new HashMap();
            ArrayList arrayList2 = fVar.f40031c;
            AbstractC1732v.i(arrayList2);
            int size2 = arrayList2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                g gVar = (g) arrayList2.get(i11);
                map2.put(gVar.f40033b, gVar.f40034c);
            }
            map.put(str2, map2);
        }
        this.f40036b = map;
        AbstractC1732v.i(str);
        this.f40037c = str;
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            Map map3 = (Map) map.get((String) it.next());
            Iterator it2 = map3.keySet().iterator();
            while (it2.hasNext()) {
                ((C3397a) map3.get((String) it2.next())).f40021j = this;
            }
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        HashMap map = this.f40036b;
        for (String str : map.keySet()) {
            sb2.append(str);
            sb2.append(":\n");
            Map map2 = (Map) map.get(str);
            for (String str2 : map2.keySet()) {
                N0.a.r(sb2, "  ", str2, ": ");
                sb2.append(map2.get(str2));
            }
        }
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.k0(parcel, 1, 4);
        parcel.writeInt(this.f40035a);
        ArrayList arrayList = new ArrayList();
        HashMap map = this.f40036b;
        for (String str : map.keySet()) {
            arrayList.add(new f(str, (Map) map.get(str)));
        }
        AbstractC1304a.e0(parcel, 2, arrayList, false);
        AbstractC1304a.a0(parcel, 3, this.f40037c, false);
        AbstractC1304a.m0(iL0, parcel);
    }
}
