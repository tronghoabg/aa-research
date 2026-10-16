package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class c implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f222a;

    c(int i2) {
        this.f222a = i2;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i2 = this.f222a;
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? new cb(parcel) : new bw(parcel) : new bo(parcel) : new b(parcel) : new d(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        int i3 = this.f222a;
        return i3 != 0 ? i3 != 1 ? i3 != 2 ? i3 != 3 ? new cb[i2] : new bw[i2] : new bo[i2] : new b[i2] : new d[i2];
    }
}
