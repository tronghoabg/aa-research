package defpackage;

import android.os.SystemClock;
import android.util.StatsEvent;
import android.util.StatsLog;
import j$.util.concurrent.ThreadLocalRandom;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.chromium.net.impl.CronetLogger;

/* loaded from: classes2.dex */
public final class akby extends CronetLogger {
    private static final String a = "akby";
    private final AtomicInteger b;
    private final akcc c;

    public akby() {
        akcc akccVar = new akcc();
        this.b = new AtomicInteger();
        this.c = akccVar;
    }

    private static int e(CronetLogger.CronetSource cronetSource) {
        CronetLogger.CronetAdaptiveTrafficRequestState cronetAdaptiveTrafficRequestState = CronetLogger.CronetAdaptiveTrafficRequestState.CRONET_ADAPTIVE_TRAFFIC_REQUEST_STATE_UNKNOWN;
        CronetLogger.CronetAdaptiveTrafficWinner cronetAdaptiveTrafficWinner = CronetLogger.CronetAdaptiveTrafficWinner.CRONET_ADAPTIVE_TRAFFIC_WINNER_UNKNOWN;
        CronetLogger.CronetSource cronetSource2 = CronetLogger.CronetSource.CRONET_SOURCE_UNSPECIFIED;
        CronetLogger.CronetTrafficInfo.RequestTerminalState requestTerminalState = CronetLogger.CronetTrafficInfo.RequestTerminalState.SUCCEEDED;
        CronetLogger.CronetEngineBuilderInitializedInfo.Author author = CronetLogger.CronetEngineBuilderInitializedInfo.Author.API;
        CronetLogger.CronetTrafficInfo.RequestFailureReason requestFailureReason = CronetLogger.CronetTrafficInfo.RequestFailureReason.UNKNOWN;
        int iOrdinal = cronetSource.ordinal();
        int i = 1;
        if (iOrdinal != 1) {
            i = 2;
            if (iOrdinal != 2) {
                i = 3;
                if (iOrdinal != 3) {
                    i = 4;
                    if (iOrdinal != 4) {
                        return 0;
                    }
                }
            }
        }
        return i;
    }

    @Override // org.chromium.net.impl.CronetLogger
    public final long a() {
        long jNextLong = ThreadLocalRandom.current().nextLong(-9223372036854775807L, 9223372036854775805L);
        return jNextLong >= -1 ? jNextLong + 2 : jNextLong;
    }

