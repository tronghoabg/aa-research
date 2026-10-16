package android.support.v7.widget;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class df implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f1341a;

    df(int i2) {
        this.f1341a = i2;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i2 = this.f1341a;
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? new fv(parcel) : new ft(parcel) : new bb(parcel) : new dg(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        int i3 = this.f1341a;
        return i3 != 0 ? i3 != 1 ? i3 != 2 ? new fv[i2] : new ft[i2] : new bb[i2] : new dg[i2];
    }
}
