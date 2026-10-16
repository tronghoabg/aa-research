package com.google.t.a.a.a;

import com.google.v.eg;
import com.google.v.eh;
import com.waze.strings.DisplayStrings;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum g implements eg {
    ST_NOT_SPECIFIED(0),
    ST_PHOTOS_ID(1000),
    ST_PHOTO_ID(1001),
    ST_ALBUM_ID(1002),
    ST_EVENT_ID(1003),
    ST_MEDIA_KEY(1004),
    ST_VIDEO_ID(1005),
    ST_CLUSTER_ID(1006),
    ST_DATA_SIZE(DisplayStrings.DS_ADD_HOURS),
    ST_TYPE_CAST_VALUE(1200),
    ST_ENUM_AS_INT(DisplayStrings.DS_CALENDAR_CONFIRM_BLOCK_ADDRESS_OK),
    ST_STREAM_ID(DisplayStrings.DS_LOCATION_PREVIEW_ADD_PHOTO),
    ST_INDEXED_LABEL(DisplayStrings.DS_FUTURE_DRIVES_PLAN_TRAFFIC_LABEL),
    ST_HASH(1500);

    private static final eh o = new f(0);
    private final int q;

    g(int i2) {
        this.q = i2;
    }

    public static eh a() {
        return o;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.q;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.q);
    }
}
