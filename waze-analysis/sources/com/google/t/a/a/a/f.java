package com.google.t.a.a.a;

import com.google.v.eg;
import com.google.v.eh;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class f implements eh {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f12556a;

    f(int i2) {
        this.f12556a = i2;
    }

    @Override // com.google.v.eh
    public final /* synthetic */ eg findValueByNumber(int i2) {
        int i3 = this.f12556a;
        if (i3 != 0) {
            if (i3 != 1) {
                switch (i2) {
                    case 0:
                        return h.TU_NOT_SPECIFIED;
                    case 1:
                        return h.TU_NANOSECONDS;
                    case 2:
                        return h.TU_MICROSECONDS;
                    case 3:
                        return h.TU_MILLISECONDS;
                    case 4:
                        return h.TU_SECONDS;
                    case 5:
                        return h.TU_MINUTES;
                    case 6:
                        return h.TU_HOURS;
                    case 7:
                        return h.TU_DAYS;
                    default:
                        return null;
                }
            }
            if (i2 == 0) {
                return a.DU_NOT_SPECIFIED;
            }
            switch (i2) {
                case 2:
                    return a.DU_BYTES;
                case 3:
                    return a.DU_KILOBYTES;
                case 4:
                    return a.DU_MEGABYTES;
                case 5:
                    return a.DU_GIGABYTES;
                case 6:
                    return a.DU_KIBIBYTES;
                case 7:
                    return a.DU_MEBIBYTES;
                case 8:
                    return a.DU_GIBIBYTES;
                default:
                    return null;
            }
        }
        if (i2 == 0) {
            return g.ST_NOT_SPECIFIED;
        }
        if (i2 == 1100) {
            return g.ST_DATA_SIZE;
        }
        if (i2 == 1300) {
            return g.ST_STREAM_ID;
        }
        if (i2 == 1400) {
            return g.ST_INDEXED_LABEL;
        }
        if (i2 == 1500) {
            return g.ST_HASH;
        }
        if (i2 == 1200) {
            return g.ST_TYPE_CAST_VALUE;
        }
        if (i2 == 1201) {
            return g.ST_ENUM_AS_INT;
        }
        switch (i2) {
            case 1000:
                return g.ST_PHOTOS_ID;
            case 1001:
                return g.ST_PHOTO_ID;
            case 1002:
                return g.ST_ALBUM_ID;
            case 1003:
                return g.ST_EVENT_ID;
            case 1004:
                return g.ST_MEDIA_KEY;
            case 1005:
                return g.ST_VIDEO_ID;
            case 1006:
                return g.ST_CLUSTER_ID;
            default:
                return null;
        }
    }
}
