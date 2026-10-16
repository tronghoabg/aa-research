package f9;

import a.AbstractC1304a;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import f4.C2555b;
import f7.AbstractC2614a;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class n extends AbstractC2614a {
    public static final Parcelable.Creator<n> CREATOR = new C2555b(2);

    /* renamed from: a, reason: collision with root package name */
    public final Uri f35260a;

    /* renamed from: b, reason: collision with root package name */
    public final Uri f35261b;

    /* renamed from: c, reason: collision with root package name */
    public final List f35262c;

    public n(Uri uri, Uri uri2, ArrayList arrayList) {
        this.f35260a = uri;
        this.f35261b = uri2;
        this.f35262c = arrayList == null ? new ArrayList() : arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.Z(parcel, 1, this.f35260a, i5, false);
        AbstractC1304a.Z(parcel, 2, this.f35261b, i5, false);
        AbstractC1304a.e0(parcel, 3, this.f35262c, false);
        AbstractC1304a.m0(iL0, parcel);
    }
}
