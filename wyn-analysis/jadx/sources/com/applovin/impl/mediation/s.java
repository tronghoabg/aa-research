package com.applovin.impl.mediation;

import android.os.Bundle;
import com.applovin.impl.mediation.h;
import com.applovin.impl.y2;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.adapter.MaxAdapter;

/* loaded from: classes.dex */
public final /* synthetic */ class s implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22294a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f22295b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f22296c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f22297d;

    public /* synthetic */ s(Object obj, Object obj2, Object obj3, int i5) {
        this.f22294a = i5;
        this.f22295b = obj;
        this.f22296c = obj2;
        this.f22297d = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f22294a) {
            case 0:
                ((h.b) this.f22295b).a((MaxError) this.f22296c, (Bundle) this.f22297d);
                break;
            case 1:
                ((h.c) this.f22295b).a((MaxAdapter.InitializationStatus) this.f22296c, (String) this.f22297d);
                break;
            case 2:
                ((h) this.f22295b).a((String) this.f22296c, (Runnable) this.f22297d);
                break;
            default:
                ((h) this.f22295b).a((y2) this.f22296c, (Runnable) this.f22297d);
                break;
        }
    }
}
