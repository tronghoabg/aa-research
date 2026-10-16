package com.google.android.material.button;

import A.e0;
import O7.d;
import O7.e;
import O7.f;
import W7.k;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.ToggleButton;
import c8.C1577a;
import c8.C1586j;
import c8.C1587k;
import cb.AbstractC1593a;
import com.unity3d.services.UnityAdsConstants;
import com.wynauto.wyn.R;
import h8.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.WeakHashMap;
import k1.S;

/* loaded from: classes4.dex */
public class MaterialButtonToggleGroup extends LinearLayout {
    public static final /* synthetic */ int k = 0;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f26858a;

    /* renamed from: b, reason: collision with root package name */
    public final e0 f26859b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f26860c;

    /* renamed from: d, reason: collision with root package name */
    public final d f26861d;

    /* renamed from: e, reason: collision with root package name */
    public Integer[] f26862e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f26863f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f26864g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f26865h;

    /* renamed from: i, reason: collision with root package name */
    public final int f26866i;

    /* renamed from: j, reason: collision with root package name */
    public HashSet f26867j;

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, R.attr.materialButtonToggleGroupStyle, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup), attributeSet, R.attr.materialButtonToggleGroupStyle);
        this.f26858a = new ArrayList();
        this.f26859b = new e0(this, 16);
        this.f26860c = new LinkedHashSet();
        this.f26861d = new d(this, 0);
        this.f26863f = false;
        this.f26867j = new HashSet();
        TypedArray typedArrayF = k.f(getContext(), attributeSet, I7.a.f5408j, R.attr.materialButtonToggleGroupStyle, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup, new int[0]);
        setSingleSelection(typedArrayF.getBoolean(3, false));
        this.f26866i = typedArrayF.getResourceId(1, -1);
        this.f26865h = typedArrayF.getBoolean(2, false);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(typedArrayF.getBoolean(0, true));
        typedArrayF.recycle();
        WeakHashMap weakHashMap = S.f38779a;
        setImportantForAccessibility(1);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            if (c(i5)) {
                return i5;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (c(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i5 = 0;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            if ((getChildAt(i10) instanceof MaterialButton) && c(i10)) {
                i5++;
            }
        }
        return i5;
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            WeakHashMap weakHashMap = S.f38779a;
            materialButton.setId(View.generateViewId());
        }
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setOnPressedChangeListenerInternal(this.f26859b);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    public final void a() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i5 = firstVisibleChildIndex + 1; i5 < getChildCount(); i5++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i5);
            int iMin = Math.min(materialButton.getStrokeWidth(), ((MaterialButton) getChildAt(i5 - 1)).getStrokeWidth());
            ViewGroup.LayoutParams layoutParams = materialButton.getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
            if (getOrientation() == 0) {
                layoutParams2.setMarginEnd(0);
                layoutParams2.setMarginStart(-iMin);
                layoutParams2.topMargin = 0;
            } else {
                layoutParams2.bottomMargin = 0;
                layoutParams2.topMargin = -iMin;
                layoutParams2.setMarginStart(0);
            }
            materialButton.setLayoutParams(layoutParams2);
        }
        if (getChildCount() == 0 || firstVisibleChildIndex == -1) {
            return;
        }
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) ((MaterialButton) getChildAt(firstVisibleChildIndex)).getLayoutParams();
        if (getOrientation() == 1) {
            layoutParams3.topMargin = 0;
            layoutParams3.bottomMargin = 0;
        } else {
            layoutParams3.setMarginEnd(0);
            layoutParams3.setMarginStart(0);
            layoutParams3.leftMargin = 0;
            layoutParams3.rightMargin = 0;
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i5, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i5, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        setupButtonChild(materialButton);
        b(materialButton.getId(), materialButton.f26855o);
        C1587k shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.f26858a.add(new f(shapeAppearanceModel.f19766e, shapeAppearanceModel.f19769h, shapeAppearanceModel.f19767f, shapeAppearanceModel.f19768g));
        materialButton.setEnabled(isEnabled());
        S.m(materialButton, new e(this, 0));
    }

    public final void b(int i5, boolean z2) {
        if (i5 == -1) {
            AbstractC1593a.q(i5, "Button ID is not valid: ", "MButtonToggleGroup");
            return;
        }
        HashSet hashSet = new HashSet(this.f26867j);
        if (z2 && !hashSet.contains(Integer.valueOf(i5))) {
            if (this.f26864g && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i5));
        } else {
            if (z2 || !hashSet.contains(Integer.valueOf(i5))) {
                return;
            }
            if (!this.f26865h || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i5));
            }
        }
        d(hashSet);
    }

    public final boolean c(int i5) {
        return getChildAt(i5).getVisibility() != 8;
    }

    public final void d(Set set) {
        HashSet hashSet = this.f26867j;
        this.f26867j = new HashSet(set);
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            int id2 = ((MaterialButton) getChildAt(i5)).getId();
            boolean zContains = set.contains(Integer.valueOf(id2));
            View viewFindViewById = findViewById(id2);
            if (viewFindViewById instanceof MaterialButton) {
                this.f26863f = true;
                ((MaterialButton) viewFindViewById).setChecked(zContains);
                this.f26863f = false;
            }
            if (hashSet.contains(Integer.valueOf(id2)) != set.contains(Integer.valueOf(id2))) {
                set.contains(Integer.valueOf(id2));
                Iterator it = this.f26860c.iterator();
                while (it.hasNext()) {
                    ((com.google.android.material.timepicker.f) it.next()).a();
                }
            }
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.f26861d);
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            treeMap.put((MaterialButton) getChildAt(i5), Integer.valueOf(i5));
        }
        this.f26862e = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    public final void e() {
        f fVar;
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i5 = 0; i5 < childCount; i5++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i5);
            if (materialButton.getVisibility() != 8) {
                C1586j c1586jE = materialButton.getShapeAppearanceModel().e();
                f fVar2 = (f) this.f26858a.get(i5);
                if (firstVisibleChildIndex != lastVisibleChildIndex) {
                    boolean z2 = getOrientation() == 0;
                    C1577a c1577a = f.f8912e;
                    if (i5 == firstVisibleChildIndex) {
                        fVar = z2 ? k.e(this) ? new f(c1577a, c1577a, fVar2.f8914b, fVar2.f8915c) : new f(fVar2.f8913a, fVar2.f8916d, c1577a, c1577a) : new f(fVar2.f8913a, c1577a, fVar2.f8914b, c1577a);
                    } else if (i5 == lastVisibleChildIndex) {
                        fVar = z2 ? k.e(this) ? new f(fVar2.f8913a, fVar2.f8916d, c1577a, c1577a) : new f(c1577a, c1577a, fVar2.f8914b, fVar2.f8915c) : new f(c1577a, fVar2.f8916d, c1577a, fVar2.f8915c);
                    } else {
                        fVar2 = null;
                    }
                    fVar2 = fVar;
                }
                if (fVar2 == null) {
                    c1586jE.f19755e = new C1577a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    c1586jE.f19756f = new C1577a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    c1586jE.f19757g = new C1577a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    c1586jE.f19758h = new C1577a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                } else {
                    c1586jE.f19755e = fVar2.f8913a;
                    c1586jE.f19758h = fVar2.f8916d;
                    c1586jE.f19756f = fVar2.f8914b;
                    c1586jE.f19757g = fVar2.f8915c;
                }
                materialButton.setShapeAppearanceModel(c1586jE.a());
            }
        }
    }

    public int getCheckedButtonId() {
        if (!this.f26864g || this.f26867j.isEmpty()) {
            return -1;
        }
        return ((Integer) this.f26867j.iterator().next()).intValue();
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            int id2 = ((MaterialButton) getChildAt(i5)).getId();
            if (this.f26867j.contains(Integer.valueOf(id2))) {
                arrayList.add(Integer.valueOf(id2));
            }
        }
        return arrayList;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i5, int i10) {
        Integer[] numArr = this.f26862e;
        if (numArr != null && i10 < numArr.length) {
            return numArr[i10].intValue();
        }
        Log.w("MButtonToggleGroup", "Child order wasn't updated");
        return i10;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i5 = this.f26866i;
        if (i5 != -1) {
            d(Collections.singleton(Integer.valueOf(i5)));
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, getVisibleButtonCount(), false, this.f26864g ? 1 : 2));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i5, int i10) {
        e();
        a();
        super.onMeasure(i5, i10);
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int iIndexOfChild = indexOfChild(view);
        if (iIndexOfChild >= 0) {
            this.f26858a.remove(iIndexOfChild);
        }
        e();
        a();
    }

    @Override // android.view.View
    public void setEnabled(boolean z2) {
        super.setEnabled(z2);
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            ((MaterialButton) getChildAt(i5)).setEnabled(z2);
        }
    }

    public void setSelectionRequired(boolean z2) {
        this.f26865h = z2;
    }

    public void setSingleSelection(boolean z2) {
        if (this.f26864g != z2) {
            this.f26864g = z2;
            d(new HashSet());
        }
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            ((MaterialButton) getChildAt(i5)).setA11yClassName((this.f26864g ? RadioButton.class : ToggleButton.class).getName());
        }
    }

    public void setSingleSelection(int i5) {
        setSingleSelection(getResources().getBoolean(i5));
    }
}
