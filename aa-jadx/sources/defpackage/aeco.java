package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aeco {
    public int b;
    public int c;
    final /* synthetic */ defpackage.aecq e;
    private final int f;
    private final defpackage.aecn g;
    public final defpackage.ajny a = new defpackage.ajny();
    public boolean d = false;

    public aeco(defpackage.aecq aecqVar, int i, int i2, defpackage.aecn aecnVar) {
        this.e = aecqVar;
        this.f = i;
        this.b = i2;
        this.g = aecnVar;
    }

    final int a() {
        return java.lang.Math.max(0, java.lang.Math.min(this.b, (int) this.a.b)) - this.c;
    }

    final int b() {
        return java.lang.Math.min(this.b, ((defpackage.aeco) this.e.d).b);
    }

    final void c(defpackage.ajny ajnyVar, int i, boolean z) {
        while (true) {
            defpackage.aecq aecqVar = this.e;
            java.lang.Object obj = aecqVar.c;
            defpackage.aedf aedfVar = ((defpackage.aebo) ((defpackage.aebn) obj).b).a;
            int iMin = java.lang.Math.min(i, ((defpackage.aedn) aedfVar).a);
            int i2 = -iMin;
            ((defpackage.aeco) aecqVar.d).e(i2);
            e(i2);
            try {
                boolean z2 = false;
                if (ajnyVar.b == iMin && z) {
                    z2 = true;
                }
                boolean z3 = z2;
                int i3 = this.f;
                defpackage.ajny ajnyVar2 = ajnyVar;
                ((defpackage.aebn) obj).c.b(2, i3, ajnyVar2, iMin, z3);
                try {
                    aedfVar.b(z3, i3, ajnyVar2, iMin);
                } catch (java.io.IOException e) {
                    ((defpackage.aebn) obj).a.d(e);
                }
                this.g.h(iMin);
                i -= iMin;
                if (i <= 0) {
                    return;
                } else {
                    ajnyVar = ajnyVar2;
                }
            } catch (java.io.IOException e2) {
                throw new java.lang.RuntimeException(e2);
            }
        }
    }

    final boolean d() {
        return this.a.b > 0;
    }

    final void e(int i) {
        if (i <= 0 || androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY - i >= this.b) {
            this.b += i;
            return;
        }
        throw new java.lang.IllegalArgumentException("Window size overflow for stream: " + this.f);
    }

    final void f(int i, defpackage.up upVar) {
        int iMin = java.lang.Math.min(i, b());
        int i2 = 0;
        while (d() && iMin > 0) {
            defpackage.ajny ajnyVar = this.a;
            long j = iMin;
            long j2 = ajnyVar.b;
            if (j >= j2) {
                int i3 = (int) j2;
                i2 += i3;
                c(ajnyVar, i3, this.d);
            } else {
                i2 += iMin;
                c(ajnyVar, iMin, false);
            }
            upVar.a++;
            iMin = java.lang.Math.min(i - i2, b());
        }
    }
}
