package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class izs {
    public static final defpackage.yqk a = defpackage.omv.n("CAR.GAL.GAL");
    public final defpackage.jae b;
    public defpackage.izk[] c;
    public boolean e;
    public final defpackage.jab g;
    public final defpackage.jbq h;
    final android.os.HandlerThread i;
    public android.os.HandlerThread j;
    public android.os.HandlerThread k;
    public android.os.HandlerThread l;
    public android.os.HandlerThread m;
    final defpackage.izr n;
    public defpackage.izr o;
    public defpackage.izr p;
    public defpackage.izr q;
    public defpackage.izr r;
    public final defpackage.jal s;
    public iyx t;
    public final defpackage.rlz u;
    public final defpackage.jap w;
    public final java.util.Map x;
    public final defpackage.jdg y;
    public final defpackage.wyz z;
    public final java.lang.Object d = new java.lang.Object();
    public final java.util.concurrent.atomic.AtomicBoolean f = new java.util.concurrent.atomic.AtomicBoolean();
    public final android.util.SparseArray v = new android.util.SparseArray();

    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, jdb] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, jdb] */
    public izs(defpackage.izp izpVar) {
        jdm jdlVar;
        defpackage.jbq jeeVar;
        java.util.HashMap map = new java.util.HashMap();
        this.x = map;
        izpVar.d.getClass();
        defpackage.jal jalVar = izpVar.e;
        jalVar.getClass();
        this.s = jalVar;
        defpackage.rlz rlzVar = izpVar.f;
        rlzVar.getClass();
        this.u = rlzVar;
        defpackage.jap japVar = izpVar.m;
        japVar.getClass();
        this.w = japVar;
        defpackage.wyz wyzVar = izpVar.p;
        wyzVar.getClass();
        this.z = wyzVar;
        this.c = new defpackage.izk[256];
        this.t = izpVar.h;
        this.e = false;
        int i = izpVar.n;
        defpackage.jde jdeVar = izpVar.l;
        defpackage.xzi xziVar = izpVar.j;
        if (i == 1) {
            jdlVar = new jdm();
        } else {
            xziVar.getClass();
            jdlVar = new defpackage.jdl(i, jalVar, jdeVar, new java.util.HashMap());
        }
        this.y = jdlVar;
        defpackage.jab jabVar = (defpackage.jab) izpVar.d.fF();
        this.g = jabVar;
        defpackage.fbl fblVar = izpVar.o;
        int i2 = izpVar.n;
        int i3 = i2 - 1;
        if (i2 == 0) {
            throw null;
        }
        if (i3 == 0) {
            jeeVar = jabVar;
        } else {
            if (i3 != 1) {
                throw new java.lang.RuntimeException(null, null);
            }
            jeeVar = new defpackage.jee(jabVar, new defpackage.mbt((java.util.Map) map, (defpackage.jdg) jdlVar), fblVar.a.a(jabVar), fblVar.b.a(jabVar));
        }
        this.h = jeeVar;
        b(0, defpackage.tna.z(defpackage.rsi.CONTROL));
        this.b = (defpackage.jae) a$.ExternalSyntheticApiModelOutline2.m(izpVar.a, this);
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("RxDef");
        this.i = handlerThread;
        handlerThread.start();
        this.n = new defpackage.izr(this, handlerThread.getLooper());
        jabVar.r = this;
        a$.ExternalSyntheticApiModelOutline2.m(izpVar.b, this);
        defpackage.izk[] izkVarArr = this.c;
        int length = izkVarArr.length;
        for (int i4 = 0; i4 < 256; i4++) {
            defpackage.izk izkVar = izkVarArr[i4];
            if (izkVar != null) {
                defpackage.jae jaeVar = this.b;
                jaeVar.getClass();
                jaeVar.c(izkVar);
            }
        }
        a$.ExternalSyntheticApiModelOutline2.m(izpVar.c, this);
        this.u.e();
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
            sb.append("RadioService {");
            defpackage.xoc xocVar = xpaVar.i;
            if (xocVar == null) {
                xocVar = defpackage.xoc.a;
            }
            if ((xocVar.b & 1) != 0) {
                sb.append(" radioConfiguration=[");
                defpackage.xoc xocVar2 = xpaVar.i;
                if (xocVar2 == null) {
                    xocVar2 = defpackage.xoc.a;
                }
                xno xnoVar = xocVar2.c;
                if (xnoVar == null) {
                    xnoVar = xno.a;
                }
                for (xnn xnnVar : xnoVar.b) {
                    sb.append(" { bands=");
                    sb.append(new defpackage.abph(xnnVar.d, xnn.a));
                    sb.append(" hide_empty_group=");
                    sb.append(xnnVar.e);
                    sb.append(" band_scan_action=");
                    sb.append(xnnVar.f);
                    sb.append("}");
                }
                sb.append(" ]");
            }
            sb.append("}");
        } else if ((i & 8192) != 0) {
            defpackage.xqm xqmVar = xpaVar.l;
            if (xqmVar == null) {
                xqmVar = defpackage.xqm.a;
            }
            sb.append("WifiProjectionService {carWifiBssid =");
            sb.append(xqmVar.b);
            sb.append("}");
        } else if ((i & 16384) != 0) {
            sb.append("CarControlService");
        } else if ((32768 & i) != 0) {
            sb.append("CarLocalMediaService");
        } else if ((131072 & i) != 0) {
            sb.append("CarIntentService");
        }
        return sb.toString();
    }

    public final synchronized void b(int i, defpackage.rmh rmhVar) {
        if (this.u.e) {
            this.v.put(i, rmhVar);
        }
    }

    public final void c(boolean z) {
        f();
        this.y.d();
        this.e = false;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        synchronized (this.d) {
            for (int i = 1; i <= 255; i++) {
                defpackage.izk izkVar = this.c[i];
                if (izkVar != null) {
                    arrayList.add(izkVar);
                    this.c[i] = null;
                }
            }
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((defpackage.izk) arrayList.get(i2)).c();
        }
        this.u.f();
        if (z) {
            try {
                this.b.b();
            } catch (java.io.IOException e) {
                a.h().p(e).ai(1678).u("Failed to cleanly flush framer.");
            }
        }
        try {
            this.b.d();
        } catch (java.io.IOException e2) {
            a.f().p(e2).ai(1677).u("Failed to cleanly interrupt framer.");
        }
    }

    public final void d(int i, java.nio.ByteBuffer byteBuffer, boolean z) {
        defpackage.izk izkVar;
        if (this.f.get()) {
            return;
        }
        this.u.c(i, byteBuffer, z);
        synchronized (this.d) {
            izkVar = this.c[i];
        }
        if (izkVar != null) {
            android.os.Handler handler = izkVar.m;
            android.os.Message messageObtainMessage = z ? handler.obtainMessage(1, i, 0, byteBuffer) : handler.obtainMessage(0, i, 0, byteBuffer);
            iyw iywVar = this.t;
            if (iywVar != null) {
                byte[] bArrArray = byteBuffer.array();
                int iArrayOffset = byteBuffer.arrayOffset();
                int iLimit = byteBuffer.limit();
                synchronized (iywVar.b) {
                    int i2 = iywVar.g.get(i, -1);
                    android.util.SparseArray sparseArray = iywVar.c;
                    if (sparseArray.get(i2) != null) {
                        com.google.android.gms.car.CarGalMessage carGalMessage = iywVar.f;
                        carGalMessage.a(java.lang.System.currentTimeMillis(), i, i2, bArrArray, iArrayOffset, iLimit, z);
                        java.util.Iterator it = ((android.util.ArrayMap) sparseArray.get(i2)).keySet().iterator();
                        while (it.hasNext()) {
                            try {
                                ((iyv) it.next()).b.i(carGalMessage);
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
        defpackage.izk izkVar;
        synchronized (this.d) {
            izkVar = this.c[i];
        }
        if (izkVar == null) {
            return;
        }
        android.os.Handler handler = izkVar.m;
        handler.sendMessage(handler.obtainMessage(2, i, i2, null));
    }

    public final void f() {
        this.f.set(true);
        this.h.g();
        this.i.quit();
        android.os.HandlerThread handlerThread = this.j;
        if (handlerThread != null) {
            handlerThread.quit();
        }
        android.os.HandlerThread handlerThread2 = this.k;
        if (handlerThread2 != null) {
            handlerThread2.quit();
        }
        android.os.HandlerThread handlerThread3 = this.l;
        if (handlerThread3 != null) {
            handlerThread3.quit();
        }
        android.os.HandlerThread handlerThread4 = this.m;
        if (handlerThread4 != null) {
            handlerThread4.quit();
        }
        this.w.c();
        this.x.clear();
    }

    public final void g(int i, defpackage.jcu jcuVar, boolean z, boolean z2, defpackage.izu izuVar) {
        if (this.f.get()) {
            jcuVar.close();
            return;
        }
        if (!izuVar.b) {
            defpackage.rlz rlzVar = this.u;
            if (rlzVar.e) {
                rlzVar.d(i, jcuVar.g(), z2);
            }
        }
        defpackage.jcu jcuVarA = this.w.a(i, jcuVar, z2);
        if (jcuVarA != null) {
            h(i, jcuVarA, z, z2, izuVar);
            return;
        }
        int i2 = izuVar.c;
        if (i2 != 0) {
            e(i, i2);
        }
    }

    public final void h(int i, defpackage.jcu jcuVar, boolean z, boolean z2, defpackage.izu izuVar) {
        boolean z3;
        if (this.t != null) {
            java.nio.ByteBuffer byteBufferG = jcuVar.g();
            iyw iywVar = this.t;
            byte[] bArrArray = byteBufferG.array();
            int iArrayOffset = byteBufferG.arrayOffset();
            int iPosition = byteBufferG.position();
            synchronized (iywVar.b) {
                int i2 = iywVar.g.get(i, -1);
                android.util.SparseArray sparseArray = iywVar.c;
                if (sparseArray.get(i2) != null) {
                    com.google.android.gms.car.CarGalMessage carGalMessage = iywVar.f;
                    z3 = z2;
                    carGalMessage.a(java.lang.System.currentTimeMillis(), i, i2, bArrArray, iArrayOffset, iPosition, z3);
                    java.util.Iterator it = ((android.util.ArrayMap) sparseArray.get(i2)).keySet().iterator();
                    while (it.hasNext()) {
                        try {
                            ((iyv) it.next()).b.j(carGalMessage);
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
        defpackage.jae jaeVar = this.b;
        if (jaeVar != null) {
            jaeVar.h(i, jcuVar, z3, izuVar);
            return;
        }
        jcuVar.w();
        short sJ = jcuVar.j();
        throw new java.lang.RuntimeException("Framer is null. Channel: " + i + ", message type: " + ((int) sJ) + ", canFragment: " + z + ", isControlMessage: " + z3 + ", isEncrypted: " + izuVar.a + ", isMediaPayload: " + izuVar.b);
    }
}
