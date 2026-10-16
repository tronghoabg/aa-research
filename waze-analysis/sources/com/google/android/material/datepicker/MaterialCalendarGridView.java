package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.core.util.Pair;
import androidx.core.view.ViewCompat;
import com.google.android.material.focus.FocusRingDrawable;
import com.waze.R;
import java.util.ArrayList;
import java.util.Calendar;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class MaterialCalendarGridView extends GridView {

    /* renamed from: a, reason: collision with root package name */
    private final Calendar f6356a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f6357b;

    /* renamed from: c, reason: collision with root package name */
    private t f6358c;

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f6356a = ax.k();
        if (ag.e(getContext())) {
            setNextFocusLeftId(R.id.cancel_button);
            setNextFocusRightId(R.id.confirm_button);
        }
        this.f6357b = ag.f(getContext(), R.attr.nestedScrollable);
        ViewCompat.setAccessibilityDelegate(this, new ab(this));
    }

    private static int c(View view) {
        return view.getLeft() + (view.getWidth() / 2);
    }

    private final View d(int i2) {
        return getChildAt(i2 - getFirstVisiblePosition());
    }

    private final boolean e(int i2, boolean z) {
        t tVar;
        t tVar2;
        int iE = z ? getAdapter().e(i2) : getAdapter().f(i2);
        if (iE != -1) {
            setSelection(iE);
            return true;
        }
        if (!z && (tVar2 = this.f6358c) != null) {
            return z.s(tVar2.f6489a, false);
        }
        if (!z || (tVar = this.f6358c) == null) {
            return true;
        }
        return z.s(tVar.f6489a, true);
    }

    private final boolean f(int i2) {
        int iD = getAdapter().d(i2);
        if (iD == -1) {
            return false;
        }
        setSelection(iD);
        return true;
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ak getAdapter() {
        return (ak) super.getAdapter();
    }

    final void b(t tVar) {
        this.f6358c = tVar;
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter().notifyDataSetChanged();
        post(new Runnable() { // from class: com.google.android.material.datepicker.aa
            @Override // java.lang.Runnable
            public final void run() {
                MaterialCalendarGridView materialCalendarGridView = this.f6366a;
                ak adapter = materialCalendarGridView.getAdapter();
                Drawable selector = materialCalendarGridView.getSelector();
                if (selector instanceof FocusRingDrawable) {
                    return;
                }
                Drawable drawableB = FocusRingDrawable.b(materialCalendarGridView.getContext(), selector);
                if (drawableB instanceof FocusRingDrawable) {
                    FocusRingDrawable focusRingDrawable = (FocusRingDrawable) drawableB;
                    e eVar = adapter.f6408c;
                    if (eVar != null) {
                        focusRingDrawable.h(eVar.f6454a.d());
                    }
                    materialCalendarGridView.setDrawSelectorOnTop(true);
                    materialCalendarGridView.setSelector(focusRingDrawable);
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        int iA;
        int iC;
        int iA2;
        int iC2;
        int i2;
        int width;
        int right;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        ak adapter = materialCalendarGridView.getAdapter();
        at atVar = adapter.f6411f;
        e eVar = adapter.f6408c;
        int iMax = Math.max(adapter.g(), materialCalendarGridView.getFirstVisiblePosition());
        int iMin = Math.min(adapter.h(), materialCalendarGridView.getLastVisiblePosition());
        Long item = adapter.getItem(iMax);
        Long item2 = adapter.getItem(iMin);
        for (Pair pair : new ArrayList()) {
            F f2 = pair.first;
            if (f2 == 0 || pair.second == 0) {
                materialCalendarGridView = this;
            } else {
                Long l2 = (Long) f2;
                long jLongValue = l2.longValue();
                Long l3 = (Long) pair.second;
                long jLongValue2 = l3.longValue();
                if (item == null || item2 == null || l2.longValue() > item2.longValue() || l3.longValue() < item.longValue()) {
                    materialCalendarGridView = this;
                    iMax = iMax;
                    iMin = iMin;
                    adapter = adapter;
                } else {
                    boolean zB = com.google.android.material.internal.t.b(materialCalendarGridView);
                    if (jLongValue < item.longValue()) {
                        if (iMax % adapter.f6407b.f6400c == 0) {
                            right = 0;
                        } else {
                            int i3 = iMax - 1;
                            right = !zB ? materialCalendarGridView.d(i3).getRight() : materialCalendarGridView.d(i3).getLeft();
                        }
                        iC = right;
                        iA = iMax;
                    } else {
                        Calendar calendar = materialCalendarGridView.f6356a;
                        calendar.setTimeInMillis(jLongValue);
                        iA = adapter.a(calendar.get(5));
                        iC = c(materialCalendarGridView.d(iA));
                    }
                    if (jLongValue2 > item2.longValue()) {
                        iC2 = (iMin + 1) % adapter.f6407b.f6400c == 0 ? materialCalendarGridView.getWidth() : !zB ? materialCalendarGridView.d(iMin).getRight() : materialCalendarGridView.d(iMin).getLeft();
                        iA2 = iMin;
                    } else {
                        Calendar calendar2 = materialCalendarGridView.f6356a;
                        calendar2.setTimeInMillis(jLongValue2);
                        iA2 = adapter.a(calendar2.get(5));
                        iC2 = c(materialCalendarGridView.d(iA2));
                    }
                    int itemId = (int) adapter.getItemId(iA);
                    int i4 = iMax;
                    int i5 = iMin;
                    int itemId2 = (int) adapter.getItemId(iA2);
                    while (itemId <= itemId2) {
                        int numColumns = materialCalendarGridView.getNumColumns() * itemId;
                        int numColumns2 = (numColumns + materialCalendarGridView.getNumColumns()) - 1;
                        View viewD = materialCalendarGridView.d(numColumns);
                        int top = viewD.getTop();
                        d dVar = eVar.f6454a;
                        int iB = top + dVar.b();
                        ak akVar = adapter;
                        int bottom = viewD.getBottom() - dVar.a();
                        if (zB) {
                            int i6 = iA2 > numColumns2 ? 0 : iC2;
                            if (numColumns > iA) {
                                int i7 = i6;
                                width = getWidth();
                                i2 = i7;
                            } else {
                                i2 = i6;
                                width = iC;
                            }
                        } else {
                            i2 = numColumns > iA ? 0 : iC;
                            width = iA2 > numColumns2 ? getWidth() : iC2;
                        }
                        canvas.drawRect(i2, iB, width, bottom, eVar.f6461h);
                        itemId++;
                        materialCalendarGridView = this;
                        adapter = akVar;
                    }
                    materialCalendarGridView = this;
                    iMax = i4;
                    iMin = i5;
                }
            }
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    protected final void onFocusChanged(boolean z, int i2, Rect rect) {
        int iC;
        if (!z) {
            super.onFocusChanged(false, i2, rect);
            return;
        }
        if (i2 == 33 || i2 == 1) {
            iC = getAdapter().c();
        } else if (i2 == 130) {
            iC = getAdapter().b();
        } else if (i2 == 2) {
            i2 = 2;
            iC = getAdapter().b();
        } else {
            iC = -1;
        }
        if (iC != -1) {
            setSelection(iC);
        } else {
            super.onFocusChanged(true, i2, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i2, KeyEvent keyEvent) {
        int selectedItemPosition = getSelectedItemPosition();
        if (selectedItemPosition == -1) {
            return super.onKeyDown(i2, keyEvent);
        }
        boolean zB = com.google.android.material.internal.t.b(this);
        if (i2 == 21) {
            return e(selectedItemPosition, zB);
        }
        if (i2 == 22) {
            return e(selectedItemPosition, !zB);
        }
        if (i2 == 61) {
            int iF = keyEvent.isShiftPressed() ? getAdapter().f(selectedItemPosition) : getAdapter().e(selectedItemPosition);
            if (iF == -1) {
                return false;
            }
            setSelection(iF);
            return true;
        }
        if (!super.onKeyDown(i2, keyEvent)) {
            return false;
        }
        ak adapter = getAdapter();
        int selectedItemPosition2 = getSelectedItemPosition();
        if (selectedItemPosition2 == -1 || adapter.k(selectedItemPosition2)) {
            return true;
        }
        ak adapter2 = getAdapter();
        if (f(selectedItemPosition2)) {
            return true;
        }
        if (i2 != 19) {
            if (i2 == 20) {
                int numColumns = getNumColumns();
                while (true) {
                    selectedItemPosition2 += numColumns;
                    if (selectedItemPosition2 > adapter2.h()) {
                        break;
                    }
                    if (f(selectedItemPosition2)) {
                        return true;
                    }
                    numColumns = getNumColumns();
                }
            }
            return false;
        }
        int numColumns2 = getNumColumns();
        while (true) {
            selectedItemPosition2 -= numColumns2;
            if (selectedItemPosition2 < adapter2.g()) {
                return false;
            }
            if (f(selectedItemPosition2)) {
                return true;
            }
            numColumns2 = getNumColumns();
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onMeasure(int i2, int i3) {
        if (!this.f6357b) {
            super.onMeasure(i2, i3);
            return;
        }
        super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec(ViewCompat.MEASURED_SIZE_MASK, Integer.MIN_VALUE));
        getLayoutParams().height = getMeasuredHeight();
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (!(listAdapter instanceof ak)) {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), ak.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter);
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final void setSelection(int i2) {
        super.setSelection(Math.max(i2, getAdapter().b()));
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MaterialCalendarGridView(Context context) {
        this(context, null);
    }
}
