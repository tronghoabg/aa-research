package com.waze.cf.c;

import com.waze.ab.r;
import h.g.b.am;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class d implements r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ am f22193a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h.g.a.a f22194b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h.g.a.a f22195c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f22196d;

    public /* synthetic */ d(am amVar, h.g.a.a aVar, h.g.a.a aVar2, int i2) {
        this.f22196d = i2;
        this.f22193a = amVar;
        this.f22194b = aVar;
        this.f22195c = aVar2;
    }

    @Override // com.waze.ab.r
    public final void a(boolean z, boolean z2) {
        int i2 = this.f22196d;
        am amVar = this.f22193a;
        if (i2 != 0) {
            if (amVar.f48101a) {
                return;
            }
            amVar.f48101a = true;
            if (z) {
                this.f22194b.invoke();
                return;
            } else {
                this.f22195c.invoke();
                return;
            }
        }
        if (amVar.f48101a) {
            return;
        }
        amVar.f48101a = true;
        if (z) {
            this.f22194b.invoke();
        } else {
            this.f22195c.invoke();
        }
    }
}
