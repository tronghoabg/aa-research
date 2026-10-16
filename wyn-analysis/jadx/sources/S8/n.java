package s8;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes4.dex */
public final class n implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel source) {
        AbstractC3340k.e(source, "source");
        return new q(source.readLong(), source.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i5) {
        return new q[i5];
    }
}
