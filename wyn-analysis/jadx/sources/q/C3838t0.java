package q;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.wynauto.wyn.R;
import g5.RunnableC2707d;
import java.lang.reflect.InvocationTargetException;
import n1.ViewOnTouchListenerC3570d;

/* renamed from: q.t0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3838t0 extends ListView {

    /* renamed from: a, reason: collision with root package name */
    public final Rect f43906a;

    /* renamed from: b, reason: collision with root package name */
    public int f43907b;

    /* renamed from: c, reason: collision with root package name */
    public int f43908c;

    /* renamed from: d, reason: collision with root package name */
    public int f43909d;

    /* renamed from: e, reason: collision with root package name */
    public int f43910e;

    /* renamed from: f, reason: collision with root package name */
    public int f43911f;

    /* renamed from: g, reason: collision with root package name */
    public C3834r0 f43912g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f43913h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f43914i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f43915j;
    public ViewOnTouchListenerC3570d k;

    /* renamed from: l, reason: collision with root package name */
    public RunnableC2707d f43916l;

    public C3838t0(Context context, boolean z2) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.f43906a = new Rect();
        this.f43907b = 0;
        this.f43908c = 0;
        this.f43909d = 0;
        this.f43910e = 0;
        this.f43914i = z2;
        setCacheColorHint(0);
    }

    public final int a(int i5, int i10) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int measuredHeight = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i11 = 0;
        View view = null;
        for (int i12 = 0; i12 < count; i12++) {
            int itemViewType = adapter.getItemViewType(i12);
            if (itemViewType != i11) {
                view = null;
                i11 = itemViewType;
            }
            view = adapter.getView(i12, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i13 = layoutParams.height;
            view.measure(i5, i13 > 0 ? View.MeasureSpec.makeMeasureSpec(i13, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i12 > 0) {
                measuredHeight += dividerHeight;
            }
            measuredHeight += view.getMeasuredHeight();
            if (measuredHeight >= i10) {
                return i10;
            }
        }
        return measuredHeight;
    }

    /* JADX WARN: Removed duplicated region for block: B:81:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(android.view.MotionEvent r18, int r19) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instructions count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q.C3838t0.b(android.view.MotionEvent, int):boolean");
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f43906a;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.f43916l != null) {
            return;
        }
        super.drawableStateChanged();
        C3834r0 c3834r0 = this.f43912g;
        if (c3834r0 != null) {
            c3834r0.f43881b = true;
        }
        Drawable selector = getSelector();
        if (selector != null && this.f43915j && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.f43914i || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.f43914i || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.f43914i || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.f43914i && this.f43913h) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f43916l = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int i5 = Build.VERSION.SDK_INT;
        if (i5 < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f43916l == null) {
            RunnableC2707d runnableC2707d = new RunnableC2707d(this, 20);
            this.f43916l = runnableC2707d;
            post(runnableC2707d);
        }
        boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked != 9 && actionMasked != 7) {
            setSelection(-1);
            return zOnHoverEvent;
        }
        int iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        if (iPointToPosition != -1 && iPointToPosition != getSelectedItemPosition()) {
            View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
            if (childAt.isEnabled()) {
                requestFocus();
                if (i5 < 30 || !AbstractC3831p0.f43870d) {
                    setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                } else {
                    try {
                        AbstractC3831p0.f43867a.invoke(this, Integer.valueOf(iPointToPosition), childAt, Boolean.FALSE, -1, -1);
                        AbstractC3831p0.f43868b.invoke(this, Integer.valueOf(iPointToPosition));
                        AbstractC3831p0.f43869c.invoke(this, Integer.valueOf(iPointToPosition));
                    } catch (IllegalAccessException e7) {
                        e7.printStackTrace();
                    } catch (InvocationTargetException e10) {
                        e10.printStackTrace();
                    }
                }
            }
            Drawable selector = getSelector();
            if (selector != null && this.f43915j && isPressed()) {
                selector.setState(getDrawableState());
            }
        }
        return zOnHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f43911f = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        RunnableC2707d runnableC2707d = this.f43916l;
        if (runnableC2707d != null) {
            C3838t0 c3838t0 = (C3838t0) runnableC2707d.f35743b;
            c3838t0.f43916l = null;
            c3838t0.removeCallbacks(runnableC2707d);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z2) {
        this.f43913h = z2;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        C3834r0 c3834r0 = null;
        if (drawable != null) {
            C3834r0 c3834r02 = new C3834r0();
            Drawable drawable2 = c3834r02.f43880a;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            c3834r02.f43880a = drawable;
            drawable.setCallback(c3834r02);
            c3834r02.f43881b = true;
            c3834r0 = c3834r02;
        }
        this.f43912g = c3834r0;
        super.setSelector(c3834r0);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f43907b = rect.left;
        this.f43908c = rect.top;
        this.f43909d = rect.right;
        this.f43910e = rect.bottom;
    }
}
