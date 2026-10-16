package k7;

import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import f4.C2555b;
import f7.AbstractC2614a;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: k7.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3190a extends AbstractC2614a {
    public static final Parcelable.Creator<C3190a> CREATOR = new C2555b(10);

    /* renamed from: a, reason: collision with root package name */
    public final int f39285a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f39286b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final SparseArray f39287c = new SparseArray();

    public C3190a(ArrayList arrayList, int i5) {
        this.f39285a = i5;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            c cVar = (c) arrayList.get(i10);
            String str = cVar.f39291b;
            int i11 = cVar.f39292c;
            this.f39286b.put(str, Integer.valueOf(i11));
            this.f39287c.put(i11, str);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.k0(parcel, 1, 4);
        parcel.writeInt(this.f39285a);
        ArrayList arrayList = new ArrayList();
        HashMap map = this.f39286b;
        for (String str : map.keySet()) {
            arrayList.add(new c(str, ((Integer) map.get(str)).intValue()));
        }
        AbstractC1304a.e0(parcel, 2, arrayList, false);
        AbstractC1304a.m0(iL0, parcel);
    }
}
