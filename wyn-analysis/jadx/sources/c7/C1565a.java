package c7;

import a.AbstractC1304a;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import f7.AbstractC2614a;

/* renamed from: c7.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1565a extends AbstractC2614a {
    public static final Parcelable.Creator<C1565a> CREATOR = new C1567c(0);

    /* renamed from: a, reason: collision with root package name */
    public final Intent f19670a;

    public C1565a(Intent intent) {
        this.f19670a = intent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.Z(parcel, 1, this.f19670a, i5, false);
        AbstractC1304a.m0(iL0, parcel);
    }
}
