package com.google.android.libraries.phenotype.client.stable;

import android.content.Context;
import com.google.d.m.a.bm;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ai {

    /* renamed from: a, reason: collision with root package name */
    private final Context f6040a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.d.b.aj f6041b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.d.b.aj f6042c;

    /* renamed from: d, reason: collision with root package name */
    private final com.google.d.b.aj f6043d;

    /* renamed from: e, reason: collision with root package name */
    private volatile int f6044e = 0;

    /* renamed from: f, reason: collision with root package name */
    private final CopyOnWriteArrayList f6045f = new CopyOnWriteArrayList();

    /* renamed from: g, reason: collision with root package name */
    private final Object f6046g = new Object();

    /* renamed from: h, reason: collision with root package name */
    private volatile bm f6047h = null;

    public ai(Context context, com.google.d.b.aj ajVar, com.google.d.b.aj ajVar2, com.google.d.b.aj ajVar3) {
        this.f6040a = context;
        this.f6041b = ajVar;
        this.f6042c = ajVar2;
        this.f6043d = ajVar3;
    }

    public final void c(com.google.g.a.a.b bVar, boolean z, al alVar) {
        bm bmVarH;
        ar afVar = (ar) this.f6042c.get();
        if (afVar == null && !z) {
            com.google.d.m.a.bd.i();
            return;
        }
        int number = bVar.getNumber();
        int i2 = 1;
        com.google.d.b.an.l(true);
        int i3 = 1 << number;
        if ((this.f6044e & i3) == 0) {
            CopyOnWriteArrayList copyOnWriteArrayList = this.f6045f;
            synchronized (copyOnWriteArrayList) {
                int i4 = this.f6044e;
                if ((i4 & i3) == 0) {
                    copyOnWriteArrayList.add(alVar);
                    this.f6044e = i3 | i4;
                }
            }
        }
        if (this.f6047h == null) {
            synchronized (this.f6046g) {
                if (this.f6047h == null) {
                    if (afVar == null) {
                        afVar = new af();
                    }
                    Context context = this.f6040a;
                    if (com.google.android.libraries.a.c.e(context)) {
                        com.google.android.gms.common.api.internal.bc bcVar = new com.google.android.gms.common.api.internal.bc(2);
                        com.google.d.b.aj ajVar = this.f6041b;
                        bmVarH = com.google.d.m.a.bd.n(com.google.android.libraries.a.c.b(context, new com.google.android.libraries.e.b.o(Executors.callable(bcVar, null), i2), (Executor) ajVar.get()), new ag(this, afVar, 0), (Executor) ajVar.get());
                        this.f6047h = bmVarH;
                    } else {
                        bmVarH = ((com.bumptech.glide.load.c.e.e) this.f6043d.get()).h(new ah(this, afVar));
                        bm bmVar = bmVarH;
                        this.f6047h = bmVarH;
                    }
                    bmVarH.addListener(new android.support.v4.app.ae(bmVarH, 19), (Executor) this.f6041b.get());
                }
            }
        }
    }
}
