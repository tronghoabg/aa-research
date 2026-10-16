package j;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class y implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final View f38554a;

    /* renamed from: b, reason: collision with root package name */
    public final String f38555b;

    /* renamed from: c, reason: collision with root package name */
    public Method f38556c;

    /* renamed from: d, reason: collision with root package name */
    public Context f38557d;

    public y(View view, String str) {
        this.f38554a = view;
        this.f38555b = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        String str;
        Method method;
        if (this.f38556c == null) {
            View view2 = this.f38554a;
            Context context = view2.getContext();
            while (true) {
                String str2 = this.f38555b;
                if (context == null) {
                    int id2 = view2.getId();
                    if (id2 == -1) {
                        str = "";
                    } else {
                        str = " with id '" + view2.getContext().getResources().getResourceEntryName(id2) + "'";
                    }
                    StringBuilder sbW = com.google.android.gms.internal.consent_sdk.a.w("Could not find method ", str2, "(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
                    sbW.append(view2.getClass());
                    sbW.append(str);
                    throw new IllegalStateException(sbW.toString());
                }
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(str2, View.class)) != null) {
                        this.f38556c = method;
                        this.f38557d = context;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
        }
        try {
            this.f38556c.invoke(this.f38557d, view);
        } catch (IllegalAccessException e7) {
            throw new IllegalStateException("Could not execute non-public method for android:onClick", e7);
        } catch (InvocationTargetException e10) {
            throw new IllegalStateException("Could not execute method for android:onClick", e10);
        }
    }
}
