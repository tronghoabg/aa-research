package e.a;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.logging.Logger;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class cm {

    /* renamed from: d, reason: collision with root package name */
    private Object[] f46537d;

    /* renamed from: e, reason: collision with root package name */
    private int f46538e;

    /* renamed from: c, reason: collision with root package name */
    private static final Logger f46536c = Logger.getLogger(cm.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public static final cd f46534a = new cb();

    /* renamed from: b, reason: collision with root package name */
    static final com.google.d.h.f f46535b = com.google.d.h.f.m().h();

    cm(int i2, Object[] objArr) {
        this.f46538e = i2;
        this.f46537d = objArr;
    }

    static /* bridge */ /* synthetic */ byte[] k(InputStream inputStream) {
        try {
            return com.google.d.h.h.b(inputStream);
        } catch (IOException e2) {
            throw new RuntimeException("failure reading serialized stream", e2);
        }
    }

    private final int n() {
        Object[] objArr = this.f46537d;
        if (objArr != null) {
            return objArr.length;
        }
        return 0;
    }

    private final int o() {
        int i2 = this.f46538e;
        return i2 + i2;
    }

    private final Object p(int i2) {
        return this.f46537d[i2 + i2 + 1];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object q(int i2, ch chVar) {
        Object objP = p(i2);
        return objP instanceof byte[] ? chVar.a((byte[]) objP) : ((cj) objP).c(chVar);
    }

    private final void r(int i2) {
        Object[] objArr = new Object[i2];
        if (!u()) {
            System.arraycopy(this.f46537d, 0, objArr, 0, o());
        }
        this.f46537d = objArr;
    }

    private final void s(int i2, byte[] bArr) {
        this.f46537d[i2 + i2] = bArr;
    }

    private final void t(int i2, Object obj) {
        if (this.f46537d instanceof byte[][]) {
            r(n());
        }
        this.f46537d[i2 + i2 + 1] = obj;
    }

    private final boolean u() {
        return this.f46538e == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final byte[] v(int i2) {
        return (byte[]) this.f46537d[i2 + i2];
    }

    private final byte[] w(int i2) {
        Object objP = p(i2);
        return objP instanceof byte[] ? (byte[]) objP : ((cj) objP).d();
    }

    final int b() {
        return this.f46538e;
    }

    public final Iterable c(ch chVar) {
        for (int i2 = 0; i2 < this.f46538e; i2++) {
            if (Arrays.equals(chVar.g(), v(i2))) {
                return new cg(this, chVar, i2);
            }
        }
        return null;
    }

    public final Object e(ch chVar) {
        int i2 = this.f46538e;
        do {
            i2--;
            if (i2 < 0) {
                return null;
            }
        } while (!Arrays.equals(chVar.g(), v(i2)));
        return q(i2, chVar);
    }

    public final void g(ch chVar) {
        if (u()) {
            return;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f46538e; i3++) {
            if (!Arrays.equals(chVar.g(), v(i3))) {
                s(i2, v(i3));
                t(i2, p(i3));
                i2++;
            }
        }
        Arrays.fill(this.f46537d, i2 + i2, o(), (Object) null);
        this.f46538e = i2;
    }

    public final void h(cm cmVar) {
        if (cmVar.u()) {
            return;
        }
        int iN = n() - o();
        if (u() || iN < cmVar.o()) {
            r(o() + cmVar.o());
        }
        System.arraycopy(cmVar.f46537d, 0, this.f46537d, o(), cmVar.o());
        this.f46538e += cmVar.f46538e;
    }

    public final void i(ch chVar, Object obj) {
        com.google.d.b.an.C(chVar, "key");
        com.google.d.b.an.C(obj, "value");
        if (o() == 0 || o() == n()) {
            int iO = o();
            r(Math.max(iO + iO, 8));
        }
        s(this.f46538e, chVar.g());
        boolean zF = chVar.f();
        int i2 = this.f46538e;
        if (zF) {
            t(i2, cj.a(chVar, obj));
        } else {
            this.f46537d[i2 + i2 + 1] = chVar.b(obj);
        }
        this.f46538e++;
    }

    final Object[] l() {
        Object[] objArr = new Object[o()];
        for (int i2 = 0; i2 < this.f46538e; i2++) {
            int i3 = i2 + i2;
            objArr[i3] = v(i2);
            Object objP = p(i2);
            if (!(objP instanceof byte[])) {
                objP = ((cj) objP).b();
            }
            objArr[i3 + 1] = objP;
        }
        return objArr;
    }

    final byte[][] m() {
        byte[][] bArr = new byte[o()][];
        Object[] objArr = this.f46537d;
        if (objArr instanceof byte[][]) {
            System.arraycopy(objArr, 0, bArr, 0, o());
            return bArr;
        }
        for (int i2 = 0; i2 < this.f46538e; i2++) {
            int i3 = i2 + i2;
            bArr[i3] = v(i2);
            bArr[i3 + 1] = w(i2);
        }
        return bArr;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Metadata(");
        for (int i2 = 0; i2 < this.f46538e; i2++) {
            if (i2 != 0) {
                sb.append(',');
            }
            String str = new String(v(i2), StandardCharsets.US_ASCII);
            sb.append(str);
            sb.append('=');
            if (str.endsWith("-bin")) {
                sb.append(f46535b.o(w(i2)));
            } else {
                sb.append(new String(w(i2), StandardCharsets.US_ASCII));
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public cm() {
    }
}
