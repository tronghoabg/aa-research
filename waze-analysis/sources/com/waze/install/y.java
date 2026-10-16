package com.waze.install;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class y extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f24799a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ae f24800b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f24801c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    y(ae aeVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f24801c = i2;
        this.f24800b = aeVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        int i2 = this.f24801c;
        return i2 != 0 ? i2 != 1 ? new y(this.f24800b, eVar, 2, (char[]) null) : new y(this.f24800b, eVar, 1, (byte[]) null) : new y(this.f24800b, eVar, 0);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i2 = this.f24801c;
        return i2 != 0 ? i2 != 1 ? ((y) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((y) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((y) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        int i2 = this.f24801c;
        if (i2 == 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (this.f24799a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                this.f24799a = 1;
                if (ae.h(this.f24800b, this) == aVar) {
                    return aVar;
                }
            }
            return h.ab.f48028a;
        }
        if (i2 == 1) {
            h.c.a.a aVar2 = h.c.a.a.f48038a;
            if (this.f24799a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                this.f24799a = 1;
                if (ae.i(this.f24800b, this) == aVar2) {
                    return aVar2;
                }
            }
            return h.ab.f48028a;
        }
        h.c.a.a aVar3 = h.c.a.a.f48038a;
        if (this.f24799a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            ae aeVar = this.f24800b;
            this.f24799a = 1;
            if (kotlinx.coroutines.b.ai.d(kotlinx.coroutines.b.ai.K(aeVar.f24733d, new z(aeVar, null)), this) == aVar3) {
                return aVar3;
            }
        }
        return h.ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    y(ae aeVar, h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f24801c = i2;
        this.f24800b = aeVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    y(ae aeVar, h.c.e eVar, int i2, char[] cArr) {
        super(2, eVar);
        this.f24801c = i2;
        this.f24800b = aeVar;
    }
}
