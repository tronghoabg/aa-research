package v7;

import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC1732v;
import f4.C2555b;
import f7.AbstractC2614a;
import java.util.Arrays;

/* renamed from: v7.x, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4329x extends AbstractC2614a {
    public static final Parcelable.Creator<C4329x> CREATOR = new C2555b(28);

    /* renamed from: a, reason: collision with root package name */
    public final String f47003a;

    /* renamed from: b, reason: collision with root package name */
    public final String f47004b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f47005c;

    /* renamed from: d, reason: collision with root package name */
    public final C4316j f47006d;

    /* renamed from: e, reason: collision with root package name */
    public final C4315i f47007e;

    /* renamed from: f, reason: collision with root package name */
    public final C4317k f47008f;

    /* renamed from: g, reason: collision with root package name */
    public final C4313g f47009g;

    /* renamed from: h, reason: collision with root package name */
    public final String f47010h;

    public C4329x(String str, String str2, byte[] bArr, C4316j c4316j, C4315i c4315i, C4317k c4317k, C4313g c4313g, String str3) {
        boolean z2 = true;
        if ((c4316j == null || c4315i != null || c4317k != null) && ((c4316j != null || c4315i == null || c4317k != null) && (c4316j != null || c4315i != null || c4317k == null))) {
            z2 = false;
        }
        AbstractC1732v.b(z2);
        this.f47003a = str;
        this.f47004b = str2;
        this.f47005c = bArr;
        this.f47006d = c4316j;
        this.f47007e = c4315i;
        this.f47008f = c4317k;
        this.f47009g = c4313g;
        this.f47010h = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4329x)) {
            return false;
        }
        C4329x c4329x = (C4329x) obj;
        return AbstractC1732v.m(this.f47003a, c4329x.f47003a) && AbstractC1732v.m(this.f47004b, c4329x.f47004b) && Arrays.equals(this.f47005c, c4329x.f47005c) && AbstractC1732v.m(this.f47006d, c4329x.f47006d) && AbstractC1732v.m(this.f47007e, c4329x.f47007e) && AbstractC1732v.m(this.f47008f, c4329x.f47008f) && AbstractC1732v.m(this.f47009g, c4329x.f47009g) && AbstractC1732v.m(this.f47010h, c4329x.f47010h);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f47003a, this.f47004b, this.f47005c, this.f47007e, this.f47006d, this.f47008f, this.f47009g, this.f47010h});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.a0(parcel, 1, this.f47003a, false);
        AbstractC1304a.a0(parcel, 2, this.f47004b, false);
        AbstractC1304a.T(parcel, 3, this.f47005c, false);
        AbstractC1304a.Z(parcel, 4, this.f47006d, i5, false);
        AbstractC1304a.Z(parcel, 5, this.f47007e, i5, false);
        AbstractC1304a.Z(parcel, 6, this.f47008f, i5, false);
        AbstractC1304a.Z(parcel, 7, this.f47009g, i5, false);
        AbstractC1304a.a0(parcel, 8, this.f47010h, false);
        AbstractC1304a.m0(iL0, parcel);
    }
}
