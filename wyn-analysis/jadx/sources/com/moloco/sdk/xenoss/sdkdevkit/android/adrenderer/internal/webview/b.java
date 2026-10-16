package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview;

import Hf.InterfaceC0592c0;
import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.O;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.C2048i;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.v;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes4.dex */
public final /* synthetic */ class b implements tf.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32276a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f32277b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f32278c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0592c0 f32279d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tf.l f32280e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ v f32281f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ tf.a f32282g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ tf.a f32283h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ WebView f32284i;

    public /* synthetic */ b(int i5, InterfaceC0592c0 interfaceC0592c0, O o7, f fVar, v vVar, tf.a aVar, tf.a aVar2, tf.l lVar) {
        this.f32277b = fVar;
        this.f32284i = o7;
        this.f32278c = i5;
        this.f32279d = interfaceC0592c0;
        this.f32280e = lVar;
        this.f32281f = vVar;
        this.f32282g = aVar;
        this.f32283h = aVar2;
    }

    @Override // tf.l
    public final Object invoke(Object obj) {
        switch (this.f32276a) {
            case 0:
                Context it = (Context) obj;
                AbstractC3340k.e(it, "it");
                Integer numValueOf = Integer.valueOf(this.f32278c);
                tf.a aVar = this.f32283h;
                InterfaceC0592c0 interfaceC0592c0 = this.f32279d;
                c cVar = new c(interfaceC0592c0, aVar, 2);
                L0.d dVar = new L0.d(k.f32342a);
                Boolean bool = Boolean.FALSE;
                return (View) this.f32277b.invoke(it, this.f32284i, numValueOf, interfaceC0592c0, this.f32280e, cVar, this.f32282g, this.f32281f, dVar, bool);
            default:
                Context context = (Context) obj;
                AbstractC3340k.e(context, "context");
                Integer numValueOf2 = Integer.valueOf(this.f32278c);
                tf.a aVar2 = this.f32282g;
                InterfaceC0592c0 interfaceC0592c02 = this.f32279d;
                c cVar2 = new c(interfaceC0592c02, aVar2, 3);
                C2048i c2048i = new C2048i(this.f32283h, 3);
                L0.d dVar2 = new L0.d(k.f32342a);
                Boolean bool2 = Boolean.TRUE;
                return (View) this.f32277b.invoke(context, (O) this.f32284i, numValueOf2, interfaceC0592c02, this.f32280e, cVar2, c2048i, this.f32281f, dVar2, bool2);
        }
    }

    public /* synthetic */ b(f fVar, WebView webView, int i5, InterfaceC0592c0 interfaceC0592c0, tf.l lVar, tf.a aVar, v vVar, tf.a aVar2) {
        this.f32277b = fVar;
        this.f32284i = webView;
        this.f32278c = i5;
        this.f32279d = interfaceC0592c0;
        this.f32280e = lVar;
        this.f32282g = aVar;
        this.f32281f = vVar;
        this.f32283h = aVar2;
    }
}
