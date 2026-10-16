package v7;

import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC1732v;
import f7.AbstractC2614a;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class C extends AbstractC2614a {
    public static final Parcelable.Creator<C> CREATOR = new U(2);

    /* renamed from: a, reason: collision with root package name */
    public final String f46914a;

    /* renamed from: b, reason: collision with root package name */
    public final String f46915b;

    /* renamed from: c, reason: collision with root package name */
    public final String f46916c;

    public C(String str, String str2, String str3) {
        AbstractC1732v.i(str);
        this.f46914a = str;
        AbstractC1732v.i(str2);
        this.f46915b = str2;
        this.f46916c = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C)) {
            return false;
        }
        C c10 = (C) obj;
        return AbstractC1732v.m(this.f46914a, c10.f46914a) && AbstractC1732v.m(this.f46915b, c10.f46915b) && AbstractC1732v.m(this.f46916c, c10.f46916c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f46914a, this.f46915b, this.f46916c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.a0(parcel, 2, this.f46914a, false);
        AbstractC1304a.a0(parcel, 3, this.f46915b, false);
        AbstractC1304a.a0(parcel, 4, this.f46916c, false);
        AbstractC1304a.m0(iL0, parcel);
    }
}
