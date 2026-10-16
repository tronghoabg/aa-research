package I2;

import android.os.Parcel;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final long f5306a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f5307b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f5308c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f5309d;

    /* renamed from: e, reason: collision with root package name */
    public final long f5310e;

    /* renamed from: f, reason: collision with root package name */
    public final List f5311f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f5312g;

    /* renamed from: h, reason: collision with root package name */
    public final long f5313h;

    /* renamed from: i, reason: collision with root package name */
    public final int f5314i;

    /* renamed from: j, reason: collision with root package name */
    public final int f5315j;
    public final int k;

    public i(long j8, boolean z2, boolean z10, boolean z11, ArrayList arrayList, long j10, boolean z12, long j11, int i5, int i10, int i11) {
        this.f5306a = j8;
        this.f5307b = z2;
        this.f5308c = z10;
        this.f5309d = z11;
        this.f5311f = DesugarCollections.unmodifiableList(arrayList);
        this.f5310e = j10;
        this.f5312g = z12;
        this.f5313h = j11;
        this.f5314i = i5;
        this.f5315j = i10;
        this.k = i11;
    }

    public i(Parcel parcel) {
        this.f5306a = parcel.readLong();
        this.f5307b = parcel.readByte() == 1;
        this.f5308c = parcel.readByte() == 1;
        this.f5309d = parcel.readByte() == 1;
        int i5 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i5);
        for (int i10 = 0; i10 < i5; i10++) {
            arrayList.add(new h(parcel.readInt(), parcel.readLong()));
        }
        this.f5311f = DesugarCollections.unmodifiableList(arrayList);
        this.f5310e = parcel.readLong();
        this.f5312g = parcel.readByte() == 1;
        this.f5313h = parcel.readLong();
        this.f5314i = parcel.readInt();
        this.f5315j = parcel.readInt();
        this.k = parcel.readInt();
    }
}
