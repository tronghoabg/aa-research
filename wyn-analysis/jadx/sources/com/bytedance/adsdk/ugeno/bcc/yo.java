package com.bytedance.adsdk.ugeno.bcc;

import A7.AbstractC0279p0;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import com.unity3d.services.UnityAdsConstants;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import ka.AbstractC3256n;

/* loaded from: classes.dex */
public class yo extends ViewGroup {

    /* renamed from: ab, reason: collision with root package name */
    private int f24672ab;
    private VelocityTracker af;
    private EdgeEffect au;
    private final oa bcc;
    private Drawable bs;
    private boolean cop;
    private boolean cp;
    private Scroller cq;
    private final Rect cz;
    private float dhk;
    private Parcelable dj;
    private EdgeEffect dor;
    private int dv;
    private int dxx;
    private boolean dz;
    private boolean etd;
    private int fz;
    private int gb;
    private int gem;
    private boolean gr;
    private boolean gsd;
    private int gzw;

    /* renamed from: hg, reason: collision with root package name */
    private int f24673hg;
    private ArrayList<View> hnk;
    private moa hts;
    private int jkf;
    private float km;
    private int ku;
    private float lz;
    int moa;
    private moa nkh;
    private int oib;
    private int orq;
    private final Runnable ot;
    private int ou;
    private float oyt;
    private float pu;
    private boolean pz;
    private boolean rj;
    private int rl;
    private boolean rt;
    private int sk;
    private int swd;
    private int sy;
    private float tpx;

    /* renamed from: ue, reason: collision with root package name */
    private int f24674ue;
    private int uef;
    private boolean uqx;
    private List<Object> vyg;
    private ivm wk;
    private ClassLoader wrv;
    private lw wxf;
    private final ArrayList<oa> xs;
    com.bytedance.adsdk.ugeno.bcc.oa yo;
    private int zjm;
    private List<moa> zou;

    /* renamed from: oa, reason: collision with root package name */
    static final int[] f24671oa = {R.attr.layout_gravity};
    private static final Comparator<oa> lw = new Comparator<oa>() { // from class: com.bytedance.adsdk.ugeno.bcc.yo.1
        @Override // java.util.Comparator
        /* renamed from: uef, reason: merged with bridge method [inline-methods] */
        public int compare(oa oaVar, oa oaVar2) {
            return oaVar.f24675oa - oaVar2.f24675oa;
        }
    };
    private static final Interpolator ivm = new Interpolator() { // from class: com.bytedance.adsdk.ugeno.bcc.yo.2
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    };
    private static final bcc vjj = new bcc();

    public static class bcc implements Comparator<View> {
        @Override // java.util.Comparator
        /* renamed from: uef, reason: merged with bridge method [inline-methods] */
        public int compare(View view, View view2) {
            C0037yo c0037yo = (C0037yo) view.getLayoutParams();
            C0037yo c0037yo2 = (C0037yo) view2.getLayoutParams();
            boolean z2 = c0037yo.uef;
            return z2 != c0037yo2.uef ? z2 ? 1 : -1 : c0037yo.lw - c0037yo2.lw;
        }
    }

    public class ivm extends DataSetObserver {
        public ivm() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() throws Resources.NotFoundException {
            yo.this.oa();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() throws Resources.NotFoundException {
            yo.this.oa();
        }
    }

    public interface lw {
        void uef(View view, float f10);
    }

    public interface moa {
        void cq(int i5);

        void uef(int i5, float f10, int i10);

        void wrv(int i5);
    }

    public static class oa {
        float lw;
        float moa;

        /* renamed from: oa, reason: collision with root package name */
        int f24675oa;
        Object uef;
        boolean yo;
    }

    @Target({ElementType.TYPE})
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    public @interface uef {
    }

    public static class xs extends com.bytedance.adsdk.ugeno.bcc.uef {
        public static final Parcelable.Creator<xs> CREATOR = new Parcelable.ClassLoaderCreator<xs>() { // from class: com.bytedance.adsdk.ugeno.bcc.yo.xs.1
            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: uef, reason: merged with bridge method [inline-methods] */
            public xs createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new xs(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: uef, reason: merged with bridge method [inline-methods] */
            public xs createFromParcel(Parcel parcel) {
                return new xs(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: uef, reason: merged with bridge method [inline-methods] */
            public xs[] newArray(int i5) {
                return new xs[i5];
            }
        };
        ClassLoader moa;

        /* renamed from: oa, reason: collision with root package name */
        int f24676oa;
        Parcelable yo;

        public xs(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("FragmentPager.SavedState{");
            sb2.append(Integer.toHexString(System.identityHashCode(this)));
            sb2.append(" position=");
            return AbstractC0279p0.j(this.f24676oa, "}", sb2);
        }

        @Override // com.bytedance.adsdk.ugeno.bcc.uef, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i5) {
            super.writeToParcel(parcel, i5);
            parcel.writeInt(this.f24676oa);
            parcel.writeParcelable(this.yo, i5);
        }

        public xs(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.f24676oa = parcel.readInt();
            this.yo = parcel.readParcelable(classLoader);
            this.moa = classLoader;
        }
    }

    public yo(Context context) {
        super(context);
        this.xs = new ArrayList<>();
        this.bcc = new oa();
        this.cz = new Rect();
        this.zjm = -1;
        this.dj = null;
        this.wrv = null;
        this.dhk = -3.4028235E38f;
        this.tpx = Float.MAX_VALUE;
        this.f24674ue = 1;
        this.gb = -1;
        this.etd = true;
        this.uqx = false;
        this.ot = new Runnable() { // from class: com.bytedance.adsdk.ugeno.bcc.yo.3
            @Override // java.lang.Runnable
            public void run() throws Resources.NotFoundException {
                yo.this.setScrollState(0);
                yo.this.yo();
            }
        };
        this.jkf = 0;
        uef();
    }

    private boolean bcc() {
        this.gb = -1;
        zjm();
        this.au.onRelease();
        this.dor.onRelease();
        return this.au.isFinished() || this.dor.isFinished();
    }

    private oa cz() {
        int i5;
        int clientWidth = getClientWidth();
        float f10 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f11 = clientWidth > 0 ? this.f24672ab / clientWidth : 0.0f;
        int i10 = 0;
        boolean z2 = true;
        oa oaVar = null;
        int i11 = -1;
        float f12 = 0.0f;
        while (i10 < this.xs.size()) {
            oa oaVar2 = this.xs.get(i10);
            if (!z2 && oaVar2.f24675oa != (i5 = i11 + 1)) {
                oaVar2 = this.bcc;
                oaVar2.lw = f10 + f12 + f11;
                oaVar2.f24675oa = i5;
                oaVar2.moa = this.yo.uef(i5);
                i10--;
            }
            oa oaVar3 = oaVar2;
            f10 = oaVar3.lw;
            float f13 = oaVar3.moa + f10 + f11;
            if (!z2 && scrollX < f10) {
                break;
            }
            if (scrollX < f13 || i10 == this.xs.size() - 1) {
                return oaVar3;
            }
            int i12 = oaVar3.f24675oa;
            float f14 = oaVar3.moa;
            i10++;
            i11 = i12;
            f12 = f14;
            oaVar = oaVar3;
            z2 = false;
        }
        return oaVar;
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void ivm() {
        int i5 = 0;
        while (i5 < getChildCount()) {
            if (!((C0037yo) getChildAt(i5).getLayoutParams()).uef) {
                removeViewAt(i5);
                i5--;
            }
            i5++;
        }
    }

    private void lw(int i5) {
        moa moaVar = this.nkh;
        if (moaVar != null) {
            moaVar.wrv(i5);
        }
        List<moa> list = this.zou;
        if (list != null) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                moa moaVar2 = this.zou.get(i10);
                if (moaVar2 != null) {
                    moaVar2.wrv(i5);
                }
            }
        }
        moa moaVar3 = this.hts;
        if (moaVar3 != null) {
            moaVar3.wrv(i5);
        }
    }

