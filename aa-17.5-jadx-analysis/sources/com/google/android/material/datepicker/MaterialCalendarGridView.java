package com.google.android.material.datepicker;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import com.google.android.material.datepicker.MaterialCalendarGridView;
import com.google.android.material.focus.FocusRingDrawable;
import defpackage.dzi;
import defpackage.ebm;
import defpackage.wnq;
import defpackage.wnr;
import defpackage.woa;
import defpackage.woc;
import defpackage.wod;
import defpackage.woh;
import defpackage.woq;
import defpackage.woy;
import defpackage.ykd;
import java.util.Calendar;

/* loaded from: classes3.dex */
public final class MaterialCalendarGridView extends GridView {
    public ykd a;
    private final Calendar b;
    private final boolean c;

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = woq.e(null);
        if (wod.o(getContext(), R.attr.windowFullscreen)) {
            setNextFocusLeftId(com.google.android.projection.gearhead.R.id.cancel_button);
            setNextFocusRightId(com.google.android.projection.gearhead.R.id.confirm_button);
        }
        this.c = wod.o(getContext(), com.google.android.projection.gearhead.R.attr.nestedScrollable);
        ebm.o(this, new woc());
    }

    private static int b(View view) {
        return view.getLeft() + (view.getWidth() / 2);
    }

    private final View c(int i) {
        return getChildAt(i - getFirstVisiblePosition());
    }

    private final boolean d(int i, boolean z) {
        ykd ykdVar;
        ykd ykdVar2;
        int iC = z ? getAdapter().c(i) : getAdapter().d(i);
        if (iC != -1) {
            setSelection(iC);
            return true;
        }
        if (!z && (ykdVar2 = this.a) != null) {
            return ((woa) ykdVar2.a).g(false);
        }
        if (!z || (ykdVar = this.a) == null) {
            return true;
        }
        return ((woa) ykdVar.a).g(true);
    }

    private final boolean e(int i) {
        woh adapter = getAdapter();
        if (!adapter.i(i)) {
            long itemId = adapter.getItemId(i);
            for (int i2 = 1; i2 < adapter.c.d; i2++) {
                int i3 = i + i2;
                if ((i3 < woh.b && adapter.getItemId(i3) == itemId && adapter.i(i3)) || ((i3 = i - i2) >= 0 && adapter.getItemId(i3) == itemId && adapter.i(i3))) {
                    i = i3;
                    break;
                }
            }
            i = -1;
        }
        if (i == -1) {
            return false;
        }
        setSelection(i);
        return true;
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final woh getAdapter() {
        return (woh) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter().notifyDataSetChanged();
        post(new Runnable() { // from class: wob
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, wui] */
            @Override // java.lang.Runnable
            public final void run() {
                MaterialCalendarGridView materialCalendarGridView = this.a;
                woh adapter = materialCalendarGridView.getAdapter();
                Drawable selector = materialCalendarGridView.getSelector();
                if (selector instanceof FocusRingDrawable) {
                    return;
                }
                Drawable drawableA = FocusRingDrawable.a(materialCalendarGridView.getContext(), selector);
                if (drawableA instanceof FocusRingDrawable) {
                    FocusRingDrawable focusRingDrawable = (FocusRingDrawable) drawableA;
                    wnr wnrVar = adapter.f;
                    if (wnrVar != null) {
                        focusRingDrawable.e(wnrVar.a.f);
                    }
                    materialCalendarGridView.setDrawSelectorOnTop(true);
                    materialCalendarGridView.setSelector(focusRingDrawable);
                }
            }
        });
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        Object obj;
        int iE;
        int iB;
        int iE2;
        int iB2;
        int i;
        int width;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        woh adapter = materialCalendarGridView.getAdapter();
        DateSelector dateSelector = adapter.d;
        wnr wnrVar = adapter.f;
        int iMax = Math.max(adapter.e(), materialCalendarGridView.getFirstVisiblePosition());
        int iMin = Math.min(adapter.f(), materialCalendarGridView.getLastVisiblePosition());
        Long item = adapter.getItem(iMax);
        Long item2 = adapter.getItem(iMin);
        for (dzi dziVar : dateSelector.b()) {
            Object obj2 = dziVar.a;
            if (obj2 == null || (obj = dziVar.b) == null) {
                materialCalendarGridView = this;
            } else {
                Long l = (Long) obj2;
                long jLongValue = l.longValue();
                Long l2 = (Long) obj;
                long jLongValue2 = l2.longValue();
                if (item == null || item2 == null || l.longValue() > item2.longValue() || l2.longValue() < item.longValue()) {
                    materialCalendarGridView = this;
                    iMax = iMax;
                    iMin = iMin;
                    adapter = adapter;
                } else {
                    boolean zJ = woy.J(materialCalendarGridView);
                    if (jLongValue < item.longValue()) {
                        if (iMax % adapter.c.d == 0) {
                            iB = 0;
                        } else {
                            int i2 = iMax - 1;
                            iB = !zJ ? materialCalendarGridView.c(i2).getRight() : materialCalendarGridView.c(i2).getLeft();
                        }
                        iE = iMax;
                    } else {
                        materialCalendarGridView.b.setTimeInMillis(jLongValue);
                        iE = adapter.e() + (r9.get(5) - 1);
                        iB = b(materialCalendarGridView.c(iE));
                    }
                    if (jLongValue2 > item2.longValue()) {
                        iB2 = (iMin + 1) % adapter.c.d == 0 ? materialCalendarGridView.getWidth() : !zJ ? materialCalendarGridView.c(iMin).getRight() : materialCalendarGridView.c(iMin).getLeft();
                        iE2 = iMin;
                    } else {
                        materialCalendarGridView.b.setTimeInMillis(jLongValue2);
                        iE2 = adapter.e() + (r11.get(5) - 1);
                        iB2 = b(materialCalendarGridView.c(iE2));
                    }
                    int itemId = (int) adapter.getItemId(iE);
                    int i3 = iMax;
                    int i4 = iMin;
                    int itemId2 = (int) adapter.getItemId(iE2);
                    while (itemId <= itemId2) {
                        int numColumns = materialCalendarGridView.getNumColumns() * itemId;
                        int numColumns2 = (numColumns + materialCalendarGridView.getNumColumns()) - 1;
                        View viewC = materialCalendarGridView.c(numColumns);
                        int top = viewC.getTop();
                        wnq wnqVar = wnrVar.a;
                        int iB3 = top + wnqVar.b();
                        woh wohVar = adapter;
                        int bottom = viewC.getBottom() - wnqVar.a();
                        if (zJ) {
                            int i5 = iE2 > numColumns2 ? 0 : iB2;
                            if (numColumns > iE) {
                                int i6 = i5;
                                width = getWidth();
                                i = i6;
                            } else {
                                i = i5;
                                width = iB;
                            }
                        } else {
                            i = numColumns > iE ? 0 : iB;
                            width = iE2 > numColumns2 ? getWidth() : iB2;
                        }
                        canvas.drawRect(i, iB3, width, bottom, wnrVar.h);
                        itemId++;
                        materialCalendarGridView = this;
                        adapter = wohVar;
                    }
                    materialCalendarGridView = this;
                    iMax = i3;
                    iMin = i4;
                }
            }
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    protected final void onFocusChanged(boolean z, int i, Rect rect) {
        int iB;
        if (!z) {
            super.onFocusChanged(false, i, rect);
            return;
        }
        if (i == 33 || i == 1) {
            iB = getAdapter().b();
        } else if (i == 130) {
            iB = getAdapter().a();
        } else if (i == 2) {
            i = 2;
            iB = getAdapter().a();
        } else {
            iB = -1;
        }
        if (iB != -1) {
            setSelection(iB);
        } else {
            super.onFocusChanged(true, i, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        int selectedItemPosition = getSelectedItemPosition();
        if (selectedItemPosition == -1) {
            return super.onKeyDown(i, keyEvent);
        }
        boolean zJ = woy.J(this);
        if (i == 21) {
            return d(selectedItemPosition, zJ);
        }
        if (i == 22) {
            return d(selectedItemPosition, !zJ);
        }
        if (i == 61) {
            int iD = keyEvent.isShiftPressed() ? getAdapter().d(selectedItemPosition) : getAdapter().c(selectedItemPosition);
            if (iD == -1) {
                return false;
            }
            setSelection(iD);
            return true;
        }
        if (!super.onKeyDown(i, keyEvent)) {
            return false;
        }
        woh adapter = getAdapter();
        int selectedItemPosition2 = getSelectedItemPosition();
        if (selectedItemPosition2 == -1 || adapter.i(selectedItemPosition2)) {
            return true;
        }
        woh adapter2 = getAdapter();
        if (e(selectedItemPosition2)) {
            return true;
        }
        if (i != 19) {
            if (i == 20) {
                int numColumns = getNumColumns();
                while (true) {
                    selectedItemPosition2 += numColumns;
                    if (selectedItemPosition2 > adapter2.f()) {
                        break;
                    }
                    if (e(selectedItemPosition2)) {
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
            if (selectedItemPosition2 < adapter2.e()) {
                return false;
            }
            if (e(selectedItemPosition2)) {
                return true;
            }
            numColumns2 = getNumColumns();
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onMeasure(int i, int i2) {
        if (!this.c) {
            super.onMeasure(i, i2);
            return;
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
        getLayoutParams().height = getMeasuredHeight();
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (!(listAdapter instanceof woh)) {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), woh.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter);
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final void setSelection(int i) {
        super.setSelection(Math.max(i, getAdapter().a()));
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MaterialCalendarGridView(Context context) {
        this(context, null);
    }
}
