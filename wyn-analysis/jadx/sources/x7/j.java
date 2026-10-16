package x7;

import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import f7.AbstractC2614a;
import java.util.ArrayList;
import w7.C4381i;

/* loaded from: classes4.dex */
public final class j extends AbstractC2614a {
    public static final Parcelable.Creator<j> CREATOR = new C4381i(25);

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f47786a;

    /* renamed from: b, reason: collision with root package name */
    public final int f47787b;

    /* renamed from: c, reason: collision with root package name */
    public final String f47788c;

    public j(int i5, String str, ArrayList arrayList) {
        this.f47786a = arrayList;
        this.f47787b = i5;
        this.f47788c = str;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f47786a);
        int length = strValueOf.length();
        int i5 = this.f47787b;
        StringBuilder sb2 = new StringBuilder(length + 45 + String.valueOf(i5).length() + 1);
        sb2.append("GeofencingRequest[geofences=");
        sb2.append(strValueOf);
        sb2.append(", initialTrigger=");
        sb2.append(i5);
        sb2.append("]");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.e0(parcel, 1, this.f47786a, false);
        AbstractC1304a.k0(parcel, 2, 4);
        parcel.writeInt(this.f47787b);
        AbstractC1304a.a0(parcel, 4, this.f47788c, false);
        AbstractC1304a.m0(iL0, parcel);
    }
}
