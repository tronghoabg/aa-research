package com.waze.aa;

import h.f;
import h.g.b.ah;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class a implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f13661a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f13662b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f13663c;

    public /* synthetic */ a(f fVar, Object obj, int i2) {
        this.f13663c = i2;
        this.f13661a = fVar;
        this.f13662b = obj;
    }

    @Override // h.g.a.a
    public final Object invoke() {
        if (this.f13663c != 0) {
            final Object obj = this.f13662b;
            new ah(obj) { // from class: com.waze.aa.b
                @Override // h.g.b.ah, h.l.n
                public final Object get() {
                    return ((org.a.a.b.a) this.receiver).l();
                }
            };
            return (org.a.d.k.b) this.f13661a.getValue();
        }
        final Object obj2 = this.f13662b;
        new ah(obj2) { // from class: com.waze.aa.c
            @Override // h.g.b.ah, h.l.n
            public final Object get() {
                return ((org.a.a.b.a) this.receiver).l();
            }
        };
        return (org.a.d.k.b) this.f13661a.getValue();
    }
}
