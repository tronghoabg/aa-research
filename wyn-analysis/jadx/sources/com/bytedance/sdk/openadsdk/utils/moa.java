package com.bytedance.sdk.openadsdk.utils;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes3.dex */
public class moa {

    public static class uef implements View.OnLayoutChangeListener {

        /* renamed from: oa, reason: collision with root package name */
        private int f26158oa;
        private final Drawable uef;
        private int yo;

        public uef(Drawable drawable) {
            this.uef = drawable;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i5, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
            int i17 = i11 - i5;
            int i18 = i12 - i10;
            if (i17 == this.f26158oa && i18 == this.yo) {
                return;
            }
            this.f26158oa = i17;
            this.yo = i18;
            this.uef.setBounds(0, 0, i17, i18);
        }
    }

    public static void uef(ViewGroup viewGroup, com.bytedance.sdk.openadsdk.core.model.gzw gzwVar) {
        if (viewGroup == null || gzwVar == null || TextUtils.isEmpty(gzwVar.cp())) {
            return;
        }
        try {
            int i5 = bs.jzd;
            if (viewGroup.getTag(i5) != null) {
                return;
            }
            viewGroup.setTag(i5, Integer.valueOf(i5));
            Drawable drawableUef = uef(viewGroup.getResources(), gzwVar);
            if (drawableUef == null) {
                return;
            }
            viewGroup.setForeground(drawableUef);
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.dhk.yo("add overlay fail", th.getMessage());
        }
    }

    public static void uef(Activity activity, com.bytedance.sdk.openadsdk.core.model.gzw gzwVar) {
        if (activity == null || gzwVar == null || TextUtils.isEmpty(gzwVar.cp())) {
            return;
        }
        try {
            View decorView = activity.getWindow().getDecorView();
            int i5 = bs.jzd;
            if (decorView.getTag(i5) != null) {
                return;
            }
            activity.getWindow().getDecorView().setTag(i5, Integer.valueOf(i5));
            Drawable drawableUef = uef(activity.getResources(), gzwVar);
            if (drawableUef == null) {
                return;
            }
            activity.getWindow().getDecorView().setForeground(drawableUef);
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.dhk.yo("add overlay fail", th.getMessage());
        }
    }

    private static Drawable uef(Resources resources, com.bytedance.sdk.openadsdk.core.model.gzw gzwVar) {
        try {
            String strCp = gzwVar.cp();
            if (TextUtils.isEmpty(strCp)) {
                return null;
            }
            byte[] bArrDecode = Base64.decode(strCp, 0);
            BitmapDrawable bitmapDrawable = new BitmapDrawable(resources, BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length));
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            bitmapDrawable.setTileModeXY(tileMode, tileMode);
            bitmapDrawable.setTargetDensity(resources.getDisplayMetrics());
            return bitmapDrawable;
        } catch (Throwable unused) {
            return null;
        }
    }
}
