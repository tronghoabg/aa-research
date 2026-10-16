package defpackage;

import android.media.AudioAttributes;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.ParcelableVolumeInfo;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import androidx.media.AudioAttributesCompat;
import java.lang.ref.WeakReference;
import java.util.List;

/* loaded from: classes2.dex */
public class de extends Binder implements df {
    private final WeakReference a;

    public de(dl dlVar) {
        attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
        this.a = new WeakReference(dlVar);
    }

    @Override // defpackage.df
    public final void a(PlaybackStateCompat playbackStateCompat) throws RemoteException {
        dl dlVar = (dl) this.a.get();
        if (dlVar != null) {
            dlVar.g(2, playbackStateCompat, null);
        }
    }

    public void b(Bundle bundle) throws RemoteException {
        dl dlVar = (dl) this.a.get();
        if (dlVar != null) {
            dlVar.g(7, bundle, null);
        }
    }

    public void c(MediaMetadataCompat mediaMetadataCompat) throws RemoteException {
        dl dlVar = (dl) this.a.get();
        if (dlVar != null) {
            dlVar.g(3, mediaMetadataCompat, null);
        }
    }

    public void d(List list) throws RemoteException {
        dl dlVar = (dl) this.a.get();
        if (dlVar != null) {
            dlVar.g(5, list, null);
        }
    }

    public void e(CharSequence charSequence) throws RemoteException {
        dl dlVar = (dl) this.a.get();
        if (dlVar != null) {
            dlVar.g(6, charSequence, null);
        }
    }

    public void f() throws RemoteException {
        dl dlVar = (dl) this.a.get();
        if (dlVar != null) {
            dlVar.g(8, null, null);
        }
    }

    public void g(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException {
        dn dnVar;
        dl dlVar = (dl) this.a.get();
        if (dlVar != null) {
            if (parcelableVolumeInfo != null) {
                int i = AudioAttributesCompat.b;
                AudioAttributes.Builder builder = new AudioAttributes.Builder();
                builder.setLegacyStreamType(parcelableVolumeInfo.b);
                builder.build();
                dnVar = new dn(parcelableVolumeInfo.a);
            } else {
                dnVar = null;
            }
            dlVar.g(4, dnVar, null);
        }
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i > 0 && i <= 16777215) {
            parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
        }
        if (i == 1598968902) {
            parcel2.writeString("android.support.v4.media.session.IMediaControllerCallback");
            return true;
        }
        switch (i) {
            case 1:
                String string = parcel.readString();
                Bundle bundle = (Bundle) a.aX(parcel, Bundle.CREATOR);
                dl dlVar = (dl) this.a.get();
                if (dlVar != null) {
                    dlVar.g(1, string, bundle);
                }
                return true;
            case 2:
                f();
                return true;
            case 3:
                a((PlaybackStateCompat) a.aX(parcel, PlaybackStateCompat.CREATOR));
                return true;
            case 4:
                c((MediaMetadataCompat) a.aX(parcel, MediaMetadataCompat.CREATOR));
                return true;
            case 5:
                d(parcel.createTypedArrayList(MediaSessionCompat.QueueItem.CREATOR));
                return true;
            case 6:
                e((CharSequence) a.aX(parcel, TextUtils.CHAR_SEQUENCE_CREATOR));
                return true;
            case 7:
                b((Bundle) a.aX(parcel, Bundle.CREATOR));
                return true;
            case 8:
                g((ParcelableVolumeInfo) a.aX(parcel, ParcelableVolumeInfo.CREATOR));
                return true;
            case 9:
                int i3 = parcel.readInt();
                dl dlVar2 = (dl) this.a.get();
                if (dlVar2 != null) {
                    dlVar2.g(9, Integer.valueOf(i3), null);
                }
                return true;
            case 10:
                parcel.readInt();
                return true;
            case 11:
                boolean z = parcel.readInt() != 0;
                dl dlVar3 = (dl) this.a.get();
                if (dlVar3 != null) {
                    dlVar3.g(11, Boolean.valueOf(z), null);
                }
                return true;
            case 12:
                int i4 = parcel.readInt();
                dl dlVar4 = (dl) this.a.get();
                if (dlVar4 != null) {
                    dlVar4.g(12, Integer.valueOf(i4), null);
                }
                return true;
            case 13:
                dl dlVar5 = (dl) this.a.get();
                if (dlVar5 != null) {
                    dlVar5.g(13, null, null);
                }
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
