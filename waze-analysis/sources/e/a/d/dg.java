package e.a.d;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.common.C;
import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.concurrent.TimeUnit;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class dg implements e.a.cd {
    @Override // e.a.cd
    public final /* bridge */ /* synthetic */ Object a(String str) throws NumberFormatException {
        com.google.d.b.an.m(str.length() > 0, "empty timeout");
        com.google.d.b.an.m(str.length() <= 9, "bad timeout format");
        long j2 = Long.parseLong(str.substring(0, str.length() - 1));
        char cCharAt = str.charAt(str.length() - 1);
        if (cCharAt == 'H') {
            return Long.valueOf(TimeUnit.HOURS.toNanos(j2));
        }
        if (cCharAt == 'M') {
            return Long.valueOf(TimeUnit.MINUTES.toNanos(j2));
        }
        if (cCharAt == 'S') {
            return Long.valueOf(TimeUnit.SECONDS.toNanos(j2));
        }
        if (cCharAt == 'u') {
            return Long.valueOf(TimeUnit.MICROSECONDS.toNanos(j2));
        }
        if (cCharAt == 'm') {
            return Long.valueOf(TimeUnit.MILLISECONDS.toNanos(j2));
        }
        if (cCharAt == 'n') {
            return Long.valueOf(j2);
        }
        throw new IllegalArgumentException(String.format("Invalid timeout unit: %s", Character.valueOf(cCharAt)));
    }

    @Override // e.a.cd
    public final /* bridge */ /* synthetic */ String b(Object obj) {
        long jMax = Math.max(1L, ((Long) obj).longValue());
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        if (jMax < 100000000) {
            return jMax + "n";
        }
        if (jMax < 100000000000L) {
            return (jMax / 1000) + "u";
        }
        if (jMax < 100000000000000L) {
            return (jMax / 1000000) + CmcdData.OBJECT_TYPE_MANIFEST;
        }
        if (jMax < 100000000000000000L) {
            return (jMax / C.NANOS_PER_SECOND) + ExifInterface.LATITUDE_SOUTH;
        }
        if (jMax < 6000000000000000000L) {
            return (jMax / 60000000000L) + "M";
        }
        return (jMax / 3600000000000L) + "H";
    }
}
