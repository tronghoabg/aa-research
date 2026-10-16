package pb;

import A7.RunnableC0280p1;
import S1.n;
import S3.i;
import W9.u;
import Y2.B;
import a2.C1323c;
import ac.C1346a;
import android.media.Image;
import android.os.Handler;
import cg.AbstractC1613b;
import cg.C1610B;
import com.arthenica.ffmpegkit.FFmpegKitConfig;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.URI;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicLong;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import l8.AbstractC3409K;
import l8.C3406H;
import l8.C3407I;
import md.AbstractC3537e;
import md.C3534b;
import md.C3542j;
import md.C3557z;
import md.J;
import md.h0;
import md.k0;
import md.l0;
import od.AbstractC3669a0;
import od.S1;
import pd.c;
import pd.l;
import pd.m;
import pd.s;
import r4.C3917c;
import r4.C3918d;
import rb.f;
import rd.C3973h;
import rd.EnumC3966a;
import t6.q;
import tc.g;
import vd.k;
import vd.r;
import yc.C4584g;
import yc.RunnableC4579b;

/* renamed from: pb.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC3790a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f43448a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f43449b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f43450c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f43451d;

    public /* synthetic */ RunnableC3790a(int i5, Object obj, Object obj2, Object obj3, boolean z2) {
        this.f43448a = i5;
        this.f43451d = obj;
        this.f43449b = obj2;
        this.f43450c = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        m mVar;
        RunnableC0280p1 runnableC0280p1;
        Socket socketH;
        C3407I c3407i;
        int i5;
        int i10;
        int i11;
        vd.m mVar2;
        Throwable th;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        int i12 = 21;
        int i13 = 2;
        SSLSession session = null;
        FileOutputStream fileOutputStream3 = null;
        FileOutputStream fileOutputStream4 = null;
        int i14 = 0;
        int i15 = 1;
        switch (this.f43448a) {
            case 0:
                ((f) this.f43451d).b(new C1323c(this, 22));
                return;
            case 1:
                ((f) this.f43451d).b(new C1346a(this, 16));
                return;
            case 2:
                try {
                    ((CountDownLatch) this.f43451d).await();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
                C1610B c1610bD = AbstractC1613b.d(new l());
                try {
                    try {
                        m mVar3 = (m) this.f43450c;
                        C3557z c3557z = mVar3.f43554N;
                        if (c3557z == null) {
                            socketH = mVar3.f43542A.createSocket(mVar3.f43556a.getAddress(), ((m) this.f43450c).f43556a.getPort());
                        } else {
                            InetSocketAddress inetSocketAddress = c3557z.f40732a;
                            if (!(inetSocketAddress instanceof InetSocketAddress)) {
                                throw new l0(k0.f40681m.h("Unsupported SocketAddress implementation " + ((m) this.f43450c).f43554N.f40732a.getClass()));
                            }
                            socketH = m.h(mVar3, c3557z.f40733b, inetSocketAddress, c3557z.f40734c, c3557z.f40735d);
                        }
                        m mVar4 = (m) this.f43450c;
                        SSLSocketFactory sSLSocketFactory = mVar4.f43543B;
                        Socket socket = socketH;
                        if (sSLSocketFactory != null) {
                            String host = mVar4.f43557b;
                            URI uriA = AbstractC3669a0.a(host);
                            if (uriA.getHost() != null) {
                                host = uriA.getHost();
                            }
                            SSLSocket sSLSocketA = s.a(sSLSocketFactory, socketH, host, ((m) this.f43450c).l(), ((m) this.f43450c).f43546E);
                            session = sSLSocketA.getSession();
                            socket = sSLSocketA;
                        }
                        socket.setTcpNoDelay(true);
                        C1610B c1610bD2 = AbstractC1613b.d(AbstractC1613b.n(socket));
                        ((c) this.f43449b).a(AbstractC1613b.j(socket), socket);
                        m mVar5 = (m) this.f43450c;
                        C3534b c3534b = mVar5.f43575u;
                        c3534b.getClass();
                        B b5 = new B(c3534b);
                        b5.D(AbstractC3537e.f40634a, socket.getRemoteSocketAddress());
                        b5.D(AbstractC3537e.f40635b, socket.getLocalSocketAddress());
                        b5.D(AbstractC3537e.f40636c, session);
                        b5.D(S1.f41807a, session == null ? h0.f40647a : h0.f40648b);
                        mVar5.f43575u = b5.i();
                        m mVar6 = (m) this.f43450c;
                        mVar6.f43562g.getClass();
                        mVar6.f43574t = new RunnableC0280p1(mVar6, new C3973h(c1610bD2));
                        synchronized (((m) this.f43450c).k) {
                            try {
                                ((m) this.f43450c).getClass();
                                if (session != null) {
                                    m mVar7 = (m) this.f43450c;
                                    new C3542j(session);
                                    mVar7.getClass();
                                }
                            } finally {
                            }
                        }
                        return;
                    } catch (Throwable th2) {
                        m mVar8 = (m) this.f43450c;
                        mVar8.f43562g.getClass();
                        mVar8.f43574t = new RunnableC0280p1(mVar8, new C3973h(c1610bD));
                        throw th2;
                    }
                } catch (l0 e7) {
                    ((m) this.f43450c).u(0, EnumC3966a.INTERNAL_ERROR, e7.f40690a);
                    mVar = (m) this.f43450c;
                    mVar.f43562g.getClass();
                    runnableC0280p1 = new RunnableC0280p1(mVar, new C3973h(c1610bD));
                    mVar.f43574t = runnableC0280p1;
                    return;
                } catch (Exception e10) {
                    ((m) this.f43450c).q(e10);
                    mVar = (m) this.f43450c;
                    mVar.f43562g.getClass();
                    runnableC0280p1 = new RunnableC0280p1(mVar, new C3973h(c1610bD));
                    mVar.f43574t = runnableC0280p1;
                    return;
                }
            case 3:
                FFmpegKitConfig.e((C3917c) this.f43451d);
                ((com.google.android.gms.ads.nativead.l) this.f43449b).l((g) this.f43450c, null);
                return;
            case 4:
                FFmpegKitConfig.f((C3918d) this.f43451d);
                ((com.google.android.gms.ads.nativead.l) this.f43449b).l((g) this.f43450c, null);
                return;
            case 5:
                ((vb.c) this.f43451d).b(new C1346a(this, i12));
                return;
            case 6:
                ((vb.c) this.f43451d).b(new com.google.android.gms.ads.nativead.l(this, i12));
                return;
            case 7:
                r rVar = (r) this.f43450c;
                rVar.f47222l = Long.valueOf(rVar.f47220i.d());
                for (k kVar : ((HashMap) ((r) this.f43450c).f47217f.f10890b).values()) {
                    q qVar = kVar.f47190c;
                    ((AtomicLong) qVar.f45906a).set(0L);
                    ((AtomicLong) qVar.f45907b).set(0L);
                    q qVar2 = kVar.f47189b;
                    kVar.f47189b = kVar.f47190c;
                    kVar.f47190c = qVar2;
                }
                vd.m mVar9 = (vd.m) this.f43451d;
                AbstractC3537e abstractC3537e = (AbstractC3537e) this.f43449b;
                C3406H c3406hI = AbstractC3409K.i();
                if (mVar9.f47201e != null) {
                    c3406hI.a(new vd.l(mVar9, abstractC3537e, 1));
                }
                if (mVar9.f47202f != null) {
                    c3406hI.a(new vd.l(mVar9, abstractC3537e, 0));
                }
                C3407I c3407iListIterator = c3406hI.g().listIterator(0);
                while (c3407iListIterator.hasNext()) {
                    vd.l lVar = (vd.l) c3407iListIterator.next();
                    r rVar2 = (r) this.f43450c;
                    n nVar = rVar2.f47217f;
                    long jLongValue = rVar2.f47222l.longValue();
                    switch (lVar.f47194a) {
                        case 0:
                            c3407i = c3407iListIterator;
                            i5 = i13;
                            i10 = i14;
                            vd.m mVar10 = lVar.f47195b;
                            ArrayList arrayListH = r.h(nVar, ((Integer) mVar10.f47202f.f15392d).intValue());
                            int size = arrayListH.size();
                            u uVar = mVar10.f47202f;
                            if (size >= ((Integer) uVar.f15391c).intValue() && arrayListH.size() != 0) {
                                Iterator it = arrayListH.iterator();
                                while (it.hasNext()) {
                                    k kVar2 = (k) it.next();
                                    if (nVar.e() >= mVar10.f47200d.intValue()) {
                                        break;
                                    } else if (kVar2.c() >= ((Integer) uVar.f15392d).intValue()) {
                                        u uVar2 = uVar;
                                        if (((AtomicLong) kVar2.f47190c.f45907b).get() / kVar2.c() > ((Integer) uVar.f15389a).intValue() / 100.0d) {
                                            Double dValueOf = Double.valueOf(((AtomicLong) kVar2.f47190c.f45907b).get() / kVar2.c());
                                            i11 = i5;
                                            Object[] objArr = new Object[i11];
                                            objArr[i10] = kVar2;
                                            objArr[1] = dValueOf;
                                            lVar.f47196c.h(1, "FailurePercentage algorithm detected outlier: {0}, failureRate={1}", objArr);
                                            if (new Random().nextInt(100) < ((Integer) uVar2.f15390b).intValue()) {
                                                kVar2.b(jLongValue);
                                            }
                                        } else {
                                            i11 = i5;
                                        }
                                        i5 = i11;
                                        uVar = uVar2;
                                    }
                                }
                                break;
                            }
                            break;
                        default:
                            vd.m mVar11 = lVar.f47195b;
                            ArrayList arrayListH2 = r.h(nVar, ((Integer) mVar11.f47201e.f10964d).intValue());
                            int size2 = arrayListH2.size();
                            i iVar = mVar11.f47201e;
                            if (size2 < ((Integer) iVar.f10963c).intValue() || arrayListH2.size() == 0) {
                                c3407i = c3407iListIterator;
                                i5 = i13;
                                i10 = i14;
                                break;
                            } else {
                                ArrayList arrayList = new ArrayList();
                                Iterator it2 = arrayListH2.iterator();
                                while (it2.hasNext()) {
                                    k kVar3 = (k) it2.next();
                                    arrayList.add(Double.valueOf(((AtomicLong) kVar3.f47190c.f45906a).get() / kVar3.c()));
                                    i15 = i15;
                                    i14 = i14;
                                    i13 = i13;
                                    mVar11 = mVar11;
                                }
                                i5 = i13;
                                i10 = i14;
                                int i16 = i15;
                                vd.m mVar12 = mVar11;
                                Iterator it3 = arrayList.iterator();
                                double d3 = 0.0d;
                                double dDoubleValue = 0.0d;
                                while (it3.hasNext()) {
                                    dDoubleValue = ((Double) it3.next()).doubleValue() + dDoubleValue;
                                }
                                double size3 = dDoubleValue / arrayList.size();
                                Iterator it4 = arrayList.iterator();
                                while (it4.hasNext()) {
                                    double dDoubleValue2 = ((Double) it4.next()).doubleValue() - size3;
                                    d3 = (dDoubleValue2 * dDoubleValue2) + d3;
                                }
                                double dSqrt = Math.sqrt(d3 / arrayList.size());
                                double dIntValue = size3 - ((((Integer) iVar.f10961a).intValue() / 1000.0f) * dSqrt);
                                Iterator it5 = arrayListH2.iterator();
                                while (true) {
                                    if (!it5.hasNext()) {
                                        c3407i = c3407iListIterator;
                                        break;
                                    } else {
                                        k kVar4 = (k) it5.next();
                                        int i17 = i16;
                                        vd.m mVar13 = mVar12;
                                        c3407i = c3407iListIterator;
                                        double d5 = dSqrt;
                                        if (nVar.e() >= mVar13.f47200d.intValue()) {
                                            break;
                                        } else {
                                            if (((AtomicLong) kVar4.f47190c.f45906a).get() / kVar4.c() < dIntValue) {
                                                Double dValueOf2 = Double.valueOf(((AtomicLong) kVar4.f47190c.f45906a).get() / kVar4.c());
                                                Double dValueOf3 = Double.valueOf(size3);
                                                Double dValueOf4 = Double.valueOf(d5);
                                                Double dValueOf5 = Double.valueOf(dIntValue);
                                                Object[] objArr2 = new Object[5];
                                                objArr2[i10] = kVar4;
                                                objArr2[i17] = dValueOf2;
                                                objArr2[i5] = dValueOf3;
                                                objArr2[3] = dValueOf4;
                                                objArr2[4] = dValueOf5;
                                                mVar2 = mVar13;
                                                lVar.f47196c.h(i17, "SuccessRate algorithm detected outlier: {0}. Parameters: successRate={1}, mean={2}, stdev={3}, requiredSuccessRate={4}", objArr2);
                                                if (new Random().nextInt(100) < ((Integer) iVar.f10962b).intValue()) {
                                                    kVar4.b(jLongValue);
                                                }
                                            } else {
                                                mVar2 = mVar13;
                                            }
                                            c3407iListIterator = c3407i;
                                            mVar12 = mVar2;
                                            dSqrt = d5;
                                            i16 = 1;
                                        }
                                    }
                                }
                            }
                            break;
                    }
                    i13 = i5;
                    i14 = i10;
                    c3407iListIterator = c3407i;
                    i15 = 1;
                }
                int i18 = i14;
                r rVar3 = (r) this.f43450c;
                n nVar2 = rVar3.f47217f;
                Long l10 = rVar3.f47222l;
                for (k kVar5 : ((HashMap) nVar2.f10890b).values()) {
                    if (!kVar5.d()) {
                        int i19 = kVar5.f47192e;
                        kVar5.f47192e = i19 == 0 ? i18 : i19 - 1;
                    }
                    if (kVar5.d()) {
                        if (l10.longValue() > Math.min(kVar5.f47188a.f47198b.longValue() * kVar5.f47192e, Math.max(kVar5.f47188a.f47198b.longValue(), kVar5.f47188a.f47199c.longValue())) + kVar5.f47191d.longValue()) {
                            kVar5.e();
                        }
                    }
                }
                return;
            default:
                File file = (File) this.f43449b;
                C4584g c4584g = (C4584g) ((C1346a) this.f43450c).f17489b;
                Image image = (Image) this.f43451d;
                ByteBuffer buffer = image.getPlanes()[0].getBuffer();
                byte[] bArr = new byte[buffer.remaining()];
                buffer.get(bArr);
                try {
                    try {
                        fileOutputStream2 = new FileOutputStream(file);
                    } catch (Throwable th3) {
                        th = th3;
                        fileOutputStream = fileOutputStream4;
                    }
                } catch (IOException unused2) {
                }
                try {
                    fileOutputStream2.write(bArr);
                    String absolutePath = file.getAbsolutePath();
                    J j8 = c4584g.f48119h;
                    ((Handler) j8.f40580a).post(new RunnableC4579b(i13, c4584g.f48136z, absolutePath));
                    image.close();
                    try {
                        fileOutputStream2.close();
                        fileOutputStream4 = j8;
                    } catch (IOException e11) {
                        e = e11;
                        c4584g.f48119h.l(c4584g.f48136z, "cameraAccess", e.getMessage());
                        return;
                    }
                } catch (IOException unused3) {
                    fileOutputStream3 = fileOutputStream2;
                    c4584g.f48119h.l(c4584g.f48136z, "IOError", "Failed saving image");
                    image.close();
                    fileOutputStream4 = fileOutputStream3;
                    if (fileOutputStream3 != null) {
                        try {
                            fileOutputStream3.close();
                            fileOutputStream4 = fileOutputStream3;
                        } catch (IOException e12) {
                            e = e12;
                            c4584g.f48119h.l(c4584g.f48136z, "cameraAccess", e.getMessage());
                            return;
                        }
                    }
                    return;
                } catch (Throwable th4) {
                    th = th4;
                    fileOutputStream = fileOutputStream2;
                    image.close();
                    if (fileOutputStream == null) {
                        throw th;
                    }
                    try {
                        fileOutputStream.close();
                        throw th;
                    } catch (IOException e13) {
                        c4584g.f48119h.l(c4584g.f48136z, "cameraAccess", e13.getMessage());
                        throw th;
                    }
                }
                return;
        }
    }

    public /* synthetic */ RunnableC3790a(Object obj, Object obj2, Object obj3, int i5) {
        this.f43448a = i5;
        this.f43450c = obj;
        this.f43451d = obj2;
        this.f43449b = obj3;
    }
}
