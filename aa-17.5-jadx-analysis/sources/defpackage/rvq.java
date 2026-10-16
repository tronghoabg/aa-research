package defpackage;

import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.util.Map;

/* loaded from: classes.dex */
public final class rvq {
    final /* synthetic */ rvs a;
    private final ReadableByteChannel b;
    private final ParcelFileDescriptor.AutoCloseInputStream c;
    private final ByteBuffer d = ByteBuffer.allocate(65);

    public rvq(rvs rvsVar, ParcelFileDescriptor parcelFileDescriptor) {
        this.a = rvsVar;
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
        this.c = autoCloseInputStream;
        this.b = Channels.newChannel(autoCloseInputStream);
    }

    final synchronized int a(int i, ByteBuffer byteBuffer) throws IOException {
        int i2;
        byteBuffer.clear();
        byteBuffer.limit(i);
        i2 = this.b.read(byteBuffer);
        byteBuffer.flip();
        return i2;
    }

    public final synchronized void b() {
        rvs rvsVar;
        rvm rvmVar;
        rvm rvmVar2;
        try {
            ByteBuffer byteBuffer = this.d;
            byteBuffer.clear();
            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            if (a(1, byteBufferDuplicate) == 1) {
                int i = byteBufferDuplicate.get() & 255;
                ByteBuffer byteBufferDuplicate2 = byteBuffer.duplicate();
                if (a(i, byteBufferDuplicate2) == i) {
                    abnv abnvVarC = abnv.C(qtk.a, abmw.O(byteBufferDuplicate2), abnj.a);
                    abnv.U(abnvVarC);
                    abnv.U(abnvVarC);
                    qtk qtkVar = (qtk) abnvVarC;
                    int i2 = qtkVar.b & 16;
                    int i3 = 2;
                    if (i2 == 0) {
                        ByteBuffer byteBufferA = rvj.a.a(qtkVar.c + 2);
                        byteBufferA.putShort((short) qtkVar.d);
                        while (true) {
                            int i4 = this.b.read(byteBufferA);
                            rvsVar = this.a;
                            if (i4 <= 0 && !byteBufferA.hasRemaining()) {
                                break;
                            }
                        }
                        synchronized (rvsVar.f) {
                            Map map = rvsVar.e;
                            woy.Q(map.containsKey(Integer.valueOf(qtkVar.f)), "Endpoint doesn't have a listener for channel %s", qtkVar.f);
                            rvmVar = (rvm) map.get(Integer.valueOf(qtkVar.f));
                            rvmVar.getClass();
                        }
                        rvmVar.b(qtkVar, byteBufferA);
                    } else {
                        if (i2 == 0) {
                            throw new IllegalArgumentException();
                        }
                        rvs rvsVar2 = this.a;
                        synchronized (rvsVar2.f) {
                            Map map2 = rvsVar2.e;
                            woy.Q(map2.containsKey(Integer.valueOf(qtkVar.f)), "Endpoint doesn't have a listener for channel %s", qtkVar.f);
                            rvmVar2 = (rvm) map2.get(Integer.valueOf(qtkVar.f));
                            rvmVar2.getClass();
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
                            rvmVar2.c(qtjVar2.d);
                        } else {
                            qtj qtjVar3 = qtkVar.g;
                            int iAy2 = a.ay((qtjVar3 == null ? qtj.a : qtjVar3).c);
                            if (iAy2 != 0 && iAy2 == 4) {
                                if (qtjVar3 == null) {
                                    qtjVar3 = qtj.a;
                                }
                                rvmVar2.f(qtjVar3.e);
                            } else {
                                rvmVar2.d();
                            }
                        }
                    }
                    this.a.d.execute(new rsv(this, i3));
                }
            }
        } catch (IOException unused) {
            yop yopVarAi = rvs.a.h().ai(8412);
            rvs rvsVar3 = this.a;
            int i5 = rvsVar3.h;
            if (i5 == 0) {
                throw null;
            }
            yopVarAi.y("%s Read EOF or exception", ols.G(i5));
            rvsVar3.c.p(yze.CAR_SERVICE_CONNECTION_ERROR, yzf.READER_IO_ERROR, "Failed to read message");
        }
    }

    public final void c() {
        synchronized (this.a.f) {
            try {
                this.c.close();
            } catch (IOException e) {
                yop yopVarAi = rvs.a.h().p(e).ai(8413);
                int i = this.a.h;
                String strG = ols.G(i);
                if (i == 0) {
                    throw null;
                }
                yopVarAi.y("%s Closing with exception", strG);
            }
        }
    }
}
