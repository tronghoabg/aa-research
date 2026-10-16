package com.waze.main_screen.p.a.b.a;

import androidx.compose.runtime.SnapshotStateKt;
import kotlinx.coroutines.af;
import kotlinx.coroutines.b.ai;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class l extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f26801a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ t f26802b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f26803c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    l(t tVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f26803c = i2;
        this.f26802b = tVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        switch (this.f26803c) {
            case 0:
                return new l(this.f26802b, eVar, 0);
            case 1:
                return new l(this.f26802b, eVar, 1, (byte[]) null);
            case 2:
                return new l(this.f26802b, eVar, 2, (char[]) null);
            case 3:
                return new l(this.f26802b, eVar, 3, (short[]) null);
            case 4:
                return new l(this.f26802b, eVar, 4, (int[]) null);
            case 5:
                return new l(this.f26802b, eVar, 5, (boolean[]) null);
            case 6:
                return new l(this.f26802b, eVar, 6, (float[]) null);
            case 7:
                return new l(this.f26802b, eVar, 7, (byte[][]) null);
            case 8:
                return new l(this.f26802b, eVar, 8, (char[][]) null);
            case 9:
                return new l(this.f26802b, eVar, 9, (short[][]) null);
            case 10:
                return new l(this.f26802b, eVar, 10, (int[][]) null);
            default:
                return new l(this.f26802b, eVar, 11, (boolean[][]) null);
        }
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f26803c) {
        }
        return ((l) create((af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f26803c) {
            case 0:
                h.c.a.a aVar = h.c.a.a.f48038a;
                if (this.f26801a != 0) {
                    e.b.c.b(obj);
                } else {
                    e.b.c.b(obj);
                    this.f26801a = 1;
                    if (this.f26802b.m(this) == aVar) {
                        return aVar;
                    }
                }
                return h.ab.f48028a;
            case 1:
                h.c.a.a aVar2 = h.c.a.a.f48038a;
                if (this.f26801a != 0) {
                    e.b.c.b(obj);
                } else {
                    e.b.c.b(obj);
                    final t tVar = this.f26802b;
                    this.f26801a = 1;
                    Object objCollect = ai.J(ai.y(SnapshotStateKt.snapshotFlow(new h.g.a.a() { // from class: com.waze.main_screen.p.a.b.a.o
                        @Override // h.g.a.a
                        public final Object invoke() {
                            return t.g(tVar);
                        }
                    })), new r(tVar, null)).collect(new s(tVar), this);
                    if (objCollect != aVar2) {
                        objCollect = h.ab.f48028a;
                    }
                    if (objCollect == aVar2) {
                        return aVar2;
                    }
                }
                return h.ab.f48028a;
            case 2:
                h.c.a.a aVar3 = h.c.a.a.f48038a;
                if (this.f26801a != 0) {
                    e.b.c.b(obj);
                } else {
                    e.b.c.b(obj);
                    this.f26801a = 1;
                    if (this.f26802b.n(this) == aVar3) {
                        return aVar3;
                    }
                }
                return h.ab.f48028a;
            case 3:
                h.c.a.a aVar4 = h.c.a.a.f48038a;
                if (this.f26801a != 0) {
                    e.b.c.b(obj);
                } else {
                    e.b.c.b(obj);
                    this.f26801a = 1;
                    if (this.f26802b.q(this) == aVar4) {
                        return aVar4;
                    }
                }
                return h.ab.f48028a;
            case 4:
                h.c.a.a aVar5 = h.c.a.a.f48038a;
                if (this.f26801a != 0) {
                    e.b.c.b(obj);
                } else {
                    e.b.c.b(obj);
                    this.f26801a = 1;
                    if (this.f26802b.v(this) == aVar5) {
                        return aVar5;
                    }
                }
                return h.ab.f48028a;
            case 5:
                h.c.a.a aVar6 = h.c.a.a.f48038a;
                if (this.f26801a != 0) {
                    e.b.c.b(obj);
                } else {
                    e.b.c.b(obj);
                    this.f26801a = 1;
                    if (this.f26802b.t(this) == aVar6) {
                        return aVar6;
                    }
                }
                return h.ab.f48028a;
            case 6:
                h.c.a.a aVar7 = h.c.a.a.f48038a;
                if (this.f26801a != 0) {
                    e.b.c.b(obj);
                } else {
                    e.b.c.b(obj);
                    this.f26801a = 1;
                    if (this.f26802b.r(this) == aVar7) {
                        return aVar7;
                    }
                }
                return h.ab.f48028a;
            case 7:
                h.c.a.a aVar8 = h.c.a.a.f48038a;
                if (this.f26801a != 0) {
                    e.b.c.b(obj);
                } else {
                    e.b.c.b(obj);
                    this.f26801a = 1;
                    if (this.f26802b.p(this) == aVar8) {
                        return aVar8;
                    }
                }
                return h.ab.f48028a;
            case 8:
                h.c.a.a aVar9 = h.c.a.a.f48038a;
                if (this.f26801a != 0) {
                    e.b.c.b(obj);
                } else {
                    e.b.c.b(obj);
                    this.f26801a = 1;
                    if (this.f26802b.u(this) == aVar9) {
                        return aVar9;
                    }
                }
                return h.ab.f48028a;
            case 9:
                h.c.a.a aVar10 = h.c.a.a.f48038a;
                if (this.f26801a != 0) {
                    e.b.c.b(obj);
                } else {
                    e.b.c.b(obj);
                    this.f26801a = 1;
                    if (this.f26802b.r(this) == aVar10) {
                        return aVar10;
                    }
                }
                return h.ab.f48028a;
            case 10:
                h.c.a.a aVar11 = h.c.a.a.f48038a;
                if (this.f26801a != 0) {
                    e.b.c.b(obj);
                } else {
                    e.b.c.b(obj);
                    this.f26801a = 1;
                    if (this.f26802b.p(this) == aVar11) {
                        return aVar11;
                    }
                }
                return h.ab.f48028a;
            default:
                h.c.a.a aVar12 = h.c.a.a.f48038a;
                if (this.f26801a != 0) {
                    e.b.c.b(obj);
                } else {
                    e.b.c.b(obj);
                    this.f26801a = 1;
                    if (this.f26802b.u(this) == aVar12) {
                        return aVar12;
                    }
                }
                return h.ab.f48028a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    l(t tVar, h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f26803c = i2;
        this.f26802b = tVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    l(t tVar, h.c.e eVar, int i2, char[] cArr) {
        super(2, eVar);
        this.f26803c = i2;
        this.f26802b = tVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    l(t tVar, h.c.e eVar, int i2, float[] fArr) {
        super(2, eVar);
        this.f26803c = i2;
        this.f26802b = tVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    l(t tVar, h.c.e eVar, int i2, int[] iArr) {
        super(2, eVar);
        this.f26803c = i2;
        this.f26802b = tVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    l(t tVar, h.c.e eVar, int i2, short[] sArr) {
        super(2, eVar);
        this.f26803c = i2;
        this.f26802b = tVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    l(t tVar, h.c.e eVar, int i2, boolean[] zArr) {
        super(2, eVar);
        this.f26803c = i2;
        this.f26802b = tVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    l(t tVar, h.c.e eVar, int i2, byte[][] bArr) {
        super(2, eVar);
        this.f26803c = i2;
        this.f26802b = tVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    l(t tVar, h.c.e eVar, int i2, char[][] cArr) {
        super(2, eVar);
        this.f26803c = i2;
        this.f26802b = tVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    l(t tVar, h.c.e eVar, int i2, int[][] iArr) {
        super(2, eVar);
        this.f26803c = i2;
        this.f26802b = tVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    l(t tVar, h.c.e eVar, int i2, short[][] sArr) {
        super(2, eVar);
        this.f26803c = i2;
        this.f26802b = tVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    l(t tVar, h.c.e eVar, int i2, boolean[][] zArr) {
        super(2, eVar);
        this.f26803c = i2;
        this.f26802b = tVar;
    }
}
