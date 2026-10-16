package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class rtt {
    public static final defpackage.yqk a = defpackage.omv.n("CAR.GAL.GAL");
    public final defpackage.ruf b;
    public com.google.android.gms.car.senderprotocol.Channel[] c;
    public boolean e;
    public final defpackage.rua g;
    public final defpackage.rvj h;
    final android.os.HandlerThread i;
    public android.os.HandlerThread j;
    public android.os.HandlerThread k;
    public android.os.HandlerThread l;
    public android.os.HandlerThread m;
    final defpackage.rts n;
    public defpackage.rts o;
    public defpackage.rts p;
    public defpackage.rts q;
    public final defpackage.run r;
    public rtf s;
    public final defpackage.rlz t;
    public final java.util.Map v;
    public final defpackage.rwh w;
    public final defpackage.mmi x;
    public final defpackage.wyz y;
    public final java.lang.Object d = new java.lang.Object();
    public volatile boolean f = false;
    public final android.util.SparseArray u = new android.util.SparseArray();

    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, ruf] */
    public rtt(defpackage.rtr rtrVar) {
        rwm rwlVar;
        defpackage.rvj rwrVar;
        java.util.HashMap map = new java.util.HashMap();
        this.v = map;
        rtrVar.d.getClass();
        defpackage.run runVar = rtrVar.e;
        runVar.getClass();
        this.r = runVar;
        defpackage.rlz rlzVar = rtrVar.f;
        rlzVar.getClass();
        this.t = rlzVar;
        this.x = rtrVar.k;
        defpackage.wyz wyzVar = rtrVar.l;
        wyzVar.getClass();
        this.y = wyzVar;
        this.c = new com.google.android.gms.car.senderprotocol.Channel[256];
        this.s = null;
        this.e = false;
        int i = rtrVar.j;
        defpackage.xzi xziVar = rtrVar.h;
        if (i == 1) {
            rwlVar = new rwm();
        } else {
            xziVar.getClass();
            rwlVar = new defpackage.rwl(i, runVar, xziVar, new java.util.HashMap());
        }
        this.w = rwlVar;
        defpackage.rua ruaVar = (defpackage.rua) rtrVar.d.fF();
        this.g = ruaVar;
        int i2 = rtrVar.j;
        defpackage.rtp rtpVar = new defpackage.rtp(this, 0);
        int i3 = i2 - 1;
        if (i2 == 0) {
            throw null;
        }
        if (i3 == 0) {
            rwrVar = ruaVar;
        } else {
            if (i3 != 1) {
                throw new java.lang.IllegalArgumentException("Invalid type ".concat(defpackage.ooa.m(i2)));
            }
            rwrVar = new defpackage.rwr(ruaVar, rtpVar, new defpackage.mmi(map, rwlVar));
        }
        this.h = rwrVar;
        b(0, defpackage.tna.z(defpackage.rsi.CONTROL));
        this.b = rtrVar.a.a(this);
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("RxDef");
        this.i = handlerThread;
        handlerThread.start();
        this.n = new defpackage.rts(this, handlerThread.getLooper());
        ruaVar.j = this;
        rtrVar.b.a(this);
        com.google.android.gms.car.senderprotocol.Channel[] channelArr = this.c;
        int length = channelArr.length;
        for (int i4 = 0; i4 < 256; i4++) {
            com.google.android.gms.car.senderprotocol.Channel channel = channelArr[i4];
            if (channel != null) {
                defpackage.ruf rufVar = this.b;
                rufVar.getClass();
                rufVar.c(channel);
            }
        }
        rtrVar.c.a(this);
        this.t.e();
    }

    static java.lang.String a(defpackage.xpa xpaVar) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Service id=");
        sb.append(xpaVar.c);
        sb.append(" type=");
        int i = xpaVar.b;
        if ((i & 2) != 0) {
            sb.append("SensorSourceService {sensors=[");
            defpackage.xoy xoyVar = xpaVar.d;
            if (xoyVar == null) {
                xoyVar = defpackage.xoy.c;
            }
            for (defpackage.xox xoxVar : xoyVar.d) {
                sb.append("type=");
                defpackage.xoz xozVarB = defpackage.xoz.b(xoxVar.b);
                if (xozVarB == null) {
                    xozVarB = defpackage.xoz.SENSOR_LOCATION;
                }
                sb.append(xozVarB.A);
                sb.append(",");
            }
            sb.append("] locationCharacterization=");
            sb.append(xoyVar.e);
            sb.append(" fuelType=");
            sb.append(new defpackage.abph(xoyVar.f, defpackage.xoy.a));
            sb.append(" evConnectorType=");
            sb.append(new defpackage.abph(xoyVar.g, defpackage.xoy.b));
            sb.append("} ");
        } else if ((i & 4) != 0) {
            defpackage.xlp xlpVar = xpaVar.e;
            if (xlpVar == null) {
                xlpVar = defpackage.xlp.a;
            }
            sb.append("MediaSinkService { codec type=");
            defpackage.xlk xlkVarB = defpackage.xlk.b(xlpVar.c);
            if (xlkVarB == null) {
                xlkVarB = defpackage.xlk.MEDIA_CODEC_AUDIO_PCM;
            }
            sb.append(xlkVarB.h);
            if ((xlpVar.b & 2) != 0 && xlpVar.e.size() != 0) {
                sb.append(" audioStreamType=");
                int iAz = defpackage.a.az(xlpVar.d);
                sb.append(iAz != 0 ? iAz : 1);
                for (defpackage.xig xigVar : xlpVar.e) {
                    sb.append(" { samplingRate=");
                    sb.append(xigVar.c);
                    sb.append(" numBits=");
                    sb.append(xigVar.d);
                    sb.append(" channels=");
                    sb.append(xigVar.e);
                    sb.append("}");
                }
            } else if (xlpVar.f.size() != 0) {
                for (defpackage.xqe xqeVar : xlpVar.f) {
                    sb.append(" { codecResolution=");
                    defpackage.xqd xqdVarB = defpackage.xqd.b(xqeVar.c);
                    if (xqdVarB == null) {
                        xqdVarB = defpackage.xqd.VIDEO_800x480;
                    }
                    sb.append(xqdVarB.j);
                    sb.append(" widthMargin=");
                    sb.append(xqeVar.e);
                    sb.append(" heightMargin=");
                    sb.append(xqeVar.f);
                    sb.append(" density=");
                    sb.append(xqeVar.g);
                    sb.append("}");
                }
            }
            sb.append("}");
        } else if ((i & 8) != 0) {
            defpackage.xkx xkxVar = xpaVar.f;
            if (xkxVar == null) {
                xkxVar = defpackage.xkx.b;
            }
            sb.append("InputSourceService { keycodes=[");
            java.util.Iterator<E> it = xkxVar.c.iterator();
            while (it.hasNext()) {
                sb.append((java.lang.Integer) it.next());
                sb.append(",");
            }
            sb.append("]");
            java.util.Iterator<E> it2 = xkxVar.d.iterator();
            while (true) {
                java.lang.Integer numValueOf = null;
                if (!it2.hasNext()) {
                    break;
                }
                defpackage.xkw xkwVar = (defpackage.xkw) it2.next();
                sb.append(" { touchscreen width=");
                sb.append((xkwVar.b & 1) != 0 ? java.lang.Integer.valueOf(xkwVar.c) : null);
                sb.append(" height=");
                if ((xkwVar.b & 2) != 0) {
                    numValueOf = java.lang.Integer.valueOf(xkwVar.d);
                }
                sb.append(numValueOf);
                sb.append(" }");
            }
            for (defpackage.xkv xkvVar : xkxVar.e) {
                sb.append(" { touchpad width=");
                sb.append((xkvVar.b & 1) != 0 ? java.lang.Integer.valueOf(xkvVar.c) : null);
                sb.append(" height=");
                sb.append((xkvVar.b & 2) != 0 ? java.lang.Integer.valueOf(xkvVar.d) : null);
                sb.append(" sensitivity=");
                sb.append((xkvVar.b & 128) != 0 ? java.lang.Integer.valueOf(xkvVar.j) : null);
                sb.append(" }");
            }
            sb.append("}");
        } else if ((i & 16) != 0) {
            defpackage.xlq xlqVar = xpaVar.g;
            if (xlqVar == null) {
                xlqVar = defpackage.xlq.a;
            }
            sb.append("MediaSourceService { codec type=");
            defpackage.xlk xlkVarB2 = defpackage.xlk.b(xlqVar.c);
            if (xlkVarB2 == null) {
                xlkVarB2 = defpackage.xlk.MEDIA_CODEC_AUDIO_PCM;
            }
            sb.append(xlkVarB2.h);
            if ((xlqVar.b & 2) != 0) {
                defpackage.xig xigVar2 = xlqVar.d;
                if (xigVar2 == null) {
                    xigVar2 = defpackage.xig.a;
                }
                sb.append(" samplingRate=");
                sb.append(xigVar2.c);
                sb.append(" numBits=");
                sb.append(xigVar2.d);
                sb.append(" channels=");
                sb.append(xigVar2.e);
            }
            sb.append("}");
        } else if ((i & 32) != 0) {
            defpackage.xiu xiuVar = xpaVar.h;
            if (xiuVar == null) {
                xiuVar = defpackage.xiu.b;
            }
            sb.append("BluetoothService { carAddress=");
            sb.append(xiuVar.c);
            sb.append(" supportedPairingMethods=[");
            java.util.Iterator<T> it3 = new defpackage.abph(xiuVar.d, defpackage.xiu.a).iterator();
            while (it3.hasNext()) {
                sb.append(((defpackage.xiq) it3.next()).f);
                sb.append(",");
            }
            sb.append("]}");
        } else if ((i & 128) != 0) {
            defpackage.xmp xmpVar = xpaVar.j;
            if (xmpVar == null) {
                xmpVar = defpackage.xmp.a;
            }
            sb.append("NavigationStatusService { minimumIntervalMs=");
            sb.append(xmpVar.c);
            sb.append(" type=");
            int iS = defpackage.wva.s(xmpVar.d);
            sb.append(iS != 0 ? iS : 1);
            if ((xmpVar.b & 4) != 0) {
                sb.append(" height=");
                defpackage.xmn xmnVar = xmpVar.e;
                if (xmnVar == null) {
                    xmnVar = defpackage.xmn.a;
                }
                sb.append(xmnVar.c);
                sb.append(" width=");
                defpackage.xmn xmnVar2 = xmpVar.e;
                if (xmnVar2 == null) {
                    xmnVar2 = defpackage.xmn.a;
                }
                sb.append(xmnVar2.d);
                sb.append(" colourDepthBits=");
                defpackage.xmn xmnVar3 = xmpVar.e;
                if (xmnVar3 == null) {
                    xmnVar3 = defpackage.xmn.a;
                }
                sb.append(xmnVar3.e);
            }
            sb.append(" }");
        } else if ((i & 256) != 0) {
            sb.append("MediaPlaybackService");
        } else if ((i & 1024) != 0) {
            sb.append("MediaBrowserService");
        } else if ((i & 512) != 0) {
            sb.append("PhoneStatusService");
        } else if ((i & 2048) != 0) {
            defpackage.xqa xqaVar = xpaVar.k;
            if (xqaVar == null) {
                xqaVar = defpackage.xqa.a;
            }
            sb.append("VendorExtensionService { name=");
            sb.append(xqaVar.c);
            sb.append("}");
        } else if ((i & 4096) != 0) {
            sb.append("NotificationService");
        } else if ((i & 64) != 0) {
            sb.append("RadioService");
        } else if ((i & 8192) != 0) {
            defpackage.xqm xqmVar = xpaVar.l;
            if (xqmVar == null) {
                xqmVar = defpackage.xqm.a;
            }
            sb.append("WifiProjectionService {carWifiBssid =");
            sb.append(xqmVar.b);
            sb.append("}");
        }
        return sb.toString();
    }

    public static void g(android.os.HandlerThread handlerThread) {
        if (handlerThread != null) {
            handlerThread.quitSafely();
            defpackage.ysr.ca(handlerThread);
        }
    }

    public final synchronized void b(int i, defpackage.rmh rmhVar) {
        if (this.t.e) {
            this.u.put(i, rmhVar);
        }
    }

    public final void c(boolean z) {
        f();
        this.w.d();
        this.e = false;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        synchronized (this.d) {
            for (int i = 1; i <= 255; i++) {
                com.google.android.gms.car.senderprotocol.Channel channel = this.c[i];
                if (channel != null) {
                    arrayList.add(channel);
                    this.c[i] = null;
                }
            }
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((com.google.android.gms.car.senderprotocol.Channel) arrayList.get(i2)).d();
        }
        this.t.f();
        if (z) {
            try {
                this.b.b();
            } catch (java.io.IOException unused) {
            }
        }
        try {
            this.b.d();
        } catch (java.io.IOException unused2) {
        }
    }

    public final void d(int i, java.nio.ByteBuffer byteBuffer, boolean z) {
        com.google.android.gms.car.senderprotocol.Channel channel;
        if (this.f) {
            return;
        }
        this.t.c(i, byteBuffer, z);
        synchronized (this.d) {
            channel = this.c[i];
        }
        if (channel != null) {
            android.os.Handler handler = channel.l;
            android.os.Message messageObtainMessage = z ? handler.obtainMessage(1, i, 0, byteBuffer) : handler.obtainMessage(0, i, 0, byteBuffer);
            rte rteVar = this.s;
            if (rteVar != null) {
                byte[] bArrArray = byteBuffer.array();
                int iArrayOffset = byteBuffer.arrayOffset();
                int iLimit = byteBuffer.limit();
                synchronized (rteVar.b) {
                    int i2 = rteVar.g.get(i, -1);
                    android.util.SparseArray sparseArray = rteVar.c;
                    if (sparseArray.get(i2) != null) {
                        com.google.android.gms.car.CarGalMessage carGalMessage = rteVar.f;
                        carGalMessage.a(java.lang.System.currentTimeMillis(), i, i2, bArrArray, iArrayOffset, iLimit, z);
                        java.util.Iterator it = ((android.util.ArrayMap) sparseArray.get(i2)).keySet().iterator();
                        while (it.hasNext()) {
                            try {
                                ((rtd) it.next()).b.i(carGalMessage);
                            } catch (android.os.RemoteException unused) {
                            }
                        }
                    }
                }
            }
            handler.sendMessage(messageObtainMessage);
        }
    }

    public final void e(int i, int i2) {
        com.google.android.gms.car.senderprotocol.Channel channel;
        synchronized (this.d) {
            channel = this.c[i];
        }
        if (channel == null) {
            return;
        }
        android.os.Handler handler = channel.l;
        handler.sendMessage(handler.obtainMessage(2, i, i2, null));
    }

    public final void f() {
        this.f = true;
        this.h.x();
        this.i.quit();
        android.os.HandlerThread handlerThread = this.j;
        if (handlerThread != null) {
            handlerThread.quit();
        }
        android.os.HandlerThread handlerThread2 = this.l;
        if (handlerThread2 != null) {
            handlerThread2.quit();
        }
        android.os.HandlerThread handlerThread3 = this.m;
        if (handlerThread3 != null) {
            handlerThread3.quit();
        }
        this.v.clear();
    }

    public final void h(int i, java.nio.ByteBuffer byteBuffer, boolean z, boolean z2, defpackage.rtu rtuVar) {
        if (this.f) {
            return;
        }
        if (!rtuVar.b) {
            this.t.d(i, byteBuffer, z2);
        }
        if (byteBuffer != null) {
            i(i, byteBuffer, z, z2, rtuVar);
            return;
        }
        int i2 = rtuVar.c;
        if (i2 != 0) {
            e(i, i2);
        }
    }

    public final void i(int i, java.nio.ByteBuffer byteBuffer, boolean z, boolean z2, defpackage.rtu rtuVar) {
        boolean z3;
        rte rteVar = this.s;
        if (rteVar != null) {
            byte[] bArrArray = byteBuffer.array();
            int iArrayOffset = byteBuffer.arrayOffset();
            int iPosition = byteBuffer.position();
            synchronized (rteVar.b) {
                int i2 = rteVar.g.get(i, -1);
                android.util.SparseArray sparseArray = rteVar.c;
                if (sparseArray.get(i2) != null) {
                    com.google.android.gms.car.CarGalMessage carGalMessage = rteVar.f;
                    z3 = z2;
                    carGalMessage.a(java.lang.System.currentTimeMillis(), i, i2, bArrArray, iArrayOffset, iPosition, z3);
                    java.util.Iterator it = ((android.util.ArrayMap) sparseArray.get(i2)).keySet().iterator();
                    while (it.hasNext()) {
                        try {
                            ((rtd) it.next()).b.j(carGalMessage);
                        } catch (android.os.RemoteException unused) {
                        }
                    }
                } else {
                    z3 = z2;
                }
            }
        } else {
            z3 = z2;
        }
        defpackage.ruf rufVar = this.b;
        if (rufVar != null) {
            rufVar.i(i, byteBuffer, z3, rtuVar);
            return;
        }
        byteBuffer.rewind();
        short s = byteBuffer.getShort();
        throw new java.lang.RuntimeException("Framer is null. Channel: " + i + ", message type: " + ((int) s) + ", canFragment: " + z + ", isControlMessage: " + z3 + ", isEncrypted: " + rtuVar.a + ", isMediaPayload: " + rtuVar.b);
    }
}
