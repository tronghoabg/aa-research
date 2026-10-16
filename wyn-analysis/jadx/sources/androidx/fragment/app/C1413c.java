package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: androidx.fragment.app.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1413c implements Parcelable {
    public static final Parcelable.Creator<C1413c> CREATOR = new Z6.c(10);

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f18383a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f18384b;

    public C1413c(Parcel parcel) {
        this.f18383a = parcel.createStringArrayList();
        this.f18384b = parcel.createTypedArrayList(C1411b.CREATOR);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        parcel.writeStringList(this.f18383a);
        parcel.writeTypedList(this.f18384b);
    }
}
