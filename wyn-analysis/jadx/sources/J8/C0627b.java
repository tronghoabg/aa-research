package J8;

import G6.C0549m;
import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import f7.AbstractC2614a;

/* renamed from: J8.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0627b extends AbstractC2614a {
    public static final Parcelable.Creator<C0627b> CREATOR = new I2.d(7);

    /* renamed from: a, reason: collision with root package name */
    public final String f5784a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5785b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5786c;

    /* renamed from: d, reason: collision with root package name */
    public final String f5787d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f5788e;

    /* renamed from: f, reason: collision with root package name */
    public final String f5789f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f5790g;

    /* renamed from: h, reason: collision with root package name */
    public String f5791h;

    /* renamed from: i, reason: collision with root package name */
    public int f5792i;

    /* renamed from: j, reason: collision with root package name */
    public final String f5793j;
    public final String k;

    public C0627b(C0549m c0549m) {
        this.f5784a = c0549m.f4618a;
        this.f5785b = c0549m.f4619b;
        this.f5786c = null;
        this.f5787d = c0549m.f4620c;
        this.f5788e = c0549m.f4621d;
        this.f5789f = (String) c0549m.f4623f;
        this.f5790g = c0549m.f4622e;
        this.f5793j = (String) c0549m.f4624g;
        this.k = null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.a0(parcel, 1, this.f5784a, false);
        AbstractC1304a.a0(parcel, 2, this.f5785b, false);
        AbstractC1304a.a0(parcel, 3, this.f5786c, false);
        AbstractC1304a.a0(parcel, 4, this.f5787d, false);
        AbstractC1304a.k0(parcel, 5, 4);
        parcel.writeInt(this.f5788e ? 1 : 0);
        AbstractC1304a.a0(parcel, 6, this.f5789f, false);
        AbstractC1304a.k0(parcel, 7, 4);
        parcel.writeInt(this.f5790g ? 1 : 0);
        AbstractC1304a.a0(parcel, 8, this.f5791h, false);
        int i10 = this.f5792i;
        AbstractC1304a.k0(parcel, 9, 4);
        parcel.writeInt(i10);
        AbstractC1304a.a0(parcel, 10, this.f5793j, false);
        AbstractC1304a.a0(parcel, 11, this.k, false);
        AbstractC1304a.m0(iL0, parcel);
    }

    public C0627b(String str, String str2, String str3, String str4, boolean z2, String str5, boolean z10, String str6, int i5, String str7, String str8) {
        this.f5784a = str;
        this.f5785b = str2;
        this.f5786c = str3;
        this.f5787d = str4;
        this.f5788e = z2;
        this.f5789f = str5;
        this.f5790g = z10;
        this.f5791h = str6;
        this.f5792i = i5;
        this.f5793j = str7;
        this.k = str8;
    }
}
