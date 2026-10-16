package com.waze.reports_v2.presentation;

import android.content.Context;
import com.waze.reports_v2.c.ea;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class df implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f35023a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f35024b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f35025c;

    public /* synthetic */ df(aq aqVar, Runnable runnable, int i2) {
        this.f35025c = i2;
        this.f35024b = aqVar;
        this.f35023a = runnable;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.lang.Runnable] */
    @Override // h.g.a.l
    public final Object invoke(Object obj) {
        if (this.f35025c != 0) {
            ?? r0 = this.f35023a;
            return aq.a((aq) this.f35024b, r0, (h.g.a.a) obj);
        }
        Object obj2 = this.f35024b;
        return dg.f((dg) this.f35023a, (ea) obj2, (Context) obj);
    }

    public /* synthetic */ df(dg dgVar, ea eaVar, int i2) {
        this.f35025c = i2;
        this.f35023a = dgVar;
        this.f35024b = eaVar;
    }
}
