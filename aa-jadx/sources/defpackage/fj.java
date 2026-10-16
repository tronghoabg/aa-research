package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class fj implements android.view.View.OnClickListener {
    private final android.view.View a;
    private final java.lang.String b;
    private java.lang.reflect.Method c;
    private android.content.Context d;

    public fj(android.view.View view, java.lang.String str) {
        this.a = view;
        this.b = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        java.lang.reflect.Method method;
        java.lang.reflect.Method method2 = this.c;
        if (method2 == null) {
            android.content.Context context = this.a.getContext();
            while (true) {
                if (context == null) {
                    android.view.View view2 = this.a;
                    int id = view2.getId();
                    if (id == -1) {
                        str = "";
                    } else {
                        str = " with id '" + view2.getContext().getResources().getResourceEntryName(id) + "'";
                    }
                    throw new java.lang.IllegalStateException("Could not find method " + this.b + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + view2.getClass() + str);
                }
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(this.b, android.view.View.class)) != null) {
                        this.c = method;
                        this.d = context;
                        method2 = method;
                        break;
                    }
                } catch (java.lang.NoSuchMethodException unused) {
                }
                context = context instanceof android.content.ContextWrapper ? ((android.content.ContextWrapper) context).getBaseContext() : null;
            }
        }
        try {
            method2.invoke(this.d, view);
        } catch (java.lang.IllegalAccessException e) {
            throw new java.lang.IllegalStateException("Could not execute non-public method for android:onClick", e);
        } catch (java.lang.reflect.InvocationTargetException e2) {
            throw new java.lang.IllegalStateException("Could not execute method for android:onClick", e2);
        }
    }
}
