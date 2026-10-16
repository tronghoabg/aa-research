package com.waze.cf.c;

import h.ab;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class j extends h.c.b.a.g implements p {

    /* renamed from: a, reason: collision with root package name */
    int f22210a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ l f22211b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f22212c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(l lVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f22212c = i2;
        this.f22211b = lVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        int i2 = this.f22212c;
        return i2 != 0 ? i2 != 1 ? new j(this.f22211b, eVar, 2, (char[]) null) : new j(this.f22211b, eVar, 1, (byte[]) null) : new j(this.f22211b, eVar, 0);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i2 = this.f22212c;
        return i2 != 0 ? i2 != 1 ? ((j) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a) : ((j) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a) : ((j) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        int i2 = this.f22212c;
        if (i2 == 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (this.f22210a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                l lVar = this.f22211b;
                this.f22210a = 1;
                if (lVar.f22218d.a().collect(new i(lVar, 0), this) == aVar) {
                    return aVar;
                }
            }
            return ab.f48028a;
        }
        if (i2 != 1) {
            h.c.a.a aVar2 = h.c.a.a.f48038a;
            if (this.f22210a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                l lVar2 = this.f22211b;
                this.f22210a = 1;
                if (lVar2.f22218d.b().collect(new i(lVar2, 2), this) == aVar2) {
                    return aVar2;
                }
            }
            return ab.f48028a;
        }
        h.c.a.a aVar3 = h.c.a.a.f48038a;
        if (this.f22210a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            l lVar3 = this.f22211b;
            this.f22210a = 1;
            if (lVar3.f22218d.c().collect(new i(lVar3, 1), this) == aVar3) {
                return aVar3;
            }
        }
        return ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(l lVar, h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f22212c = i2;
        this.f22211b = lVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(l lVar, h.c.e eVar, int i2, char[] cArr) {
        super(2, eVar);
        this.f22212c = i2;
        this.f22211b = lVar;
    }
}
