package defpackage;

import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.car.display.CarDisplayId;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class jdc {
    final /* synthetic */ Object a;
    private final Object b;
    private final Object c;
    private final Object d;

    public jdc(jde jdeVar, ParcelFileDescriptor parcelFileDescriptor) {
        this.a = jdeVar;
        this.d = ByteBuffer.allocate(65);
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
        this.c = autoCloseInputStream;
        this.b = Channels.newChannel(autoCloseInputStream);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.nio.channels.ReadableByteChannel] */
    final synchronized int a(int i, ByteBuffer byteBuffer) throws IOException {
        int i2;
        byteBuffer.clear();
        byteBuffer.limit(i);
        Object obj = this.a;
        jcx jcxVar = ((jde) obj).d;
        i2 = this.b.read(byteBuffer);
        if (jcxVar != null) {
            Executor executor = ((jde) obj).e;
            executor.getClass();
            executor.execute(new hhx(jcxVar, i2, 4));
        }
        byteBuffer.flip();
        return i2;
    }

    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object, java.nio.channels.ReadableByteChannel] */
    public final synchronized void b() {
        Object obj;
        jcw jcwVar;
        jcw jcwVar2;
        byte[] bArr = null;
        try {
            Object obj2 = this.d;
            ((ByteBuffer) obj2).clear();
            ByteBuffer byteBufferDuplicate = ((ByteBuffer) obj2).duplicate();
            if (a(1, byteBufferDuplicate) == 1) {
                int i = byteBufferDuplicate.get() & 255;
                ByteBuffer byteBufferDuplicate2 = ((ByteBuffer) obj2).duplicate();
                if (a(i, byteBufferDuplicate2) == i) {
                    abnv abnvVarC = abnv.C(qtk.a, abmw.O(byteBufferDuplicate2), abnj.a);
                    abnv.U(abnvVarC);
                    abnv.U(abnvVarC);
                    qtk qtkVar = (qtk) abnvVarC;
                    if ((qtkVar.b & 16) != 0) {
                        Object obj3 = this.a;
                        synchronized (((jde) obj3).h) {
                            Map map = ((jde) obj3).g;
                            woy.Q(map.containsKey(Integer.valueOf(qtkVar.f)), "Endpoint doesn't have a listener for channel %s", qtkVar.f);
                            jcwVar2 = (jcw) map.get(Integer.valueOf(qtkVar.f));
                            jcwVar2.getClass();
                        }
                        qtj qtjVar = qtkVar.g;
                        if (qtjVar == null) {
                            qtjVar = qtj.a;
                        }
                        int iAy = a.ay(qtjVar.c);
                        if (iAy != 0 && iAy == 3) {
                            qtj qtjVar2 = qtkVar.g;
                            if (qtjVar2 == null) {
                                qtjVar2 = qtj.a;
                            }
                            int i2 = qtjVar2.d;
                            jcwVar2.e();
                        } else {
                            qtj qtjVar3 = qtkVar.g;
                            int iAy2 = a.ay((qtjVar3 == null ? qtj.a : qtjVar3).c);
                            if (iAy2 != 0 && iAy2 == 4) {
                                if (qtjVar3 == null) {
                                    qtjVar3 = qtj.a;
                                }
                                int i3 = qtjVar3.e;
                                jcwVar2.f();
                            } else {
                                jcwVar2.c();
                            }
                        }
                    } else {
                        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(qtkVar.c + 2);
                        byteBufferAllocate.putShort((short) qtkVar.d);
                        while (true) {
                            int i4 = this.b.read(byteBufferAllocate);
                            obj = this.a;
                            jcx jcxVar = ((jde) obj).d;
                            if (jcxVar != null) {
                                Executor executor = ((jde) obj).e;
                                executor.getClass();
                                executor.execute(new hhx(jcxVar, i4, 5));
                            }
                            if (i4 <= 0 && !byteBufferAllocate.hasRemaining()) {
                                break;
                            }
                        }
                        synchronized (((jde) obj).h) {
                            Map map2 = ((jde) obj).g;
                            woy.Q(map2.containsKey(Integer.valueOf(qtkVar.f)), "Endpoint doesn't have a listener for channel %s", qtkVar.f);
                            jcwVar = (jcw) map2.get(Integer.valueOf(qtkVar.f));
                            jcwVar.getClass();
                        }
                        jcwVar.b(qtkVar, byteBufferAllocate);
                    }
                    ((jde) this.a).f.execute(new imt(this, 18, bArr));
                }
            }
        } catch (IOException unused) {
            yop yopVarAi = jde.a.h().ai(1890);
            Object obj4 = this.a;
            int i5 = ((jde) obj4).j;
            if (i5 == 0) {
                throw null;
            }
            yopVarAi.y("%s Read EOF or exception", dlz.L(i5));
            ((jde) obj4).c.aF(yze.CAR_SERVICE_CONNECTION_ERROR, yzf.READER_IO_ERROR, "Failed to read message");
        }
    }

    public final void c() {
        synchronized (((jde) this.a).h) {
            try {
                ((ParcelFileDescriptor.AutoCloseInputStream) this.c).close();
            } catch (IOException e) {
                yop yopVarAi = jde.a.h().p(e).ai(1891);
                int i = ((jde) this.a).j;
                String strL = dlz.L(i);
                if (i == 0) {
                    throw null;
                }
                yopVarAi.y("%s Closing with exception", strL);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Set] */
    public final void d(Object obj) {
        this.b.add(obj);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r4v5, types: [iul, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, java.util.Set] */
    public final void e(Object obj) {
        ype ypeVar = (ype) iuo.a.l().ai(1351);
        CarDisplayId carDisplayId = ((iuo) this.a).b.j;
        ypeVar.R("For display %s sending updated %s to listeners: %s", carDisplayId, this.d, obj);
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : this.b) {
            try {
                this.c.a(obj2, carDisplayId, obj);
            } catch (RemoteException e) {
                ((ype) ((ype) ((ype) iuo.a.h()).p(e)).ai(1352)).M("Exception notifying %s changed for display: %s", this.d, ((iuo) this.a).b.j);
                arrayList.add(obj2);
            }
        }
        this.b.removeAll(arrayList);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Set] */
    public final void f(Object obj) {
        this.b.remove(obj);
    }

    public jdc(iuo iuoVar, String str, final iun iunVar) {
        this(iuoVar, str, new iul() { // from class: ium
            @Override // defpackage.iul
            public final void a(Object obj, CarDisplayId carDisplayId, Object obj2) throws RemoteException {
                iunVar.a(obj, obj2);
            }
        });
    }

    public jdc(iuo iuoVar, String str, iul iulVar) {
        this.a = iuoVar;
        this.b = Collections.newSetFromMap(new ConcurrentHashMap());
        this.d = str;
        this.c = iulVar;
    }
}
