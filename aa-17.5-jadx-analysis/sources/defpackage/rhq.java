package defpackage;

import android.graphics.BitmapFactory;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.v4.media.session.MediaSessionCompat;
import com.google.android.apps.auto.components.carlocalmedia.CarLocalMediaBrowserService;
import com.google.android.gms.car.carlocalmedia.CarLocalMediaPlaybackMetadata;
import com.google.android.gms.car.carlocalmedia.CarLocalMediaPlaybackStatus;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.projection.gearhead.R;
import j$.util.Objects;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class rhq extends ijo implements rhr {
    public ajmd a;

    public rhq() {
        super("com.google.android.gms.car.carlocalmedia.ICarLocalMediaCallback");
    }

    @Override // defpackage.rhr
    public final void e(CarLocalMediaPlaybackMetadata carLocalMediaPlaybackMetadata) throws RemoteException {
        ajmd ajmdVar = this.a;
        if (ajmdVar != null) {
            yph yphVar = CarLocalMediaBrowserService.g;
            kmu kmuVar = new kmu();
            String str = carLocalMediaPlaybackMetadata.a;
            CarLocalMediaBrowserService carLocalMediaBrowserService = (CarLocalMediaBrowserService) ajmdVar.a;
            kmuVar.h("android.media.metadata.TITLE", (String) Objects.requireNonNullElse(str, carLocalMediaBrowserService.getString(R.string.car_local_media_missing_song_name)));
            String str2 = carLocalMediaPlaybackMetadata.b;
            if (str2 != null) {
                kmuVar.h("android.media.metadata.ARTIST", str2);
            }
            String str3 = carLocalMediaPlaybackMetadata.c;
            if (str3 != null) {
                kmuVar.h("android.media.metadata.ALBUM", str3);
            }
            byte[] bArr = carLocalMediaPlaybackMetadata.d;
            int length = bArr.length;
            if (length > 0) {
                kmuVar.f("android.media.metadata.ALBUM_ART", BitmapFactory.decodeByteArray(bArr, 0, length));
            }
            int i = carLocalMediaPlaybackMetadata.e;
            if (i != -1) {
                kmuVar.g("android.media.metadata.DURATION", i * 1000);
            }
            MediaSessionCompat mediaSessionCompat = carLocalMediaBrowserService.j;
            mediaSessionCompat.getClass();
            mediaSessionCompat.h(kmuVar.e());
        }
    }

    @Override // defpackage.rhr
    public final void f(CarLocalMediaPlaybackStatus carLocalMediaPlaybackStatus) throws RemoteException {
        long j;
        ajmd ajmdVar = this.a;
        if (ajmdVar != null) {
            yph yphVar = CarLocalMediaBrowserService.g;
            CarLocalMediaBrowserService carLocalMediaBrowserService = (CarLocalMediaBrowserService) ajmdVar.a;
            if (carLocalMediaBrowserService.j == null) {
                return;
            }
            int i = carLocalMediaPlaybackStatus.a;
            int i2 = i != 1 ? i != 2 ? i != 3 ? i != 4 ? 0 : 7 : 2 : 3 : 1;
            long millis = carLocalMediaPlaybackStatus.a().isNegative() ? -1L : carLocalMediaPlaybackStatus.a().toMillis();
            Iterator<E> it = carLocalMediaPlaybackStatus.c.iterator();
            long j2 = 0;
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next()).intValue();
                if (iIntValue == 0) {
                    j = 4;
                } else if (iIntValue == 1) {
                    j = 2;
                } else if (iIntValue == 2) {
                    j = 16;
                } else if (iIntValue == 3) {
                    j = 32;
                } else if (iIntValue == 4) {
                    j = 1;
                }
                j2 |= j;
            }
            String str = carLocalMediaPlaybackStatus.b;
            eb ebVar = new eb();
            ebVar.c = j2;
            ebVar.d(i2, millis, i2 == 3 ? 1.0f : BitmapDescriptorFactory.HUE_RED);
            if (i2 == 7) {
                ebVar.b(1, carLocalMediaBrowserService.getString(R.string.car_local_media_media_source_unavailable_error, new Object[]{str}));
            }
            MediaSessionCompat mediaSessionCompat = carLocalMediaBrowserService.j;
            mediaSessionCompat.getClass();
            mediaSessionCompat.i(ebVar.a());
            carLocalMediaBrowserService.k(i2 != 0);
        }
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        if (i == 1) {
            CarLocalMediaPlaybackStatus carLocalMediaPlaybackStatus = (CarLocalMediaPlaybackStatus) ijp.a(parcel, CarLocalMediaPlaybackStatus.CREATOR);
            ijp.d(parcel);
            f(carLocalMediaPlaybackStatus);
        } else {
            if (i != 2) {
                return false;
            }
            CarLocalMediaPlaybackMetadata carLocalMediaPlaybackMetadata = (CarLocalMediaPlaybackMetadata) ijp.a(parcel, CarLocalMediaPlaybackMetadata.CREATOR);
            ijp.d(parcel);
            e(carLocalMediaPlaybackMetadata);
        }
        return true;
    }
}
