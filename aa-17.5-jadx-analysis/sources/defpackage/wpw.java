package defpackage;

import android.graphics.Typeface;

/* loaded from: classes3.dex */
final class wpw implements wsz {
    final /* synthetic */ wpx a;
    private final /* synthetic */ int b;

    public wpw(wpx wpxVar, int i) {
        this.b = i;
        this.a = wpxVar;
    }

    @Override // defpackage.wsz
    public final void a(Typeface typeface) {
        int i = this.b;
        wpx wpxVar = this.a;
        if (i != 0) {
            if (wpxVar.F(typeface)) {
                wpxVar.l(false);
            }
        } else if (wpxVar.G(typeface)) {
            wpxVar.l(false);
        }
    }
}
