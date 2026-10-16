package android.support.constraint;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.car.app.model.Alert;
import defpackage.f;
import defpackage.h;
import defpackage.i;
import defpackage.p;
import defpackage.q;
import defpackage.r;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {
    final SparseArray a;
    final q b;
    public h c;
    private final ArrayList d;
    private int e;
    private int f;
    private int g;
    private int h;
    private boolean i;
    private int j;

    public ConstraintLayout(Context context) {
        super(context);
        this.a = new SparseArray();
        this.d = new ArrayList(100);
        this.b = new q();
        this.e = 0;
        this.f = 0;
        this.g = Alert.DURATION_SHOW_INDEFINITELY;
        this.h = Alert.DURATION_SHOW_INDEFINITELY;
        this.i = true;
        this.j = 2;
        this.c = null;
        e(null);
    }

    private final p c(int i) {
        View view;
        if (i == 0 || (view = (View) this.a.get(i)) == this) {
            return this.b;
        }
        if (view == null) {
            return null;
        }
        return ((f) view.getLayoutParams()).Y;
    }

    private final p d(View view) {
        if (view == this) {
            return this.b;
        }
        if (view == null) {
            return null;
        }
        return ((f) view.getLayoutParams()).Y;
    }

    private final void e(AttributeSet attributeSet) {
        q qVar = this.b;
        qVar.J = this;
        this.a.put(getId(), this);
        this.c = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, i.a);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 16) {
                    this.e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(16, this.e);
                } else if (index == 17) {
                    this.f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(17, this.f);
                } else if (index == 14) {
                    this.g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(14, this.g);
                } else if (index == 15) {
                    this.h = typedArrayObtainStyledAttributes.getDimensionPixelOffset(15, this.h);
                } else if (index == 113) {
                    this.j = typedArrayObtainStyledAttributes.getInt(113, this.j);
                } else if (index == 34) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(34, 0);
                    h hVar = new h();
                    this.c = hVar;
                    hVar.f(getContext(), resourceId);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        qVar.ai = this.j;
    }

    @Override // android.view.ViewGroup
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final f generateLayoutParams(AttributeSet attributeSet) {
        return new f(getContext(), attributeSet);
    }

    protected final void b() {
        this.b.D();
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof f;
    }

    @Override // android.view.ViewGroup
    protected final /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new f();
    }

    @Override // android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new f(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            f fVar = (f) childAt.getLayoutParams();
            if (childAt.getVisibility() != 8 || fVar.Q || zIsInEditMode) {
                p pVar = fVar.Y;
                int iB = pVar.b();
                int iC = pVar.c();
                childAt.layout(iB, iC, pVar.h() + iB, pVar.d() + iC);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:200:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x049c  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x05b4  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void onMeasure(int r35, int r36) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 1540
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.ConstraintLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        boolean z = view instanceof Guideline;
        p pVarD = d(view);
        if (z && !(pVarD instanceof r)) {
            f fVar = (f) view.getLayoutParams();
            fVar.Y = new r();
            fVar.Q = true;
            ((r) fVar.Y).A(fVar.M);
            p pVar = fVar.Y;
        }
        this.a.put(view.getId(), view);
        this.i = true;
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.a.remove(view.getId());
        this.b.F(d(view));
        this.i = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        super.requestLayout();
        this.i = true;
    }

    @Override // android.view.View
    public final void setId(int i) {
        SparseArray sparseArray = this.a;
        sparseArray.remove(getId());
        super.setId(i);
        sparseArray.put(getId(), this);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new SparseArray();
        this.d = new ArrayList(100);
        this.b = new q();
        this.e = 0;
        this.f = 0;
        this.g = Alert.DURATION_SHOW_INDEFINITELY;
        this.h = Alert.DURATION_SHOW_INDEFINITELY;
        this.i = true;
        this.j = 2;
        this.c = null;
        e(attributeSet);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new SparseArray();
        this.d = new ArrayList(100);
        this.b = new q();
        this.e = 0;
        this.f = 0;
        this.g = Alert.DURATION_SHOW_INDEFINITELY;
        this.h = Alert.DURATION_SHOW_INDEFINITELY;
        this.i = true;
        this.j = 2;
        this.c = null;
        e(attributeSet);
    }
}
