package v7;

import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC1732v;
import f4.C2555b;
import f7.AbstractC2614a;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class S extends AbstractC2614a {
    public static final Parcelable.Creator<S> CREATOR = new C2555b(25);

    /* renamed from: a, reason: collision with root package name */
    public final String f46939a;

    public S(String str) {
        AbstractC1732v.i(str);
        this.f46939a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof S) {
            return this.f46939a.equals(((S) obj).f46939a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f46939a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.a0(parcel, 1, this.f46939a, false);
        AbstractC1304a.m0(iL0, parcel);
    }
}
