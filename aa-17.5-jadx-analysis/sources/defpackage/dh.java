package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.car.app.navigation.model.Maneuver;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class dh extends Binder implements di {
    public final AtomicReference a;

    public dh(dv dvVar) {
        attachInterface(this, "android.support.v4.media.session.IMediaSession");
        this.a = new AtomicReference(dvVar);
    }

    @Override // defpackage.di
    public final PlaybackStateCompat a() {
        int i;
        dv dvVar = (dv) this.a.get();
        if (dvVar == null) {
            return null;
        }
        PlaybackStateCompat playbackStateCompat = dvVar.e;
        MediaMetadataCompat mediaMetadataCompat = dvVar.f;
        if (playbackStateCompat != null) {
            long j = playbackStateCompat.b;
            long jA = -1;
            if (j != -1) {
                int i2 = playbackStateCompat.a;
                if (i2 == 3 || i2 == 4) {
                    i = i2;
                } else if (i2 == 5) {
                    i = 5;
                }
                long j2 = playbackStateCompat.h;
                long j3 = 0;
                if (j2 > 0) {
                    float f = playbackStateCompat.d;
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    long j4 = jElapsedRealtime - j2;
                    if (mediaMetadataCompat != null && mediaMetadataCompat.b.containsKey("android.media.metadata.DURATION")) {
                        jA = mediaMetadataCompat.a("android.media.metadata.DURATION");
                    }
                    long j5 = ((long) (j4 * f)) + j;
                    if (jA >= 0 && j5 > jA) {
                        j3 = jA;
                    } else if (j5 >= 0) {
                        j3 = j5;
                    }
                    eb ebVar = new eb(playbackStateCompat);
                    ebVar.c(i, j3, f, jElapsedRealtime);
                    return ebVar.a();
                }
            }
        }
        return playbackStateCompat;
    }

    @Override // defpackage.di
    public final void b(df dfVar) {
        dv dvVar = (dv) this.a.get();
        if (dvVar == null) {
            return;
        }
        dvVar.d.register(dfVar, new etu("android.media.session.MediaController", Binder.getCallingPid(), Binder.getCallingUid()));
        synchronized (dvVar.c) {
        }
    }

    @Override // defpackage.di
    public final void c(df dfVar) {
        dv dvVar = (dv) this.a.get();
        if (dvVar == null) {
            return;
        }
        dvVar.d.unregister(dfVar);
        Binder.getCallingPid();
        Binder.getCallingUid();
        synchronized (dvVar.c) {
        }
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        int i3;
        if (i > 0 && i <= 16777215) {
            parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
        }
        if (i == 1598968902) {
            parcel2.writeString("android.support.v4.media.session.IMediaSession");
            return true;
        }
        df ddVar = null;
        switch (i) {
            case 1:
                parcel.readString();
                throw new AssertionError();
            case 2:
                throw new AssertionError();
            case 3:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
                    ddVar = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof df)) ? new dd(strongBinder) : (df) iInterfaceQueryLocalInterface;
                }
                b(ddVar);
                parcel2.writeNoException();
                return true;
            case 4:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
                    ddVar = (iInterfaceQueryLocalInterface2 == null || !(iInterfaceQueryLocalInterface2 instanceof df)) ? new dd(strongBinder2) : (df) iInterfaceQueryLocalInterface2;
                }
                c(ddVar);
                parcel2.writeNoException();
                return true;
            case 5:
                throw new AssertionError();
            case 6:
                throw new AssertionError();
            case 7:
                throw new AssertionError();
            case 8:
                throw new AssertionError();
            case 9:
                throw new AssertionError();
            case 10:
                throw new AssertionError();
            case 11:
                parcel.readInt();
                parcel.readInt();
                parcel.readString();
                throw new AssertionError();
            case 12:
                parcel.readInt();
                parcel.readInt();
                parcel.readString();
                throw new AssertionError();
            case 13:
                throw new AssertionError();
            case 14:
                parcel.readString();
                throw new AssertionError();
            case 15:
                parcel.readString();
                throw new AssertionError();
            case 16:
                throw new AssertionError();
            case 17:
                parcel.readLong();
                throw new AssertionError();
            case 18:
                throw new AssertionError();
            case 19:
                throw new AssertionError();
            case 20:
                throw new AssertionError();
            case 21:
                throw new AssertionError();
            case 22:
                throw new AssertionError();
            case 23:
                throw new AssertionError();
            case 24:
                parcel.readLong();
                throw new AssertionError();
            case 25:
                throw new AssertionError();
            case 26:
                parcel.readString();
                throw new AssertionError();
            case 27:
                throw new AssertionError();
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                PlaybackStateCompat playbackStateCompatA = a();
                parcel2.writeNoException();
                lv.o(parcel2, playbackStateCompatA);
                return true;
            case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                parcel2.writeNoException();
                parcel2.writeInt(-1);
                return true;
            case 30:
                throw new AssertionError();
            case 31:
                throw new AssertionError();
            case 32:
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                throw new AssertionError();
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                parcel.readString();
                throw new AssertionError();
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                parcel.readString();
                throw new AssertionError();
            case Maneuver.TYPE_STRAIGHT /* 36 */:
                throw new AssertionError();
            case 37:
                i3 = ((dv) this.a.get()) != null ? 0 : -1;
                parcel2.writeNoException();
                parcel2.writeInt(i3);
                return true;
            case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case Maneuver.TYPE_DESTINATION /* 39 */:
                parcel.readInt();
                throw new AssertionError();
            case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                parcel.readInt();
                parcel2.writeNoException();
                return true;
            case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                throw new AssertionError();
            case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                parcel.readInt();
                throw new AssertionError();
            case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                throw new AssertionError();
            case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                parcel.readInt();
                throw new AssertionError();
            case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                parcel.readInt();
                throw new AssertionError();
            case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                i3 = ((dv) this.a.get()) != null ? 0 : -1;
                parcel2.writeNoException();
                parcel2.writeInt(i3);
                return true;
            case 48:
                parcel.readInt();
                throw new AssertionError();
            case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                parcel.readFloat();
                throw new AssertionError();
            case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                parcel2.writeNoException();
                lv.o(parcel2, null);
                return true;
            case 51:
                throw new AssertionError();
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
