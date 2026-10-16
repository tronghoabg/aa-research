package android.support.v4.media.a;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class t implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f412a;

    t(int i2) {
        this.f412a = i2;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i2 = this.f412a;
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? new y(parcel) : new z(parcel) : new w(parcel) : new s(parcel) : new u(parcel.readParcelable(null), null);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        int i3 = this.f412a;
        return i3 != 0 ? i3 != 1 ? i3 != 2 ? i3 != 3 ? new y[i2] : new z[i2] : new w[i2] : new s[i2] : new u[i2];
    }
}
