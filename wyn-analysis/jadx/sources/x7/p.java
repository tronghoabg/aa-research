package x7;

import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import f7.AbstractC2614a;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import w7.C4381i;

/* loaded from: classes4.dex */
public final class p extends AbstractC2614a {
    public static final Parcelable.Creator<p> CREATOR = new C4381i(13);

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f47806a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f47807b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f47808c;

    public p(ArrayList arrayList, boolean z2, boolean z10) {
        this.f47806a = arrayList;
        this.f47807b = z2;
        this.f47808c = z10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.e0(parcel, 1, DesugarCollections.unmodifiableList(this.f47806a), false);
        AbstractC1304a.k0(parcel, 2, 4);
        parcel.writeInt(this.f47807b ? 1 : 0);
        AbstractC1304a.k0(parcel, 3, 4);
        parcel.writeInt(this.f47808c ? 1 : 0);
        AbstractC1304a.m0(iL0, parcel);
    }
}
