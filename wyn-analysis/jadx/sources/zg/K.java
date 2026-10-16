package zg;

import android.os.Build;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
public final class K extends L {
    @Override // zg.L
    public final Executor a() {
        return new Y4.g(3);
    }

    @Override // zg.L
    public final Object b(Object obj, Method method, Object... objArr) {
        if (Build.VERSION.SDK_INT >= 26) {
            return super.b(obj, method, objArr);
        }
        throw new UnsupportedOperationException("Calling default methods on API 24 and 25 is not supported");
    }
}
