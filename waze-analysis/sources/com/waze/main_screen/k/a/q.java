package com.waze.main_screen.k.a;

import com.waze.an.c.af;
import h.ab;
import java.io.Closeable;
import java.io.IOException;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class q extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    Object f26553a;

    /* renamed from: b, reason: collision with root package name */
    int f26554b;

    /* renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f26555c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ u f26556d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ int f26557e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    q(u uVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f26557e = i2;
        this.f26556d = uVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        if (this.f26557e != 0) {
            q qVar = new q(this.f26556d, eVar, 1, null);
            qVar.f26555c = obj;
            return qVar;
        }
        q qVar2 = new q(this.f26556d, eVar, 0);
        qVar2.f26555c = obj;
        return qVar2;
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return this.f26557e != 0 ? ((q) create((com.waze.an.c.k) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a) : ((q) create((a) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [h.c.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [com.waze.an.c.k] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r6v0, types: [com.waze.main_screen.k.a.q, h.c.e] */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r6v12 */
    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) throws IOException {
        com.waze.an.c.a.p pVar;
        com.waze.an.c.a.p pVar2;
        Throwable th;
        Closeable closeable;
        com.waze.an.c.k kVar;
        if (this.f26557e != 0) {
            ?? r0 = h.c.a.a.f48038a;
            int i2 = this.f26554b;
            try {
                try {
                    if (i2 != 0) {
                        Object obj2 = this.f26553a;
                        if (i2 != 1) {
                            e.b.c.b(obj);
                            throw new h.e();
                        }
                        kVar = (com.waze.an.c.k) obj2;
                        closeable = (Closeable) this.f26555c;
                        e.b.c.b(obj);
                        kVar.e();
                        h.a.i.aW(closeable, null);
                    } else {
                        e.b.c.b(obj);
                        com.waze.an.c.k kVar2 = (com.waze.an.c.k) this.f26555c;
                        u uVar = this.f26556d;
                        if (uVar.k() && kVar2 != null) {
                            com.waze.an.c.k kVar3 = kVar2;
                            try {
                                com.waze.an.c.k kVar4 = kVar3;
                                try {
                                    kVar4.g();
                                    if (kVar4 instanceof af) {
                                        this.f26555c = kVar3;
                                        this.f26553a = kVar4;
                                        this.f26554b = 1;
                                        if (u.e(uVar, (af) kVar4, this) != r0) {
                                            closeable = kVar3;
                                            kVar = kVar4;
                                            kVar.e();
                                            h.a.i.aW(closeable, null);
                                        }
                                    } else {
                                        this.f26555c = kVar3;
                                        this.f26553a = kVar4;
                                        this.f26554b = 2;
                                        if (aj.p(this) != r0) {
                                            throw new h.e();
                                        }
                                    }
                                    return r0;
                                } catch (Throwable th2) {
                                    th = th2;
                                    r0 = kVar4;
                                    r0.e();
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                this = kVar3;
                                try {
                                    throw th;
                                } catch (Throwable th4) {
                                    h.a.i.aW(this, th);
                                    throw th4;
                                }
                            }
                        }
                    }
                    return ab.f48028a;
                } catch (Throwable th5) {
                    th = th5;
                }
            } catch (Throwable th6) {
                th = th6;
            }
        } else {
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (this.f26554b == 0) {
                e.b.c.b(obj);
                com.waze.an.c.a.p pVarC = ((a) this.f26555c).c();
                if (!this.f26556d.k() || pVarC == null) {
                    return ab.f48028a;
                }
                pVar2 = pVarC;
                try {
                    pVar = pVar2;
                    try {
                        pVar.g();
                        this.f26555c = pVar2;
                        this.f26553a = pVar;
                        this.f26554b = 1;
                        if (aj.p(this) == aVar) {
                            return aVar;
                        }
                    } catch (Throwable th7) {
                        th = th7;
                        pVar.e();
                        throw th;
                    }
                } finally {
                }
            } else {
                pVar = (com.waze.an.c.a.p) this.f26553a;
                Closeable closeable2 = (Closeable) this.f26555c;
                try {
                    e.b.c.b(obj);
                    pVar2 = closeable2;
                } catch (Throwable th8) {
                    pVar2 = closeable2;
                    th = th8;
                    pVar.e();
                    throw th;
                }
            }
            throw new h.e();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    q(u uVar, h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f26557e = i2;
        this.f26556d = uVar;
    }
}
