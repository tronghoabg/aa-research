package com.waze.design_components.f;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.support.v7.widget.SwitchCompat;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.widget.CompoundButtonCompat;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class a extends SwitchCompat {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context) {
        super(context, null);
        x.f(context, "context");
        int[][] iArr = {new int[]{-16842912}, new int[]{R.attr.state_checked}};
        int[] iArr2 = {ContextCompat.getColor(getContext(), com.waze.R.color.content_p3), ContextCompat.getColor(getContext(), com.waze.R.color.primary_variant)};
        int[] iArr3 = {ContextCompat.getColor(getContext(), com.waze.R.color.hairline), ContextCompat.getColor(getContext(), com.waze.R.color.primary_variant_negative)};
        CompoundButtonCompat.setButtonTintList(this, new ColorStateList(iArr, iArr2));
        DrawableCompat.setTintList(a(), new ColorStateList(iArr, iArr2));
        DrawableCompat.setTintList(b(), new ColorStateList(iArr, iArr3));
    }
}
