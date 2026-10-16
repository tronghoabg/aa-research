package d6;

import android.os.Parcel;
import android.os.Parcelable;
import c6.C1559a;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* renamed from: d6.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2392e extends AbstractC2389b {
    public static final Parcelable.Creator<C2392e> CREATOR = new C1559a(19);

    /* renamed from: a, reason: collision with root package name */
    public final long f34084a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f34085b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f34086c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f34087d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f34088e;

    /* renamed from: f, reason: collision with root package name */
    public final long f34089f;

    /* renamed from: g, reason: collision with root package name */
    public final long f34090g;

    /* renamed from: h, reason: collision with root package name */
    public final List f34091h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f34092i;

    /* renamed from: j, reason: collision with root package name */
    public final long f34093j;
    public final int k;

    /* renamed from: l, reason: collision with root package name */
    public final int f34094l;

    /* renamed from: m, reason: collision with root package name */
    public final int f34095m;

    public C2392e(long j8, boolean z2, boolean z10, boolean z11, boolean z12, long j10, long j11, List list, boolean z13, long j12, int i5, int i10, int i11) {
        this.f34084a = j8;
        this.f34085b = z2;
        this.f34086c = z10;
        this.f34087d = z11;
        this.f34088e = z12;
        this.f34089f = j10;
        this.f34090g = j11;
        this.f34091h = DesugarCollections.unmodifiableList(list);
        this.f34092i = z13;
        this.f34093j = j12;
        this.k = i5;
        this.f34094l = i10;
        this.f34095m = i11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        parcel.writeLong(this.f34084a);
        parcel.writeByte(this.f34085b ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f34086c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f34087d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f34088e ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f34089f);
        parcel.writeLong(this.f34090g);
        List list = this.f34091h;
        int size = list.size();
        parcel.writeInt(size);
        for (int i10 = 0; i10 < size; i10++) {
            C2391d c2391d = (C2391d) list.get(i10);
            parcel.writeInt(c2391d.f34081a);
            parcel.writeLong(c2391d.f34082b);
            parcel.writeLong(c2391d.f34083c);
        }
        parcel.writeByte(this.f34092i ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f34093j);
        parcel.writeInt(this.k);
        parcel.writeInt(this.f34094l);
        parcel.writeInt(this.f34095m);
    }

    public C2392e(Parcel parcel) {
        this.f34084a = parcel.readLong();
        this.f34085b = parcel.readByte() == 1;
        this.f34086c = parcel.readByte() == 1;
        this.f34087d = parcel.readByte() == 1;
        this.f34088e = parcel.readByte() == 1;
        this.f34089f = parcel.readLong();
        this.f34090g = parcel.readLong();
        int i5 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i5);
        for (int i10 = 0; i10 < i5; i10++) {
            arrayList.add(new C2391d(parcel.readInt(), parcel.readLong(), parcel.readLong()));
        }
        this.f34091h = DesugarCollections.unmodifiableList(arrayList);
        this.f34092i = parcel.readByte() == 1;
        this.f34093j = parcel.readLong();
        this.k = parcel.readInt();
        this.f34094l = parcel.readInt();
        this.f34095m = parcel.readInt();
    }
}
