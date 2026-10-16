package com.waze.utils;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.waze.ui.z.as;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static final n f44897a = new n();

    @Deprecated
    public final void a(String str, int i2, ImageView imageView, View view, Context context) {
        if (imageView != null) {
            imageView.setTag(str);
        }
        b(str, 1 == (i2 & 1), new k(this, imageView, view, (i2 & 2) != 0, str), context);
    }

    @Deprecated
    public final void b(String str, boolean z, m mVar, Context context) {
        int iH;
        int iH2;
        if (str == null || str.length() == 0) {
            mVar.a(null);
            return;
        }
        if (z) {
            iH = as.h(context.getResources(), 40);
            iH2 = as.h(context.getResources(), 40);
        } else {
            iH = as.h(context.getResources(), 160);
            iH2 = as.h(context.getResources(), 160);
        }
        i.a().e(str, new l(this, mVar), null, iH, iH2, false);
    }

    public final void c(String str, m mVar, Context context) {
        b(str, true, mVar, context);
    }
}
