package android.support.v7.app;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class aq implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    private final View f542a;

    /* renamed from: b, reason: collision with root package name */
    private final String f543b;

    /* renamed from: c, reason: collision with root package name */
    private Method f544c;

    /* renamed from: d, reason: collision with root package name */
    private Context f545d;

    public aq(View view, String str) {
        this.f542a = view;
        this.f543b = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        String str;
        Method method;
        Method method2 = this.f544c;
        if (method2 == null) {
            Context context = this.f542a.getContext();
            while (context != null) {
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(this.f543b, View.class)) != null) {
                        this.f544c = method;
                        this.f545d = context;
                        method2 = method;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
            View view2 = this.f542a;
            int id = view2.getId();
            if (id == -1) {
                str = "";
            } else {
                str = " with id '" + view2.getContext().getResources().getResourceEntryName(id) + "'";
            }
            throw new IllegalStateException("Could not find method " + this.f543b + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + view2.getClass() + str);
        }
        try {
            method2.invoke(this.f545d, view);
        } catch (IllegalAccessException e2) {
            throw new IllegalStateException("Could not execute non-public method for android:onClick", e2);
        } catch (InvocationTargetException e3) {
            throw new IllegalStateException("Could not execute method for android:onClick", e3);
        }
    }
}
