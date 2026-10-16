package defpackage;

import android.content.Context;
import android.os.Build;

/* loaded from: classes2.dex */
public final class pfb implements tep {
    private static pfc a;

    public static final pfc a(Context context) {
        context.getClass();
        wer.c();
        pfc pfhVar = a;
        if (pfhVar == null) {
            pfhVar = Build.VERSION.SDK_INT >= 33 ? new pfh(context) : new pdi();
            a = pfhVar;
        }
        return pfhVar;
    }

    @Override // defpackage.tep
    public final /* bridge */ /* synthetic */ Object b(Context context) {
        throw null;
    }
}
