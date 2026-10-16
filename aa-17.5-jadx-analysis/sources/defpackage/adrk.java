package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Locale;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public abstract class adrk implements adzw {
    public static final Logger v = Logger.getLogger(adrk.class.getName());

    @Override // defpackage.adzw
    public final void d() {
        adwq adwqVarV;
        aeag aeagVar;
        if (v().i || (aeagVar = (adwqVarV = v()).b) == null || aeagVar.a() <= 0) {
            return;
        }
        adwqVarV.a(false, true);
    }

    @Override // defpackage.adzw
    public final void f() {
        adrj adrjVarQ = q();
        adwm adwmVar = adrjVarQ.m;
        adwmVar.a = adrjVarQ;
        adrjVarQ.j = adwmVar;
    }

    @Override // defpackage.adzw
    public final void g(int i) {
        adrj adrjVarQ = q();
        adsv adsvVar = adrjVarQ.j;
        int i2 = aeeb.a;
        adrjVarQ.e(new rgm(adrjVarQ, i, 20));
    }

    @Override // defpackage.adzw
    public final void h(adje adjeVar) {
        v().d = adjeVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.adzw
    public final void n(InputStream inputStream) throws IOException {
        int iA;
        try {
            if (!v().i) {
                adwq adwqVarV = v();
                if (adwqVarV.i) {
                    throw new IllegalStateException("Framer already closed");
                }
                adwqVarV.j++;
                adwqVarV.k++;
                adwqVarV.l = 0L;
                adzv.g(adwqVarV.h);
                adje adjeVar = adwqVarV.d;
                adjd adjdVar = adjc.a;
                try {
                    try {
                        int iAvailable = inputStream.available();
                        if (iAvailable != 0 && adjeVar != adjdVar) {
                            adwn adwnVar = new adwn(adwqVarV);
                            try {
                                iA = inputStream.a(adwnVar);
                                adwnVar.close();
                                int i = adwqVarV.a;
                                if (i >= 0 && iA > i) {
                                    throw new adnt(adnq.i.e(String.format(Locale.US, "message too large %d > %d", Integer.valueOf(iA), Integer.valueOf(adwqVarV.a))), null);
                                }
                                adwqVarV.b(adwnVar, true);
                            } catch (Throwable th) {
                                adwnVar.close();
                                throw th;
                            }
                        } else if (iAvailable != -1) {
                            adwqVarV.l = iAvailable;
                            int i2 = adwqVarV.a;
                            if (i2 >= 0 && iAvailable > i2) {
                                throw new adnt(adnq.i.e(String.format(Locale.US, "message too large %d > %d", Integer.valueOf(iAvailable), Integer.valueOf(adwqVarV.a))), null);
                            }
                            ByteBuffer byteBuffer = adwqVarV.f;
                            byteBuffer.clear();
                            byteBuffer.put((byte) 0).putInt(iAvailable);
                            adwqVarV.c = iAvailable + 5;
                            adwqVarV.c(byteBuffer.array(), 0, byteBuffer.position());
                            iA = inputStream.a(adwqVarV.e);
                        } else {
                            adwn adwnVar2 = new adwn(adwqVarV);
                            iA = inputStream.a(adwnVar2);
                            adwqVarV.b(adwnVar2, false);
                        }
                        if (iAvailable != -1 && iA != iAvailable) {
                            throw new adnt(adnq.l.e(String.format("Message length inaccurate %s != %s", Integer.valueOf(iA), Integer.valueOf(iAvailable))), null);
                        }
                        adzv adzvVar = adwqVarV.h;
                        adzv.g(adzvVar);
                        adzvVar.c(adwqVarV.l);
                        adzv.g(adzvVar);
                    } catch (adnt e) {
                        throw e;
                    }
                } catch (IOException e2) {
                    throw new adnt(adnq.l.e("Failed to frame message").d(e2), null);
                } catch (RuntimeException e3) {
                    throw new adnt(adnq.l.e("Failed to frame message").d(e3), null);
                }
            }
        } finally {
            adue.g(inputStream);
        }
    }

    @Override // defpackage.adzw
    public boolean o() {
        throw null;
    }

    protected abstract adrj q();

    protected abstract adwq v();

    public final void w(int i) {
        adrj adrjVarQ = q();
        synchronized (adrjVarQ.k) {
            adrjVarQ.n += i;
        }
    }
}
