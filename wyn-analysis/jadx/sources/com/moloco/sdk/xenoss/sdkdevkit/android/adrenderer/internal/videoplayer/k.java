package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer;

import android.os.Build;
import androidx.lifecycle.EnumC1449m;
import androidx.lifecycle.InterfaceC1455t;
import androidx.lifecycle.InterfaceC1457v;
import k1.C3126m;
import k1.InterfaceC3127n;

/* loaded from: classes4.dex */
public final /* synthetic */ class k implements InterfaceC1455t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32252a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f32253b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f32254c;

    public /* synthetic */ k(int i5, Object obj, Object obj2) {
        this.f32252a = i5;
        this.f32253b = obj;
        this.f32254c = obj2;
    }

    @Override // androidx.lifecycle.InterfaceC1455t
    public final void onStateChanged(InterfaceC1457v interfaceC1457v, EnumC1449m enumC1449m) {
        switch (this.f32252a) {
            case 0:
                int i5 = l.f32255a[enumC1449m.ordinal()];
                S8.d dVar = (S8.d) this.f32253b;
                if (i5 == 1) {
                    if (Build.VERSION.SDK_INT > 23) {
                        dVar.invoke();
                        break;
                    }
                } else if (i5 == 2) {
                    if (Build.VERSION.SDK_INT <= 23) {
                        dVar.invoke();
                        break;
                    }
                } else {
                    S8.d dVar2 = (S8.d) this.f32254c;
                    if (i5 == 3) {
                        if (Build.VERSION.SDK_INT <= 23) {
                            dVar2.invoke();
                            break;
                        }
                    } else if (i5 == 4 && Build.VERSION.SDK_INT > 23) {
                        dVar2.invoke();
                        break;
                    }
                }
                break;
            default:
                EnumC1449m enumC1449m2 = EnumC1449m.ON_DESTROY;
                C3126m c3126m = (C3126m) this.f32253b;
                if (enumC1449m != enumC1449m2) {
                    c3126m.getClass();
                    break;
                } else {
                    c3126m.b((InterfaceC3127n) this.f32254c);
                    break;
                }
        }
    }
}
