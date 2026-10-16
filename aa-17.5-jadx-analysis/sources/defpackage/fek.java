package defpackage;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeConverter;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.projection.gearhead.R;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes2.dex */
public final class fek extends fgc {
    private boolean C;
    private final Matrix D;
    boolean a;
    private static final String[] z = {"android:changeTransform:matrix", "android:changeTransform:transforms", "android:changeTransform:parentMatrix"};
    private static final Property A = new fee(float[].class);
    private static final Property B = new fef(PointF.class);

    public fek(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = true;
        this.C = true;
        this.D = new Matrix();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ffs.f);
        XmlPullParser xmlPullParser = (XmlPullParser) attributeSet;
        this.a = dlz.t(typedArrayObtainStyledAttributes, xmlPullParser, "reparentWithOverlay", 1, true);
        this.C = dlz.t(typedArrayObtainStyledAttributes, xmlPullParser, "reparent", 0, true);
        typedArrayObtainStyledAttributes.recycle();
    }

    static void f(View view, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        view.setTranslationX(f);
        view.setTranslationY(f2);
        int[] iArr = ebm.a;
        view.setTranslationZ(f3);
        view.setScaleX(f4);
        view.setScaleY(f5);
        view.setRotationX(f6);
        view.setRotationY(f7);
        view.setRotation(f8);
    }

    private final void g(fgo fgoVar) {
        View view = fgoVar.b;
        if (view.getVisibility() == 8) {
            return;
        }
        Map map = fgoVar.a;
        map.put("android:changeTransform:parent", view.getParent());
        map.put("android:changeTransform:transforms", new fej(view));
        Matrix matrix = view.getMatrix();
        Matrix matrix2 = null;
        if (matrix != null && !matrix.isIdentity()) {
            matrix2 = new Matrix(matrix);
        }
        map.put("android:changeTransform:matrix", matrix2);
        if (this.C) {
            Matrix matrix3 = new Matrix();
            fgu.f((ViewGroup) view.getParent(), matrix3);
            matrix3.preTranslate(-r1.getScrollX(), -r1.getScrollY());
            map.put("android:changeTransform:parentMatrix", matrix3);
            map.put("android:changeTransform:intermediateMatrix", view.getTag(R.id.transition_transform));
            map.put("android:changeTransform:intermediateParentMatrix", view.getTag(R.id.parent_matrix));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v12, types: [fey] */
    /* JADX WARN: Type inference failed for: r21v11 */
    /* JADX WARN: Type inference failed for: r21v6 */
    /* JADX WARN: Type inference failed for: r21v7 */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // defpackage.fgc
    public final Animator a(ViewGroup viewGroup, fgo fgoVar, fgo fgoVar2) {
        int i;
        boolean z2;
        int i2;
        ObjectAnimator objectAnimator;
        int i3;
        ObjectAnimator objectAnimator2;
        ffa feyVar;
        ArrayList arrayList;
        ObjectAnimator objectAnimator3;
        ArrayList arrayList2;
        Class<ViewGroup> cls;
        int i4;
        int i5;
        int i6;
        int iIntValue;
        fex fexVar;
        fgo fgoVarL;
        if (fgoVar == null || fgoVar2 == null) {
            return null;
        }
        Map map = fgoVar.a;
        if (!map.containsKey("android:changeTransform:parent")) {
            return null;
        }
        Map map2 = fgoVar2.a;
        if (!map2.containsKey("android:changeTransform:parent")) {
            return null;
        }
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeTransform:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeTransform:parent");
        boolean z3 = this.C && (!(G(viewGroup2) && G(viewGroup3)) ? viewGroup2 == viewGroup3 : !((fgoVarL = l(viewGroup2, true)) == null || viewGroup3 != fgoVarL.b));
        Matrix matrix = (Matrix) map.get("android:changeTransform:intermediateMatrix");
        if (matrix != null) {
            map.put("android:changeTransform:matrix", matrix);
        }
        Matrix matrix2 = (Matrix) map.get("android:changeTransform:intermediateParentMatrix");
        if (matrix2 != null) {
            map.put("android:changeTransform:parentMatrix", matrix2);
        }
        if (z3) {
            Matrix matrix3 = (Matrix) map2.get("android:changeTransform:parentMatrix");
            fgoVar2.b.setTag(R.id.parent_matrix, matrix3);
            Matrix matrix4 = this.D;
            matrix4.reset();
            matrix3.invert(matrix4);
            Matrix matrix5 = (Matrix) map.get("android:changeTransform:matrix");
            if (matrix5 == null) {
                matrix5 = new Matrix();
                map.put("android:changeTransform:matrix", matrix5);
            }
            matrix5.postConcat((Matrix) map.get("android:changeTransform:parentMatrix"));
            matrix5.postConcat(matrix4);
        }
        Matrix matrix6 = (Matrix) map.get("android:changeTransform:matrix");
        Matrix matrix7 = (Matrix) map2.get("android:changeTransform:matrix");
        if (matrix6 == null) {
            matrix6 = ffd.a;
        }
        if (matrix7 == null) {
            matrix7 = ffd.a;
        }
        if (matrix6.equals(matrix7)) {
            z2 = true;
            objectAnimator = null;
            i2 = 2;
            i = 0;
        } else {
            fej fejVar = (fej) map2.get("android:changeTransform:transforms");
            View view = fgoVar2.b;
            f(view, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, 1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
            i = 0;
            float[] fArr = new float[9];
            matrix6.getValues(fArr);
            float[] fArr2 = new float[9];
            matrix7.getValues(fArr2);
            z2 = true;
            fei feiVar = new fei(view, fArr);
            i2 = 2;
            ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(feiVar, PropertyValuesHolder.ofObject(A, new fep(new float[9]), fArr, fArr2), PropertyValuesHolder.ofObject(B, (TypeConverter) null, this.v.a(fArr[2], fArr[5], fArr2[2], fArr2[5])));
            feh fehVar = new feh(view, fejVar, feiVar, matrix7, z3, this.a);
            objectAnimatorOfPropertyValuesHolder.addListener(fehVar);
            objectAnimatorOfPropertyValuesHolder.addPauseListener(fehVar);
            objectAnimator = objectAnimatorOfPropertyValuesHolder;
        }
        if (!z3 || objectAnimator == null || !this.a) {
            return objectAnimator;
        }
        View view2 = fgoVar2.b;
        Matrix matrix8 = new Matrix((Matrix) map2.get("android:changeTransform:parentMatrix"));
        fgu.g(viewGroup, matrix8);
        Class<ViewGroup> cls2 = ViewGroup.class;
        if (Build.VERSION.SDK_INT == 28) {
            ?? r21 = z2;
            if (!fey.c) {
                try {
                    fey.b();
                    Class cls3 = fey.a;
                    Class<?>[] clsArr = new Class[3];
                    clsArr[i] = View.class;
                    clsArr[z2 ? 1 : 0] = cls2;
                    clsArr[i2] = Matrix.class;
                    fey.b = cls3.getDeclaredMethod("addGhost", clsArr);
                    fey.b.setAccessible(z2 ? 1 : 0);
                } catch (NoSuchMethodException e) {
                    Log.i("GhostViewApi21", "Failed to retrieve addGhost method", e);
                }
                r21 = 1;
                fey.c = true;
            }
            Method method = fey.b;
            if (method != null) {
                try {
                    Object[] objArr = new Object[3];
                    objArr[i] = view2;
                    objArr[r21] = viewGroup;
                    objArr[i2] = matrix8;
                    objectAnimator2 = objectAnimator;
                    feyVar = new fey((View) method.invoke(null, objArr));
                } catch (IllegalAccessException unused) {
                } catch (InvocationTargetException e2) {
                    throw new RuntimeException(e2.getCause());
                }
            } else {
                objectAnimator2 = objectAnimator;
                feyVar = null;
            }
        } else {
            if (!(view2.getParent() instanceof ViewGroup)) {
                throw new IllegalArgumentException("Ghosted views must be parented by a ViewGroup");
            }
            fex fexVar2 = (fex) viewGroup.getTag(R.id.ghost_view_holder);
            ffa ffaVarB = ffa.b(view2);
            if (ffaVarB == null || (fexVar = (fex) ffaVarB.getParent()) == fexVar2) {
                i3 = i;
            } else {
                i3 = ffaVarB.d;
                fexVar.removeView(ffaVarB);
                ffaVarB = null;
            }
            if (ffaVarB == null) {
                ffaVarB = new ffa(view2);
                ffaVarB.e = matrix8;
                if (fexVar2 == null) {
                    fexVar2 = new fex(viewGroup);
                } else {
                    if (!fexVar2.b) {
                        throw new IllegalStateException("This GhostViewHolder is detached!");
                    }
                    ViewGroup viewGroup4 = fexVar2.a;
                    viewGroup4.getOverlay().remove(fexVar2);
                    viewGroup4.getOverlay().add(fexVar2);
                }
                ffa.c(viewGroup, fexVar2);
                ffa.c(viewGroup, ffaVarB);
                ArrayList arrayList3 = new ArrayList();
                fex.a(ffaVarB.c, arrayList3);
                ArrayList arrayList4 = new ArrayList();
                int childCount = fexVar2.getChildCount() - 1;
                int i7 = i;
                while (i7 <= childCount) {
                    int i8 = (i7 + childCount) / i2;
                    fex.a(((ffa) fexVar2.getChildAt(i8)).c, arrayList4);
                    if (arrayList3.isEmpty() || arrayList4.isEmpty()) {
                        arrayList = arrayList3;
                        objectAnimator3 = objectAnimator;
                        arrayList2 = arrayList4;
                        cls = cls2;
                        i4 = childCount;
                        i5 = 2;
                    } else {
                        int i9 = i;
                        objectAnimator3 = objectAnimator;
                        if (arrayList3.get(i9) != arrayList4.get(i9)) {
                            arrayList = arrayList3;
                            arrayList2 = arrayList4;
                        } else {
                            int iMin = Math.min(arrayList3.size(), arrayList4.size());
                            int i10 = 1;
                            while (true) {
                                if (i10 < iMin) {
                                    View view3 = (View) arrayList3.get(i10);
                                    arrayList = arrayList3;
                                    View view4 = (View) arrayList4.get(i10);
                                    if (view3 != view4) {
                                        ViewGroup viewGroup5 = (ViewGroup) view3.getParent();
                                        int childCount2 = viewGroup5.getChildCount();
                                        if (view3.getZ() != view4.getZ()) {
                                            arrayList2 = arrayList4;
                                            cls = cls2;
                                            if (view3.getZ() <= view4.getZ()) {
                                                i5 = 2;
                                                i = 0;
                                            }
                                        } else {
                                            arrayList2 = arrayList4;
                                            int i11 = 0;
                                            while (i11 < childCount2) {
                                                int i12 = childCount2;
                                                i4 = childCount;
                                                if (Build.VERSION.SDK_INT >= 29) {
                                                    iIntValue = viewGroup5.getChildDrawingOrder(i11);
                                                    i6 = i11;
                                                    cls = cls2;
                                                    i5 = 2;
                                                    i = 0;
                                                } else {
                                                    if (fgr.b) {
                                                        i6 = i11;
                                                    } else {
                                                        i6 = i11;
                                                        try {
                                                            Class<?> cls4 = Integer.TYPE;
                                                            fgr.a = cls2.getDeclaredMethod("getChildDrawingOrder", cls4, cls4);
                                                            fgr.a.setAccessible(true);
                                                        } catch (NoSuchMethodException unused2) {
                                                        }
                                                        fgr.b = true;
                                                    }
                                                    Method method2 = fgr.a;
                                                    if (method2 != null) {
                                                        try {
                                                            Integer numValueOf = Integer.valueOf(viewGroup5.getChildCount());
                                                            Integer numValueOf2 = Integer.valueOf(i6);
                                                            cls = cls2;
                                                            i5 = 2;
                                                            try {
                                                                Object[] objArr2 = new Object[2];
                                                                i = 0;
                                                                try {
                                                                    objArr2[0] = numValueOf;
                                                                    objArr2[1] = numValueOf2;
                                                                    iIntValue = ((Integer) method2.invoke(viewGroup5, objArr2)).intValue();
                                                                } catch (IllegalAccessException | InvocationTargetException unused3) {
                                                                }
                                                            } catch (IllegalAccessException | InvocationTargetException unused4) {
                                                            }
                                                        } catch (IllegalAccessException | InvocationTargetException unused5) {
                                                        }
                                                    } else {
                                                        cls = cls2;
                                                        i5 = 2;
                                                        i = 0;
                                                        iIntValue = i6;
                                                    }
                                                }
                                                View childAt = viewGroup5.getChildAt(iIntValue);
                                                if (childAt != view3) {
                                                    if (childAt == view4) {
                                                        break;
                                                    }
                                                    i11 = i6 + 1;
                                                    childCount2 = i12;
                                                    cls2 = cls;
                                                    childCount = i4;
                                                }
                                            }
                                        }
                                    } else {
                                        i10++;
                                        arrayList3 = arrayList;
                                        arrayList4 = arrayList4;
                                    }
                                } else {
                                    arrayList = arrayList3;
                                    arrayList2 = arrayList4;
                                    cls = cls2;
                                    i4 = childCount;
                                    i5 = 2;
                                    i = 0;
                                    if (arrayList2.size() == iMin) {
                                        break;
                                    }
                                }
                                arrayList2.clear();
                                arrayList3 = arrayList;
                                i2 = i5;
                                objectAnimator = objectAnimator3;
                                arrayList4 = arrayList2;
                                cls2 = cls;
                            }
                            childCount = i8 - 1;
                            arrayList2.clear();
                            arrayList3 = arrayList;
                            i2 = i5;
                            objectAnimator = objectAnimator3;
                            arrayList4 = arrayList2;
                            cls2 = cls;
                        }
                        cls = cls2;
                        i4 = childCount;
                        i5 = 2;
                        i = 0;
                    }
                    i7 = i8 + 1;
                    childCount = i4;
                    arrayList2.clear();
                    arrayList3 = arrayList;
                    i2 = i5;
                    objectAnimator = objectAnimator3;
                    arrayList4 = arrayList2;
                    cls2 = cls;
                }
                objectAnimator2 = objectAnimator;
                if (i7 < 0 || i7 >= fexVar2.getChildCount()) {
                    fexVar2.addView(ffaVarB);
                } else {
                    fexVar2.addView(ffaVarB, i7);
                }
                ffaVarB.d = i3;
            } else {
                objectAnimator2 = objectAnimator;
                ffaVarB.e = matrix8;
            }
            feyVar = ffaVarB;
            feyVar.d++;
        }
        if (feyVar == null) {
            return objectAnimator2;
        }
        feyVar.a((ViewGroup) fgoVar.a.get("android:changeTransform:parent"), fgoVar.b);
        fgc fgcVar = this;
        while (true) {
            fgc fgcVar2 = fgcVar.k;
            if (fgcVar2 == null) {
                break;
            }
            fgcVar = fgcVar2;
        }
        fgcVar.H(new feg(view2, feyVar));
        View view5 = fgoVar.b;
        if (view5 != fgoVar2.b) {
            fgu.d(view5, BitmapDescriptorFactory.HUE_RED);
        }
        fgu.d(view2, 1.0f);
        return objectAnimator2;
    }

    @Override // defpackage.fgc
    public final void b(fgo fgoVar) {
        g(fgoVar);
    }

    @Override // defpackage.fgc
    public final void c(fgo fgoVar) {
        g(fgoVar);
    }

    @Override // defpackage.fgc
    public final String[] e() {
        return z;
    }
}
