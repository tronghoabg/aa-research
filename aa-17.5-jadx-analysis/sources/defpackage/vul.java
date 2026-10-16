package defpackage;

/* loaded from: classes3.dex */
final class vul {
    public final vur a;
    public final xxh b;
    public final xxh c;
    public final xxh d;
    public final xxh e;

    public vul(vur vurVar, xxh xxhVar, xxh xxhVar2, xxh xxhVar3, xxh xxhVar4) {
        this.a = vurVar;
        this.b = xxhVar;
        this.c = xxhVar2;
        this.d = xxhVar3;
        this.e = xxhVar4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vul) {
            vul vulVar = (vul) obj;
            if (this.a.equals(vulVar.a) && this.b.equals(vulVar.b) && this.c.equals(vulVar.c) && this.d.equals(vulVar.d) && this.e.equals(vulVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((this.a.hashCode() ^ 1000003) * (-721379959)) ^ 1237) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ 1237;
    }

    public final String toString() {
        return "InternalJankEventCollectionParameters{measurementKey=" + this.a.toString() + ", metricExtension=null, enablePerfettoTraceCollection=false, perfettoTimeoutOverride=Optional.absent(), perfettoBucketOverride=Optional.absent(), perfettoTriggerJankFrameRatioThresholdOverride=Optional.absent(), perfettoTriggerJankDurationThresholdOverride=Optional.absent(), triggerPerfettoFromBackground=false}";
    }

    public vul() {
        throw null;
    }
}
