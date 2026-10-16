package defpackage;

import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
public final class lfy extends cmw {
    final /* synthetic */ Drawable a;
    private final long b;

    public lfy(Drawable drawable) {
        this.a = drawable;
        float intrinsicWidth = drawable.getIntrinsicWidth();
        float intrinsicHeight = drawable.getIntrinsicHeight();
        this.b = (Float.floatToRawIntBits(intrinsicWidth) << 32) | (Float.floatToRawIntBits(intrinsicHeight) & 4294967295L);
    }

    @Override // defpackage.cmw
    public final long a() {
        return this.b;
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
