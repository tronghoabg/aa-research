package android.support.v7.widget;

import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class ch {

    /* renamed from: a, reason: collision with root package name */
    private static Method f1234a;

    /* renamed from: b, reason: collision with root package name */
    private static Method f1235b;

    /* renamed from: c, reason: collision with root package name */
    private static Method f1236c;

    /* renamed from: d, reason: collision with root package name */
    private static boolean f1237d;

    static {
        try {
            Class cls = Float.TYPE;
            Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", Integer.TYPE, View.class, Boolean.TYPE, cls, cls);
            f1234a = declaredMethod;
            declaredMethod.setAccessible(true);
            Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", Integer.TYPE);
            f1235b = declaredMethod2;
            declaredMethod2.setAccessible(true);
            Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", Integer.TYPE);
            f1236c = declaredMethod3;
            declaredMethod3.setAccessible(true);
            f1237d = true;
        } catch (NoSuchMethodException e2) {
            e2.printStackTrace();
        }
    }

    static void a(cl clVar, int i2, View view) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            Method method = f1234a;
            Integer numValueOf = Integer.valueOf(i2);
            method.invoke(clVar, numValueOf, view, false, -1, -1);
            f1235b.invoke(clVar, numValueOf);
            f1236c.invoke(clVar, numValueOf);
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
        } catch (InvocationTargetException e3) {
            e3.printStackTrace();
        }
    }

    static boolean b() {
        return f1237d;
    }
}
