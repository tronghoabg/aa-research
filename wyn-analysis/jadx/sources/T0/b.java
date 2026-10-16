package T0;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class b extends View {

    /* renamed from: a, reason: collision with root package name */
    public int[] f11140a;

    /* renamed from: b, reason: collision with root package name */
    public int f11141b;

    /* renamed from: c, reason: collision with root package name */
    public Context f11142c;

    /* renamed from: d, reason: collision with root package name */
    public Q0.i f11143d;

    /* renamed from: e, reason: collision with root package name */
    public String f11144e;

    /* renamed from: f, reason: collision with root package name */
    public String f11145f;

    /* renamed from: g, reason: collision with root package name */
    public HashMap f11146g;

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11140a = new int[32];
        this.f11146g = new HashMap();
        this.f11142c = context;
        g(attributeSet);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.lang.String r6) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException {
        /*
            r5 = this;
            if (r6 == 0) goto La8
            int r0 = r6.length()
            if (r0 != 0) goto La
            goto La8
        La:
            android.content.Context r0 = r5.f11142c
            if (r0 != 0) goto L10
            goto La8
        L10:
            java.lang.String r6 = r6.trim()
            android.view.ViewParent r1 = r5.getParent()
            boolean r1 = r1 instanceof androidx.constraintlayout.widget.ConstraintLayout
            if (r1 == 0) goto L22
            android.view.ViewParent r1 = r5.getParent()
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
        L22:
            android.view.ViewParent r1 = r5.getParent()
            boolean r1 = r1 instanceof androidx.constraintlayout.widget.ConstraintLayout
            r2 = 0
            if (r1 == 0) goto L32
            android.view.ViewParent r1 = r5.getParent()
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
            goto L33
        L32:
            r1 = r2
        L33:
            boolean r3 = r5.isInEditMode()
            if (r3 == 0) goto L5c
            if (r1 == 0) goto L5c
            boolean r3 = r6 instanceof java.lang.String
            if (r3 == 0) goto L50
            java.util.HashMap r3 = r1.f18033m
            if (r3 == 0) goto L50
            boolean r3 = r3.containsKey(r6)
            if (r3 == 0) goto L50
            java.util.HashMap r3 = r1.f18033m
            java.lang.Object r3 = r3.get(r6)
            goto L51
        L50:
            r3 = r2
        L51:
            boolean r4 = r3 instanceof java.lang.Integer
            if (r4 == 0) goto L5c
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            goto L5d
        L5c:
            r3 = 0
        L5d:
            if (r3 != 0) goto L65
            if (r1 == 0) goto L65
            int r3 = r5.f(r1, r6)
        L65:
            if (r3 != 0) goto L71
            java.lang.Class<T0.p> r1 = T0.p.class
            java.lang.reflect.Field r1 = r1.getField(r6)     // Catch: java.lang.Exception -> L71
            int r3 = r1.getInt(r2)     // Catch: java.lang.Exception -> L71
        L71:
            if (r3 != 0) goto L81
            android.content.res.Resources r1 = r0.getResources()
            java.lang.String r2 = "id"
            java.lang.String r0 = r0.getPackageName()
            int r3 = r1.getIdentifier(r6, r2, r0)
        L81:
            if (r3 == 0) goto L90
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            java.util.HashMap r1 = r5.f11146g
            r1.put(r0, r6)
            r5.b(r3)
            goto La8
        L90:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Could not find id of \""
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r6 = "\""
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            java.lang.String r0 = "ConstraintHelper"
            android.util.Log.w(r0, r6)
        La8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: T0.b.a(java.lang.String):void");
    }

    public final void b(int i5) {
        if (i5 == getId()) {
            return;
        }
        int i10 = this.f11141b + 1;
        int[] iArr = this.f11140a;
        if (i10 > iArr.length) {
            this.f11140a = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f11140a;
        int i11 = this.f11141b;
        iArr2[i11] = i5;
        this.f11141b = i11 + 1;
    }

    public final void c(String str) {
        if (str == null || str.length() == 0 || this.f11142c == null) {
            return;
        }
        String strTrim = str.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (constraintLayout == null) {
            Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = constraintLayout.getChildAt(i5);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof d) && strTrim.equals(((d) layoutParams).f11171Y)) {
                if (childAt.getId() == -1) {
                    Log.w("ConstraintHelper", "to use ConstraintTag view " + childAt.getClass().getSimpleName() + " must have an ID");
                } else {
                    b(childAt.getId());
                }
            }
        }
    }

    public final void d(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i5 = 0; i5 < this.f11141b; i5++) {
            View view = (View) constraintLayout.f18022a.get(this.f11140a[i5]);
            if (view != null) {
                view.setVisibility(visibility);
                if (elevation > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    view.setTranslationZ(view.getTranslationZ() + elevation);
                }
            }
        }
    }

    public final int f(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String resourceEntryName;
        if (str != null && (resources = this.f11142c.getResources()) != null) {
            int childCount = constraintLayout.getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = constraintLayout.getChildAt(i5);
                if (childAt.getId() != -1) {
                    try {
                        resourceEntryName = resources.getResourceEntryName(childAt.getId());
                    } catch (Resources.NotFoundException unused) {
                        resourceEntryName = null;
                    }
                    if (str.equals(resourceEntryName)) {
                        return childAt.getId();
                    }
                }
            }
        }
        return 0;
    }

    public void g(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, q.f11345b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i5 = 0; i5 < indexCount; i5++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i5);
                if (index == 35) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.f11144e = string;
                    setIds(string);
                } else if (index == 36) {
                    String string2 = typedArrayObtainStyledAttributes.getString(index);
                    this.f11145f = string2;
                    setReferenceTags(string2);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f11140a, this.f11141b);
    }

    public abstract void h(Q0.d dVar, boolean z2);

    public final void i() {
        if (this.f11143d == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof d) {
            ((d) layoutParams).f11203p0 = this.f11143d;
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f11144e;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f11145f;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i5, int i10) {
        setMeasuredDimension(0, 0);
    }

    public void setIds(String str) {
        this.f11144e = str;
        if (str == null) {
            return;
        }
        int i5 = 0;
        this.f11141b = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i5);
            if (iIndexOf == -1) {
                a(str.substring(i5));
                return;
            } else {
                a(str.substring(i5, iIndexOf));
                i5 = iIndexOf + 1;
            }
        }
    }

    public void setReferenceTags(String str) {
        this.f11145f = str;
        if (str == null) {
            return;
        }
        int i5 = 0;
        this.f11141b = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i5);
            if (iIndexOf == -1) {
                c(str.substring(i5));
                return;
            } else {
                c(str.substring(i5, iIndexOf));
                i5 = iIndexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f11144e = null;
        this.f11141b = 0;
        for (int i5 : iArr) {
            b(i5);
        }
    }

    @Override // android.view.View
    public final void setTag(int i5, Object obj) {
        super.setTag(i5, obj);
        if (obj == null && this.f11144e == null) {
            b(i5);
        }
    }

    public void e(ConstraintLayout constraintLayout) {
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }
}
