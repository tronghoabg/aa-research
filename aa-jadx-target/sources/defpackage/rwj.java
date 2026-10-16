package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class rwj {
    final /* synthetic */ defpackage.rwl a;
    private final java.nio.channels.ReadableByteChannel b;
    private final android.os.ParcelFileDescriptor.AutoCloseInputStream c;
    private final java.nio.ByteBuffer d = java.nio.ByteBuffer.allocate(65);

    public rwj(defpackage.rwl rwlVar, android.os.ParcelFileDescriptor parcelFileDescriptor) {
        this.a = rwlVar;
        android.os.ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new android.os.ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
        this.c = autoCloseInputStream;
        this.b = java.nio.channels.Channels.newChannel(autoCloseInputStream);
    }

    final synchronized int a(int i, java.nio.ByteBuffer byteBuffer) throws java.io.IOException {
        int i2;
        byteBuffer.clear();
        byteBuffer.limit(i);
        i2 = this.b.read(byteBuffer);
        byteBuffer.flip();
        return i2;
    }

    public final synchronized void b() {
        defpackage.rwl rwlVar;
        defpackage.rwf rwfVar;
        defpackage.rwf rwfVar2;
        try {
            java.nio.ByteBuffer byteBuffer = this.d;
            byteBuffer.clear();
            java.nio.ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            if (a(1, byteBufferDuplicate) == 1) {
                int i = byteBufferDuplicate.get() & 255;
                java.nio.ByteBuffer byteBufferDuplicate2 = byteBuffer.duplicate();
                if (a(i, byteBufferDuplicate2) == i) {
                    defpackage.abox aboxVarC = defpackage.abox.C(defpackage.qug.a, defpackage.abny.M(byteBufferDuplicate2), defpackage.abol.a);
                    defpackage.abox.U(aboxVarC);
                    defpackage.abox.U(aboxVarC);
                    defpackage.qug qugVar = (defpackage.qug) aboxVarC;
                    int i2 = qugVar.b & 16;
                    if (i2 == 0) {
                        java.nio.ByteBuffer byteBufferA = defpackage.rwc.a.a(qugVar.c + 2);
                        byteBufferA.putShort((short) qugVar.d);
                        while (true) {
                            int i3 = this.b.read(byteBufferA);
                            rwlVar = this.a;
                            if (i3 <= 0 && !byteBufferA.hasRemaining()) {
                                break;
                            }
                        }
                        synchronized (rwlVar.f) {
                            java.util.Map map = rwlVar.e;
                            defpackage.ysr.ba(map.containsKey(java.lang.Integer.valueOf(qugVar.f)), "Endpoint doesn't have a listener for channel %s", qugVar.f);
                            rwfVar = (defpackage.rwf) map.get(java.lang.Integer.valueOf(qugVar.f));
                            rwfVar.getClass();
                        }
                        rwfVar.b(qugVar, byteBufferA);
                    } else {
                        if (i2 == 0) {
                            throw new java.lang.IllegalArgumentException();
                        }
                        defpackage.rwl rwlVar2 = this.a;
                        synchronized (rwlVar2.f) {
                            java.util.Map map2 = rwlVar2.e;
                            defpackage.ysr.ba(map2.containsKey(java.lang.Integer.valueOf(qugVar.f)), "Endpoint doesn't have a listener for channel %s", qugVar.f);
                            rwfVar2 = (defpackage.rwf) map2.get(java.lang.Integer.valueOf(qugVar.f));
                            rwfVar2.getClass();
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
                            rwfVar2.c(qufVar2.d);
                        } else {
                            defpackage.quf qufVar3 = qugVar.g;
                            int iAx2 = defpackage.a.ax((qufVar3 == null ? defpackage.quf.a : qufVar3).c);
                            if (iAx2 != 0 && iAx2 == 4) {
                                if (qufVar3 == null) {
                                    qufVar3 = defpackage.quf.a;
                                }
                                rwfVar2.f(qufVar3.e);
                            } else {
                                rwfVar2.d();
                            }
                        }
                    }
                    this.a.d.execute(new defpackage.qtk(this, 14));
                }
            }
        } catch (java.io.IOException unused) {
            defpackage.ypu ypuVarAi = defpackage.rwl.a.h().ai(8437);
            defpackage.rwl rwlVar3 = this.a;
            int i4 = rwlVar3.h;
            if (i4 == 0) {
                throw null;
            }
            ypuVarAi.y("%s Read EOF or exception", defpackage.ooa.m(i4));
            rwlVar3.c.p(defpackage.zaj.CAR_SERVICE_CONNECTION_ERROR, defpackage.zak.READER_IO_ERROR, "Failed to read message");
        }
    }

    public final void c() {
        synchronized (this.a.f) {
            try {
                this.c.close();
            } catch (java.io.IOException e) {
                defpackage.ypu ypuVarAi = defpackage.rwl.a.h().p(e).ai(8438);
                int i = this.a.h;
                java.lang.String strM = defpackage.ooa.m(i);
                if (i == 0) {
                    throw null;
                }
                ypuVarAi.y("%s Closing with exception", strM);
            }
        }
    }
}
