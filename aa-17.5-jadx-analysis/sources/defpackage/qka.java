package defpackage;

import android.graphics.Bitmap;

/* loaded from: classes2.dex */
final class qka implements oml {
    final /* synthetic */ qkd a;
    private boolean b;

    public qka(qkd qkdVar) {
        this.a = qkdVar;
    }

    @Override // defpackage.oml
    public final void a(Bitmap bitmap) {
        boolean z = this.b;
        wer.c();
        qkd qkdVar = this.a;
        boolean zT = qkdVar.g.T();
        qkdVar.g.R(z);
        qkdVar.h.run();
        qkdVar.g.R(zT);
    }

    @Override // defpackage.oml
    public final void b() {
        this.b = this.a.g.T();
    }
}
