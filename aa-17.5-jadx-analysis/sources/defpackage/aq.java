package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.os.RemoteException;
import android.os.SystemClock;
import android.support.v4.app.Fragment;
import android.view.View;
import com.google.android.gms.car.display.CarRegionId;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Semaphore;

/* loaded from: classes.dex */
public final /* synthetic */ class aq implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public aq(ima imaVar, CountDownLatch countDownLatch, int i) {
        this.c = i;
        this.a = countDownLatch;
        this.b = imaVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v51, types: [java.lang.Object, rwm] */
    /* JADX WARN: Type inference failed for: r9v16, types: [java.lang.Object, qyk] */
    /* JADX WARN: Type inference failed for: r9v19, types: [java.lang.Object, qus] */
    /* JADX WARN: Type inference failed for: r9v20, types: [java.lang.Object, rpg] */
    /* JADX WARN: Type inference failed for: r9v38, types: [java.lang.Object, jhf] */
    /* JADX WARN: Type inference failed for: r9v61, types: [java.lang.Object, jfg] */
    /* JADX WARN: Type inference failed for: r9v66, types: [java.lang.Object, rwy] */
    @Override // java.lang.Runnable
    public final void run() throws Exception {
        Handler handler;
        final int i = 1;
        final int i2 = 0;
        switch (this.c) {
            case 0:
                ((Fragment) this.a).m123lambda$restoreViewState$0$androidsupportv4appFragment((Bundle) this.b);
                return;
            case 1:
                ((Fragment) this.a).m105lambda$performActivityCreated$8$androidsupportv4appFragment((Bundle) this.b);
                return;
            case 2:
                ((Fragment) this.a).m122lambda$performViewCreated$7$androidsupportv4appFragment((Bundle) this.b);
                return;
            case 3:
                ((Fragment) this.a).m107lambda$performCreate$3$androidsupportv4appFragment((Bundle) this.b);
                return;
            case 4:
                cq cqVar = (cq) this.a;
                List list = cqVar.b;
                Object obj = this.b;
                if (list.contains(obj)) {
                    cp cpVar = (cp) obj;
                    int i3 = cpVar.h;
                    View view = cpVar.a.mView;
                    view.getClass();
                    ca.h(i3, view, cqVar.a);
                    return;
                }
                return;
            case 5:
                cq cqVar2 = (cq) this.a;
                List list2 = cqVar2.b;
                Object obj2 = this.b;
                list2.remove(obj2);
                cqVar2.c.remove(obj2);
                return;
            case 6:
                ((duz) this.a).b((Typeface) this.b);
                return;
            case 7:
                Object obj3 = this.b;
                ?? r9 = this.a;
                try {
                    ynp ynpVarListIterator = ilh.b.listIterator(0);
                    while (ynpVarListIterator.hasNext()) {
                        ((ikt) obj3).o(((Integer) ynpVarListIterator.next()).intValue(), 3, r9);
                    }
                    return;
                } catch (IllegalStateException unused) {
                    ((ype) ((ype) ilh.a.f()).ai((char) 282)).u("car already disconnected");
                    return;
                }
            case 8:
                iob iobVarN = ((ima) this.b).n();
                if (iobVarN != 0) {
                    iobVarN.M(this.a);
                    return;
                }
                return;
            case 9:
                iob iobVarN2 = ((ima) this.b).n();
                if (iobVarN2 != 0) {
                    iobVarN2.P(this.a);
                    return;
                }
                return;
            case 10:
                CountDownLatch countDownLatch = (CountDownLatch) this.a;
                if (countDownLatch.getCount() != 0) {
                    ((ima) this.b).aD();
                    countDownLatch.countDown();
                    return;
                }
                return;
            case 11:
                imj imjVar = (imj) this.a;
                boolean z = imjVar.p;
                Object obj4 = this.b;
                if (!z) {
                    ((ype) imj.a.l().ai((char) 423)).u("Notifying onPreflightComplete");
                    Bundle bundle = (Bundle) obj4;
                    imjVar.q = bundle.getBoolean("projection_authorized", false);
                    imjVar.p = true;
                    imjVar.d.b(bundle);
                    if (imjVar.h) {
                        Context context = imjVar.g;
                        ols.M(context, yxi.PREFLIGHT_COMPLETED);
                        if (imjVar.q && imjVar.e.i() == 1) {
                            context.getPackageManager().setComponentEnabledSetting(imj.c, 1, 1);
                        }
                    }
                }
                if (!((Bundle) obj4).getBoolean("projection_authorized", false)) {
                    ((ype) ((ype) imj.a.h()).ai((char) 421)).u("Projection not authorized, so not calling handleProjectionReady and onReadyForInitialActivities");
                    return;
                } else if (imjVar.g()) {
                    imjVar.d.e();
                    return;
                } else {
                    ((ype) ((ype) imj.a.h()).ai((char) 422)).u("Probably tearing down, so not calling onReadyForInitialActivities");
                    return;
                }
            case 12:
                imj imjVar2 = (imj) this.a;
                imjVar2.k = imi.e;
                boolean z2 = imjVar2.n;
                Object obj5 = this.b;
                if (!z2) {
                    ((ype) imj.a.l().ai((char) 428)).u("Notifying onProjectionStart");
                    imjVar2.n = true;
                    imjVar2.d.fk((Bundle) obj5);
                    return;
                } else if (imjVar2.o != null && !imjVar2.p) {
                    ((ype) imj.a.l().ai((char) 427)).u("Re-invoking onPreflightStart (was started, but not notified)");
                    imjVar2.b();
                    return;
                } else {
                    if (imjVar2.q) {
                        imjVar2.d.f((Bundle) obj5);
                        imjVar2.g();
                        return;
                    }
                    return;
                }
            case 13:
                ina inaVar = (ina) this.b;
                inaVar.al.f(inaVar.w.a, (UUID) this.a, jjx.a);
                return;
            case 14:
                ((ina) this.b).al.e(this.a);
                return;
            case 15:
                ((ype) ((ype) ina.a.f()).ai((char) 524)).u("Content window transition timing out");
                ((ina) this.b).aa((CarRegionId) this.a, null);
                return;
            case 16:
                iwj iwjVar = (iwj) this.b;
                iwk iwkVar = iwjVar.c;
                Process.setThreadPriority(iwkVar.b());
                Object obj6 = this.a;
                try {
                    yph yphVar = iwkVar.c;
                    ((ype) yphVar.l().ai(1461)).u("encodingThread starts");
                    iwkVar.j = iwkVar.c();
                    ((Semaphore) obj6).release();
                    MediaCodec mediaCodec = iwkVar.j;
                    mediaCodec.getClass();
                    ByteBuffer[] outputBuffers = mediaCodec.getOutputBuffers();
                    MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                    while (iwkVar.h) {
                        if (iwkVar.i) {
                            ((ype) yphVar.l().ai(1460)).u("quitting encoding");
                            iwkVar.h();
                            iwkVar.i = false;
                        }
                        MediaCodec mediaCodec2 = iwkVar.j;
                        mediaCodec2.getClass();
                        int iDequeueOutputBuffer = mediaCodec2.dequeueOutputBuffer(bufferInfo, 500000L);
                        if (iDequeueOutputBuffer != -1) {
                            if (iDequeueOutputBuffer == -3) {
                                MediaCodec mediaCodec3 = iwkVar.j;
                                mediaCodec3.getClass();
                                outputBuffers = mediaCodec3.getOutputBuffers();
                            } else if (iDequeueOutputBuffer == -2) {
                                ((ype) yphVar.l().ai(1459)).u("MediaCodec format change");
                                iwkVar.i();
                            } else {
                                if (iDequeueOutputBuffer < 0) {
                                    throw new Exception(a.bp(iDequeueOutputBuffer, "dequeueOutputBuffer returned "));
                                }
                                ByteBuffer byteBuffer = outputBuffers[iDequeueOutputBuffer];
                                byteBuffer.position(bufferInfo.offset);
                                byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
                                if ((bufferInfo.flags & 2) != 0) {
                                    ((ype) yphVar.l().ai(1466)).u("codec config");
                                    iwg iwgVar = iwkVar.g;
                                    iwgVar.getClass();
                                    iwgVar.a(byteBuffer, bufferInfo);
                                } else if ((bufferInfo.flags & 4) != 0) {
                                    ((ype) yphVar.l().ai(1465)).u("end-of-stream");
                                    iwkVar.h = false;
                                    iwkVar.g.getClass();
                                } else {
                                    iwkVar.f(bufferInfo, byteBuffer);
                                    iwg iwgVar2 = iwkVar.g;
                                    iwgVar2.getClass();
                                    iwgVar2.b(byteBuffer, bufferInfo);
                                    iwkVar.g(bufferInfo, byteBuffer);
                                }
                                MediaCodec mediaCodec4 = iwkVar.j;
                                mediaCodec4.getClass();
                                mediaCodec4.releaseOutputBuffer(iDequeueOutputBuffer, false);
                            }
                        }
                    }
                    ((ype) yphVar.l().ai(1462)).u("encodingThread ends");
                    return;
                } catch (Exception e) {
                    iwk iwkVar2 = iwjVar.c;
                    boolean z3 = iwkVar2.e;
                    iwkVar2.h = false;
                    ((ype) ((ype) ((ype) iwkVar2.c.h()).p(e)).ai((char) 1464)).u("media encoder error");
                    iwg iwgVar3 = iwkVar2.g;
                    iwgVar3.getClass();
                    iwgVar3.c(e.toString());
                    if (z3) {
                        throw new iwh(e);
                    }
                    return;
                }
            case 17:
                final jgn jgnVar = (jgn) this.b;
                if (jgnVar.a && (handler = ((jgq) this.a).a) != null) {
                    final long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                    handler.post(new Runnable() { // from class: jgo
                        @Override // java.lang.Runnable
                        public final void run() {
                            jgnVar.a(jElapsedRealtimeNanos);
                        }
                    });
                    return;
                }
                return;
            case 18:
                ?? r0 = this.a;
                joi joiVar = (joi) this.b;
                joiVar.e.post(new jof(joiVar, r0));
                return;
            case 19:
                joi joiVar2 = (joi) this.a;
                joiVar2.c();
                rps rpsVar = new rps(joiVar2.b, false, false);
                acai[] acaiVarArr = {acai.B};
                rqu rquVarH = rqv.h(yxy.GEARHEAD, 19, yyv.LOG_TESTCODES);
                rquVarH.j(acaiVarArr);
                final rqy rqyVarL = rquVarH.l();
                final ?? r92 = this.b;
                if (rpsVar.g(new rpq() { // from class: joe
                    @Override // defpackage.rpq
                    public final void a(boolean z4) {
                        ((ype) joi.a.l().ai((char) 2476)).y("Finished waiting for lifetime to complete, verified: %b", Boolean.valueOf(z4));
                        r92.b(rqyVarL);
                    }
                })) {
                    return;
                }
                ((ype) ((ype) joi.a.h()).ai((char) 2479)).u("Could not register callback to log audio service migration test code.");
                return;
            default:
                Object obj7 = this.b;
                joi joiVar3 = (joi) obj7;
                joiVar3.c();
                joiVar3.e();
                if (!joiVar3.g.isEmpty()) {
                    throw new IllegalStateException();
                }
                ?? r93 = this.a;
                if (!joiVar3.n(r93)) {
                    joiVar3.b();
                    return;
                }
                try {
                    r93.c(true);
                    joiVar3.f.ag = new wyd(obj7);
                    jot jotVar = joiVar3.x;
                    jotVar.c.d.post(new jgw(jotVar, 7, null));
                    jbp jbpVar = joiVar3.l;
                    jbp.a.l().ai(1800).u("startServiceDiscovery");
                    final izl izlVar = jbpVar.d;
                    izlVar.b.g();
                    jai jaiVar = izlVar.w;
                    jaf jafVar = new jaf() { // from class: izf
                        @Override // defpackage.jaf
                        public final void a(izm izmVar) {
                            if (i == 0) {
                                boolean z4 = izmVar.f;
                                jcn jcnVar = izmVar.c;
                                izlVar.d(izmVar.b, jcnVar.i(), z4);
                                return;
                            }
                            izn iznVar = new izn(izmVar.h, izmVar.g, izmVar.i, izmVar.j);
                            boolean z5 = izmVar.f;
                            boolean z6 = izmVar.e;
                            jcn jcnVar2 = izmVar.c;
                            izlVar.h(izmVar.b, jcnVar2, z6, z5, iznVar);
                        }
                    };
                    jaf jafVar2 = new jaf() { // from class: izf
                        @Override // defpackage.jaf
                        public final void a(izm izmVar) {
                            if (i2 == 0) {
                                boolean z4 = izmVar.f;
                                jcn jcnVar = izmVar.c;
                                izlVar.d(izmVar.b, jcnVar.i(), z4);
                                return;
                            }
                            izn iznVar = new izn(izmVar.h, izmVar.g, izmVar.i, izmVar.j);
                            boolean z5 = izmVar.f;
                            boolean z6 = izmVar.e;
                            jcn jcnVar2 = izmVar.c;
                            izlVar.h(izmVar.b, jcnVar2, z6, z5, iznVar);
                        }
                    };
                    jaiVar.a.b(jafVar);
                    jaiVar.b.b(jafVar2);
                    return;
                } catch (RemoteException e2) {
                    ((ype) ((ype) ((ype) joi.a.h()).p(e2)).ai((char) 2492)).u("onHandoffStatus RemoteException in ::startCarConnection");
                    joiVar3.b();
                    return;
                }
        }
    }

    public /* synthetic */ aq(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    public /* synthetic */ aq(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }

    public aq(joi joiVar, rwy rwyVar, int i) {
        this.c = i;
        this.b = joiVar;
        this.a = rwyVar;
    }
}
