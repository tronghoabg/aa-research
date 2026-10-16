package defpackage;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
public final class icv implements icw {
    private final hxe a;
    private final icw b;
    private final icw c;

    public icv(hxe hxeVar, icw icwVar, icw icwVar2) {
        this.a = hxeVar;
        this.b = icwVar;
        this.c = icwVar2;
    }

    @Override // defpackage.icw
    public final hwx a(hwx hwxVar, hum humVar) {
        Drawable drawable = (Drawable) hwxVar.c();
        if (drawable instanceof BitmapDrawable) {
            return this.b.a(ibn.g(((BitmapDrawable) drawable).getBitmap(), this.a), humVar);
        }
        if (drawable instanceof icm) {
            return this.c.a(hwxVar, humVar);
        }
        return null;
    }
}
