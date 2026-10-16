package defpackage;

import java.io.IOException;
import java.util.Locale;

/* loaded from: classes2.dex */
class akew extends akev {
    protected final int d;

    protected akew(akch akchVar, int i, boolean z, int i2) {
        super(akchVar, i, z);
        this.d = i2;
    }

    @Override // defpackage.akfn
    public final int b() {
        return this.b;
    }

    @Override // defpackage.akfn
    public final void d(Appendable appendable, long j, akcd akcdVar, int i, akcl akclVar, Locale locale) throws IOException {
        try {
            akfj.b(appendable, this.a.a(akcdVar).a(j), this.d);
        } catch (RuntimeException unused) {
            akfe.b(appendable, this.d);
        }
    }
}
