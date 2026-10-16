package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class vvh {
    public final defpackage.vvm a;
    public final defpackage.xyn b;
    public final defpackage.xyn c;
    public final defpackage.xyn d;
    public final defpackage.xyn e;

    public vvh(defpackage.vvm vvmVar, defpackage.xyn xynVar, defpackage.xyn xynVar2, defpackage.xyn xynVar3, defpackage.xyn xynVar4) {
        this.a = vvmVar;
        this.b = xynVar;
        this.c = xynVar2;
        this.d = xynVar3;
        this.e = xynVar4;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.vvh) {
            defpackage.vvh vvhVar = (defpackage.vvh) obj;
            if (this.a.equals(vvhVar.a) && this.b.equals(vvhVar.b) && this.c.equals(vvhVar.c) && this.d.equals(vvhVar.d) && this.e.equals(vvhVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((this.a.hashCode() ^ 1000003) * (-721379959)) ^ 1237) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ 1237;
    }

    public final java.lang.String toString() {
        return "InternalJankEventCollectionParameters{measurementKey=" + this.a.toString() + ", metricExtension=null, enablePerfettoTraceCollection=false, perfettoTimeoutOverride=Optional.absent(), perfettoBucketOverride=Optional.absent(), perfettoTriggerJankFrameRatioThresholdOverride=Optional.absent(), perfettoTriggerJankDurationThresholdOverride=Optional.absent(), triggerPerfettoFromBackground=false}";
    }

    public vvh() {
        throw null;
    }
}
