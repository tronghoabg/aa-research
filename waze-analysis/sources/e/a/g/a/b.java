package e.a.g.a;

import com.google.d.b.an;
import com.google.v.eu;
import com.google.v.fi;
import com.google.v.fo;
import com.google.v.z;
import e.a.bf;
import e.a.co;
import e.a.ee;
import e.a.eh;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class b implements co {

    /* renamed from: a, reason: collision with root package name */
    private static final ThreadLocal f47754a = new ThreadLocal();

    /* renamed from: b, reason: collision with root package name */
    private final fo f47755b;

    /* renamed from: c, reason: collision with root package name */
    private final fi f47756c;

    b(fi fiVar) {
        an.C(fiVar, "defaultInstance cannot be null");
        this.f47756c = fiVar;
        this.f47755b = fiVar.getParserForType();
    }

    @Override // e.a.co
    public final /* bridge */ /* synthetic */ InputStream a(Object obj) {
        return new a((fi) obj, this.f47755b);
    }

    @Override // e.a.co
    public final /* synthetic */ Object b(InputStream inputStream) throws IOException {
        byte[] bArr;
        if (inputStream instanceof a) {
            a aVar = (a) inputStream;
            if (aVar.c() == this.f47755b) {
                try {
                    return aVar.b();
                } catch (IllegalStateException unused) {
                }
            }
        }
        try {
            z zVarX = null;
            if (inputStream instanceof bf) {
                int iAvailable = inputStream.available();
                if (iAvailable > 0 && iAvailable <= 4194304) {
                    ThreadLocal threadLocal = f47754a;
                    Reference reference = (Reference) threadLocal.get();
                    if (reference == null || (bArr = (byte[]) reference.get()) == null || bArr.length < iAvailable) {
                        bArr = new byte[iAvailable];
                        threadLocal.set(new WeakReference(bArr));
                    }
                    int i2 = iAvailable;
                    while (i2 > 0) {
                        int i3 = inputStream.read(bArr, iAvailable - i2, i2);
                        if (i3 == -1) {
                            break;
                        }
                        i2 -= i3;
                    }
                    if (i2 != 0) {
                        throw new RuntimeException("size inaccurate: " + iAvailable + " != " + (iAvailable - i2));
                    }
                    zVarX = z.S(bArr, 0, iAvailable);
                } else if (iAvailable == 0) {
                    return this.f47756c;
                }
            }
            if (zVarX == null) {
                zVarX = z.X(inputStream);
            }
            zVarX.Y();
            try {
                fi fiVar = (fi) this.f47755b.a(zVarX, c.f47757a);
                try {
                    zVarX.E(0);
                    return fiVar;
                } catch (eu e2) {
                    throw e2;
                }
            } catch (eu e3) {
                throw new eh(ee.f47410j.g("Invalid protobuf byte sequence").f(e3));
            }
        } catch (IOException e4) {
            throw new RuntimeException(e4);
        }
    }
}
