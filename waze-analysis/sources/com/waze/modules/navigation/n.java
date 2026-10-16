package com.waze.modules.navigation;

import com.google.v.du;
import com.waze.hw;
import i.b.l.pw;
import i.b.l.qg;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class n implements hw {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f30452a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ du f30453b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f30454c;

    public /* synthetic */ n(r rVar, du duVar, int i2) {
        this.f30454c = i2;
        this.f30452a = rVar;
        this.f30453b = duVar;
    }

    @Override // com.waze.hw
    public final Object a() {
        int i2 = this.f30454c;
        du duVar = this.f30453b;
        if (i2 != 0) {
            r.handleRerouteSuggestion$lambda$0(this.f30452a, (qg) duVar);
            return null;
        }
        r.handleRoutingUpdate$lambda$0(this.f30452a, (pw) duVar);
        return null;
    }
}
