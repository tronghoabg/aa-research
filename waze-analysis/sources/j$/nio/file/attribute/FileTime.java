package j$.nio.file.attribute;

import androidx.compose.material3.internal.CalendarModelKt;
import androidx.media3.common.PlaybackException;
import j$.time.Instant;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class FileTime implements Comparable<FileTime> {

    /* renamed from: a, reason: collision with root package name */
    public final long f49702a;

    /* renamed from: b, reason: collision with root package name */
    public Instant f49703b = null;

    /* renamed from: c, reason: collision with root package name */
    public String f49704c;

    public FileTime(long j2) {
        this.f49702a = j2;
    }

    public static void f(StringBuilder sb, int i2, int i3) {
        while (i2 > 0) {
            sb.append((char) ((i3 / i2) + 48));
            i3 %= i2;
            i2 /= 10;
        }
    }

    public static long k(long j2, long j3, long j4) {
        if (j2 > j4) {
            return Long.MAX_VALUE;
        }
        if (j2 < (-j4)) {
            return Long.MIN_VALUE;
        }
        return j2 * j3;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof FileTime) && compareTo((FileTime) obj) == 0;
    }

    @Override // java.lang.Comparable
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final int compareTo(FileTime fileTime) {
        long j2 = this.f49702a;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        if (timeUnit != null) {
            fileTime.getClass();
            return Long.compare(j2, fileTime.f49702a);
        }
        long epochSecond = x().getEpochSecond();
        int iCompare = Long.compare(epochSecond, fileTime.x().getEpochSecond());
        if (iCompare != 0) {
            return iCompare;
        }
        int iCompare2 = Long.compare(x().getNano(), fileTime.x().getNano());
        if (iCompare2 != 0) {
            return iCompare2;
        }
        if (epochSecond != 31556889864403199L && epochSecond != -31557014167219200L) {
            return 0;
        }
        long epochSecond2 = timeUnit != null ? j2 / CalendarModelKt.MillisecondsIn24Hours : x().getEpochSecond() / 86400;
        long epochSecond3 = timeUnit != null ? fileTime.f49702a / CalendarModelKt.MillisecondsIn24Hours : fileTime.x().getEpochSecond() / 86400;
        return epochSecond2 == epochSecond3 ? Long.compare(m(epochSecond2), fileTime.m(epochSecond3)) : Long.compare(epochSecond2, epochSecond3);
    }

    public final int hashCode() {
        return x().hashCode();
    }

    public final long m(long j2) {
        TimeUnit timeUnit = TimeUnit.DAYS;
        TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
        if (timeUnit2 != null) {
            return timeUnit2.toNanos(this.f49702a - timeUnit2.convert(j2, timeUnit));
        }
        return TimeUnit.SECONDS.toNanos(x().getEpochSecond() - timeUnit.toSeconds(j2));
    }

    public long toMillis() {
        if (TimeUnit.MILLISECONDS != null) {
            return this.f49702a;
        }
        long epochSecond = this.f49703b.getEpochSecond();
        long j2 = epochSecond * 1000;
        return (((Math.abs(epochSecond) | 1000) >>> 31) == 0 || j2 / 1000 == epochSecond) ? j2 + (this.f49703b.getNano() / PlaybackException.CUSTOM_ERROR_CODE_BASE) : epochSecond < 0 ? Long.MIN_VALUE : Long.MAX_VALUE;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.nio.file.attribute.FileTime.toString():java.lang.String");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final j$.time.Instant x() {
        /*
            r13 = this;
            j$.time.Instant r0 = r13.f49703b
            if (r0 != 0) goto L97
            int[] r0 = j$.nio.file.attribute.e0.f49710a
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS
            int r1 = r1.ordinal()
            r0 = r0[r1]
            long r1 = r13.f49702a
            r3 = 0
            switch(r0) {
                case 1: goto L66;
                case 2: goto L58;
                case 3: goto L4a;
                case 4: goto L74;
                case 5: goto L39;
                case 6: goto L2a;
                case 7: goto L1c;
                default: goto L14;
            }
        L14:
            java.lang.AssertionError r13 = new java.lang.AssertionError
            java.lang.String r0 = "Unit not handled"
            r13.<init>(r0)
            throw r13
        L1c:
            r3 = 1000000000(0x3b9aca00, double:4.94065646E-315)
            long r5 = j$.com.android.tools.r8.a.F(r1, r3)
            long r0 = j$.com.android.tools.r8.a.O(r1, r3)
            int r3 = (int) r0
        L28:
            r1 = r5
            goto L74
        L2a:
            r3 = 1000000(0xf4240, double:4.940656E-318)
            long r5 = j$.com.android.tools.r8.a.F(r1, r3)
            long r0 = j$.com.android.tools.r8.a.O(r1, r3)
            int r0 = (int) r0
            int r3 = r0 * 1000
            goto L28
        L39:
            r3 = 1000(0x3e8, double:4.94E-321)
            long r5 = j$.com.android.tools.r8.a.F(r1, r3)
            long r0 = j$.com.android.tools.r8.a.O(r1, r3)
            int r0 = (int) r0
            r1 = 1000000(0xf4240, float:1.401298E-39)
            int r3 = r0 * r1
            goto L28
        L4a:
            r9 = 60
            r11 = 153722867280912930(0x222222222222222, double:2.166167076120538E-298)
            long r7 = r13.f49702a
            long r1 = k(r7, r9, r11)
            goto L74
        L58:
            r6 = 3600(0xe10, double:1.7786E-320)
            r8 = 2562047788015215(0x91a2b3c4d5e6f, double:1.2658197950618743E-308)
            long r4 = r13.f49702a
            long r1 = k(r4, r6, r8)
            goto L74
        L66:
            r6 = 86400(0x15180, double:4.26873E-319)
            r8 = 106751991167300(0x611722833944, double:5.2742491460911E-310)
            long r4 = r13.f49702a
            long r1 = k(r4, r6, r8)
        L74:
            r4 = -31557014167219200(0xff8fe31014641400, double:-2.7989734602046733E306)
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 > 0) goto L82
            j$.time.Instant r0 = j$.time.Instant.f49794d
            r13.f49703b = r0
            return r0
        L82:
            r4 = 31556889864403199(0x701cd2fa9578ff, double:1.434068493154717E-306)
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 < 0) goto L90
            j$.time.Instant r0 = j$.time.Instant.f49795e
            r13.f49703b = r0
            return r0
        L90:
            long r3 = (long) r3
            j$.time.Instant r0 = j$.time.Instant.ofEpochSecond(r1, r3)
            r13.f49703b = r0
        L97:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.nio.file.attribute.FileTime.x():j$.time.Instant");
    }
}
