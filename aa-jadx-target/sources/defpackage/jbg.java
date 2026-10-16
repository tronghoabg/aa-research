package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class jbg extends defpackage.jdp {
    public static final defpackage.yqk a = defpackage.omv.n("CAR.GAL.MIC");
    public volatile boolean b;
    public volatile int c;
    private final defpackage.jbf e;

    public jbg(defpackage.jbf jbfVar, defpackage.jbu jbuVar) {
        super(jbfVar, jbuVar);
        this.c = 0;
        this.e = jbfVar;
        this.b = false;
    }

    @Override // defpackage.jdp
    public final void h(xlu xluVar) {
        if ((xluVar.b & 2) != 0) {
            this.d = xluVar.d;
        }
        defpackage.jbf jbfVar = this.e;
        if (xluVar.c != 0) {
            ((defpackage.yqj) ((defpackage.yqj) defpackage.ixi.a.g()).ai((char) 1518)).u("onMicrophoneStateChange not ok");
            defpackage.ixi ixiVar = (defpackage.ixi) jbfVar;
            java.util.List<defpackage.ixe> list = ixiVar.e;
            synchronized (list) {
                for (defpackage.ixe ixeVar : list) {
                    ((defpackage.yqj) ((defpackage.yqj) defpackage.ixe.a.h()).ai((char) 1507)).u("onOpenMicError()");
                    ixeVar.d.getAndSet(2);
                    j$.lang.Iterable.-EL.forEach(ixeVar.e, new defpackage.ixc(0));
                    ixeVar.j();
                }
            }
            ixiVar.j.b("MicInputService", defpackage.ouz.MICROPHONE_OPEN_FAILED);
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x005f  */
    @Override // defpackage.jdp
    public final void i(java.nio.ByteBuffer byteBuffer) {
        long j;
        byte bMax;
        iwc iwcVar;
        this.c++;
        if (this.b) {
            defpackage.ixi ixiVar = (defpackage.ixi) this.e;
            ixiVar.f.getAndIncrement();
            ixiVar.f();
            int iPosition = byteBuffer.position();
            int iArrayOffset = byteBuffer.arrayOffset() + iPosition;
            int iLimit = byteBuffer.limit() - iPosition;
            if (iLimit <= 0) {
                ixiVar.j.b("MicInputService", defpackage.ouz.RECEIVED_ZERO_LENGTH_FRAME);
            }
            defpackage.isn isnVar = ixiVar.j;
            byte[] bArrArray = byteBuffer.array();
            defpackage.ysr.ba(iArrayOffset >= 0, "invalid offset %s", iArrayOffset);
            int i = iArrayOffset + iLimit;
            int length = bArrArray.length;
            defpackage.ysr.bh(i <= length, "out of bounds: offset=%s, length=%s, payloadLength=%s", java.lang.Integer.valueOf(iArrayOffset), java.lang.Integer.valueOf(iLimit), java.lang.Integer.valueOf(length));
            if (iLimit < 2) {
                bMax = -128;
                j = 0;
            } else {
                boolean z = true;
                for (int i2 = iArrayOffset; i2 < i; i2++) {
                    z &= bArrArray[i2] == 0;
                }
                if (z) {
                    bMax = -128;
                    j = 0;
                } else {
                    int i3 = iArrayOffset;
                    long jM = 0;
                    while (true) {
                        int i4 = i3 + 1;
                        if (i4 >= i) {
                            break;
                        }
                        short s = (short) (((bArrArray[i4] & 255) << 8) | (bArrArray[i3] & 255));
                        jM = defpackage.ytn.m(jM, s * s);
                        i3 += 2;
                    }
                    j = 0;
                    bMax = (byte) java.lang.Math.max(-127.0d, java.lang.Math.min(java.lang.Math.floor(java.lang.Math.sqrt(jM / ((double) (iLimit >> 1))) / 19.68503937007874d) - 127.0d, 127.0d));
                }
            }
            synchronized (isnVar) {
                ism ismVar = isnVar.b;
                if (ismVar == null) {
                    ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) defpackage.isn.a.h()).q(defpackage.yqi.MEDIUM)).ai(1278)).ab(bMax);
                    isnVar.c.g(defpackage.zbd.xQ);
                } else {
                    int i5 = ismVar.f;
                    if (i5 < 128) {
                        ismVar.m[i5] = bMax;
                    }
                    ismVar.f = i5 + 1;
                    ismVar.e++;
                    ismVar.g += iLimit;
                    long jA = ismVar.h.a(java.util.concurrent.TimeUnit.MILLISECONDS);
                    if (ismVar.e >= 2) {
                        defpackage.ysr.bj(ismVar.i >= j);
                        ismVar.j.b(jA - ismVar.i);
                    }
                    ismVar.i = jA;
                    if (bMax == -128) {
                        ismVar.l++;
                    } else {
                        ismVar.k.b(bMax);
                    }
                }
            }
            java.util.List list = ixiVar.e;
            synchronized (list) {
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((defpackage.ixe) it.next()).c(byteBuffer);
                }
            }
            ixiVar.e();
            if (ixiVar.i && (iwcVar = ixiVar.k) != null) {
                byte[] bArrArray2 = byteBuffer.array();
                java.io.OutputStream outputStream = iwcVar.b;
                if (outputStream != null) {
                    try {
                        outputStream.write(bArrArray2, iArrayOffset, iLimit);
                    } catch (java.io.IOException unused) {
                    }
                }
            }
        }
        int i6 = this.d;
        defpackage.abor aborVarN = xia.a.n();
        aborVarN.t();
        xia xiaVar = aborVarN.b;
        xiaVar.b |= 1;
        xiaVar.c = i6;
        aborVarN.t();
        xia xiaVar2 = aborVarN.b;
        xiaVar2.b = 2 | xiaVar2.b;
        xiaVar2.d = 1;
        k(32772, aborVarN.q());
    }
}
