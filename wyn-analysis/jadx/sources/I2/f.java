package I2;

import Va.M6;
import android.os.Parcel;
import android.os.Parcelable;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class f extends b {
    public static final Parcelable.Creator<f> CREATOR = new d(0);

    /* renamed from: a, reason: collision with root package name */
    public final long f5292a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f5293b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f5294c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f5295d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f5296e;

    /* renamed from: f, reason: collision with root package name */
    public final long f5297f;

    /* renamed from: g, reason: collision with root package name */
    public final long f5298g;

    /* renamed from: h, reason: collision with root package name */
    public final List f5299h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f5300i;

    /* renamed from: j, reason: collision with root package name */
    public final long f5301j;
    public final int k;

    /* renamed from: l, reason: collision with root package name */
    public final int f5302l;

    /* renamed from: m, reason: collision with root package name */
    public final int f5303m;

    public f(long j8, boolean z2, boolean z10, boolean z11, boolean z12, long j10, long j11, List list, boolean z13, long j12, int i5, int i10, int i11) {
        this.f5292a = j8;
        this.f5293b = z2;
        this.f5294c = z10;
        this.f5295d = z11;
        this.f5296e = z12;
        this.f5297f = j10;
        this.f5298g = j11;
        this.f5299h = DesugarCollections.unmodifiableList(list);
        this.f5300i = z13;
        this.f5301j = j12;
        this.k = i5;
        this.f5302l = i10;
        this.f5303m = i11;
    }

    @Override // I2.b
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SCTE-35 SpliceInsertCommand { programSplicePts=");
        sb2.append(this.f5297f);
        sb2.append(", programSplicePlaybackPositionUs= ");
        return M6.s(sb2, this.f5298g, " }");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        parcel.writeLong(this.f5292a);
        parcel.writeByte(this.f5293b ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f5294c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f5295d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f5296e ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f5297f);
        parcel.writeLong(this.f5298g);
        List list = this.f5299h;
        int size = list.size();
        parcel.writeInt(size);
        for (int i10 = 0; i10 < size; i10++) {
            e eVar = (e) list.get(i10);
            parcel.writeInt(eVar.f5289a);
            parcel.writeLong(eVar.f5290b);
            parcel.writeLong(eVar.f5291c);
        }
        parcel.writeByte(this.f5300i ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f5301j);
        parcel.writeInt(this.k);
        parcel.writeInt(this.f5302l);
        parcel.writeInt(this.f5303m);
    }

    public f(Parcel parcel) {
        this.f5292a = parcel.readLong();
        this.f5293b = parcel.readByte() == 1;
        this.f5294c = parcel.readByte() == 1;
        this.f5295d = parcel.readByte() == 1;
        this.f5296e = parcel.readByte() == 1;
        this.f5297f = parcel.readLong();
        this.f5298g = parcel.readLong();
        int i5 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i5);
        for (int i10 = 0; i10 < i5; i10++) {
            arrayList.add(new e(parcel.readInt(), parcel.readLong(), parcel.readLong()));
        }
        this.f5299h = DesugarCollections.unmodifiableList(arrayList);
        this.f5300i = parcel.readByte() == 1;
        this.f5301j = parcel.readLong();
        this.k = parcel.readInt();
        this.f5302l = parcel.readInt();
        this.f5303m = parcel.readInt();
    }
}
