package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.ColorUtils;
import com.waze.R;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class ad implements fi {

    /* renamed from: a, reason: collision with root package name */
    private final int[] f1042a = {R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};

    /* renamed from: b, reason: collision with root package name */
    private final int[] f1043b = {R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};

    /* renamed from: c, reason: collision with root package name */
    private final int[] f1044c = {R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, R.drawable.abc_text_cursor_material, R.drawable.abc_text_select_handle_left_mtrl, R.drawable.abc_text_select_handle_middle_mtrl, R.drawable.abc_text_select_handle_right_mtrl};

    /* renamed from: d, reason: collision with root package name */
    private final int[] f1045d = {R.drawable.abc_popup_background_mtrl_mult, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};

    /* renamed from: e, reason: collision with root package name */
    private final int[] f1046e = {R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};

    /* renamed from: f, reason: collision with root package name */
    private final int[] f1047f = {R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};

    ad() {
    }

    private static final boolean e(int[] iArr, int i2) {
        for (int i3 : iArr) {
            if (i3 == i2) {
                return true;
            }
        }
        return false;
    }

    private static final ColorStateList f(Context context, int i2) {
        int iB = fz.b(context, R.attr.colorControlHighlight);
        return new ColorStateList(new int[][]{fz.f1533a, fz.f1535c, fz.f1534b, fz.f1537e}, new int[]{fz.a(context, R.attr.colorButtonNormal), ColorUtils.compositeColors(iB, i2), ColorUtils.compositeColors(iB, i2), i2});
    }

    private static final LayerDrawable g(fj fjVar, Context context, int i2) throws Resources.NotFoundException {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i2);
        Drawable drawableC = fjVar.c(context, R.drawable.abc_star_black_48dp);
        Drawable drawableC2 = fjVar.c(context, R.drawable.abc_star_half_black_48dp);
        if ((drawableC instanceof BitmapDrawable) && drawableC.getIntrinsicWidth() == dimensionPixelSize && drawableC.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) drawableC;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawableC.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableC.draw(canvas);
            bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
            bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((drawableC2 instanceof BitmapDrawable) && drawableC2.getIntrinsicWidth() == dimensionPixelSize && drawableC2.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) drawableC2;
        } else {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
            drawableC2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableC2.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, android.R.id.background);
        layerDrawable.setId(1, android.R.id.secondaryProgress);
        layerDrawable.setId(2, android.R.id.progress);
        return layerDrawable;
    }

    private static final void h(Drawable drawable, int i2, PorterDuff.Mode mode) {
        Drawable drawableMutate = drawable.mutate();
        if (mode == null) {
            mode = ae.f1048a;
        }
        drawableMutate.setColorFilter(ae.c(i2, mode));
    }

    @Override // android.support.v7.widget.fi
    public final ColorStateList a(Context context, int i2) {
        if (i2 == R.drawable.abc_edit_text_material) {
            return ContextCompat.getColorStateList(context, R.color.abc_tint_edittext);
        }
        if (i2 == R.drawable.abc_switch_track_mtrl_alpha) {
            return ContextCompat.getColorStateList(context, R.color.abc_tint_switch_track);
        }
        if (i2 != R.drawable.abc_switch_thumb_material) {
            if (i2 == R.drawable.abc_btn_default_mtrl_shape) {
                return f(context, fz.b(context, R.attr.colorButtonNormal));
            }
            if (i2 == R.drawable.abc_btn_borderless_material) {
                return f(context, 0);
            }
            if (i2 == R.drawable.abc_btn_colored_material) {
                return f(context, fz.b(context, R.attr.colorAccent));
            }
            if (i2 == R.drawable.abc_spinner_mtrl_am_alpha || i2 == R.drawable.abc_spinner_textfield_background_material) {
                return ContextCompat.getColorStateList(context, R.color.abc_tint_spinner);
            }
            if (e(this.f1043b, i2)) {
                return fz.c(context, R.attr.colorControlNormal);
            }
            if (e(this.f1046e, i2)) {
                return ContextCompat.getColorStateList(context, R.color.abc_tint_default);
            }
            if (e(this.f1047f, i2)) {
                return ContextCompat.getColorStateList(context, R.color.abc_tint_btn_checkable);
            }
            if (i2 == R.drawable.abc_seekbar_thumb_material) {
                return ContextCompat.getColorStateList(context, R.color.abc_tint_seek_thumb);
            }
            return null;
        }
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList colorStateListC = fz.c(context, R.attr.colorSwitchThumbNormal);
        if (colorStateListC == null || !colorStateListC.isStateful()) {
            iArr[0] = fz.f1533a;
            iArr2[0] = fz.a(context, R.attr.colorSwitchThumbNormal);
            iArr[1] = fz.f1536d;
            iArr2[1] = fz.b(context, R.attr.colorControlActivated);
            iArr[2] = fz.f1537e;
            iArr2[2] = fz.b(context, R.attr.colorSwitchThumbNormal);
        } else {
            int[] iArr3 = fz.f1533a;
            iArr[0] = iArr3;
            iArr2[0] = colorStateListC.getColorForState(iArr3, 0);
            iArr[1] = fz.f1536d;
            iArr2[1] = fz.b(context, R.attr.colorControlActivated);
            iArr[2] = fz.f1537e;
            iArr2[2] = colorStateListC.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    @Override // android.support.v7.widget.fi
    public final Drawable b(fj fjVar, Context context, int i2) {
        if (i2 == R.drawable.abc_cab_background_top_material) {
            return new LayerDrawable(new Drawable[]{fjVar.c(context, R.drawable.abc_cab_background_internal_bg), fjVar.c(context, R.drawable.abc_cab_background_top_mtrl_alpha)});
        }
        if (i2 == R.drawable.abc_ratingbar_material) {
            return g(fjVar, context, R.dimen.abc_star_big);
        }
        if (i2 == R.drawable.abc_ratingbar_indicator_material) {
            return g(fjVar, context, R.dimen.abc_star_medium);
        }
        if (i2 == R.drawable.abc_ratingbar_small_material) {
            return g(fjVar, context, R.dimen.abc_star_small);
        }
        return null;
    }

    @Override // android.support.v7.widget.fi
    public final boolean c(Context context, int i2, Drawable drawable) {
        if (i2 == R.drawable.abc_seekbar_track_material) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            h(layerDrawable.findDrawableByLayerId(android.R.id.background), fz.b(context, R.attr.colorControlNormal), ae.f1048a);
            h(layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress), fz.b(context, R.attr.colorControlNormal), ae.f1048a);
            h(layerDrawable.findDrawableByLayerId(android.R.id.progress), fz.b(context, R.attr.colorControlActivated), ae.f1048a);
            return true;
        }
        if (i2 != R.drawable.abc_ratingbar_material && i2 != R.drawable.abc_ratingbar_indicator_material && i2 != R.drawable.abc_ratingbar_small_material) {
            return false;
        }
        LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
        h(layerDrawable2.findDrawableByLayerId(android.R.id.background), fz.a(context, R.attr.colorControlNormal), ae.f1048a);
        h(layerDrawable2.findDrawableByLayerId(android.R.id.secondaryProgress), fz.b(context, R.attr.colorControlActivated), ae.f1048a);
        h(layerDrawable2.findDrawableByLayerId(android.R.id.progress), fz.b(context, R.attr.colorControlActivated), ae.f1048a);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0063 A[RETURN] */
    @Override // android.support.v7.widget.fi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(android.content.Context r6, int r7, android.graphics.drawable.Drawable r8) {
        /*
            r5 = this;
            int[] r0 = r5.f1042a
            android.graphics.PorterDuff$Mode r1 = android.support.v7.widget.ae.b()
            boolean r0 = e(r0, r7)
            r2 = 0
            r3 = -1
            r4 = 1
            if (r0 == 0) goto L15
            r5 = 2130968889(0x7f040139, float:1.7546444E38)
        L12:
            r7 = r3
        L13:
            r0 = r4
            goto L4c
        L15:
            int[] r0 = r5.f1044c
            boolean r0 = e(r0, r7)
            if (r0 == 0) goto L21
            r5 = 2130968887(0x7f040137, float:1.754644E38)
            goto L12
        L21:
            int[] r5 = r5.f1045d
            boolean r5 = e(r5, r7)
            r0 = 16842801(0x1010031, float:2.3693695E-38)
            if (r5 == 0) goto L30
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.MULTIPLY
        L2e:
            r5 = r0
            goto L12
        L30:
            r5 = 2131230803(0x7f080053, float:1.807767E38)
            if (r7 != r5) goto L43
            r5 = 1109603123(0x42233333, float:40.8)
            int r5 = java.lang.Math.round(r5)
            r7 = 16842800(0x1010030, float:2.3693693E-38)
            r0 = r7
            r7 = r5
            r5 = r0
            goto L13
        L43:
            r5 = 2131230785(0x7f080041, float:1.8077633E38)
            if (r7 != r5) goto L49
            goto L2e
        L49:
            r5 = r2
            r0 = r5
            r7 = r3
        L4c:
            if (r0 == 0) goto L63
            android.graphics.drawable.Drawable r8 = r8.mutate()
            int r5 = android.support.v7.widget.fz.b(r6, r5)
            android.graphics.PorterDuffColorFilter r5 = android.support.v7.widget.ae.c(r5, r1)
            r8.setColorFilter(r5)
            if (r7 == r3) goto L62
            r8.setAlpha(r7)
        L62:
            return r4
        L63:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.ad.d(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
    }
}
