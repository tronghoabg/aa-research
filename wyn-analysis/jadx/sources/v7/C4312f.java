package v7;

import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC1732v;
import f7.AbstractC2614a;
import java.util.Arrays;

/* renamed from: v7.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4312f extends AbstractC2614a {
    public static final Parcelable.Creator<C4312f> CREATOR = new U(14);

    /* renamed from: a, reason: collision with root package name */
    public final C4327v f46959a;

    /* renamed from: b, reason: collision with root package name */
    public final a0 f46960b;

    /* renamed from: c, reason: collision with root package name */
    public final M f46961c;

    /* renamed from: d, reason: collision with root package name */
    public final c0 f46962d;

    /* renamed from: e, reason: collision with root package name */
    public final P f46963e;

    /* renamed from: f, reason: collision with root package name */
    public final Q f46964f;

    /* renamed from: g, reason: collision with root package name */
    public final b0 f46965g;

    /* renamed from: h, reason: collision with root package name */
    public final S f46966h;

    /* renamed from: i, reason: collision with root package name */
    public final C4328w f46967i;

    /* renamed from: j, reason: collision with root package name */
    public final T f46968j;

    public C4312f(C4327v c4327v, a0 a0Var, M m10, c0 c0Var, P p10, Q q4, b0 b0Var, S s10, C4328w c4328w, T t10) {
        this.f46959a = c4327v;
        this.f46961c = m10;
        this.f46960b = a0Var;
        this.f46962d = c0Var;
        this.f46963e = p10;
        this.f46964f = q4;
        this.f46965g = b0Var;
        this.f46966h = s10;
        this.f46967i = c4328w;
        this.f46968j = t10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4312f)) {
            return false;
        }
        C4312f c4312f = (C4312f) obj;
        return AbstractC1732v.m(this.f46959a, c4312f.f46959a) && AbstractC1732v.m(this.f46960b, c4312f.f46960b) && AbstractC1732v.m(this.f46961c, c4312f.f46961c) && AbstractC1732v.m(this.f46962d, c4312f.f46962d) && AbstractC1732v.m(this.f46963e, c4312f.f46963e) && AbstractC1732v.m(this.f46964f, c4312f.f46964f) && AbstractC1732v.m(this.f46965g, c4312f.f46965g) && AbstractC1732v.m(this.f46966h, c4312f.f46966h) && AbstractC1732v.m(this.f46967i, c4312f.f46967i) && AbstractC1732v.m(this.f46968j, c4312f.f46968j);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f46959a, this.f46960b, this.f46961c, this.f46962d, this.f46963e, this.f46964f, this.f46965g, this.f46966h, this.f46967i, this.f46968j});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.Z(parcel, 2, this.f46959a, i5, false);
        AbstractC1304a.Z(parcel, 3, this.f46960b, i5, false);
        AbstractC1304a.Z(parcel, 4, this.f46961c, i5, false);
        AbstractC1304a.Z(parcel, 5, this.f46962d, i5, false);
        AbstractC1304a.Z(parcel, 6, this.f46963e, i5, false);
        AbstractC1304a.Z(parcel, 7, this.f46964f, i5, false);
        AbstractC1304a.Z(parcel, 8, this.f46965g, i5, false);
        AbstractC1304a.Z(parcel, 9, this.f46966h, i5, false);
        AbstractC1304a.Z(parcel, 10, this.f46967i, i5, false);
        AbstractC1304a.Z(parcel, 11, this.f46968j, i5, false);
        AbstractC1304a.m0(iL0, parcel);
    }
}
