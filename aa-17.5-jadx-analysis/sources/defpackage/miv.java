package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import android.support.v4.media.MediaBrowserCompat;
import android.text.TextUtils;
import com.google.android.gms.car.RadioMetadata;
import com.google.android.gms.car.RadioProgramInfo;
import j$.util.Objects;

/* loaded from: classes2.dex */
public abstract class miv extends mit {
    protected abstract String s(RadioProgramInfo radioProgramInfo);

    protected abstract String t(RadioProgramInfo radioProgramInfo);

    public final MediaBrowserCompat.MediaItem u(RadioProgramInfo radioProgramInfo) {
        dc dcVar = new dc();
        String strT = t(radioProgramInfo);
        String strS = s(radioProgramInfo);
        if (Objects.equals(strT, strS)) {
            dcVar.b = strT;
        } else {
            dcVar.b = strT;
            if (!TextUtils.isEmpty(strS)) {
                dcVar.c = strS;
            }
        }
        RadioMetadata radioMetadata = radioProgramInfo.b;
        if (radioMetadata != null) {
            Uri uri = radioMetadata.e;
            if (uri != null) {
                dcVar.f = uri;
            }
            Bitmap bitmap = radioMetadata.i;
            if (bitmap != null) {
                dcVar.e = bitmap;
            }
            if (uri == null && bitmap == null) {
                dcVar.f = b(radioProgramInfo.a, "station_icon_fallback_browse");
            }
        } else {
            dcVar.f = b(radioProgramInfo.a, "station_icon_fallback_browse");
        }
        dcVar.a = mir.c(radioProgramInfo.a);
        return new MediaBrowserCompat.MediaItem(dcVar.a(), 2);
    }
}
