package android.support.v4.media.a;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.support.v4.media.MediaMetadataCompat;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public class a extends Binder implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f393a;

    a(h hVar) {
        attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
        this.f393a = new WeakReference(hVar);
    }

    public void a(Bundle bundle) {
        h hVar = (h) this.f393a.get();
        if (hVar != null) {
            hVar.c(7, bundle, null);
        }
    }

    public void b(MediaMetadataCompat mediaMetadataCompat) {
        h hVar = (h) this.f393a.get();
        if (hVar != null) {
            hVar.c(3, mediaMetadataCompat, null);
        }
    }

    public void c(List list) {
        h hVar = (h) this.f393a.get();
        if (hVar != null) {
            hVar.c(5, list, null);
        }
    }

    public void d(CharSequence charSequence) {
        h hVar = (h) this.f393a.get();
        if (hVar != null) {
            hVar.c(6, charSequence, null);
        }
    }

    public void e() {
        h hVar = (h) this.f393a.get();
        if (hVar != null) {
            hVar.c(8, null, null);
        }
    }

    public void f(w wVar) {
        h hVar = (h) this.f393a.get();
        if (hVar != null) {
            hVar.c(4, wVar != null ? new v(wVar.f417b) : null, null);
        }
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 > 0 && i2 <= 16777215) {
            parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
        }
        if (i2 == 1598968902) {
            parcel2.writeString("android.support.v4.media.session.IMediaControllerCallback");
            return true;
        }
        switch (i2) {
            case 1:
                String string = parcel.readString();
                Bundle bundle = (Bundle) b.a(parcel, Bundle.CREATOR);
                h hVar = (h) this.f393a.get();
                if (hVar != null) {
                    hVar.c(1, string, bundle);
                }
                return true;
            case 2:
                e();
                return true;
            case 3:
                z zVar = (z) b.a(parcel, z.CREATOR);
                h hVar2 = (h) this.f393a.get();
                if (hVar2 != null) {
                    hVar2.c(2, zVar, null);
                }
                return true;
            case 4:
                b((MediaMetadataCompat) b.a(parcel, MediaMetadataCompat.CREATOR));
                return true;
            case 5:
                c(parcel.createTypedArrayList(s.CREATOR));
                return true;
            case 6:
                d((CharSequence) b.a(parcel, TextUtils.CHAR_SEQUENCE_CREATOR));
                return true;
            case 7:
                a((Bundle) b.a(parcel, Bundle.CREATOR));
                return true;
            case 8:
                f((w) b.a(parcel, w.CREATOR));
                return true;
            case 9:
                int i4 = parcel.readInt();
                h hVar3 = (h) this.f393a.get();
                if (hVar3 != null) {
                    hVar3.c(9, Integer.valueOf(i4), null);
                }
                return true;
            case 10:
                parcel.readInt();
                return true;
            case 11:
                boolean z = parcel.readInt() != 0;
                h hVar4 = (h) this.f393a.get();
                if (hVar4 != null) {
                    hVar4.c(11, Boolean.valueOf(z), null);
                }
                return true;
            case 12:
                int i5 = parcel.readInt();
                h hVar5 = (h) this.f393a.get();
                if (hVar5 != null) {
                    hVar5.c(12, Integer.valueOf(i5), null);
                }
                return true;
            case 13:
                h hVar6 = (h) this.f393a.get();
                if (hVar6 != null) {
                    hVar6.c(13, null, null);
                }
                return true;
            default:
                return super.onTransact(i2, parcel, parcel2, i3);
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
