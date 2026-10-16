package defpackage;

/* loaded from: classes.dex */
public final class bkn {
    public static final bko a;
    public static final bko b;
    public static final bko c;
    public static final bko d;

    static {
        final int i = 1;
        a = new bko() { // from class: bkl
            @Override // defpackage.bko
            public final bkk a(blf blfVar) {
                bkj bkjVar;
                bkj bkjVarY;
                bkj bkjVar2;
                bkj bkjVar3;
                int i2 = i;
                if (i2 == 0) {
                    return bkn.a(blfVar);
                }
                if (i2 == 1) {
                    bkh bkhVar = blfVar.c;
                    return new bkk(bkhVar.a(bkhVar.a), bkhVar.a(bkhVar.b), blfVar.a() == 1);
                }
                if (i2 == 2) {
                    return awx.z(blfVar, bkm.b);
                }
                bkk bkkVar = blfVar.b;
                if (bkkVar == null) {
                    return bkn.a(blfVar);
                }
                boolean z = blfVar.a;
                if (z) {
                    bkjVar = bkkVar.a;
                    bkjVarY = awx.y(blfVar, blfVar.c, bkjVar);
                    bkjVar3 = bkkVar.b;
                    bkjVar2 = bkjVarY;
                } else {
                    bkjVar = bkkVar.b;
                    bkjVarY = awx.y(blfVar, blfVar.c, bkjVar);
                    bkjVar2 = bkkVar.a;
                    bkjVar3 = bkjVarY;
                }
                if (affa.f(bkjVarY, bkjVar)) {
                    return bkkVar;
                }
                bkk bkkVar2 = new bkk(bkjVar2, bkjVar3, blfVar.a() == 1 || (blfVar.a() == 3 && bkjVar2.a > bkjVar3.a));
                bkj bkjVar4 = bkkVar2.b;
                long j = bkjVar4.b;
                bkj bkjVar5 = bkkVar2.a;
                long j2 = bkjVar5.b;
                if (bkjVar5.a == bkjVar4.a) {
                    bkh bkhVar2 = blfVar.c;
                    if (bkhVar2.b().length() != 0) {
                        String strB = bkhVar2.b();
                        int i3 = bkhVar2.a;
                        int length = strB.length();
                        if (i3 == 0) {
                            int iY = asl.Y(strB, 0);
                            return z ? bkk.a(bkkVar2, awx.x(bkjVar5, bkhVar2, iY), null, true, 2) : bkk.a(bkkVar2, null, awx.x(bkjVar4, bkhVar2, iY), false, 1);
                        }
                        if (i3 == length) {
                            int iZ = asl.Z(strB, length);
                            return z ? bkk.a(bkkVar2, awx.x(bkjVar5, bkhVar2, iZ), null, false, 2) : bkk.a(bkkVar2, null, awx.x(bkjVar4, bkhVar2, iZ), true, 1);
                        }
                        boolean z2 = bkkVar.c;
                        int iZ2 = z ^ z2 ? asl.Z(strB, i3) : asl.Y(strB, i3);
                        return z ? bkk.a(bkkVar2, awx.x(bkjVar5, bkhVar2, iZ2), null, z2, 2) : bkk.a(bkkVar2, null, awx.x(bkjVar4, bkhVar2, iZ2), z2, 1);
                    }
                }
                return bkkVar2;
            }
        };
        final int i2 = 0;
        b = new bko() { // from class: bkl
            @Override // defpackage.bko
            public final bkk a(blf blfVar) {
                bkj bkjVar;
                bkj bkjVarY;
                bkj bkjVar2;
                bkj bkjVar3;
                int i22 = i2;
                if (i22 == 0) {
                    return bkn.a(blfVar);
                }
                if (i22 == 1) {
                    bkh bkhVar = blfVar.c;
                    return new bkk(bkhVar.a(bkhVar.a), bkhVar.a(bkhVar.b), blfVar.a() == 1);
                }
                if (i22 == 2) {
                    return awx.z(blfVar, bkm.b);
                }
                bkk bkkVar = blfVar.b;
                if (bkkVar == null) {
                    return bkn.a(blfVar);
                }
                boolean z = blfVar.a;
                if (z) {
                    bkjVar = bkkVar.a;
                    bkjVarY = awx.y(blfVar, blfVar.c, bkjVar);
                    bkjVar3 = bkkVar.b;
                    bkjVar2 = bkjVarY;
                } else {
                    bkjVar = bkkVar.b;
                    bkjVarY = awx.y(blfVar, blfVar.c, bkjVar);
                    bkjVar2 = bkkVar.a;
                    bkjVar3 = bkjVarY;
                }
                if (affa.f(bkjVarY, bkjVar)) {
                    return bkkVar;
                }
                bkk bkkVar2 = new bkk(bkjVar2, bkjVar3, blfVar.a() == 1 || (blfVar.a() == 3 && bkjVar2.a > bkjVar3.a));
                bkj bkjVar4 = bkkVar2.b;
                long j = bkjVar4.b;
                bkj bkjVar5 = bkkVar2.a;
                long j2 = bkjVar5.b;
                if (bkjVar5.a == bkjVar4.a) {
                    bkh bkhVar2 = blfVar.c;
                    if (bkhVar2.b().length() != 0) {
                        String strB = bkhVar2.b();
                        int i3 = bkhVar2.a;
                        int length = strB.length();
                        if (i3 == 0) {
                            int iY = asl.Y(strB, 0);
                            return z ? bkk.a(bkkVar2, awx.x(bkjVar5, bkhVar2, iY), null, true, 2) : bkk.a(bkkVar2, null, awx.x(bkjVar4, bkhVar2, iY), false, 1);
                        }
                        if (i3 == length) {
                            int iZ = asl.Z(strB, length);
                            return z ? bkk.a(bkkVar2, awx.x(bkjVar5, bkhVar2, iZ), null, false, 2) : bkk.a(bkkVar2, null, awx.x(bkjVar4, bkhVar2, iZ), true, 1);
                        }
                        boolean z2 = bkkVar.c;
                        int iZ2 = z ^ z2 ? asl.Z(strB, i3) : asl.Y(strB, i3);
                        return z ? bkk.a(bkkVar2, awx.x(bkjVar5, bkhVar2, iZ2), null, z2, 2) : bkk.a(bkkVar2, null, awx.x(bkjVar4, bkhVar2, iZ2), z2, 1);
                    }
                }
                return bkkVar2;
            }
        };
        final int i3 = 2;
        c = new bko() { // from class: bkl
            @Override // defpackage.bko
            public final bkk a(blf blfVar) {
                bkj bkjVar;
                bkj bkjVarY;
                bkj bkjVar2;
                bkj bkjVar3;
                int i22 = i3;
                if (i22 == 0) {
                    return bkn.a(blfVar);
                }
                if (i22 == 1) {
                    bkh bkhVar = blfVar.c;
                    return new bkk(bkhVar.a(bkhVar.a), bkhVar.a(bkhVar.b), blfVar.a() == 1);
                }
                if (i22 == 2) {
                    return awx.z(blfVar, bkm.b);
                }
                bkk bkkVar = blfVar.b;
                if (bkkVar == null) {
                    return bkn.a(blfVar);
                }
                boolean z = blfVar.a;
                if (z) {
                    bkjVar = bkkVar.a;
                    bkjVarY = awx.y(blfVar, blfVar.c, bkjVar);
                    bkjVar3 = bkkVar.b;
                    bkjVar2 = bkjVarY;
                } else {
                    bkjVar = bkkVar.b;
                    bkjVarY = awx.y(blfVar, blfVar.c, bkjVar);
                    bkjVar2 = bkkVar.a;
                    bkjVar3 = bkjVarY;
                }
                if (affa.f(bkjVarY, bkjVar)) {
                    return bkkVar;
                }
                bkk bkkVar2 = new bkk(bkjVar2, bkjVar3, blfVar.a() == 1 || (blfVar.a() == 3 && bkjVar2.a > bkjVar3.a));
                bkj bkjVar4 = bkkVar2.b;
                long j = bkjVar4.b;
                bkj bkjVar5 = bkkVar2.a;
                long j2 = bkjVar5.b;
                if (bkjVar5.a == bkjVar4.a) {
                    bkh bkhVar2 = blfVar.c;
                    if (bkhVar2.b().length() != 0) {
                        String strB = bkhVar2.b();
                        int i32 = bkhVar2.a;
                        int length = strB.length();
                        if (i32 == 0) {
                            int iY = asl.Y(strB, 0);
                            return z ? bkk.a(bkkVar2, awx.x(bkjVar5, bkhVar2, iY), null, true, 2) : bkk.a(bkkVar2, null, awx.x(bkjVar4, bkhVar2, iY), false, 1);
                        }
                        if (i32 == length) {
                            int iZ = asl.Z(strB, length);
                            return z ? bkk.a(bkkVar2, awx.x(bkjVar5, bkhVar2, iZ), null, false, 2) : bkk.a(bkkVar2, null, awx.x(bkjVar4, bkhVar2, iZ), true, 1);
                        }
                        boolean z2 = bkkVar.c;
                        int iZ2 = z ^ z2 ? asl.Z(strB, i32) : asl.Y(strB, i32);
                        return z ? bkk.a(bkkVar2, awx.x(bkjVar5, bkhVar2, iZ2), null, z2, 2) : bkk.a(bkkVar2, null, awx.x(bkjVar4, bkhVar2, iZ2), z2, 1);
                    }
                }
                return bkkVar2;
            }
        };
        final int i4 = 3;
        d = new bko() { // from class: bkl
            @Override // defpackage.bko
            public final bkk a(blf blfVar) {
                bkj bkjVar;
                bkj bkjVarY;
                bkj bkjVar2;
                bkj bkjVar3;
                int i22 = i4;
                if (i22 == 0) {
                    return bkn.a(blfVar);
                }
                if (i22 == 1) {
                    bkh bkhVar = blfVar.c;
                    return new bkk(bkhVar.a(bkhVar.a), bkhVar.a(bkhVar.b), blfVar.a() == 1);
                }
                if (i22 == 2) {
                    return awx.z(blfVar, bkm.b);
                }
                bkk bkkVar = blfVar.b;
                if (bkkVar == null) {
                    return bkn.a(blfVar);
                }
                boolean z = blfVar.a;
                if (z) {
                    bkjVar = bkkVar.a;
                    bkjVarY = awx.y(blfVar, blfVar.c, bkjVar);
                    bkjVar3 = bkkVar.b;
                    bkjVar2 = bkjVarY;
                } else {
                    bkjVar = bkkVar.b;
                    bkjVarY = awx.y(blfVar, blfVar.c, bkjVar);
                    bkjVar2 = bkkVar.a;
                    bkjVar3 = bkjVarY;
                }
                if (affa.f(bkjVarY, bkjVar)) {
                    return bkkVar;
                }
                bkk bkkVar2 = new bkk(bkjVar2, bkjVar3, blfVar.a() == 1 || (blfVar.a() == 3 && bkjVar2.a > bkjVar3.a));
                bkj bkjVar4 = bkkVar2.b;
                long j = bkjVar4.b;
                bkj bkjVar5 = bkkVar2.a;
                long j2 = bkjVar5.b;
                if (bkjVar5.a == bkjVar4.a) {
                    bkh bkhVar2 = blfVar.c;
                    if (bkhVar2.b().length() != 0) {
                        String strB = bkhVar2.b();
                        int i32 = bkhVar2.a;
                        int length = strB.length();
                        if (i32 == 0) {
                            int iY = asl.Y(strB, 0);
                            return z ? bkk.a(bkkVar2, awx.x(bkjVar5, bkhVar2, iY), null, true, 2) : bkk.a(bkkVar2, null, awx.x(bkjVar4, bkhVar2, iY), false, 1);
                        }
                        if (i32 == length) {
                            int iZ = asl.Z(strB, length);
                            return z ? bkk.a(bkkVar2, awx.x(bkjVar5, bkhVar2, iZ), null, false, 2) : bkk.a(bkkVar2, null, awx.x(bkjVar4, bkhVar2, iZ), true, 1);
                        }
                        boolean z2 = bkkVar.c;
                        int iZ2 = z ^ z2 ? asl.Z(strB, i32) : asl.Y(strB, i32);
                        return z ? bkk.a(bkkVar2, awx.x(bkjVar5, bkhVar2, iZ2), null, z2, 2) : bkk.a(bkkVar2, null, awx.x(bkjVar4, bkhVar2, iZ2), z2, 1);
                    }
                }
                return bkkVar2;
            }
        };
    }

    static final bkk a(blf blfVar) {
        return awx.z(blfVar, bkm.a);
    }
}
