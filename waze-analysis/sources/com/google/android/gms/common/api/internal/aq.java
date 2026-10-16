package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class aq implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ an f4755a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f4756b = "ConnectionlessLifecycleHelper";

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ar f4757c;

    aq(ar arVar, an anVar) {
        this.f4755a = anVar;
        Objects.requireNonNull(arVar);
        this.f4757c = arVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle;
        ar arVar = this.f4757c;
        if (arVar.f4759b > 0) {
            an anVar = this.f4755a;
            if (arVar.f4760c != null) {
                bundle = arVar.f4760c.getBundle(this.f4756b);
            } else {
                bundle = null;
            }
            anVar.e(bundle);
        }
        if (arVar.f4759b >= 2) {
            this.f4755a.l();
        }
        if (arVar.f4759b >= 3) {
            this.f4755a.k();
        }
        if (arVar.f4759b >= 4) {
            this.f4755a.m();
        }
    }
}
