package com.waze.z.a.d;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ao {

    /* renamed from: a, reason: collision with root package name */
    private final ap f45937a;

    /* renamed from: b, reason: collision with root package name */
    private final h.g.a.l f45938b;

    public ao(ap apVar, h.g.a.l lVar) {
        h.g.b.x.f(apVar, "voiceSearchType");
        h.g.b.x.f(lVar, "onVoiceSearchClicked");
        this.f45937a = apVar;
        this.f45938b = lVar;
    }

    public final ap a() {
        return this.f45937a;
    }

    public final h.g.a.l b() {
        return this.f45938b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ao)) {
            return false;
        }
        ao aoVar = (ao) obj;
        return this.f45937a == aoVar.f45937a && h.g.b.x.n(this.f45938b, aoVar.f45938b);
    }

    public final int hashCode() {
        return (this.f45937a.hashCode() * 31) + this.f45938b.hashCode();
    }

    public final String toString() {
        return "VoiceSearchProperties(voiceSearchType=" + this.f45937a + ", onVoiceSearchClicked=" + this.f45938b + ")";
    }
}
