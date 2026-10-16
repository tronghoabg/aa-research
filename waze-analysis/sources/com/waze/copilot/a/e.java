package com.waze.copilot.a;

import androidx.media3.extractor.text.ttml.TtmlNode;
import kotlinx.coroutines.b.ch;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class e extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f22822a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ g f22823b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f22824c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e(g gVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f22824c = i2;
        this.f22823b = gVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        int i2 = this.f22824c;
        return i2 != 0 ? i2 != 1 ? new e(this.f22823b, eVar, 2, (char[]) null) : new e(this.f22823b, eVar, 1, (byte[]) null) : new e(this.f22823b, eVar, 0);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i2 = this.f22824c;
        return i2 != 0 ? i2 != 1 ? ((e) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((e) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((e) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        int i2 = this.f22824c;
        if (i2 == 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (this.f22822a != 0) {
                e.b.c.b(obj);
                return obj;
            }
            e.b.c.b(obj);
            this.f22822a = 1;
            Object objC = this.f22823b.f22830b.c(this);
            return objC == aVar ? aVar : objC;
        }
        if (i2 == 1) {
            h.c.a.a aVar2 = h.c.a.a.f48038a;
            if (this.f22822a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                g gVar = this.f22823b;
                ch chVarF = gVar.f22832d.f();
                h.g.b.x.e(chVarF, "getProfileStateFlow(...)");
                this.f22822a = 1;
                if (kotlinx.coroutines.b.ai.A(chVarF, new com.waze.car_lib.r(7)).collect(new d(gVar), this) == aVar2) {
                    return aVar2;
                }
            }
            return h.ab.f48028a;
        }
        h.c.a.a aVar3 = h.c.a.a.f48038a;
        if (this.f22822a != 0) {
            e.b.c.b(obj);
            ((h.m) obj).b();
        } else {
            e.b.c.b(obj);
            g gVar2 = this.f22823b;
            gVar2.f22833e.a(TtmlNode.START);
            if (gVar2.f22834f.b()) {
                kotlinx.coroutines.aj.z(gVar2.f22835g, null, null, new e(gVar2, (h.c.e) null, 1, (byte[]) null), 3);
            } else {
                this.f22822a = 1;
                if (be.b(gVar2.f22829a, this) == aVar3) {
                    return aVar3;
                }
            }
        }
        return h.ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e(g gVar, h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f22824c = i2;
        this.f22823b = gVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e(g gVar, h.c.e eVar, int i2, char[] cArr) {
        super(2, eVar);
        this.f22824c = i2;
        this.f22823b = gVar;
    }
}
