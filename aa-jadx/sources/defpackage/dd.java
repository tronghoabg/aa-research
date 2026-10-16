package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class dd implements defpackage.df {
    private final android.os.IBinder a;

    public dd(android.os.IBinder iBinder) {
        this.a = iBinder;
    }

    @Override // defpackage.df
    public final void a(android.support.v4.media.session.PlaybackStateCompat playbackStateCompat) throws android.os.RemoteException {
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            if (playbackStateCompat != null) {
                parcelObtain.writeInt(1);
                playbackStateCompat.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.a.transact(3, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final android.os.IBinder asBinder() {
        return this.a;
    }
}
