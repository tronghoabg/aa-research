package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class mak implements qry {
    public final WeakReference a;
    private final Handler b = new Handler(Looper.getMainLooper());

    public mak(mal malVar) {
        this.a = new WeakReference(malVar);
    }

    @Override // defpackage.qry
    public final void a(int i, int i2, int i3) {
        if (i == 1 && i2 == 0) {
            ((ype) mal.a.l().ai(4626)).R("Car Message category %d key %d value %d", 1, 0, Integer.valueOf(i3));
            this.b.post(new kzu(this, i3 == 1 ? maj.e : maj.b, 18));
        }
    }

    @Override // defpackage.qry
    public final void b(int i) {
        if (i == 1) {
            ((ype) ((ype) mal.a.f()).ai((char) 4627)).u("Car Message lost ownership");
            this.b.post(new lqj(this, 17));
        }
    }
}
