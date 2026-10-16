package com.applovin.impl.mediation;

import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.mediation.d;
import com.applovin.impl.mediation.e;

/* loaded from: classes.dex */
public final /* synthetic */ class l implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22271a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f22272b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f22273c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a.InterfaceC0014a f22274d;

    public /* synthetic */ l(a.InterfaceC0014a interfaceC0014a, int i5, String str, int i10) {
        this.f22271a = i10;
        this.f22274d = interfaceC0014a;
        this.f22272b = i5;
        this.f22273c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f22271a) {
            case 0:
                ((d.b) this.f22274d).a(this.f22272b, this.f22273c);
                break;
            default:
                ((e.b) this.f22274d).a(this.f22272b, this.f22273c);
                break;
        }
    }
}
