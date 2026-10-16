package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class lgj extends defpackage.cne {
    final /* synthetic */ android.graphics.drawable.Drawable a;
    private final defpackage.afar b;

    public lgj(android.graphics.drawable.Drawable drawable) {
        this.a = drawable;
        this.b = defpackage.afga.cA(new defpackage.kuz(drawable, 17));
    }

    @Override // defpackage.cne
    public final long a() {
        return ((defpackage.cjl) this.b.a()).a;
    }

    @Override // defpackage.cne
    protected final void b(defpackage.cml cmlVar) {
        defpackage.ckc ckcVarB = cmlVar.r().b();
        int iK = defpackage.afhi.k(java.lang.Float.intBitsToFloat((int) (cmlVar.o() >> 32)));
        int iK2 = defpackage.afhi.k(java.lang.Float.intBitsToFloat((int) (cmlVar.o() & 4294967295L)));
        android.graphics.drawable.Drawable drawable = this.a;
        drawable.setBounds(0, 0, iK, iK2);
        drawable.draw(defpackage.cjn.a(ckcVarB));
    }
}
