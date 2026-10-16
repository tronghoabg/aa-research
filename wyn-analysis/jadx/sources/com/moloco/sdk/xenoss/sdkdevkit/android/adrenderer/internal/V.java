package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import androidx.lifecycle.EnumC1449m;
import androidx.lifecycle.InterfaceC1455t;
import androidx.lifecycle.InterfaceC1457v;
import kotlin.jvm.internal.AbstractC3340k;
import n3.C3592d;

/* loaded from: classes4.dex */
public final /* synthetic */ class V implements InterfaceC1455t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30041a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f30042b;

    public /* synthetic */ V(Object obj, int i5) {
        this.f30041a = i5;
        this.f30042b = obj;
    }

    @Override // androidx.lifecycle.InterfaceC1455t
    public final void onStateChanged(InterfaceC1457v interfaceC1457v, EnumC1449m enumC1449m) {
        switch (this.f30041a) {
            case 0:
                int i5 = W.f30043a[enumC1449m.ordinal()];
                Gf.t tVar = (Gf.t) this.f30042b;
                if (i5 == 1) {
                    ((Gf.s) tVar).f4839d.c(Boolean.FALSE);
                    break;
                } else if (i5 == 2) {
                    ((Gf.s) tVar).f4839d.c(Boolean.TRUE);
                    break;
                }
                break;
            default:
                C3592d this$0 = (C3592d) this.f30042b;
                AbstractC3340k.e(this$0, "this$0");
                if (enumC1449m != EnumC1449m.ON_START) {
                    if (enumC1449m == EnumC1449m.ON_STOP) {
                        this$0.f40909f = false;
                        break;
                    }
                } else {
                    this$0.f40909f = true;
                    break;
                }
                break;
        }
    }
}
