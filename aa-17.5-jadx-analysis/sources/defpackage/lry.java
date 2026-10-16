package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import com.google.android.projection.gearhead.R;

/* loaded from: classes.dex */
public final /* synthetic */ class lry implements afec {
    private final /* synthetic */ int a;

    public /* synthetic */ lry(int i) {
        this.a = i;
    }

    @Override // defpackage.afec
    public final Object invoke(Object obj) {
        int i = this.a;
        if (i == 0) {
            boolean z = ((loj) obj) instanceof lor;
            yph yphVar = lsc.a;
            return Boolean.valueOf(z);
        }
        if (i == 1) {
            boolean z2 = ((loj) obj) instanceof lor;
            yph yphVar2 = lsc.a;
            return Boolean.valueOf(z2);
        }
        if (i == 2) {
            yph yphVar3 = lsc.a;
            return roc.az((lol) obj);
        }
        if (i == 3) {
            return roc.az((lol) obj);
        }
        if (i == 4) {
            lmd lmdVar = (lmd) obj;
            lmdVar.getClass();
            return lmdVar.h().S();
        }
        if (i == 5) {
            lmd lmdVar2 = (lmd) obj;
            lmdVar2.getClass();
            afbt afbtVar = new afbt(10);
            if (lmdVar2.O("android.media.extra.DOWNLOAD_STATUS") == 2) {
                afbtVar.add(Integer.valueOf(R.drawable.gs_offline_pin_vd_theme_24));
            }
            if (lmdVar2.O("android.media.IS_EXPLICIT") == 1) {
                afbtVar.add(Integer.valueOf(R.drawable.gs_explicit_fill1_vd_theme_24));
            }
            return afbtVar.f();
        }
        lmd lmdVar3 = (lmd) obj;
        lmdVar3.getClass();
        Uri uriB = ljt.b(lmdVar3);
        Bitmap bitmapA = ljt.a(lmdVar3);
        CharSequence charSequenceQ = lmdVar3.h().Q();
        if (charSequenceQ == null || afyh.v(charSequenceQ)) {
            charSequenceQ = null;
        }
        return new gjo(uriB, bitmapA, charSequenceQ);
    }
}
