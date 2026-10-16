package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class aq implements java.lang.Runnable {
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    private final /* synthetic */ int c;

    public aq(defpackage.imi imiVar, java.util.concurrent.CountDownLatch countDownLatch, int i) {
        this.c = i;
        this.a = countDownLatch;
        this.b = imiVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: iwp */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v54, types: [java.lang.Object, rxf] */
    /* JADX WARN: Type inference failed for: r11v16, types: [java.lang.Object, qzg] */
    /* JADX WARN: Type inference failed for: r11v19, types: [java.lang.Object, rqb] */
    /* JADX WARN: Type inference failed for: r11v37, types: [java.lang.Object, jhl] */
    /* JADX WARN: Type inference failed for: r11v60, types: [java.lang.Object, jfo] */
    /* JADX WARN: Type inference failed for: r11v65, types: [java.lang.Object, rxr] */
    /* JADX WARN: Type inference failed for: r11v78, types: [java.lang.Object, rxr] */
    /* JADX WARN: Type inference failed for: r2v17, types: [java.lang.Object, rxr] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.lang.Runnable
    public final void run() throws iwp {
        android.os.Handler handler;
        final int i = 1;
        final int i2 = 0;
        switch (this.c) {
            case defpackage.abnt.b /* 0 */:
                ((android.support.v4.app.Fragment) this.a).m22lambda$restoreViewState$0$androidsupportv4appFragment((android.os.Bundle) this.b);
                return;
            case 1:
                ((android.support.v4.app.Fragment) this.a).m4lambda$performActivityCreated$8$androidsupportv4appFragment((android.os.Bundle) this.b);
                return;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                ((android.support.v4.app.Fragment) this.a).m21lambda$performViewCreated$7$androidsupportv4appFragment((android.os.Bundle) this.b);
                return;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                ((android.support.v4.app.Fragment) this.a).m6lambda$performCreate$3$androidsupportv4appFragment((android.os.Bundle) this.b);
                return;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                defpackage.cq cqVar = (defpackage.cq) this.a;
                java.util.List list = cqVar.b;
                java.lang.Object obj = this.b;
                if (list.contains(obj)) {
                    defpackage.cp cpVar = (defpackage.cp) obj;
                    int i3 = cpVar.h;
                    android.view.View view = cpVar.a.mView;
                    view.getClass();
                    defpackage.ca.h(i3, view, cqVar.a);
                    return;
                }
                return;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                defpackage.cq cqVar2 = (defpackage.cq) this.a;
                java.util.List list2 = cqVar2.b;
                java.lang.Object obj2 = this.b;
                list2.remove(obj2);
                cqVar2.c.remove(obj2);
                return;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                ((defpackage.dvg) this.a).b((android.graphics.Typeface) this.b);
                return;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                java.lang.Object obj3 = this.b;
                ?? r11 = this.a;
                try {
                    defpackage.you youVarListIterator = defpackage.ilr.b.listIterator(0);
                    while (youVarListIterator.hasNext()) {
                        ((defpackage.ild) obj3).o(((java.lang.Integer) youVarListIterator.next()).intValue(), 3, r11);
                    }
                    return;
                } catch (java.lang.IllegalStateException unused) {
                    ((defpackage.yqj) ((defpackage.yqj) defpackage.ilr.a.f()).ai((char) 282)).u("car already disconnected");
                    return;
                }
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.ioh iohVarN = ((defpackage.imi) this.b).n();
                if (iohVarN != 0) {
                    iohVarN.P(this.a);
                    return;
                }
                return;
            case 9:
                java.util.concurrent.CountDownLatch countDownLatch = (java.util.concurrent.CountDownLatch) this.a;
                if (countDownLatch.getCount() != 0) {
                    ((defpackage.imi) this.b).aD();
                    countDownLatch.countDown();
                    return;
                }
                return;
            case 10:
                defpackage.imr imrVar = (defpackage.imr) this.a;
                boolean z = imrVar.p;
                java.lang.Object obj4 = this.b;
                if (!z) {
                    ((defpackage.yqj) defpackage.imr.a.l().ai((char) 423)).u("Notifying onPreflightComplete");
                    android.os.Bundle bundle = (android.os.Bundle) obj4;
                    imrVar.q = bundle.getBoolean("projection_authorized", false);
                    imrVar.p = true;
                    imrVar.d.b(bundle);
                    if (imrVar.h) {
                        android.content.Context context = imrVar.g;
                        defpackage.omv.i(context, defpackage.yyn.PREFLIGHT_COMPLETED);
                        if (imrVar.q && imrVar.e.i() == 1) {
                            context.getPackageManager().setComponentEnabledSetting(defpackage.imr.c, 1, 1);
                        }
                    }
                }
                if (!((android.os.Bundle) obj4).getBoolean("projection_authorized", false)) {
                    ((defpackage.yqj) ((defpackage.yqj) defpackage.imr.a.h()).ai((char) 421)).u("Projection not authorized, so not calling handleProjectionReady and onReadyForInitialActivities");
                    return;
                } else if (imrVar.g()) {
                    imrVar.d.e();
                    return;
                } else {
                    ((defpackage.yqj) ((defpackage.yqj) defpackage.imr.a.h()).ai((char) 422)).u("Probably tearing down, so not calling onReadyForInitialActivities");
                    return;
                }
            case 11:
                defpackage.imr imrVar2 = (defpackage.imr) this.a;
                imrVar2.k = defpackage.imq.e;
                boolean z2 = imrVar2.n;
                java.lang.Object obj5 = this.b;
                if (!z2) {
                    ((defpackage.yqj) defpackage.imr.a.l().ai((char) 428)).u("Notifying onProjectionStart");
                    imrVar2.n = true;
                    imrVar2.d.es((android.os.Bundle) obj5);
                    return;
                } else if (imrVar2.o != null && !imrVar2.p) {
                    ((defpackage.yqj) defpackage.imr.a.l().ai((char) 427)).u("Re-invoking onPreflightStart (was started, but not notified)");
                    imrVar2.b();
                    return;
                } else {
                    if (imrVar2.q) {
                        imrVar2.d.f((android.os.Bundle) obj5);
                        imrVar2.g();
                        return;
                    }
                    return;
                }
            case 12:
                defpackage.inh inhVar = (defpackage.inh) this.b;
                inhVar.al.f(inhVar.w.a, (java.util.UUID) this.a, defpackage.jke.a);
                return;
            case 13:
                ((defpackage.inh) this.b).al.e(this.a);
                return;
            case 14:
                ((defpackage.yqj) ((defpackage.yqj) defpackage.inh.a.f()).ai((char) 524)).u("Content window transition timing out");
                ((defpackage.inh) this.b).aa((com.google.android.gms.car.display.CarRegionId) this.a, null);
                return;
            case 15:
                defpackage.iwr iwrVar = (defpackage.iwr) this.b;
                defpackage.iws iwsVar = iwrVar.c;
                android.os.Process.setThreadPriority(iwsVar.b());
                java.lang.Object obj6 = this.a;
                try {
                    defpackage.yqm yqmVar = iwsVar.c;
                    ((defpackage.yqj) yqmVar.l().ai(1461)).u("encodingThread starts");
                    iwsVar.j = iwsVar.c();
                    ((java.util.concurrent.Semaphore) obj6).release();
                    android.media.MediaCodec mediaCodec = iwsVar.j;
                    mediaCodec.getClass();
                    java.nio.ByteBuffer[] outputBuffers = mediaCodec.getOutputBuffers();
                    android.media.MediaCodec.BufferInfo bufferInfo = new android.media.MediaCodec.BufferInfo();
                    while (iwsVar.h) {
                        if (iwsVar.i) {
                            ((defpackage.yqj) yqmVar.l().ai(1460)).u("quitting encoding");
                            iwsVar.h();
                            iwsVar.i = false;
                        }
                        android.media.MediaCodec mediaCodec2 = iwsVar.j;
                        mediaCodec2.getClass();
                        int iDequeueOutputBuffer = mediaCodec2.dequeueOutputBuffer(bufferInfo, 500000L);
                        if (iDequeueOutputBuffer != -1) {
                            if (iDequeueOutputBuffer == -3) {
                                android.media.MediaCodec mediaCodec3 = iwsVar.j;
                                mediaCodec3.getClass();
                                outputBuffers = mediaCodec3.getOutputBuffers();
                            } else if (iDequeueOutputBuffer == -2) {
                                ((defpackage.yqj) yqmVar.l().ai(1459)).u("MediaCodec format change");
                                iwsVar.i();
                            } else {
                                if (iDequeueOutputBuffer < 0) {
                                    throw new java.lang.Exception(defpackage.a.bo(iDequeueOutputBuffer, "dequeueOutputBuffer returned "));
                                }
                                java.nio.ByteBuffer byteBuffer = outputBuffers[iDequeueOutputBuffer];
                                byteBuffer.position(bufferInfo.offset);
                                byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
                                if ((bufferInfo.flags & 2) != 0) {
                                    ((defpackage.yqj) yqmVar.l().ai(1466)).u("codec config");
                                    defpackage.iwo iwoVar = iwsVar.g;
                                    iwoVar.getClass();
                                    iwoVar.a(byteBuffer, bufferInfo);
                                } else if ((bufferInfo.flags & 4) != 0) {
                                    ((defpackage.yqj) yqmVar.l().ai(1465)).u("end-of-stream");
                                    iwsVar.h = false;
                                    iwsVar.g.getClass();
                                } else {
                                    iwsVar.f(bufferInfo, byteBuffer);
                                    defpackage.iwo iwoVar2 = iwsVar.g;
                                    iwoVar2.getClass();
                                    iwoVar2.b(byteBuffer, bufferInfo);
                                    iwsVar.g(bufferInfo, byteBuffer);
                                }
                                android.media.MediaCodec mediaCodec4 = iwsVar.j;
                                mediaCodec4.getClass();
                                mediaCodec4.releaseOutputBuffer(iDequeueOutputBuffer, false);
                            }
                        }
                    }
                    ((defpackage.yqj) yqmVar.l().ai(1462)).u("encodingThread ends");
                    return;
                } catch (java.lang.Exception e) {
                    defpackage.iws iwsVar2 = iwrVar.c;
                    boolean z3 = iwsVar2.e;
                    iwsVar2.h = false;
                    ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) iwsVar2.c.h()).p(e)).ai((char) 1464)).u("media encoder error");
                    defpackage.iwo iwoVar3 = iwsVar2.g;
                    iwoVar3.getClass();
                    iwoVar3.c(e.toString());
                    if (z3) {
                        throw new iwp(e);
                    }
                    return;
                }
            case 16:
                final defpackage.jgv jgvVar = (defpackage.jgv) this.b;
                if (jgvVar.a && (handler = ((defpackage.jgy) this.a).a) != null) {
                    final long jElapsedRealtimeNanos = android.os.SystemClock.elapsedRealtimeNanos();
                    handler.post(new java.lang.Runnable() { // from class: jgw
                        @Override // java.lang.Runnable
                        public final void run() {
                            jgvVar.a(jElapsedRealtimeNanos);
                        }
                    });
                    return;
                }
                return;
            case 17:
                ?? r0 = this.a;
                defpackage.joq joqVar = (defpackage.joq) this.b;
                joqVar.e.post(new defpackage.jon(joqVar, r0));
                return;
            case 18:
                defpackage.joq joqVar2 = (defpackage.joq) this.a;
                joqVar2.c();
                defpackage.rqm rqmVar = new defpackage.rqm(joqVar2.b, false, false);
                defpackage.acbk[] acbkVarArr = {defpackage.acbk.B};
                defpackage.rro rroVarH = defpackage.rrp.h(defpackage.yzd.GEARHEAD, 19, defpackage.zaa.LOG_TESTCODES);
                rroVarH.j(acbkVarArr);
                final defpackage.rrs rrsVarL = rroVarH.l();
                final ?? r12 = this.b;
                if (rqmVar.g(new defpackage.rqk() { // from class: jom
                    @Override // defpackage.rqk
                    public final void a(boolean z4) {
                        ((defpackage.yqj) defpackage.joq.a.l().ai((char) 2477)).y("Finished waiting for lifetime to complete, verified: %b", java.lang.Boolean.valueOf(z4));
                        r12.b(rrsVarL);
                    }
                })) {
                    return;
                }
                ((defpackage.yqj) ((defpackage.yqj) defpackage.joq.a.h()).ai((char) 2480)).u("Could not register callback to log audio service migration test code.");
                return;
            case 19:
                java.lang.Object obj7 = this.b;
                defpackage.joq joqVar3 = (defpackage.joq) obj7;
                joqVar3.c();
                joqVar3.e();
                if (!joqVar3.g.isEmpty()) {
                    throw new java.lang.IllegalStateException();
                }
                ?? r13 = this.a;
                if (!joqVar3.n(r13)) {
                    joqVar3.b();
                    return;
                }
                try {
                    r13.c(true);
                    joqVar3.f.ag = new defpackage.wyz(obj7);
                    defpackage.jpb jpbVar = joqVar3.y;
                    jpbVar.c.d.post(new defpackage.jpa(jpbVar, 0));
                    defpackage.jbw jbwVar = joqVar3.l;
                    defpackage.jbw.a.l().ai(1800).u("startServiceDiscovery");
                    final defpackage.izs izsVar = jbwVar.d;
                    izsVar.b.g();
                    defpackage.jap japVar = izsVar.w;
                    defpackage.jam jamVar = new defpackage.jam() { // from class: izm
                        @Override // defpackage.jam
                        public final void a(defpackage.izt iztVar) {
                            if (i == 0) {
                                boolean z4 = iztVar.f;
                                defpackage.jcu jcuVar = iztVar.c;
                                izsVar.d(iztVar.b, jcuVar.i(), z4);
                                return;
                            }
                            defpackage.izu izuVar = new defpackage.izu(iztVar.h, iztVar.g, iztVar.i, iztVar.j);
                            boolean z5 = iztVar.f;
                            boolean z6 = iztVar.e;
                            defpackage.jcu jcuVar2 = iztVar.c;
                            izsVar.h(iztVar.b, jcuVar2, z6, z5, izuVar);
                        }
                    };
                    defpackage.jam jamVar2 = new defpackage.jam() { // from class: izm
                        @Override // defpackage.jam
                        public final void a(defpackage.izt iztVar) {
                            if (i2 == 0) {
                                boolean z4 = iztVar.f;
                                defpackage.jcu jcuVar = iztVar.c;
                                izsVar.d(iztVar.b, jcuVar.i(), z4);
                                return;
                            }
                            defpackage.izu izuVar = new defpackage.izu(iztVar.h, iztVar.g, iztVar.i, iztVar.j);
                            boolean z5 = iztVar.f;
                            boolean z6 = iztVar.e;
                            defpackage.jcu jcuVar2 = iztVar.c;
                            izsVar.h(iztVar.b, jcuVar2, z6, z5, izuVar);
                        }
                    };
                    japVar.a.b(jamVar);
                    japVar.b.b(jamVar2);
                    return;
                } catch (android.os.RemoteException e2) {
                    ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) defpackage.joq.a.h()).p(e2)).ai((char) 2493)).u("onHandoffStatus RemoteException in ::startCarConnection");
                    joqVar3.b();
                    return;
                }
            default:
                if (((defpackage.joq) this.b).w) {
                    try {
                        ?? r2 = this.a;
                        int i4 = defpackage.ygw.d;
                        r2.h(false, defpackage.ymx.a, 0, 0, defpackage.xpc.a.h());
                        return;
                    } catch (android.os.RemoteException e3) {
                        ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) defpackage.jpc.a.h()).p(e3)).ai((char) 2510)).u("RemoteException in ::resumeServices");
                        return;
                    }
                }
                java.lang.Object obj8 = this.b;
                ?? r14 = this.a;
                defpackage.joq joqVar4 = (defpackage.joq) obj8;
                joqVar4.c();
                joqVar4.d();
                java.util.List<defpackage.rxr> list3 = joqVar4.g;
                if (list3.contains(r14)) {
                    throw new java.lang.IllegalArgumentException();
                }
                if (!joqVar4.n(r14)) {
                    joqVar4.b();
                    return;
                }
                defpackage.xpc xpcVar = joqVar4.s;
                for (defpackage.rxr rxrVar : list3) {
                    try {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.util.Iterator<E> it = xpcVar.c.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((defpackage.xpa) it.next()).h());
                        }
                        rxrVar.h(true, arrayList, ((defpackage.joq) obj8).p, ((defpackage.joq) obj8).q, xpcVar.h());
                    } catch (android.os.RemoteException e4) {
                        ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) defpackage.joq.a.h()).p(e4)).ai((char) 2489)).u("RemoteException in ::resumeServices");
                        joqVar4.b();
                        return;
                    }
                }
                return;
        }
    }

    public /* synthetic */ aq(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    public /* synthetic */ aq(java.lang.Object obj, java.lang.Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }

    public aq(defpackage.jnp jnpVar, defpackage.rxr rxrVar, int i) {
        this.c = i;
        this.b = jnpVar;
        this.a = rxrVar;
    }
}
