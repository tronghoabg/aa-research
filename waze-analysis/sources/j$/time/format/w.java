package j$.time.format;

import j$.time.temporal.TemporalAccessor;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final TemporalAccessor f49999a;

    /* renamed from: b, reason: collision with root package name */
    public final DateTimeFormatter f50000b;

    /* renamed from: c, reason: collision with root package name */
    public int f50001c;

    /* JADX WARN: Removed duplicated region for block: B:41:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public w(j$.time.temporal.TemporalAccessor r10, j$.time.format.DateTimeFormatter r11) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.format.w.<init>(j$.time.temporal.TemporalAccessor, j$.time.format.DateTimeFormatter):void");
    }

    public final Long a(j$.time.temporal.m mVar) {
        int i2 = this.f50001c;
        TemporalAccessor temporalAccessor = this.f49999a;
        if (i2 <= 0 || temporalAccessor.c(mVar)) {
            return Long.valueOf(temporalAccessor.D(mVar));
        }
        return null;
    }

    public final Object b(j$.desugar.sun.nio.fs.n nVar) {
        TemporalAccessor temporalAccessor = this.f49999a;
        Object objX = temporalAccessor.x(nVar);
        if (objX != null || this.f50001c != 0) {
            return objX;
        }
        j$.time.f.h(j$.desugar.sun.nio.fs.h.b("Unable to extract ", String.valueOf(nVar), " from temporal ", String.valueOf(temporalAccessor)));
        return null;
    }

    public final String toString() {
        return this.f49999a.toString();
    }
}
