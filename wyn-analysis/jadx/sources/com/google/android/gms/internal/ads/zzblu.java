package com.google.android.gms.internal.ads;

import D6.C0392q;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.common.internal.AbstractC1732v;
import java.util.Iterator;
import java.util.List;
import q7.BinderC3877b;

/* loaded from: classes3.dex */
public final class zzblu extends RelativeLayout {
    private static final float[] zza = {5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f};
    private AnimationDrawable zzb;

    public zzblu(Context context, zzblt zzbltVar, RelativeLayout.LayoutParams layoutParams) {
        super(context);
        AbstractC1732v.i(zzbltVar);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(zza, null, null));
        shapeDrawable.getPaint().setColor(zzbltVar.zze());
        setLayoutParams(layoutParams);
        setBackground(shapeDrawable);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        if (!TextUtils.isEmpty(zzbltVar.zzb())) {
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
            TextView textView = new TextView(context);
            textView.setLayoutParams(layoutParams3);
            textView.setId(1195835393);
            textView.setTypeface(Typeface.DEFAULT);
            textView.setText(zzbltVar.zzb());
            textView.setTextColor(zzbltVar.zzf());
            textView.setTextSize(zzbltVar.zzg());
            H6.f fVar = C0392q.f2477g.f2478a;
            textView.setPadding(H6.f.b(context, 4), 0, H6.f.s(context.getResources().getDisplayMetrics(), 4), 0);
            addView(textView);
            layoutParams2.addRule(1, textView.getId());
        }
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(layoutParams2);
        imageView.setId(1195835394);
        List listZzd = zzbltVar.zzd();
        if (listZzd != null && listZzd.size() > 1) {
            this.zzb = new AnimationDrawable();
            Iterator it = listZzd.iterator();
            while (it.hasNext()) {
                try {
                    this.zzb.addFrame((Drawable) BinderC3877b.S(((zzblw) it.next()).zzb()), zzbltVar.zzh());
                } catch (Exception e7) {
                    int i5 = G6.L.f4523b;
                    H6.l.d("Error while getting drawable.", e7);
                }
            }
            imageView.setBackground(this.zzb);
        } else if (listZzd.size() == 1) {
            try {
                imageView.setImageDrawable((Drawable) BinderC3877b.S(((zzblw) listZzd.get(0)).zzb()));
            } catch (Exception e10) {
                int i10 = G6.L.f4523b;
                H6.l.d("Error while getting drawable.", e10);
            }
        }
        addView(imageView);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        AnimationDrawable animationDrawable = this.zzb;
        if (animationDrawable != null) {
            animationDrawable.start();
        }
        super.onAttachedToWindow();
    }
}
