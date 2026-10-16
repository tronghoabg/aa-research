package com.waze.network.g;

import androidx.core.app.NotificationCompat;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import com.waze.shared_infra.q.l;
import com.waze.shared_infra.q.m;
import com.waze.shared_infra.q.n;
import com.waze.sharedui.f.c;
import com.waze.sharedui.f.g;
import com.waze.sharedui.f.q;
import com.waze.sharedui.f.r;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final n f32372a = m.a(true);

    /* renamed from: b, reason: collision with root package name */
    private final l f32373b;

    /* renamed from: c, reason: collision with root package name */
    private final String f32374c;

    /* renamed from: d, reason: collision with root package name */
    private final String f32375d;

    /* renamed from: e, reason: collision with root package name */
    private final g f32376e;

    /* renamed from: f, reason: collision with root package name */
    private final byte[] f32377f;

    /* renamed from: g, reason: collision with root package name */
    private final int f32378g;

    /* renamed from: h, reason: collision with root package name */
    private final c f32379h;

    /* renamed from: i, reason: collision with root package name */
    private final long f32380i;

    /* renamed from: j, reason: collision with root package name */
    private final q f32381j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f32382k;

    /* renamed from: l, reason: collision with root package name */
    private final long f32383l;
    private long m;
    private long n;
    private Long o;
    private Integer p;
    private Integer q;
    private Integer r;
    private int s;

    public a(l lVar, String str, String str2, g gVar, byte[] bArr, int i2, c cVar, long j2, q qVar, boolean z) {
        x.f(lVar, NotificationCompat.CATEGORY_STOPWATCH);
        x.f(str, "url");
        x.f(str2, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        x.f(bArr, "data");
        x.f(cVar, "authenticationMethod");
        this.f32373b = lVar;
        this.f32374c = str;
        this.f32375d = str2;
        this.f32376e = gVar;
        this.f32377f = bArr;
        this.f32378g = i2;
        this.f32379h = cVar;
        this.f32380i = j2;
        this.f32381j = qVar;
        this.f32382k = z;
        this.f32383l = lVar.a();
    }

    public final int a() {
        return this.s;
    }

    public final int b() {
        return this.f32378g;
    }

    public final long c() {
        return this.f32380i;
    }

    public final c e() {
        return this.f32379h;
    }

    public final g f() {
        return this.f32376e;
    }

    public final q g() {
        return this.f32381j;
    }

    public final r h() {
        long j2 = this.m - this.f32383l;
        Long l2 = this.o;
        Long lValueOf = l2 != null ? Long.valueOf(l2.longValue() - this.n) : null;
        return new r((int) j2, this.p, lValueOf != null ? Integer.valueOf((int) lValueOf.longValue()) : null, this.s, this.f32376e, this.f32381j, this.f32377f.length, this.q, this.r);
    }

    public final String i() {
        return this.f32375d;
    }

    public final String j() {
        return this.f32374c;
    }

    public final void k() {
        this.m = this.f32373b.a();
    }

    public final void l(int i2) {
        this.r = Integer.valueOf(i2);
    }

    public final void m() {
        this.n = this.f32373b.a();
    }

    public final void n(int i2) {
        this.q = Integer.valueOf(i2);
    }

    public final void o() {
        this.o = Long.valueOf(this.f32373b.a());
    }

    public final void p(int i2) {
        this.s = i2;
    }

    public final void q(int i2) {
        this.p = Integer.valueOf(i2);
    }

    public final boolean r() {
        return this.f32382k;
    }

    public final byte[] s() {
        return this.f32377f;
    }

    public final String toString() {
        return "MessageRequest(size=" + this.f32377f.length + ", retry_count=" + this.s + ", priority=" + this.f32376e + ", transaction_id=" + this.f32378g + ", authentication_method=" + this.f32379h + ", context=" + this.f32380i + ", queue_id=" + this.f32381j + ")";
    }

    public /* synthetic */ a(n nVar, String str, g gVar, byte[] bArr, int i2, c cVar, q qVar, boolean z, int i3) {
        this((i3 & 1) != 0 ? f32372a : nVar, str, "binary/octet-stream", gVar, bArr, i2, cVar, 0L, qVar, ((i3 & 512) == 0) & z);
    }
}
