package d6;

import android.os.Parcel;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* renamed from: d6.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2395h {

    /* renamed from: a, reason: collision with root package name */
    public final long f34098a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f34099b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f34100c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f34101d;

    /* renamed from: e, reason: collision with root package name */
    public final long f34102e;

    /* renamed from: f, reason: collision with root package name */
    public final List f34103f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f34104g;

    /* renamed from: h, reason: collision with root package name */
    public final long f34105h;

    /* renamed from: i, reason: collision with root package name */
    public final int f34106i;

    /* renamed from: j, reason: collision with root package name */
    public final int f34107j;
    public final int k;

    public C2395h(long j8, boolean z2, boolean z10, boolean z11, ArrayList arrayList, long j10, boolean z12, long j11, int i5, int i10, int i11) {
        this.f34098a = j8;
        this.f34099b = z2;
        this.f34100c = z10;
        this.f34101d = z11;
        this.f34103f = DesugarCollections.unmodifiableList(arrayList);
        this.f34102e = j10;
        this.f34104g = z12;
        this.f34105h = j11;
        this.f34106i = i5;
        this.f34107j = i10;
        this.k = i11;
    }

    public C2395h(Parcel parcel) {
        this.f34098a = parcel.readLong();
        this.f34099b = parcel.readByte() == 1;
        this.f34100c = parcel.readByte() == 1;
        this.f34101d = parcel.readByte() == 1;
        int i5 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i5);
        for (int i10 = 0; i10 < i5; i10++) {
            arrayList.add(new C2394g(parcel.readInt(), parcel.readLong()));
        }
        this.f34103f = DesugarCollections.unmodifiableList(arrayList);
        this.f34102e = parcel.readLong();
        this.f34104g = parcel.readByte() == 1;
        this.f34105h = parcel.readLong();
        this.f34106i = parcel.readInt();
        this.f34107j = parcel.readInt();
        this.k = parcel.readInt();
    }
}
