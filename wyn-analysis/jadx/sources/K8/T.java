package K8;

import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.AbstractC1732v;
import f7.InterfaceC2616c;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class T implements InterfaceC2616c {
    public static final Parcelable.Creator<T> CREATOR = new C0691c(0);

    /* renamed from: a, reason: collision with root package name */
    public final C0693e f6611a;

    /* renamed from: b, reason: collision with root package name */
    public final Q f6612b;

    /* renamed from: c, reason: collision with root package name */
    public final J8.I f6613c;

    public T(C0693e c0693e) {
        AbstractC1732v.i(c0693e);
        this.f6611a = c0693e;
        ArrayList arrayList = c0693e.f6631e;
        this.f6612b = null;
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            if (!TextUtils.isEmpty(((U) arrayList.get(i5)).f6622i)) {
                this.f6612b = new Q(((U) arrayList.get(i5)).f6615b, ((U) arrayList.get(i5)).f6622i, c0693e.f6636j);
            }
        }
        if (this.f6612b == null) {
            this.f6612b = new Q(c0693e.f6636j);
        }
        this.f6613c = c0693e.k;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.Z(parcel, 1, this.f6611a, i5, false);
        AbstractC1304a.Z(parcel, 2, this.f6612b, i5, false);
        AbstractC1304a.Z(parcel, 3, this.f6613c, i5, false);
        AbstractC1304a.m0(iL0, parcel);
    }

    public T(C0693e c0693e, Q q4, J8.I i5) {
        this.f6611a = c0693e;
        this.f6612b = q4;
        this.f6613c = i5;
    }
}
