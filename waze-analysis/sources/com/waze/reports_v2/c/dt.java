package com.waze.reports_v2.c;

import com.waze.jni.protos.rtalerts.ReportLocationProto;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class dt implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h.g.a.l f34446a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ du f34447b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f34448c;

    public /* synthetic */ dt(h.g.a.l lVar, du duVar, int i2) {
        this.f34448c = i2;
        this.f34446a = lVar;
        this.f34447b = duVar;
    }

    @Override // h.g.a.l
    public final Object invoke(Object obj) {
        if (this.f34448c != 0) {
            du duVar = this.f34447b;
            return du.e(this.f34446a, duVar, (ReportLocationProto) obj);
        }
        du duVar2 = this.f34447b;
        return du.f(this.f34446a, duVar2, (ReportLocationProto) obj);
    }
}
