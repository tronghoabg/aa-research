package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class dsq extends android.view.ViewGroup.MarginLayoutParams {
    public defpackage.dsn a;
    public boolean b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public android.view.View k;
    public android.view.View l;
    public boolean m;
    public boolean n;
    public boolean o;
    public final android.graphics.Rect p;
    private boolean q;

    public dsq(android.content.Context context, android.util.AttributeSet attributeSet) {
        defpackage.dsn dsnVar;
        super(context, attributeSet);
        this.b = false;
        this.c = 0;
        this.d = 0;
        this.e = -1;
        this.f = -1;
        this.g = 0;
        this.h = 0;
        this.p = new android.graphics.Rect();
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.dsl.b);
        this.c = typedArrayObtainStyledAttributes.getInteger(0, 0);
        this.f = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        this.d = typedArrayObtainStyledAttributes.getInteger(2, 0);
        this.e = typedArrayObtainStyledAttributes.getInteger(6, -1);
        this.g = typedArrayObtainStyledAttributes.getInt(5, 0);
        this.h = typedArrayObtainStyledAttributes.getInt(4, 0);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(3);
        this.b = zHasValue;
        if (zHasValue) {
            java.lang.String string = typedArrayObtainStyledAttributes.getString(3);
            int i = androidx.coordinatorlayout.widget.CoordinatorLayout.i;
            if (android.text.TextUtils.isEmpty(string)) {
                dsnVar = null;
            } else {
                if (string.startsWith(".")) {
                    string = java.lang.String.valueOf(context.getPackageName()).concat(java.lang.String.valueOf(string));
                } else if (string.indexOf(46) < 0) {
                    java.lang.String str = androidx.coordinatorlayout.widget.CoordinatorLayout.a;
                    if (!android.text.TextUtils.isEmpty(str)) {
                        string = str + '.' + string;
                    }
                }
                try {
                    java.lang.ThreadLocal threadLocal = androidx.coordinatorlayout.widget.CoordinatorLayout.c;
                    java.util.Map map = (java.util.Map) threadLocal.get();
                    if (map == null) {
                        map = new java.util.HashMap();
                        threadLocal.set(map);
                    }
                    java.lang.reflect.Constructor<?> constructor = (java.lang.reflect.Constructor) map.get(string);
                    if (constructor == null) {
                        constructor = java.lang.Class.forName(string, false, context.getClassLoader()).getConstructor(androidx.coordinatorlayout.widget.CoordinatorLayout.b);
                        constructor.setAccessible(true);
                        map.put(string, constructor);
                    }
                    dsnVar = (defpackage.dsn) constructor.newInstance(context, attributeSet);
                } catch (java.lang.Exception e) {
                    throw new java.lang.RuntimeException("Could not inflate Behavior subclass ".concat(java.lang.String.valueOf(string)), e);
                }
            }
            this.a = dsnVar;
        }
        typedArrayObtainStyledAttributes.recycle();
        defpackage.dsn dsnVar2 = this.a;
        if (dsnVar2 != null) {
            dsnVar2.a(this);
        }
    }

    public final void a() {
        this.o = false;
    }

    public final void b(defpackage.dsn dsnVar) {
        defpackage.dsn dsnVar2 = this.a;
        if (dsnVar2 != dsnVar) {
            if (dsnVar2 != null) {
                dsnVar2.b();
            }
            this.a = dsnVar;
            this.b = true;
            if (dsnVar != null) {
                dsnVar.a(this);
            }
        }
    }

    public final void c(int i, boolean z) {
        if (i != 0) {
            this.q = z;
        } else {
            this.n = z;
        }
    }

    public final boolean d(int i) {
        return i != 0 ? this.q : this.n;
    }

    public dsq() {
        super(-2, -2);
        this.b = false;
        this.c = 0;
        this.d = 0;
        this.e = -1;
        this.f = -1;
        this.g = 0;
        this.h = 0;
        this.p = new android.graphics.Rect();
    }

    public dsq(android.view.ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.b = false;
        this.c = 0;
        this.d = 0;
        this.e = -1;
        this.f = -1;
        this.g = 0;
        this.h = 0;
        this.p = new android.graphics.Rect();
    }

    public dsq(android.view.ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.b = false;
        this.c = 0;
        this.d = 0;
        this.e = -1;
        this.f = -1;
        this.g = 0;
        this.h = 0;
        this.p = new android.graphics.Rect();
    }

    public dsq(defpackage.dsq dsqVar) {
        super((android.view.ViewGroup.MarginLayoutParams) dsqVar);
        this.b = false;
        this.c = 0;
        this.d = 0;
        this.e = -1;
        this.f = -1;
        this.g = 0;
        this.h = 0;
        this.p = new android.graphics.Rect();
    }
}
