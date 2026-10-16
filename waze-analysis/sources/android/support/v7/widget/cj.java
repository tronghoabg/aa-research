package android.support.v7.widget;

import android.widget.AbsListView;
import java.lang.reflect.Field;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class cj {

    /* renamed from: a, reason: collision with root package name */
    private static final Field f1239a;

    static {
        NoSuchFieldException e2;
        Field declaredField;
        try {
            declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            try {
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e3) {
                e2 = e3;
                e2.printStackTrace();
                f1239a = declaredField;
            }
        } catch (NoSuchFieldException e4) {
            e2 = e4;
            declaredField = null;
        }
        f1239a = declaredField;
    }

    static void a(AbsListView absListView, boolean z) throws IllegalAccessException, IllegalArgumentException {
        Field field = f1239a;
        if (field != null) {
            try {
                field.set(absListView, Boolean.valueOf(z));
            } catch (IllegalAccessException e2) {
                e2.printStackTrace();
            }
        }
    }

    static boolean b(AbsListView absListView) {
        Field field = f1239a;
        if (field == null) {
            return false;
        }
        try {
            return field.getBoolean(absListView);
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
            return false;
        }
    }
}
