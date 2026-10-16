package com.vungle.ads.internal.presenter;

import A.AbstractC0213f;
import android.webkit.WebView;
import ef.C2515C;
import kotlin.jvm.internal.AbstractC3343n;

/* loaded from: classes5.dex */
public final class l extends AbstractC3343n implements tf.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f33531a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f33532b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f33533c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(r rVar, long j8, long j10) {
        super(0);
        this.f33531a = rVar;
        this.f33532b = j8;
        this.f33533c = j10;
    }

    @Override // tf.a
    public final Object invoke() {
        com.vungle.ads.internal.ui.z zVar = this.f33531a.f33543d;
        long j8 = this.f33532b;
        long j10 = this.f33533c;
        WebView webView = zVar.f33821m;
        if (webView != null) {
            StringBuilder sb2 = new StringBuilder("window.vungle.mraidBridgeExt.notifyAvailableDiskSpace(");
            sb2.append(j8);
            sb2.append('-');
            zVar.a(webView, AbstractC0213f.e(sb2, j10, ')'));
        }
        return C2515C.f34653a;
    }
}
