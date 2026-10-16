package defpackage;

import java.io.PrintWriter;
import java.util.Arrays;

/* loaded from: classes2.dex */
final class ipq implements ipx {
    private final isw a;
    private final boolean b;
    private final ipt c;
    private final iqp d;
    private boolean e = false;
    private final iqa f;
    private final int g;
    private final int h;

    public ipq(iqa iqaVar, isw iswVar, int i, int i2, iqp iqpVar) {
        this.f = iqaVar;
        this.a = iswVar;
        this.g = i;
        this.h = i2;
        this.d = iqpVar;
        boolean z = i == i2;
        this.b = !z;
        this.c = !z ? new ipt(fyh.e(i), new ird(1)) : null;
    }

    private final ipr h() {
        ipr iprVarA = a();
        int iA = iprVarA.a();
        Arrays.fill(iprVarA.h.array(), iA, iprVarA.b() + iA, (byte) 0);
        return iprVarA;
    }

    private final boolean i(ipr iprVar) {
        int i = this.g;
        int i2 = i - 1;
        if (i2 == 1) {
            int i3 = this.h;
            if (i3 == 3) {
                return this.a.d(this.d.d, iprVar);
            }
            if (i3 == 4) {
                isw.g(this.d.d, iprVar);
                return true;
            }
        } else {
            if (i2 == 2) {
                this.a.f(this.d.d, iprVar);
                return true;
            }
            if (i2 == 3) {
                int i4 = this.h;
                if (i4 == 3) {
                    return this.a.c(this.d.d, iprVar);
                }
                if (i4 == 2) {
                    this.a.e(this.d.d, iprVar);
                    return true;
                }
            }
        }
        throw new IllegalArgumentException("Client audio format: " + eee.m(i) + ", Protocol audio format: " + eee.m(this.h));
    }

    @Override // defpackage.ipx
    public final ipr a() {
        if (!this.b) {
            return this.d.d.b();
        }
        ipt iptVar = this.c;
        iptVar.getClass();
        return iptVar.b();
    }

    @Override // defpackage.ipx
    public final void b(PrintWriter printWriter) {
        printWriter.println("AsynchronousAudioProcessor:");
        printWriter.println("  needsResampling=" + this.b);
        this.d.a(printWriter);
    }

    @Override // defpackage.ipx
    public final synchronized void c(ipr iprVar) {
        if (this.e) {
            this.f.h(oui.AUDIO_BOTTOM_HALF_TRANSMISSION_HANDLER_SHUTTING_DOWN);
        } else if (!this.b) {
            this.d.b(iprVar);
        } else if (i(iprVar)) {
            this.d.e();
        }
    }

    @Override // defpackage.ipx
    public final synchronized void d() {
        if (this.e) {
            return;
        }
        this.e = true;
        ipt iptVar = this.c;
        if (iptVar != null) {
            iptVar.f();
        }
        this.a.a();
    }

    @Override // defpackage.ipx
    public final synchronized void e() {
        if (this.e) {
            return;
        }
        this.a.a();
        this.d.d();
    }

    @Override // defpackage.ipx
    public final synchronized void f(xkk xkkVar) {
        if (this.e) {
            return;
        }
        this.d.f(xkkVar);
    }

    @Override // defpackage.ipx
    public final synchronized boolean g(boolean z, boolean z2) {
        boolean z3 = false;
        if (this.e) {
            return false;
        }
        isw iswVar = this.a;
        boolean z4 = iswVar.a != null;
        boolean z5 = this.b;
        if (z5 && z4) {
            if (z) {
                iswVar.a();
            } else {
                if (this.g == 4 && this.h == 3 && !iswVar.b()) {
                    i(h());
                }
                i(h());
                this.d.e();
            }
        }
        if (z5 && z4 && !z) {
            z3 = true;
        }
        return this.d.g(z, z2, z3);
    }
}
