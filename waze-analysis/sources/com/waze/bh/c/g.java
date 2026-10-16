package com.waze.bh.c;

import h.ab;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class g extends h.c.b.a.g implements p {

    /* renamed from: a, reason: collision with root package name */
    int f16782a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ h f16783b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f16784c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f16785d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(h hVar, String str, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f16785d = i2;
        this.f16783b = hVar;
        this.f16784c = str;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        return this.f16785d != 0 ? new g(this.f16783b, this.f16784c, eVar, 1, null) : new g(this.f16783b, this.f16784c, eVar, 0);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return this.f16785d != 0 ? ((g) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a) : ((g) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        if (this.f16785d != 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (this.f16782a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                h hVar = this.f16783b;
                String str = this.f16784c;
                this.f16782a = 1;
                if (hVar.f16786a.b(str, this) == aVar) {
                    return aVar;
                }
            }
            return ab.f48028a;
        }
        h.c.a.a aVar2 = h.c.a.a.f48038a;
        if (this.f16782a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            h hVar2 = this.f16783b;
            String str2 = this.f16784c;
            this.f16782a = 1;
            if (hVar2.f16786a.a(str2, this) == aVar2) {
                return aVar2;
            }
        }
        return ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(h hVar, String str, h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f16785d = i2;
        this.f16783b = hVar;
        this.f16784c = str;
    }
}
