package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class saw {
    public final defpackage.xzi a;
    public final int b;
    public final defpackage.xzi c;
    public final defpackage.xzi d;
    public final defpackage.xzi e;
    public final defpackage.xzi f;
    public final defpackage.xzi g;
    public final defpackage.xzi h;
    public final defpackage.xzi i;
    public final defpackage.xzi j;
    public final defpackage.xzi k;
    public final defpackage.xzi l;
    public final defpackage.xzi m;
    public final defpackage.xzi n;
    public final defpackage.xzi o;
    public final defpackage.xzi p;
    public final defpackage.xzi q;

    public saw(defpackage.xzi xziVar, defpackage.xzi xziVar2, defpackage.xzi xziVar3, defpackage.xzi xziVar4, defpackage.xzi xziVar5, defpackage.xzi xziVar6, defpackage.xzi xziVar7, defpackage.xzi xziVar8, defpackage.xzi xziVar9, defpackage.xzi xziVar10, defpackage.xzi xziVar11, defpackage.xzi xziVar12, defpackage.xzi xziVar13, defpackage.xzi xziVar14, defpackage.xzi xziVar15, defpackage.xzi xziVar16) {
        this.a = xziVar;
        this.b = 11;
        this.c = xziVar2;
        this.d = xziVar3;
        this.e = xziVar4;
        this.f = xziVar5;
        this.g = xziVar6;
        this.h = xziVar7;
        this.i = xziVar8;
        this.j = xziVar9;
        this.k = xziVar10;
        this.l = xziVar11;
        this.m = xziVar12;
        this.n = xziVar13;
        this.o = xziVar14;
        this.p = xziVar15;
        this.q = xziVar16;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.saw) {
            defpackage.saw sawVar = (defpackage.saw) obj;
            if (this.a.equals(sawVar.a) && this.b == sawVar.b && this.c.equals(sawVar.c) && this.d.equals(sawVar.d) && this.e.equals(sawVar.e) && this.f.equals(sawVar.f) && this.g.equals(sawVar.g) && this.h.equals(sawVar.h) && this.i.equals(sawVar.i) && this.j.equals(sawVar.j) && this.k.equals(sawVar.k) && this.l.equals(sawVar.l) && this.m.equals(sawVar.m) && this.n.equals(sawVar.n) && this.o.equals(sawVar.o) && this.p.equals(sawVar.p) && this.q.equals(sawVar.q)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((((((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k.hashCode()) * 1000003) ^ this.l.hashCode()) * 1000003) ^ this.m.hashCode()) * 1000003) ^ this.n.hashCode()) * 1000003) ^ this.o.hashCode()) * 1000003) ^ this.p.hashCode();
        return this.q.hashCode() ^ (iHashCode * 1000003);
    }

    public final java.lang.String toString() {
        defpackage.xzi xziVar = this.q;
        defpackage.xzi xziVar2 = this.p;
        defpackage.xzi xziVar3 = this.o;
        defpackage.xzi xziVar4 = this.n;
        defpackage.xzi xziVar5 = this.m;
        defpackage.xzi xziVar6 = this.l;
        defpackage.xzi xziVar7 = this.k;
        defpackage.xzi xziVar8 = this.j;
        defpackage.xzi xziVar9 = this.i;
        defpackage.xzi xziVar10 = this.h;
        defpackage.xzi xziVar11 = this.g;
        defpackage.xzi xziVar12 = this.f;
        defpackage.xzi xziVar13 = this.e;
        defpackage.xzi xziVar14 = this.d;
        defpackage.xzi xziVar15 = this.c;
        return "Options{isIndependentNightModeEnabledSupplier=" + java.lang.String.valueOf(this.a) + ", clientVersion=" + this.b + ", isConfigurationContextEnabledSupplier=" + java.lang.String.valueOf(xziVar15) + ", isPersistProjectionConfigurationContextEnabledSupplier=" + java.lang.String.valueOf(xziVar14) + ", isUseInternalContextEnabledSupplier=" + java.lang.String.valueOf(xziVar13) + ", isOnlyProcessCarConfigurationChangeSupplier=" + java.lang.String.valueOf(xziVar12) + ", isProcessFontWeightAdjustmentConfigurationChangeSupplier=" + java.lang.String.valueOf(xziVar11) + ", isPredictiveBackKeyInjectionEnabledSupplier=" + java.lang.String.valueOf(xziVar10) + ", updatePresentationInputConfigurationAtEndOfAttachWindow=" + java.lang.String.valueOf(xziVar9) + ", shouldCrashClientWhenUnableToConfigure=" + java.lang.String.valueOf(xziVar8) + ", delayBetweenConfigChecksSupplier=" + java.lang.String.valueOf(xziVar7) + ", maxConfigChecksSupplier=" + java.lang.String.valueOf(xziVar6) + ", isCoolwalkEnabled=" + java.lang.String.valueOf(xziVar5) + ", isScvhRenderingEnabled=" + java.lang.String.valueOf(xziVar4) + ", isUseCaptureSecureVideoOutputEnabledSupplier=" + java.lang.String.valueOf(xziVar3) + ", isDetectSecureVideoEnabledSupplier=" + java.lang.String.valueOf(xziVar2) + ", isLocalFocusModeEnabled=" + java.lang.String.valueOf(xziVar) + "}";
    }

    public saw() {
        throw null;
    }
}
