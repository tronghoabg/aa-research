package v7;

import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.internal.fido.zzao;
import f7.AbstractC2614a;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class L extends AbstractC2614a {
    public static final Parcelable.Creator<L> CREATOR = new U(7);

    /* renamed from: a, reason: collision with root package name */
    public final J f46930a;

    /* renamed from: b, reason: collision with root package name */
    public final String f46931b;

    static {
        new L("supported", null);
        new L("not-supported", null);
    }

    public L(String str, String str2) {
        AbstractC1732v.i(str);
        try {
            this.f46930a = J.c(str);
            this.f46931b = str2;
        } catch (K e7) {
            throw new IllegalArgumentException(e7);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof L)) {
            return false;
        }
        L l10 = (L) obj;
        return zzao.zza(this.f46930a, l10.f46930a) && zzao.zza(this.f46931b, l10.f46931b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f46930a, this.f46931b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.a0(parcel, 2, this.f46930a.f46929a, false);
        AbstractC1304a.a0(parcel, 3, this.f46931b, false);
        AbstractC1304a.m0(iL0, parcel);
    }
}
