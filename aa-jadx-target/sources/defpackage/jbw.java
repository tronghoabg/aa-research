package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class jbw {
    public static final defpackage.yqk a = defpackage.omv.n("CAR.GAL.GAL");
    private static final defpackage.rmd k;
    public final defpackage.jal b;
    public final defpackage.iys c;
    public final defpackage.izs d;
    public int e;
    public defpackage.jbt f;
    public defpackage.xpc g;
    public final java.util.Queue h;
    public defpackage.rvo[] i;
    final defpackage.wyz j;
    private final java.io.Closeable l;
    private iyx m;
    private final defpackage.rmd n;
    private final defpackage.jcy o;
    private final int p;

    static {
        defpackage.rmc rmcVarA = defpackage.rmd.a();
        rmcVarA.c(false);
        k = rmcVarA.a();
    }

    public jbw(defpackage.jbs jbsVar) {
        int i;
        int i2;
        int i3;
        defpackage.wyz wyzVar = new defpackage.wyz(this, null);
        this.j = wyzVar;
        this.e = 0;
        this.h = new java.util.ArrayDeque();
        defpackage.jal jalVar = jbsVar.d;
        this.b = jalVar;
        this.m = jbsVar.e;
        defpackage.rmd rmdVar = (defpackage.rmd) new defpackage.nub(jbsVar.f).i(k);
        this.n = rmdVar;
        this.l = jbsVar.a;
        this.i = null;
        this.c = new defpackage.iys(jbsVar.b, jalVar, jbsVar.t);
        this.o = jbsVar.q;
        int i4 = jbsVar.x;
        this.p = i4;
        java.io.InputStream inputStream = jbsVar.g;
        java.io.OutputStream outputStream = jbsVar.j;
        java.io.Closeable closeable = jbsVar.a;
        defpackage.yqk yqkVar = defpackage.izs.a;
        defpackage.izp izpVar = new defpackage.izp(inputStream, outputStream, closeable);
        izpVar.o = jbsVar.y;
        izpVar.d = defpackage.ysr.aQ(new defpackage.jbr(this, jbsVar, 0));
        java.util.function.BiFunction biFunction = jbsVar.w;
        if (biFunction != null) {
            izpVar.g = biFunction;
        }
        defpackage.jag jagVar = jbsVar.p;
        if (jagVar != null) {
            izpVar.k = jagVar;
        }
        defpackage.jap japVar = jbsVar.r;
        if (japVar != null) {
            defpackage.rit ritVar = defpackage.rit.INSTANCE;
            if (defpackage.acvb.a.fF().j()) {
                izpVar.m = japVar;
            }
        }
        defpackage.xzi xziVar = jbsVar.c;
        if (xziVar != null) {
            izpVar.j = xziVar;
        }
        izpVar.n = i4;
        izpVar.e = jbsVar.d;
        izpVar.h = jbsVar.e;
        izpVar.p = wyzVar;
        izpVar.f = defpackage.rlz.a(rmdVar);
        izpVar.i = jbsVar.b;
        izpVar.l = jbsVar.u;
        defpackage.izs izsVar = new defpackage.izs(izpVar);
        this.d = izsVar;
        defpackage.izk izkVar = new defpackage.izk(0, -128, defpackage.jei.DEFAULT, izsVar, new defpackage.izn(izsVar, 0), izsVar.h, izsVar.n);
        izsVar.b.c(izkVar);
        izsVar.x.put(0, izsVar.n);
        izkVar.h.set(2);
        izsVar.h.p(izkVar);
        izsVar.h.Q();
        izsVar.c[0] = izkVar;
        int i5 = jbsVar.m;
        if (i5 <= 0 || (i = jbsVar.i) <= 0 || (i2 = jbsVar.h) <= 0 || (i3 = jbsVar.n) <= 0) {
            return;
        }
        android.content.res.Resources resources = jbsVar.b.getResources();
        defpackage.jab jabVar = izsVar.g;
        jabVar.g = i(resources, i5);
        jabVar.h = i(resources, i);
        jabVar.i = i(resources, i2);
        jabVar.f = resources.getString(i3);
    }

    static final byte[] i(android.content.res.Resources resources, int i) {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        java.io.InputStream inputStreamOpenRawResource = resources.openRawResource(i);
        byte[] bArr = new byte[1024];
        int i2 = 0;
        while (i2 != -1) {
            try {
                i2 = inputStreamOpenRawResource.read(bArr);
                if (i2 > 0) {
                    byteArrayOutputStream.write(bArr, 0, i2);
                }
            } catch (java.io.IOException unused) {
                a.g().ai(1797).u("Error reading raw resource.");
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    public final int a(defpackage.jbv jbvVar) {
        defpackage.xpa xpaVar;
        defpackage.izd izdVarA;
        int i = 0;
        for (defpackage.rvo rvoVar : this.i) {
            if (rvoVar.d == null && (xpaVar = rvoVar.b) != null && (izdVarA = jbvVar.a(xpaVar)) != null) {
                defpackage.jcy jcyVar = this.o;
                int i2 = this.p;
                defpackage.izs izsVar = this.d;
                int i3 = rvoVar.a;
                if (i2 == 0) {
                    throw null;
                }
                int i4 = i2 - 1;
                if (i4 != 0) {
                    if (i4 != 1) {
                        throw new java.lang.RuntimeException(null, null);
                    }
                    izdVarA = new defpackage.jeb(izdVarA, jcyVar.a, jcyVar.b, new defpackage.mbt(izsVar.x, izsVar.y));
                }
                rvoVar.d = izdVarA;
                rvoVar.b = null;
                i++;
            }
        }
        return i;
    }

    public final void b() {
        defpackage.iys iysVar = this.c;
        synchronized (iysVar.f) {
            iysVar.g = true;
            iysVar.a();
        }
        this.d.c(false);
        java.io.Closeable closeable = this.l;
        if (closeable != null) {
            try {
                closeable.close();
            } catch (java.io.IOException unused) {
            }
        }
    }

    public final void c(java.io.PrintWriter printWriter) {
        java.lang.String strValueOf;
        defpackage.izs izsVar = this.d;
        if (izsVar != null) {
            printWriter.println("\nChannelManager");
            printWriter.println("GalSnoop");
            defpackage.rlz rlzVar = izsVar.u;
            if (rlzVar.e) {
                printWriter.println("GalSnoop message buffer:");
                rlzVar.b(izsVar.v, printWriter);
            } else {
                printWriter.println("GalSnoop disabled");
            }
            defpackage.izk[] izkVarArr = izsVar.c;
            int length = izkVarArr.length;
            for (int i = 0; i < 256; i++) {
                defpackage.izk izkVar = izkVarArr[i];
                if (izkVar != null) {
                    printWriter.println("Channel number: " + izkVar.b);
                    printWriter.println("  priority: " + izkVar.e + "  qosPriority: " + izkVar.f.name());
                    int i2 = izkVar.h.get();
                    int i3 = izf.a;
                    if (i2 == 0) {
                        strValueOf = "CHANNEL_STATE_OPENING_BLOCKED";
                    } else if (i2 == 1) {
                        strValueOf = "CHANNEL_STATE_OPENING";
                    } else if (i2 == 2) {
                        strValueOf = "CHANNEL_STATE_OPEN";
                    } else if (i2 != 3) {
                        strValueOf = i2 != 4 ? java.lang.String.valueOf(i2) : "CHANNEL_STATE_CLOSED";
                    } else {
                        strValueOf = "CHANNEL_STATE_CLOSING";
                    }
                    printWriter.println("  channelState: " + strValueOf + " bytes received: " + izkVar.k.get());
                }
            }
            printWriter.println("Framer");
            defpackage.jae jaeVar = izsVar.b;
            if (jaeVar != null) {
                jaeVar.a(printWriter);
            }
        }
    }

    public final void d(defpackage.xpa xpaVar, boolean z) {
        defpackage.rvo[] rvoVarArr = this.i;
        if (rvoVarArr == null) {
            throw new java.lang.IllegalStateException("Service updated before service discovery");
        }
        for (defpackage.rvo rvoVar : rvoVarArr) {
            if (rvoVar.a == xpaVar.c) {
                java.lang.Object obj = rvoVar.d;
                if (obj instanceof defpackage.izc) {
                    ((defpackage.izc) obj).k(xpaVar);
                    return;
                }
                if (obj != null) {
                    a.h().ai(1794).y("Attempted to update a service that is not updatable: %s", xpaVar);
                    return;
                } else {
                    if (z) {
                        throw new java.lang.IllegalStateException("Service discovery complete, but current service is not discovered.");
                    }
                    a.f().ai(1795).u("Adding service to queue to be processed after service discovery is complete.");
                    this.h.add(xpaVar);
                    return;
                }
            }
        }
        throw new java.lang.IllegalArgumentException("Updating a service that was not registered during service discovery");
    }

    public final void e() {
        this.d.f();
        defpackage.rvo[] rvoVarArr = this.i;
        if (rvoVarArr != null) {
            for (defpackage.rvo rvoVar : rvoVarArr) {
                java.lang.Object obj = rvoVar.c;
                if (obj != null) {
                    ((defpackage.jbq) obj).g();
                }
            }
        }
    }

    public final void f(xiw xiwVar) {
        this.c.b(false, xiwVar);
    }

    public final void g(defpackage.izx izxVar) {
        defpackage.jab jabVar = this.d.g;
        jabVar.q = izxVar;
        jabVar.q.a(jabVar);
        synchronized (jabVar.l) {
            java.util.Queue<android.util.Pair> queue = jabVar.p;
            for (android.util.Pair pair : queue) {
                jabVar.q.c((defpackage.xik) pair.first, ((java.lang.Boolean) pair.second).booleanValue());
            }
            queue.clear();
        }
    }

    public final void h(iyx iyxVar) {
        this.m = iyxVar;
        defpackage.izs izsVar = this.d;
        izsVar.t = iyxVar;
        izsVar.b.e(iyxVar);
        if (iyxVar != null) {
            iyxVar.a(0, 1);
            defpackage.rvo[] rvoVarArr = this.i;
            if (rvoVarArr != null) {
                for (defpackage.rvo rvoVar : rvoVarArr) {
                    java.lang.Object obj = rvoVar.c;
                    if (obj != null) {
                        iyxVar.a(rvoVar.a, ((defpackage.jbq) obj).u);
                    }
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r15v0, types: [ize, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v11, types: [izd, java.lang.Object] */
    public final void j(defpackage.jbt jbtVar) throws java.lang.Throwable {
        java.lang.Object obj;
        defpackage.izr izrVar;
        if (this.f != null) {
            throw new java.lang.IllegalStateException("Can't start services while waiting on services");
        }
        this.f = jbtVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (defpackage.rvo rvoVar : this.i) {
            if (rvoVar.c == null && rvoVar.d != null) {
                if (jbtVar.b(rvoVar.a)) {
                    rvoVar.c = rvoVar.d.b(this.b);
                }
                if (rvoVar.c != null) {
                    arrayList.add(rvoVar);
                    iyx iyxVar = this.m;
                    if (iyxVar != null) {
                        int i = rvoVar.a;
                        java.lang.Object obj2 = rvoVar.c;
                        obj2.getClass();
                        iyxVar.a(i, ((defpackage.jbq) obj2).u);
                    }
                }
            }
        }
        this.e = arrayList.size();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            defpackage.rvo rvoVar2 = (defpackage.rvo) arrayList.get(i2);
            java.lang.Object obj3 = rvoVar2.c;
            obj3.getClass();
            defpackage.izs izsVar = this.d;
            defpackage.jei jeiVarJ = ((defpackage.jbq) obj3).j();
            int i3 = rvoVar2.a;
            ?? r15 = rvoVar2.c;
            r15.getClass();
            r15.getClass();
            int i4 = ((defpackage.jbq) r15).v;
            if (i3 <= 0 || i3 > 255) {
                throw new java.lang.IllegalArgumentException(defpackage.a.bo(i3, "Invalid service ID: "));
            }
            java.lang.Object obj4 = izsVar.d;
            synchronized (obj4) {
                try {
                    defpackage.izr izrVar2 = izsVar.n;
                    if (i4 == 2) {
                        if (izsVar.o == null) {
                            izsVar.j = new android.os.HandlerThread("RxAud", -19);
                            izsVar.j.start();
                            izsVar.o = new defpackage.izr(izsVar, izsVar.j.getLooper());
                        }
                        izrVar = izsVar.o;
                    } else if (i4 == 1) {
                        if (izsVar.q == null) {
                            izsVar.l = new android.os.HandlerThread("RxVid", -8);
                            izsVar.l.start();
                            izsVar.q = new defpackage.izr(izsVar, izsVar.l.getLooper());
                        }
                        izrVar = izsVar.q;
                    } else if (i4 == 3) {
                        if (izsVar.r == null) {
                            izsVar.m = new android.os.HandlerThread("RxSen");
                            izsVar.m.start();
                            izsVar.r = new defpackage.izr(izsVar, izsVar.m.getLooper());
                        }
                        izrVar = izsVar.r;
                    } else if (i4 == 4) {
                        if (izsVar.p == null) {
                            izsVar.k = new android.os.HandlerThread("RxMic", -16);
                            izsVar.k.start();
                            izsVar.p = new defpackage.izr(izsVar, izsVar.k.getLooper());
                        }
                        izrVar = izsVar.p;
                    } else {
                        izrVar = izrVar2;
                    }
                    izsVar.x.put(java.lang.Integer.valueOf(i3), izrVar);
                    obj = obj4;
                    try {
                        defpackage.izk izkVar = new defpackage.izk(i3, 0, jeiVarJ, izsVar, new defpackage.izn(izsVar, i3), r15, izrVar);
                        izsVar.c[i3] = izkVar;
                        ((defpackage.jbq) r15).p(izkVar);
                        izsVar.b.c(izkVar);
                        defpackage.rsi rsiVarB = defpackage.rsi.b(((defpackage.jbq) r15).u);
                        defpackage.rlz rlzVar = izsVar.u;
                        rsiVarB.getClass();
                        rlzVar.g(i3, defpackage.oml.M(rsiVarB));
                        izsVar.b(i3, defpackage.tna.z(rsiVarB));
                        if (!izkVar.h.compareAndSet(4, 0)) {
                            throw new java.lang.IllegalStateException("Channel needs to be closed before it can be opened.");
                        }
                        if (izsVar.e || i4 == 3) {
                            izkVar.b();
                        }
                        arrayList2.add(java.lang.Integer.valueOf(rvoVar2.a));
                        rvoVar2.c.getClass();
                    } catch (java.lang.Throwable th) {
                        th = th;
                        throw th;
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    obj = obj4;
                }
            }
        }
        a.l().ai(1798).w("%d car services started.", arrayList.size());
        if (arrayList.isEmpty()) {
            this.f = null;
            jbtVar.a();
        }
    }
}
