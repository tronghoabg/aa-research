package com.waze.av.b;

import androidx.autofill.HintConstants;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class a extends c {

    /* renamed from: a, reason: collision with root package name */
    private final long f15838a;

    /* renamed from: b, reason: collision with root package name */
    private final String f15839b;

    /* renamed from: c, reason: collision with root package name */
    private final String f15840c;

    /* renamed from: d, reason: collision with root package name */
    private final long f15841d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.shared_infra.q.b f15842e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f15843f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(long j2, String str, String str2, long j3, com.waze.shared_infra.q.b bVar, boolean z) {
        super(null);
        h.g.b.x.f(str, "eventId");
        h.g.b.x.f(str2, HintConstants.AUTOFILL_HINT_NAME);
        this.f15838a = j2;
        this.f15839b = str;
        this.f15840c = str2;
        this.f15841d = j3;
        this.f15842e = bVar;
        this.f15843f = z;
    }

    @Override // com.waze.av.b.c
    public final long a() {
        return this.f15838a;
    }

    @Override // com.waze.av.b.c
    public final long b() {
        return this.f15841d;
    }

    @Override // com.waze.av.b.c
    public final String c() {
        return this.f15839b;
    }

    @Override // com.waze.av.b.c
    public final String d() {
        return this.f15840c;
    }

    public final boolean e() {
        return this.f15843f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f15838a == aVar.f15838a && h.g.b.x.n(this.f15839b, aVar.f15839b) && h.g.b.x.n(this.f15840c, aVar.f15840c) && com.waze.shared_infra.q.b.d(this.f15841d, aVar.f15841d) && h.g.b.x.n(this.f15842e, aVar.f15842e) && this.f15843f == aVar.f15843f;
    }

    public final int hashCode() {
        int iB = (((a.a.b(this.f15838a) * 31) + this.f15839b.hashCode()) * 31) + this.f15840c.hashCode();
        com.waze.shared_infra.q.b bVar = this.f15842e;
        return (((((iB * 31) + a.a.b(this.f15841d)) * 31) + (bVar == null ? 0 : a.a.b(bVar.a()))) * 31) + a.a.a(this.f15843f);
    }

    public final String toString() {
        return "CalendarEventInfo(id=" + this.f15838a + ", eventId=" + this.f15839b + ", name=" + this.f15840c + ", startTime=" + com.waze.shared_infra.q.b.c(this.f15841d) + ", endTime=" + this.f15842e + ", validated=" + this.f15843f + ")";
    }
}
