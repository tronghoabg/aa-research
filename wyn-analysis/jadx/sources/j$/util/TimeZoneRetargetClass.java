package j$.util;

import j$.time.ZoneId;
import java.util.TimeZone;

/* loaded from: classes2.dex */
public final /* synthetic */ class TimeZoneRetargetClass {
    public static ZoneId toZoneId(TimeZone timeZone) {
        String id2 = timeZone.getID();
        java.util.Map map = ZoneId.f37486a;
        Objects.requireNonNull(id2, "zoneId");
        Objects.requireNonNull(map, "aliasMap");
        Object objRequireNonNull = (String) map.get(id2);
        if (objRequireNonNull == null) {
            objRequireNonNull = Objects.requireNonNull(id2, "defaultObj");
        }
        return ZoneId.of((String) objRequireNonNull);
    }
}
