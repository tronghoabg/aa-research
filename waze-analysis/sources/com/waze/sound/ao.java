package com.waze.sound;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ao {

    /* renamed from: a, reason: collision with root package name */
    private final long f39452a;

    /* renamed from: b, reason: collision with root package name */
    private final ap f39453b;

    public ao(long j2, ap apVar) {
        h.g.b.x.f(apVar, "voiceAsset");
        this.f39452a = j2;
        this.f39453b = apVar;
    }

    public final long a() {
        return this.f39452a;
    }

    public final ap b() {
        return this.f39453b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ao)) {
            return false;
        }
        ao aoVar = (ao) obj;
        return this.f39452a == aoVar.f39452a && h.g.b.x.n(this.f39453b, aoVar.f39453b);
    }

    public final int hashCode() {
        return (a.a.b(this.f39452a) * 31) + this.f39453b.hashCode();
    }

    public final String toString() {
        return "ClientAnnouncementVoiceAsset(announcementId=" + this.f39452a + ", voiceAsset=" + this.f39453b + ")";
    }
}
