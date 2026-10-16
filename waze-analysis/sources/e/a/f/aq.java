package e.a.f;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class aq {

    /* renamed from: a, reason: collision with root package name */
    private final ao f47661a;

    /* renamed from: b, reason: collision with root package name */
    private final e.a.f.a.a.d f47662b;

    /* renamed from: c, reason: collision with root package name */
    private int f47663c;

    /* renamed from: d, reason: collision with root package name */
    private final an f47664d;

    public aq(ao aoVar, e.a.f.a.a.d dVar) {
        this.f47661a = aoVar;
        com.google.d.b.an.C(dVar, "frameWriter");
        this.f47662b = dVar;
        this.f47663c = 65535;
        this.f47664d = new an(this, 0, 65535, null);
    }

    public final an b(am amVar, int i2) {
        return new an(this, i2, this.f47663c, amVar);
    }

    public final void d(boolean z, an anVar, k.h hVar, boolean z2) {
        com.google.d.b.an.C(hVar, "source");
        int iD = anVar.d();
        boolean zI = anVar.i();
        int iQ = (int) hVar.q();
        if (zI || iD < iQ) {
            if (!zI && iD > 0) {
                anVar.h(hVar, iD, false);
            }
            anVar.g(hVar, (int) hVar.q(), z);
        } else {
            anVar.h(hVar, iQ, z);
        }
        if (z2) {
            e();
        }
    }

    public final void e() {
        try {
            this.f47662b.g();
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }

    public final void f() {
        int i2;
        ao aoVar = this.f47661a;
        an[] anVarArrAa = aoVar.aa();
        Collections.shuffle(Arrays.asList(anVarArrAa));
        int length = anVarArrAa.length;
        int iC = this.f47664d.c();
        while (true) {
            i2 = 0;
            if (length <= 0 || iC <= 0) {
                break;
            }
            int iCeil = (int) Math.ceil(iC / length);
            for (int i3 = 0; i3 < length && iC > 0; i3++) {
                an anVar = anVarArrAa[i3];
                int iMin = Math.min(iC, Math.min(anVar.b(), iCeil));
                if (iMin > 0) {
                    anVar.e(iMin);
                    iC -= iMin;
                }
                if (anVar.b() > 0) {
                    anVarArrAa[i2] = anVar;
                    i2++;
                }
            }
            length = i2;
        }
        ap apVar = new ap();
        an[] anVarArrAa2 = aoVar.aa();
        int length2 = anVarArrAa2.length;
        while (i2 < length2) {
            an anVar2 = anVarArrAa2[i2];
            anVar2.j(anVar2.a(), apVar);
            anVar2.f();
            i2++;
        }
        if (apVar.a()) {
            e();
        }
    }

    public final boolean g(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("Invalid initial window size: " + i2);
        }
        int i3 = i2 - this.f47663c;
        this.f47663c = i2;
        for (an anVar : this.f47661a.aa()) {
            anVar.k(i3);
        }
        return i3 > 0;
    }

    public final void h(an anVar, int i2) {
        if (anVar == null) {
            this.f47664d.k(i2);
            f();
            return;
        }
        anVar.k(i2);
        ap apVar = new ap();
        anVar.j(anVar.d(), apVar);
        if (apVar.a()) {
            e();
        }
    }
}
