package x7;

import Va.M6;
import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.internal.identity.ClientIdentity;
import com.google.android.gms.internal.identity.zzeo;
import f7.AbstractC2614a;
import java.util.Arrays;
import w7.C4381i;

/* renamed from: x7.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4492d extends AbstractC2614a {
    public static final Parcelable.Creator<C4492d> CREATOR = new C4381i(22);

    /* renamed from: a, reason: collision with root package name */
    public final long f47769a;

    /* renamed from: b, reason: collision with root package name */
    public final int f47770b;

    /* renamed from: c, reason: collision with root package name */
    public final int f47771c;

    /* renamed from: d, reason: collision with root package name */
    public final long f47772d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f47773e;

    /* renamed from: f, reason: collision with root package name */
    public final int f47774f;

    /* renamed from: g, reason: collision with root package name */
    public final WorkSource f47775g;

    /* renamed from: h, reason: collision with root package name */
    public final ClientIdentity f47776h;

    public C4492d(long j8, int i5, int i10, long j10, boolean z2, int i11, WorkSource workSource, ClientIdentity clientIdentity) {
        this.f47769a = j8;
        this.f47770b = i5;
        this.f47771c = i10;
        this.f47772d = j10;
        this.f47773e = z2;
        this.f47774f = i11;
        this.f47775g = workSource;
        this.f47776h = clientIdentity;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4492d)) {
            return false;
        }
        C4492d c4492d = (C4492d) obj;
        return this.f47769a == c4492d.f47769a && this.f47770b == c4492d.f47770b && this.f47771c == c4492d.f47771c && this.f47772d == c4492d.f47772d && this.f47773e == c4492d.f47773e && this.f47774f == c4492d.f47774f && AbstractC1732v.m(this.f47775g, c4492d.f47775g) && AbstractC1732v.m(this.f47776h, c4492d.f47776h);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f47769a), Integer.valueOf(this.f47770b), Integer.valueOf(this.f47771c), Long.valueOf(this.f47772d)});
    }

    public final String toString() {
        String str;
        StringBuilder sbJ = N0.a.j("CurrentLocationRequest[");
        sbJ.append(z.c(this.f47771c));
        long j8 = this.f47769a;
        if (j8 != Long.MAX_VALUE) {
            sbJ.append(", maxAge=");
            zzeo.zzc(j8, sbJ);
        }
        long j10 = this.f47772d;
        if (j10 != Long.MAX_VALUE) {
            M6.A(sbJ, ", duration=", j10, "ms");
        }
        int i5 = this.f47770b;
        if (i5 != 0) {
            sbJ.append(", ");
            sbJ.append(z.d(i5));
        }
        if (this.f47773e) {
            sbJ.append(", bypass");
        }
        int i10 = this.f47774f;
        if (i10 != 0) {
            sbJ.append(", ");
            if (i10 == 0) {
                str = "THROTTLE_BACKGROUND";
            } else if (i10 == 1) {
                str = "THROTTLE_ALWAYS";
            } else {
                if (i10 != 2) {
                    throw new IllegalArgumentException();
                }
                str = "THROTTLE_NEVER";
            }
            sbJ.append(str);
        }
        WorkSource workSource = this.f47775g;
        if (!n7.g.c(workSource)) {
            sbJ.append(", workSource=");
            sbJ.append(workSource);
        }
        ClientIdentity clientIdentity = this.f47776h;
        if (clientIdentity != null) {
            sbJ.append(", impersonation=");
            sbJ.append(clientIdentity);
        }
        sbJ.append(']');
        return sbJ.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.k0(parcel, 1, 8);
        parcel.writeLong(this.f47769a);
        AbstractC1304a.k0(parcel, 2, 4);
        parcel.writeInt(this.f47770b);
        AbstractC1304a.k0(parcel, 3, 4);
        parcel.writeInt(this.f47771c);
        AbstractC1304a.k0(parcel, 4, 8);
        parcel.writeLong(this.f47772d);
        AbstractC1304a.k0(parcel, 5, 4);
        parcel.writeInt(this.f47773e ? 1 : 0);
        AbstractC1304a.Z(parcel, 6, this.f47775g, i5, false);
        AbstractC1304a.k0(parcel, 7, 4);
        parcel.writeInt(this.f47774f);
        AbstractC1304a.Z(parcel, 9, this.f47776h, i5, false);
        AbstractC1304a.m0(iL0, parcel);
    }
}
