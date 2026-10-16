package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class mgn {
    private static final yph b = yph.c("GH.Preflight.Event");
    public final Set a = new HashSet();
    private final Handler c = new Handler(Looper.getMainLooper());

    public final void a(mgl mglVar) {
        wer.c();
        this.c.post(new jpx(this, mglVar, 3, (byte[]) null));
    }

    public final void b(mgm mgmVar) {
        wer.c();
        if (this.a.add(mgmVar)) {
            ((ype) b.l().ai((char) 4891)).y("registered listener %s", mgmVar);
        } else {
            ((ype) b.l().ai((char) 4890)).y("listener already registered: %s", mgmVar);
        }
    }

    public final void c(mgm mgmVar) {
        wer.c();
        this.a.remove(mgmVar);
        ((ype) b.l().ai((char) 4892)).y("unregistered listener %s", mgmVar);
    }
}
