package com.waze.copilot.presentation;

import androidx.compose.material.ScaffoldState;
import h.ab;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class i extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f23120a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ long f23121b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ n f23122c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ boolean f23123d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ ScaffoldState f23124e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ String f23125f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ String f23126g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i(long j2, n nVar, boolean z, ScaffoldState scaffoldState, String str, String str2, h.c.e eVar) {
        super(2, eVar);
        this.f23121b = j2;
        this.f23122c = nVar;
        this.f23123d = z;
        this.f23124e = scaffoldState;
        this.f23125f = str;
        this.f23126g = str2;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        return new i(this.f23121b, this.f23122c, this.f23123d, this.f23124e, this.f23125f, this.f23126g, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((i) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f23120a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            this.f23120a = 1;
            if (aj.I(this.f23121b, new h(this.f23124e, this.f23125f, this.f23126g, null), this) == aVar) {
                return aVar;
            }
        }
        n nVar = this.f23122c;
        nVar.x().n();
        if (this.f23123d) {
            nVar.u().d();
        }
        return ab.f48028a;
    }
}
