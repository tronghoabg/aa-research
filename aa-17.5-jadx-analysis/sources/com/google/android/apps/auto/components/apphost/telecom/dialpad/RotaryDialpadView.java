package com.google.android.apps.auto.components.apphost.telecom.dialpad;

import android.content.Context;
import android.os.Handler;
import android.util.ArrayMap;
import android.util.AttributeSet;
import android.view.WindowInsets;
import android.widget.TextView;
import com.google.android.apps.auto.components.support.CarRestrictedEditText;
import com.google.android.apps.auto.sdk.ui.MaxWidthLayout;
import com.google.android.projection.gearhead.R;
import defpackage.ebf;
import defpackage.iol;
import defpackage.jzq;
import defpackage.jzv;
import defpackage.jzw;
import defpackage.ntb;
import defpackage.odl;
import defpackage.odn;
import defpackage.odz;
import defpackage.ohs;
import defpackage.oll;
import defpackage.olm;
import defpackage.yph;
import defpackage.yzy;
import defpackage.yzz;
import java.util.List;

/* loaded from: classes2.dex */
public class RotaryDialpadView extends MaxWidthLayout implements jzq {
    public static final yph a = yph.c("GH.RotaryDialpadView");
    public static final ArrayMap b;
    public final StringBuilder c;
    public final Object d;
    public long e;
    private CarRestrictedEditText g;
    private TextView h;

    static {
        ArrayMap arrayMap = new ArrayMap();
        b = arrayMap;
        arrayMap.put('1', 1);
        arrayMap.put('2', 2);
        arrayMap.put('3', 3);
        arrayMap.put('4', 4);
        arrayMap.put('5', 5);
        arrayMap.put('6', 6);
        arrayMap.put('7', 7);
        arrayMap.put('8', 8);
        arrayMap.put('9', 9);
        arrayMap.put('0', 0);
        arrayMap.put('*', 10);
        arrayMap.put('#', 11);
    }

    public RotaryDialpadView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = new StringBuilder(20);
        this.d = new Object();
        new Handler();
        new odl("GH.RotaryDialpadView", new jzw(this));
        int i = iol.a;
        olm.a();
        new oll(context, new jzv(this, 0));
    }

    public final void a() {
        this.h.setText(odn.a().r(getContext(), this.c.toString()));
    }

    @Override // defpackage.jzq
    public final String b() {
        throw null;
    }

    @Override // defpackage.jzq
    public final void c(List list) {
        throw null;
    }

    @Override // defpackage.jzq
    public final void d(String str) {
        throw null;
    }

    public final void e() {
        StringBuilder sb = this.c;
        if (sb.length() > 0) {
            ohs ohsVarJ = ebf.j();
            yzz yzzVar = yzz.PHONE_DIALPAD;
            ohsVarJ.o(yzzVar, yzy.Q);
            if (sb.toString().equals(null)) {
                ebf.j().o(yzzVar, yzy.Y);
            }
            ebf.A().p(sb.toString());
        }
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        setPadding(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        return windowInsets.consumeSystemWindowInsets();
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        getContext();
        this.h = (TextView) findViewById(R.id.number);
        this.g = (CarRestrictedEditText) findViewById(R.id.edit_text);
        this.h.setHint(R.string.dial_a_number);
        this.g.getInputExtras(true).putInt("dialpad_type", 0);
        this.g.a = new odz(this, 1);
        this.h.setOnClickListener(new ntb(1));
    }
}
