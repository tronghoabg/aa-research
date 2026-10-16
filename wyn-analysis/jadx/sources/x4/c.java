package x4;

import android.content.Context;
import android.content.Intent;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import uc.InterfaceC4283t;

/* loaded from: classes.dex */
public final class c implements InterfaceC4283t {

    /* renamed from: b, reason: collision with root package name */
    public static c f47690b;

    /* renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArrayList f47691a = new CopyOnWriteArrayList();

    public static e a(Context context, boolean z2, h hVar) {
        if (z2) {
            return new f(context, hVar);
        }
        try {
            if (d7.e.f34127d.d(context, d7.f.f34128a) == 0) {
                return new C4469b(context, hVar);
            }
        } catch (NoClassDefFoundError unused) {
        }
        return new f(context, hVar);
    }

    public static synchronized c b() {
        try {
            if (f47690b == null) {
                f47690b = new c();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f47690b;
    }

    @Override // uc.InterfaceC4283t
    public final boolean onActivityResult(int i5, int i10, Intent intent) {
        Iterator it = this.f47691a.iterator();
        while (it.hasNext()) {
            if (((e) it.next()).d(i5, i10)) {
                return true;
            }
        }
        return false;
    }
}
