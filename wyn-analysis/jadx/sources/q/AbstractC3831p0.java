package q;

import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import java.lang.reflect.Method;

/* renamed from: q.p0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3831p0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Method f43867a;

    /* renamed from: b, reason: collision with root package name */
    public static final Method f43868b;

    /* renamed from: c, reason: collision with root package name */
    public static final Method f43869c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f43870d;

    static {
        try {
            Class cls = Integer.TYPE;
            Class cls2 = Float.TYPE;
            Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, Boolean.TYPE, cls2, cls2);
            f43867a = declaredMethod;
            declaredMethod.setAccessible(true);
            Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
            f43868b = declaredMethod2;
            declaredMethod2.setAccessible(true);
            Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
            f43869c = declaredMethod3;
            declaredMethod3.setAccessible(true);
            f43870d = true;
        } catch (NoSuchMethodException e7) {
            e7.printStackTrace();
        }
    }
}