    private boolean moa(int i5) {
        if (this.xs.size() == 0) {
            if (this.etd) {
                return false;
            }
            this.rj = false;
            uef(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0);
            if (this.rj) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        oa oaVarCz = cz();
        int clientWidth = getClientWidth();
        int i10 = this.f24672ab;
        int i11 = clientWidth + i10;
        float f10 = clientWidth;
        int i12 = oaVarCz.f24675oa;
        float f11 = ((i5 / f10) - oaVarCz.lw) / (oaVarCz.moa + (i10 / f10));
        this.rj = false;
        uef(i12, f11, (int) (i11 * f11));
        if (this.rj) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    private void setScrollingCacheEnabled(boolean z2) {
        if (this.rt != z2) {
            this.rt = z2;
        }
    }

    private void xs() {
        if (this.ou != 0) {
            ArrayList<View> arrayList = this.hnk;
            if (arrayList == null) {
                this.hnk = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                this.hnk.add(getChildAt(i5));
            }
            Collections.sort(this.hnk, vjj);
        }
    }

    private void zjm() {
        this.pz = false;
        this.cp = false;
        VelocityTracker velocityTracker = this.af;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.af = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i5, int i10) {
        oa oaVarUef;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i11 = 0; i11 < getChildCount(); i11++) {
                View childAt = getChildAt(i11);
                if (childAt.getVisibility() == 0 && (oaVarUef = uef(childAt)) != null && oaVarUef.f24675oa == this.moa) {
                    childAt.addFocusables(arrayList, i5, i10);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if ((i10 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(ArrayList<View> arrayList) {
        oa oaVarUef;
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() == 0 && (oaVarUef = uef(childAt)) != null && oaVarUef.f24675oa == this.moa) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i5, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        C0037yo c0037yo = (C0037yo) layoutParams;
        boolean zYo = c0037yo.uef | yo(view);
        c0037yo.uef = zYo;
        if (!this.gsd) {
            super.addView(view, i5, layoutParams);
        } else {
            if (zYo) {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
            c0037yo.moa = true;
            addViewInLayout(view, i5, layoutParams);
        }
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i5) {
        if (this.yo == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        return i5 < 0 ? scrollX > ((int) (((float) clientWidth) * this.dhk)) : i5 > 0 && scrollX < ((int) (((float) clientWidth) * this.tpx));
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0037yo) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        this.dz = true;
        if (this.cq.isFinished() || !this.cq.computeScrollOffset()) {
            uef(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.cq.getCurrX();
        int currY = this.cq.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!moa(currX)) {
                this.cq.abortAnimation();
                scrollTo(0, currY);
            }
        }
        postInvalidateOnAnimation();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || uef(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        oa oaVarUef;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() == 0 && (oaVarUef = uef(childAt)) != null && oaVarUef.f24675oa == this.moa && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        com.bytedance.adsdk.ugeno.bcc.oa oaVar;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean zDraw = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (oaVar = this.yo) != null && oaVar.uef() > 1)) {
            if (!this.au.isFinished()) {
                int iSave = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate(getPaddingTop() + (-height), this.dhk * width);
                this.au.setSize(height, width);
                zDraw = this.au.draw(canvas);
                canvas.restoreToCount(iSave);
            }
            if (!this.dor.isFinished()) {
                int iSave2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.tpx + 1.0f)) * width2);
                this.dor.setSize(height2, width2);
                zDraw |= this.dor.draw(canvas);
                canvas.restoreToCount(iSave2);
            }
        } else {
            this.au.finish();
            this.dor.finish();
        }
        if (zDraw) {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.bs;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0037yo();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public com.bytedance.adsdk.ugeno.bcc.oa getAdapter() {
        return this.yo;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i5, int i10) {
        if (this.ou == 2) {
            i10 = (i5 - 1) - i10;
        }
        return ((C0037yo) this.hnk.get(i10).getLayoutParams()).ivm;
    }

    public int getCurrentItem() {
        return this.moa;
    }

    public int getOffscreenPageLimit() {
        return this.f24674ue;
    }

    public int getPageMargin() {
        return this.f24672ab;
    }

    public void oa(moa moaVar) {
        List<moa> list = this.zou;
        if (list != null) {
            list.remove(moaVar);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.etd = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.ot);
        Scroller scroller = this.cq;
        if (scroller != null && !scroller.isFinished()) {
            this.cq.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i5;
        float f10;
        int i10;
        super.onDraw(canvas);
        if (this.f24672ab <= 0 || this.bs == null || this.xs.size() <= 0 || this.yo == null) {
            return;
        }
        int scrollX = getScrollX();
        float width = getWidth();
        float f11 = this.f24672ab / width;
        int i11 = 0;
        oa oaVar = this.xs.get(0);
        float f12 = oaVar.lw;
        int size = this.xs.size();
        int i12 = oaVar.f24675oa;
        int i13 = this.xs.get(size - 1).f24675oa;
        while (i12 < i13) {
            while (true) {
                i5 = oaVar.f24675oa;
                if (i12 <= i5 || i11 >= size) {
                    break;
                }
                i11++;
                oaVar = this.xs.get(i11);
            }
            if (i12 == i5) {
                float f13 = oaVar.lw;
                float f14 = oaVar.moa;
                f10 = (f13 + f14) * width;
                f12 = f13 + f14 + f11;
            } else {
                float fUef = this.yo.uef(i12);
                f10 = (f12 + fUef) * width;
                f12 = fUef + f11 + f12;
            }
            if (this.f24672ab + f10 > scrollX) {
                i10 = scrollX;
                this.bs.setBounds(Math.round(f10), this.sy, Math.round(this.f24672ab + f10), this.oib);
                this.bs.draw(canvas);
            } else {
                i10 = scrollX;
            }
            if (f10 > i10 + r2) {
                return;
            }
            i12++;
            scrollX = i10;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) throws Resources.NotFoundException {
        int iFindPointerIndex;
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            bcc();
            return false;
        }
        if (action != 0) {
            if (this.pz) {
                return true;
            }
            if (this.cp) {
                return false;
            }
        }
        if (action == 0) {
            float x5 = motionEvent.getX();
            this.km = x5;
            this.lz = x5;
            float y10 = motionEvent.getY();
            this.pu = y10;
            this.oyt = y10;
            this.gb = motionEvent.getPointerId(0);
            this.cp = false;
            this.dz = true;
            this.cq.computeScrollOffset();
            if (this.jkf != 2 || Math.abs(this.cq.getFinalX() - this.cq.getCurrX()) <= this.gem) {
                uef(false);
                this.pz = false;
            } else {
                this.cq.abortAnimation();
                this.gr = false;
                yo();
                this.pz = true;
                yo(true);
                setScrollState(1);
            }
        } else if (action == 2) {
            int i5 = this.gb;
            if (i5 != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i5)) != -1) {
                float x10 = motionEvent.getX(iFindPointerIndex);
                float f10 = x10 - this.lz;
                float fAbs = Math.abs(f10);
                float y11 = motionEvent.getY(iFindPointerIndex);
                float fAbs2 = Math.abs(y11 - this.pu);
                if (f10 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && !uef(this.lz, f10) && uef(this, false, (int) f10, (int) x10, (int) y11)) {
                    this.lz = x10;
                    this.oyt = y11;
                    this.cp = true;
                    return false;
                }
                int i10 = this.dxx;
                if (fAbs > i10 && fAbs * 0.5f > fAbs2) {
                    this.pz = true;
                    yo(true);
                    setScrollState(1);
                    this.lz = f10 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? this.km + this.dxx : this.km - this.dxx;
                    this.oyt = y11;
                    setScrollingCacheEnabled(true);
                } else if (fAbs2 > i10) {
                    this.cp = true;
                }
                if (this.pz && oa(x10)) {
                    postInvalidateOnAnimation();
                }
            }
        } else if (action == 6) {
            uef(motionEvent);
        }
        if (this.af == null) {
            this.af = VelocityTracker.obtain();
        }
        this.af.addMovement(motionEvent);
        return this.pz;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0094  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r19, int r20, int r21, int r22, int r23) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.bcc.yo.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    public void onMeasure(int i5, int i10) throws Resources.NotFoundException {
        C0037yo c0037yo;
        C0037yo c0037yo2;
        int i11;
        setMeasuredDimension(View.getDefaultSize(0, i5), View.getDefaultSize(0, i10));
        int measuredWidth = getMeasuredWidth();
        this.fz = Math.min(measuredWidth / 10, this.ku);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i12 = 0;
        while (true) {
            boolean z2 = true;
            int i13 = 1073741824;
            if (i12 >= childCount) {
                break;
            }
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8 && (c0037yo2 = (C0037yo) childAt.getLayoutParams()) != null && c0037yo2.uef) {
                int i14 = c0037yo2.f24677oa;
                int i15 = i14 & 7;
                int i16 = i14 & 112;
                boolean z10 = i16 == 48 || i16 == 80;
                if (i15 != 3 && i15 != 5) {
                    z2 = false;
                }
                int i17 = Integer.MIN_VALUE;
                if (z10) {
                    i11 = Integer.MIN_VALUE;
                    i17 = 1073741824;
                } else {
                    i11 = z2 ? 1073741824 : Integer.MIN_VALUE;
                }
                int i18 = ((ViewGroup.LayoutParams) c0037yo2).width;
                if (i18 != -2) {
                    if (i18 == -1) {
                        i18 = paddingLeft;
                    }
                    i17 = 1073741824;
                } else {
                    i18 = paddingLeft;
                }
                int i19 = ((ViewGroup.LayoutParams) c0037yo2).height;
                if (i19 == -2) {
                    i19 = measuredHeight;
                    i13 = i11;
                } else if (i19 == -1) {
                    i19 = measuredHeight;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i18, i17), View.MeasureSpec.makeMeasureSpec(i19, i13));
                if (z10) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z2) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i12++;
        }
        this.orq = View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.gzw = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.gsd = true;
        yo();
        this.gsd = false;
        int childCount2 = getChildCount();
        for (int i20 = 0; i20 < childCount2; i20++) {
            View childAt2 = getChildAt(i20);
            if (childAt2.getVisibility() != 8 && ((c0037yo = (C0037yo) childAt2.getLayoutParams()) == null || !c0037yo.uef)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * c0037yo.yo), 1073741824), this.gzw);
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i5, Rect rect) {
        int i10;
        int i11;
        int i12;
        oa oaVarUef;
        int childCount = getChildCount();
        if ((i5 & 2) != 0) {
            i11 = childCount;
            i10 = 0;
            i12 = 1;
        } else {
            i10 = childCount - 1;
            i11 = -1;
            i12 = -1;
        }
        while (i10 != i11) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 0 && (oaVarUef = uef(childAt)) != null && oaVarUef.f24675oa == this.moa && childAt.requestFocus(i5, rect)) {
                return true;
            }
            i10 += i12;
        }
        return false;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) throws Resources.NotFoundException {
        if (!(parcelable instanceof xs)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        xs xsVar = (xs) parcelable;
        super.onRestoreInstanceState(xsVar.uef());
        if (this.yo != null) {
            uef(xsVar.f24676oa, false, true);
            return;
        }
        this.zjm = xsVar.f24676oa;
        this.dj = xsVar.yo;
        this.wrv = xsVar.moa;
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        xs xsVar = new xs(super.onSaveInstanceState());
        xsVar.f24676oa = this.moa;
        com.bytedance.adsdk.ugeno.bcc.oa oaVar = this.yo;
        if (oaVar != null) {
            xsVar.yo = oaVar.oa();
        }
        return xsVar;
    }

    @Override // android.view.View
    public void onSizeChanged(int i5, int i10, int i11, int i12) {
        super.onSizeChanged(i5, i10, i11, i12);
        if (i5 != i11) {
            int i13 = this.f24672ab;
            uef(i5, i11, i13, i13);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) throws Resources.NotFoundException {
        com.bytedance.adsdk.ugeno.bcc.oa oaVar;
        int iFindPointerIndex;
        if (this.cop) {
            return true;
        }
        boolean zBcc = false;
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (oaVar = this.yo) == null || oaVar.uef() == 0) {
            return false;
        }
        if (this.af == null) {
            this.af = VelocityTracker.obtain();
        }
        this.af.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.cq.abortAnimation();
            this.gr = false;
            yo();
            float x5 = motionEvent.getX();
            this.km = x5;
            this.lz = x5;
            float y10 = motionEvent.getY();
            this.pu = y10;
            this.oyt = y10;
            this.gb = motionEvent.getPointerId(0);
        } else if (action != 1) {
            if (action != 2) {
                if (action != 3) {
                    if (action == 5) {
                        int actionIndex = motionEvent.getActionIndex();
                        if (actionIndex != -1) {
                            this.lz = motionEvent.getX(actionIndex);
                            this.gb = motionEvent.getPointerId(actionIndex);
                        }
                    } else if (action == 6) {
                        uef(motionEvent);
                        int iFindPointerIndex2 = motionEvent.findPointerIndex(this.gb);
                        if (iFindPointerIndex2 != -1) {
                            this.lz = motionEvent.getX(iFindPointerIndex2);
                        }
                    }
                } else if (this.pz) {
                    uef(this.moa, true, 0, false);
                    zBcc = bcc();
                }
            } else if (!this.pz) {
                int iFindPointerIndex3 = motionEvent.findPointerIndex(this.gb);
                if (iFindPointerIndex3 == -1) {
                    zBcc = bcc();
                } else {
                    float x10 = motionEvent.getX(iFindPointerIndex3);
                    float fAbs = Math.abs(x10 - this.lz);
                    float y11 = motionEvent.getY(iFindPointerIndex3);
                    float fAbs2 = Math.abs(y11 - this.oyt);
                    if (fAbs > this.dxx && fAbs > fAbs2) {
                        this.pz = true;
                        yo(true);
                        float f10 = this.km;
                        this.lz = x10 - f10 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? f10 + this.dxx : f10 - this.dxx;
                        this.oyt = y11;
                        setScrollState(1);
                        setScrollingCacheEnabled(true);
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                    if (this.pz) {
                        zBcc = oa(motionEvent.getX(iFindPointerIndex));
                    }
                }
            } else if (this.pz && (iFindPointerIndex = motionEvent.findPointerIndex(this.gb)) != -1) {
                zBcc = oa(motionEvent.getX(iFindPointerIndex));
            }
        } else if (this.pz) {
            VelocityTracker velocityTracker = this.af;
            velocityTracker.computeCurrentVelocity(1000, this.rl);
            int xVelocity = (int) velocityTracker.getXVelocity(this.gb);
            this.gr = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            oa oaVarCz = cz();
            float f11 = clientWidth;
            int i5 = oaVarCz.f24675oa;
            float f12 = ((scrollX / f11) - oaVarCz.lw) / (oaVarCz.moa + (this.f24672ab / f11));
            int iFindPointerIndex4 = motionEvent.findPointerIndex(this.gb);
            if (iFindPointerIndex4 != -1) {
                uef(uef(i5, f12, xVelocity, (int) (motionEvent.getX(iFindPointerIndex4) - this.km)), true, true, xVelocity);
                zBcc = bcc();
            }
        }
        if (zBcc) {
            postInvalidateOnAnimation();
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.gsd) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void setAdapter(com.bytedance.adsdk.ugeno.bcc.oa oaVar) throws Resources.NotFoundException {
        com.bytedance.adsdk.ugeno.bcc.oa oaVar2 = this.yo;
        if (oaVar2 != null) {
            oaVar2.uef((DataSetObserver) null);
            for (int i5 = 0; i5 < this.xs.size(); i5++) {
                oa oaVar3 = this.xs.get(i5);
                this.yo.uef((ViewGroup) this, oaVar3.f24675oa, oaVar3.uef);
            }
            this.xs.clear();
            ivm();
            this.moa = 0;
            scrollTo(0, 0);
        }
        this.yo = oaVar;
        this.uef = 0;
        if (oaVar != null) {
            if (this.wk == null) {
                this.wk = new ivm();
            }
            this.yo.uef((DataSetObserver) this.wk);
            this.gr = false;
            boolean z2 = this.etd;
            this.etd = true;
            this.uef = this.yo.uef();
            int i10 = this.zjm;
            if (i10 >= 0) {
                uef(i10, false, true);
                this.zjm = -1;
                this.dj = null;
                this.wrv = null;
            } else if (z2) {
                requestLayout();
            } else {
                yo();
            }
        }
        List<Object> list = this.vyg;
        if (list == null || list.isEmpty()) {
            return;
        }
        int size = this.vyg.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.vyg.get(i11);
        }
    }

    public void setCurrentItem(int i5) throws Resources.NotFoundException {
        this.gr = false;
        uef(i5, !this.etd, false);
    }

    public void setOffscreenPageLimit(int i5) throws Resources.NotFoundException {
        if (i5 <= 0) {
            Log.w("ViewPager", "Requested offscreen page limit " + i5 + " too small; defaulting to 1");
            i5 = 1;
        }
        if (i5 != this.f24674ue) {
            this.f24674ue = i5;
            yo();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(moa moaVar) {
        this.nkh = moaVar;
    }

    public void setPageMargin(int i5) {
        int i10 = this.f24672ab;
        this.f24672ab = i5;
        int width = getWidth();
        uef(width, width, i5, i10);
        requestLayout();
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.bs = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setScrollState(int i5) {
        if (this.jkf == i5) {
            return;
        }
        this.jkf = i5;
        if (this.wxf != null) {
            oa(i5 != 0);
        }
        ivm(i5);
    }

    public void setScroller(Scroller scroller) {
        this.cq = scroller;
    }

    public void uef() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.cq = new Scroller(context, ivm);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f10 = context.getResources().getDisplayMetrics().density;
        this.dxx = viewConfiguration.getScaledPagingTouchSlop();
        this.sk = (int) (400.0f * f10);
        this.rl = viewConfiguration.getScaledMaximumFlingVelocity();
        this.au = new EdgeEffect(context);
        this.dor = new EdgeEffect(context);
        this.swd = (int) (25.0f * f10);
        this.gem = (int) (2.0f * f10);
        this.ku = (int) (f10 * 16.0f);
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.bs;
    }

    public void yo() throws Resources.NotFoundException {
        uef(this.moa);
    }

    /* renamed from: com.bytedance.adsdk.ugeno.bcc.yo$yo, reason: collision with other inner class name */
    public static class C0037yo extends ViewGroup.LayoutParams {
        int ivm;
        int lw;
        boolean moa;

        /* renamed from: oa, reason: collision with root package name */
        public int f24677oa;
        public boolean uef;
        float yo;

        public C0037yo() {
            super(-1, -1);
            this.yo = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }

        public C0037yo(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.yo = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, yo.f24671oa);
            this.f24677oa = typedArrayObtainStyledAttributes.getInteger(0, 48);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    private static boolean yo(View view) {
        return view.getClass().getAnnotation(uef.class) != null;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0037yo(getContext(), attributeSet);
    }

    public void oa() throws Resources.NotFoundException {
        int iUef = this.yo.uef();
        this.uef = iUef;
        boolean z2 = this.xs.size() < (this.f24674ue * 2) + 1 && this.xs.size() < iUef;
        int iMax = this.moa;
        int i5 = 0;
        while (i5 < this.xs.size()) {
            oa oaVar = this.xs.get(i5);
            int iUef2 = this.yo.uef(oaVar.uef);
            if (iUef2 != -1) {
                if (iUef2 == -2) {
                    this.xs.remove(i5);
                    i5--;
                    this.yo.uef((ViewGroup) this, oaVar.f24675oa, oaVar.uef);
                    int i10 = this.moa;
                    if (i10 == oaVar.f24675oa) {
                        iMax = Math.max(0, Math.min(i10, iUef - 1));
                    }
                } else {
                    int i11 = oaVar.f24675oa;
                    if (i11 != iUef2) {
                        if (i11 == this.moa) {
                            iMax = iUef2;
                        }
                        oaVar.f24675oa = iUef2;
                    }
                }
                z2 = true;
            }
            i5++;
        }
        Collections.sort(this.xs, lw);
        if (z2) {
            int childCount = getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                C0037yo c0037yo = (C0037yo) getChildAt(i12).getLayoutParams();
                if (!c0037yo.uef) {
                    c0037yo.yo = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                }
            }
            uef(iMax, false, true);
            requestLayout();
        }
    }

    private void yo(boolean z2) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z2);
        }
    }

