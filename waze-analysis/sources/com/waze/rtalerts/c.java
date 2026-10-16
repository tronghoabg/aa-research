package com.waze.rtalerts;

import h.ab;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class c implements com.waze.jni.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h.g.a.l f35118a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f35119b;

    public /* synthetic */ c(h.g.a.l lVar, int i2) {
        this.f35119b = i2;
        this.f35118a = lVar;
    }

    @Override // com.waze.jni.a
    public final void a(Object obj) {
        int i2 = this.f35119b;
        if (i2 == 0) {
            this.f35118a.invoke((ab) obj);
            return;
        }
        if (i2 == 1) {
            this.f35118a.invoke((ab) obj);
            return;
        }
        if (i2 == 2) {
            x.getRtAlertsOnRoute$lambda$1(this.f35118a, (byte[]) obj);
            return;
        }
        if (i2 == 3) {
            this.f35118a.invoke((ab) obj);
        } else if (i2 == 4) {
            x.setAndRetrieveReportLocation$lambda$1(this.f35118a, (byte[]) obj);
        } else if (i2 != 5) {
            this.f35118a.invoke((ab) obj);
        } else {
            x.getReportLocation$lambda$1(this.f35118a, (byte[]) obj);
        }
    }
}
