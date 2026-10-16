package c7;

import U8.v0;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: c7.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1567c implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19681a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f19681a) {
            case 0:
                int iO0 = v0.o0(parcel);
                Intent intent = null;
                while (parcel.dataPosition() < iO0) {
                    int i5 = parcel.readInt();
                    if (((char) i5) != 1) {
                        v0.m0(i5, parcel);
                    } else {
                        intent = (Intent) v0.x(parcel, i5, Intent.CREATOR);
                    }
                }
                v0.D(iO0, parcel);
                return new C1565a(intent);
            default:
                return new C1571g(parcel.readStrongBinder());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i5) {
        switch (this.f19681a) {
            case 0:
                return new C1565a[i5];
            default:
                return new C1571g[i5];
        }
    }
}
