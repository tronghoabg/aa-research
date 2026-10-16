package A7;

import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC1732v;
import f7.AbstractC2614a;

/* loaded from: classes4.dex */
public final class R1 extends AbstractC2614a {
    public static final Parcelable.Creator<R1> CREATOR = new A6.j(7);

    /* renamed from: a, reason: collision with root package name */
    public final int f680a;

    /* renamed from: b, reason: collision with root package name */
    public final String f681b;

    /* renamed from: c, reason: collision with root package name */
    public final long f682c;

    /* renamed from: d, reason: collision with root package name */
    public final Long f683d;

    /* renamed from: e, reason: collision with root package name */
    public final String f684e;

    /* renamed from: f, reason: collision with root package name */
    public final String f685f;

    /* renamed from: g, reason: collision with root package name */
    public final Double f686g;

    public R1(int i5, String str, long j8, Long l10, Float f10, String str2, String str3, Double d3) {
        this.f680a = i5;
        this.f681b = str;
        this.f682c = j8;
        this.f683d = l10;
        if (i5 == 1) {
            this.f686g = f10 != null ? Double.valueOf(f10.doubleValue()) : null;
        } else {
            this.f686g = d3;
        }
        this.f684e = str2;
        this.f685f = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.k0(parcel, 1, 4);
        parcel.writeInt(this.f680a);
        AbstractC1304a.a0(parcel, 2, this.f681b, false);
        AbstractC1304a.k0(parcel, 3, 8);
        parcel.writeLong(this.f682c);
        AbstractC1304a.Y(parcel, 4, this.f683d);
        AbstractC1304a.a0(parcel, 6, this.f684e, false);
        AbstractC1304a.a0(parcel, 7, this.f685f, false);
        AbstractC1304a.U(parcel, 8, this.f686g);
        AbstractC1304a.m0(iL0, parcel);
    }

    public final Object zza() {
        Long l10 = this.f683d;
        if (l10 != null) {
            return l10;
        }
        Double d3 = this.f686g;
        if (d3 != null) {
            return d3;
        }
        String str = this.f684e;
        if (str != null) {
            return str;
        }
        return null;
    }

    public R1(long j8, Object obj, String str, String str2) {
        AbstractC1732v.f(str);
        this.f680a = 2;
        this.f681b = str;
        this.f682c = j8;
        this.f685f = str2;
        if (obj == null) {
            this.f683d = null;
            this.f686g = null;
            this.f684e = null;
            return;
        }
        if (obj instanceof Long) {
            this.f683d = (Long) obj;
            this.f686g = null;
            this.f684e = null;
        } else if (obj instanceof String) {
            this.f683d = null;
            this.f686g = null;
            this.f684e = (String) obj;
        } else {
            if (obj instanceof Double) {
                this.f683d = null;
                this.f686g = (Double) obj;
                this.f684e = null;
                return;
            }
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public R1(T1 t12) {
        String str = t12.f703c;
        this(t12.f704d, t12.f705e, str, t12.f702b);
    }
}
