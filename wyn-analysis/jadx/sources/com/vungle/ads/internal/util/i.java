package com.vungle.ads.internal.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.webkit.WebView;
import ef.C2515C;
import ef.C2527k;
import ef.EnumC2526j;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;

/* loaded from: classes5.dex */
public final class i extends AbstractC3343n implements tf.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f33853a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f33854b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f33855c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(WebView webView, j jVar, int i5) {
        super(1);
        this.f33853a = webView;
        this.f33854b = jVar;
        this.f33855c = i5;
    }

    public final void a(Bitmap bitmap) {
        Context context = this.f33853a.getContext();
        AbstractC3340k.d(context, "view.context");
        ((com.vungle.ads.internal.executor.d) ((com.vungle.ads.internal.executor.a) Fe.c.y(EnumC2526j.f34667a, new h(context)).getValue())).d().execute(new Mb.b(this.f33854b, bitmap, this.f33855c));
    }

    @Override // tf.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((Bitmap) obj);
        return C2515C.f34653a;
    }

    public static final void a(j this$0, Bitmap bitmap, int i5) {
        AbstractC3340k.e(this$0, "this$0");
        try {
            C2527k c2527kA = j.a(bitmap, i5);
            int iIntValue = ((Number) c2527kA.f34671a).intValue();
            String str = (String) c2527kA.f34672b;
            tf.p pVar = this$0.f33856a;
            if (pVar != null) {
                pVar.invoke(Integer.valueOf(iIntValue), str);
            }
        } catch (Throwable th) {
            try {
                boolean z2 = u.f33874a;
                t.a("BlackScreenDetector", "Black screen detection failed", th);
                tf.p pVar2 = this$0.f33856a;
                if (pVar2 != null) {
                    pVar2.invoke(-1, "Internal calculation error: " + th.getMessage());
                }
            } finally {
                if (bitmap != null) {
                    bitmap.recycle();
                }
                this$0.f33856a = null;
            }
        }
        if (bitmap != null) {
        }
    }
}
