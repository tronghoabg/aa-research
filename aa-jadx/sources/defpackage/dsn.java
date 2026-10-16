package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class dsn<V extends android.view.View> {
    private static boolean c;
    private static java.lang.reflect.Method sy;
    private static java.lang.reflect.Method sz;

    public dsn(defpackage.dqv dqvVar) {
        new java.lang.ref.WeakReference(dqvVar);
        defpackage.dpg.o(dqvVar.T);
        defpackage.dpg.o(dqvVar.U);
        defpackage.dpg.o(dqvVar.V);
        defpackage.dpg.o(dqvVar.W);
        defpackage.dpg.o(dqvVar.X);
    }

    public static int s(android.app.AppOpsManager appOpsManager, java.lang.String str, int i, java.lang.String str2) {
        if (appOpsManager == null) {
            return 1;
        }
        return appOpsManager.checkOpNoThrow(str, i, str2);
    }

    public static void t(android.content.Context context, int i, android.util.SparseArray sparseArray, android.util.SparseArray sparseArray2) {
        java.lang.String str;
        android.content.res.XmlResourceParser xml = context.getResources().getXml(i);
        try {
            defpackage.drx drxVar = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    java.lang.String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                defpackage.dsf dsfVar = new defpackage.dsf();
                                int attributeCount = xml.getAttributeCount();
                                for (int i2 = 0; i2 < attributeCount; i2++) {
                                    java.lang.String attributeName = xml.getAttributeName(i2);
                                    java.lang.String attributeValue = xml.getAttributeValue(i2);
                                    if (attributeName != null && attributeValue != null && "id".equals(attributeName)) {
                                        int i3 = -1;
                                        int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                                        if (identifier != -1) {
                                            i3 = identifier;
                                        } else if (attributeValue.length() > 1) {
                                            i3 = java.lang.Integer.parseInt(attributeValue.substring(1));
                                        } else {
                                            android.util.Log.e("ConstraintLayoutStates", "error in parsing id");
                                        }
                                        dsfVar.l(context, xml);
                                        sparseArray2.put(i3, dsfVar);
                                    }
                                    break;
                                }
                            }
                            break;
                        case 80204913:
                            if (name.equals("State")) {
                                defpackage.drx drxVar2 = new defpackage.drx(context, xml);
                                sparseArray.put(drxVar2.a, drxVar2);
                                drxVar = drxVar2;
                            }
                            break;
                        case 1382829617:
                            str = "StateSet";
                            name.equals(str);
                            break;
                        case 1657696882:
                            str = "layoutDescription";
                            name.equals(str);
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                defpackage.dry dryVar = new defpackage.dry(context, xml);
                                if (drxVar != null) {
                                    drxVar.b.add(dryVar);
                                }
                            }
                            break;
                    }
                }
            }
        } catch (java.io.IOException e) {
            android.util.Log.e("ConstraintLayoutStates", defpackage.a.bo(i, "Error parsing resource: "), e);
        } catch (org.xmlpull.v1.XmlPullParserException e2) {
            android.util.Log.e("ConstraintLayoutStates", defpackage.a.bo(i, "Error parsing resource: "), e2);
        }
    }

    public static void u(android.graphics.Canvas canvas, boolean z) {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            if (z) {
                canvas.enableZ();
                return;
            } else {
                canvas.disableZ();
                return;
            }
        }
        if (android.os.Build.VERSION.SDK_INT == 28) {
            throw new java.lang.IllegalStateException("This method doesn't work on Pie!");
        }
        if (!c) {
            try {
                java.lang.reflect.Method declaredMethod = android.graphics.Canvas.class.getDeclaredMethod("insertReorderBarrier", null);
                sy = declaredMethod;
                declaredMethod.setAccessible(true);
                java.lang.reflect.Method declaredMethod2 = android.graphics.Canvas.class.getDeclaredMethod("insertInorderBarrier", null);
                sz = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (java.lang.NoSuchMethodException unused) {
            }
            c = true;
        }
        try {
            if (z) {
                java.lang.reflect.Method method = sy;
                if (method != null) {
                    method.invoke(canvas, null);
                }
            } else {
                java.lang.reflect.Method method2 = sz;
                if (method2 != null) {
                    method2.invoke(canvas, null);
                }
            }
        } catch (java.lang.IllegalAccessException unused2) {
        } catch (java.lang.reflect.InvocationTargetException e) {
            throw new java.lang.RuntimeException(e.getCause());
        }
    }

    public static java.lang.reflect.Method v() {
        return (java.lang.reflect.Method) defpackage.fbz.d.a();
    }

    public static java.lang.reflect.Method w() {
        return (java.lang.reflect.Method) defpackage.fbz.c.a();
    }

    public static defpackage.fbz x(defpackage.wd wdVar, android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        wdVar.getClass();
        java.lang.Object obj = wdVar.a;
        if (obj != null) {
            defpackage.fbz fbzVar = (defpackage.fbz) obj;
            if (defpackage.afga.f(fbzVar.e, sQLiteDatabase)) {
                return fbzVar;
            }
        }
        defpackage.fbz fbzVar2 = new defpackage.fbz(sQLiteDatabase);
        wdVar.a = fbzVar2;
        return fbzVar2;
    }

    public boolean d(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.MotionEvent motionEvent) {
        return false;
    }

    public boolean e(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, int i) {
        return false;
    }

    public boolean f(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.graphics.Rect rect, boolean z) {
        return false;
    }

    public boolean g(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.MotionEvent motionEvent) {
        return false;
    }

    public boolean h(android.view.View view) {
        return false;
    }

    public boolean j(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, int i, int i2, int i3) {
        return false;
    }

    public boolean k(android.view.View view) {
        return false;
    }

    public void n(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, int i, int i2, int i3, int[] iArr) {
        iArr[0] = iArr[0] + i2;
        iArr[1] = iArr[1] + i3;
    }

    public android.os.Parcelable p(android.view.View view) {
        return android.view.View.BaseSavedState.EMPTY_STATE;
    }

    public boolean q(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.View view2, int i, int i2) {
        return false;
    }

    public boolean r(android.view.View view, android.graphics.Rect rect) {
        return false;
    }

    public void b() {
    }

    public void a(defpackage.dsq dsqVar) {
    }

    public dsn(android.content.Context context, android.util.AttributeSet attributeSet) {
    }

    public dsn(byte[] bArr) {
    }

    public dsn() {
    }

    public void i(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view) {
    }

    public void o(android.view.View view, android.os.Parcelable parcelable) {
    }

    public void l(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.View view2) {
    }

    public void c(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.View view2, int i) {
    }

    public void m(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.View view2, int i, int[] iArr, int i2) {
    }
}
