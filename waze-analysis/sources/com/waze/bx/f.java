package com.waze.bx;

import com.waze.an.a.k;
import com.waze.an.a.u;
import com.waze.an.c.q;
import h.ab;
import h.g.a.p;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class f extends h.c.b.a.g implements p {

    /* renamed from: a, reason: collision with root package name */
    int f18181a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.waze.an.d.b f18182b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ u f18183c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ k f18184d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ int f18185e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(com.waze.an.d.b bVar, u uVar, k kVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f18185e = i2;
        this.f18182b = bVar;
        this.f18183c = uVar;
        this.f18184d = kVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        int i2 = this.f18185e;
        return i2 != 0 ? i2 != 1 ? new f(this.f18182b, this.f18183c, this.f18184d, eVar, 2, (char[]) null) : new f(this.f18182b, this.f18183c, this.f18184d, eVar, 1, (byte[]) null) : new f(this.f18182b, this.f18183c, this.f18184d, eVar, 0);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i2 = this.f18185e;
        return i2 != 0 ? i2 != 1 ? ((f) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a) : ((f) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a) : ((f) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        int i2 = this.f18185e;
        if (i2 == 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (this.f18181a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                this.f18181a = 1;
                if (aj.q(5000L, this) == aVar) {
                    return aVar;
                }
            }
            q.b(this.f18182b, this.f18183c, this.f18184d, null, null, 28);
            return ab.f48028a;
        }
        if (i2 != 1) {
            h.c.a.a aVar2 = h.c.a.a.f48038a;
            if (this.f18181a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                this.f18181a = 1;
                if (aj.q(5000L, this) == aVar2) {
                    return aVar2;
                }
            }
            q.b(this.f18182b, this.f18183c, this.f18184d, null, null, 28);
            return ab.f48028a;
        }
        h.c.a.a aVar3 = h.c.a.a.f48038a;
        if (this.f18181a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            this.f18181a = 1;
            if (aj.q(5000L, this) == aVar3) {
                return aVar3;
            }
        }
        q.b(this.f18182b, this.f18183c, this.f18184d, null, null, 28);
        return ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(com.waze.an.d.b bVar, u uVar, k kVar, h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f18185e = i2;
        this.f18182b = bVar;
        this.f18183c = uVar;
        this.f18184d = kVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(com.waze.an.d.b bVar, u uVar, k kVar, h.c.e eVar, int i2, char[] cArr) {
        super(2, eVar);
        this.f18185e = i2;
        this.f18182b = bVar;
        this.f18183c = uVar;
        this.f18184d = kVar;
    }
}
