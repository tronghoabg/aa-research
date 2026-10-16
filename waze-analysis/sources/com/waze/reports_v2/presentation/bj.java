package com.waze.reports_v2.presentation;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class bj extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f34873a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f34874b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f34875c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bj(ConversationalReportingNonFteHintStateHolder conversationalReportingNonFteHintStateHolder, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f34875c = i2;
        this.f34874b = conversationalReportingNonFteHintStateHolder;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        switch (this.f34875c) {
            case 0:
                return new bj((bp) this.f34874b, eVar, 0);
            case 1:
                return new bj((ConversationalReportingNonFteHintStateHolder) this.f34874b, eVar, 1);
            case 2:
                return new bj((bp) this.f34874b, eVar, 2, (byte[]) null);
            case 3:
                return new bj((bp) this.f34874b, eVar, 3, (char[]) null);
            case 4:
                return new bj((bp) this.f34874b, eVar, 4, (short[]) null);
            case 5:
                return new bj((bw) this.f34874b, eVar, 5);
            case 6:
                return new bj((bw) this.f34874b, eVar, 6, (byte[]) null);
            case 7:
                return new bj((bw) this.f34874b, eVar, 7, (char[]) null);
            case 8:
                return new bj((cz) this.f34874b, eVar, 8);
            case 9:
                return new bj((cz) this.f34874b, eVar, 9, (byte[]) null);
            case 10:
                return new bj((cz) this.f34874b, eVar, 10, (char[]) null);
            case 11:
                return new bj((cz) this.f34874b, eVar, 11, (short[]) null);
            case 12:
                return new bj((cz) this.f34874b, eVar, 12, (int[]) null);
            case 13:
                return new bj((cz) this.f34874b, eVar, 13, (boolean[]) null);
            case 14:
                return new bj((cz) this.f34874b, eVar, 14, (float[]) null);
            case 15:
                return new bj((cz) this.f34874b, eVar, 15, (byte[][]) null);
            default:
                return new bj((cz) this.f34874b, eVar, 16, (char[][]) null);
        }
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f34875c) {
        }
        return ((bj) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x02a9, code lost:
    
        if (com.waze.reports_v2.c.ch.a(r1, r2, "ReportMenuFragment", r8, false, r7) == r0) goto L105;
     */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            Method dump skipped, instructions count: 1044
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.reports_v2.presentation.bj.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bj(bp bpVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f34875c = i2;
        this.f34874b = bpVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bj(bp bpVar, h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f34875c = i2;
        this.f34874b = bpVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bj(bp bpVar, h.c.e eVar, int i2, char[] cArr) {
        super(2, eVar);
        this.f34875c = i2;
        this.f34874b = bpVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bj(bp bpVar, h.c.e eVar, int i2, short[] sArr) {
        super(2, eVar);
        this.f34875c = i2;
        this.f34874b = bpVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bj(bw bwVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f34875c = i2;
        this.f34874b = bwVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bj(bw bwVar, h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f34875c = i2;
        this.f34874b = bwVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bj(bw bwVar, h.c.e eVar, int i2, char[] cArr) {
        super(2, eVar);
        this.f34875c = i2;
        this.f34874b = bwVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bj(cz czVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f34875c = i2;
        this.f34874b = czVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bj(cz czVar, h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f34875c = i2;
        this.f34874b = czVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bj(cz czVar, h.c.e eVar, int i2, char[] cArr) {
        super(2, eVar);
        this.f34875c = i2;
        this.f34874b = czVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bj(cz czVar, h.c.e eVar, int i2, float[] fArr) {
        super(2, eVar);
        this.f34875c = i2;
        this.f34874b = czVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bj(cz czVar, h.c.e eVar, int i2, int[] iArr) {
        super(2, eVar);
        this.f34875c = i2;
        this.f34874b = czVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bj(cz czVar, h.c.e eVar, int i2, short[] sArr) {
        super(2, eVar);
        this.f34875c = i2;
        this.f34874b = czVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bj(cz czVar, h.c.e eVar, int i2, boolean[] zArr) {
        super(2, eVar);
        this.f34875c = i2;
        this.f34874b = czVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bj(cz czVar, h.c.e eVar, int i2, byte[][] bArr) {
        super(2, eVar);
        this.f34875c = i2;
        this.f34874b = czVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bj(cz czVar, h.c.e eVar, int i2, char[][] cArr) {
        super(2, eVar);
        this.f34875c = i2;
        this.f34874b = czVar;
    }
}
