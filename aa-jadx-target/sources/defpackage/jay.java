package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class jay extends defpackage.jbq {
    private static final defpackage.yqk a = defpackage.omv.n("CAR.GAL.INPUT");
    private final defpackage.jax b;

    public jay(defpackage.jax jaxVar, defpackage.jbu jbuVar) {
        super(8, jaxVar, jbuVar, 1);
        this.b = jaxVar;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0114  */
    /* JADX WARN: Code duplicated, block: B:49:0x0173 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x0175  */
    /* JADX WARN: Code duplicated, block: B:52:0x0184  */
    /* JADX WARN: Code duplicated, block: B:53:0x019c  */
    /* JADX WARN: Code duplicated, block: B:54:0x01a2  */
    @Override // defpackage.jbq
    public final void a(int i, java.nio.ByteBuffer byteBuffer) throws defpackage.abpp {
        boolean z;
        int i2;
        android.util.SparseArray sparseArray;
        ikj ikjVar;
        if (i != 32769) {
            if (i != 32771) {
                a.g().ai(1748).w("Received invalid message type: %d", i);
                return;
            }
            defpackage.abox aboxVarC = defpackage.abox.C(defpackage.xld.a, defpackage.abny.M(byteBuffer), defpackage.abol.a());
            defpackage.abox.U(aboxVarC);
            defpackage.abox.U(aboxVarC);
            a.l().ai(1749).w("Key binding response, status = %d", ((defpackage.xld) aboxVarC).b);
            return;
        }
        defpackage.abor aborVarN = xku.a.n();
        aborVarN.x(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining(), defpackage.abol.a());
        xku xkuVarR = aborVarN.r();
        if (defpackage.abox.S(xkuVarR, true)) {
            xpn xpnVar = xkuVarR.c;
            if (xpnVar == null) {
                xpnVar = xpn.a;
            }
            int size = xpnVar.c.size();
            if (size != 0) {
                int i3 = xpnVar.d;
                if (i3 >= size) {
                    a.h().ai(1746).R("Bad InputReport. Expecting %d got %d%d", java.lang.Integer.valueOf(size), java.lang.Integer.valueOf(i3), 1);
                } else {
                    defpackage.ikh ikhVar = ((defpackage.ikk) this.b).i;
                    ((defpackage.ivc) ikhVar).b.post(new defpackage.inq((defpackage.ivc) ikhVar, defpackage.ikk.i(xpnVar), 8));
                }
            }
            xlg xlgVar = xkuVarR.d;
            if (xlgVar == null) {
                xlgVar = xlg.a;
            }
            for (xlf xlfVar : xlgVar.b) {
                defpackage.jax jaxVar = this.b;
                iwi iwiVar = ((defpackage.ikk) jaxVar).e;
                if (iwiVar != null) {
                    switch (xlfVar.c) {
                        case 19:
                            if (xlfVar.d) {
                                iwiVar.a(iwiVar.c);
                            }
                            break;
                        case 20:
                            if (xlfVar.d) {
                                iwiVar.a(iwiVar.d);
                            }
                            break;
                        case 21:
                            if (xlfVar.d) {
                                iwiVar.a(iwiVar.e);
                            }
                            break;
                        case 22:
                            if (xlfVar.d) {
                                iwiVar.a(iwiVar.f);
                            }
                            break;
                        default:
                            z = xlfVar.d;
                            if (z || !xlfVar.f) {
                                if (z) {
                                    sparseArray = ((defpackage.ikk) jaxVar).f;
                                    ikjVar = (ikj) sparseArray.get(xlfVar.c);
                                    if (ikjVar == null) {
                                        java.lang.Runnable ikjVar2 = new ikj((defpackage.ikk) jaxVar, xlfVar);
                                        sparseArray.put(xlfVar.c, ikjVar2);
                                        ((defpackage.ikk) jaxVar).g.postDelayed(ikjVar2, defpackage.ikk.a);
                                    } else {
                                        i2 = ikjVar.a + 1;
                                        ikjVar.a = i2;
                                    }
                                    ((defpackage.ikk) jaxVar).i.a(xlfVar, 0, i2, j$.time.Duration.ofMillis(android.os.SystemClock.elapsedRealtime()));
                                } else {
                                    android.util.SparseArray sparseArray2 = ((defpackage.ikk) jaxVar).f;
                                    java.lang.Runnable runnable = (ikj) sparseArray2.get(xlfVar.c);
                                    sparseArray2.remove(xlfVar.c);
                                    ((defpackage.ikk) jaxVar).g.removeCallbacks(runnable);
                                }
                                i2 = 0;
                                ((defpackage.ikk) jaxVar).i.a(xlfVar, 0, i2, j$.time.Duration.ofMillis(android.os.SystemClock.elapsedRealtime()));
                            } else {
                                defpackage.abor aborVarK = xlfVar.K();
                                aborVarK.t();
                                xlf xlfVar2 = aborVarK.b;
                                xlfVar2.b |= 8;
                                xlfVar2.f = false;
                                defpackage.ikh ikhVar2 = ((defpackage.ikk) jaxVar).i;
                                aborVarK.t();
                                xlf xlfVar3 = aborVarK.b;
                                xlfVar3.b |= 2;
                                xlfVar3.d = true;
                                ikhVar2.a((xlf) aborVarK.q(), 0, 0, j$.time.Duration.ofMillis(android.os.SystemClock.elapsedRealtime()));
                                aborVarK.t();
                                xlf xlfVar4 = aborVarK.b;
                                xlfVar4.b |= 2;
                                xlfVar4.d = false;
                                ikhVar2.a((xlf) aborVarK.q(), 0, 0, j$.time.Duration.ofMillis(android.os.SystemClock.elapsedRealtime()));
                            }
                            break;
                    }
                } else {
                    z = xlfVar.d;
                    if (z) {
                        if (z) {
                            sparseArray = ((defpackage.ikk) jaxVar).f;
                            ikjVar = (ikj) sparseArray.get(xlfVar.c);
                            if (ikjVar == null) {
                                java.lang.Runnable ikjVar3 = new ikj((defpackage.ikk) jaxVar, xlfVar);
                                sparseArray.put(xlfVar.c, ikjVar3);
                                ((defpackage.ikk) jaxVar).g.postDelayed(ikjVar3, defpackage.ikk.a);
                            } else {
                                i2 = ikjVar.a + 1;
                                ikjVar.a = i2;
                            }
                            ((defpackage.ikk) jaxVar).i.a(xlfVar, 0, i2, j$.time.Duration.ofMillis(android.os.SystemClock.elapsedRealtime()));
                        } else {
                            android.util.SparseArray sparseArray3 = ((defpackage.ikk) jaxVar).f;
                            java.lang.Runnable runnable2 = (ikj) sparseArray3.get(xlfVar.c);
                            sparseArray3.remove(xlfVar.c);
                            ((defpackage.ikk) jaxVar).g.removeCallbacks(runnable2);
                        }
                        i2 = 0;
                        ((defpackage.ikk) jaxVar).i.a(xlfVar, 0, i2, j$.time.Duration.ofMillis(android.os.SystemClock.elapsedRealtime()));
                    } else {
                        if (z) {
                            sparseArray = ((defpackage.ikk) jaxVar).f;
                            ikjVar = (ikj) sparseArray.get(xlfVar.c);
                            if (ikjVar == null) {
                                java.lang.Runnable ikjVar4 = new ikj((defpackage.ikk) jaxVar, xlfVar);
                                sparseArray.put(xlfVar.c, ikjVar4);
                                ((defpackage.ikk) jaxVar).g.postDelayed(ikjVar4, defpackage.ikk.a);
                            } else {
                                i2 = ikjVar.a + 1;
                                ikjVar.a = i2;
                            }
                            ((defpackage.ikk) jaxVar).i.a(xlfVar, 0, i2, j$.time.Duration.ofMillis(android.os.SystemClock.elapsedRealtime()));
                        } else {
                            android.util.SparseArray sparseArray4 = ((defpackage.ikk) jaxVar).f;
                            java.lang.Runnable runnable3 = (ikj) sparseArray4.get(xlfVar.c);
                            sparseArray4.remove(xlfVar.c);
                            ((defpackage.ikk) jaxVar).g.removeCallbacks(runnable3);
                        }
                        i2 = 0;
                        ((defpackage.ikk) jaxVar).i.a(xlfVar, 0, i2, j$.time.Duration.ofMillis(android.os.SystemClock.elapsedRealtime()));
                    }
                }
                a.l().ai(1743).E("Injecting Key code=%d down=%b", xlfVar.c, xlfVar.d);
            }
            if ((xkuVarR.b & 32) != 0) {
                xoq xoqVar = xkuVarR.f;
                if (xoqVar == null) {
                    xoqVar = xoq.a;
                }
                xop xopVar = (xop) xoqVar.b.get(0);
                defpackage.yqk yqkVar = a;
                yqkVar.l().ai(1744).B("Got new relative event keycode=%d value=%d", xopVar.b, xopVar.c);
                if (xopVar.c == 0) {
                    yqkVar.l().ai(1745).u("Ignoring zero delta relative event.");
                } else {
                    defpackage.jax jaxVar2 = this.b;
                    int i4 = ((xop) xoqVar.b.get(0)).b;
                    int i5 = ((xop) xoqVar.b.get(0)).c;
                    if (i4 == 65536) {
                        android.view.MotionEvent.PointerCoords pointerCoords = new android.view.MotionEvent.PointerCoords();
                        pointerCoords.setAxisValue(9, i5);
                        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
                        android.view.MotionEvent motionEventObtain = android.view.MotionEvent.obtain(jElapsedRealtime, jElapsedRealtime, 8, 1, defpackage.ikk.b, new android.view.MotionEvent.PointerCoords[]{pointerCoords}, 0, 0, 1.0f, 1.0f, 0, 0, 8194, 0);
                        defpackage.ikh ikhVar3 = ((defpackage.ikk) jaxVar2).i;
                        ((defpackage.ivc) ikhVar3).b.post(new defpackage.inq((defpackage.ivc) ikhVar3, motionEventObtain, 9));
                    }
                }
            }
            xpn xpnVar2 = xkuVarR.g;
            if (xpnVar2 == null) {
                xpnVar2 = xpn.a;
            }
            int size2 = xpnVar2.c.size();
            if (size2 != 0) {
                int i6 = xpnVar2.d;
                if (i6 >= size2) {
                    a.h().ai(1747).R("Bad TouchPadEvent. Expecting %d got %d%d", java.lang.Integer.valueOf(size2), java.lang.Integer.valueOf(i6), 1);
                } else {
                    this.b.j(xpnVar2);
                }
            }
            if ((xkuVarR.b & 16) != 0) {
                xhy xhyVar = xkuVarR.e;
                if (xhyVar == null) {
                    xhyVar = xhy.a;
                }
                a.l().ai(1742).B("Got abs event keycode=%d value=%d", ((xhx) xhyVar.b.get(0)).b, ((xhx) xhyVar.b.get(0)).c);
                for (xhx xhxVar : xhyVar.b) {
                    defpackage.jax jaxVar3 = this.b;
                    int i7 = xhxVar.b;
                    int i8 = xhxVar.c;
                    if (i7 == 65541) {
                        defpackage.abor aborVarN2 = xlf.a.n();
                        aborVarN2.t();
                        xlf xlfVar5 = aborVarN2.b;
                        xlfVar5.b |= 1;
                        xlfVar5.c = 23;
                        boolean z2 = i8 == 1;
                        aborVarN2.t();
                        xlf xlfVar6 = aborVarN2.b;
                        xlfVar6.b |= 2;
                        xlfVar6.d = z2;
                        aborVarN2.t();
                        xlf xlfVar7 = aborVarN2.b;
                        xlfVar7.b |= 4;
                        xlfVar7.e = 0;
                        xlf xlfVarQ = aborVarN2.q();
                        defpackage.xkv xkvVar = ((defpackage.ikk) jaxVar3).d;
                        if (xkvVar == null || xkvVar.i) {
                            ((defpackage.ikk) jaxVar3).i.a(xlfVarQ, 0, 0, j$.time.Duration.ofMillis(android.os.SystemClock.elapsedRealtime()));
                        } else if (xlfVarQ.d) {
                            if (!((defpackage.ikk) jaxVar3).o) {
                                ((defpackage.ikk) jaxVar3).o = true;
                                java.util.Queue queue = ((defpackage.ikk) jaxVar3).k;
                                ((defpackage.ikk) jaxVar3).n = queue.isEmpty();
                                while (!queue.isEmpty()) {
                                    ((defpackage.ikk) jaxVar3).i.b((android.view.MotionEvent) queue.poll());
                                }
                            }
                            ((defpackage.ikk) jaxVar3).i.a(xlfVarQ, 0, 0, j$.time.Duration.ofMillis(android.os.SystemClock.elapsedRealtime()));
                        } else {
                            ((defpackage.ikk) jaxVar3).i.a(xlfVarQ, 0, 0, j$.time.Duration.ofMillis(android.os.SystemClock.elapsedRealtime()));
                            if (((defpackage.ikk) jaxVar3).n) {
                                ((defpackage.ikk) jaxVar3).n = false;
                                ((defpackage.ikk) jaxVar3).o = false;
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // defpackage.ize
    public final void b(int i) {
    }
}
