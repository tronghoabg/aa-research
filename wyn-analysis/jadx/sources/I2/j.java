package I2;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class j extends b {
    public static final Parcelable.Creator<j> CREATOR = new d(2);

    /* renamed from: a, reason: collision with root package name */
    public final List f5316a;

    public j(Parcel parcel) {
        int i5 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i5);
        for (int i10 = 0; i10 < i5; i10++) {
            arrayList.add(new i(parcel));
        }
        this.f5316a = DesugarCollections.unmodifiableList(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        List list = this.f5316a;
        int size = list.size();
        parcel.writeInt(size);
        for (int i10 = 0; i10 < size; i10++) {
            i iVar = (i) list.get(i10);
            parcel.writeLong(iVar.f5306a);
            parcel.writeByte(iVar.f5307b ? (byte) 1 : (byte) 0);
            parcel.writeByte(iVar.f5308c ? (byte) 1 : (byte) 0);
            parcel.writeByte(iVar.f5309d ? (byte) 1 : (byte) 0);
            List list2 = iVar.f5311f;
            int size2 = list2.size();
            parcel.writeInt(size2);
            for (int i11 = 0; i11 < size2; i11++) {
                h hVar = (h) list2.get(i11);
                parcel.writeInt(hVar.f5304a);
                parcel.writeLong(hVar.f5305b);
            }
            parcel.writeLong(iVar.f5310e);
            parcel.writeByte(iVar.f5312g ? (byte) 1 : (byte) 0);
            parcel.writeLong(iVar.f5313h);
            parcel.writeInt(iVar.f5314i);
            parcel.writeInt(iVar.f5315j);
            parcel.writeInt(iVar.k);
        }
    }

    public j(ArrayList arrayList) {
        this.f5316a = DesugarCollections.unmodifiableList(arrayList);
    }
}
