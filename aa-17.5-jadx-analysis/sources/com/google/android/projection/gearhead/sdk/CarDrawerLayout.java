package com.google.android.projection.gearhead.sdk;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewGroup;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.projection.gearhead.R;
import defpackage.ajll;
import defpackage.moj;
import defpackage.oct;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes3.dex */
public class CarDrawerLayout extends DrawerLayout {
    private final Set k;
    private final oct l;
    private final oct m;

    public CarDrawerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.k = new HashSet();
        float[] fArr = moj.a;
        this.l = new oct(new moj(fArr, 0.25f, 0.5f), (byte[]) null);
        this.m = new oct(new moj(fArr, 0.625f, 0.125f), (byte[]) null);
        h(1);
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout, android.view.View
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if (s()) {
            motionEvent.getAction();
        }
        return super.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        s();
        return findViewById(R.id.container).dispatchKeyEvent(keyEvent);
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout
    public final void k(int i) {
        super.k((i & 16777215) | (((int) ((i >>> 24) * 0.8f)) << 24));
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.l.e(BitmapDescriptorFactory.HUE_RED);
        Iterator it = this.k.iterator();
        if (!it.hasNext()) {
            float fE = this.m.e(BitmapDescriptorFactory.HUE_RED);
            ViewGroup viewGroup = (ViewGroup) findViewById(R.id.drawer);
            int childCount = viewGroup.getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                viewGroup.getChildAt(i5).setAlpha(fE);
            }
            return;
        }
        ajll ajllVar = (ajll) it.next();
        int i6 = ajllVar.b;
        int i7 = ajllVar.a;
        Color.alpha(0);
        Color.alpha(0);
        Color.red(0);
        Color.red(0);
        Color.green(0);
        Color.green(0);
        Color.blue(0);
        Color.blue(0);
        Object obj = ajllVar.c;
        throw null;
    }

    public CarDrawerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CarDrawerLayout(Context context) {
        this(context, null);
    }
}
