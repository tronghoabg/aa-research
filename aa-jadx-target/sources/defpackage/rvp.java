package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class rvp {
    public static final defpackage.yqk a = defpackage.omv.n("CAR.GAL.GAL");
    private static final defpackage.rmd i;
    public final defpackage.run b;
    public final defpackage.rtc c;
    public final defpackage.rtt d;
    public int e;
    public defpackage.rvl f;
    public defpackage.rvo[] g;
    final defpackage.wyz h;
    private final java.io.Closeable j;
    private rtf k;
    private final defpackage.rmd l;
    private final int m;

    static {
        defpackage.rmc rmcVarA = defpackage.rmd.a();
        rmcVarA.c(false);
        i = rmcVarA.a();
    }

    public rvp(defpackage.rvk rvkVar) {
        int i2;
        int i3;
        int i4;
        defpackage.wyz wyzVar = new defpackage.wyz(this, null);
        this.h = wyzVar;
        this.e = 0;
        defpackage.run runVar = rvkVar.e;
        this.b = runVar;
        this.k = null;
        defpackage.rmd rmdVar = (defpackage.rmd) new defpackage.nub(rvkVar.f).i(i);
        this.l = rmdVar;
        this.j = rvkVar.b;
        this.g = null;
        this.c = new defpackage.rtc(rvkVar.c, runVar, true);
        int i5 = rvkVar.p;
        this.m = i5;
        java.io.InputStream inputStream = rvkVar.g;
        java.io.OutputStream outputStream = rvkVar.j;
        defpackage.yqk yqkVar = defpackage.rtt.a;
        defpackage.rtr rtrVar = new defpackage.rtr(inputStream, outputStream);
        rtrVar.d = defpackage.ysr.aQ(new defpackage.jbr(this, rvkVar, 8));
        ruh ruhVar = rvkVar.n;
        if (ruhVar != null) {
            rtrVar.i = ruhVar;
        }
        defpackage.xzi xziVar = rvkVar.d;
        if (xziVar != null) {
            rtrVar.h = xziVar;
        }
        rtrVar.j = i5;
        rtrVar.e = rvkVar.e;
        rtrVar.l = wyzVar;
        rtrVar.f = defpackage.rlz.a(rmdVar);
        rtrVar.g = rvkVar.c;
        this.d = new defpackage.rtt(rtrVar);
        java.util.List list = rvkVar.a;
        if (list != null) {
            this.g = new defpackage.rvo[list.size()];
            for (int i6 = 0; i6 < rvkVar.a.size(); i6++) {
                a.f().ai(8368).y("Adding service (%s)", defpackage.rtt.a((defpackage.xpa) rvkVar.a.get(i6)));
                defpackage.rvo[] rvoVarArr = this.g;
                defpackage.rvo rvoVar = new defpackage.rvo();
                rvoVarArr[i6] = rvoVar;
                rvoVar.a = ((defpackage.xpa) rvkVar.a.get(i6)).c;
                this.g[i6].b = (defpackage.xpa) rvkVar.a.get(i6);
            }
        }
        defpackage.rtt rttVar = this.d;
        com.google.android.gms.car.senderprotocol.Channel channel = new com.google.android.gms.car.senderprotocol.Channel(0, -128, defpackage.rws.DEFAULT, rttVar, new defpackage.rtp(rttVar, 0), rttVar.h, rttVar.n);
        rttVar.b.c(channel);
        rttVar.v.put(0, rttVar.n);
        channel.c();
        rttVar.h.p(channel);
        rttVar.h.v();
        rttVar.c[0] = channel;
        int i7 = rvkVar.l;
        if (i7 <= 0 || (i2 = rvkVar.i) <= 0 || (i3 = rvkVar.h) <= 0 || (i4 = rvkVar.m) <= 0) {
            return;
        }
        android.content.res.Resources resources = rvkVar.c.getResources();
        defpackage.rua ruaVar = this.d.g;
        ruaVar.d = l(resources, i7);
        ruaVar.e = l(resources, i2);
        ruaVar.f = l(resources, i3);
        ruaVar.c = resources.getString(i4);
    }

    public static java.lang.Object b(java.lang.Class cls, android.os.IBinder iBinder) {
        ruw ruuVar;
        if (iBinder == null) {
            ruuVar = null;
        } else {
            ruw ruwVarQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.car.senderprotocol.IObjectWrapper");
            ruuVar = ruwVarQueryLocalInterface instanceof ruw ? ruwVarQueryLocalInterface : new ruu(iBinder);
        }
        return cls.cast(ruv.a(ruuVar));
    }

    static final byte[] l(android.content.res.Resources resources, int i2) {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        java.io.InputStream inputStreamOpenRawResource = resources.openRawResource(i2);
        byte[] bArr = new byte[1024];
        int i3 = 0;
        while (i3 != -1) {
            try {
                i3 = inputStreamOpenRawResource.read(bArr);
                if (i3 > 0) {
                    byteArrayOutputStream.write(bArr, 0, i3);
                }
            } catch (java.io.IOException unused) {
                a.g().ai(8371).u("Error reading raw resource.");
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final int a(defpackage.rvn rvnVar) {
        defpackage.xpa xpaVar;
        defpackage.rti rtiVarA;
        int i2 = 0;
        for (defpackage.rvo rvoVar : this.g) {
            if (rvoVar.d == null && (xpaVar = rvoVar.b) != null && (rtiVarA = rvnVar.a(xpaVar)) != null) {
                int i3 = this.m;
                defpackage.rtt rttVar = this.d;
                defpackage.rtp rtpVar = new defpackage.rtp(rttVar, rvoVar.a);
                if (i3 == 0) {
                    throw null;
                }
                int i4 = i3 - 1;
                if (i4 != 0) {
                    if (i4 != 1) {
                        throw new java.lang.IllegalArgumentException("Invalid type ".concat(defpackage.ooa.m(i3)));
                    }
                    rtiVarA = new defpackage.rwn(rtiVarA, rtpVar, new defpackage.mmi(rttVar.v, rttVar.w));
                }
                rvoVar.d = rtiVarA;
                rvoVar.b = null;
                i2++;
            }
        }
        return i2;
    }

    public final java.util.List c() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (defpackage.rvo rvoVar : this.g) {
            defpackage.xpa xpaVar = rvoVar.b;
            if (xpaVar != null) {
                arrayList.add(xpaVar.h());
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0149 A[Catch: all -> 0x019d, TryCatch #2 {, blocks: (B:51:0x0144, B:53:0x0149, B:54:0x014c, B:64:0x0195, B:65:0x019c), top: B:82:0x0144, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0153 A[Catch: all -> 0x01a2, TryCatch #0 {all -> 0x01a2, blocks: (B:49:0x0114, B:50:0x0143, B:55:0x014d, B:59:0x0156, B:58:0x0153, B:68:0x019f, B:69:0x01a0, B:51:0x0144, B:53:0x0149, B:54:0x014c, B:64:0x0195, B:65:0x019c), top: B:79:0x0114, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x016f  */
    /* JADX WARN: Code duplicated, block: B:82:0x0144 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x0195 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x018f A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, rtj] */
    /* JADX WARN: Type inference failed for: r8v10, types: [java.lang.Object, rti] */
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final java.util.List d(defpackage.rvl rvlVar) throws java.lang.Throwable {
        java.lang.Object obj;
        defpackage.rts rtsVar;
        defpackage.rts rtsVar2;
        com.google.android.gms.car.senderprotocol.Channel channel;
        java.lang.Object obj2;
        defpackage.rts rtsVar3;
        if (this.f != null) {
            throw new java.lang.IllegalStateException("Can't start services while waiting on services");
        }
        this.f = rvlVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (defpackage.rvo rvoVar : this.g) {
            if (rvoVar.c == null && rvoVar.d != null) {
                if (rvlVar.c(rvoVar.a)) {
                    rvoVar.c = rvoVar.d.b(this.b);
                }
                if (rvoVar.c != null) {
                    arrayList.add(rvoVar);
                    rtf rtfVar = this.k;
                    if (rtfVar != null) {
                        int i2 = rvoVar.a;
                        java.lang.Object obj3 = rvoVar.c;
                        obj3.getClass();
                        rtfVar.a(i2, ((defpackage.rvj) obj3).m);
                    }
                }
            }
        }
        this.e = arrayList.size();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            defpackage.rvo rvoVar2 = (defpackage.rvo) arrayList.get(i3);
            ?? r14 = rvoVar2.c;
            r14.getClass();
            defpackage.rtt rttVar = this.d;
            defpackage.rvj rvjVar = (defpackage.rvj) r14;
            defpackage.rws rwsVarY = rvjVar.y();
            int i4 = rvoVar2.a;
            r14.getClass();
            r14.getClass();
            int i5 = rvjVar.n;
            java.lang.Object obj4 = rttVar.d;
            synchronized (obj4) {
                try {
                    if (i5 == 2) {
                        try {
                            if (rttVar.o == null) {
                                rttVar.j = new android.os.HandlerThread("RxAud", -19);
                                rttVar.j.start();
                                rttVar.o = new defpackage.rts(rttVar, rttVar.j.getLooper());
                            }
                            rtsVar = rttVar.o;
                        } catch (java.lang.Throwable th) {
                            th = th;
                            obj = obj4;
                            throw th;
                        }
                    } else {
                        if (i5 == 1) {
                            if (rttVar.p == null) {
                                rttVar.l = new android.os.HandlerThread("RxVid", -8);
                                rttVar.l.start();
                                rttVar.p = new defpackage.rts(rttVar, rttVar.l.getLooper());
                            }
                            rtsVar = rttVar.p;
                        } else {
                            if (i5 == 3) {
                                if (rttVar.q == null) {
                                    rttVar.m = new android.os.HandlerThread("RxSen");
                                    rttVar.m.start();
                                    rttVar.q = new defpackage.rts(rttVar, rttVar.m.getLooper());
                                }
                                rtsVar3 = rttVar.q;
                            } else {
                                rtsVar3 = rttVar.n;
                            }
                            rtsVar2 = rtsVar3;
                        }
                        rttVar.v.put(java.lang.Integer.valueOf(i4), rtsVar2);
                        obj = obj4;
                        java.util.ArrayList arrayList3 = arrayList;
                        channel = new com.google.android.gms.car.senderprotocol.Channel(i4, 0, rwsVarY, rttVar, new defpackage.rtp(rttVar, i4), r14, rtsVar2);
                        rttVar.c[i4] = channel;
                        ((defpackage.rvj) r14).p(channel);
                        rttVar.b.c(channel);
                        defpackage.rsi rsiVarB = defpackage.rsi.b(((defpackage.rvj) r14).m);
                        rsiVarB.getClass();
                        rttVar.t.g(i4, defpackage.oml.M(rsiVarB));
                        rttVar.b(i4, defpackage.tna.z(rsiVarB));
                        synchronized (channel.k) {
                            if (channel.h == 4) {
                                throw new java.lang.IllegalStateException("Channel needs to be closed before it can be opened.");
                            }
                            channel.h = 0;
                        }
                        if (rttVar.e || i5 == 3) {
                            channel.b();
                        }
                        arrayList2.add(java.lang.Integer.valueOf(rvoVar2.a));
                        obj2 = rvoVar2.c;
                        obj2.getClass();
                        if (rvlVar.b(((defpackage.rvj) obj2).m)) {
                            a.l().ai(8373).w("Starter requests to force open service %d.", rvoVar2.a);
                            channel.c();
                            java.lang.Object obj5 = rvoVar2.c;
                            obj5.getClass();
                            ((defpackage.rvj) obj5).v();
                        }
                        i3++;
                        arrayList = arrayList3;
                    }
                    channel = new com.google.android.gms.car.senderprotocol.Channel(i4, 0, rwsVarY, rttVar, new defpackage.rtp(rttVar, i4), r14, rtsVar2);
                    rttVar.c[i4] = channel;
                    ((defpackage.rvj) r14).p(channel);
                    rttVar.b.c(channel);
                    defpackage.rsi rsiVarB2 = defpackage.rsi.b(((defpackage.rvj) r14).m);
                    rsiVarB2.getClass();
                    rttVar.t.g(i4, defpackage.oml.M(rsiVarB2));
                    rttVar.b(i4, defpackage.tna.z(rsiVarB2));
                    synchronized (channel.k) {
                        if (channel.h == 4) {
                            throw new java.lang.IllegalStateException("Channel needs to be closed before it can be opened.");
                        }
                        channel.h = 0;
                        if (rttVar.e) {
                            channel.b();
                        } else {
                            channel.b();
                        }
                        arrayList2.add(java.lang.Integer.valueOf(rvoVar2.a));
                        obj2 = rvoVar2.c;
                        obj2.getClass();
                        if (rvlVar.b(((defpackage.rvj) obj2).m)) {
                            a.l().ai(8373).w("Starter requests to force open service %d.", rvoVar2.a);
                            channel.c();
                            java.lang.Object obj6 = rvoVar2.c;
                            obj6.getClass();
                            ((defpackage.rvj) obj6).v();
                        }
                        i3++;
                        arrayList = arrayList3;
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    throw th;
                }
                rtsVar2 = rtsVar;
                rttVar.v.put(java.lang.Integer.valueOf(i4), rtsVar2);
                obj = obj4;
                java.util.ArrayList arrayList4 = arrayList;
            }
        }
        java.util.ArrayList arrayList5 = arrayList;
        a.l().ai(8372).w("%d car services started.", arrayList5.size());
        if (arrayList5.isEmpty()) {
            this.f = null;
            rvlVar.a();
        }
        return arrayList2;
    }

    public final void e() {
        defpackage.rtc rtcVar = this.c;
        synchronized (rtcVar.f) {
            rtcVar.i = true;
            rtcVar.a();
        }
        this.d.c(false);
        java.io.Closeable closeable = this.j;
        if (closeable != null) {
            try {
                closeable.close();
            } catch (java.io.IOException unused) {
            }
        }
    }

    public final void f() {
        this.d.f();
        defpackage.rvo[] rvoVarArr = this.g;
        if (rvoVarArr != null) {
            for (defpackage.rvo rvoVar : rvoVarArr) {
                java.lang.Object obj = rvoVar.c;
                if (obj != null) {
                    ((defpackage.rvj) obj).x();
                }
            }
        }
    }

    public final void g(xiw xiwVar) {
        defpackage.rtc rtcVar = this.c;
        synchronized (rtcVar.f) {
            if (rtcVar.i) {
                defpackage.rtc.a.f().ai(8257).u("Ignoring byebye on released handler");
                return;
            }
            rtcVar.g = new defpackage.stq(android.os.Looper.getMainLooper());
            rtcVar.h = new defpackage.rid(rtcVar, 16, null);
            rtcVar.g.postDelayed(rtcVar.h, 200L);
            rtcVar.d = true;
            defpackage.rtz rtzVar = rtcVar.b;
            if (rtzVar != null) {
                rtzVar.b(xiwVar);
            }
        }
    }

    public final void h(rtf rtfVar) {
        this.k = rtfVar;
        defpackage.rtt rttVar = this.d;
        rttVar.s = rtfVar;
        rttVar.b.e(rtfVar);
        if (rtfVar != null) {
            rtfVar.a(0, 1);
            defpackage.rvo[] rvoVarArr = this.g;
            if (rvoVarArr != null) {
                for (defpackage.rvo rvoVar : rvoVarArr) {
                    java.lang.Object obj = rvoVar.c;
                    if (obj != null) {
                        rtfVar.a(rvoVar.a, ((defpackage.rvj) obj).m);
                    }
                }
            }
        }
    }

    public final void i() {
        a.l().ai(8374).u("startServiceDiscovery");
        defpackage.rtt rttVar = this.d;
        rttVar.b.g();
        defpackage.ruo rtoVar = new rto(rttVar, 1);
        defpackage.ruo rtoVar2 = new rto(rttVar, 0);
        defpackage.mmi mmiVar = rttVar.x;
        ((defpackage.rup) mmiVar.b).b(rtoVar);
        ((defpackage.rup) mmiVar.a).b(rtoVar2);
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:86:0x00b3 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, rxl] */
    public final void j(android.os.Bundle bundle) {
        defpackage.rvu rvuVar;
        java.util.ArrayList arrayList;
        defpackage.rvl rvlVar = this.f;
        if (rvlVar != null) {
            throw new java.lang.IllegalStateException("Can't suspend ProtocolManager:".concat(rvlVar.toString()));
        }
        int i2 = 0;
        while (true) {
            defpackage.rvo[] rvoVarArr = this.g;
            if (i2 < rvoVarArr.length) {
                java.lang.Object obj = rvoVarArr[i2].d;
                if (obj != null) {
                    if (!(obj instanceof sfs)) {
                        throw new java.lang.UnsupportedOperationException("Non-suspendable service ".concat(obj.toString()));
                    }
                    sfs sfsVar = (sfs) obj;
                    synchronized (sfsVar.a) {
                        rvuVar = sfsVar.e;
                    }
                    if (!sfsVar.d) {
                        rvuVar.k(defpackage.xoz.SENSOR_DRIVING_STATUS_DATA, -1L);
                    }
                    synchronized (sfsVar.b) {
                        arrayList = new java.util.ArrayList(sfsVar.c);
                    }
                    int size = arrayList.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        try {
                            ((xfv) arrayList.get(i3)).a.c();
                        } catch (android.os.RemoteException unused) {
                        }
                    }
                }
                i2++;
            } else {
                defpackage.rtt rttVar = this.d;
                defpackage.ruf rufVar = rttVar.b;
                rufVar.h();
                defpackage.rtt.g(rttVar.i);
                defpackage.rtt.g(rttVar.j);
                android.os.HandlerThread handlerThread = rttVar.k;
                defpackage.rtt.g(rttVar.m);
                defpackage.rtt.g(rttVar.l);
                if (rttVar.f || rttVar.e) {
                    throw new java.lang.IllegalStateException("Can't bundle ChannelManager:" + rttVar.f + " " + rttVar.e);
                }
                int length = rttVar.c.length;
                com.google.android.gms.car.senderprotocol.Channel.FlattenedChannel[] flattenedChannelArr = new com.google.android.gms.car.senderprotocol.Channel.FlattenedChannel[256];
                int i4 = 0;
                while (true) {
                    com.google.android.gms.car.senderprotocol.Channel[] channelArr = rttVar.c;
                    int length2 = channelArr.length;
                    if (i4 >= 256) {
                        bundle.putParcelableArray("channels", flattenedChannelArr);
                        rttVar.h.w(bundle);
                        rufVar.a(bundle);
                        bundle.putBinder("connection", new ruv(this.j));
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        java.util.ArrayList<? extends android.os.Parcelable> arrayList3 = new java.util.ArrayList<>();
                        for (defpackage.rvo rvoVar : this.g) {
                            if (rvoVar.b != null) {
                                arrayList2.add(new android.util.Pair(java.lang.Integer.valueOf(rvoVar.a), rvoVar.b.h()));
                            } else if (rvoVar.c != null) {
                                android.os.Bundle bundle2 = new android.os.Bundle();
                                bundle2.putInt("end_point_service_id", rvoVar.a);
                                java.lang.Object obj2 = rvoVar.c;
                                obj2.getClass();
                                ((defpackage.rvj) obj2).w(bundle2);
                                arrayList3.add(bundle2);
                            }
                        }
                        bundle.putBinder("proto_services", new ruv(arrayList2));
                        bundle.putParcelableArrayList("end_points", arrayList3);
                        return;
                    }
                    com.google.android.gms.car.senderprotocol.Channel channel = channelArr[i4];
                    if (channel != null) {
                        int i5 = channel.h;
                        if (i5 == 4) {
                            if (!channel.i) {
                                flattenedChannelArr[i4] = new com.google.android.gms.car.senderprotocol.AutoValue_Channel_FlattenedChannel(channel.b, channel.e, i5, channel.f);
                            }
                        } else if (i5 == 2) {
                            i5 = 2;
                            if (!channel.i) {
                                flattenedChannelArr[i4] = new com.google.android.gms.car.senderprotocol.AutoValue_Channel_FlattenedChannel(channel.b, channel.e, i5, channel.f);
                            }
                        }
                        throw new java.lang.IllegalStateException("Can't flatten channel: " + i5 + " " + channel.i);
                    }
                    i4++;
                }
            }
        }
    }

    public final boolean k() {
        return this.d.g.k.C(new defpackage.rvq(1, 4));
    }
}
