package j7;

import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC1732v;
import f7.AbstractC2614a;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: j7.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3088a extends AbstractC2614a {
    public static final Parcelable.Creator<C3088a> CREATOR = new C3090c();

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f38668a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f38669b;

    /* renamed from: c, reason: collision with root package name */
    public final String f38670c;

    /* renamed from: d, reason: collision with root package name */
    public final String f38671d;

    public C3088a(ArrayList arrayList, boolean z2, String str, String str2) {
        AbstractC1732v.i(arrayList);
        this.f38668a = arrayList;
        this.f38669b = z2;
        this.f38670c = str;
        this.f38671d = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C3088a)) {
            return false;
        }
        C3088a c3088a = (C3088a) obj;
        return this.f38669b == c3088a.f38669b && AbstractC1732v.m(this.f38668a, c3088a.f38668a) && AbstractC1732v.m(this.f38670c, c3088a.f38670c) && AbstractC1732v.m(this.f38671d, c3088a.f38671d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f38669b), this.f38668a, this.f38670c, this.f38671d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.e0(parcel, 1, this.f38668a, false);
        AbstractC1304a.k0(parcel, 2, 4);
        parcel.writeInt(this.f38669b ? 1 : 0);
        AbstractC1304a.a0(parcel, 3, this.f38670c, false);
        AbstractC1304a.a0(parcel, 4, this.f38671d, false);
        AbstractC1304a.m0(iL0, parcel);
    }
}
