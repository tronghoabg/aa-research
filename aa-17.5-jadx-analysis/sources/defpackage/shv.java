package defpackage;

import android.content.Context;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class shv extends shq {
    public static final List n = new CopyOnWriteArrayList();
    public final List o;
    public final shs p;

    public shv(Context context, String str, String str2, siv sivVar, int i, shw shwVar, sir sirVar, shs shsVar, zwt zwtVar) {
        super(context, str, str2, sivVar, i, shwVar, sirVar, zwtVar);
        this.o = new CopyOnWriteArrayList();
        this.p = shsVar;
    }

    public final void e(shu shuVar) {
        this.o.add(0, shuVar);
    }

    public final shr f(abow abowVar) {
        if (abowVar != null) {
            return new shr(this, abowVar);
        }
        throw new NullPointerException("null reference");
    }
}
