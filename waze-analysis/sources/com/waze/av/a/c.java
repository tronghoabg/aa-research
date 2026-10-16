package com.waze.av.a;

import h.ab;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class c extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f15789a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.waze.w.p f15790b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f15791c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(com.waze.w.p pVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f15791c = i2;
        this.f15790b = pVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        int i2 = this.f15791c;
        return i2 != 0 ? i2 != 1 ? new c(this.f15790b, eVar, 2, (char[]) null) : new c(this.f15790b, eVar, 1, (byte[]) null) : new c(this.f15790b, eVar, 0);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i2 = this.f15791c;
        return i2 != 0 ? i2 != 1 ? ((c) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a) : ((c) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a) : ((c) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        int i2 = this.f15791c;
        if (i2 == 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (this.f15789a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                this.f15789a = 1;
                if (this.f15790b.c(this) == aVar) {
                    return aVar;
                }
            }
            return ab.f48028a;
        }
        if (i2 != 1) {
            h.c.a.a aVar2 = h.c.a.a.f48038a;
            if (this.f15789a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                this.f15789a = 1;
                if (this.f15790b.c(this) == aVar2) {
                    return aVar2;
                }
            }
            return ab.f48028a;
        }
        h.c.a.a aVar3 = h.c.a.a.f48038a;
        if (this.f15789a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            this.f15789a = 1;
            if (this.f15790b.c(this) == aVar3) {
                return aVar3;
            }
        }
        return ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(com.waze.w.p pVar, h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f15791c = i2;
        this.f15790b = pVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(com.waze.w.p pVar, h.c.e eVar, int i2, char[] cArr) {
        super(2, eVar);
        this.f15791c = i2;
        this.f15790b = pVar;
    }
}
