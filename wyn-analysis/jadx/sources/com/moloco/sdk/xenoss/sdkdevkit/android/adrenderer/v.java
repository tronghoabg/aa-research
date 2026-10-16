package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer;

import N.C0729i0;
import N.C0740o;
import android.graphics.Bitmap;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import ef.C2515C;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes4.dex */
public final class v implements t {

    /* renamed from: a, reason: collision with root package name */
    public final String f32400a;

    public v(String str) {
        this.f32400a = str;
    }

    public final void a(final V.d dVar, C0740o c0740o, final int i5) {
        int i10;
        c0740o.N(412679763);
        if ((i5 & 6) == 0) {
            i10 = (c0740o.e(dVar) ? 4 : 2) | i5;
        } else {
            i10 = i5;
        }
        if ((i5 & 48) == 0) {
            i10 |= c0740o.e(this) ? 32 : 16;
        }
        if ((i10 & 19) == 18 && c0740o.x()) {
            c0740o.I();
        } else {
            S3.f.d(this.f32400a, V.e.b(c0740o, 586795374, new com.moloco.sdk.internal.publisher.nativead.ui.d(dVar, 2)), c0740o, 48);
        }
        C0729i0 c0729i0R = c0740o.r();
        if (c0729i0R != null) {
            c0729i0R.f7788d = new tf.p() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.u
                @Override // tf.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int i11 = i5 | 1;
                    V.d dVar2 = dVar;
                    this.f32397a.a(dVar2, (C0740o) obj, i11);
                    return C2515C.f34653a;
                }
            };
        }
    }

    public final void b(View view) {
        AbstractC3340k.e(view, "view");
        Bitmap bitmapA = S3.f.a(this.f32400a);
        if (bitmapA == null) {
            return;
        }
        BitmapDrawable bitmapDrawable = new BitmapDrawable(ic.d.e(null).getResources(), bitmapA);
        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
        bitmapDrawable.setTileModeXY(tileMode, tileMode);
        bitmapDrawable.setTargetDensity(ic.d.e(null).getResources().getDisplayMetrics());
        view.setForeground(bitmapDrawable);
        view.setClickable(false);
        view.setFocusable(false);
    }
}
