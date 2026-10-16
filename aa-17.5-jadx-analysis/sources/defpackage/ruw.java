package defpackage;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Pair;
import com.google.android.gms.car.senderprotocol.AutoValue_Channel_FlattenedChannel;
import com.google.android.gms.car.senderprotocol.Channel;
import com.google.android.gms.car.senderprotocol.ChannelMessage;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class ruw {
    public static final ypf a = ols.R("CAR.GAL.GAL");
    private static final rlh i;
    public final rtu b;
    public final rsi c;
    public final rta d;
    public int e;
    public rus f;
    public ruv[] g;
    final wyd h;
    private final Closeable j;
    private rsl k;
    private final rlh l;
    private final int m;

    static {
        rlg rlgVarA = rlh.a();
        rlgVarA.c(false);
        i = rlgVarA.a();
    }

    public ruw(rur rurVar) {
        int i2;
        int i3;
        int i4;
        wyd wydVar = new wyd(this, null);
        this.h = wydVar;
        this.e = 0;
        rtu rtuVar = rurVar.e;
        this.b = rtuVar;
        this.k = null;
        rlh rlhVar = (rlh) new ntn(rurVar.f).i(i);
        this.l = rlhVar;
        this.j = rurVar.b;
        this.g = null;
        this.c = new rsi(rurVar.c, rtuVar, true);
        int i5 = rurVar.p;
        this.m = i5;
        InputStream inputStream = rurVar.g;
        OutputStream outputStream = rurVar.j;
        ypf ypfVar = rta.a;
        rsy rsyVar = new rsy(inputStream, outputStream);
        rsyVar.d = wub.L(new jbk(this, rurVar, 8));
        rto rtoVar = rurVar.n;
        if (rtoVar != null) {
            rsyVar.i = rtoVar;
        }
        xyc xycVar = rurVar.d;
        if (xycVar != null) {
            rsyVar.h = xycVar;
        }
        rsyVar.j = i5;
        rsyVar.e = rurVar.e;
        rsyVar.l = wydVar;
        rsyVar.f = rld.a(rlhVar);
        rsyVar.g = rurVar.c;
        this.d = new rta(rsyVar);
        List list = rurVar.a;
        if (list != null) {
            this.g = new ruv[list.size()];
            for (int i6 = 0; i6 < rurVar.a.size(); i6++) {
                a.f().ai(8343).y("Adding service (%s)", rta.a((xnz) rurVar.a.get(i6)));
                ruv[] ruvVarArr = this.g;
                ruv ruvVar = new ruv();
                ruvVarArr[i6] = ruvVar;
                ruvVar.a = ((xnz) rurVar.a.get(i6)).c;
                this.g[i6].b = (xnz) rurVar.a.get(i6);
            }
        }
        rta rtaVar = this.d;
        Channel channel = new Channel(0, -128, rvz.DEFAULT, rtaVar, new rsw(rtaVar, 0), rtaVar.h, rtaVar.n);
        rtaVar.b.c(channel);
        rtaVar.v.put(0, rtaVar.n);
        channel.c();
        rtaVar.h.p(channel);
        rtaVar.h.v();
        rtaVar.c[0] = channel;
        int i7 = rurVar.l;
        if (i7 <= 0 || (i2 = rurVar.i) <= 0 || (i3 = rurVar.h) <= 0 || (i4 = rurVar.m) <= 0) {
            return;
        }
        Resources resources = rurVar.c.getResources();
        rth rthVar = this.d.g;
        rthVar.d = l(resources, i7);
        rthVar.e = l(resources, i2);
        rthVar.f = l(resources, i3);
        rthVar.c = resources.getString(i4);
    }

    public static Object b(Class cls, IBinder iBinder) {
        rud rubVar;
        if (iBinder == null) {
            rubVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.car.senderprotocol.IObjectWrapper");
            rubVar = iInterfaceQueryLocalInterface instanceof rud ? (rud) iInterfaceQueryLocalInterface : new rub(iBinder);
        }
        return cls.cast(ruc.a(rubVar));
    }

    static final byte[] l(Resources resources, int i2) throws Resources.NotFoundException, IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        InputStream inputStreamOpenRawResource = resources.openRawResource(i2);
        byte[] bArr = new byte[1024];
        int i3 = 0;
        while (i3 != -1) {
            try {
                i3 = inputStreamOpenRawResource.read(bArr);
                if (i3 > 0) {
                    byteArrayOutputStream.write(bArr, 0, i3);
                }
            } catch (IOException unused) {
                a.g().ai(8346).u("Error reading raw resource.");
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    @ResultIgnorabilityUnspecified
    public final int a(ruu ruuVar) {
        xnz xnzVar;
        rso rsoVarA;
        int i2 = 0;
        for (ruv ruvVar : this.g) {
            if (ruvVar.d == null && (xnzVar = ruvVar.b) != null && (rsoVarA = ruuVar.a(xnzVar)) != null) {
                int i3 = this.m;
                rta rtaVar = this.d;
                rsw rswVar = new rsw(rtaVar, ruvVar.a);
                if (i3 == 0) {
                    throw null;
                }
                int i4 = i3 - 1;
                if (i4 != 0) {
                    if (i4 != 1) {
                        throw new IllegalArgumentException("Invalid type ".concat(ols.G(i3)));
                    }
                    rsoVarA = new rvu(rsoVarA, rswVar, new mmc(rtaVar.v, rtaVar.w));
                }
                ruvVar.d = rsoVarA;
                ruvVar.b = null;
                i2++;
            }
        }
        return i2;
    }

    public final List c() {
        ArrayList arrayList = new ArrayList();
        for (ruv ruvVar : this.g) {
            xnz xnzVar = ruvVar.b;
            if (xnzVar != null) {
                arrayList.add(xnzVar.h());
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x0144 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, rsp] */
    /* JADX WARN: Type inference failed for: r8v10, types: [java.lang.Object, rso] */
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List d(defpackage.rus r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 464
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ruw.d(rus):java.util.List");
    }

    public final void e() throws IOException {
        rsi rsiVar = this.c;
        synchronized (rsiVar.f) {
            rsiVar.i = true;
            rsiVar.a();
        }
        this.d.c(false);
        Closeable closeable = this.j;
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public final void f() {
        this.d.f();
        ruv[] ruvVarArr = this.g;
        if (ruvVarArr != null) {
            for (ruv ruvVar : ruvVarArr) {
                Object obj = ruvVar.c;
                if (obj != null) {
                    ((ruq) obj).x();
                }
            }
        }
    }

    public final void g(xhv xhvVar) {
        rsi rsiVar = this.c;
        synchronized (rsiVar.f) {
            if (rsiVar.i) {
                rsi.a.f().ai(8232).u("Ignoring byebye on released handler");
                return;
            }
            rsiVar.g = new sss(Looper.getMainLooper());
            rsiVar.h = new rnq(rsiVar, 8);
            rsiVar.g.postDelayed(rsiVar.h, 200L);
            rsiVar.d = true;
            rtg rtgVar = rsiVar.b;
            if (rtgVar != null) {
                rtgVar.b(xhvVar);
            }
        }
    }

    public final void h(rsl rslVar) {
        this.k = rslVar;
        rta rtaVar = this.d;
        rtaVar.s = rslVar;
        rtaVar.b.e(rslVar);
        if (rslVar != null) {
            rslVar.a(0, 1);
            ruv[] ruvVarArr = this.g;
            if (ruvVarArr != null) {
                for (ruv ruvVar : ruvVarArr) {
                    Object obj = ruvVar.c;
                    if (obj != null) {
                        rslVar.a(ruvVar.a, ((ruq) obj).m);
                    }
                }
            }
        }
    }

    public final void i() {
        a.l().ai(8349).u("startServiceDiscovery");
        final rta rtaVar = this.d;
        rtaVar.b.g();
        final int i2 = 1;
        rtv rtvVar = new rtv() { // from class: rsu
            @Override // defpackage.rtv
            public final void a(ChannelMessage channelMessage) {
                if (i2 == 0) {
                    rtaVar.d(channelMessage.b, channelMessage.c, channelMessage.f);
                    return;
                }
                rtb rtbVar = new rtb(channelMessage.h, channelMessage.g, channelMessage.i);
                rtaVar.i(channelMessage.b, channelMessage.c, channelMessage.e, channelMessage.f, rtbVar);
            }
        };
        final int i3 = 0;
        rtv rtvVar2 = new rtv() { // from class: rsu
            @Override // defpackage.rtv
            public final void a(ChannelMessage channelMessage) {
                if (i3 == 0) {
                    rtaVar.d(channelMessage.b, channelMessage.c, channelMessage.f);
                    return;
                }
                rtb rtbVar = new rtb(channelMessage.h, channelMessage.g, channelMessage.i);
                rtaVar.i(channelMessage.b, channelMessage.c, channelMessage.e, channelMessage.f, rtbVar);
            }
        };
        mmc mmcVar = rtaVar.x;
        ((rtw) mmcVar.b).b(rtvVar);
        ((rtw) mmcVar.a).b(rtvVar2);
    }

    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, rws] */
    public final void j(Bundle bundle) {
        Channel channel;
        int i2;
        rvb rvbVar;
        ArrayList arrayList;
        rus rusVar = this.f;
        if (rusVar != null) {
            throw new IllegalStateException("Can't suspend ProtocolManager:".concat(rusVar.toString()));
        }
        int i3 = 0;
        while (true) {
            ruv[] ruvVarArr = this.g;
            if (i3 >= ruvVarArr.length) {
                rta rtaVar = this.d;
                rtm rtmVar = rtaVar.b;
                rtmVar.h();
                rta.g(rtaVar.i);
                rta.g(rtaVar.j);
                HandlerThread handlerThread = rtaVar.k;
                rta.g(rtaVar.m);
                rta.g(rtaVar.l);
                if (rtaVar.f || rtaVar.e) {
                    throw new IllegalStateException("Can't bundle ChannelManager:" + rtaVar.f + " " + rtaVar.e);
                }
                int length = rtaVar.c.length;
                Channel.FlattenedChannel[] flattenedChannelArr = new Channel.FlattenedChannel[256];
                int i4 = 0;
                while (true) {
                    Channel[] channelArr = rtaVar.c;
                    int length2 = channelArr.length;
                    if (i4 >= 256) {
                        bundle.putParcelableArray("channels", flattenedChannelArr);
                        rtaVar.h.w(bundle);
                        rtmVar.a(bundle);
                        bundle.putBinder("connection", new ruc(this.j));
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList<? extends Parcelable> arrayList3 = new ArrayList<>();
                        for (ruv ruvVar : this.g) {
                            if (ruvVar.b != null) {
                                arrayList2.add(new Pair(Integer.valueOf(ruvVar.a), ruvVar.b.h()));
                            } else if (ruvVar.c != null) {
                                Bundle bundle2 = new Bundle();
                                bundle2.putInt("end_point_service_id", ruvVar.a);
                                Object obj = ruvVar.c;
                                obj.getClass();
                                ((ruq) obj).w(bundle2);
                                arrayList3.add(bundle2);
                            }
                        }
                        bundle.putBinder("proto_services", new ruc(arrayList2));
                        bundle.putParcelableArrayList("end_points", arrayList3);
                        return;
                    }
                    channel = channelArr[i4];
                    if (channel != null) {
                        i2 = channel.h;
                        if (i2 != 4) {
                            if (i2 != 2) {
                                break;
                            } else {
                                i2 = 2;
                            }
                        }
                        if (channel.i) {
                            break;
                        } else {
                            flattenedChannelArr[i4] = new AutoValue_Channel_FlattenedChannel(channel.b, channel.e, i2, channel.f);
                        }
                    }
                    i4++;
                }
                throw new IllegalStateException("Can't flatten channel: " + i2 + " " + channel.i);
            }
            Object obj2 = ruvVarArr[i3].d;
            if (obj2 != null) {
                if (!(obj2 instanceof sew)) {
                    throw new UnsupportedOperationException("Non-suspendable service ".concat(obj2.toString()));
                }
                sew sewVar = (sew) obj2;
                synchronized (sewVar.a) {
                    rvbVar = sewVar.e;
                }
                if (!sewVar.d) {
                    rvbVar.k(xny.SENSOR_DRIVING_STATUS_DATA, -1L);
                }
                synchronized (sewVar.b) {
                    arrayList = new ArrayList(sewVar.c);
                }
                int size = arrayList.size();
                for (int i5 = 0; i5 < size; i5++) {
                    try {
                        ((xev) arrayList.get(i5)).a.c();
                    } catch (RemoteException unused) {
                    }
                }
            }
            i3++;
        }
    }

    public final boolean k() {
        return this.d.g.k.r(new rux(1, 4));
    }
}
