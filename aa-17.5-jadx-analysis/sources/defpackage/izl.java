package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.RemoteException;
import android.util.ArrayMap;
import android.util.SparseArray;
import com.google.android.gms.car.CarGalMessage;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class izl {
    public static final ypf a = ols.R("CAR.GAL.GAL");
    public final izx b;
    public izd[] c;
    public boolean e;
    public final izu g;
    public final jbj h;
    final HandlerThread i;
    public HandlerThread j;
    public HandlerThread k;
    public HandlerThread l;
    public HandlerThread m;
    final izk n;
    public izk o;
    public izk p;
    public izk q;
    public izk r;
    public final jae s;
    public iyq t;
    public final rld u;
    public final jai w;
    public final Map x;
    public final jcz y;
    public final wyd z;
    public final Object d = new Object();
    public final AtomicBoolean f = new AtomicBoolean();
    public final SparseArray v = new SparseArray();

    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, jcu] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, jcu] */
    public izl(izi iziVar) {
        jcz jdeVar;
        jbj jdxVar;
        HashMap map = new HashMap();
        this.x = map;
        iziVar.d.getClass();
        jae jaeVar = iziVar.e;
        jaeVar.getClass();
        this.s = jaeVar;
        rld rldVar = iziVar.f;
        rldVar.getClass();
        this.u = rldVar;
        jai jaiVar = iziVar.m;
        jaiVar.getClass();
        this.w = jaiVar;
        wyd wydVar = iziVar.p;
        wydVar.getClass();
        this.z = wydVar;
        this.c = new izd[256];
        this.t = iziVar.h;
        this.e = false;
        int i = iziVar.n;
        jcx jcxVar = iziVar.l;
        xyc xycVar = iziVar.j;
        if (i == 1) {
            jdeVar = new jdf();
        } else {
            xycVar.getClass();
            jdeVar = new jde(i, jaeVar, jcxVar, new HashMap());
        }
        this.y = jdeVar;
        izu izuVar = (izu) iziVar.d.gu();
        this.g = izuVar;
        fbf fbfVar = iziVar.o;
        int i2 = iziVar.n;
        int i3 = i2 - 1;
        if (i2 == 0) {
            throw null;
        }
        if (i3 == 0) {
            jdxVar = izuVar;
        } else {
            if (i3 != 1) {
                throw new RuntimeException(null, null);
            }
            jdxVar = new jdx(izuVar, new fbf(map, jdeVar), fbfVar.b.a(izuVar), fbfVar.a.a(izuVar));
        }
        this.h = jdxVar;
        b(0, roc.p(rro.CONTROL));
        this.b = (izx) iziVar.a.apply(this);
        HandlerThread handlerThread = new HandlerThread("RxDef");
        this.i = handlerThread;
        handlerThread.start();
        this.n = new izk(this, handlerThread.getLooper());
        izuVar.r = this;
        iziVar.b.apply(this);
        izd[] izdVarArr = this.c;
        int length = izdVarArr.length;
        for (int i4 = 0; i4 < 256; i4++) {
            izd izdVar = izdVarArr[i4];
            if (izdVar != null) {
                izx izxVar = this.b;
                izxVar.getClass();
                izxVar.c(izdVar);
            }
        }
        iziVar.c.apply(this);
        this.u.e();
    }

    static String a(xnz xnzVar) {
        StringBuilder sb = new StringBuilder("Service id=");
        sb.append(xnzVar.c);
        sb.append(" type=");
        int i = xnzVar.b;
        if ((i & 2) != 0) {
            sb.append("SensorSourceService {sensors=[");
            xnx xnxVar = xnzVar.d;
            if (xnxVar == null) {
                xnxVar = xnx.c;
            }
            for (xnw xnwVar : xnxVar.d) {
                sb.append("type=");
                xny xnyVarB = xny.b(xnwVar.b);
                if (xnyVarB == null) {
                    xnyVarB = xny.SENSOR_LOCATION;
                }
                sb.append(xnyVarB.A);
                sb.append(",");
            }
            sb.append("] locationCharacterization=");
            sb.append(xnxVar.e);
            sb.append(" fuelType=");
            sb.append(new abof(xnxVar.f, xnx.a));
            sb.append(" evConnectorType=");
            sb.append(new abof(xnxVar.g, xnx.b));
            sb.append("} ");
        } else if ((i & 4) != 0) {
            xko xkoVar = xnzVar.e;
            if (xkoVar == null) {
                xkoVar = xko.a;
            }
            sb.append("MediaSinkService { codec type=");
            xkj xkjVarB = xkj.b(xkoVar.c);
            if (xkjVarB == null) {
                xkjVarB = xkj.MEDIA_CODEC_AUDIO_PCM;
            }
            sb.append(xkjVarB.h);
            if ((xkoVar.b & 2) != 0 && xkoVar.e.size() != 0) {
                sb.append(" audioStreamType=");
                int iAA = a.aA(xkoVar.d);
                sb.append(iAA != 0 ? iAA : 1);
                for (xhf xhfVar : xkoVar.e) {
                    sb.append(" { samplingRate=");
                    sb.append(xhfVar.c);
                    sb.append(" numBits=");
                    sb.append(xhfVar.d);
                    sb.append(" channels=");
                    sb.append(xhfVar.e);
                    sb.append("}");
                }
            } else if (xkoVar.f.size() != 0) {
                for (xpd xpdVar : xkoVar.f) {
                    sb.append(" { codecResolution=");
                    xpc xpcVarB = xpc.b(xpdVar.c);
                    if (xpcVarB == null) {
                        xpcVarB = xpc.VIDEO_800x480;
                    }
                    sb.append(xpcVarB.j);
                    sb.append(" widthMargin=");
                    sb.append(xpdVar.e);
                    sb.append(" heightMargin=");
                    sb.append(xpdVar.f);
                    sb.append(" density=");
                    sb.append(xpdVar.g);
                    sb.append("}");
                }
            }
            sb.append("}");
        } else if ((i & 8) != 0) {
            xjw xjwVar = xnzVar.f;
            if (xjwVar == null) {
                xjwVar = xjw.b;
            }
            sb.append("InputSourceService { keycodes=[");
            Iterator<E> it = xjwVar.c.iterator();
            while (it.hasNext()) {
                sb.append((Integer) it.next());
                sb.append(",");
            }
            sb.append("]");
            Iterator<E> it2 = xjwVar.d.iterator();
            while (true) {
                Integer numValueOf = null;
                if (!it2.hasNext()) {
                    break;
                }
                xjv xjvVar = (xjv) it2.next();
                sb.append(" { touchscreen width=");
                sb.append((xjvVar.b & 1) != 0 ? Integer.valueOf(xjvVar.c) : null);
                sb.append(" height=");
                if ((xjvVar.b & 2) != 0) {
                    numValueOf = Integer.valueOf(xjvVar.d);
                }
                sb.append(numValueOf);
                sb.append(" }");
            }
            for (xju xjuVar : xjwVar.e) {
                sb.append(" { touchpad width=");
                sb.append((xjuVar.b & 1) != 0 ? Integer.valueOf(xjuVar.c) : null);
                sb.append(" height=");
                sb.append((xjuVar.b & 2) != 0 ? Integer.valueOf(xjuVar.d) : null);
                sb.append(" sensitivity=");
                sb.append((xjuVar.b & 128) != 0 ? Integer.valueOf(xjuVar.j) : null);
                sb.append(" }");
            }
            sb.append("}");
        } else if ((i & 16) != 0) {
            xkp xkpVar = xnzVar.g;
            if (xkpVar == null) {
                xkpVar = xkp.a;
            }
            sb.append("MediaSourceService { codec type=");
            xkj xkjVarB2 = xkj.b(xkpVar.c);
            if (xkjVarB2 == null) {
                xkjVarB2 = xkj.MEDIA_CODEC_AUDIO_PCM;
            }
            sb.append(xkjVarB2.h);
            if ((xkpVar.b & 2) != 0) {
                xhf xhfVar2 = xkpVar.d;
                if (xhfVar2 == null) {
                    xhfVar2 = xhf.a;
                }
                sb.append(" samplingRate=");
                sb.append(xhfVar2.c);
                sb.append(" numBits=");
                sb.append(xhfVar2.d);
                sb.append(" channels=");
                sb.append(xhfVar2.e);
            }
            sb.append("}");
        } else if ((i & 32) != 0) {
            xht xhtVar = xnzVar.h;
            if (xhtVar == null) {
                xhtVar = xht.b;
            }
            sb.append("BluetoothService { carAddress=");
            sb.append(xhtVar.c);
            sb.append(" supportedPairingMethods=[");
            Iterator<T> it3 = new abof(xhtVar.d, xht.a).iterator();
            while (it3.hasNext()) {
                sb.append(((xhp) it3.next()).f);
                sb.append(",");
            }
            sb.append("]}");
        } else if ((i & 128) != 0) {
            xlo xloVar = xnzVar.j;
            if (xloVar == null) {
                xloVar = xlo.a;
            }
            sb.append("NavigationStatusService { minimumIntervalMs=");
            sb.append(xloVar.c);
            sb.append(" type=");
            int iZ = wpq.z(xloVar.d);
            sb.append(iZ != 0 ? iZ : 1);
            if ((xloVar.b & 4) != 0) {
                sb.append(" height=");
                xlm xlmVar = xloVar.e;
                if (xlmVar == null) {
                    xlmVar = xlm.a;
                }
                sb.append(xlmVar.c);
                sb.append(" width=");
                xlm xlmVar2 = xloVar.e;
                if (xlmVar2 == null) {
                    xlmVar2 = xlm.a;
                }
                sb.append(xlmVar2.d);
                sb.append(" colourDepthBits=");
                xlm xlmVar3 = xloVar.e;
                if (xlmVar3 == null) {
                    xlmVar3 = xlm.a;
                }
                sb.append(xlmVar3.e);
            }
            sb.append(" }");
        } else if ((i & 256) != 0) {
            sb.append("MediaPlaybackService");
        } else if ((i & 1024) != 0) {
            sb.append("MediaBrowserService");
        } else if ((i & sk.AUDIO_CONTENT_BUFFER_SIZE) != 0) {
            sb.append("PhoneStatusService");
        } else if ((i & 2048) != 0) {
            xoz xozVar = xnzVar.k;
            if (xozVar == null) {
                xozVar = xoz.a;
            }
            sb.append("VendorExtensionService { name=");
            sb.append(xozVar.c);
            sb.append("}");
        } else if ((i & 4096) != 0) {
            sb.append("NotificationService");
        } else if ((i & 64) != 0) {
            sb.append("RadioService {");
            xnb xnbVar = xnzVar.i;
            if (xnbVar == null) {
                xnbVar = xnb.a;
            }
            if ((xnbVar.b & 1) != 0) {
                sb.append(" radioConfiguration=[");
                xnb xnbVar2 = xnzVar.i;
                if (xnbVar2 == null) {
                    xnbVar2 = xnb.a;
                }
                xmn xmnVar = xnbVar2.c;
                if (xmnVar == null) {
                    xmnVar = xmn.a;
                }
                for (xmm xmmVar : xmnVar.b) {
                    sb.append(" { bands=");
                    sb.append(new abof(xmmVar.d, xmm.a));
                    sb.append(" hide_empty_group=");
                    sb.append(xmmVar.e);
                    sb.append(" band_scan_action=");
                    sb.append(xmmVar.f);
                    sb.append("}");
                }
                sb.append(" ]");
            }
            sb.append("}");
        } else if ((i & 8192) != 0) {
            xpl xplVar = xnzVar.l;
            if (xplVar == null) {
                xplVar = xpl.a;
            }
            sb.append("WifiProjectionService {carWifiBssid =");
            sb.append(xplVar.b);
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

    public final synchronized void b(int i, rll rllVar) {
        if (this.u.e) {
            this.v.put(i, rllVar);
        }
    }

    public final void c(boolean z) {
        f();
        this.y.d();
        this.e = false;
        ArrayList arrayList = new ArrayList();
        synchronized (this.d) {
            for (int i = 1; i <= 255; i++) {
                izd izdVar = this.c[i];
                if (izdVar != null) {
                    arrayList.add(izdVar);
                    this.c[i] = null;
                }
            }
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((izd) arrayList.get(i2)).c();
        }
        this.u.f();
        if (z) {
            try {
                this.b.b();
            } catch (IOException e) {
                a.h().p(e).ai(1678).u("Failed to cleanly flush framer.");
            }
        }
        try {
            this.b.d();
        } catch (IOException e2) {
            a.f().p(e2).ai(1677).u("Failed to cleanly interrupt framer.");
        }
    }

    public final void d(int i, ByteBuffer byteBuffer, boolean z) {
        izd izdVar;
        if (this.f.get()) {
            return;
        }
        this.u.c(i, byteBuffer, z);
        synchronized (this.d) {
            izdVar = this.c[i];
        }
        if (izdVar != null) {
            Handler handler = izdVar.m;
            Message messageObtainMessage = z ? handler.obtainMessage(1, i, 0, byteBuffer) : handler.obtainMessage(0, i, 0, byteBuffer);
            iyq iyqVar = this.t;
            if (iyqVar != null) {
                byte[] bArrArray = byteBuffer.array();
                int iArrayOffset = byteBuffer.arrayOffset();
                int iLimit = byteBuffer.limit();
                synchronized (((iyp) iyqVar).b) {
                    int i2 = ((iyp) iyqVar).g.get(i, -1);
                    SparseArray sparseArray = ((iyp) iyqVar).c;
                    if (sparseArray.get(i2) != null) {
                        CarGalMessage carGalMessage = ((iyp) iyqVar).f;
                        carGalMessage.a(System.currentTimeMillis(), i, i2, bArrArray, iArrayOffset, iLimit, z);
                        Iterator it = ((ArrayMap) sparseArray.get(i2)).keySet().iterator();
                        while (it.hasNext()) {
                            try {
                                ((iyo) it.next()).b.i(carGalMessage);
                            } catch (RemoteException unused) {
                            }
                        }
                    }
                }
            }
            handler.sendMessage(messageObtainMessage);
        }
    }

    public final void e(int i, int i2) {
        izd izdVar;
        synchronized (this.d) {
            izdVar = this.c[i];
        }
        if (izdVar == null) {
            return;
        }
        Handler handler = izdVar.m;
        handler.sendMessage(handler.obtainMessage(2, i, i2, null));
    }

    public final void f() {
        this.f.set(true);
        this.h.g();
        this.i.quit();
        HandlerThread handlerThread = this.j;
        if (handlerThread != null) {
            handlerThread.quit();
        }
        HandlerThread handlerThread2 = this.k;
        if (handlerThread2 != null) {
            handlerThread2.quit();
        }
        HandlerThread handlerThread3 = this.l;
        if (handlerThread3 != null) {
            handlerThread3.quit();
        }
        HandlerThread handlerThread4 = this.m;
        if (handlerThread4 != null) {
            handlerThread4.quit();
        }
        this.w.c();
        this.x.clear();
    }

    public final void g(int i, jcn jcnVar, boolean z, boolean z2, izn iznVar) {
        if (this.f.get()) {
            jcnVar.close();
            return;
        }
        if (!iznVar.b) {
            rld rldVar = this.u;
            if (rldVar.e) {
                rldVar.d(i, jcnVar.g(), z2);
            }
        }
        jcn jcnVarA = this.w.a(i, jcnVar, z2);
        if (jcnVarA != null) {
            h(i, jcnVarA, z, z2, iznVar);
            return;
        }
        int i2 = iznVar.c;
        if (i2 != 0) {
            e(i, i2);
        }
    }

    public final void h(int i, jcn jcnVar, boolean z, boolean z2, izn iznVar) {
        boolean z3;
        if (this.t != null) {
            ByteBuffer byteBufferG = jcnVar.g();
            iyq iyqVar = this.t;
            byte[] bArrArray = byteBufferG.array();
            int iArrayOffset = byteBufferG.arrayOffset();
            int iPosition = byteBufferG.position();
            synchronized (((iyp) iyqVar).b) {
                int i2 = ((iyp) iyqVar).g.get(i, -1);
                SparseArray sparseArray = ((iyp) iyqVar).c;
                if (sparseArray.get(i2) != null) {
                    CarGalMessage carGalMessage = ((iyp) iyqVar).f;
                    z3 = z2;
                    carGalMessage.a(System.currentTimeMillis(), i, i2, bArrArray, iArrayOffset, iPosition, z3);
                    Iterator it = ((ArrayMap) sparseArray.get(i2)).keySet().iterator();
                    while (it.hasNext()) {
                        try {
                            ((iyo) it.next()).b.j(carGalMessage);
                        } catch (RemoteException unused) {
                        }
                    }
                } else {
                    z3 = z2;
                }
            }
        } else {
            z3 = z2;
        }
        izx izxVar = this.b;
        if (izxVar != null) {
            izxVar.h(i, jcnVar, z3, iznVar);
            return;
        }
        jcnVar.w();
        short sJ = jcnVar.j();
        throw new RuntimeException("Framer is null. Channel: " + i + ", message type: " + ((int) sJ) + ", canFragment: " + z + ", isControlMessage: " + z3 + ", isEncrypted: " + iznVar.a + ", isMediaPayload: " + iznVar.b);
    }
}
