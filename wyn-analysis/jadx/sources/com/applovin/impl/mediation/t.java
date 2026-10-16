package com.applovin.impl.mediation;

import com.applovin.impl.mediation.h;

/* loaded from: classes.dex */
public final /* synthetic */ class t implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22298a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f22299b;

    public /* synthetic */ t(Object obj, int i5) {
        this.f22298a = i5;
        this.f22299b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f22298a) {
            case 0:
                ((h.b) this.f22299b).a();
                break;
            default:
                ((h) this.f22299b).l();
                break;
        }
    }
}
