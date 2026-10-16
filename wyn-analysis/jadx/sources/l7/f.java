package l7;

import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import f4.C2555b;
import f7.AbstractC2614a;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes3.dex */
public final class f extends AbstractC2614a {
    public static final Parcelable.Creator<f> CREATOR = new C2555b(14);

    /* renamed from: a, reason: collision with root package name */
    public final int f40029a;

    /* renamed from: b, reason: collision with root package name */
    public final String f40030b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f40031c;

    public f(int i5, String str, ArrayList arrayList) {
        this.f40029a = i5;
        this.f40030b = str;
        this.f40031c = arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.k0(parcel, 1, 4);
        parcel.writeInt(this.f40029a);
        AbstractC1304a.a0(parcel, 2, this.f40030b, false);
        AbstractC1304a.e0(parcel, 3, this.f40031c, false);
        AbstractC1304a.m0(iL0, parcel);
    }

    public f(String str, Map map) {
        ArrayList arrayList;
        this.f40029a = 1;
        this.f40030b = str;
        if (map == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (String str2 : map.keySet()) {
                arrayList.add(new g((C3397a) map.get(str2), str2));
            }
        }
        this.f40031c = arrayList;
    }
}
