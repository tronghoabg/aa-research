package com.waze.ui.aa;

import android.content.Context;
import android.content.Intent;
import androidx.compose.runtime.MutableState;
import com.waze.z.a.c.d;
import com.waze.z.a.c.g;
import h.ab;
import h.g.a.l;
import h.g.b.x;
import h.i;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class b implements g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h.g.a.a f41712a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f41713b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f41714c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f41715d;

    public /* synthetic */ b(h.g.a.a aVar, h.g.a.a aVar2, Context context, int i2) {
        this.f41715d = i2;
        this.f41712a = aVar;
        this.f41713b = aVar2;
        this.f41714c = context;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v9, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v11, types: [androidx.compose.runtime.MutableState, java.lang.Object] */
    @Override // h.g.a.p
    public final Object invoke(Object obj, Object obj2) {
        if (this.f41715d != 0) {
            com.waze.z.a.c.c cVar = (com.waze.z.a.c.c) obj;
            d dVar = (d) obj2;
            x.f(cVar, "dialogActions");
            x.f(dVar, "dialogCta");
            if (x.n(((com.waze.z.a.c.a) cVar).a(), dVar)) {
                this.f41713b.invoke(a.a.i(this.f41714c));
            } else {
                this.f41712a.invoke();
            }
            return ab.f48028a;
        }
        com.waze.z.a.c.c cVar2 = (com.waze.z.a.c.c) obj;
        d dVar2 = (d) obj2;
        x.f(cVar2, "actions");
        x.f(dVar2, "cta");
        boolean z = cVar2 instanceof com.waze.z.a.c.a;
        ?? r1 = this.f41713b;
        if (z) {
            if (x.n(((com.waze.z.a.c.a) cVar2).a(), dVar2)) {
                ((Context) this.f41714c).startActivity((Intent) this.f41712a.invoke());
            } else {
                r1.invoke();
            }
        } else {
            if (!(cVar2 instanceof com.waze.z.a.c.b)) {
                throw new i();
            }
            r1.invoke();
        }
        return ab.f48028a;
    }

    public /* synthetic */ b(l lVar, h.g.a.a aVar, MutableState mutableState, int i2) {
        this.f41715d = i2;
        this.f41713b = lVar;
        this.f41712a = aVar;
        this.f41714c = mutableState;
    }
}
