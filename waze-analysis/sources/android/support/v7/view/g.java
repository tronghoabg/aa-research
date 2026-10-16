package android.support.v7.view;

import android.view.InflateException;
import android.view.MenuItem;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class g implements MenuItem.OnMenuItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    private static final Class[] f682a = {MenuItem.class};

    /* renamed from: b, reason: collision with root package name */
    private final Object f683b;

    /* renamed from: c, reason: collision with root package name */
    private Method f684c;

    public g(Object obj, String str) {
        this.f683b = obj;
        Class<?> cls = obj.getClass();
        try {
            this.f684c = cls.getMethod(str, f682a);
        } catch (Exception e2) {
            InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
            inflateException.initCause(e2);
            throw inflateException;
        }
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            Class<?> returnType = this.f684c.getReturnType();
            Class<?> cls = Boolean.TYPE;
            Method method = this.f684c;
            if (returnType == cls) {
                return ((Boolean) method.invoke(this.f683b, menuItem)).booleanValue();
            }
            method.invoke(this.f683b, menuItem);
            return true;
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }
}
