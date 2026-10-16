package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.widget.ImageView;

/* loaded from: classes2.dex */
public final class qfs extends owd {
    public static final yph a = yph.c("ADU.DemandSpaceControll");
    public final ImageView b;
    public final xqb c;
    public boolean d;

    public qfs(Context context, ImageView imageView) {
        this.b = imageView;
        this.c = new xqb(context, Looper.myLooper(), new qfr(this, imageView));
    }

    @Override // defpackage.owe
    public final void a(Bundle bundle) {
        ((ype) a.l().ai((char) 7088)).u("startVoiceSearch");
        try {
            this.c.b(bundle);
        } catch (IllegalStateException e) {
            ((ype) ((ype) ((ype) a.h()).p(e)).ai((char) 7089)).u("Failed to open demand space");
            this.d = true;
        }
    }
}
