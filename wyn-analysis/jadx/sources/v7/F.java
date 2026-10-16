package v7;

import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC1732v;
import f7.AbstractC2614a;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class F extends AbstractC2614a {
    public static final Parcelable.Creator<F> CREATOR = new U(4);

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f46918a;

    /* renamed from: b, reason: collision with root package name */
    public final String f46919b;

    /* renamed from: c, reason: collision with root package name */
    public final String f46920c;

    /* renamed from: d, reason: collision with root package name */
    public final String f46921d;

    public F(String str, String str2, String str3, byte[] bArr) {
        AbstractC1732v.i(bArr);
        this.f46918a = bArr;
        AbstractC1732v.i(str);
        this.f46919b = str;
        this.f46920c = str2;
        AbstractC1732v.i(str3);
        this.f46921d = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof F)) {
            return false;
        }
        F f10 = (F) obj;
        return Arrays.equals(this.f46918a, f10.f46918a) && AbstractC1732v.m(this.f46919b, f10.f46919b) && AbstractC1732v.m(this.f46920c, f10.f46920c) && AbstractC1732v.m(this.f46921d, f10.f46921d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f46918a, this.f46919b, this.f46920c, this.f46921d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.T(parcel, 2, this.f46918a, false);
        AbstractC1304a.a0(parcel, 3, this.f46919b, false);
        AbstractC1304a.a0(parcel, 4, this.f46920c, false);
        AbstractC1304a.a0(parcel, 5, this.f46921d, false);
        AbstractC1304a.m0(iL0, parcel);
    }
}
