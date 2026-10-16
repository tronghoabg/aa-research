package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class jc {
    public final int[] a = {2131230958, 2131230956, 2131230882};
    public final int[] b = {2131230906, com.google.android.projection.gearhead.R.drawable.abc_seekbar_tick_mark_material, com.google.android.projection.gearhead.R.drawable.abc_ic_menu_share_mtrl_alpha, com.google.android.projection.gearhead.R.drawable.abc_ic_menu_copy_mtrl_am_alpha, com.google.android.projection.gearhead.R.drawable.abc_ic_menu_cut_mtrl_alpha, com.google.android.projection.gearhead.R.drawable.abc_ic_menu_selectall_mtrl_alpha, com.google.android.projection.gearhead.R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
    public final int[] c = {2131230955, 2131230957, 2131230899, com.google.android.projection.gearhead.R.drawable.abc_text_cursor_material, 2131230952, 2131230953, 2131230954};
    public final int[] d = {2131230931, com.google.android.projection.gearhead.R.drawable.abc_cab_background_internal_bg, 2131230930};
    public final int[] e = {com.google.android.projection.gearhead.R.drawable.abc_tab_indicator_material, com.google.android.projection.gearhead.R.drawable.abc_textfield_search_material};
    public final int[] f = {com.google.android.projection.gearhead.R.drawable.abc_btn_check_material, com.google.android.projection.gearhead.R.drawable.abc_btn_radio_material, com.google.android.projection.gearhead.R.drawable.abc_btn_check_material_anim, com.google.android.projection.gearhead.R.drawable.abc_btn_radio_material_anim};

    public static final boolean a(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static final android.content.res.ColorStateList b(android.content.Context context, int i) {
        int iB = defpackage.ne.b(context, com.google.android.projection.gearhead.R.attr.colorControlHighlight);
        return new android.content.res.ColorStateList(new int[][]{defpackage.ne.a, defpackage.ne.c, defpackage.ne.b, defpackage.ne.e}, new int[]{defpackage.ne.a(context, com.google.android.projection.gearhead.R.attr.colorButtonNormal), defpackage.dvk.d(iB, i), defpackage.dvk.d(iB, i), i});
    }

    public static final android.graphics.drawable.LayerDrawable c(defpackage.mu muVar, android.content.Context context, int i) {
        android.graphics.drawable.BitmapDrawable bitmapDrawable;
        android.graphics.drawable.BitmapDrawable bitmapDrawable2;
        android.graphics.drawable.BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
        android.graphics.drawable.Drawable drawableC = muVar.c(context, com.google.android.projection.gearhead.R.drawable.abc_star_black_48dp);
        android.graphics.drawable.Drawable drawableC2 = muVar.c(context, com.google.android.projection.gearhead.R.drawable.abc_star_half_black_48dp);
        if ((drawableC instanceof android.graphics.drawable.BitmapDrawable) && drawableC.getIntrinsicWidth() == dimensionPixelSize && drawableC.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (android.graphics.drawable.BitmapDrawable) drawableC;
            bitmapDrawable2 = new android.graphics.drawable.BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, android.graphics.Bitmap.Config.ARGB_8888);
            android.graphics.Canvas canvas = new android.graphics.Canvas(bitmapCreateBitmap);
            drawableC.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableC.draw(canvas);
            bitmapDrawable = new android.graphics.drawable.BitmapDrawable(bitmapCreateBitmap);
            bitmapDrawable2 = new android.graphics.drawable.BitmapDrawable(bitmapCreateBitmap);
        }
        bitmapDrawable2.setTileModeX(android.graphics.Shader.TileMode.REPEAT);
        if ((drawableC2 instanceof android.graphics.drawable.BitmapDrawable) && drawableC2.getIntrinsicWidth() == dimensionPixelSize && drawableC2.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (android.graphics.drawable.BitmapDrawable) drawableC2;
        } else {
            android.graphics.Bitmap bitmapCreateBitmap2 = android.graphics.Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, android.graphics.Bitmap.Config.ARGB_8888);
            android.graphics.Canvas canvas2 = new android.graphics.Canvas(bitmapCreateBitmap2);
            drawableC2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableC2.draw(canvas2);
            bitmapDrawable3 = new android.graphics.drawable.BitmapDrawable(bitmapCreateBitmap2);
        }
        android.graphics.drawable.LayerDrawable layerDrawable = new android.graphics.drawable.LayerDrawable(new android.graphics.drawable.Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, android.R.id.background);
        layerDrawable.setId(1, android.R.id.secondaryProgress);
        layerDrawable.setId(2, android.R.id.progress);
        return layerDrawable;
    }

    public static final void d(android.graphics.drawable.Drawable drawable, int i, android.graphics.PorterDuff.Mode mode) {
        android.graphics.drawable.Drawable drawableMutate = drawable.mutate();
        if (mode == null) {
            mode = defpackage.jd.a;
        }
        drawableMutate.setColorFilter(defpackage.jd.b(i, mode));
    }
}
