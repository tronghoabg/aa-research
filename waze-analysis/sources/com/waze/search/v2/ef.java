package com.waze.search.v2;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ef extends h.c.b.a.g implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ fi f36421a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f36422b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ef(fi fiVar, h.c.e eVar, int i2) {
        super(1, eVar);
        this.f36422b = i2;
        this.f36421a = fiVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(h.c.e eVar) {
        switch (this.f36422b) {
            case 0:
                return new ef(this.f36421a, eVar, 0);
            case 1:
                return new ef(this.f36421a, eVar, 1, (byte[]) null);
            case 2:
                return new ef(this.f36421a, eVar, 2, (char[]) null);
            case 3:
                return new ef(this.f36421a, eVar, 3, (short[]) null);
            case 4:
                return new ef(this.f36421a, eVar, 4, (int[]) null);
            case 5:
                return new ef(this.f36421a, eVar, 5, (boolean[]) null);
            case 6:
                return new ef(this.f36421a, eVar, 6, (float[]) null);
            default:
                return new ef(this.f36421a, eVar, 7, (byte[][]) null);
        }
    }

    @Override // h.g.a.l
    public final /* synthetic */ Object invoke(Object obj) {
        switch (this.f36422b) {
        }
        return ((ef) create((h.c.e) obj)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f36422b) {
            case 0:
                h.c.a.a aVar = h.c.a.a.f48038a;
                e.b.c.b(obj);
                this.f36421a.aa(new ax(new dn(null)));
                break;
            case 1:
                h.c.a.a aVar2 = h.c.a.a.f48038a;
                e.b.c.b(obj);
                this.f36421a.aa(new ax(dm.f36378a));
                break;
            case 2:
                h.c.a.a aVar3 = h.c.a.a.f48038a;
                e.b.c.b(obj);
                this.f36421a.aa(new ax(dl.f36377a));
                break;
            case 3:
                h.c.a.a aVar4 = h.c.a.a.f48038a;
                e.b.c.b(obj);
                this.f36421a.aa(new ax(dk.f36376a));
                break;
            case 4:
                h.c.a.a aVar5 = h.c.a.a.f48038a;
                e.b.c.b(obj);
                this.f36421a.aa(new az(dp.f36380a));
                break;
            case 5:
                h.c.a.a aVar6 = h.c.a.a.f48038a;
                e.b.c.b(obj);
                this.f36421a.aa(new az(dq.f36381a));
                break;
            case 6:
                h.c.a.a aVar7 = h.c.a.a.f48038a;
                e.b.c.b(obj);
                this.f36421a.aa(new az(dr.f36382a));
                break;
            default:
                h.c.a.a aVar8 = h.c.a.a.f48038a;
                e.b.c.b(obj);
                this.f36421a.aa(new ay(""));
                break;
        }
        return h.ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ef(fi fiVar, h.c.e eVar, int i2, byte[] bArr) {
        super(1, eVar);
        this.f36422b = i2;
        this.f36421a = fiVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ef(fi fiVar, h.c.e eVar, int i2, char[] cArr) {
        super(1, eVar);
        this.f36422b = i2;
        this.f36421a = fiVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ef(fi fiVar, h.c.e eVar, int i2, float[] fArr) {
        super(1, eVar);
        this.f36422b = i2;
        this.f36421a = fiVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ef(fi fiVar, h.c.e eVar, int i2, int[] iArr) {
        super(1, eVar);
        this.f36422b = i2;
        this.f36421a = fiVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ef(fi fiVar, h.c.e eVar, int i2, short[] sArr) {
        super(1, eVar);
        this.f36422b = i2;
        this.f36421a = fiVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ef(fi fiVar, h.c.e eVar, int i2, boolean[] zArr) {
        super(1, eVar);
        this.f36422b = i2;
        this.f36421a = fiVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ef(fi fiVar, h.c.e eVar, int i2, byte[][] bArr) {
        super(1, eVar);
        this.f36422b = i2;
        this.f36421a = fiVar;
    }
}
