package t3;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.moloco.sdk.internal.publisher.H;
import java.util.HashMap;
import java.util.WeakHashMap;
import k1.S;
import q.c1;

/* renamed from: t3.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4086f extends AbstractC4096p {

    /* renamed from: A, reason: collision with root package name */
    public static final c1 f45672A;

    /* renamed from: B, reason: collision with root package name */
    public static final c1 f45673B;

    /* renamed from: C, reason: collision with root package name */
    public static final c1 f45674C;

    /* renamed from: x, reason: collision with root package name */
    public static final String[] f45675x = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* renamed from: y, reason: collision with root package name */
    public static final c1 f45676y;

    /* renamed from: z, reason: collision with root package name */
    public static final c1 f45677z;

    static {
        new C4082b(PointF.class, "boundsOrigin").f45662a = new Rect();
        f45676y = new c1(1, "topLeft", PointF.class);
        f45677z = new c1(2, "bottomRight", PointF.class);
        f45672A = new c1(3, "bottomRight", PointF.class);
        f45673B = new c1(4, "topLeft", PointF.class);
        f45674C = new c1(5, "position", PointF.class);
    }

    public static void J(C4103w c4103w) {
        View view = c4103w.f45733b;
        WeakHashMap weakHashMap = S.f38779a;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        HashMap map = c4103w.f45732a;
        map.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        map.put("android:changeBounds:parent", c4103w.f45733b.getParent());
    }

    @Override // t3.AbstractC4096p
    public final void d(C4103w c4103w) {
        J(c4103w);
    }

    @Override // t3.AbstractC4096p
    public final void g(C4103w c4103w) {
        J(c4103w);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // t3.AbstractC4096p
    public final Animator l(ViewGroup viewGroup, C4103w c4103w, C4103w c4103w2) {
        int i5;
        C4086f c4086f;
        ObjectAnimator objectAnimatorOfObject;
        if (c4103w != null && c4103w2 != null) {
            HashMap map = c4103w.f45732a;
            HashMap map2 = c4103w2.f45732a;
            ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
            ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
            if (viewGroup2 != null && viewGroup3 != null) {
                Rect rect = (Rect) map.get("android:changeBounds:bounds");
                Rect rect2 = (Rect) map2.get("android:changeBounds:bounds");
                int i10 = rect.left;
                int i11 = rect2.left;
                int i12 = rect.top;
                int i13 = rect2.top;
                int i14 = rect.right;
                int i15 = rect2.right;
                int i16 = rect.bottom;
                int i17 = rect2.bottom;
                int i18 = i14 - i10;
                int i19 = i16 - i12;
                int i20 = i15 - i11;
                int i21 = i17 - i13;
                Rect rect3 = (Rect) map.get("android:changeBounds:clip");
                Rect rect4 = (Rect) map2.get("android:changeBounds:clip");
                if ((i18 == 0 || i19 == 0) && (i20 == 0 || i21 == 0)) {
                    i5 = 0;
                } else {
                    i5 = (i10 == i11 && i12 == i13) ? 0 : 1;
                    if (i14 != i15 || i16 != i17) {
                        i5++;
                    }
                }
                if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
                    i5++;
                }
                if (i5 > 0) {
                    View view = c4103w2.f45733b;
                    AbstractC4104x.a(view, i10, i12, i14, i16);
                    if (i5 != 2) {
                        c4086f = this;
                        if (i10 == i11 && i12 == i13) {
                            c4086f.f45716t.getClass();
                            objectAnimatorOfObject = ObjectAnimator.ofObject(view, f45672A, (TypeConverter) null, ae.b.c(i14, i16, i15, i17));
                        } else {
                            c4086f.f45716t.getClass();
                            objectAnimatorOfObject = ObjectAnimator.ofObject(view, f45673B, (TypeConverter) null, ae.b.c(i10, i12, i11, i13));
                        }
                    } else if (i18 == i20 && i19 == i21) {
                        c4086f = this;
                        c4086f.f45716t.getClass();
                        objectAnimatorOfObject = ObjectAnimator.ofObject(view, f45674C, (TypeConverter) null, ae.b.c(i10, i12, i11, i13));
                    } else {
                        c4086f = this;
                        C4085e c4085e = new C4085e();
                        c4085e.f45669e = view;
                        c4086f.f45716t.getClass();
                        ObjectAnimator objectAnimatorOfObject2 = ObjectAnimator.ofObject(c4085e, f45676y, (TypeConverter) null, ae.b.c(i10, i12, i11, i13));
                        c4086f.f45716t.getClass();
                        ObjectAnimator objectAnimatorOfObject3 = ObjectAnimator.ofObject(c4085e, f45677z, (TypeConverter) null, ae.b.c(i14, i16, i15, i17));
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(objectAnimatorOfObject2, objectAnimatorOfObject3);
                        animatorSet.addListener(new C4083c(c4085e));
                        objectAnimatorOfObject = animatorSet;
                    }
                    if (view.getParent() instanceof ViewGroup) {
                        ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                        H.t0(viewGroup4, true);
                        c4086f.a(new C4084d(viewGroup4));
                    }
                    return objectAnimatorOfObject;
                }
            }
        }
        return null;
    }

    @Override // t3.AbstractC4096p
    public final String[] q() {
        return f45675x;
    }
}
