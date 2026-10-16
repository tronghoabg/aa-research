package defpackage;

import androidx.car.app.model.Alert;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class aect implements admd {
    private static final ThreadLocal b = new ThreadLocal();
    public final abow a;
    private final abpc c;

    public aect(abow abowVar) {
        abowVar.getClass();
        this.a = abowVar;
        this.c = abowVar.M();
    }

    @Override // defpackage.admd
    public final /* bridge */ /* synthetic */ InputStream a(Object obj) {
        return new aecs((abow) obj, this.c);
    }

    @Override // defpackage.admd
    public final /* bridge */ /* synthetic */ Object b(InputStream inputStream) throws IOException {
        abmw abmwVarN;
        byte[] bArr;
        if (inputStream instanceof aecs) {
            aecs aecsVar = (aecs) inputStream;
            if (aecsVar.b == this.c) {
                try {
                    abow abowVar = aecsVar.a;
                    if (abowVar != null) {
                        return abowVar;
                    }
                    throw new IllegalStateException("message not available");
                } catch (IllegalStateException unused) {
                }
            }
        }
        try {
            if (inputStream instanceof adku) {
                int iAvailable = inputStream.available();
                if (iAvailable <= 0 || iAvailable > 4194304) {
                    if (iAvailable == 0) {
                        return this.a;
                    }
                    abmwVarN = null;
                } else {
                    ThreadLocal threadLocal = b;
                    Reference reference = (Reference) threadLocal.get();
                    if (reference == null || (bArr = (byte[]) reference.get()) == null || bArr.length < iAvailable) {
                        bArr = new byte[iAvailable];
                        threadLocal.set(new WeakReference(bArr));
                    }
                    int i = iAvailable;
                    while (i > 0) {
                        int i2 = inputStream.read(bArr, iAvailable - i, i);
                        if (i2 == -1) {
                            break;
                        }
                        i -= i2;
                    }
                    if (i != 0) {
                        throw new RuntimeException("size inaccurate: " + iAvailable + " != " + (iAvailable - i));
                    }
                    abmwVarN = abmw.P(bArr, 0, iAvailable);
                }
            } else {
                abmwVarN = null;
            }
            if (abmwVarN == null) {
                abmwVarN = abmw.N(inputStream);
            }
            abmwVarN.j = Alert.DURATION_SHOW_INDEFINITELY;
            try {
                Object objH = this.c.h(abmwVarN, aecu.a);
                try {
                    abmwVarN.C(0);
                    return objH;
                } catch (abon e) {
                    throw e;
                }
            } catch (abon e2) {
                throw new adnt(adnq.l.e("Invalid protobuf byte sequence").d(e2), null);
            }
        } catch (IOException e3) {
            throw new RuntimeException(e3);
        }
    }
}
