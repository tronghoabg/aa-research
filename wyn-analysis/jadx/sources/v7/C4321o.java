package v7;

import a.AbstractC1304a;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC1732v;
import java.util.Arrays;

/* renamed from: v7.o, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4321o extends AbstractC4322p {
    public static final Parcelable.Creator<C4321o> CREATOR = new U(23);

    /* renamed from: a, reason: collision with root package name */
    public final B f46993a;

    /* renamed from: b, reason: collision with root package name */
    public final Uri f46994b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f46995c;

    public C4321o(B b5, Uri uri, byte[] bArr) {
        AbstractC1732v.i(b5);
        this.f46993a = b5;
        AbstractC1732v.i(uri);
        boolean z2 = true;
        AbstractC1732v.a("origin scheme must be non-empty", uri.getScheme() != null);
        AbstractC1732v.a("origin authority must be non-empty", uri.getAuthority() != null);
        this.f46994b = uri;
        if (bArr != null && bArr.length != 32) {
            z2 = false;
        }
        AbstractC1732v.a("clientDataHash must be 32 bytes long", z2);
        this.f46995c = bArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4321o)) {
            return false;
        }
        C4321o c4321o = (C4321o) obj;
        return AbstractC1732v.m(this.f46993a, c4321o.f46993a) && AbstractC1732v.m(this.f46994b, c4321o.f46994b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f46993a, this.f46994b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.Z(parcel, 2, this.f46993a, i5, false);
        AbstractC1304a.Z(parcel, 3, this.f46994b, i5, false);
        AbstractC1304a.T(parcel, 4, this.f46995c, false);
        AbstractC1304a.m0(iL0, parcel);
    }
}
