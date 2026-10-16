package X6;

import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC1732v;
import f7.AbstractC2614a;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class f extends AbstractC2614a {
    public static final Parcelable.Creator<f> CREATOR = new T6.f(12);

    /* renamed from: a, reason: collision with root package name */
    public final e f16142a;

    /* renamed from: b, reason: collision with root package name */
    public final b f16143b;

    /* renamed from: c, reason: collision with root package name */
    public final String f16144c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f16145d;

    /* renamed from: e, reason: collision with root package name */
    public final int f16146e;

    /* renamed from: f, reason: collision with root package name */
    public final d f16147f;

    /* renamed from: g, reason: collision with root package name */
    public final c f16148g;

    public f(e eVar, b bVar, String str, boolean z2, int i5, d dVar, c cVar) {
        AbstractC1732v.i(eVar);
        this.f16142a = eVar;
        AbstractC1732v.i(bVar);
        this.f16143b = bVar;
        this.f16144c = str;
        this.f16145d = z2;
        this.f16146e = i5;
        this.f16147f = dVar == null ? new d(null, null, false) : dVar;
        this.f16148g = cVar == null ? new c(false, null) : cVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return AbstractC1732v.m(this.f16142a, fVar.f16142a) && AbstractC1732v.m(this.f16143b, fVar.f16143b) && AbstractC1732v.m(this.f16147f, fVar.f16147f) && AbstractC1732v.m(this.f16148g, fVar.f16148g) && AbstractC1732v.m(this.f16144c, fVar.f16144c) && this.f16145d == fVar.f16145d && this.f16146e == fVar.f16146e;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f16142a, this.f16143b, this.f16147f, this.f16148g, this.f16144c, Boolean.valueOf(this.f16145d)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.Z(parcel, 1, this.f16142a, i5, false);
        AbstractC1304a.Z(parcel, 2, this.f16143b, i5, false);
        AbstractC1304a.a0(parcel, 3, this.f16144c, false);
        AbstractC1304a.k0(parcel, 4, 4);
        parcel.writeInt(this.f16145d ? 1 : 0);
        AbstractC1304a.k0(parcel, 5, 4);
        parcel.writeInt(this.f16146e);
        AbstractC1304a.Z(parcel, 6, this.f16147f, i5, false);
        AbstractC1304a.Z(parcel, 7, this.f16148g, i5, false);
        AbstractC1304a.m0(iL0, parcel);
    }
}
