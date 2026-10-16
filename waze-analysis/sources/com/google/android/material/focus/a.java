package com.google.android.material.focus;

import android.util.FloatProperty;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class a extends FloatProperty {
    a() {
        super("interpolation");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return Float.valueOf(((FocusRingDrawable) obj).o);
    }

    public final /* bridge */ /* synthetic */ void setValue(Object obj, float f2) {
        FocusRingDrawable focusRingDrawable = (FocusRingDrawable) obj;
        focusRingDrawable.o = f2;
        focusRingDrawable.invalidateSelf();
    }
}
