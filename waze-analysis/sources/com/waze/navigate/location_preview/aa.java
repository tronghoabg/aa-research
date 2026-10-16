package com.waze.navigate.location_preview;

import com.waze.R;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class aa extends h.c.b.a.g implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    int f31479a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ h.g.a.p f31480b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f31481c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    aa(h.g.a.p pVar, h.c.e eVar, int i2) {
        super(1, eVar);
        this.f31481c = i2;
        this.f31480b = pVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(h.c.e eVar) {
        switch (this.f31481c) {
            case 0:
                return new aa(this.f31480b, eVar, 0);
            case 1:
                return new aa(this.f31480b, eVar, 1, (byte[]) null);
            case 2:
                return new aa(this.f31480b, eVar, 2, (char[]) null);
            case 3:
                return new aa(this.f31480b, eVar, 3, (short[]) null);
            case 4:
                return new aa(this.f31480b, eVar, 4, (int[]) null);
            case 5:
                return new aa(this.f31480b, eVar, 5, (boolean[]) null);
            case 6:
                return new aa(this.f31480b, eVar, 6, (float[]) null);
            case 7:
                return new aa(this.f31480b, eVar, 7, (byte[][]) null);
            case 8:
                return new aa(this.f31480b, eVar, 8, (char[][]) null);
            case 9:
                return new aa(this.f31480b, eVar, 9, (short[][]) null);
            case 10:
                return new aa(this.f31480b, eVar, 10, (int[][]) null);
            case 11:
                return new aa(this.f31480b, eVar, 11, (boolean[][]) null);
            case 12:
                return new aa(this.f31480b, eVar, 12, (float[][]) null);
            case 13:
                return new aa(this.f31480b, eVar, 13, (byte[][][]) null);
            case 14:
                return new aa(this.f31480b, eVar, 14, (char[][][]) null);
            case 15:
                return new aa(this.f31480b, eVar, 15, (short[][][]) null);
            case 16:
                return new aa(this.f31480b, eVar, 16, (int[][][]) null);
            default:
                return new aa(this.f31480b, eVar, 17, (boolean[][][]) null);
        }
    }

    @Override // h.g.a.l
    public final /* synthetic */ Object invoke(Object obj) {
        switch (this.f31481c) {
        }
        return ((aa) create((h.c.e) obj)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f31481c) {
            case 0:
                h.c.a.a aVar = h.c.a.a.f48038a;
                if (this.f31479a != 0) {
                    e.b.c.b(obj);
                } else {
                    e.b.c.b(obj);
                    h.g.a.p pVar = this.f31480b;
                    com.waze.ui.m.by byVar = com.waze.ui.m.by.f42842a;
                    this.f31479a = 1;
                    if (pVar.invoke(byVar, this) == aVar) {
                        return aVar;
                    }
                }
                return h.ab.f48028a;
            case 1:
                h.c.a.a aVar2 = h.c.a.a.f48038a;
                if (this.f31479a != 0) {
                    e.b.c.b(obj);
                } else {
                    e.b.c.b(obj);
                    h.g.a.p pVar2 = this.f31480b;
                    com.waze.ui.m.br brVar = com.waze.ui.m.br.f42835a;
                    this.f31479a = 1;
                    if (pVar2.invoke(brVar, this) == aVar2) {
                        return aVar2;
                    }
                }
                return h.ab.f48028a;
            case 2:
                h.c.a.a aVar3 = h.c.a.a.f48038a;
                if (this.f31479a != 0) {
                    e.b.c.b(obj);
                } else {
                    e.b.c.b(obj);
                    h.g.a.p pVar3 = this.f31480b;
                    com.waze.ui.m.ax axVar = com.waze.ui.m.ax.f42801a;
                    this.f31479a = 1;
                    if (pVar3.invoke(axVar, this) == aVar3) {
                        return aVar3;
                    }
                }
                return h.ab.f48028a;
            case 3:
                h.c.a.a aVar4 = h.c.a.a.f48038a;
                if (this.f31479a != 0) {
                    e.b.c.b(obj);
                } else {
                    e.b.c.b(obj);
                    h.g.a.p pVar4 = this.f31480b;
                    com.waze.ui.m.bx bxVar = com.waze.ui.m.bx.f42841a;
                    this.f31479a = 1;
                    if (pVar4.invoke(bxVar, this) == aVar4) {
                        return aVar4;
                    }
                }
                return h.ab.f48028a;
            case 4:
                h.c.a.a aVar5 = h.c.a.a.f48038a;
                if (this.f31479a != 0) {
                    e.b.c.b(obj);
                } else {
                    e.b.c.b(obj);
                    h.g.a.p pVar5 = this.f31480b;
                    com.waze.ui.m.ca caVar = com.waze.ui.m.ca.f42846a;
                    this.f31479a = 1;
                    if (pVar5.invoke(caVar, this) == aVar5) {
                        return aVar5;
                    }
                }
                return h.ab.f48028a;
            case 5:
                h.c.a.a aVar6 = h.c.a.a.f48038a;
                if (this.f31479a != 0) {
                    e.b.c.b(obj);
                } else {
                    e.b.c.b(obj);
                    h.g.a.p pVar6 = this.f31480b;
                    com.waze.ui.m.bk bkVar = com.waze.ui.m.bk.f42827a;
                    this.f31479a = 1;
                    if (pVar6.invoke(bkVar, this) == aVar6) {
                        return aVar6;
                    }
                }
                return h.ab.f48028a;
            case 6:
                h.c.a.a aVar7 = h.c.a.a.f48038a;
                if (this.f31479a != 0) {
                    e.b.c.b(obj);
                } else {
                    e.b.c.b(obj);
                    h.g.a.p pVar7 = this.f31480b;
                    com.waze.ui.m.bt btVar = com.waze.ui.m.bt.f42837a;
                    this.f31479a = 1;
                    if (pVar7.invoke(btVar, this) == aVar7) {
                        return aVar7;
                    }
                }
                return h.ab.f48028a;
            case 7:
                h.c.a.a aVar8 = h.c.a.a.f48038a;
                if (this.f31479a != 0) {
                    e.b.c.b(obj);
                } else {
                    e.b.c.b(obj);
                    h.g.a.p pVar8 = this.f31480b;
                    com.waze.ui.m.av avVar = com.waze.ui.m.av.f42799a;
                    this.f31479a = 1;
                    if (pVar8.invoke(avVar, this) == aVar8) {
                        return aVar8;
                    }
                }
                return h.ab.f48028a;
            case 8:
                h.c.a.a aVar9 = h.c.a.a.f48038a;
                if (this.f31479a != 0) {
                    e.b.c.b(obj);
                } else {
                    e.b.c.b(obj);
                    h.g.a.p pVar9 = this.f31480b;
                    com.waze.ui.m.bw bwVar = com.waze.ui.m.bw.f42840a;
                    this.f31479a = 1;
                    if (pVar9.invoke(bwVar, this) == aVar9) {
                        return aVar9;
                    }
                }
                return h.ab.f48028a;
            case 9:
                h.c.a.a aVar10 = h.c.a.a.f48038a;
                if (this.f31479a != 0) {
                    e.b.c.b(obj);
                } else {
                    e.b.c.b(obj);
                    h.g.a.p pVar10 = this.f31480b;
                    com.waze.ui.m.bv bvVar = com.waze.ui.m.bv.f42839a;
                    this.f31479a = 1;
                    if (pVar10.invoke(bvVar, this) == aVar10) {
                        return aVar10;
                    }
                }
                return h.ab.f48028a;
            case 10:
                h.c.a.a aVar11 = h.c.a.a.f48038a;
                if (this.f31479a != 0) {
                    e.b.c.b(obj);
                } else {
                    e.b.c.b(obj);
                    h.g.a.p pVar11 = this.f31480b;
                    com.waze.ui.m.bu buVar = com.waze.ui.m.bu.f42838a;
                    this.f31479a = 1;
                    if (pVar11.invoke(buVar, this) == aVar11) {
                        return aVar11;
                    }
                }
                return h.ab.f48028a;
            case 11:
                h.c.a.a aVar12 = h.c.a.a.f48038a;
                if (this.f31479a != 0) {
                    e.b.c.b(obj);
                } else {
                    e.b.c.b(obj);
                    h.g.a.p pVar12 = this.f31480b;
                    com.waze.ui.m.aq aqVar = com.waze.ui.m.aq.f42794a;
                    this.f31479a = 1;
                    if (pVar12.invoke(aqVar, this) == aVar12) {
                        return aVar12;
                    }
                }
                return h.ab.f48028a;
            case 12:
                h.c.a.a aVar13 = h.c.a.a.f48038a;
                if (this.f31479a != 0) {
                    e.b.c.b(obj);
                } else {
                    e.b.c.b(obj);
                    h.g.a.p pVar13 = this.f31480b;
                    com.waze.ui.m.bn bnVar = com.waze.ui.m.bn.f42830a;
                    this.f31479a = 1;
                    if (pVar13.invoke(bnVar, this) == aVar13) {
                        return aVar13;
                    }
                }
                return h.ab.f48028a;
            case 13:
                h.c.a.a aVar14 = h.c.a.a.f48038a;
                if (this.f31479a != 0) {
                    e.b.c.b(obj);
                } else {
                    e.b.c.b(obj);
                    h.g.a.p pVar14 = this.f31480b;
                    com.waze.ui.m.bo boVar = new com.waze.ui.m.bo(com.waze.ui.m.z.f43051d, R.string.PLACE_CLOSED_MOVED, R.string.ADD_COMMENT);
                    this.f31479a = 1;
                    if (pVar14.invoke(boVar, this) == aVar14) {
                        return aVar14;
                    }
                }
                return h.ab.f48028a;
            case 14:
                h.c.a.a aVar15 = h.c.a.a.f48038a;
                if (this.f31479a != 0) {
                    e.b.c.b(obj);
                } else {
                    e.b.c.b(obj);
                    h.g.a.p pVar15 = this.f31480b;
                    com.waze.ui.m.bo boVar2 = new com.waze.ui.m.bo(com.waze.ui.m.z.f43052e, R.string.PLACE_INAPPROPRIATE, R.string.THIS_PLACE_IS_INAPPROPRIATE_BECAUSE___);
                    this.f31479a = 1;
                    if (pVar15.invoke(boVar2, this) == aVar15) {
                        return aVar15;
                    }
                }
                return h.ab.f48028a;
            case 15:
                h.c.a.a aVar16 = h.c.a.a.f48038a;
                if (this.f31479a != 0) {
                    e.b.c.b(obj);
                } else {
                    e.b.c.b(obj);
                    h.g.a.p pVar16 = this.f31480b;
                    com.waze.ui.m.bo boVar3 = new com.waze.ui.m.bo(com.waze.ui.m.z.f43053f, R.string.PLACE_WRONG, R.string.THE_DETAILS_ARE_WRONG_BECAUSE___);
                    this.f31479a = 1;
                    if (pVar16.invoke(boVar3, this) == aVar16) {
                        return aVar16;
                    }
                }
                return h.ab.f48028a;
            case 16:
                h.c.a.a aVar17 = h.c.a.a.f48038a;
                if (this.f31479a != 0) {
                    e.b.c.b(obj);
                } else {
                    e.b.c.b(obj);
                    h.g.a.p pVar17 = this.f31480b;
                    com.waze.ui.m.bq bqVar = com.waze.ui.m.bq.f42834a;
                    this.f31479a = 1;
                    if (pVar17.invoke(bqVar, this) == aVar17) {
                        return aVar17;
                    }
                }
                return h.ab.f48028a;
            default:
                h.c.a.a aVar18 = h.c.a.a.f48038a;
                if (this.f31479a != 0) {
                    e.b.c.b(obj);
                } else {
                    e.b.c.b(obj);
                    h.g.a.p pVar18 = this.f31480b;
                    com.waze.ui.m.bp bpVar = new com.waze.ui.m.bp();
                    this.f31479a = 1;
                    if (pVar18.invoke(bpVar, this) == aVar18) {
                        return aVar18;
                    }
                }
                return h.ab.f48028a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    aa(h.g.a.p pVar, h.c.e eVar, int i2, byte[] bArr) {
        super(1, eVar);
        this.f31481c = i2;
        this.f31480b = pVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    aa(h.g.a.p pVar, h.c.e eVar, int i2, char[] cArr) {
        super(1, eVar);
        this.f31481c = i2;
        this.f31480b = pVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    aa(h.g.a.p pVar, h.c.e eVar, int i2, float[] fArr) {
        super(1, eVar);
        this.f31481c = i2;
        this.f31480b = pVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    aa(h.g.a.p pVar, h.c.e eVar, int i2, int[] iArr) {
        super(1, eVar);
        this.f31481c = i2;
        this.f31480b = pVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    aa(h.g.a.p pVar, h.c.e eVar, int i2, short[] sArr) {
        super(1, eVar);
        this.f31481c = i2;
        this.f31480b = pVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    aa(h.g.a.p pVar, h.c.e eVar, int i2, boolean[] zArr) {
        super(1, eVar);
        this.f31481c = i2;
        this.f31480b = pVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    aa(h.g.a.p pVar, h.c.e eVar, int i2, byte[][] bArr) {
        super(1, eVar);
        this.f31481c = i2;
        this.f31480b = pVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    aa(h.g.a.p pVar, h.c.e eVar, int i2, char[][] cArr) {
        super(1, eVar);
        this.f31481c = i2;
        this.f31480b = pVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    aa(h.g.a.p pVar, h.c.e eVar, int i2, float[][] fArr) {
        super(1, eVar);
        this.f31481c = i2;
        this.f31480b = pVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    aa(h.g.a.p pVar, h.c.e eVar, int i2, int[][] iArr) {
        super(1, eVar);
        this.f31481c = i2;
        this.f31480b = pVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    aa(h.g.a.p pVar, h.c.e eVar, int i2, short[][] sArr) {
        super(1, eVar);
        this.f31481c = i2;
        this.f31480b = pVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    aa(h.g.a.p pVar, h.c.e eVar, int i2, boolean[][] zArr) {
        super(1, eVar);
        this.f31481c = i2;
        this.f31480b = pVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    aa(h.g.a.p pVar, h.c.e eVar, int i2, byte[][][] bArr) {
        super(1, eVar);
        this.f31481c = i2;
        this.f31480b = pVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    aa(h.g.a.p pVar, h.c.e eVar, int i2, char[][][] cArr) {
        super(1, eVar);
        this.f31481c = i2;
        this.f31480b = pVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    aa(h.g.a.p pVar, h.c.e eVar, int i2, int[][][] iArr) {
        super(1, eVar);
        this.f31481c = i2;
        this.f31480b = pVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    aa(h.g.a.p pVar, h.c.e eVar, int i2, short[][][] sArr) {
        super(1, eVar);
        this.f31481c = i2;
        this.f31480b = pVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    aa(h.g.a.p pVar, h.c.e eVar, int i2, boolean[][][] zArr) {
        super(1, eVar);
        this.f31481c = i2;
        this.f31480b = pVar;
    }
}
