package K8;

import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import f7.AbstractC2614a;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class w extends AbstractC2614a {
    public static final Parcelable.Creator<w> CREATOR = new C0691c(6);

    /* renamed from: a, reason: collision with root package name */
    public final List f6681a;

    /* renamed from: b, reason: collision with root package name */
    public final List f6682b;

    public w(ArrayList arrayList, ArrayList arrayList2) {
        this.f6681a = arrayList == null ? new ArrayList() : arrayList;
        this.f6682b = arrayList2 == null ? new ArrayList() : arrayList2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.e0(parcel, 1, this.f6681a, false);
        AbstractC1304a.e0(parcel, 2, this.f6682b, false);
        AbstractC1304a.m0(iL0, parcel);
    }
}
