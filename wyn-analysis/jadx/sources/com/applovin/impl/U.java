package com.applovin.impl;

import com.applovin.impl.i2;

/* loaded from: classes.dex */
public final /* synthetic */ class U implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20846a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f20847b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f20848c;

    public /* synthetic */ U(Object obj, int i5, int i10) {
        this.f20846a = i10;
        this.f20848c = obj;
        this.f20847b = i5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f20846a) {
            case 0:
                ((i2.b) this.f20848c).a(this.f20847b);
                break;
            default:
                ((n2) this.f20848c).a(this.f20847b);
                break;
        }
    }
}
