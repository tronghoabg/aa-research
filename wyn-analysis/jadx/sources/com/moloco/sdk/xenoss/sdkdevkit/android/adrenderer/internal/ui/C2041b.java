package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui;

import N.C0740o;
import android.webkit.WebView;
import ef.C2515C;
import r0.InterfaceC3903h;
import r7.AbstractC3935e;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C2041b implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30856a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Z.k f30857b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f30858c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f30859d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f30860e;

    public /* synthetic */ C2041b(Object obj, Z.k kVar, Object obj2, int i5, int i10) {
        this.f30856a = i10;
        this.f30859d = obj;
        this.f30857b = kVar;
        this.f30860e = obj2;
        this.f30858c = i5;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        C0740o c0740o = (C0740o) obj;
        Integer num = (Integer) obj2;
        switch (this.f30856a) {
            case 0:
                num.getClass();
                int i5 = this.f30858c | 1;
                AbstractC3935e.h((tf.l) this.f30859d, this.f30857b, (tf.l) this.f30860e, c0740o, i5);
                break;
            case 1:
                num.intValue();
                t.a((String) this.f30859d, (InterfaceC3903h) this.f30860e, this.f30857b, c0740o, this.f30858c | 1);
                break;
            default:
                num.getClass();
                int i10 = this.f30858c | 1;
                A6.c.f((WebView) this.f30859d, this.f30857b, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.t) this.f30860e, c0740o, i10);
                break;
        }
        return C2515C.f34653a;
    }

    public /* synthetic */ C2041b(String str, InterfaceC3903h interfaceC3903h, Z.k kVar, int i5) {
        this.f30856a = 1;
        this.f30859d = str;
        this.f30860e = interfaceC3903h;
        this.f30857b = kVar;
        this.f30858c = i5;
    }
}
