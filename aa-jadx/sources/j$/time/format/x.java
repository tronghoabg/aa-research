package j$.time.format;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public final class x {
    public final j$.time.temporal.TemporalAccessor a;
    public final j$.time.format.DateTimeFormatter b;
    public int c;

    /* JADX WARN: Code duplicated, block: B:37:0x009c  */
    /* JADX WARN: Code duplicated, block: B:39:0x009f  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:63:0x00dd A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:45:0x00b2, please report this as an issue */
    public x(j$.time.temporal.TemporalAccessor temporalAccessor, j$.time.format.DateTimeFormatter dateTimeFormatter) {
        int i;
        j$.time.ZoneId offset;
        j$.time.chrono.a aVar = dateTimeFormatter.d;
        j$.time.ZoneId zoneId = dateTimeFormatter.e;
        if (aVar != null || zoneId != null) {
            j$.time.chrono.a aVar2 = (j$.time.chrono.a) temporalAccessor.w(j$.time.temporal.n.b);
            j$.time.ZoneId zoneId2 = (j$.time.ZoneId) temporalAccessor.w(j$.time.temporal.n.a);
            j$.time.chrono.b bVarL = null;
            aVar = j$.util.Objects.equals(aVar, aVar2) ? null : aVar;
            zoneId = j$.util.Objects.equals(zoneId, zoneId2) ? null : zoneId;
            if (aVar != null || zoneId != null) {
                j$.time.chrono.a aVar3 = aVar != null ? aVar : aVar2;
                if (zoneId == null) {
                    zoneId2 = zoneId != null ? zoneId : zoneId2;
                    if (aVar != null) {
                        if (temporalAccessor.d(j$.time.temporal.a.EPOCH_DAY)) {
                            bVarL = aVar3.l(temporalAccessor);
                        } else if (aVar == j$.time.chrono.s.c || aVar2 != null) {
                            for (j$.time.temporal.a aVar4 : j$.time.temporal.a.values()) {
                                if (!aVar4.isDateBased() && temporalAccessor.d(aVar4)) {
                                    j$.time.g.g(j$.time.e.a("Unable to apply override chronology '", java.lang.String.valueOf(aVar), "' because the temporal object being formatted contains date fields but does not represent a whole date: ", java.lang.String.valueOf(temporalAccessor)));
                                    throw null;
                                }
                            }
                        }
                    }
                    temporalAccessor = new j$.time.format.w(bVarL, temporalAccessor, aVar3, zoneId2);
                } else if (temporalAccessor.d(j$.time.temporal.a.INSTANT_SECONDS)) {
                    temporalAccessor = ((j$.time.chrono.a) j$.util.Objects.requireNonNullElse(aVar3, j$.time.chrono.s.c)).N(j$.time.Instant.s(temporalAccessor), zoneId);
                } else {
                    try {
                        j$.time.zone.ZoneRules rules = zoneId.getRules();
                        offset = rules.h() ? rules.getOffset(j$.time.Instant.EPOCH) : zoneId;
                    } catch (j$.time.zone.e unused) {
                    }
                    if (offset instanceof j$.time.ZoneOffset) {
                        j$.time.temporal.a aVar5 = j$.time.temporal.a.OFFSET_SECONDS;
                        if (temporalAccessor.d(aVar5) && temporalAccessor.h(aVar5) != zoneId.getRules().getOffset(j$.time.Instant.EPOCH).getTotalSeconds()) {
                            j$.time.g.g(j$.time.e.a("Unable to apply override zone '", java.lang.String.valueOf(zoneId), "' because the temporal object being formatted has a different offset but does not represent an instant: ", java.lang.String.valueOf(temporalAccessor)));
                            throw null;
                        }
                    }
                    if (zoneId != null) {
                    }
                    if (aVar != null) {
                        if (temporalAccessor.d(j$.time.temporal.a.EPOCH_DAY)) {
                            bVarL = aVar3.l(temporalAccessor);
                        } else if (aVar == j$.time.chrono.s.c) {
                            while (i < r2) {
                                if (!aVar4.isDateBased()) {
                                }
                            }
                        } else {
                            while (i < r2) {
                                if (!aVar4.isDateBased()) {
                                }
                            }
                        }
                    }
                    temporalAccessor = new j$.time.format.w(bVarL, temporalAccessor, aVar3, zoneId2);
                }
            }
        }
        this.a = temporalAccessor;
        this.b = dateTimeFormatter;
    }

    public final java.lang.Long a(j$.time.temporal.m mVar) {
        int i = this.c;
        j$.time.temporal.TemporalAccessor temporalAccessor = this.a;
        if (i <= 0 || temporalAccessor.d(mVar)) {
            return java.lang.Long.valueOf(temporalAccessor.C(mVar));
        }
        return null;
    }

    public final java.lang.Object b(j$.desugar.sun.nio.fs.n nVar) {
        j$.time.temporal.TemporalAccessor temporalAccessor = this.a;
        java.lang.Object objW = temporalAccessor.w(nVar);
        if (objW != null || this.c != 0) {
            return objW;
        }
        j$.time.g.g(j$.time.e.a("Unable to extract ", java.lang.String.valueOf(nVar), " from temporal ", java.lang.String.valueOf(temporalAccessor)));
        return null;
    }

    public final java.lang.String toString() {
        return this.a.toString();
    }
}
