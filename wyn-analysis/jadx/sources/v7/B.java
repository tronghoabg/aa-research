package v7;

import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC1732v;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class B extends AbstractC4318l {
    public static final Parcelable.Creator<B> CREATOR = new U(1);

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f46905a;

    /* renamed from: b, reason: collision with root package name */
    public final Double f46906b;

    /* renamed from: c, reason: collision with root package name */
    public final String f46907c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f46908d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f46909e;

    /* renamed from: f, reason: collision with root package name */
    public final L f46910f;

    /* renamed from: g, reason: collision with root package name */
    public final W f46911g;

    /* renamed from: h, reason: collision with root package name */
    public final C4312f f46912h;

    /* renamed from: i, reason: collision with root package name */
    public final Long f46913i;

    public B(byte[] bArr, Double d3, String str, ArrayList arrayList, Integer num, L l10, String str2, C4312f c4312f, Long l11) {
        AbstractC1732v.i(bArr);
        this.f46905a = bArr;
        this.f46906b = d3;
        AbstractC1732v.i(str);
        this.f46907c = str;
        this.f46908d = arrayList;
        this.f46909e = num;
        this.f46910f = l10;
        this.f46913i = l11;
        if (str2 != null) {
            try {
                this.f46911g = W.c(str2);
            } catch (V e7) {
                throw new IllegalArgumentException(e7);
            }
        } else {
            this.f46911g = null;
        }
        this.f46912h = c4312f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof B)) {
            return false;
        }
        B b5 = (B) obj;
        if (!Arrays.equals(this.f46905a, b5.f46905a) || !AbstractC1732v.m(this.f46906b, b5.f46906b) || !AbstractC1732v.m(this.f46907c, b5.f46907c)) {
            return false;
        }
        ArrayList arrayList = this.f46908d;
        ArrayList arrayList2 = b5.f46908d;
        return ((arrayList == null && arrayList2 == null) || (arrayList != null && arrayList2 != null && arrayList.containsAll(arrayList2) && arrayList2.containsAll(arrayList))) && AbstractC1732v.m(this.f46909e, b5.f46909e) && AbstractC1732v.m(this.f46910f, b5.f46910f) && AbstractC1732v.m(this.f46911g, b5.f46911g) && AbstractC1732v.m(this.f46912h, b5.f46912h) && AbstractC1732v.m(this.f46913i, b5.f46913i);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.f46905a)), this.f46906b, this.f46907c, this.f46908d, this.f46909e, this.f46910f, this.f46911g, this.f46912h, this.f46913i});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.T(parcel, 2, this.f46905a, false);
        AbstractC1304a.U(parcel, 3, this.f46906b);
        AbstractC1304a.a0(parcel, 4, this.f46907c, false);
        AbstractC1304a.e0(parcel, 5, this.f46908d, false);
        AbstractC1304a.X(parcel, 6, this.f46909e);
        AbstractC1304a.Z(parcel, 7, this.f46910f, i5, false);
        W w2 = this.f46911g;
        AbstractC1304a.a0(parcel, 8, w2 == null ? null : w2.f46943a, false);
        AbstractC1304a.Z(parcel, 9, this.f46912h, i5, false);
        AbstractC1304a.Y(parcel, 10, this.f46913i);
        AbstractC1304a.m0(iL0, parcel);
    }
}
