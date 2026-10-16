package com.waze.car_lib.i.b;

import android.content.Context;
import com.waze.car_lib.p.dh;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class aa extends h.c.b.a.g implements h.g.a.q {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f19939a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ boolean f19940b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Context f19941c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Object f19942d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ int f19943e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    aa(ab abVar, Context context, h.c.e eVar, int i2) {
        super(3, eVar);
        this.f19943e = i2;
        this.f19942d = abVar;
        this.f19941c = context;
    }

    @Override // h.g.a.q
    public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        if (this.f19943e != 0) {
            boolean zBooleanValue = ((Boolean) obj2).booleanValue();
            Object obj4 = this.f19942d;
            o oVar = (o) obj4;
            aa aaVar = new aa(oVar, this.f19941c, (h.c.e) obj3, 1);
            aaVar.f19939a = (dh) obj;
            aaVar.f19940b = zBooleanValue;
            return aaVar.invokeSuspend(h.ab.f48028a);
        }
        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
        Object obj5 = this.f19942d;
        ab abVar = (ab) obj5;
        aa aaVar2 = new aa(abVar, this.f19941c, (h.c.e) obj3, 0);
        aaVar2.f19939a = (dh) obj;
        aaVar2.f19940b = zBooleanValue2;
        return aaVar2.invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        if (this.f19943e != 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            e.b.c.b(obj);
            dh dhVar = (dh) this.f19939a;
            boolean z = this.f19940b;
            if (dhVar == null) {
                return null;
            }
            Object obj2 = this.f19942d;
            return ((o) obj2).f20015d.a(this.f19941c, z, dhVar);
        }
        h.c.a.a aVar2 = h.c.a.a.f48038a;
        e.b.c.b(obj);
        dh dhVar2 = (dh) this.f19939a;
        boolean z2 = this.f19940b;
        if (dhVar2 == null) {
            return null;
        }
        Object obj3 = this.f19942d;
        return ((ab) obj3).f19950g.a(this.f19941c, z2, dhVar2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    aa(o oVar, Context context, h.c.e eVar, int i2) {
        super(3, eVar);
        this.f19943e = i2;
        this.f19942d = oVar;
        this.f19941c = context;
    }
}
