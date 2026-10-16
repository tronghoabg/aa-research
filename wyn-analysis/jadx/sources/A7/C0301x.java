package A7;

import Va.M6;
import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC1732v;
import f7.AbstractC2614a;

/* renamed from: A7.x, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0301x extends AbstractC2614a {
    public static final Parcelable.Creator<C0301x> CREATOR = new A6.j(5);

    /* renamed from: a, reason: collision with root package name */
    public final String f1103a;

    /* renamed from: b, reason: collision with root package name */
    public final C0298w f1104b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1105c;

    /* renamed from: d, reason: collision with root package name */
    public final long f1106d;

    public C0301x(C0301x c0301x, long j8) {
        AbstractC1732v.i(c0301x);
        this.f1103a = c0301x.f1103a;
        this.f1104b = c0301x.f1104b;
        this.f1105c = c0301x.f1105c;
        this.f1106d = j8;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f1104b);
        StringBuilder sb2 = new StringBuilder("origin=");
        sb2.append(this.f1105c);
        sb2.append(",name=");
        return M6.t(sb2, this.f1103a, ",params=", strValueOf);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.a0(parcel, 2, this.f1103a, false);
        AbstractC1304a.Z(parcel, 3, this.f1104b, i5, false);
        AbstractC1304a.a0(parcel, 4, this.f1105c, false);
        AbstractC1304a.k0(parcel, 5, 8);
        parcel.writeLong(this.f1106d);
        AbstractC1304a.m0(iL0, parcel);
    }

    public C0301x(String str, C0298w c0298w, String str2, long j8) {
        this.f1103a = str;
        this.f1104b = c0298w;
        this.f1105c = str2;
        this.f1106d = j8;
    }
}
