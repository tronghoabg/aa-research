package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes3.dex */
public enum ahqj {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(BitmapDescriptorFactory.HUE_RED)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(false),
    STRING(""),
    BYTE_STRING(ahoa.EMPTY),
    ENUM(null),
    MESSAGE(null);

    private final Object defaultDefault;

    ahqj(Object obj) {
        this.defaultDefault = obj;
    }
}
