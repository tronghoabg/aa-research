package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class jdj {
    final /* synthetic */ java.lang.Object a;
    private final java.lang.Object b;
    private final java.lang.Object c;
    private final java.lang.Object d;

    public jdj(defpackage.jdl jdlVar, android.os.ParcelFileDescriptor parcelFileDescriptor) {
        this.a = jdlVar;
        this.d = java.nio.ByteBuffer.allocate(65);
        android.os.ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new android.os.ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
        this.c = autoCloseInputStream;
        this.b = java.nio.channels.Channels.newChannel(autoCloseInputStream);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.nio.channels.ReadableByteChannel] */
    final synchronized int a(int i, java.nio.ByteBuffer byteBuffer) throws java.io.IOException {
        int i2;
        byteBuffer.clear();
        byteBuffer.limit(i);
        java.lang.Object obj = this.a;
        defpackage.jde jdeVar = ((defpackage.jdl) obj).d;
        i2 = this.b.read(byteBuffer);
        if (jdeVar != null) {
            java.util.concurrent.Executor executor = ((defpackage.jdl) obj).e;
            executor.getClass();
            executor.execute(new defpackage.hif(jdeVar, i2, 4));
        }
        byteBuffer.flip();
        return i2;
    }

    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Object, java.nio.channels.ReadableByteChannel] */
    public final synchronized void b() {
        java.lang.Object obj;
        defpackage.jdd jddVar;
        defpackage.jdd jddVar2;
        try {
            java.lang.Object obj2 = this.d;
            ((java.nio.ByteBuffer) obj2).clear();
            java.nio.ByteBuffer byteBufferDuplicate = ((java.nio.ByteBuffer) obj2).duplicate();
            if (a(1, byteBufferDuplicate) == 1) {
                int i = byteBufferDuplicate.get() & 255;
                java.nio.ByteBuffer byteBufferDuplicate2 = ((java.nio.ByteBuffer) obj2).duplicate();
                if (a(i, byteBufferDuplicate2) == i) {
                    defpackage.abox aboxVarC = defpackage.abox.C(defpackage.qug.a, defpackage.abny.M(byteBufferDuplicate2), defpackage.abol.a);
                    defpackage.abox.U(aboxVarC);
                    defpackage.abox.U(aboxVarC);
                    defpackage.qug qugVar = (defpackage.qug) aboxVarC;
                    if ((qugVar.b & 16) != 0) {
                        java.lang.Object obj3 = this.a;
                        synchronized (((defpackage.jdl) obj3).h) {
                            java.util.Map map = ((defpackage.jdl) obj3).g;
                            defpackage.ysr.ba(map.containsKey(java.lang.Integer.valueOf(qugVar.f)), "Endpoint doesn't have a listener for channel %s", qugVar.f);
                            jddVar2 = (defpackage.jdd) map.get(java.lang.Integer.valueOf(qugVar.f));
                            jddVar2.getClass();
                        }
                        defpackage.quf qufVar = qugVar.g;
                        if (qufVar == null) {
                            qufVar = defpackage.quf.a;
                        }
                        int iAx = defpackage.a.ax(qufVar.c);
                        if (iAx != 0 && iAx == 3) {
                            defpackage.quf qufVar2 = qugVar.g;
                            if (qufVar2 == null) {
                                qufVar2 = defpackage.quf.a;
                            }
                            int i2 = qufVar2.d;
                            jddVar2.e();
                        } else {
                            defpackage.quf qufVar3 = qugVar.g;
                            int iAx2 = defpackage.a.ax((qufVar3 == null ? defpackage.quf.a : qufVar3).c);
                            if (iAx2 != 0 && iAx2 == 4) {
                                if (qufVar3 == null) {
                                    qufVar3 = defpackage.quf.a;
                                }
                                int i3 = qufVar3.e;
                                jddVar2.f();
                            } else {
                                jddVar2.c();
                            }
                        }
                    } else {
                        java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate(qugVar.c + 2);
                        byteBufferAllocate.putShort((short) qugVar.d);
                        while (true) {
                            int i4 = this.b.read(byteBufferAllocate);
                            obj = this.a;
                            defpackage.jde jdeVar = ((defpackage.jdl) obj).d;
                            if (jdeVar != null) {
                                java.util.concurrent.Executor executor = ((defpackage.jdl) obj).e;
                                executor.getClass();
                                executor.execute(new defpackage.hif(jdeVar, i4, 5));
                            }
                            if (i4 <= 0 && !byteBufferAllocate.hasRemaining()) {
                                break;
                            }
                        }
                        synchronized (((defpackage.jdl) obj).h) {
                            java.util.Map map2 = ((defpackage.jdl) obj).g;
                            defpackage.ysr.ba(map2.containsKey(java.lang.Integer.valueOf(qugVar.f)), "Endpoint doesn't have a listener for channel %s", qugVar.f);
                            jddVar = (defpackage.jdd) map2.get(java.lang.Integer.valueOf(qugVar.f));
                            jddVar.getClass();
                        }
                        jddVar.b(qugVar, byteBufferAllocate);
                    }
                    ((defpackage.jdl) this.a).f.execute(new defpackage.ire(this, 12));
                }
            }
        } catch (java.io.IOException unused) {
            defpackage.ypu ypuVarAi = defpackage.jdl.a.h().ai(1890);
            java.lang.Object obj4 = this.a;
            int i5 = ((defpackage.jdl) obj4).j;
            if (i5 == 0) {
                throw null;
            }
            ypuVarAi.y("%s Read EOF or exception", defpackage.ebm.t(i5));
            ((defpackage.jdl) obj4).c.aF(defpackage.zaj.CAR_SERVICE_CONNECTION_ERROR, defpackage.zak.READER_IO_ERROR, "Failed to read message");
        }
    }

    public final void c() {
        synchronized (((defpackage.jdl) this.a).h) {
            try {
                ((android.os.ParcelFileDescriptor.AutoCloseInputStream) this.c).close();
            } catch (java.io.IOException e) {
                defpackage.ypu ypuVarAi = defpackage.jdl.a.h().p(e).ai(1891);
                int i = ((defpackage.jdl) this.a).j;
                java.lang.String strT = defpackage.ebm.t(i);
                if (i == 0) {
                    throw null;
                }
                ypuVarAi.y("%s Closing with exception", strT);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Set] */
    public final void d(java.lang.Object obj) {
        this.b.add(obj);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r4v5, types: [iut, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, java.util.Set] */
    public final void e(java.lang.Object obj) {
        defpackage.yqj yqjVar = (defpackage.yqj) defpackage.iuw.a.l().ai(1351);
        com.google.android.gms.car.display.CarDisplayId carDisplayId = ((defpackage.iuw) this.a).b.j;
        yqjVar.R("For display %s sending updated %s to listeners: %s", carDisplayId, this.d, obj);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj2 : this.b) {
            try {
                this.c.a(obj2, carDisplayId, obj);
            } catch (android.os.RemoteException e) {
                ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) defpackage.iuw.a.h()).p(e)).ai(1352)).M("Exception notifying %s changed for display: %s", this.d, ((defpackage.iuw) this.a).b.j);
                arrayList.add(obj2);
            }
        }
        this.b.removeAll(arrayList);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Set] */
    public final void f(java.lang.Object obj) {
        this.b.remove(obj);
    }

    public jdj(defpackage.iuw iuwVar, java.lang.String str, final defpackage.iuv iuvVar) {
        this(iuwVar, str, new defpackage.iut() { // from class: iuu
            @Override // defpackage.iut
            public final void a(java.lang.Object obj, com.google.android.gms.car.display.CarDisplayId carDisplayId, java.lang.Object obj2) throws android.os.RemoteException {
                iuvVar.a(obj, obj2);
            }
        });
    }

    public jdj(defpackage.iuw iuwVar, java.lang.String str, defpackage.iut iutVar) {
        this.a = iuwVar;
        this.b = java.util.Collections.newSetFromMap(new j$.util.concurrent.ConcurrentHashMap());
        this.d = str;
        this.c = iutVar;
    }
}
