package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class sr {
    public final java.lang.Object a;

    public sr(android.view.View view) {
        if (android.os.Build.VERSION.SDK_INT >= 35) {
            this.a = new eat(view);
        } else {
            this.a = new eau();
        }
    }

    static int A(pwj pwjVar, int i) {
        if (i == 0) {
            i = 0;
        } else if (pwjVar != null) {
            pyt pytVar = pyt.a;
            int i2 = i - 1;
            if (i2 != 8) {
                return i2 != 9 ? 4 : 38;
            }
            return 37;
        }
        if (pwjVar == null) {
            if (i == 0) {
                return 1;
            }
            pyt pytVar2 = pyt.a;
            switch (i - 1) {
                case 1:
                    return 30;
                case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                    return 31;
                case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                    return 32;
                case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                    return 33;
                case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                    return 34;
                case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                    return 35;
                case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                    return 36;
                case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                    return 37;
                case 9:
                    return 38;
                case 10:
                    return 39;
                default:
                    return 29;
            }
        }
        pyt pytVar3 = pyt.a;
        switch (pwjVar.ordinal()) {
            case 1:
                return 5;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                return 6;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
            default:
                return 28;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                return 7;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                return 8;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                return 9;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                return 10;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                return 11;
            case 9:
                return 12;
            case 10:
                return 13;
            case 11:
                return 14;
            case 12:
                return 15;
            case 13:
                return 16;
            case 14:
                return 17;
            case 15:
                return 18;
            case 16:
                return 19;
            case 17:
                return 20;
            case 18:
                return 21;
            case 19:
                return 22;
            case 20:
                return 23;
            case 21:
                return 24;
            case 22:
                return 25;
            case 23:
                return 26;
            case 24:
                return 27;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0046  */
    /* JADX WARN: Type inference failed for: r8v1, types: [aclm, java.lang.Object] */
    public final void B(prq prqVar, prq prqVar2, pyt pytVar, prf prfVar, int i, pwj pwjVar, int i2, j$.time.Duration duration, j$.time.Duration duration2, j$.time.Duration duration3) {
        defpackage.abor aborVarN = zcx.a.n();
        int iOrdinal = prqVar.ordinal();
        int i3 = 3;
        int iA = 1;
        int i4 = iOrdinal != 1 ? iOrdinal != 2 ? 1 : 3 : 2;
        aborVarN.t();
        zcx zcxVar = aborVarN.b;
        zcxVar.d = i4 - 1;
        zcxVar.b |= 2;
        switch (pytVar.ordinal()) {
            case defpackage.abnt.b /* 0 */:
                i3 = 1;
                break;
            case 1:
                i3 = 2;
                break;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                break;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                i3 = 4;
                break;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                i3 = 5;
                break;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                i3 = 6;
                break;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                i3 = 7;
                break;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                i3 = 8;
                break;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                if (prfVar == null) {
                    i3 = 9;
                } else {
                    int iOrdinal2 = prfVar.ordinal();
                    if (iOrdinal2 == 1) {
                        i3 = 13;
                    } else if (iOrdinal2 == 2) {
                        i3 = 14;
                    } else if (iOrdinal2 == 3) {
                        i3 = 15;
                    } else {
                        i3 = 9;
                    }
                }
                break;
            case 9:
                i3 = 10;
                break;
            case 10:
                i3 = 11;
                break;
            case 11:
                i3 = 12;
                break;
            default:
                throw new java.lang.RuntimeException(null, null);
        }
        aborVarN.t();
        zcx zcxVar2 = aborVarN.b;
        zcxVar2.c = i3 - 1;
        zcxVar2.b |= 1;
        aborVarN.t();
        zcx zcxVar3 = aborVarN.b;
        zcxVar3.b |= 4;
        zcxVar3.e = i;
        int iA2 = A(pwjVar, i2);
        aborVarN.t();
        zcx zcxVar4 = aborVarN.b;
        zcxVar4.h = iA2 - 1;
        zcxVar4.b |= 32;
        if (prqVar2 == prq.c && ((i2 == 9 || i2 == 10) && pwjVar != null)) {
            iA = A(pwjVar, 0);
        }
        aborVarN.t();
        zcx zcxVar5 = aborVarN.b;
        zcxVar5.i = iA - 1;
        zcxVar5.b |= 64;
        long millis = duration.toMillis();
        aborVarN.t();
        zcx zcxVar6 = aborVarN.b;
        zcxVar6.b |= 8;
        zcxVar6.f = millis;
        long millis2 = duration2.toMillis();
        aborVarN.t();
        zcx zcxVar7 = aborVarN.b;
        zcxVar7.b |= 16;
        zcxVar7.g = millis2;
        long millis3 = duration3.toMillis();
        aborVarN.t();
        zcx zcxVar8 = aborVarN.b;
        zcxVar8.b |= 128;
        zcxVar8.j = millis3;
        aborVarN.q();
        qcq qcqVar = qcq.a;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [aeba, java.lang.Object] */
    public final aebc C() {
        return new aebc((defpackage.aeba) this.a);
    }

    public final long D(long j) {
        return ((java.util.concurrent.atomic.AtomicLong) this.a).addAndGet(j);
    }

    public final void E(java.lang.Object obj) {
        obj.getClass().getName();
        ((uaq) this.a).d((toz) obj);
    }

    public final java.lang.Object F() {
        return ((uau) this.a).a();
    }

    public final java.lang.String G() {
        return ((uau) this.a).e;
    }

    public final int H(defpackage.erh erhVar) {
        int i;
        zlv.n(erhVar, "building");
        java.lang.Object objAf = erhVar.af();
        java.lang.Object obj = this.a;
        synchronized (obj) {
            acku ackuVar = (acku) ((uaq) obj).a.b.h(objAf);
            i = ackuVar == null ? -1 : ackuVar.a;
        }
        return i == -1 ? erhVar.ad() : i;
    }

    public final defpackage.erh I() {
        uas uasVar;
        java.lang.Object obj = this.a;
        synchronized (obj) {
            uasVar = ((uaq) obj).a.a;
        }
        if (uasVar == null) {
            return null;
        }
        return new defpackage.erh(uasVar);
    }

    public final android.os.Bundle a() {
        android.os.Bundle bundle = new android.os.Bundle();
        java.lang.Object obj = this.a;
        if (obj != null) {
            bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", ((java.lang.Integer) obj).intValue());
        }
        return bundle;
    }

    public final long b() {
        return c(defpackage.tna.aK(Float.MAX_VALUE, Float.MAX_VALUE));
    }

    public final long c(long j) {
        int i = (int) (j >> 32);
        if (java.lang.Float.intBitsToFloat(i) <= 0.0f || java.lang.Float.intBitsToFloat((int) (j & 4294967295L)) <= 0.0f) {
            defpackage.csc.c("maximumVelocity should be a positive value. You specified=".concat(defpackage.dmd.d(j)));
        }
        java.lang.Object obj = this.a;
        ttq ttqVar = (ttq) obj;
        return defpackage.tna.aK(((defpackage.crx) ttqVar.c).a(java.lang.Float.intBitsToFloat(i)), ((defpackage.crx) ttqVar.b).a(java.lang.Float.intBitsToFloat((int) (j & 4294967295L))));
    }

    public final void d(long j, long j2) {
        ((ttq) this.a).n(j, j2);
    }

    public final void e() {
        ((ttq) this.a).o();
    }

    public final float f() {
        return ((android.graphics.PathMeasure) this.a).getLength();
    }

    public final void g(float f, float f2, defpackage.cju cjuVar) {
        if (!(cjuVar instanceof defpackage.cju)) {
            throw new java.lang.UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        ((android.graphics.PathMeasure) this.a).getSegment(f, f2, cjuVar.a, true);
    }

    public final void h(defpackage.cju cjuVar) {
        ((android.graphics.PathMeasure) this.a).setPath(cjuVar.a, false);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [eav, java.lang.Object] */
    public final void i(int i, int i2, int i3, boolean z) {
        this.a.a(i, i2, i3, z);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [eav, java.lang.Object] */
    public final void j(int i, int i2, int i3, int i4) {
        this.a.b(i, i2, i3, i4);
    }

    public final defpackage.dlx k() {
        return defpackage.ckn.f(((android.graphics.Region) this.a).getBounds());
    }

    public final void l(defpackage.dlx dlxVar) {
        ((android.graphics.Region) this.a).set(dlxVar.b, dlxVar.c, dlxVar.d, dlxVar.e);
    }

    public final boolean m() {
        return ((android.graphics.Region) this.a).isEmpty();
    }

    public final void n(defpackage.dlx dlxVar) {
        ((android.graphics.Region) this.a).op(dlxVar.b, dlxVar.c, dlxVar.d, dlxVar.e, android.graphics.Region.Op.DIFFERENCE);
    }

    public final void o(java.lang.String str) {
        ((android.view.ViewStructure) this.a).setClassName(str);
    }

    public final void p(java.lang.CharSequence charSequence) {
        ((android.view.ViewStructure) this.a).setText(charSequence);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [djy, java.lang.Object] */
    public final void q() {
        ((defpackage.fbl) this.a).b.i();
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [djy, java.lang.Object] */
    public final void r() {
        defpackage.fbl fblVar = (defpackage.fbl) this.a;
        if (fblVar.k() != null) {
            fblVar.b.j();
        }
    }

    public final boolean s(defpackage.sr srVar) {
        java.lang.Object obj = srVar.a;
        android.graphics.Region.Op op = android.graphics.Region.Op.INTERSECT;
        return ((android.graphics.Region) this.a).op((android.graphics.Region) obj, op);
    }

    public final boolean t(pzj pzjVar) {
        return pzi.a((android.content.Context) this.a, pzjVar);
    }

    public final synchronized defpackage.ygw u() {
        return defpackage.ygw.o(((defpackage.ycs) this.a).v());
    }

    public final /* synthetic */ pwz v(pxi pxiVar) {
        pxa pxaVar = (pxa) this.a;
        defpackage.aclw aclwVar = pxaVar.b;
        defpackage.aclm aclmVarB = defpackage.acls.b(pxaVar.a);
        pwu pwuVar = (pwu) aclwVar.a();
        defpackage.aclw aclwVar2 = pxaVar.e;
        pxd pxdVar = pxaVar.d;
        qsv qsvVarB = pxaVar.c.b();
        pxc pxcVarB = pxdVar.b();
        pxb pxbVar = (pxb) aclwVar2.a();
        pwp pwpVar = (pwp) pxaVar.f.a();
        pws pwsVar = (pws) pxaVar.g.a();
        defpackage.tmy tmyVar = (defpackage.tmy) pxaVar.h.a();
        uym uymVar = pxaVar.l;
        defpackage.aclw aclwVar3 = pxaVar.k;
        defpackage.aclw aclwVar4 = pxaVar.j;
        java.util.concurrent.Executor executorB = pxaVar.i.b();
        defpackage.aclm aclmVarB2 = defpackage.acls.b(aclwVar4);
        defpackage.aclm aclmVarB3 = defpackage.acls.b(aclwVar3);
        uymVar.b();
        return new pwz(aclmVarB, pwuVar, qsvVarB, pxcVarB, pxbVar, pwpVar, pwsVar, tmyVar, executorB, aclmVarB2, aclmVarB3, pxiVar);
    }

    public final synchronized void w(pwh pwhVar) {
        java.lang.Object obj = this.a;
        ((pwh) obj).a += pwhVar.a;
        ((pwh) obj).b += pwhVar.b;
        ((pwh) obj).c += pwhVar.c;
        ((pwh) obj).d += pwhVar.d;
        ((pwh) obj).e += pwhVar.e;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.List] */
    public final java.nio.ByteBuffer x() {
        ?? r3 = this.a;
        int iRemaining = 0;
        if (r3.isEmpty()) {
            return java.nio.ByteBuffer.allocateDirect(0);
        }
        if (r3.size() == 1) {
            java.nio.ByteBuffer byteBuffer = (java.nio.ByteBuffer) r3.get(0);
            if (byteBuffer.hasRemaining()) {
                byteBuffer.flip();
            }
            r3.clear();
            byteBuffer.position(0);
            return byteBuffer;
        }
        for (java.nio.ByteBuffer byteBuffer2 : r3) {
            byteBuffer2.flip();
            iRemaining += byteBuffer2.remaining();
        }
        java.nio.ByteBuffer byteBufferAllocateDirect = java.nio.ByteBuffer.allocateDirect(iRemaining);
        java.util.Iterator it = r3.iterator();
        while (it.hasNext()) {
            byteBufferAllocateDirect.put((java.nio.ByteBuffer) it.next());
        }
        r3.clear();
        byteBufferAllocateDirect.flip();
        return byteBufferAllocateDirect;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    public final void y(java.nio.ByteBuffer byteBuffer) {
        this.a.add(byteBuffer);
    }

    public final vav z() {
        vaw vawVar = ((vax) this.a).a;
        vawVar.getClass();
        return vawVar;
    }

    public sr(java.lang.Object obj, byte[] bArr) {
        this.a = obj;
    }

    public sr(byte[] bArr, char[] cArr, byte[] bArr2) {
        this.a = "crashloop_startup_dirty_file";
    }

    public sr(short[] sArr, byte[] bArr) {
        this.a = new pwh();
    }

    public sr(so soVar) {
        this.a = androidx.car.app.media.CarAudioCallbackDelegate.create(soVar);
    }

    public sr(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = new defpackage.ydg(12, 3);
    }

    public sr(char[] cArr) {
        this.a = new android.graphics.Region();
    }

    public sr(char[] cArr, byte[] bArr, byte[] bArr2) {
        this.a = new vax();
    }

    public sr() {
        this.a = new androidx.compose.runtime.ParcelableSnapshotMutableState(defpackage.afce.a, defpackage.bxv.c);
    }

    public sr(java.lang.Object obj) {
        this.a = obj;
    }

    public sr(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        int i = defpackage.ygw.d;
        this.a = new vax(defpackage.ymx.a);
    }

    public sr(char[] cArr, byte[] bArr) {
        this.a = new aeul(16);
    }

    public sr(byte[] bArr) {
        this.a = new ttq((byte[]) null);
    }

    public sr(byte[] bArr, byte[] bArr2) {
        this.a = new java.util.Stack();
    }

    public sr(byte[] bArr, char[] cArr) {
        this.a = new java.util.ArrayList();
    }

    public sr(short[] sArr) {
        this.a = defpackage.ysr.r(128);
    }

    public sr(uau uauVar) {
        zlv.n(uauVar, "phoenixIndoorLevel");
        this.a = uauVar;
    }

    public sr(uaq uaqVar) {
        zlv.n(uaqVar, "phoenixIndoorMapController");
        this.a = uaqVar;
    }

    public sr(char[] cArr, char[] cArr2) {
        this.a = new java.util.concurrent.atomic.AtomicLong();
    }

    public sr(byte[] bArr, short[] sArr) {
        this.a = new java.util.ArrayList(20);
    }

    public sr(int[] iArr) {
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MINUTES;
        timeUnit.getClass();
        ajjx ajjxVar = ajjx.a;
        ajkc ajkcVar = ajkc.a;
        ajjxVar.getClass();
        this.a = new ajkp(ajjxVar, timeUnit, ajkcVar);
    }
}
