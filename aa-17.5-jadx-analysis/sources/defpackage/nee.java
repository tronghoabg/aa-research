package defpackage;

import android.content.Context;

/* loaded from: classes2.dex */
public final class nee implements ned {
    public static final nee a = new nee();
    private static final yph b = yph.c("GH.BitmapLoader");

    @Override // defpackage.ned
    public final void a(Context context, iev ievVar, Boolean bool) {
        context.getClass();
        ievVar.getClass();
        if (affa.f(bool, true)) {
            ((ype) b.h()).u("Bitmap was recycled before we cleared. Ignoring.");
        } else {
            hrt.c(context).i(ievVar);
        }
    }
}
