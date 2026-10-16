package v7;

import a.AbstractC1304a;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC1732v;
import java.util.Arrays;

/* renamed from: v7.n, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4320n extends AbstractC4322p {
    public static final Parcelable.Creator<C4320n> CREATOR = new U(22);

    /* renamed from: a, reason: collision with root package name */
    public final C4330y f46990a;

    /* renamed from: b, reason: collision with root package name */
    public final Uri f46991b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f46992c;

    public C4320n(C4330y c4330y, Uri uri, byte[] bArr) {
        AbstractC1732v.i(c4330y);
        this.f46990a = c4330y;
        AbstractC1732v.i(uri);
        boolean z2 = true;
        AbstractC1732v.a("origin scheme must be non-empty", uri.getScheme() != null);
        AbstractC1732v.a("origin authority must be non-empty", uri.getAuthority() != null);
        this.f46991b = uri;
        if (bArr != null && bArr.length != 32) {
            z2 = false;
        }
        AbstractC1732v.a("clientDataHash must be 32 bytes long", z2);
        this.f46992c = bArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4320n)) {
            return false;
        }
        C4320n c4320n = (C4320n) obj;
        return AbstractC1732v.m(this.f46990a, c4320n.f46990a) && AbstractC1732v.m(this.f46991b, c4320n.f46991b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f46990a, this.f46991b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.Z(parcel, 2, this.f46990a, i5, false);
        AbstractC1304a.Z(parcel, 3, this.f46991b, i5, false);
        AbstractC1304a.T(parcel, 4, this.f46992c, false);
        AbstractC1304a.m0(iL0, parcel);
    }
}
