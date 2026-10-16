package defpackage;

import android.view.View;

/* loaded from: classes.dex */
final class ik extends kw {
    final /* synthetic */ il a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ik(il ilVar, View view) {
        super(view);
        this.a = ilVar;
    }

    @Override // defpackage.kw
    public final hw a() {
        im imVar = this.a.a.i;
        if (imVar == null) {
            return null;
        }
        return imVar.a();
    }

    @Override // defpackage.kw
    public final boolean b() {
        this.a.a.m();
        return true;
    }

    @Override // defpackage.kw
    public final boolean c() {
        io ioVar = this.a.a;
        if (ioVar.l != null) {
            return false;
        }
        ioVar.k();
        return true;
    }
}
