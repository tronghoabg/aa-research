package X6;

import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC1732v;
import f7.AbstractC2614a;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class j extends AbstractC2614a {
    public static final Parcelable.Creator<j> CREATOR = new T6.f(15);

    /* renamed from: a, reason: collision with root package name */
    public final String f16151a;

    /* renamed from: b, reason: collision with root package name */
    public final String f16152b;

    /* renamed from: c, reason: collision with root package name */
    public final String f16153c;

    /* renamed from: d, reason: collision with root package name */
    public final String f16154d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f16155e;

    /* renamed from: f, reason: collision with root package name */
    public final int f16156f;

    public j(boolean z2, String str, String str2, String str3, String str4, int i5) {
        AbstractC1732v.i(str);
        this.f16151a = str;
        this.f16152b = str2;
        this.f16153c = str3;
        this.f16154d = str4;
        this.f16155e = z2;
        this.f16156f = i5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return AbstractC1732v.m(this.f16151a, jVar.f16151a) && AbstractC1732v.m(this.f16154d, jVar.f16154d) && AbstractC1732v.m(this.f16152b, jVar.f16152b) && AbstractC1732v.m(Boolean.valueOf(this.f16155e), Boolean.valueOf(jVar.f16155e)) && this.f16156f == jVar.f16156f;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f16151a, this.f16152b, this.f16154d, Boolean.valueOf(this.f16155e), Integer.valueOf(this.f16156f)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.a0(parcel, 1, this.f16151a, false);
        AbstractC1304a.a0(parcel, 2, this.f16152b, false);
        AbstractC1304a.a0(parcel, 3, this.f16153c, false);
        AbstractC1304a.a0(parcel, 4, this.f16154d, false);
        AbstractC1304a.k0(parcel, 5, 4);
        parcel.writeInt(this.f16155e ? 1 : 0);
        AbstractC1304a.k0(parcel, 6, 4);
        parcel.writeInt(this.f16156f);
        AbstractC1304a.m0(iL0, parcel);
    }
}
