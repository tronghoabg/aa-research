package defpackage;

import android.os.Looper;
import android.os.PowerManager;

/* loaded from: classes.dex */
public final class sky {
    public Object a;
    public Object b;

    public sky(PowerManager.WakeLock wakeLock) {
        this.a = wakeLock;
    }

    public final skz a() {
        if (this.b == null) {
            this.b = new oni();
        }
        if (this.a == null) {
            this.a = Looper.getMainLooper();
        }
        return new skz((oni) this.b, (Looper) this.a);
    }

    public final void b() {
        Object obj = this.a;
        if (obj != null) {
            ((PowerManager.WakeLock) obj).release();
            return;
        }
        Object obj2 = this.b;
        if (obj2 != null) {
            ((svk) obj2).e();
        }
    }

    public sky(svk svkVar) {
        this.b = svkVar;
    }
}
