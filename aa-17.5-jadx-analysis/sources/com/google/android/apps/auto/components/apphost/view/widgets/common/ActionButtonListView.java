package com.google.android.apps.auto.components.apphost.view.widgets.common;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.projection.gearhead.R;
import defpackage.ajhf;
import defpackage.gea;
import defpackage.geu;
import defpackage.hls;
import defpackage.kdv;
import defpackage.yph;
import java.util.List;

/* loaded from: classes2.dex */
public class ActionButtonListView extends LinearLayout {
    private static final yph b = yph.c("CarApp.H.Tem");
    private static final hls c = new hls(true, false, false);
    public gea a;
    private final int d;
    private final int e;
    private final int f;
    private final boolean g;
    private boolean h;

    public ActionButtonListView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{R.attr.templateActionButtonMargin, R.attr.templateActionButtonVerticalMargin, R.attr.templateActionButtonInset});
        this.d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0);
        this.e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(2, 0);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, kdv.a, i, i2);
        this.h = typedArrayObtainStyledAttributes2.getBoolean(0, false);
        this.g = typedArrayObtainStyledAttributes2.getBoolean(1, false);
        typedArrayObtainStyledAttributes2.recycle();
        this.a = new gea(BitmapDescriptorFactory.HUE_RED, gea.a);
    }

    public final void a(geu geuVar, List list, int i) {
        ajhf ajhfVar = new ajhf(null);
        ajhfVar.c = i;
        ajhfVar.b = true;
        ajhfVar.d();
        b(geuVar, list, ajhfVar.c());
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x009a A[EDGE_INSN: B:105:0x009a->B:24:0x009a BREAK  A[LOOP:2: B:18:0x0085->B:106:?]] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(defpackage.geu r20, java.util.List r21, defpackage.hlr r22) {
        /*
            Method dump skipped, instructions count: 600
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.auto.components.apphost.view.widgets.common.ActionButtonListView.b(geu, java.util.List, hlr):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        gea geaVar = this.a;
        if (geaVar != null) {
            geaVar.a();
        }
    }

    @Override // android.view.View
    protected final void onVisibilityChanged(View view, int i) {
        gea geaVar;
        super.onVisibilityChanged(view, i);
        if (i == 0 || (geaVar = this.a) == null) {
            return;
        }
        geaVar.a();
    }

    public ActionButtonListView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionButtonListView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public ActionButtonListView(Context context) {
        this(context, null);
    }
}
