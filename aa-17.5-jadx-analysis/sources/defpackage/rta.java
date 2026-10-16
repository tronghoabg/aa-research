package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.RemoteException;
import android.util.ArrayMap;
import android.util.SparseArray;
import com.google.android.gms.car.CarGalMessage;
import com.google.android.gms.car.senderprotocol.Channel;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class rta {
    public static final ypf a = ols.R("CAR.GAL.GAL");
    public final rtm b;
    public Channel[] c;
    public boolean e;
    public final rth g;
    public final ruq h;
    final HandlerThread i;
    public HandlerThread j;
    public HandlerThread k;
    public HandlerThread l;
    public HandlerThread m;
    final rsz n;
    public rsz o;
    public rsz p;
    public rsz q;
    public final rtu r;
    public rsl s;
    public final rld t;
    public final Map v;
    public final rvo w;
    public final mmc x;
    public final wyd y;
    public final Object d = new Object();
    public volatile boolean f = false;
    public final SparseArray u = new SparseArray();

    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, rtm] */
    public rta(rsy rsyVar) {
        rvo rvsVar;
        ruq rvyVar;
        HashMap map = new HashMap();
        this.v = map;
        rsyVar.d.getClass();
        rtu rtuVar = rsyVar.e;
        rtuVar.getClass();
        this.r = rtuVar;
        rld rldVar = rsyVar.f;
        rldVar.getClass();
        this.t = rldVar;
        this.x = rsyVar.k;
        wyd wydVar = rsyVar.l;
        wydVar.getClass();
        this.y = wydVar;
        this.c = new Channel[256];
        this.s = null;
        this.e = false;
        int i = rsyVar.j;
        xyc xycVar = rsyVar.h;
        if (i == 1) {
            rvsVar = new rvt();
        } else {
            xycVar.getClass();
            rvsVar = new rvs(i, rtuVar, xycVar, new HashMap());
        }
        this.w = rvsVar;
        rth rthVar = (rth) rsyVar.d.gu();
        this.g = rthVar;
        int i2 = rsyVar.j;
        rsw rswVar = new rsw(this, 0);
        int i3 = i2 - 1;
        if (i2 == 0) {
            throw null;
        }
        if (i3 == 0) {
            rvyVar = rthVar;
        } else {
            if (i3 != 1) {
                throw new IllegalArgumentException("Invalid type ".concat(ols.G(i2)));
            }
            rvyVar = new rvy(rthVar, rswVar, new mmc(map, rvsVar));
        }
        this.h = rvyVar;
        b(0, roc.p(rro.CONTROL));
        this.b = rsyVar.a.a(this);
        HandlerThread handlerThread = new HandlerThread("RxDef");
        this.i = handlerThread;
        handlerThread.start();
        this.n = new rsz(this, handlerThread.getLooper());
        rthVar.j = this;
        rsyVar.b.a(this);
        Channel[] channelArr = this.c;
        int length = channelArr.length;
        for (int i4 = 0; i4 < 256; i4++) {
            Channel channel = channelArr[i4];
            if (channel != null) {
                rtm rtmVar = this.b;
                rtmVar.getClass();
                rtmVar.c(channel);
            }
        }
        rsyVar.c.a(this);
        this.t.e();
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
            sb.append("RadioService");
        } else if ((i & 8192) != 0) {
            xpl xplVar = xnzVar.l;
            if (xplVar == null) {
                xplVar = xpl.a;
            }
            sb.append("WifiProjectionService {carWifiBssid =");
            sb.append(xplVar.b);
            sb.append("}");
        }
        return sb.toString();
    }

    public static void g(HandlerThread handlerThread) {
        if (handlerThread != null) {
            handlerThread.quitSafely();
            yrm.aD(handlerThread);
        }
    }

    public final synchronized void b(int i, rll rllVar) {
        if (this.t.e) {
            this.u.put(i, rllVar);
        }
    }

    public final void c(boolean z) {
        f();
        this.w.d();
        this.e = false;
        ArrayList arrayList = new ArrayList();
        synchronized (this.d) {
            for (int i = 1; i <= 255; i++) {
                Channel channel = this.c[i];
                if (channel != null) {
                    arrayList.add(channel);
                    this.c[i] = null;
                }
            }
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((Channel) arrayList.get(i2)).d();
        }
        this.t.f();
        if (z) {
            try {
                this.b.b();
            } catch (IOException unused) {
            }
        }
        try {
            this.b.d();
        } catch (IOException unused2) {
        }
    }

    public final void d(int i, ByteBuffer byteBuffer, boolean z) {
        Channel channel;
        if (this.f) {
            return;
        }
        this.t.c(i, byteBuffer, z);
        synchronized (this.d) {
            channel = this.c[i];
        }
        if (channel != null) {
            Handler handler = channel.l;
            Message messageObtainMessage = z ? handler.obtainMessage(1, i, 0, byteBuffer) : handler.obtainMessage(0, i, 0, byteBuffer);
            rsl rslVar = this.s;
            if (rslVar != null) {
                byte[] bArrArray = byteBuffer.array();
                int iArrayOffset = byteBuffer.arrayOffset();
                int iLimit = byteBuffer.limit();
                synchronized (((rsk) rslVar).b) {
                    int i2 = ((rsk) rslVar).g.get(i, -1);
                    SparseArray sparseArray = ((rsk) rslVar).c;
                    if (sparseArray.get(i2) != null) {
                        CarGalMessage carGalMessage = ((rsk) rslVar).f;
                        carGalMessage.a(System.currentTimeMillis(), i, i2, bArrArray, iArrayOffset, iLimit, z);
                        Iterator it = ((ArrayMap) sparseArray.get(i2)).keySet().iterator();
                        while (it.hasNext()) {
                            try {
                                ((rsj) it.next()).b.i(carGalMessage);
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
        Channel channel;
        synchronized (this.d) {
            channel = this.c[i];
        }
        if (channel == null) {
            return;
        }
        Handler handler = channel.l;
        handler.sendMessage(handler.obtainMessage(2, i, i2, null));
    }

    public final void f() {
        this.f = true;
        this.h.x();
        this.i.quit();
        HandlerThread handlerThread = this.j;
        if (handlerThread != null) {
            handlerThread.quit();
        }
        HandlerThread handlerThread2 = this.l;
        if (handlerThread2 != null) {
            handlerThread2.quit();
        }
        HandlerThread handlerThread3 = this.m;
        if (handlerThread3 != null) {
            handlerThread3.quit();
        }
        this.v.clear();
    }

    public final void h(int i, ByteBuffer byteBuffer, boolean z, boolean z2, rtb rtbVar) {
        if (this.f) {
            return;
        }
        if (!rtbVar.b) {
            this.t.d(i, byteBuffer, z2);
        }
        if (byteBuffer != null) {
            i(i, byteBuffer, z, z2, rtbVar);
            return;
        }
        int i2 = rtbVar.c;
        if (i2 != 0) {
            e(i, i2);
        }
    }

    public final void i(int i, ByteBuffer byteBuffer, boolean z, boolean z2, rtb rtbVar) {
        boolean z3;
        rsl rslVar = this.s;
        if (rslVar != null) {
            byte[] bArrArray = byteBuffer.array();
            int iArrayOffset = byteBuffer.arrayOffset();
            int iPosition = byteBuffer.position();
            synchronized (((rsk) rslVar).b) {
                int i2 = ((rsk) rslVar).g.get(i, -1);
                SparseArray sparseArray = ((rsk) rslVar).c;
                if (sparseArray.get(i2) != null) {
                    CarGalMessage carGalMessage = ((rsk) rslVar).f;
                    z3 = z2;
                    carGalMessage.a(System.currentTimeMillis(), i, i2, bArrArray, iArrayOffset, iPosition, z3);
                    Iterator it = ((ArrayMap) sparseArray.get(i2)).keySet().iterator();
                    while (it.hasNext()) {
                        try {
                            ((rsj) it.next()).b.j(carGalMessage);
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
        rtm rtmVar = this.b;
        if (rtmVar != null) {
            rtmVar.i(i, byteBuffer, z3, rtbVar);
            return;
        }
        byteBuffer.rewind();
        short s = byteBuffer.getShort();
        throw new RuntimeException("Framer is null. Channel: " + i + ", message type: " + ((int) s) + ", canFragment: " + z + ", isControlMessage: " + z3 + ", isEncrypted: " + rtbVar.a + ", isMediaPayload: " + rtbVar.b);
    }
}
