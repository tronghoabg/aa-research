package F7;

import D6.B1;
import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.t;
import f7.AbstractC2614a;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class e extends AbstractC2614a implements t {
    public static final Parcelable.Creator<e> CREATOR = new B1(9);

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f4024a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4025b;

    public e(String str, ArrayList arrayList) {
        this.f4024a = arrayList;
        this.f4025b = str;
    }

    @Override // com.google.android.gms.common.api.t
    public final Status getStatus() {
        return this.f4025b != null ? Status.f26424e : Status.f26428i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.c0(parcel, 1, this.f4024a);
        AbstractC1304a.a0(parcel, 2, this.f4025b, false);
        AbstractC1304a.m0(iL0, parcel);
    }
}
