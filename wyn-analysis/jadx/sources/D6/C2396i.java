package d6;

import android.os.Parcel;
import android.os.Parcelable;
import c6.C1559a;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* renamed from: d6.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2396i extends AbstractC2389b {
    public static final Parcelable.Creator<C2396i> CREATOR = new C1559a(21);

    /* renamed from: a, reason: collision with root package name */
    public final List f34108a;

    public C2396i(Parcel parcel) {
        int i5 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i5);
        for (int i10 = 0; i10 < i5; i10++) {
            arrayList.add(new C2395h(parcel));
        }
        this.f34108a = DesugarCollections.unmodifiableList(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        List list = this.f34108a;
        int size = list.size();
        parcel.writeInt(size);
        for (int i10 = 0; i10 < size; i10++) {
            C2395h c2395h = (C2395h) list.get(i10);
            parcel.writeLong(c2395h.f34098a);
            parcel.writeByte(c2395h.f34099b ? (byte) 1 : (byte) 0);
            parcel.writeByte(c2395h.f34100c ? (byte) 1 : (byte) 0);
            parcel.writeByte(c2395h.f34101d ? (byte) 1 : (byte) 0);
            List list2 = c2395h.f34103f;
            int size2 = list2.size();
            parcel.writeInt(size2);
            for (int i11 = 0; i11 < size2; i11++) {
                C2394g c2394g = (C2394g) list2.get(i11);
                parcel.writeInt(c2394g.f34096a);
                parcel.writeLong(c2394g.f34097b);
            }
            parcel.writeLong(c2395h.f34102e);
            parcel.writeByte(c2395h.f34104g ? (byte) 1 : (byte) 0);
            parcel.writeLong(c2395h.f34105h);
            parcel.writeInt(c2395h.f34106i);
            parcel.writeInt(c2395h.f34107j);
            parcel.writeInt(c2395h.k);
        }
    }

    public C2396i(ArrayList arrayList) {
        this.f34108a = DesugarCollections.unmodifiableList(arrayList);
    }
}
