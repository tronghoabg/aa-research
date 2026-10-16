package defpackage;

import java.io.IOException;

/* loaded from: classes2.dex */
abstract class ajkj implements ajoc {
    public boolean a;
    final /* synthetic */ ajkn b;
    private final ajhx c;
    private final ajnj d;

    public ajkj(ajkn ajknVar, ajhx ajhxVar) {
        this.b = ajknVar;
        this.c = ajhxVar;
        this.d = new ajnj(ajknVar.f.b.hV());
    }

    public final void c(ajhv ajhvVar) {
        ajia ajiaVar;
        ajhvVar.getClass();
        ajkn ajknVar = this.b;
        int i = ajknVar.d;
        if (i == 6) {
            return;
        }
        if (i != 5) {
            throw new IllegalStateException(a.bp(i, "state: "));
        }
        ajnj ajnjVar = this.d;
        ajoe ajoeVar = ajnjVar.a;
        ajnjVar.a = ajoe.k;
        ajoeVar.l();
        ajoeVar.i();
        ajknVar.d = 6;
        if (ajhvVar.a() <= 0 || (ajiaVar = ajknVar.b) == null) {
            return;
        }
        ajkd.a(ajiaVar.f, this.c, ajhvVar);
    }

    protected final void d() {
        this.a = true;
    }

    @Override // defpackage.ajoc
    public long hU(ajmy ajmyVar, long j) throws IOException {
        try {
            return this.b.f.b.hU(ajmyVar, j);
        } catch (IOException e) {
            this.b.c.h();
            this.c(ajkn.a);
            throw e;
        }
    }

    @Override // defpackage.ajoc
    public final ajoe hV() {
        return this.d;
    }
}
