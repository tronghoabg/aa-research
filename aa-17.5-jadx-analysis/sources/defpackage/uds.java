package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class uds {
    public final abjz a;
    private toq b;
    private final too c;
    private final float d;
    private final float e;
    private float g;
    private final long j;
    private final too f = new too();
    private long h = -1;
    private long i = -1;

    public uds(abjz abjzVar, toq toqVar, too tooVar, float f, float f2, long j) {
        this.g = BitmapDescriptorFactory.HUE_RED;
        this.a = abjzVar;
        this.j = j;
        k(toqVar);
        this.c = tooVar;
        this.d = f;
        this.e = f2;
        this.g = f;
    }

    public static abjz e(abje abjeVar) {
        if ((abjeVar.b & 64) == 0) {
            return null;
        }
        abdl abdlVar = abjeVar.l;
        if (abdlVar == null) {
            abdlVar = abdl.a;
        }
        abnh abnhVar = abdn.P;
        abdlVar.j(abnhVar);
        abnl abnlVar = abdlVar.w;
        abnu abnuVar = abnhVar.d;
        Object objJ = abnlVar.j(abnuVar);
        if ((((abii) (objJ == null ? abnhVar.b : abnhVar.c(objJ))).b & 1048576) == 0) {
            return null;
        }
        abdl abdlVar2 = abjeVar.l;
        if (abdlVar2 == null) {
            abdlVar2 = abdl.a;
        }
        abdlVar2.j(abnhVar);
        Object objJ2 = abdlVar2.w.j(abnuVar);
        abjz abjzVar = ((abii) (objJ2 == null ? abnhVar.b : abnhVar.c(objJ2))).p;
        return abjzVar == null ? abjz.a : abjzVar;
    }

    public static List f(abjz abjzVar) {
        ArrayList arrayList = null;
        if (abjzVar.c && (abjzVar.b & 2) != 0) {
            abjk abjkVar = abjzVar.d;
            if (abjkVar == null) {
                abjkVar = abjk.a;
            }
            int size = abjkVar.b.size();
            if (size != 0 && size % 3 == 0) {
                arrayList = new ArrayList();
                for (int i = 0; i < size; i += 3) {
                    arrayList.add(new too(abjkVar.b.e(i), abjkVar.b.e(i + 1)));
                }
            }
        }
        return arrayList;
    }

    private final synchronized void k(toq toqVar) {
        this.b = toqVar;
        if (toqVar != null) {
            toqVar.o(0, this.f);
        }
    }

    public final synchronized float a() {
        return this.g;
    }

    public final synchronized long b() {
        return this.a.f;
    }

    public final synchronized too c() {
        if (this.b != null) {
            return this.f;
        }
        too tooVar = this.c;
        if (tooVar != null) {
            return tooVar;
        }
        return null;
    }

    public final synchronized udr d() {
        too tooVarC;
        float fA;
        tooVarC = c();
        fA = a();
        Optional.empty();
        return new udr(tooVarC == null ? null : new too(tooVarC), fA, i() ? Optional.of(Long.valueOf(b())) : Optional.empty(), this.h, this.i);
    }

    public final synchronized void g(long j) {
        this.h = j;
    }

    public final synchronized boolean h(long j) {
        float fMin;
        this.i = j;
        if (this.b == null) {
            return false;
        }
        if (!j()) {
            g(j);
        }
        abjz abjzVar = this.a;
        long j2 = this.j;
        int i = abjzVar.e;
        long j3 = this.h;
        if (j2 >= 0) {
            int i2 = (int) ((j3 + i) - j2);
            fMin = i2 <= 0 ? 1.0f : (j - j2) / i2;
        } else {
            fMin = (j - j3) / i;
        }
        if (abjzVar.c) {
            toq toqVar = this.b;
            toqVar.getClass();
            toqVar.f(fMin, this.f);
        }
        if (abjzVar.g) {
            fMin = Math.min(fMin, 1.0f);
            double d = this.d;
            double d2 = this.e - d;
            if (d2 > 180.0d) {
                d2 -= 360.0d;
            } else if (d2 < -180.0d) {
                d2 += 360.0d;
            }
            this.g = (float) ((((d + (fMin * d2)) % 360.0d) + 360.0d) % 360.0d);
        }
        return fMin < 1.0f;
    }

    public final synchronized boolean i() {
        return (this.a.b & 8) != 0;
    }

    public final synchronized boolean j() {
        return this.h != -1;
    }
}
