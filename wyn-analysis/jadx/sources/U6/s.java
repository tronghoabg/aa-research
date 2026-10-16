package u6;

import android.os.Handler;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class s {

    /* renamed from: b, reason: collision with root package name */
    public static final ArrayList f46715b = new ArrayList(50);

    /* renamed from: a, reason: collision with root package name */
    public final Handler f46716a;

    public s(Handler handler) {
        this.f46716a = handler;
    }

    public static r b() {
        r rVar;
        ArrayList arrayList = f46715b;
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
        rVarB.f46714a = this.f46716a.obtainMessage(i5, obj);
        return rVarB;
    }

    public final boolean c(int i5) {
        return this.f46716a.sendEmptyMessage(i5);
    }
}
