package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public class de extends android.os.Binder implements defpackage.df {
    private final java.lang.ref.WeakReference a;

    public de(defpackage.dl dlVar) {
        attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
        this.a = new java.lang.ref.WeakReference(dlVar);
    }

    @Override // defpackage.df
    public final void a(android.support.v4.media.session.PlaybackStateCompat playbackStateCompat) throws android.os.RemoteException {
        defpackage.dl dlVar = (defpackage.dl) this.a.get();
        if (dlVar != null) {
            dlVar.g(2, playbackStateCompat, null);
        }
    }

    public void b(android.os.Bundle bundle) throws android.os.RemoteException {
        defpackage.dl dlVar = (defpackage.dl) this.a.get();
        if (dlVar != null) {
            dlVar.g(7, bundle, null);
        }
    }

    public void c(android.support.v4.media.MediaMetadataCompat mediaMetadataCompat) throws android.os.RemoteException {
        defpackage.dl dlVar = (defpackage.dl) this.a.get();
        if (dlVar != null) {
            dlVar.g(3, mediaMetadataCompat, null);
        }
    }

    public void d(java.util.List list) throws android.os.RemoteException {
        defpackage.dl dlVar = (defpackage.dl) this.a.get();
        if (dlVar != null) {
            dlVar.g(5, list, null);
        }
    }

    public void e(java.lang.CharSequence charSequence) throws android.os.RemoteException {
        defpackage.dl dlVar = (defpackage.dl) this.a.get();
        if (dlVar != null) {
            dlVar.g(6, charSequence, null);
        }
    }

    public void f() throws android.os.RemoteException {
        defpackage.dl dlVar = (defpackage.dl) this.a.get();
        if (dlVar != null) {
            dlVar.g(8, null, null);
        }
    }

    public void g(android.support.v4.media.session.ParcelableVolumeInfo parcelableVolumeInfo) throws android.os.RemoteException {
        defpackage.dn dnVar;
        defpackage.dl dlVar = (defpackage.dl) this.a.get();
        if (dlVar != null) {
            if (parcelableVolumeInfo != null) {
                int i = androidx.media.AudioAttributesCompat.b;
                android.media.AudioAttributes.Builder builder = new android.media.AudioAttributes.Builder();
                builder.setLegacyStreamType(parcelableVolumeInfo.b);
                builder.build();
                dnVar = new defpackage.dn(parcelableVolumeInfo.a);
            } else {
                dnVar = null;
            }
            dlVar.g(4, dnVar, null);
        }
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i > 0 && i <= 16777215) {
            parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
        }
        if (i == 1598968902) {
            parcel2.writeString("android.support.v4.media.session.IMediaControllerCallback");
            return true;
        }
        switch (i) {
            case 1:
                java.lang.String string = parcel.readString();
                android.os.Bundle bundle = (android.os.Bundle) defpackage.a.aW(parcel, android.os.Bundle.CREATOR);
                defpackage.dl dlVar = (defpackage.dl) this.a.get();
                if (dlVar != null) {
                    dlVar.g(1, string, bundle);
                }
                return true;
            case 2:
                f();
                return true;
            case 3:
                a((android.support.v4.media.session.PlaybackStateCompat) defpackage.a.aW(parcel, android.support.v4.media.session.PlaybackStateCompat.CREATOR));
                return true;
            case 4:
                c((android.support.v4.media.MediaMetadataCompat) defpackage.a.aW(parcel, android.support.v4.media.MediaMetadataCompat.CREATOR));
                return true;
            case 5:
                d(parcel.createTypedArrayList(android.support.v4.media.session.MediaSessionCompat.QueueItem.CREATOR));
                return true;
            case 6:
                e((java.lang.CharSequence) defpackage.a.aW(parcel, android.text.TextUtils.CHAR_SEQUENCE_CREATOR));
                return true;
            case 7:
                b((android.os.Bundle) defpackage.a.aW(parcel, android.os.Bundle.CREATOR));
                return true;
            case 8:
                g((android.support.v4.media.session.ParcelableVolumeInfo) defpackage.a.aW(parcel, android.support.v4.media.session.ParcelableVolumeInfo.CREATOR));
                return true;
            case 9:
                int i3 = parcel.readInt();
                defpackage.dl dlVar2 = (defpackage.dl) this.a.get();
                if (dlVar2 != null) {
                    dlVar2.g(9, java.lang.Integer.valueOf(i3), null);
                }
                return true;
            case 10:
                parcel.readInt();
                return true;
            case 11:
                boolean z = parcel.readInt() != 0;
                defpackage.dl dlVar3 = (defpackage.dl) this.a.get();
                if (dlVar3 != null) {
                    dlVar3.g(11, java.lang.Boolean.valueOf(z), null);
                }
                return true;
            case 12:
                int i4 = parcel.readInt();
                defpackage.dl dlVar4 = (defpackage.dl) this.a.get();
                if (dlVar4 != null) {
                    dlVar4.g(12, java.lang.Integer.valueOf(i4), null);
                }
                return true;
            case 13:
                defpackage.dl dlVar5 = (defpackage.dl) this.a.get();
                if (dlVar5 != null) {
                    dlVar5.g(13, null, null);
                }
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }

    @Override // android.os.IInterface
    public final android.os.IBinder asBinder() {
        return this;
    }
}
