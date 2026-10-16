package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qnp implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    @java.lang.Deprecated
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return new com.google.android.gms.analytics.internal.Command(parcel);
    }

    @Override // android.os.Parcelable.Creator
    @java.lang.Deprecated
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new com.google.android.gms.analytics.internal.Command[i];
    }
}
