package com.waze.bw.c.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ac extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f17773a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ am f17774b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f17775c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ac(am amVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f17775c = i2;
        this.f17774b = amVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        switch (this.f17775c) {
            case 0:
                return new ac(this.f17774b, eVar, 0);
            case 1:
                return new ac(this.f17774b, eVar, 1, (byte[]) null);
            case 2:
                return new ac(this.f17774b, eVar, 2, (char[]) null);
            case 3:
                return new ac(this.f17774b, eVar, 3, (short[]) null);
            case 4:
                return new ac(this.f17774b, eVar, 4, (int[]) null);
            case 5:
                return new ac(this.f17774b, eVar, 5, (boolean[]) null);
            case 6:
                return new ac(this.f17774b, eVar, 6, (float[]) null);
            case 7:
                return new ac(this.f17774b, eVar, 7, (byte[][]) null);
            case 8:
                return new ac(this.f17774b, eVar, 8, (char[][]) null);
            case 9:
                return new ac(this.f17774b, eVar, 9, (short[][]) null);
            case 10:
                return new ac(this.f17774b, eVar, 10, (int[][]) null);
            case 11:
                return new ac(this.f17774b, eVar, 11, (boolean[][]) null);
            case 12:
                return new ac(this.f17774b, eVar, 12, (float[][]) null);
            default:
                return new ac(this.f17774b, eVar, 13, (byte[][][]) null);
        }
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f17775c) {
        }
        return ((ac) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x006e, code lost:
    
        if (com.waze.bw.c.c.am.r(r7.f17774b, (java.util.List) r8, r7) == r0) goto L21;
     */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            Method dump skipped, instructions count: 812
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.bw.c.c.ac.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ac(am amVar, h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f17775c = i2;
        this.f17774b = amVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ac(am amVar, h.c.e eVar, int i2, char[] cArr) {
        super(2, eVar);
        this.f17775c = i2;
        this.f17774b = amVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ac(am amVar, h.c.e eVar, int i2, float[] fArr) {
        super(2, eVar);
        this.f17775c = i2;
        this.f17774b = amVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ac(am amVar, h.c.e eVar, int i2, int[] iArr) {
        super(2, eVar);
        this.f17775c = i2;
        this.f17774b = amVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ac(am amVar, h.c.e eVar, int i2, short[] sArr) {
        super(2, eVar);
        this.f17775c = i2;
        this.f17774b = amVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ac(am amVar, h.c.e eVar, int i2, boolean[] zArr) {
        super(2, eVar);
        this.f17775c = i2;
        this.f17774b = amVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ac(am amVar, h.c.e eVar, int i2, byte[][] bArr) {
        super(2, eVar);
        this.f17775c = i2;
        this.f17774b = amVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ac(am amVar, h.c.e eVar, int i2, char[][] cArr) {
        super(2, eVar);
        this.f17775c = i2;
        this.f17774b = amVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ac(am amVar, h.c.e eVar, int i2, float[][] fArr) {
        super(2, eVar);
        this.f17775c = i2;
        this.f17774b = amVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ac(am amVar, h.c.e eVar, int i2, int[][] iArr) {
        super(2, eVar);
        this.f17775c = i2;
        this.f17774b = amVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ac(am amVar, h.c.e eVar, int i2, short[][] sArr) {
        super(2, eVar);
        this.f17775c = i2;
        this.f17774b = amVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ac(am amVar, h.c.e eVar, int i2, boolean[][] zArr) {
        super(2, eVar);
        this.f17775c = i2;
        this.f17774b = amVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ac(am amVar, h.c.e eVar, int i2, byte[][][] bArr) {
        super(2, eVar);
        this.f17775c = i2;
        this.f17774b = amVar;
    }
}
