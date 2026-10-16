package defpackage;

import android.support.v4.media.MediaBrowserCompat;
import com.google.android.gms.car.RadioProgramSelector;
import j$.util.Objects;

/* loaded from: classes2.dex */
public final class mik extends ebj {
    public final MediaBrowserCompat.MediaItem a;
    public final RadioProgramSelector b;

    public mik(MediaBrowserCompat.MediaItem mediaItem, RadioProgramSelector radioProgramSelector) {
        this.a = mediaItem;
        this.b = radioProgramSelector;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof mik) {
            mik mikVar = (mik) obj;
            if (Objects.equals(this.a, mikVar.a) && Objects.equals(this.b, mikVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return a.V(this.a, this.b);
    }

    public final String toString() {
        int i = 0;
        Object[] objArr = {this.a, this.b};
        String[] strArrSplit = "mediaItem;selector".split(";");
        StringBuilder sb = new StringBuilder("mik[");
        while (true) {
            int length = strArrSplit.length;
            if (i >= length) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(strArrSplit[i]);
            sb.append("=");
            sb.append(objArr[i]);
            if (i != length - 1) {
                sb.append(", ");
            }
            i++;
        }
    }
}
