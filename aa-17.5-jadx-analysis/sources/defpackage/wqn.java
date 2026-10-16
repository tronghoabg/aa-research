package defpackage;

import android.graphics.Typeface;

/* loaded from: classes3.dex */
final class wqn extends wtf {
    final /* synthetic */ wqp a;

    public wqn(wqp wqpVar) {
        this.a = wqpVar;
    }

    @Override // defpackage.wtf
    public final void a(int i) {
        wqp wqpVar = this.a;
        wqpVar.c = true;
        wqo wqoVar = (wqo) wqpVar.d.get();
        if (wqoVar != null) {
            wqoVar.j();
        }
    }

    @Override // defpackage.wtf
    public final void b(Typeface typeface, boolean z) {
        if (z) {
            return;
        }
        wqp wqpVar = this.a;
        wqpVar.c = true;
        wqo wqoVar = (wqo) wqpVar.d.get();
        if (wqoVar != null) {
            wqoVar.j();
        }
    }
}
