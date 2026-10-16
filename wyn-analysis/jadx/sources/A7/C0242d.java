package A7;

import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC1732v;
import f7.AbstractC2614a;

/* renamed from: A7.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0242d extends AbstractC2614a {
    public static final Parcelable.Creator<C0242d> CREATOR = new A6.j(2);

    /* renamed from: a, reason: collision with root package name */
    public String f833a;

    /* renamed from: b, reason: collision with root package name */
    public String f834b;

    /* renamed from: c, reason: collision with root package name */
    public R1 f835c;

    /* renamed from: d, reason: collision with root package name */
    public long f836d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f837e;

    /* renamed from: f, reason: collision with root package name */
    public String f838f;

    /* renamed from: g, reason: collision with root package name */
    public final C0301x f839g;

    /* renamed from: h, reason: collision with root package name */
    public long f840h;

    /* renamed from: i, reason: collision with root package name */
    public C0301x f841i;

    /* renamed from: j, reason: collision with root package name */
    public final long f842j;
    public final C0301x k;

    public C0242d(C0242d c0242d) {
        AbstractC1732v.i(c0242d);
        this.f833a = c0242d.f833a;
        this.f834b = c0242d.f834b;
        this.f835c = c0242d.f835c;
        this.f836d = c0242d.f836d;
        this.f837e = c0242d.f837e;
        this.f838f = c0242d.f838f;
        this.f839g = c0242d.f839g;
        this.f840h = c0242d.f840h;
        this.f841i = c0242d.f841i;
        this.f842j = c0242d.f842j;
        this.k = c0242d.k;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.a0(parcel, 2, this.f833a, false);
        AbstractC1304a.a0(parcel, 3, this.f834b, false);
        AbstractC1304a.Z(parcel, 4, this.f835c, i5, false);
        long j8 = this.f836d;
        AbstractC1304a.k0(parcel, 5, 8);
        parcel.writeLong(j8);
        boolean z2 = this.f837e;
        AbstractC1304a.k0(parcel, 6, 4);
        parcel.writeInt(z2 ? 1 : 0);
        AbstractC1304a.a0(parcel, 7, this.f838f, false);
        AbstractC1304a.Z(parcel, 8, this.f839g, i5, false);
        long j10 = this.f840h;
        AbstractC1304a.k0(parcel, 9, 8);
        parcel.writeLong(j10);
        AbstractC1304a.Z(parcel, 10, this.f841i, i5, false);
        AbstractC1304a.k0(parcel, 11, 8);
        parcel.writeLong(this.f842j);
        AbstractC1304a.Z(parcel, 12, this.k, i5, false);
        AbstractC1304a.m0(iL0, parcel);
    }

    public C0242d(String str, String str2, R1 r12, long j8, boolean z2, String str3, C0301x c0301x, long j10, C0301x c0301x2, long j11, C0301x c0301x3) {
        this.f833a = str;
        this.f834b = str2;
        this.f835c = r12;
        this.f836d = j8;
        this.f837e = z2;
        this.f838f = str3;
        this.f839g = c0301x;
        this.f840h = j10;
        this.f841i = c0301x2;
        this.f842j = j11;
        this.k = c0301x3;
    }
}
