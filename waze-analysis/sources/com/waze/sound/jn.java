package com.waze.sound;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class jn extends jo {

    /* renamed from: a, reason: collision with root package name */
    private final int f40334a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.v.v f40335b;

    /* renamed from: c, reason: collision with root package name */
    private final List f40336c;

    /* renamed from: d, reason: collision with root package name */
    private final jm f40337d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jn(int i2, com.google.v.v vVar, List list, jm jmVar) {
        super(null);
        h.g.b.x.f(vVar, "instructionAnnouncementData");
        h.g.b.x.f(list, "clientAnnouncements");
        this.f40334a = i2;
        this.f40335b = vVar;
        this.f40336c = list;
        this.f40337d = jmVar;
    }

    public static /* synthetic */ jn e(jn jnVar, jm jmVar) {
        int i2 = jnVar.f40334a;
        com.google.v.v vVar = jnVar.f40335b;
        List list = jnVar.f40336c;
        h.g.b.x.f(vVar, "instructionAnnouncementData");
        h.g.b.x.f(list, "clientAnnouncements");
        return new jn(i2, vVar, list, jmVar);
    }

    @Override // com.waze.sound.jo
    public final int a() {
        return this.f40334a;
    }

    @Override // com.waze.sound.jo
    public final List b() {
        return this.f40336c;
    }

    public final com.google.v.v c() {
        return this.f40335b;
    }

    public final jm d() {
        return this.f40337d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jn)) {
            return false;
        }
        jn jnVar = (jn) obj;
        return this.f40334a == jnVar.f40334a && h.g.b.x.n(this.f40335b, jnVar.f40335b) && h.g.b.x.n(this.f40336c, jnVar.f40336c) && h.g.b.x.n(this.f40337d, jnVar.f40337d);
    }

    public final int hashCode() {
        int iHashCode = (((this.f40334a * 31) + this.f40335b.hashCode()) * 31) + this.f40336c.hashCode();
        jm jmVar = this.f40337d;
        return (iHashCode * 31) + (jmVar == null ? 0 : jmVar.hashCode());
    }

    public final String toString() {
        return "Online(routeSegmentIndex=" + this.f40334a + ", instructionAnnouncementData=" + this.f40335b + ", clientAnnouncements=" + this.f40336c + ", fallback=" + this.f40337d + ")";
    }
}
