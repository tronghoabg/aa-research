package com.waze.sharedrive.c;

import com.waze.sharedrive.a.ac;
import e.a.cm;
import h.ab;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class l extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f38109a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f38110b;

    /* renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f38111c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f38112d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    l(String str, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f38112d = i2;
        this.f38110b = str;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        if (this.f38112d != 0) {
            l lVar = new l(this.f38110b, eVar, 1, null);
            lVar.f38111c = obj;
            return lVar;
        }
        l lVar2 = new l(this.f38110b, eVar, 0);
        lVar2.f38111c = obj;
        return lVar2;
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return this.f38112d != 0 ? ((l) create((ac) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a) : ((l) create((ac) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        if (this.f38112d != 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (this.f38109a != 0) {
                e.b.c.b(obj);
                return obj;
            }
            e.b.c.b(obj);
            ac acVar = (ac) this.f38111c;
            String str = this.f38110b;
            com.waze.sharedrive.a.o oVarNewBuilder = com.waze.sharedrive.a.p.newBuilder();
            oVarNewBuilder.a(str);
            com.waze.sharedrive.a.p pVarBuild = oVarNewBuilder.build();
            h.g.b.x.e(pVarBuild, "build(...)");
            this.f38109a = 1;
            Object objF = acVar.f(pVarBuild, new cm(), this);
            return objF == aVar ? aVar : objF;
        }
        h.c.a.a aVar2 = h.c.a.a.f48038a;
        if (this.f38109a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            ac acVar2 = (ac) this.f38111c;
            String str2 = this.f38110b;
            com.waze.sharedrive.a.i iVarNewBuilder = com.waze.sharedrive.a.j.newBuilder();
            iVarNewBuilder.a(str2);
            com.waze.sharedrive.a.j jVarBuild = iVarNewBuilder.build();
            h.g.b.x.e(jVarBuild, "build(...)");
            l lVar = this;
            this.f38109a = 1;
            if (acVar2.d(jVarBuild, new cm(), lVar) == aVar2) {
                return aVar2;
            }
        }
        return ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    l(String str, h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f38112d = i2;
        this.f38110b = str;
    }
}
