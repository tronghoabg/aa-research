package pd;

import c7.C1576l;
import cg.C1618g;
import java.io.IOException;
import od.AbstractC3668a;

/* loaded from: classes5.dex */
public final class v {

    /* renamed from: b, reason: collision with root package name */
    public final int f43604b;

    /* renamed from: c, reason: collision with root package name */
    public int f43605c;

    /* renamed from: d, reason: collision with root package name */
    public int f43606d;

    /* renamed from: e, reason: collision with root package name */
    public final u f43607e;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C1576l f43609g;

    /* renamed from: a, reason: collision with root package name */
    public final C1618g f43603a = new C1618g();

    /* renamed from: f, reason: collision with root package name */
    public boolean f43608f = false;

    public v(C1576l c1576l, int i5, int i10, u uVar) {
        this.f43609g = c1576l;
        this.f43604b = i5;
        this.f43605c = i10;
        this.f43607e = uVar;
    }

    public final int a(int i5) {
        if (i5 <= 0 || com.google.android.gms.common.api.f.API_PRIORITY_OTHER - i5 >= this.f43605c) {
            int i10 = this.f43605c + i5;
            this.f43605c = i10;
            return i10;
        }
        throw new IllegalArgumentException("Window size overflow for stream: " + this.f43604b);
    }

    public final void b(int i5, C1618g c1618g, boolean z2) {
        do {
            int iMin = Math.min(i5, ((d) this.f43609g.f19707c).f43481b.f43465a.f44793d);
            int i10 = -iMin;
            ((v) this.f43609g.f19708d).a(i10);
            a(i10);
            try {
                boolean z10 = false;
                ((d) this.f43609g.f19707c).a(c1618g.f19902b == ((long) iMin) && z2, this.f43604b, c1618g, iMin);
                AbstractC3668a abstractC3668a = (AbstractC3668a) this.f43607e;
                synchronized (abstractC3668a.f41871b) {
                    Fe.e.w("onStreamAllocated was not called, but it seems the stream is active", abstractC3668a.f41875f);
                    int i11 = abstractC3668a.f41874e;
                    boolean z11 = i11 < 32768;
                    int i12 = i11 - iMin;
                    abstractC3668a.f41874e = i12;
                    boolean z12 = i12 < 32768;
                    if (!z11 && z12) {
                        z10 = true;
                    }
                }
                if (z10) {
                    abstractC3668a.f();
                }
                i5 -= iMin;
            } catch (IOException e7) {
                throw new RuntimeException(e7);
            }
        } while (i5 > 0);
    }

    public final void c(int i5, R1.i iVar) {
        int i10 = this.f43605c;
        C1576l c1576l = this.f43609g;
        int iMin = Math.min(i5, Math.min(i10, ((v) c1576l.f19708d).f43605c));
        int i11 = 0;
        while (true) {
            C1618g c1618g = this.f43603a;
            long j8 = c1618g.f19902b;
            if (j8 <= 0 || iMin <= 0) {
                return;
            }
            if (iMin >= j8) {
                int i12 = (int) j8;
                i11 += i12;
                b(i12, c1618g, this.f43608f);
            } else {
                i11 += iMin;
                b(iMin, c1618g, false);
            }
            iVar.f10117b++;
            iMin = Math.min(i5 - i11, Math.min(this.f43605c, ((v) c1576l.f19708d).f43605c));
        }
    }
}
