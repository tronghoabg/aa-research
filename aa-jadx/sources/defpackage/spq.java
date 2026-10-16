package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class spq extends java.lang.RuntimeException {
    public spq(java.lang.String str, android.os.Parcel parcel) {
        super(str + " Parcel: pos=" + parcel.dataPosition() + " size=" + parcel.dataSize());
    }
}
