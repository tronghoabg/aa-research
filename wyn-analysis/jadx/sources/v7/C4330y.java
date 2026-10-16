package v7;

import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC1732v;
import f4.C2555b;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: v7.y, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4330y extends AbstractC4318l {
    public static final Parcelable.Creator<C4330y> CREATOR = new C2555b(27);

    /* renamed from: a, reason: collision with root package name */
    public final C f47011a;

    /* renamed from: b, reason: collision with root package name */
    public final F f47012b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f47013c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f47014d;

    /* renamed from: e, reason: collision with root package name */
    public final Double f47015e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f47016f;

    /* renamed from: g, reason: collision with root package name */
    public final C4319m f47017g;

    /* renamed from: h, reason: collision with root package name */
    public final Integer f47018h;

    /* renamed from: i, reason: collision with root package name */
    public final L f47019i;

    /* renamed from: j, reason: collision with root package name */
    public final EnumC4311e f47020j;
    public final C4312f k;

    public C4330y(C c10, F f10, byte[] bArr, ArrayList arrayList, Double d3, ArrayList arrayList2, C4319m c4319m, Integer num, L l10, String str, C4312f c4312f) {
        AbstractC1732v.i(c10);
        this.f47011a = c10;
        AbstractC1732v.i(f10);
        this.f47012b = f10;
        AbstractC1732v.i(bArr);
        this.f47013c = bArr;
        AbstractC1732v.i(arrayList);
        this.f47014d = arrayList;
        this.f47015e = d3;
        this.f47016f = arrayList2;
        this.f47017g = c4319m;
        this.f47018h = num;
        this.f47019i = l10;
        if (str != null) {
            try {
                this.f47020j = EnumC4311e.c(str);
            } catch (C4310d e7) {
                throw new IllegalArgumentException(e7);
            }
        } else {
            this.f47020j = null;
        }
        this.k = c4312f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4330y)) {
            return false;
        }
        C4330y c4330y = (C4330y) obj;
        if (!AbstractC1732v.m(this.f47011a, c4330y.f47011a) || !AbstractC1732v.m(this.f47012b, c4330y.f47012b) || !Arrays.equals(this.f47013c, c4330y.f47013c) || !AbstractC1732v.m(this.f47015e, c4330y.f47015e)) {
            return false;
        }
        ArrayList arrayList = this.f47014d;
        ArrayList arrayList2 = c4330y.f47014d;
        if (!arrayList.containsAll(arrayList2) || !arrayList2.containsAll(arrayList)) {
            return false;
        }
        ArrayList arrayList3 = this.f47016f;
        ArrayList arrayList4 = c4330y.f47016f;
        return ((arrayList3 == null && arrayList4 == null) || (arrayList3 != null && arrayList4 != null && arrayList3.containsAll(arrayList4) && arrayList4.containsAll(arrayList3))) && AbstractC1732v.m(this.f47017g, c4330y.f47017g) && AbstractC1732v.m(this.f47018h, c4330y.f47018h) && AbstractC1732v.m(this.f47019i, c4330y.f47019i) && AbstractC1732v.m(this.f47020j, c4330y.f47020j) && AbstractC1732v.m(this.k, c4330y.k);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f47011a, this.f47012b, Integer.valueOf(Arrays.hashCode(this.f47013c)), this.f47014d, this.f47015e, this.f47016f, this.f47017g, this.f47018h, this.f47019i, this.f47020j, this.k});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.Z(parcel, 2, this.f47011a, i5, false);
        AbstractC1304a.Z(parcel, 3, this.f47012b, i5, false);
        AbstractC1304a.T(parcel, 4, this.f47013c, false);
        AbstractC1304a.e0(parcel, 5, this.f47014d, false);
        AbstractC1304a.U(parcel, 6, this.f47015e);
        AbstractC1304a.e0(parcel, 7, this.f47016f, false);
        AbstractC1304a.Z(parcel, 8, this.f47017g, i5, false);
        AbstractC1304a.X(parcel, 9, this.f47018h);
        AbstractC1304a.Z(parcel, 10, this.f47019i, i5, false);
        EnumC4311e enumC4311e = this.f47020j;
        AbstractC1304a.a0(parcel, 11, enumC4311e == null ? null : enumC4311e.f46958a, false);
        AbstractC1304a.Z(parcel, 12, this.k, i5, false);
        AbstractC1304a.m0(iL0, parcel);
    }
}
