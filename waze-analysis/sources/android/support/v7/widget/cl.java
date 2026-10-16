package android.support.v7.widget;

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
import androidx.core.widget.ListViewAutoScrollHelper;
import com.waze.R;
import java.lang.reflect.InvocationTargetException;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
class cl extends ListView {

    /* renamed from: a, reason: collision with root package name */
    ck f1241a;

    /* renamed from: b, reason: collision with root package name */
    private final Rect f1242b;

    /* renamed from: c, reason: collision with root package name */
    private int f1243c;

    /* renamed from: d, reason: collision with root package name */
    private int f1244d;

    /* renamed from: e, reason: collision with root package name */
    private int f1245e;

    /* renamed from: f, reason: collision with root package name */
    private int f1246f;

    /* renamed from: g, reason: collision with root package name */
    private int f1247g;

    /* renamed from: h, reason: collision with root package name */
    private ci f1248h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f1249i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f1250j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f1251k;

    /* renamed from: l, reason: collision with root package name */
    private ListViewAutoScrollHelper f1252l;

    cl(Context context, boolean z) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.f1242b = new Rect();
        this.f1243c = 0;
        this.f1244d = 0;
        this.f1245e = 0;
        this.f1246f = 0;
        this.f1250j = z;
        setCacheColorHint(0);
    }

    private final void d(boolean z) {
        ci ciVar = this.f1248h;
        if (ciVar != null) {
            ciVar.a(z);
        }
    }

    private final void e() {
        Drawable selector = getSelector();
        if (selector != null && this.f1251k && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    final void a(boolean z) {
        this.f1249i = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(android.view.MotionEvent r18, int r19) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instructions count: 365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.cl.b(android.view.MotionEvent, int):boolean");
    }

    public final int c(int i2, int i3) {
        int listPaddingTop = getListPaddingTop() + getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop;
        }
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i4 = 0;
        int i5 = 0;
        View view = null;
        while (i4 < count) {
            int itemViewType = adapter.getItemViewType(i4);
            int i6 = itemViewType != i5 ? itemViewType : i5;
            if (itemViewType != i5) {
                view = null;
            }
            view = adapter.getView(i4, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            view.measure(i2, layoutParams.height > 0 ? View.MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i4 > 0) {
                listPaddingTop += dividerHeight;
            }
            listPaddingTop += view.getMeasuredHeight();
            if (listPaddingTop >= i3) {
                return i3;
            }
            i4++;
            i5 = i6;
        }
        return listPaddingTop;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f1242b;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected final void drawableStateChanged() {
        if (this.f1241a != null) {
            return;
        }
        super.drawableStateChanged();
        d(true);
        e();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.f1250j || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.f1250j || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.f1250j || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.f1250j && this.f1249i) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        this.f1241a = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10) {
            if (this.f1241a == null) {
                ck ckVar = new ck(this);
                this.f1241a = ckVar;
                ckVar.f1240a.post(ckVar);
            }
            actionMasked = 10;
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
                if (Build.VERSION.SDK_INT < 30 || !ch.b()) {
                    setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                } else {
                    ch.a(this, iPointToPosition, childAt);
                }
            }
            e();
        }
        return zOnHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f1247g = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        ck ckVar = this.f1241a;
        if (ckVar != null) {
            cl clVar = ckVar.f1240a;
            clVar.f1241a = null;
            clVar.removeCallbacks(ckVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.AbsListView
    public final void setSelector(Drawable drawable) {
        ci ciVar = drawable != null ? new ci(drawable) : null;
        this.f1248h = ciVar;
        super.setSelector(ciVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f1243c = rect.left;
        this.f1244d = rect.top;
        this.f1245e = rect.right;
        this.f1246f = rect.bottom;
    }
}
