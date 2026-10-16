package com.waze.main_screen.p.a.b.a;

import androidx.compose.runtime.State;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class m extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f26804a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f26805b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Object f26806c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f26807d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    m(t tVar, State state, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f26807d = i2;
        this.f26805b = tVar;
        this.f26806c = state;
    }

    /* JADX WARN: Type inference failed for: r2v8, types: [androidx.compose.runtime.State, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [androidx.compose.runtime.State, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [androidx.compose.runtime.State, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [androidx.compose.runtime.State, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [androidx.compose.runtime.State, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [androidx.compose.runtime.State, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [androidx.compose.runtime.State, java.lang.Object] */
    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        switch (this.f26807d) {
            case 0:
                return new m((t) this.f26805b, (State) this.f26806c, eVar, 0);
            case 1:
                return new m((t) this.f26806c, (com.waze.ui.r.a.e.b.a) this.f26805b, eVar, 1);
            case 2:
                return new m((t) this.f26805b, (State) this.f26806c, eVar, 2, (byte[]) null);
            case 3:
                return new m((t) this.f26805b, (State) this.f26806c, eVar, 3, (char[]) null);
            case 4:
                return new m((t) this.f26805b, (State) this.f26806c, eVar, 4, (short[]) null);
            case 5:
                return new m((t) this.f26805b, (State) this.f26806c, eVar, 5, (int[]) null);
            case 6:
                return new m((t) this.f26805b, (State) this.f26806c, eVar, 6, (boolean[]) null);
            default:
                return new m((t) this.f26805b, (State) this.f26806c, eVar, 7, (float[]) null);
        }
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f26807d) {
        }
        return ((m) create((af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    /* JADX WARN: Type inference failed for: r4v16, types: [androidx.compose.runtime.State, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v9, types: [androidx.compose.runtime.State, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [androidx.compose.runtime.State, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v11, types: [androidx.compose.runtime.State, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v18, types: [androidx.compose.runtime.State, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v22, types: [androidx.compose.runtime.State, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v7, types: [androidx.compose.runtime.State, java.lang.Object] */
    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f26807d) {
            case 0:
                h.c.a.a aVar = h.c.a.a.f48038a;
                if (this.f26804a != 0) {
                    e.b.c.b(obj);
                } else {
                    e.b.c.b(obj);
                    a.a.t(this.f26806c).invoke();
                    Object obj2 = this.f26805b;
                    this.f26804a = 1;
                    if (((t) obj2).l(this) == aVar) {
                        return aVar;
                    }
                }
                return h.ab.f48028a;
            case 1:
                h.c.a.a aVar2 = h.c.a.a.f48038a;
                if (this.f26804a != 0) {
                    e.b.c.b(obj);
                } else {
                    e.b.c.b(obj);
                    Object obj3 = this.f26806c;
                    boolean z = this.f26805b == com.waze.ui.r.a.e.b.a.f43359a;
                    this.f26804a = 1;
                    if (((t) obj3).s(z, this) == aVar2) {
                        return aVar2;
                    }
                }
                return h.ab.f48028a;
            case 2:
                h.c.a.a aVar3 = h.c.a.a.f48038a;
                if (this.f26804a != 0) {
                    e.b.c.b(obj);
                } else {
                    e.b.c.b(obj);
                    a.a.t(this.f26806c).invoke();
                    Object obj4 = this.f26805b;
                    this.f26804a = 1;
                    if (((t) obj4).l(this) == aVar3) {
                        return aVar3;
                    }
                }
                return h.ab.f48028a;
            case 3:
                h.c.a.a aVar4 = h.c.a.a.f48038a;
                if (this.f26804a != 0) {
                    e.b.c.b(obj);
                } else {
                    e.b.c.b(obj);
                    a.a.t(this.f26806c).invoke();
                    Object obj5 = this.f26805b;
                    this.f26804a = 1;
                    if (((t) obj5).l(this) == aVar4) {
                        return aVar4;
                    }
                }
                return h.ab.f48028a;
            case 4:
                h.c.a.a aVar5 = h.c.a.a.f48038a;
                if (this.f26804a != 0) {
                    e.b.c.b(obj);
                } else {
                    e.b.c.b(obj);
                    Object obj6 = this.f26805b;
                    this.f26804a = 1;
                    if (((t) obj6).u(this) == aVar5) {
                        return aVar5;
                    }
                }
                a.a.t(this.f26806c).invoke();
                return h.ab.f48028a;
            case 5:
                h.c.a.a aVar6 = h.c.a.a.f48038a;
                if (this.f26804a != 0) {
                    e.b.c.b(obj);
                } else {
                    e.b.c.b(obj);
                    a.a.t(this.f26806c).invoke();
                    Object obj7 = this.f26805b;
                    this.f26804a = 1;
                    if (((t) obj7).l(this) == aVar6) {
                        return aVar6;
                    }
                }
                return h.ab.f48028a;
            case 6:
                h.c.a.a aVar7 = h.c.a.a.f48038a;
                if (this.f26804a != 0) {
                    e.b.c.b(obj);
                } else {
                    e.b.c.b(obj);
                    a.a.t(this.f26806c).invoke();
                    Object obj8 = this.f26805b;
                    this.f26804a = 1;
                    if (((t) obj8).l(this) == aVar7) {
                        return aVar7;
                    }
                }
                return h.ab.f48028a;
            default:
                h.c.a.a aVar8 = h.c.a.a.f48038a;
                if (this.f26804a != 0) {
                    e.b.c.b(obj);
                } else {
                    e.b.c.b(obj);
                    Object obj9 = this.f26805b;
                    this.f26804a = 1;
                    if (((t) obj9).u(this) == aVar8) {
                        return aVar8;
                    }
                }
                a.a.t(this.f26806c).invoke();
                return h.ab.f48028a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    m(t tVar, State state, h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f26807d = i2;
        this.f26805b = tVar;
        this.f26806c = state;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    m(t tVar, State state, h.c.e eVar, int i2, char[] cArr) {
        super(2, eVar);
        this.f26807d = i2;
        this.f26805b = tVar;
        this.f26806c = state;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    m(t tVar, State state, h.c.e eVar, int i2, float[] fArr) {
        super(2, eVar);
        this.f26807d = i2;
        this.f26805b = tVar;
        this.f26806c = state;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    m(t tVar, State state, h.c.e eVar, int i2, int[] iArr) {
        super(2, eVar);
        this.f26807d = i2;
        this.f26805b = tVar;
        this.f26806c = state;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    m(t tVar, State state, h.c.e eVar, int i2, short[] sArr) {
        super(2, eVar);
        this.f26807d = i2;
        this.f26805b = tVar;
        this.f26806c = state;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    m(t tVar, State state, h.c.e eVar, int i2, boolean[] zArr) {
        super(2, eVar);
        this.f26807d = i2;
        this.f26805b = tVar;
        this.f26806c = state;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    m(t tVar, com.waze.ui.r.a.e.b.a aVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f26807d = i2;
        this.f26806c = tVar;
        this.f26805b = aVar;
    }
}
