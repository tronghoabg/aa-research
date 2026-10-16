package X6;

import a.AbstractC1304a;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC1732v;
import f7.AbstractC2614a;
import java.util.Arrays;
import v7.C4329x;

/* loaded from: classes3.dex */
public final class o extends AbstractC2614a {
    public static final Parcelable.Creator<o> CREATOR = new T6.f(24);

    /* renamed from: a, reason: collision with root package name */
    public final String f16162a;

    /* renamed from: b, reason: collision with root package name */
    public final String f16163b;

    /* renamed from: c, reason: collision with root package name */
    public final String f16164c;

    /* renamed from: d, reason: collision with root package name */
    public final String f16165d;

    /* renamed from: e, reason: collision with root package name */
    public final Uri f16166e;

    /* renamed from: f, reason: collision with root package name */
    public final String f16167f;

    /* renamed from: g, reason: collision with root package name */
    public final String f16168g;

    /* renamed from: h, reason: collision with root package name */
    public final String f16169h;

    /* renamed from: i, reason: collision with root package name */
    public final C4329x f16170i;

    public o(String str, String str2, String str3, String str4, Uri uri, String str5, String str6, String str7, C4329x c4329x) {
        AbstractC1732v.i(str);
        this.f16162a = str;
        this.f16163b = str2;
        this.f16164c = str3;
        this.f16165d = str4;
        this.f16166e = uri;
        this.f16167f = str5;
        this.f16168g = str6;
        this.f16169h = str7;
        this.f16170i = c4329x;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return AbstractC1732v.m(this.f16162a, oVar.f16162a) && AbstractC1732v.m(this.f16163b, oVar.f16163b) && AbstractC1732v.m(this.f16164c, oVar.f16164c) && AbstractC1732v.m(this.f16165d, oVar.f16165d) && AbstractC1732v.m(this.f16166e, oVar.f16166e) && AbstractC1732v.m(this.f16167f, oVar.f16167f) && AbstractC1732v.m(this.f16168g, oVar.f16168g) && AbstractC1732v.m(this.f16169h, oVar.f16169h) && AbstractC1732v.m(this.f16170i, oVar.f16170i);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f16162a, this.f16163b, this.f16164c, this.f16165d, this.f16166e, this.f16167f, this.f16168g, this.f16169h, this.f16170i});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.a0(parcel, 1, this.f16162a, false);
        AbstractC1304a.a0(parcel, 2, this.f16163b, false);
        AbstractC1304a.a0(parcel, 3, this.f16164c, false);
        AbstractC1304a.a0(parcel, 4, this.f16165d, false);
        AbstractC1304a.Z(parcel, 5, this.f16166e, i5, false);
        AbstractC1304a.a0(parcel, 6, this.f16167f, false);
        AbstractC1304a.a0(parcel, 7, this.f16168g, false);
        AbstractC1304a.a0(parcel, 8, this.f16169h, false);
        AbstractC1304a.Z(parcel, 9, this.f16170i, i5, false);
        AbstractC1304a.m0(iL0, parcel);
    }
}
