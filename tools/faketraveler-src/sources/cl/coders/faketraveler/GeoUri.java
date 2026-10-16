package cl.coders.faketraveler;

import android.net.Uri;
import com.android.tools.r8.RecordTag;
import java.util.Objects;

/* loaded from: classes.dex */
public final class GeoUri extends RecordTag {
    private final double lat;
    private final double lng;
    private final Double zoom;

    private /* synthetic */ boolean $record$equals(Object obj) {
        if (!(obj instanceof GeoUri)) {
            return false;
        }
        GeoUri geoUri = (GeoUri) obj;
        return this.lat == geoUri.lat && this.lng == geoUri.lng && Objects.equals(this.zoom, geoUri.zoom);
    }

    private /* synthetic */ Object[] $record$getFieldsAsObjects() {
        return new Object[]{Double.valueOf(this.lat), Double.valueOf(this.lng), this.zoom};
    }

    public GeoUri(double lat, double lng, Double zoom) {
        this.lat = lat;
        this.lng = lng;
        this.zoom = zoom;
    }

    public final boolean equals(Object obj) {
        return $record$equals(obj);
    }

    public final int hashCode() {
        return GeoUri$$ExternalSyntheticRecord1.m(this.lat, this.lng, this.zoom);
    }

    public double lat() {
        return this.lat;
    }

    public double lng() {
        return this.lng;
    }

    public final String toString() {
        return GeoUri$$ExternalSyntheticRecord1.m($record$getFieldsAsObjects(), GeoUri.class, "lat;lng;zoom");
    }

    public Double zoom() {
        return this.zoom;
    }

    public static GeoUri parse(String str) throws NumberFormatException {
        Uri uri = Uri.parse(str);
        if (!"geo".equals(uri.getScheme())) {
            return null;
        }
        String[] strArrSplit = uri.getSchemeSpecificPart().split("\\?", 2);
        if (strArrSplit.length < 1) {
            return null;
        }
        String[] strArrSplit2 = strArrSplit[0].split(",", 2);
        if (strArrSplit2.length < 2) {
            return null;
        }
        double d = Double.parseDouble(strArrSplit2[0]);
        double d2 = Double.parseDouble(strArrSplit2[1]);
        if (strArrSplit.length < 2) {
            return new GeoUri(d, d2, null);
        }
        Double dValueOf = null;
        for (String str2 : strArrSplit[1].split("&")) {
            if (str2.startsWith("z=")) {
                dValueOf = Double.valueOf(Double.parseDouble(str2.replaceFirst("z=", "")));
            }
        }
        return new GeoUri(d, d2, dValueOf);
    }
}
