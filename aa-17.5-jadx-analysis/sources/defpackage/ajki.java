package defpackage;

import android.util.LongSparseArray;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class ajki {
    public long a;
    public final Object b;

    public ajki(int i) {
        this.a = 0L;
        ByteBuffer byteBufferA = rvj.a.a(i + 10);
        byteBufferA.putShort((short) 0);
        byteBufferA.position(10);
        this.b = byteBufferA;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ajna, java.lang.Object] */
    public final String a() throws IOException {
        String strP = this.b.p(this.a);
        this.a -= strP.length();
        return strP;
    }

    public final ajhv b() throws IOException {
        erb erbVar = new erb((byte[]) null, (short[]) null);
        while (true) {
            String strA = a();
            if (strA.length() == 0) {
                return ahdw.k(erbVar);
            }
            int iD = afyh.D(strA, ':', 1);
            if (iD != -1) {
                String strSubstring = strA.substring(0, iD);
                strSubstring.getClass();
                String strSubstring2 = strA.substring(iD + 1);
                strSubstring2.getClass();
                ahdw.l(erbVar, strSubstring, strSubstring2);
            } else if (strA.charAt(0) == ':') {
                String strSubstring3 = strA.substring(1);
                strSubstring3.getClass();
                ahdw.l(erbVar, "", strSubstring3);
            } else {
                ahdw.l(erbVar, "", strA);
            }
        }
    }

    public final synchronized long c() {
        long j;
        j = this.a + 1;
        this.a = j;
        return j;
    }

    public final int d() {
        return ((ByteBuffer) this.b).arrayOffset() + 10;
    }

    public final int e() {
        return ((ByteBuffer) this.b).limit() - 10;
    }

    public ajki(ajna ajnaVar) {
        this.b = ajnaVar;
        this.a = 262144L;
    }

    public ajki(byte[] bArr) {
        this.a = 0L;
        this.b = new LongSparseArray(2000);
    }

    public ajki() {
        this.a = 0L;
        this.b = new HashMap();
    }
}
