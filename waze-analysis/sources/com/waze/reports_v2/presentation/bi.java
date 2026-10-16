package com.waze.reports_v2.presentation;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class bi {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f34870a;

    /* renamed from: b, reason: collision with root package name */
    private final av f34871b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f34872c;

    public bi(boolean z, av avVar, boolean z2) {
        this.f34870a = z;
        this.f34871b = avVar;
        this.f34872c = z2;
    }

    public static /* synthetic */ bi c(bi biVar, boolean z, av avVar, boolean z2, int i2) {
        if ((i2 & 1) != 0) {
            z = biVar.f34870a;
        }
        if ((i2 & 2) != 0) {
            avVar = biVar.f34871b;
        }
        if ((i2 & 4) != 0) {
            z2 = biVar.f34872c;
        }
        return new bi(z, avVar, z2);
    }

    public final av a() {
        return this.f34871b;
    }

    public final boolean b() {
        return this.f34872c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bi)) {
            return false;
        }
        bi biVar = (bi) obj;
        return this.f34870a == biVar.f34870a && h.g.b.x.n(this.f34871b, biVar.f34871b) && this.f34872c == biVar.f34872c;
    }

    public final int hashCode() {
        av avVar = this.f34871b;
        return (((a.a.a(this.f34870a) * 31) + (avVar == null ? 0 : avVar.hashCode())) * 31) + a.a.a(this.f34872c);
    }

    public final String toString() {
        return "InternalState(conversationalReportingAvailableAndEnabled=" + this.f34870a + ", educationState=" + this.f34871b + ", recordingPermissionGranted=" + this.f34872c + ")";
    }
}
