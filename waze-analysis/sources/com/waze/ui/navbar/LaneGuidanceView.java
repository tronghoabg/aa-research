package com.waze.ui.navbar;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.LinearLayout;
import com.waze.gl;
import com.waze.ui.b.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class LaneGuidanceView extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    private List f43084a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f43085b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f43086c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f43087d;

    /* renamed from: e, reason: collision with root package name */
    private int f43088e;

    /* renamed from: f, reason: collision with root package name */
    private int f43089f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f43090g;

    /* renamed from: h, reason: collision with root package name */
    private final List f43091h;

    public LaneGuidanceView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f43086c = true;
        this.f43087d = true;
        this.f43088e = 0;
        this.f43089f = 0;
        this.f43091h = new ArrayList();
        setOrientation(0);
        if (isInEditMode()) {
            setBackgroundResource(R.color.black);
            e(Arrays.asList(new c(d.g(new b(-90, false))), new c(Arrays.asList(new b(-90, false), new b(0, true))), new c(d.g(new b(0, true))), new c(Arrays.asList(new b(0, true), new b(90, false)))), false, true);
        }
    }

    public static /* synthetic */ void a(LaneGuidanceView laneGuidanceView) {
        laneGuidanceView.f43091h.clear();
        laneGuidanceView.i(true);
    }

    private final int g(int i2) {
        return (int) TypedValue.applyDimension(1, i2, getResources().getDisplayMetrics());
    }

    private final void h(boolean z) {
        post(new gl(this, z, 7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0184  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(boolean r22) {
        /*
            Method dump skipped, instructions count: 443
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.ui.navbar.LaneGuidanceView.i(boolean):void");
    }

    public final void c(boolean z) {
        if (this.f43085b != z) {
            this.f43085b = z;
            h(true);
        }
    }

    public final void d(int i2) {
        if (this.f43089f != i2) {
            this.f43089f = i2;
            h(true);
        }
    }

    public final void e(List list, boolean z, boolean z2) {
        List list2 = this.f43084a;
        if (list2 == null && list == null) {
            return;
        }
        if (list2 == null || list == null || list2.size() != list.size() || !this.f43084a.equals(list)) {
            this.f43084a = list;
            this.f43090g = false;
            if (list != null && list.size() > 1) {
                int i2 = 0;
                int i3 = 0;
                for (int i4 = 0; i4 < this.f43084a.size() / 2; i4++) {
                    c cVar = (c) this.f43084a.get(i4);
                    c cVar2 = (c) this.f43084a.get((r5.size() - 1) - i4);
                    Iterator it = cVar.f43106a.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((b) it.next()).f43105b) {
                                i3++;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    Iterator it2 = cVar2.f43106a.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (((b) it2.next()).f43105b) {
                                i2++;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                this.f43090g = i2 > i3;
            }
            if (z2) {
                i(z);
            } else {
                h(z);
            }
        }
    }

    public final void f() {
        if (this.f43086c) {
            this.f43086c = false;
            h(true);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.f43088e != getMeasuredWidth()) {
            this.f43088e = getMeasuredWidth();
            h(false);
        }
    }

    public LaneGuidanceView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LaneGuidanceView(Context context) {
        this(context, null);
    }
}
