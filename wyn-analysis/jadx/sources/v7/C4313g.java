package v7;

import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC1732v;
import f7.AbstractC2614a;
import java.util.Arrays;

/* renamed from: v7.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4313g extends AbstractC2614a {
    public static final Parcelable.Creator<C4313g> CREATOR = new U(13);

    /* renamed from: a, reason: collision with root package name */
    public final N f46969a;

    /* renamed from: b, reason: collision with root package name */
    public final X f46970b;

    /* renamed from: c, reason: collision with root package name */
    public final C4314h f46971c;

    /* renamed from: d, reason: collision with root package name */
    public final Y f46972d;

    public C4313g(N n10, X x5, C4314h c4314h, Y y10) {
        this.f46969a = n10;
        this.f46970b = x5;
        this.f46971c = c4314h;
        this.f46972d = y10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4313g)) {
            return false;
        }
        C4313g c4313g = (C4313g) obj;
        return AbstractC1732v.m(this.f46969a, c4313g.f46969a) && AbstractC1732v.m(this.f46970b, c4313g.f46970b) && AbstractC1732v.m(this.f46971c, c4313g.f46971c) && AbstractC1732v.m(this.f46972d, c4313g.f46972d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f46969a, this.f46970b, this.f46971c, this.f46972d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.Z(parcel, 1, this.f46969a, i5, false);
        AbstractC1304a.Z(parcel, 2, this.f46970b, i5, false);
        AbstractC1304a.Z(parcel, 3, this.f46971c, i5, false);
        AbstractC1304a.Z(parcel, 4, this.f46972d, i5, false);
        AbstractC1304a.m0(iL0, parcel);
    }
}
