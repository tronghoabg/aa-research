package defpackage;

import android.content.res.Resources;
import java.io.IOException;

/* loaded from: classes2.dex */
final class hyp implements huv {
    private final Resources.Theme a;
    private final Resources b;
    private final hyq c;
    private final int d;
    private Object e;

    public hyp(Resources.Theme theme, Resources resources, hyq hyqVar, int i) {
        this.a = theme;
        this.b = resources;
        this.c = hyqVar;
        this.d = i;
    }

    @Override // defpackage.huv
    public final Class a() {
        return this.c.a();
    }

    @Override // defpackage.huv
    public final void c() {
        Object obj = this.e;
        if (obj != null) {
            try {
                this.c.d(obj);
            } catch (IOException unused) {
            }
        }
    }

    @Override // defpackage.huv
    public final void d(hsh hshVar, huu huuVar) {
        try {
            Object objC = this.c.c(this.a, this.b, this.d);
            this.e = objC;
            huuVar.f(objC);
        } catch (Resources.NotFoundException e) {
            huuVar.g(e);
        }
    }

    @Override // defpackage.huv
    public final int e() {
        return 1;
    }

    @Override // defpackage.huv
    public final void b() {
    }
}
