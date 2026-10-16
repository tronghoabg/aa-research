package K8;

import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import f7.AbstractC2614a;
import java.util.ArrayList;

/* renamed from: K8.j, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0698j extends AbstractC2614a {
    public static final Parcelable.Creator<C0698j> CREATOR = new C0691c(5);

    /* renamed from: a, reason: collision with root package name */
    public String f6652a;

    /* renamed from: b, reason: collision with root package name */
    public String f6653b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f6654c;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f6655d;

    /* renamed from: e, reason: collision with root package name */
    public C0693e f6656e;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.a0(parcel, 1, this.f6652a, false);
        AbstractC1304a.a0(parcel, 2, this.f6653b, false);
        AbstractC1304a.e0(parcel, 3, this.f6654c, false);
        AbstractC1304a.e0(parcel, 4, this.f6655d, false);
        AbstractC1304a.Z(parcel, 5, this.f6656e, i5, false);
        AbstractC1304a.m0(iL0, parcel);
    }
}
