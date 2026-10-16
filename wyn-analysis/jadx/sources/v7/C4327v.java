package v7;

import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC1732v;
import f7.AbstractC2614a;
import java.util.Arrays;

/* renamed from: v7.v, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4327v extends AbstractC2614a {
    public static final Parcelable.Creator<C4327v> CREATOR = new U(29);

    /* renamed from: a, reason: collision with root package name */
    public final String f47001a;

    public C4327v(String str) {
        AbstractC1732v.i(str);
        this.f47001a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C4327v) {
            return this.f47001a.equals(((C4327v) obj).f47001a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f47001a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.a0(parcel, 2, this.f47001a, false);
        AbstractC1304a.m0(iL0, parcel);
    }
}