    public void setPageMarginDrawable(int i5) {
        setPageMarginDrawable(getContext().getResources().getDrawable(i5));
    }

    private void ivm(int i5) {
        moa moaVar = this.nkh;
        if (moaVar != null) {
            moaVar.cq(i5);
        }
        List<moa> list = this.zou;
        if (list != null) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                moa moaVar2 = this.zou.get(i10);
                if (moaVar2 != null) {
                    moaVar2.cq(i5);
                }
            }
        }
        moa moaVar3 = this.hts;
        if (moaVar3 != null) {
            moaVar3.cq(i5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean yo(int r5) throws android.content.res.Resources.NotFoundException {
        /*
            r4 = this;
            android.view.View r0 = r4.findFocus()
            r1 = 0
            if (r0 != r4) goto L9
        L7:
            r0 = r1
            goto L60
        L9:
            if (r0 == 0) goto L60
            android.view.ViewParent r2 = r0.getParent()
        Lf:
            boolean r3 = r2 instanceof android.view.ViewGroup
            if (r3 == 0) goto L1b
            if (r2 != r4) goto L16
            goto L60
        L16:
            android.view.ViewParent r2 = r2.getParent()
            goto Lf
        L1b:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.Class r3 = r0.getClass()
            java.lang.String r3 = r3.getSimpleName()
            r2.append(r3)
            android.view.ViewParent r0 = r0.getParent()
        L2f:
            boolean r3 = r0 instanceof android.view.ViewGroup
            if (r3 == 0) goto L48
            java.lang.String r3 = " => "
            r2.append(r3)
            java.lang.Class r3 = r0.getClass()
            java.lang.String r3 = r3.getSimpleName()
            r2.append(r3)
            android.view.ViewParent r0 = r0.getParent()
            goto L2f
        L48:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "arrowScroll tried to find focus based on non-child current focused view "
            r0.<init>(r3)
            java.lang.String r2 = r2.toString()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "ViewPager"
            android.util.Log.e(r2, r0)
            goto L7
        L60:
            android.view.FocusFinder r1 = android.view.FocusFinder.getInstance()
            android.view.View r1 = r1.findNextFocus(r4, r0, r5)
            r2 = 66
            r3 = 17
            if (r1 == 0) goto Lab
            if (r1 == r0) goto Lab
            if (r5 != r3) goto L90
            android.graphics.Rect r2 = r4.cz
            android.graphics.Rect r2 = r4.uef(r2, r1)
            int r2 = r2.left
            android.graphics.Rect r3 = r4.cz
            android.graphics.Rect r3 = r4.uef(r3, r0)
            int r3 = r3.left
            if (r0 == 0) goto L8b
            if (r2 < r3) goto L8b
            boolean r0 = r4.moa()
            goto Lc2
        L8b:
            boolean r0 = r1.requestFocus()
            goto Lc2
        L90:
            if (r5 != r2) goto Lb7
            android.graphics.Rect r2 = r4.cz
            android.graphics.Rect r2 = r4.uef(r2, r1)
            int r2 = r2.left
            android.graphics.Rect r3 = r4.cz
            android.graphics.Rect r3 = r4.uef(r3, r0)
            int r3 = r3.left
            if (r0 == 0) goto La6
            if (r2 <= r3) goto Lb9
        La6:
            boolean r0 = r1.requestFocus()
            goto Lc2
        Lab:
            if (r5 == r3) goto Lbe
            r0 = 1
            if (r5 != r0) goto Lb1
            goto Lbe
        Lb1:
            if (r5 == r2) goto Lb9
            r0 = 2
            if (r5 != r0) goto Lb7
            goto Lb9
        Lb7:
            r0 = 0
            goto Lc2
        Lb9:
            boolean r0 = r4.lw()
            goto Lc2
        Lbe:
            boolean r0 = r4.moa()
        Lc2:
            if (r0 == 0) goto Lcb
            int r5 = android.view.SoundEffectConstants.getContantForFocusDirection(r5)
            r4.playSoundEffect(r5)
        Lcb:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.bcc.yo.yo(int):boolean");
    }

    public boolean lw() throws Resources.NotFoundException {
        com.bytedance.adsdk.ugeno.bcc.oa oaVar = this.yo;
        if (oaVar == null || this.moa >= oaVar.uef() - 1) {
            return false;
        }
        uef(this.moa + 1, true);
        return true;
    }

    public boolean moa() throws Resources.NotFoundException {
        int i5 = this.moa;
        if (i5 <= 0) {
            return false;
        }
        uef(i5 - 1, true);
        return true;
    }

    public void uef(int i5, boolean z2) throws Resources.NotFoundException {
        this.gr = false;
        uef(i5, z2, false);
    }

    public void uef(int i5, boolean z2, boolean z10) throws Resources.NotFoundException {
        uef(i5, z2, z10, 0);
    }

    public void uef(int i5, boolean z2, boolean z10, int i10) throws Resources.NotFoundException {
        com.bytedance.adsdk.ugeno.bcc.oa oaVar = this.yo;
        if (oaVar != null && oaVar.uef() > 0) {
            if (!z10 && this.moa == i5 && this.xs.size() != 0) {
                setScrollingCacheEnabled(false);
                return;
            }
            if (i5 < 0) {
                i5 = 0;
            } else if (i5 >= this.yo.uef()) {
                i5 = this.yo.uef() - 1;
            }
            int i11 = this.f24674ue;
            int i12 = this.moa;
            if (i5 > i12 + i11 || i5 < i12 - i11) {
                for (int i13 = 0; i13 < this.xs.size(); i13++) {
                    this.xs.get(i13).yo = true;
                }
            }
            boolean z11 = this.moa != i5;
            if (this.etd) {
                this.moa = i5;
                if (z11) {
                    lw(i5);
                }
                requestLayout();
                return;
            }
            uef(i5);
            uef(i5, z2, i10, z11);
            return;
        }
        setScrollingCacheEnabled(false);
    }

    public oa oa(View view) {
        while (true) {
            Object parent = view.getParent();
            if (parent != this) {
                if (parent == null || !(parent instanceof View)) {
                    return null;
                }
                view = (View) parent;
            } else {
                return uef(view);
            }
        }
    }

    public oa oa(int i5) {
        for (int i10 = 0; i10 < this.xs.size(); i10++) {
            oa oaVar = this.xs.get(i10);
            if (oaVar.f24675oa == i5) {
                return oaVar;
            }
        }
        return null;
    }

    private void oa(int i5, float f10, int i10) {
        moa moaVar = this.nkh;
        if (moaVar != null) {
            moaVar.uef(i5, f10, i10);
        }
        List<moa> list = this.zou;
        if (list != null) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                moa moaVar2 = this.zou.get(i11);
                if (moaVar2 != null) {
                    moaVar2.uef(i5, f10, i10);
                }
            }
        }
        moa moaVar3 = this.hts;
        if (moaVar3 != null) {
            moaVar3.uef(i5, f10, i10);
        }
    }

    private void uef(int i5, boolean z2, int i10, boolean z10) throws Resources.NotFoundException {
        int iMax;
        oa oaVarOa = oa(i5);
        if (oaVarOa != null) {
            iMax = (int) (Math.max(this.dhk, Math.min(oaVarOa.lw, this.tpx)) * getClientWidth());
        } else {
            iMax = 0;
        }
        if (z2) {
            uef(iMax, 0, i10);
            if (z10) {
                lw(i5);
                return;
            }
            return;
        }
        if (z10) {
            lw(i5);
        }
        uef(false);
        scrollTo(iMax, 0);
        moa(iMax);
    }

    private void oa(boolean z2) {
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            getChildAt(i5).setLayerType(z2 ? this.f24673hg : 0, null);
        }
    }

    private boolean oa(float f10) {
        boolean z2;
        boolean z10;
        float f11 = this.lz - f10;
        this.lz = f10;
        float scrollX = getScrollX() + f11;
        float clientWidth = getClientWidth();
        float f12 = this.dhk * clientWidth;
        float f13 = this.tpx * clientWidth;
        boolean z11 = false;
        oa oaVar = this.xs.get(0);
        oa oaVar2 = (oa) AbstractC3256n.e(this.xs, 1);
        if (oaVar.f24675oa != 0) {
            f12 = oaVar.lw * clientWidth;
            z2 = false;
        } else {
            z2 = true;
        }
        if (oaVar2.f24675oa != this.yo.uef() - 1) {
            f13 = oaVar2.lw * clientWidth;
            z10 = false;
        } else {
            z10 = true;
        }
        if (scrollX < f12) {
            if (z2) {
                this.au.onPull(Math.abs(f12 - scrollX) / clientWidth);
                z11 = true;
            }
            scrollX = f12;
        } else if (scrollX > f13) {
            if (z10) {
                this.dor.onPull(Math.abs(scrollX - f13) / clientWidth);
                z11 = true;
            }
            scrollX = f13;
        }
        int i5 = (int) scrollX;
        this.lz = (scrollX - i5) + this.lz;
        scrollTo(i5, getScrollY());
        moa(i5);
        return z11;
    }

    public void uef(moa moaVar) {
        if (this.zou == null) {
            this.zou = new ArrayList();
        }
        this.zou.add(moaVar);
    }

    public void uef(boolean z2, lw lwVar) throws Resources.NotFoundException {
        uef(z2, lwVar, 2);
    }

    public void uef(boolean z2, lw lwVar, int i5) throws Resources.NotFoundException {
        boolean z10 = lwVar != null;
        boolean z11 = z10 != (this.wxf != null);
        this.wxf = lwVar;
        setChildrenDrawingOrderEnabled(z10);
        if (z10) {
            this.ou = z2 ? 2 : 1;
            this.f24673hg = i5;
        } else {
            this.ou = 0;
        }
        if (z11) {
            yo();
        }
    }

    public float uef(float f10) {
        return (float) Math.sin((f10 - 0.5f) * 0.47123894f);
    }

    public void uef(int i5, int i10, int i11) throws Resources.NotFoundException {
        int scrollX;
        int iAbs;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.cq;
        if (scroller != null && !scroller.isFinished()) {
            scrollX = this.dz ? this.cq.getCurrX() : this.cq.getStartX();
            this.cq.abortAnimation();
            setScrollingCacheEnabled(false);
        } else {
            scrollX = getScrollX();
        }
        int i12 = scrollX;
        int scrollY = getScrollY();
        int i13 = i5 - i12;
        int i14 = i10 - scrollY;
        if (i13 == 0 && i14 == 0) {
            uef(false);
            yo();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i15 = clientWidth / 2;
        float f10 = clientWidth;
        float f11 = i15;
        float fUef = (uef(Math.min(1.0f, (Math.abs(i13) * 1.0f) / f10)) * f11) + f11;
        int iAbs2 = Math.abs(i11);
        if (iAbs2 > 0) {
            iAbs = Math.round(Math.abs(fUef / iAbs2) * 1000.0f) * 4;
        } else {
            iAbs = (int) (((Math.abs(i13) / ((this.yo.uef(this.moa) * f10) + this.f24672ab)) + 1.0f) * 100.0f);
        }
        int iMin = Math.min(iAbs, 600);
        this.dz = false;
        this.cq.startScroll(i12, scrollY, i13, i14, iMin);
        postInvalidateOnAnimation();
    }

    public oa uef(int i5, int i10) {
        oa oaVar = new oa();
        oaVar.f24675oa = i5;
        oaVar.uef = this.yo.uef((ViewGroup) this, i5);
        oaVar.moa = this.yo.uef(i5);
        if (i10 >= 0 && i10 < this.xs.size()) {
            this.xs.add(i10, oaVar);
            return oaVar;
        }
        this.xs.add(oaVar);
        return oaVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0062, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c6 A[PHI: r7 r10 r14
  0x00c6: PHI (r7v7 int) = (r7v6 int), (r7v5 int), (r7v10 int) binds: [B:63:0x00ea, B:60:0x00d4, B:52:0x00bb] A[DONT_GENERATE, DONT_INLINE]
  0x00c6: PHI (r10v9 int) = (r10v1 int), (r10v8 int), (r10v12 int) binds: [B:63:0x00ea, B:60:0x00d4, B:52:0x00bb] A[DONT_GENERATE, DONT_INLINE]
  0x00c6: PHI (r14v6 float) = (r14v4 float), (r14v5 float), (r14v3 float) binds: [B:63:0x00ea, B:60:0x00d4, B:52:0x00bb] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void uef(int r18) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 582
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.bcc.yo.uef(int):void");
    }

    private void uef(oa oaVar, int i5, oa oaVar2) {
        int i10;
        int i11;
        oa oaVar3;
        oa oaVar4;
        int iUef = this.yo.uef();
        int clientWidth = getClientWidth();
        float f10 = clientWidth > 0 ? this.f24672ab / clientWidth : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (oaVar2 != null) {
            int i12 = oaVar2.f24675oa;
            int i13 = oaVar.f24675oa;
            if (i12 < i13) {
                float fUef = oaVar2.lw + oaVar2.moa + f10;
                int i14 = i12 + 1;
                int i15 = 0;
                while (i14 <= oaVar.f24675oa && i15 < this.xs.size()) {
                    oa oaVar5 = this.xs.get(i15);
                    while (true) {
                        oaVar4 = oaVar5;
                        if (i14 <= oaVar4.f24675oa || i15 >= this.xs.size() - 1) {
                            break;
                        }
                        i15++;
                        oaVar5 = this.xs.get(i15);
                    }
                    while (i14 < oaVar4.f24675oa) {
                        fUef += this.yo.uef(i14) + f10;
                        i14++;
                    }
                    oaVar4.lw = fUef;
                    fUef += oaVar4.moa + f10;
                    i14++;
                }
            } else if (i12 > i13) {
                int size = this.xs.size() - 1;
                float fUef2 = oaVar2.lw;
                while (true) {
                    i12--;
                    if (i12 < oaVar.f24675oa || size < 0) {
                        break;
                    }
                    oa oaVar6 = this.xs.get(size);
                    while (true) {
                        oaVar3 = oaVar6;
                        if (i12 >= oaVar3.f24675oa || size <= 0) {
                            break;
                        }
                        size--;
                        oaVar6 = this.xs.get(size);
                    }
                    while (i12 > oaVar3.f24675oa) {
                        fUef2 -= this.yo.uef(i12) + f10;
                        i12--;
                    }
                    fUef2 -= oaVar3.moa + f10;
                    oaVar3.lw = fUef2;
                }
            }
        }
        int size2 = this.xs.size();
        float fUef3 = oaVar.lw;
        int i16 = oaVar.f24675oa;
        int i17 = i16 - 1;
        this.dhk = i16 == 0 ? fUef3 : -3.4028235E38f;
        int i18 = iUef - 1;
        this.tpx = i16 == i18 ? (oaVar.moa + fUef3) - 1.0f : Float.MAX_VALUE;
        int i19 = i5 - 1;
        while (i19 >= 0) {
            oa oaVar7 = this.xs.get(i19);
            while (true) {
                i11 = oaVar7.f24675oa;
                if (i17 <= i11) {
                    break;
                }
                fUef3 -= this.yo.uef(i17) + f10;
                i17--;
            }
            fUef3 -= oaVar7.moa + f10;
            oaVar7.lw = fUef3;
            if (i11 == 0) {
                this.dhk = fUef3;
            }
            i19--;
            i17--;
        }
        float fUef4 = oaVar.lw + oaVar.moa + f10;
        int i20 = oaVar.f24675oa + 1;
        int i21 = i5 + 1;
        while (i21 < size2) {
            oa oaVar8 = this.xs.get(i21);
            while (true) {
                i10 = oaVar8.f24675oa;
                if (i20 >= i10) {
                    break;
                }
                fUef4 += this.yo.uef(i20) + f10;
                i20++;
            }
            if (i10 == i18) {
                this.tpx = (oaVar8.moa + fUef4) - 1.0f;
            }
            oaVar8.lw = fUef4;
            fUef4 += oaVar8.moa + f10;
            i21++;
            i20++;
        }
        this.uqx = false;
    }

    public oa uef(View view) {
        for (int i5 = 0; i5 < this.xs.size(); i5++) {
            oa oaVar = this.xs.get(i5);
            if (this.yo.uef(view, oaVar.uef)) {
                return oaVar;
            }
        }
        return null;
    }

    private void uef(int i5, int i10, int i11, int i12) {
        if (i10 > 0 && !this.xs.isEmpty()) {
            if (!this.cq.isFinished()) {
                this.cq.setFinalX(getCurrentItem() * getClientWidth());
                return;
            } else {
                scrollTo((int) ((getScrollX() / (((i10 - getPaddingLeft()) - getPaddingRight()) + i12)) * (((i5 - getPaddingLeft()) - getPaddingRight()) + i11)), getScrollY());
                return;
            }
        }
        oa oaVarOa = oa(this.moa);
        int iMin = (int) ((oaVarOa != null ? Math.min(oaVarOa.lw, this.tpx) : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) * ((i5 - getPaddingLeft()) - getPaddingRight()));
        if (iMin != getScrollX()) {
            uef(false);
            scrollTo(iMin, getScrollY());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void uef(int r13, float r14, int r15) {
        /*
            r12 = this;
            int r0 = r12.dv
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L6b
            int r0 = r12.getScrollX()
            int r3 = r12.getPaddingLeft()
            int r4 = r12.getPaddingRight()
            int r5 = r12.getWidth()
            int r6 = r12.getChildCount()
            r7 = r1
        L1b:
            if (r7 >= r6) goto L6b
            android.view.View r8 = r12.getChildAt(r7)
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            com.bytedance.adsdk.ugeno.bcc.yo$yo r9 = (com.bytedance.adsdk.ugeno.bcc.yo.C0037yo) r9
            boolean r10 = r9.uef
            if (r10 == 0) goto L68
            int r9 = r9.f24677oa
            r9 = r9 & 7
            if (r9 == r2) goto L4f
            r10 = 3
            if (r9 == r10) goto L49
            r10 = 5
            if (r9 == r10) goto L39
            r9 = r3
            goto L5c
        L39:
            int r9 = r5 - r4
            int r10 = r8.getMeasuredWidth()
            int r9 = r9 - r10
            int r10 = r8.getMeasuredWidth()
            int r4 = r4 + r10
        L45:
            r11 = r9
            r9 = r3
            r3 = r11
            goto L5c
        L49:
            int r9 = r8.getWidth()
            int r9 = r9 + r3
            goto L5c
        L4f:
            int r9 = r8.getMeasuredWidth()
            int r9 = r5 - r9
            int r9 = r9 / 2
            int r9 = java.lang.Math.max(r9, r3)
            goto L45
        L5c:
            int r3 = r3 + r0
            int r10 = r8.getLeft()
            int r3 = r3 - r10
            if (r3 == 0) goto L67
            r8.offsetLeftAndRight(r3)
        L67:
            r3 = r9
        L68:
            int r7 = r7 + 1
            goto L1b
        L6b:
            r12.oa(r13, r14, r15)
            com.bytedance.adsdk.ugeno.bcc.yo$lw r13 = r12.wxf
            if (r13 == 0) goto L9e
            int r13 = r12.getScrollX()
            int r14 = r12.getChildCount()
        L7a:
            if (r1 >= r14) goto L9e
            android.view.View r15 = r12.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r0 = r15.getLayoutParams()
            com.bytedance.adsdk.ugeno.bcc.yo$yo r0 = (com.bytedance.adsdk.ugeno.bcc.yo.C0037yo) r0
            boolean r0 = r0.uef
            if (r0 != 0) goto L9b
            int r0 = r15.getLeft()
            int r0 = r0 - r13
            float r0 = (float) r0
            int r3 = r12.getClientWidth()
            float r3 = (float) r3
            float r0 = r0 / r3
            com.bytedance.adsdk.ugeno.bcc.yo$lw r3 = r12.wxf
            r3.uef(r15, r0)
        L9b:
            int r1 = r1 + 1
            goto L7a
        L9e:
            r12.rj = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.bcc.yo.uef(int, float, int):void");
    }

    private void uef(boolean z2) {
        boolean z10 = this.jkf == 2;
        if (z10) {
            setScrollingCacheEnabled(false);
            if (!this.cq.isFinished()) {
                this.cq.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.cq.getCurrX();
                int currY = this.cq.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        moa(currX);
                    }
                }
            }
        }
        this.gr = false;
        for (int i5 = 0; i5 < this.xs.size(); i5++) {
            oa oaVar = this.xs.get(i5);
            if (oaVar.yo) {
                oaVar.yo = false;
                z10 = true;
            }
        }
        if (z10) {
            if (z2) {
                postOnAnimation(this.ot);
            } else {
                this.ot.run();
            }
        }
    }

    private boolean uef(float f10, float f11) {
        if (f10 >= this.fz || f11 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return f10 > ((float) (getWidth() - this.fz)) && f11 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        return true;
    }

    private int uef(int i5, float f10, int i10, int i11) {
        if (Math.abs(i11) <= this.swd || Math.abs(i10) <= this.sk) {
            i5 += (int) (f10 + (i5 >= this.moa ? 0.4f : 0.6f));
        } else if (i10 <= 0) {
            i5++;
        }
        if (this.xs.size() > 0) {
            return Math.max(this.xs.get(0).f24675oa, Math.min(i5, ((oa) AbstractC3256n.e(this.xs, 1)).f24675oa));
        }
        return i5;
    }

    private void uef(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.gb) {
            int i5 = actionIndex == 0 ? 1 : 0;
            this.lz = motionEvent.getX(i5);
            this.gb = motionEvent.getPointerId(i5);
            VelocityTracker velocityTracker = this.af;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public boolean uef(View view, boolean z2, int i5, int i10, int i11) {
        int i12;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i13 = i10 + scrollX;
                if (i13 >= childAt.getLeft() && i13 < childAt.getRight() && (i12 = i11 + scrollY) >= childAt.getTop() && i12 < childAt.getBottom() && uef(childAt, true, i5, i13 - childAt.getLeft(), i12 - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z2 && view.canScrollHorizontally(-i5);
    }

    public boolean uef(KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 21) {
            if (keyEvent.hasModifiers(2)) {
                return moa();
            }
            return yo(17);
        }
        if (keyCode == 22) {
            if (keyEvent.hasModifiers(2)) {
                return lw();
            }
            return yo(66);
        }
        if (keyCode != 61) {
            return false;
        }
        if (keyEvent.hasNoModifiers()) {
            return yo(2);
        }
        if (keyEvent.hasModifiers(1)) {
            return yo(1);
        }
        return false;
    }

    private Rect uef(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left = viewGroup.getLeft() + rect.left;
            rect.right = viewGroup.getRight() + rect.right;
            rect.top = viewGroup.getTop() + rect.top;
            rect.bottom = viewGroup.getBottom() + rect.bottom;
            parent = viewGroup.getParent();
        }
        return rect;
    }
}
