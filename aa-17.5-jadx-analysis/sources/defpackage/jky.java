package defpackage;

import android.content.Context;
import android.content.Intent;

/* loaded from: classes2.dex */
public final class jky {
    public static final yph a = yph.c("CAR.PreSetupMngr");
    public final jkw b;
    private final jkz c;

    public jky(Context context) {
        jkw jkwVar = new jkw(context);
        jkz jkzVar = new jkz();
        this.b = jkwVar;
        this.c = jkzVar;
    }

    public final void a(Context context, int i) {
        jkz jkzVar = this.c;
        jkzVar.a = 2;
        jkzVar.b = i;
        jkzVar.c = new Intent();
        jkzVar.a(context);
    }
}
