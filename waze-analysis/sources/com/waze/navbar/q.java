package com.waze.navbar;

import android.graphics.Bitmap;
import android.text.SpannableStringBuilder;
import com.waze.map.gl;
import com.waze.navigate.ed;
import com.waze.navigate.ee;
import com.waze.ui.z.as;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public static final int f30914a = as.f(40);

    /* renamed from: b, reason: collision with root package name */
    public static final int f30915b = as.f(40);

    public static /* synthetic */ SpannableStringBuilder a(ee eeVar, boolean z, int i2, int i3, Integer num, h.g.a.l lVar, int i4) {
        gl glVar = new gl(16);
        x.f(glVar, "bitmapProvider");
        x.f(lVar, "imageSpanFactory");
        if (eeVar == null) {
            return new SpannableStringBuilder("");
        }
        h.k kVarE = com.waze.map.isolated.k.e(eeVar, z);
        String str = (String) kVarE.a();
        List<r> list = (List) kVarE.b();
        if (str == null) {
            str = "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        for (r rVar : list) {
            if (rVar.b() >= eeVar.d().size()) {
                return new SpannableStringBuilder("");
            }
            ed edVar = (ed) eeVar.d().get(rVar.b());
            Bitmap bitmapCreateScaledBitmap = (Bitmap) glVar.invoke(edVar.b());
            if (bitmapCreateScaledBitmap == null) {
                bitmapCreateScaledBitmap = null;
            } else if (i2 > 0 || i3 > 0) {
                Integer num2 = (i4 & 16) == 0 ? num : null;
                if (num2 != null) {
                    bitmapCreateScaledBitmap.setDensity(num2.intValue());
                }
                bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapCreateScaledBitmap, i3, i2, true);
            }
            if (bitmapCreateScaledBitmap == null) {
                com.waze.shared_infra.i.h.a("Resource " + edVar.b() + " doesn't exist");
                return new SpannableStringBuilder("");
            }
            spannableStringBuilder.setSpan(lVar.invoke(bitmapCreateScaledBitmap), rVar.c(), rVar.a(), 33);
        }
        return spannableStringBuilder;
    }
}
