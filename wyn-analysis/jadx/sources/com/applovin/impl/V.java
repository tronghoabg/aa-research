package com.applovin.impl;

import java.io.IOException;

/* loaded from: classes.dex */
public final /* synthetic */ class V implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20851a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j4 f20852b;

    public /* synthetic */ V(j4 j4Var, int i5) {
        this.f20851a = i5;
        this.f20852b = j4Var;
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        switch (this.f20851a) {
            case 0:
                this.f20852b.g();
                break;
            default:
                this.f20852b.f();
                break;
        }
    }
}
