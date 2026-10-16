package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.graphics.Canvas;
import android.os.Build;
import android.util.Property;
import android.view.View;
import com.google.android.projection.gearhead.R;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class dat {
    private static Method a;
    private static Method b;
    private static boolean c;

    public dat() {
        new afdn(1);
    }

    public static final void a(View view, float f) {
        view.setRequestedFrameRate(f);
    }

    public static final View b(dal dalVar, int i) {
        Object next;
        Iterator it = dalVar.b.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((cxb) ((Map.Entry) next).getKey()).c == i) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (dme) entry.getValue();
        }
        return null;
    }

    public static final dby c(List list, int i) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((dby) list.get(i2)).a == i) {
                return (dby) list.get(i2);
            }
        }
        return null;
    }

    public static final dft d(ddr ddrVar) {
        ArrayList arrayList = new ArrayList();
        ddf ddfVar = (ddf) ddrVar.g(ddq.a);
        if (ddfVar == null || !((Boolean) ((afec) ddfVar.b).invoke(arrayList)).booleanValue()) {
            return null;
        }
        return (dft) woy.bH(arrayList);
    }

    public static final String e(int i) {
        if (i == 0) {
            return "android.widget.Button";
        }
        if (i == 1) {
            return "android.widget.CheckBox";
        }
        if (i == 3) {
            return "android.widget.RadioButton";
        }
        if (i != 5) {
            return null;
        }
        return "android.widget.ImageView";
    }

    public static final String f(Object obj) {
        String name = obj.getClass().isAnonymousClass() ? obj.getClass().getName() : obj.getClass().getSimpleName();
        String str = String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1));
        str.getClass();
        return a.bJ(str, name, "@");
    }

    public static Animator g(View view, fgo fgoVar, int i, int i2, float f, float f2, float f3, float f4, TimeInterpolator timeInterpolator, fgc fgcVar) {
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        if (((int[]) fgoVar.b.getTag(R.id.transition_position)) != null) {
            f = (r2[0] - i) + translationX;
            f2 = (r2[1] - i2) + translationY;
        }
        view.setTranslationX(f);
        view.setTranslationY(f2);
        if (f == f3 && f2 == f4) {
            return null;
        }
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_X, f, f3), PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, f2, f4));
        fgq fgqVar = new fgq(view, fgoVar.b, translationX, translationY);
        fgcVar.H(fgqVar);
        objectAnimatorOfPropertyValuesHolder.addListener(fgqVar);
        objectAnimatorOfPropertyValuesHolder.setInterpolator(timeInterpolator);
        return objectAnimatorOfPropertyValuesHolder;
    }

    public static Animator h(Animator animator, Animator animator2) {
        if (animator == null) {
            return animator2;
        }
        if (animator2 == null) {
            return animator;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(animator, animator2);
        return animatorSet;
    }

    public static ArrayList i(ArrayList arrayList, Object obj) {
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        if (!arrayList.contains(obj)) {
            arrayList.add(obj);
        }
        return arrayList;
    }

    public static void j(Canvas canvas, boolean z) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (Build.VERSION.SDK_INT >= 29) {
            if (z) {
                canvas.enableZ();
                return;
            } else {
                canvas.disableZ();
                return;
            }
        }
        if (Build.VERSION.SDK_INT == 28) {
            throw new IllegalStateException("This method doesn't work on Pie!");
        }
        if (!c) {
            try {
                Method declaredMethod = Canvas.class.getDeclaredMethod("insertReorderBarrier", null);
                a = declaredMethod;
                declaredMethod.setAccessible(true);
                Method declaredMethod2 = Canvas.class.getDeclaredMethod("insertInorderBarrier", null);
                b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            c = true;
        }
        try {
            if (z) {
                Method method = a;
                if (method != null) {
                    method.invoke(canvas, null);
                }
            } else {
                Method method2 = b;
                if (method2 != null) {
                    method2.invoke(canvas, null);
                }
            }
        } catch (IllegalAccessException unused2) {
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e.getCause());
        }
    }
}
