package b2;

import N1.C0761j;
import java.util.List;
import java.util.Map;
import l8.AbstractC3409K;
import l8.AbstractC3437s;
import l8.j0;

/* loaded from: classes.dex */
public final class i extends m {

    /* renamed from: d, reason: collision with root package name */
    public final int f19193d;

    /* renamed from: e, reason: collision with root package name */
    public final long f19194e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f19195f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f19196g;

    /* renamed from: h, reason: collision with root package name */
    public final long f19197h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f19198i;

    /* renamed from: j, reason: collision with root package name */
    public final int f19199j;
    public final long k;

    /* renamed from: l, reason: collision with root package name */
    public final int f19200l;

    /* renamed from: m, reason: collision with root package name */
    public final long f19201m;

    /* renamed from: n, reason: collision with root package name */
    public final long f19202n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f19203o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f19204p;

    /* renamed from: q, reason: collision with root package name */
    public final C0761j f19205q;

    /* renamed from: r, reason: collision with root package name */
    public final AbstractC3409K f19206r;

    /* renamed from: s, reason: collision with root package name */
    public final AbstractC3409K f19207s;

    /* renamed from: t, reason: collision with root package name */
    public final j0 f19208t;

    /* renamed from: u, reason: collision with root package name */
    public final long f19209u;

    /* renamed from: v, reason: collision with root package name */
    public final h f19210v;

    public i(int i5, String str, List list, long j8, boolean z2, long j10, boolean z10, int i10, long j11, int i11, long j12, long j13, boolean z11, boolean z12, boolean z13, C0761j c0761j, List list2, List list3, h hVar, Map map) {
        super(str, list, z11);
        this.f19193d = i5;
        this.f19197h = j10;
        this.f19196g = z2;
        this.f19198i = z10;
        this.f19199j = i10;
        this.k = j11;
        this.f19200l = i11;
        this.f19201m = j12;
        this.f19202n = j13;
        this.f19203o = z12;
        this.f19204p = z13;
        this.f19205q = c0761j;
        this.f19206r = AbstractC3409K.j(list2);
        this.f19207s = AbstractC3409K.j(list3);
        this.f19208t = j0.a(map);
        if (!list3.isEmpty()) {
            d dVar = (d) AbstractC3437s.j(list3);
            this.f19209u = dVar.f19182e + dVar.f19180c;
        } else if (list2.isEmpty()) {
            this.f19209u = 0L;
        } else {
            f fVar = (f) AbstractC3437s.j(list2);
            this.f19209u = fVar.f19182e + fVar.f19180c;
        }
        this.f19194e = j8 != -9223372036854775807L ? j8 >= 0 ? Math.min(this.f19209u, j8) : Math.max(0L, this.f19209u + j8) : -9223372036854775807L;
        this.f19195f = j8 >= 0;
        this.f19210v = hVar;
    }

    @Override // f2.InterfaceC2551a
    public final Object a(List list) {
        return this;
    }
}
