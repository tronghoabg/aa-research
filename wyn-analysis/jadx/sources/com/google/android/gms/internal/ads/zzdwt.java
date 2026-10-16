package com.google.android.gms.internal.ads;

import G6.C0546j;
import android.content.Context;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class zzdwt extends FrameLayout {
    private final C0546j zza;

    public zzdwt(Context context, View view, C0546j c0546j) {
        super(context);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(view);
        this.zza = c0546j;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.zza.a(motionEvent);
        return false;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViews() {
        ArrayList arrayList = new ArrayList();
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            KeyEvent.Callback childAt = getChildAt(i5);
            if (childAt instanceof zzclb) {
                arrayList.add((zzclb) childAt);
            }
        }
        super.removeAllViews();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((zzclb) arrayList.get(i10)).destroy();
        }
    }
}
