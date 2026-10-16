package com.applovin.impl.mediation;

import android.os.Bundle;
import com.applovin.impl.mediation.h;

/* loaded from: classes.dex */
public final /* synthetic */ class r implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22291a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h.b f22292b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Bundle f22293c;

    public /* synthetic */ r(h.b bVar, Bundle bundle, int i5) {
        this.f22291a = i5;
        this.f22292b = bVar;
        this.f22293c = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f22291a) {
            case 0:
                this.f22292b.j(this.f22293c);
                break;
            case 1:
                this.f22292b.e(this.f22293c);
                break;
            case 2:
                this.f22292b.i(this.f22293c);
                break;
            case 3:
                this.f22292b.a(this.f22293c);
                break;
            case 4:
                this.f22292b.f(this.f22293c);
                break;
            case 5:
                this.f22292b.g(this.f22293c);
                break;
            case 6:
                this.f22292b.h(this.f22293c);
                break;
            case 7:
                this.f22292b.d(this.f22293c);
                break;
            case 8:
                this.f22292b.c(this.f22293c);
                break;
            default:
                this.f22292b.b(this.f22293c);
                break;
        }
    }
}
