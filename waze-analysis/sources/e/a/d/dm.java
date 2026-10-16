package e.a.d;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public abstract class dm {

    /* renamed from: a, reason: collision with root package name */
    private final Set f46819a = Collections.newSetFromMap(new IdentityHashMap());

    protected abstract void a();

    protected abstract void b();

    public final void c(Object obj, boolean z) {
        Set set = this.f46819a;
        int size = set.size();
        if (z) {
            set.add(obj);
            if (size == 0) {
                a();
                return;
            }
            return;
        }
        if (set.remove(obj) && size == 1) {
            b();
        }
    }

    public final boolean d(Object... objArr) {
        for (int i2 = 0; i2 < 2; i2++) {
            if (this.f46819a.contains(objArr[i2])) {
                return true;
            }
        }
        return false;
    }

    public final boolean e() {
        return !this.f46819a.isEmpty();
    }
}
