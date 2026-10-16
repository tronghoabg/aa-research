package com.google.android.exoplayer2.ui;

import E5.K0;
import F6.f;
import I4.w;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import f6.Z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import r6.p;
import s6.G;
import s6.H;

/* loaded from: classes3.dex */
public class TrackSelectionView extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public final int f26276a;

    /* renamed from: b, reason: collision with root package name */
    public final LayoutInflater f26277b;

    /* renamed from: c, reason: collision with root package name */
    public final CheckedTextView f26278c;

    /* renamed from: d, reason: collision with root package name */
    public final CheckedTextView f26279d;

    /* renamed from: e, reason: collision with root package name */
    public final f f26280e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f26281f;

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f26282g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f26283h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f26284i;

    /* renamed from: j, reason: collision with root package name */
    public G f26285j;
    public CheckedTextView[][] k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f26286l;

    public TrackSelectionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setOrientation(1);
        setSaveFromParentEnabled(false);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.selectableItemBackground});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        this.f26276a = resourceId;
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        this.f26277b = layoutInflaterFrom;
        f fVar = new f(this, 6);
        this.f26280e = fVar;
        this.f26285j = new w(getResources(), 1);
        this.f26281f = new ArrayList();
        this.f26282g = new HashMap();
        CheckedTextView checkedTextView = (CheckedTextView) layoutInflaterFrom.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.f26278c = checkedTextView;
        checkedTextView.setBackgroundResource(resourceId);
        checkedTextView.setText(com.wynauto.wyn.R.string.exo_track_selection_none);
        checkedTextView.setEnabled(false);
        checkedTextView.setFocusable(true);
        checkedTextView.setOnClickListener(fVar);
        checkedTextView.setVisibility(8);
        addView(checkedTextView);
        addView(layoutInflaterFrom.inflate(com.wynauto.wyn.R.layout.exo_list_divider, (ViewGroup) this, false));
        CheckedTextView checkedTextView2 = (CheckedTextView) layoutInflaterFrom.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.f26279d = checkedTextView2;
        checkedTextView2.setBackgroundResource(resourceId);
        checkedTextView2.setText(com.wynauto.wyn.R.string.exo_track_selection_auto);
        checkedTextView2.setEnabled(false);
        checkedTextView2.setFocusable(true);
        checkedTextView2.setOnClickListener(fVar);
        addView(checkedTextView2);
    }

    public final void a() {
        this.f26278c.setChecked(this.f26286l);
        boolean z2 = this.f26286l;
        HashMap map = this.f26282g;
        this.f26279d.setChecked(!z2 && map.size() == 0);
        for (int i5 = 0; i5 < this.k.length; i5++) {
            p pVar = (p) map.get(((K0) this.f26281f.get(i5)).f3130b);
            int i10 = 0;
            while (true) {
                CheckedTextView[] checkedTextViewArr = this.k[i5];
                if (i10 < checkedTextViewArr.length) {
                    if (pVar != null) {
                        Object tag = checkedTextViewArr[i10].getTag();
                        tag.getClass();
                        this.k[i5][i10].setChecked(pVar.f44467b.contains(Integer.valueOf(((H) tag).f45113b)));
                    } else {
                        checkedTextViewArr[i10].setChecked(false);
                    }
                    i10++;
                }
            }
        }
    }

    public final void b() {
        for (int childCount = getChildCount() - 1; childCount >= 3; childCount--) {
            removeViewAt(childCount);
        }
        ArrayList arrayList = this.f26281f;
        boolean zIsEmpty = arrayList.isEmpty();
        CheckedTextView checkedTextView = this.f26279d;
        CheckedTextView checkedTextView2 = this.f26278c;
        if (zIsEmpty) {
            checkedTextView2.setEnabled(false);
            checkedTextView.setEnabled(false);
            return;
        }
        checkedTextView2.setEnabled(true);
        checkedTextView.setEnabled(true);
        this.k = new CheckedTextView[arrayList.size()][];
        boolean z2 = this.f26284i && arrayList.size() > 1;
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            K0 k02 = (K0) arrayList.get(i5);
            boolean z10 = this.f26283h && k02.f3131c;
            CheckedTextView[][] checkedTextViewArr = this.k;
            int i10 = k02.f3129a;
            checkedTextViewArr[i5] = new CheckedTextView[i10];
            H[] hArr = new H[i10];
            for (int i11 = 0; i11 < k02.f3129a; i11++) {
                hArr[i11] = new H(k02, i11);
            }
            for (int i12 = 0; i12 < i10; i12++) {
                LayoutInflater layoutInflater = this.f26277b;
                if (i12 == 0) {
                    addView(layoutInflater.inflate(com.wynauto.wyn.R.layout.exo_list_divider, (ViewGroup) this, false));
                }
                CheckedTextView checkedTextView3 = (CheckedTextView) layoutInflater.inflate((z10 || z2) ? R.layout.simple_list_item_multiple_choice : R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
                checkedTextView3.setBackgroundResource(this.f26276a);
                G g9 = this.f26285j;
                H h10 = hArr[i12];
                checkedTextView3.setText(((w) g9).c(h10.f45112a.f3130b.f35020d[h10.f45113b]));
                checkedTextView3.setTag(hArr[i12]);
                if (k02.f3132d[i12] != 4) {
                    checkedTextView3.setFocusable(false);
                    checkedTextView3.setEnabled(false);
                } else {
                    checkedTextView3.setFocusable(true);
                    checkedTextView3.setOnClickListener(this.f26280e);
                }
                this.k[i5][i12] = checkedTextView3;
                addView(checkedTextView3);
            }
        }
        a();
    }

    public boolean getIsDisabled() {
        return this.f26286l;
    }

    public Map<Z, p> getOverrides() {
        return this.f26282g;
    }

    public void setAllowAdaptiveSelections(boolean z2) {
        if (this.f26283h != z2) {
            this.f26283h = z2;
            b();
        }
    }

    public void setAllowMultipleOverrides(boolean z2) {
        if (this.f26284i != z2) {
            this.f26284i = z2;
            if (!z2) {
                HashMap map = this.f26282g;
                if (map.size() > 1) {
                    ArrayList arrayList = this.f26281f;
                    HashMap map2 = new HashMap();
                    for (int i5 = 0; i5 < arrayList.size(); i5++) {
                        p pVar = (p) map.get(((K0) arrayList.get(i5)).f3130b);
                        if (pVar != null && map2.isEmpty()) {
                            map2.put(pVar.f44466a, pVar);
                        }
                    }
                    map.clear();
                    map.putAll(map2);
                }
            }
            b();
        }
    }

    public void setShowDisableOption(boolean z2) {
        this.f26278c.setVisibility(z2 ? 0 : 8);
    }

    public void setTrackNameProvider(G g9) {
        g9.getClass();
        this.f26285j = g9;
        b();
    }
}
