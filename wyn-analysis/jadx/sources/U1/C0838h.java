package U1;

import java.util.HashMap;
import java.util.Iterator;

/* renamed from: U1.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0838h {

    /* renamed from: a, reason: collision with root package name */
    public final o2.e f12071a;

    /* renamed from: b, reason: collision with root package name */
    public final long f12072b;

    /* renamed from: c, reason: collision with root package name */
    public final long f12073c;

    /* renamed from: d, reason: collision with root package name */
    public final long f12074d;

    /* renamed from: e, reason: collision with root package name */
    public final long f12075e;

    /* renamed from: f, reason: collision with root package name */
    public final int f12076f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f12077g;

    /* renamed from: h, reason: collision with root package name */
    public final long f12078h;

    /* renamed from: i, reason: collision with root package name */
    public final HashMap f12079i;

    /* renamed from: j, reason: collision with root package name */
    public long f12080j;

    public C0838h(o2.e eVar, int i5, int i10, int i11, int i12, int i13, boolean z2, int i14) {
        a(i11, 0, "bufferForPlaybackMs", "0");
        a(i12, 0, "bufferForPlaybackAfterRebufferMs", "0");
        a(i5, i11, "minBufferMs", "bufferForPlaybackMs");
        a(i5, i12, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        a(i10, i5, "maxBufferMs", "minBufferMs");
        a(i14, 0, "backBufferDurationMs", "0");
        this.f12071a = eVar;
        this.f12072b = Q1.x.K(i5);
        this.f12073c = Q1.x.K(i10);
        this.f12074d = Q1.x.K(i11);
        this.f12075e = Q1.x.K(i12);
        this.f12076f = i13;
        this.f12077g = z2;
        this.f12078h = Q1.x.K(i14);
        this.f12079i = new HashMap();
        this.f12080j = -1L;
    }

    public static void a(int i5, int i10, String str, String str2) {
        Q1.k.b(str + " cannot be less than " + str2, i5 >= i10);
    }

    public final int b() {
        Iterator it = this.f12079i.values().iterator();
        int i5 = 0;
        while (it.hasNext()) {
            i5 += ((C0837g) it.next()).f12070b;
        }
        return i5;
    }

    public final boolean c(A a5) {
        int i5;
        C0837g c0837g = (C0837g) this.f12079i.get(a5.f11901a);
        c0837g.getClass();
        o2.e eVar = this.f12071a;
        synchronized (eVar) {
            i5 = eVar.f41284e * eVar.f41282c;
        }
        boolean z2 = true;
        boolean z10 = i5 >= b();
        float f10 = a5.f11903c;
        long j8 = this.f12073c;
        long jMin = this.f12072b;
        if (f10 > 1.0f) {
            jMin = Math.min(Q1.x.w(jMin, f10), j8);
        }
        long jMax = Math.max(jMin, 500000L);
        long j10 = a5.f11902b;
        if (j10 < jMax) {
            if (!this.f12077g && z10) {
                z2 = false;
            }
            c0837g.f12069a = z2;
            if (!z2 && j10 < 500000) {
                Q1.k.w("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j10 >= j8 || z10) {
            c0837g.f12069a = false;
        }
        return c0837g.f12069a;
    }

    public final void d() {
        if (!this.f12079i.isEmpty()) {
            this.f12071a.a(b());
            return;
        }
        o2.e eVar = this.f12071a;
        synchronized (eVar) {
            if (eVar.f41281b) {
                eVar.a(0);
            }
        }
    }
}
