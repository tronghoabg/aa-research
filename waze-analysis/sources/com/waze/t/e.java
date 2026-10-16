package com.waze.t;

import h.ab;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class e extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ g f40873a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f40874b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f40875c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e(g gVar, String str, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f40875c = i2;
        this.f40873a = gVar;
        this.f40874b = str;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        return this.f40875c != 0 ? new e(this.f40873a, (byte[]) this.f40874b, eVar, 1) : new e(this.f40873a, (String) this.f40874b, eVar, 0);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return this.f40875c != 0 ? ((e) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a) : ((e) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        if (this.f40875c == 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            e.b.c.b(obj);
            g gVar = this.f40873a;
            g.h(gVar);
            String str = (String) this.f40874b;
            gVar.f40888j = str;
            gVar.f40881c.e("session " + gVar.f40886h + ", Conversation " + gVar.f40887i + " now got id " + str);
            return ab.f48028a;
        }
        h.c.a.a aVar2 = h.c.a.a.f48038a;
        e.b.c.b(obj);
        Object obj2 = this.f40874b;
        g gVar2 = this.f40873a;
        byte[] bArr = (byte[]) obj2;
        gVar2.f40881c.a("session " + gVar2.f40886h + ", Conversation " + gVar2.f40887i + " got agent side audio chunk (length " + bArr.length + ")");
        gVar2.f40890l.write(bArr);
        return ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e(g gVar, byte[] bArr, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f40875c = i2;
        this.f40873a = gVar;
        this.f40874b = bArr;
    }
}
