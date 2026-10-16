package e.a.d;

import j$.util.Objects;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class iv implements ah {

    /* renamed from: a, reason: collision with root package name */
    final iw f47184a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ iy f47185b;

    iv(iy iyVar, iw iwVar) {
        Objects.requireNonNull(iyVar);
        this.f47185b = iyVar;
        this.f47184a = iwVar;
    }

    private static final Integer a(e.a.cm cmVar) {
        String str = (String) cmVar.e(iy.f47195b);
        if (str == null) {
            return null;
        }
        try {
            return Integer.valueOf(str);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01d9  */
    @Override // e.a.d.ah
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(e.a.ee r21, e.a.d.ag r22, e.a.cm r23) {
        /*
            Method dump skipped, instructions count: 763
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e.a.d.iv.c(e.a.ee, e.a.d.ag, e.a.cm):void");
    }

    @Override // e.a.d.ah
    public final void d(e.a.cm cmVar) {
        AtomicInteger atomicInteger;
        int i2;
        int i3;
        iw iwVar = this.f47184a;
        int i4 = iwVar.f47189d;
        if (i4 > 0) {
            e.a.ch chVar = iy.f47194a;
            cmVar.g(chVar);
            cmVar.i(chVar, String.valueOf(i4));
        }
        iy iyVar = this.f47185b;
        iy.R(iyVar, iwVar);
        if (iyVar.w.f47168f == iwVar) {
            if (iyVar.u != null) {
                ix ixVar = iyVar.u;
                do {
                    atomicInteger = ixVar.f47193d;
                    i2 = atomicInteger.get();
                    i3 = ixVar.f47190a;
                    if (i2 == i3) {
                        break;
                    }
                } while (!atomicInteger.compareAndSet(i2, Math.min(ixVar.f47192c + i2, i3)));
            }
            iyVar.f47205l.execute(new io(this, cmVar));
        }
    }

    @Override // e.a.d.jw
    public final void e(jv jvVar) throws IOException {
        iy iyVar = this.f47185b;
        iw iwVar = iyVar.w.f47168f;
        com.google.d.b.an.v(iwVar != null, "Headers should be received prior to messages.");
        if (iwVar != this.f47184a) {
            dh.f(jvVar);
        } else {
            iyVar.f47205l.execute(new it(this, jvVar));
        }
    }

    @Override // e.a.d.jw
    public final void f() {
        iy iyVar = this.f47185b;
        if (iyVar.o()) {
            iyVar.f47205l.execute(new iu(this));
        }
    }
}
