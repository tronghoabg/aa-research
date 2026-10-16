package defpackage;

import androidx.car.app.model.Alert;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class aebo {
    public int b;
    public int c;
    final /* synthetic */ aebq e;
    private final int f;
    private final aebn g;
    public final ajmy a = new ajmy();
    public boolean d = false;

    public aebo(aebq aebqVar, int i, int i2, aebn aebnVar) {
        this.e = aebqVar;
        this.f = i;
        this.b = i2;
        this.g = aebnVar;
    }

    final int a() {
        return Math.max(0, Math.min(this.b, (int) this.a.b)) - this.c;
    }

    final int b() {
        return Math.min(this.b, ((aebo) this.e.d).b);
    }

    final void c(ajmy ajmyVar, int i, boolean z) {
        while (true) {
            aebq aebqVar = this.e;
            Object obj = aebqVar.c;
            aecf aecfVar = ((aeao) ((aean) obj).b).a;
            int iMin = Math.min(i, ((aecn) aecfVar).a);
            int i2 = -iMin;
            ((aebo) aebqVar.d).e(i2);
            e(i2);
            try {
                boolean z2 = false;
                if (ajmyVar.b == iMin && z) {
                    z2 = true;
                }
                boolean z3 = z2;
                int i3 = this.f;
                ajmy ajmyVar2 = ajmyVar;
                ((aean) obj).c.b(2, i3, ajmyVar2, iMin, z3);
                try {
                    aecfVar.b(z3, i3, ajmyVar2, iMin);
                } catch (IOException e) {
                    ((aean) obj).a.d(e);
                }
                this.g.h(iMin);
                i -= iMin;
                if (i <= 0) {
                    return;
                } else {
                    ajmyVar = ajmyVar2;
                }
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    final boolean d() {
        return this.a.b > 0;
    }

    final void e(int i) {
        if (i <= 0 || Alert.DURATION_SHOW_INDEFINITELY - i >= this.b) {
            this.b += i;
            return;
        }
        throw new IllegalArgumentException("Window size overflow for stream: " + this.f);
    }

    final void f(int i, uk ukVar) {
        int iMin = Math.min(i, b());
        int i2 = 0;
        while (d() && iMin > 0) {
            ajmy ajmyVar = this.a;
            long j = iMin;
            long j2 = ajmyVar.b;
            if (j >= j2) {
                int i3 = (int) j2;
                i2 += i3;
                c(ajmyVar, i3, this.d);
            } else {
                i2 += iMin;
                c(ajmyVar, iMin, false);
            }
            ukVar.a++;
            iMin = Math.min(i - i2, b());
        }
    }
}
