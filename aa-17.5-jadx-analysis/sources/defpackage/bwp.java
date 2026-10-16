package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class bwp extends bxz {
    public final aan a;
    private final List b;
    private final cdz c;
    private final aan d;

    public bwp() {
        long[] jArr = aao.a;
        this.a = new aan(6);
        this.b = new ArrayList();
        this.d = new aan(6);
        this.c = byx.j(new alx(this, 12));
    }

    @Override // defpackage.bxz
    public final afec a(aixy aixyVar) {
        aan aanVar = this.d;
        afec afecVar = (afec) aanVar.a(aixyVar);
        if (afecVar != null) {
            return afecVar;
        }
        bee beeVar = new bee(this, aixyVar, 10, null);
        aanVar.h(aixyVar, beeVar);
        return beeVar;
    }

    @Override // defpackage.bxz
    public final void b(aixy aixyVar) {
        this.b.add(new bwn(aixyVar));
    }

    @Override // defpackage.bxz
    public final void c() {
        List list;
        synchronized (this.f) {
            list = this.b;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                bwo bwoVar = (bwo) list.get(i);
                if (bwoVar instanceof bwm) {
                    bwm bwmVar = (bwm) bwoVar;
                    bza.a(this.a, bwmVar.a, bwmVar.b);
                } else {
                    if (!(bwoVar instanceof bwn)) {
                        throw new aezs();
                    }
                    bza.b(this.a, ((bwn) bwoVar).a);
                }
            }
        }
        list.clear();
    }

    @Override // defpackage.bxz
    public final void d() {
        this.c.a();
        this.b.clear();
        this.d.k();
        synchronized (this.f) {
            this.a.k();
        }
    }

    @Override // defpackage.bxz
    public final void e(aixy aixyVar) {
        this.d.i(aixyVar);
        b(aixyVar);
        c();
    }

    public final void f(aixy aixyVar, Object obj) {
        this.b.add(new bwm(obj, aixyVar));
    }
}
