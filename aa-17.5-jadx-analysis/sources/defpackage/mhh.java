package defpackage;

import android.os.Handler;
import java.util.ArrayDeque;
import java.util.Queue;

/* loaded from: classes.dex */
public final class mhh {
    public static final yph a = yph.c("GH.Preflight.Req");
    public final Queue b;
    public final Handler c;
    public boolean d;
    public final wyd e;

    public mhh(wyd wydVar, lgx lgxVar) {
        Object obj = lgxVar.a;
        ArrayDeque arrayDeque = new ArrayDeque();
        this.b = arrayDeque;
        this.e = wydVar;
        arrayDeque.addAll(obj);
        ((ype) a.l().ai(4925)).y("RequirementProcessor with requirements:\n%s", arrayDeque);
        this.c = new mhg(this);
    }

    public final void a() {
        if (this.d) {
            throw new IllegalStateException();
        }
        this.c.sendEmptyMessage(0);
    }
}
