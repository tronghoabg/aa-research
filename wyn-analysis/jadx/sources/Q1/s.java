package Q1;

import android.os.Handler;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: b, reason: collision with root package name */
    public static final ArrayList f9710b = new ArrayList(50);

    /* renamed from: a, reason: collision with root package name */
    public final Handler f9711a;

    public s(Handler handler) {
        this.f9711a = handler;
    }

    public static r b() {
        r rVar;
        ArrayList arrayList = f9710b;
        synchronized (arrayList) {
            try {
                rVar = arrayList.isEmpty() ? new r() : (r) arrayList.remove(arrayList.size() - 1);
            } catch (Throwable th) {
                throw th;
            }
        }
        return rVar;
    }

    public final r a(int i5, Object obj) {
        r rVarB = b();
        rVarB.f9709a = this.f9711a.obtainMessage(i5, obj);
        return rVarB;
    }

    public final boolean c(Runnable runnable) {
        return this.f9711a.post(runnable);
    }

    public final void d(int i5) {
        k.c(i5 != 0);
        this.f9711a.removeMessages(i5);
    }

    public final boolean e(int i5) {
        return this.f9711a.sendEmptyMessage(i5);
    }
}
