package defpackage;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class ftx implements afec {
    public final aitf a;
    private final ajjm b;

    public ftx(ajjm ajjmVar, aitf aitfVar) {
        this.b = ajjmVar;
        this.a = aitfVar;
    }

    public final void a(ajjm ajjmVar, IOException iOException) {
        if (ajjmVar.m) {
            return;
        }
        this.a.w(woy.dE(iOException));
    }

    @Override // defpackage.afec
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        try {
            this.b.g();
        } catch (Throwable unused) {
        }
        return afak.a;
    }
}
