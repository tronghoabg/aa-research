package com.waze.av.b;

import androidx.autofill.HintConstants;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class b extends c {

    /* renamed from: a, reason: collision with root package name */
    private final long f15919a;

    /* renamed from: b, reason: collision with root package name */
    private final String f15920b;

    /* renamed from: c, reason: collision with root package name */
    private final String f15921c;

    /* renamed from: d, reason: collision with root package name */
    private final long f15922d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.shared_infra.q.b f15923e;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.av.a.p f15924f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(long j2, String str, String str2, long j3, com.waze.shared_infra.q.b bVar, com.waze.av.a.p pVar) {
        super(null);
        h.g.b.x.f(str, "eventId");
        h.g.b.x.f(str2, HintConstants.AUTOFILL_HINT_NAME);
        this.f15919a = j2;
        this.f15920b = str;
        this.f15921c = str2;
        this.f15922d = j3;
        this.f15923e = bVar;
        this.f15924f = pVar;
    }

    @Override // com.waze.av.b.c
    public final long a() {
        return this.f15919a;
    }

    @Override // com.waze.av.b.c
    public final long b() {
        return this.f15922d;
    }

    @Override // com.waze.av.b.c
    public final String c() {
        return this.f15920b;
    }

    @Override // com.waze.av.b.c
    public final String d() {
        return this.f15921c;
    }

    public final com.waze.av.a.p e() {
        return this.f15924f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f15919a == bVar.f15919a && h.g.b.x.n(this.f15920b, bVar.f15920b) && h.g.b.x.n(this.f15921c, bVar.f15921c) && com.waze.shared_infra.q.b.d(this.f15922d, bVar.f15922d) && h.g.b.x.n(this.f15923e, bVar.f15923e) && h.g.b.x.n(this.f15924f, bVar.f15924f);
    }

    public final int hashCode() {
        int iB = (((a.a.b(this.f15919a) * 31) + this.f15920b.hashCode()) * 31) + this.f15921c.hashCode();
        com.waze.shared_infra.q.b bVar = this.f15923e;
        int iB2 = ((((iB * 31) + a.a.b(this.f15922d)) * 31) + (bVar == null ? 0 : a.a.b(bVar.a()))) * 31;
        com.waze.av.a.p pVar = this.f15924f;
        return iB2 + (pVar != null ? pVar.hashCode() : 0);
    }

    public final String toString() {
        return "PlannedDriveInfo(id=" + this.f15919a + ", eventId=" + this.f15920b + ", name=" + this.f15921c + ", startTime=" + com.waze.shared_infra.q.b.c(this.f15922d) + ", endTime=" + this.f15923e + ", origin=" + this.f15924f + ")";
    }
}
