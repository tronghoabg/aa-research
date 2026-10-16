package T6;

import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC1732v;
import f7.AbstractC2614a;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class c extends AbstractC2614a {
    public static final Parcelable.Creator<c> CREATOR = new f(1);

    /* renamed from: a, reason: collision with root package name */
    public final int f11762a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f11763b;

    public c(ArrayList arrayList, int i5) {
        this.f11762a = i5;
        AbstractC1732v.i(arrayList);
        this.f11763b = arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.k0(parcel, 1, 4);
        parcel.writeInt(this.f11762a);
        AbstractC1304a.e0(parcel, 2, this.f11763b, false);
        AbstractC1304a.m0(iL0, parcel);
    }
}
