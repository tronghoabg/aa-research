package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class owl implements LayoutInflater.Factory {
    private static final HashMap a = new HashMap();
    private static final ClassLoader b = LayoutInflater.class.getClassLoader();
    private static final Class[] c = {Context.class, AttributeSet.class};

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) throws NoSuchMethodException, SecurityException {
        ClassLoader classLoader;
        if (!str.startsWith("com.google.android.gms.car.support") && !str.startsWith("android.support") && !str.startsWith("com.google.android.apps.auto.sdk.ui")) {
            return null;
        }
        if (Log.isLoggable("CSL.SupportLibViewLoade", 2)) {
            Log.v("CSL.SupportLibViewLoade", String.format("createView %s with context %s", str, context));
        }
        HashMap map = a;
        Constructor constructor = (Constructor) map.get(str);
        if (constructor != null && (classLoader = constructor.getDeclaringClass().getClassLoader()) != b) {
            ClassLoader classLoader2 = context.getClassLoader();
            while (true) {
                if (classLoader == classLoader2) {
                    break;
                }
                classLoader2 = classLoader2.getParent();
                if (classLoader2 == null) {
                    map.remove(str);
                    constructor = null;
                    break;
                }
            }
        }
        if (constructor == null) {
            if (Log.isLoggable("CSL.SupportLibViewLoade", 2)) {
                Log.v("CSL.SupportLibViewLoade", "No cached constructor");
            }
            try {
                constructor = context.getClassLoader().loadClass(str).asSubclass(View.class).getConstructor(c);
                constructor.setAccessible(true);
                a.put(str, constructor);
            } catch (ClassNotFoundException | NoSuchMethodException e) {
                Log.w("CSL.SupportLibViewLoade", "Error creating view", e);
                return null;
            }
        }
        try {
            return (View) constructor.newInstance(context, attributeSet);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
            Log.w("CSL.SupportLibViewLoade", "Error creating view: ".concat(e2.toString()));
            return null;
        }
    }
}
