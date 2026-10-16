package defpackage;

import android.graphics.Bitmap;
import androidx.car.app.model.Alert;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class ajlp {
    private static ajlp c;
    public int a;
    public final Object b;

    public ajlp(Bitmap bitmap) {
        zkt.n(bitmap, "bitmap");
        this.b = bitmap;
        this.a = 1;
    }

    public static synchronized ajlp o() {
        ajlp ajlpVar;
        ajlpVar = c;
        if (ajlpVar == null) {
            ajlpVar = new ajlp((byte[]) null);
            c = ajlpVar;
        }
        return ajlpVar;
    }

    public final int a(int i) {
        return ((int[]) this.b)[i];
    }

    public final int b() {
        if ((this.a & 2) != 0) {
            return ((int[]) this.b)[1];
        }
        return -1;
    }

    public final int c() {
        if ((this.a & 16) != 0) {
            return ((int[]) this.b)[4];
        }
        return 65535;
    }

    public final int d() {
        return (this.a & 8) != 0 ? ((int[]) this.b)[3] : Alert.DURATION_SHOW_INDEFINITELY;
    }

    public final void e(ajlp ajlpVar) {
        ajlpVar.getClass();
        for (int i = 0; i < 10; i++) {
            if (ajlpVar.f(i)) {
                g(i, ajlpVar.a(i));
            }
        }
    }

    public final boolean f(int i) {
        return (this.a & (1 << i)) != 0;
    }

    public final void g(int i, int i2) {
        if (i < 0 || i >= 10) {
            return;
        }
        this.a = (1 << i) | this.a;
        ((int[]) this.b)[i] = i2;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.List] */
    public final synchronized List h() {
        this.a++;
        return this.b;
    }

    public final synchronized void i() {
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.CharSequence, java.lang.Object] */
    public final int j() {
        int i = this.a;
        if (i >= 0) {
            ?? r1 = this.b;
            if (i < r1.length()) {
                char cCharAt = r1.charAt(this.a);
                if (cCharAt >= '0' && cCharAt <= '9') {
                    this.a++;
                    return cCharAt - '0';
                }
                throw new IllegalArgumentException("non-digit character '" + cCharAt + "' [" + ((int) cCharAt) + "] at index " + this.a + " in: " + String.valueOf((Object) r1));
            }
        }
        throw new IndexOutOfBoundsException("index '" + this.a + "' out of bounds for input: " + String.valueOf(this.b));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.CharSequence, java.lang.Object] */
    public final boolean k() {
        return this.a < this.b.length();
    }

    public final void l() {
        HashSet hashSet = new HashSet();
        synchronized (this) {
            hashSet.addAll(this.b);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((umw) it.next()).p();
        }
    }

    public final int m(int i) {
        return (i + this.a) % ((yls) this.b).c;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    public final Object n(int i) {
        ?? r0 = this.b;
        if (i <= ((yls) r0).c) {
            return r0.get(m(i));
        }
        throw new IndexOutOfBoundsException();
    }

    public ajlp(Object obj) {
        this.a = 0;
        this.b = obj;
    }

    public ajlp(List list) {
        this.b = list;
        this.a = 0;
    }

    public ajlp(float[] fArr, int i) {
        this.b = fArr;
        this.a = i;
    }

    public ajlp(int i) {
        this.a = Alert.DURATION_SHOW_INDEFINITELY;
        this.b = new int[i];
    }

    public ajlp() {
        this.b = new int[10];
    }

    public ajlp(byte[] bArr) {
        this.b = Collections.EMPTY_LIST;
        this.a = 0;
    }

    public ajlp(byte[] bArr, byte[] bArr2) {
        this.b = new HashSet();
        this.a = 0;
    }
}
