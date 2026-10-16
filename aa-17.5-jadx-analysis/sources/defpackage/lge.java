package defpackage;

import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
public final class lge extends cmw {
    final /* synthetic */ Drawable a;
    private final aezr b;

    public lge(Drawable drawable) {
        this.a = drawable;
        this.b = woy.dG(new kur(drawable, 15));
    }

    @Override // defpackage.cmw
    public final long a() {
        return ((cjd) this.b.a()).a;
    }

    @Override // defpackage.cmw
    protected final void b(cmd cmdVar) {
        cju cjuVarB = cmdVar.r().b();
        int iK = afgi.k(Float.intBitsToFloat((int) (cmdVar.o() >> 32)));
        int iK2 = afgi.k(Float.intBitsToFloat((int) (cmdVar.o() & 4294967295L)));
        Drawable drawable = this.a;
        drawable.setBounds(0, 0, iK, iK2);
        drawable.draw(cjf.a(cjuVarB));
    }
}