    @Override // org.chromium.net.impl.CronetLogger
    public final void b(CronetLogger.CronetEngineBuilderInitializedInfo cronetEngineBuilderInitializedInfo) {
        new akbj("CronetLoggerImpl#logCronetEngineBuilderInitializedInfo");
        long j = cronetEngineBuilderInitializedInfo.a;
        CronetLogger.CronetEngineBuilderInitializedInfo.Author author = cronetEngineBuilderInitializedInfo.b;
        CronetLogger.CronetAdaptiveTrafficRequestState cronetAdaptiveTrafficRequestState = CronetLogger.CronetAdaptiveTrafficRequestState.CRONET_ADAPTIVE_TRAFFIC_REQUEST_STATE_UNKNOWN;
        CronetLogger.CronetAdaptiveTrafficWinner cronetAdaptiveTrafficWinner = CronetLogger.CronetAdaptiveTrafficWinner.CRONET_ADAPTIVE_TRAFFIC_WINNER_UNKNOWN;
        CronetLogger.CronetSource cronetSource = CronetLogger.CronetSource.CRONET_SOURCE_UNSPECIFIED;
        CronetLogger.CronetTrafficInfo.RequestTerminalState requestTerminalState = CronetLogger.CronetTrafficInfo.RequestTerminalState.SUCCEEDED;
        CronetLogger.CronetEngineBuilderInitializedInfo.Author author2 = CronetLogger.CronetEngineBuilderInitializedInfo.Author.API;
        CronetLogger.CronetTrafficInfo.RequestFailureReason requestFailureReason = CronetLogger.CronetTrafficInfo.RequestFailureReason.UNKNOWN;
        int iOrdinal = author.ordinal();
        int i = iOrdinal != 0 ? iOrdinal != 1 ? 0 : 2 : 1;
        int i2 = cronetEngineBuilderInitializedInfo.c;
        int iE = e(cronetEngineBuilderInitializedInfo.d);
        int i3 = akcb.a(cronetEngineBuilderInitializedInfo.e).d;
        CronetLogger.CronetVersion cronetVersion = cronetEngineBuilderInitializedInfo.f;
        int i4 = cronetVersion.a;
        int i5 = cronetVersion.b;
        int i6 = cronetVersion.c;
        int i7 = cronetVersion.d;
        CronetLogger.CronetVersion cronetVersion2 = cronetEngineBuilderInitializedInfo.g;
        int i8 = cronetVersion2 == null ? -1 : cronetVersion2.a;
        int i9 = cronetVersion2 == null ? -1 : cronetVersion2.b;
        int i10 = cronetVersion2 == null ? -1 : cronetVersion2.c;
        int i11 = cronetVersion2 == null ? -1 : cronetVersion2.d;
        int i12 = cronetEngineBuilderInitializedInfo.h;
        StatsEvent.Builder builderNewBuilder = StatsEvent.newBuilder();
        builderNewBuilder.setAtomId(762);
        builderNewBuilder.writeLong(j);
        builderNewBuilder.writeInt(i);
        builderNewBuilder.writeInt(i2);
        builderNewBuilder.writeInt(iE);
        builderNewBuilder.writeInt(i3);
        builderNewBuilder.writeInt(i4);
        builderNewBuilder.writeInt(i5);
        builderNewBuilder.writeInt(i6);
        builderNewBuilder.writeInt(i7);
        builderNewBuilder.writeInt(i8);
        builderNewBuilder.writeInt(i9);
        builderNewBuilder.writeInt(i10);
        builderNewBuilder.writeInt(i11);
        builderNewBuilder.writeInt(i12);
        builderNewBuilder.addBooleanAnnotation((byte) 1, true);
        builderNewBuilder.usePooledBuffer();
        StatsLog.write(builderNewBuilder.build());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0087 A[Catch: all -> 0x02d8, TryCatch #4 {all -> 0x02d8, blocks: (B:4:0x0012, B:16:0x0044, B:27:0x0065, B:29:0x0087, B:31:0x0099, B:33:0x00b3, B:34:0x00b6, B:35:0x00bd, B:37:0x00ce, B:38:0x00d2, B:40:0x00dd, B:41:0x00e5, B:43:0x00ee, B:54:0x020a, B:46:0x01d6, B:51:0x01e4, B:53:0x01ed, B:22:0x0056, B:23:0x005d), top: B:77:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01d6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v58, types: [java.lang.Exception, org.json.JSONException] */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4 */
    @Override // org.chromium.net.impl.CronetLogger
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(long r42, org.chromium.net.impl.CronetLogger.CronetEngineBuilderInfo r44, org.chromium.net.impl.CronetLogger.CronetVersion r45, org.chromium.net.impl.CronetLogger.CronetSource r46) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 776
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akby.c(long, org.chromium.net.impl.CronetLogger$CronetEngineBuilderInfo, org.chromium.net.impl.CronetLogger$CronetVersion, org.chromium.net.impl.CronetLogger$CronetSource):void");
    }

    @Override // org.chromium.net.impl.CronetLogger
    public final void d(long j, CronetLogger.CronetTrafficInfo cronetTrafficInfo) {
        long j2;
        int i;
        int i2;
        int i3;
        long j3;
        long j4;
        long j5;
        long j6;
        byte[] bytes;
        akcc akccVar = this.c;
        synchronized (akccVar.a) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (akccVar.c + 1000 <= jElapsedRealtime) {
                akccVar.b = 1;
                akccVar.c = jElapsedRealtime;
            } else {
                if (akccVar.b > 0) {
                    this.b.incrementAndGet();
                    return;
                }
                akccVar.b = 1;
            }
            int andSet = this.b.getAndSet(0);
            new akbj("CronetLoggerImpl#writeCronetTrafficReported");
            long j7 = cronetTrafficInfo.a;
            ahlf.a(j7, "Request header size is negative");
            double d = j7 / 1024.0d;
            int i4 = ahlf.b(d, 0, 1) ? 1 : ahlf.b(d, 1, 10) ? 2 : ahlf.b(d, 10, 25) ? 3 : ahlf.b(d, 25, 50) ? 4 : ahlf.b(d, 50, 100) ? 5 : 6;
            long j8 = cronetTrafficInfo.b;
            ahlf.a(j8, "Request body size is negative");
            double d2 = j8 / 1024.0d;
            int i5 = d2 == 0.0d ? 1 : (d2 <= 0.0d || d2 >= 10.0d) ? ahlf.b(d2, 10, 50) ? 3 : ahlf.b(d2, 50, 200) ? 4 : ahlf.b(d2, 200, 500) ? 5 : ahlf.b(d2, 500, 1000) ? 6 : ahlf.b(d2, 1000, 5000) ? 7 : 8 : 2;
            long j9 = cronetTrafficInfo.c;
            ahlf.a(j9, "Response header size is negative");
            double d3 = j9 / 1024.0d;
            int i6 = ahlf.b(d3, 0, 1) ? 1 : ahlf.b(d3, 1, 10) ? 2 : ahlf.b(d3, 10, 25) ? 3 : ahlf.b(d3, 25, 50) ? 4 : ahlf.b(d3, 50, 100) ? 5 : 6;
            long j10 = cronetTrafficInfo.d;
            ahlf.a(j10, "Response body size is negative");
            double d4 = j10 / 1024.0d;
            int i7 = d4 == 0.0d ? 1 : (d4 <= 0.0d || d4 >= 10.0d) ? ahlf.b(d4, 10, 50) ? 3 : ahlf.b(d4, 50, 200) ? 4 : ahlf.b(d4, 200, 500) ? 5 : ahlf.b(d4, 500, 1000) ? 6 : ahlf.b(d4, 1000, 5000) ? 7 : 8 : 2;
            int i8 = cronetTrafficInfo.e;
            String str = cronetTrafficInfo.g;
            MessageDigest messageDigest = akca.a;
            long j11 = 0;
            if (messageDigest != null && str != null && !str.isEmpty() && (bytes = str.getBytes(StandardCharsets.UTF_8)) != null && bytes.length != 0) {
                j11 = ByteBuffer.wrap(messageDigest.digest(bytes)).getLong();
            }
            long j12 = cronetTrafficInfo.B;
            int i9 = i4;
            if (j12 == -1) {
                i = -1;
                j2 = -1;
            } else {
                TimeUnit timeUnit = TimeUnit.MICROSECONDS;
                j2 = -1;
                i = (int) (j12 / 1000);
            }
            int millis = (int) cronetTrafficInfo.f.toMillis();
            boolean z = cronetTrafficInfo.h;
            boolean z2 = cronetTrafficInfo.i;
            CronetLogger.CronetTrafficInfo.RequestTerminalState requestTerminalState = cronetTrafficInfo.j;
            CronetLogger.CronetAdaptiveTrafficRequestState cronetAdaptiveTrafficRequestState = CronetLogger.CronetAdaptiveTrafficRequestState.CRONET_ADAPTIVE_TRAFFIC_REQUEST_STATE_UNKNOWN;
            CronetLogger.CronetAdaptiveTrafficWinner cronetAdaptiveTrafficWinner = CronetLogger.CronetAdaptiveTrafficWinner.CRONET_ADAPTIVE_TRAFFIC_WINNER_UNKNOWN;
            CronetLogger.CronetSource cronetSource = CronetLogger.CronetSource.CRONET_SOURCE_UNSPECIFIED;
            CronetLogger.CronetTrafficInfo.RequestTerminalState requestTerminalState2 = CronetLogger.CronetTrafficInfo.RequestTerminalState.SUCCEEDED;
            CronetLogger.CronetEngineBuilderInitializedInfo.Author author = CronetLogger.CronetEngineBuilderInitializedInfo.Author.API;
            CronetLogger.CronetTrafficInfo.RequestFailureReason requestFailureReason = CronetLogger.CronetTrafficInfo.RequestFailureReason.UNKNOWN;
            int iOrdinal = requestTerminalState.ordinal();
            if (iOrdinal != 0) {
                i2 = i9;
                i3 = iOrdinal != 1 ? iOrdinal != 2 ? 0 : 3 : 2;
            } else {
                i2 = i9;
                i3 = 1;
            }
            int i10 = cronetTrafficInfo.k;
            int i11 = cronetTrafficInfo.l;
            int i12 = cronetTrafficInfo.m;
            int i13 = akcb.a(Boolean.valueOf(cronetTrafficInfo.n)).d;
            int i14 = akcb.a(Boolean.valueOf(cronetTrafficInfo.o)).d;
            int i15 = cronetTrafficInfo.p;
            int i16 = cronetTrafficInfo.q;
            int i17 = cronetTrafficInfo.r;
            int i18 = cronetTrafficInfo.s;
            int i19 = i18 != 1 ? i18 != 2 ? 0 : 1 : 2;
            int iOrdinal2 = cronetTrafficInfo.t.ordinal();
            int i20 = i19;
            int i21 = iOrdinal2 != 1 ? iOrdinal2 != 2 ? 0 : 100 : 1;
            int i22 = akcb.a(Boolean.valueOf(cronetTrafficInfo.u)).d;
            String str2 = cronetTrafficInfo.v;
            int iE = e(cronetTrafficInfo.w);
            int i23 = i21;
            long j13 = cronetTrafficInfo.x;
            if (j13 == j2) {
                j3 = j2;
            } else {
                TimeUnit timeUnit2 = TimeUnit.MICROSECONDS;
                j3 = j13 / 1000;
            }
            long j14 = cronetTrafficInfo.y;
            if (j14 == j2) {
                j4 = j2;
            } else {
                TimeUnit timeUnit3 = TimeUnit.MICROSECONDS;
                j4 = j14 / 1000;
            }
            long j15 = cronetTrafficInfo.z;
            if (j15 == j2) {
                j5 = j2;
            } else {
                TimeUnit timeUnit4 = TimeUnit.MICROSECONDS;
                j5 = j15 / 1000;
            }
            long j16 = cronetTrafficInfo.A;
            if (j16 == j2) {
                j6 = j2;
            } else {
                TimeUnit timeUnit5 = TimeUnit.MICROSECONDS;
                j6 = j16 / 1000;
            }
            int i24 = akcb.a(cronetTrafficInfo.C).d;
            int i25 = akcb.a(Boolean.valueOf(cronetTrafficInfo.D)).d;
            StatsEvent.Builder builderNewBuilder = StatsEvent.newBuilder();
            builderNewBuilder.setAtomId(704);
            builderNewBuilder.writeLong(j);
            builderNewBuilder.writeInt(i2);
            builderNewBuilder.writeInt(i5);
            builderNewBuilder.writeInt(i6);
            builderNewBuilder.writeInt(i7);
            builderNewBuilder.writeInt(i8);
            builderNewBuilder.writeLong(j11);
            builderNewBuilder.writeInt(i);
            builderNewBuilder.writeInt(millis);
            builderNewBuilder.writeBoolean(z);
            builderNewBuilder.writeBoolean(z2);
            builderNewBuilder.writeInt(andSet);
            builderNewBuilder.writeInt(i3);
            builderNewBuilder.writeInt(i10);
            long j17 = j2;
            builderNewBuilder.writeLong(j17);
            builderNewBuilder.writeLong(j17);
            builderNewBuilder.writeInt(i11);
            builderNewBuilder.writeInt(i12);
            builderNewBuilder.writeInt(i13);
            builderNewBuilder.writeInt(i14);
            builderNewBuilder.writeInt(i15);
            builderNewBuilder.addBooleanAnnotation((byte) 1, true);
            builderNewBuilder.writeInt(i16);
            builderNewBuilder.writeInt(i17);
            builderNewBuilder.writeInt(i20);
            builderNewBuilder.writeInt(i23);
            builderNewBuilder.writeInt(i22);
            builderNewBuilder.writeString(str2);
            builderNewBuilder.writeInt(iE);
            builderNewBuilder.writeLong(j3);
            builderNewBuilder.writeLong(j4);
            builderNewBuilder.writeLong(j5);
            builderNewBuilder.writeLong(j6);
            builderNewBuilder.writeLong(j13);
            builderNewBuilder.writeLong(j14);
            builderNewBuilder.writeLong(j15);
            builderNewBuilder.writeLong(j16);
            builderNewBuilder.writeLong(j12);
            builderNewBuilder.writeInt(i24);
            builderNewBuilder.writeInt(i25);
            builderNewBuilder.usePooledBuffer();
            StatsLog.write(builderNewBuilder.build());
        }
    }
}
