package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import com.waze.R;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public class ButtonBarLayout extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f903a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f904b;

    /* renamed from: c, reason: collision with root package name */
    private int f905c;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f905c = -1;
        int[] iArr = android.support.v7.a.a.f489k;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        ViewCompat.saveAttributeDataForStyleable(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, 0, 0);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(0, true);
        this.f903a = z;
        typedArrayObtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            b(z);
        }
    }

    private final int a(int i2) {
        int childCount = getChildCount();
        while (i2 < childCount) {
            if (getChildAt(i2).getVisibility() == 0) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    private final void b(boolean z) {
        if (this.f904b != z) {
            if (!z || this.f903a) {
                this.f904b = z;
                setOrientation(z ? 1 : 0);
                setGravity(true != z ? 80 : GravityCompat.END);
                View viewFindViewById = findViewById(R.id.spacer);
                if (viewFindViewById != null) {
                    viewFindViewById.setVisibility(true != z ? 4 : 8);
                }
                for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                    bringChildToFront(getChildAt(childCount));
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.LinearLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void onMeasure(int r7, int r8) {
        /*
            r6 = this;
            int r0 = android.view.View.MeasureSpec.getSize(r7)
            boolean r1 = r6.f903a
            r2 = 0
            if (r1 == 0) goto L16
            int r3 = r6.f905c
            if (r0 <= r3) goto L14
            boolean r3 = r6.f904b
            if (r3 == 0) goto L14
            r6.b(r2)
        L14:
            r6.f905c = r0
        L16:
            boolean r3 = r6.f904b
            r4 = 1
            if (r3 != 0) goto L2b
            int r3 = android.view.View.MeasureSpec.getMode(r7)
            r5 = 1073741824(0x40000000, float:2.0)
            if (r3 != r5) goto L2b
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
            r3 = r4
            goto L2d
        L2b:
            r0 = r7
            r3 = r2
        L2d:
            super.onMeasure(r0, r8)
            if (r1 == 0) goto L45
            boolean r0 = r6.f904b
            if (r0 != 0) goto L45
            int r0 = r6.getMeasuredWidthAndState()
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0 = r0 & r1
            r1 = 16777216(0x1000000, float:2.3509887E-38)
            if (r0 != r1) goto L45
            r6.b(r4)
            goto L47
        L45:
            if (r3 == 0) goto L4a
        L47:
            super.onMeasure(r7, r8)
        L4a:
            int r0 = r6.a(r2)
            if (r0 < 0) goto L92
            android.view.View r1 = r6.getChildAt(r0)
            android.view.ViewGroup$LayoutParams r3 = r1.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r3 = (android.widget.LinearLayout.LayoutParams) r3
            int r5 = r6.getPaddingTop()
            int r1 = r1.getMeasuredHeight()
            int r5 = r5 + r1
            int r1 = r3.topMargin
            int r5 = r5 + r1
            int r1 = r3.bottomMargin
            int r5 = r5 + r1
            boolean r1 = r6.f904b
            if (r1 == 0) goto L8c
            int r0 = r0 + r4
            int r0 = r6.a(r0)
            if (r0 < 0) goto L93
            android.view.View r0 = r6.getChildAt(r0)
            int r0 = r0.getPaddingTop()
            android.content.res.Resources r1 = r6.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            r3 = 1098907648(0x41800000, float:16.0)
            float r1 = r1 * r3
            int r1 = (int) r1
            int r0 = r0 + r1
            goto L90
        L8c:
            int r0 = r6.getPaddingBottom()
        L90:
            int r5 = r5 + r0
            goto L93
        L92:
            r5 = r2
        L93:
            int r0 = androidx.core.view.ViewCompat.getMinimumHeight(r6)
            if (r0 == r5) goto La1
            r6.setMinimumHeight(r5)
            if (r8 != 0) goto La1
            super.onMeasure(r7, r2)
        La1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.ButtonBarLayout.onMeasure(int, int):void");
    }
}
