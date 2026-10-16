package defpackage;

/* loaded from: classes.dex */
public final class saa {
    public final xyc a;
    public final int b;
    public final xyc c;
    public final xyc d;
    public final xyc e;
    public final xyc f;
    public final xyc g;
    public final xyc h;
    public final xyc i;
    public final xyc j;
    public final xyc k;
    public final xyc l;
    public final xyc m;
    public final xyc n;
    public final xyc o;
    public final xyc p;
    public final xyc q;

    public saa(xyc xycVar, xyc xycVar2, xyc xycVar3, xyc xycVar4, xyc xycVar5, xyc xycVar6, xyc xycVar7, xyc xycVar8, xyc xycVar9, xyc xycVar10, xyc xycVar11, xyc xycVar12, xyc xycVar13, xyc xycVar14, xyc xycVar15, xyc xycVar16) {
        this.a = xycVar;
        this.b = 11;
        this.c = xycVar2;
        this.d = xycVar3;
        this.e = xycVar4;
        this.f = xycVar5;
        this.g = xycVar6;
        this.h = xycVar7;
        this.i = xycVar8;
        this.j = xycVar9;
        this.k = xycVar10;
        this.l = xycVar11;
        this.m = xycVar12;
        this.n = xycVar13;
        this.o = xycVar14;
        this.p = xycVar15;
        this.q = xycVar16;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof saa) {
            saa saaVar = (saa) obj;
            if (this.a.equals(saaVar.a) && this.b == saaVar.b && this.c.equals(saaVar.c) && this.d.equals(saaVar.d) && this.e.equals(saaVar.e) && this.f.equals(saaVar.f) && this.g.equals(saaVar.g) && this.h.equals(saaVar.h) && this.i.equals(saaVar.i) && this.j.equals(saaVar.j) && this.k.equals(saaVar.k) && this.l.equals(saaVar.l) && this.m.equals(saaVar.m) && this.n.equals(saaVar.n) && this.o.equals(saaVar.o) && this.p.equals(saaVar.p) && this.q.equals(saaVar.q)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((((((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k.hashCode()) * 1000003) ^ this.l.hashCode()) * 1000003) ^ this.m.hashCode()) * 1000003) ^ this.n.hashCode()) * 1000003) ^ this.o.hashCode()) * 1000003) ^ this.p.hashCode();
        return this.q.hashCode() ^ (iHashCode * 1000003);
    }

    public final String toString() {
        xyc xycVar = this.q;
        xyc xycVar2 = this.p;
        xyc xycVar3 = this.o;
        xyc xycVar4 = this.n;
        xyc xycVar5 = this.m;
        xyc xycVar6 = this.l;
        xyc xycVar7 = this.k;
        xyc xycVar8 = this.j;
        xyc xycVar9 = this.i;
        xyc xycVar10 = this.h;
        xyc xycVar11 = this.g;
        xyc xycVar12 = this.f;
        xyc xycVar13 = this.e;
        xyc xycVar14 = this.d;
        xyc xycVar15 = this.c;
        return "Options{isIndependentNightModeEnabledSupplier=" + String.valueOf(this.a) + ", clientVersion=" + this.b + ", isConfigurationContextEnabledSupplier=" + String.valueOf(xycVar15) + ", isPersistProjectionConfigurationContextEnabledSupplier=" + String.valueOf(xycVar14) + ", isUseInternalContextEnabledSupplier=" + String.valueOf(xycVar13) + ", isOnlyProcessCarConfigurationChangeSupplier=" + String.valueOf(xycVar12) + ", isProcessFontWeightAdjustmentConfigurationChangeSupplier=" + String.valueOf(xycVar11) + ", isPredictiveBackKeyInjectionEnabledSupplier=" + String.valueOf(xycVar10) + ", updatePresentationInputConfigurationAtEndOfAttachWindow=" + String.valueOf(xycVar9) + ", shouldCrashClientWhenUnableToConfigure=" + String.valueOf(xycVar8) + ", delayBetweenConfigChecksSupplier=" + String.valueOf(xycVar7) + ", maxConfigChecksSupplier=" + String.valueOf(xycVar6) + ", isCoolwalkEnabled=" + String.valueOf(xycVar5) + ", isScvhRenderingEnabled=" + String.valueOf(xycVar4) + ", isUseCaptureSecureVideoOutputEnabledSupplier=" + String.valueOf(xycVar3) + ", isDetectSecureVideoEnabledSupplier=" + String.valueOf(xycVar2) + ", isLocalFocusModeEnabled=" + String.valueOf(xycVar) + "}";
    }

    public saa() {
        throw null;
    }
}
