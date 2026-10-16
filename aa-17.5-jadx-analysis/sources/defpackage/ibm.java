package defpackage;

import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* loaded from: classes2.dex */
public final class ibm implements huo {
    private final iaf a = new iaf();
    private final List b;
    private final boolean c;
    private final boolean d;
    private final hxl e;

    public ibm(List list, boolean z, hxl hxlVar, boolean z2) {
        this.b = list;
        this.c = z;
        this.e = hxlVar;
        this.d = z2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0035, code lost:
    
        r0.c(r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0075  */
    @Override // defpackage.huo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ defpackage.hwx a(java.lang.Object r12, int r13, int r14, defpackage.hum r15) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r0 = r11.d
            java.io.InputStream r12 = (java.io.InputStream) r12
            if (r0 == 0) goto L8d
            hxl r0 = r11.e
            if (r0 == 0) goto L8d
            boolean r1 = r11.c
            int r2 = defpackage.ifl.a
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r3 = 0
            r4 = r3
        L15:
            r5 = 0
            java.lang.Class<byte[]> r6 = byte[].class
            r7 = 16384(0x4000, float:2.2959E-41)
            java.lang.Object r6 = r0.a(r7, r6)     // Catch: java.lang.Throwable -> L71
            byte[] r6 = (byte[]) r6     // Catch: java.lang.Throwable -> L71
            r8 = r3
        L21:
            if (r8 >= r7) goto L33
            int r9 = 16384 - r8
            int r9 = r12.read(r6, r8, r9)     // Catch: java.lang.Throwable -> L2f
            r10 = -1
            if (r9 != r10) goto L2d
            goto L33
        L2d:
            int r8 = r8 + r9
            goto L21
        L2f:
            r11 = move-exception
            r12 = r3
            r5 = r6
            goto L73
        L33:
            if (r8 != 0) goto L39
            r0.c(r6)     // Catch: java.lang.Throwable -> L2f
            goto L3f
        L39:
            r2.add(r6)     // Catch: java.lang.Throwable -> L2f
            int r4 = r4 + r8
            if (r8 >= r7) goto L15
        L3f:
            if (r1 == 0) goto L46
            java.nio.ByteBuffer r12 = java.nio.ByteBuffer.allocate(r4)     // Catch: java.lang.Throwable -> L71
            goto L4a
        L46:
            java.nio.ByteBuffer r12 = java.nio.ByteBuffer.allocateDirect(r4)     // Catch: java.lang.Throwable -> L71
        L4a:
            java.util.Iterator r1 = r2.iterator()     // Catch: java.lang.Throwable -> L71
        L4e:
            boolean r6 = r1.hasNext()     // Catch: java.lang.Throwable -> L71
            if (r6 == 0) goto L66
            java.lang.Object r6 = r1.next()     // Catch: java.lang.Throwable -> L71
            byte[] r6 = (byte[]) r6     // Catch: java.lang.Throwable -> L71
            int r8 = java.lang.Math.min(r4, r7)     // Catch: java.lang.Throwable -> L71
            r12.put(r6, r3, r8)     // Catch: java.lang.Throwable -> L71
            int r4 = r4 - r8
            r0.c(r6)     // Catch: java.lang.Throwable -> L71
            goto L4e
        L66:
            r2.clear()     // Catch: java.lang.Throwable -> L71
            java.nio.ByteBuffer r12 = defpackage.ifl.b(r12)     // Catch: java.lang.Throwable -> L6e
            goto L93
        L6e:
            r11 = move-exception
            r12 = 1
            goto L73
        L71:
            r11 = move-exception
            r12 = r3
        L73:
            if (r12 != 0) goto L8c
            if (r5 == 0) goto L7a
            r0.c(r5)
        L7a:
            int r12 = r2.size()
        L7e:
            if (r3 >= r12) goto L8c
            java.lang.Object r13 = r2.get(r3)
            byte[] r13 = (byte[]) r13
            r0.c(r13)
            int r3 = r3 + 1
            goto L7e
        L8c:
            throw r11
        L8d:
            boolean r0 = r11.c
            java.nio.ByteBuffer r12 = defpackage.ifl.a(r12, r0)
        L93:
            iaf r11 = r11.a
            android.graphics.ImageDecoder$Source r12 = defpackage.hg$$ExternalSyntheticApiModelOutline0.m(r12)
            hwx r11 = r11.c(r12, r13, r14, r15)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ibm.a(java.lang.Object, int, int, hum):hwx");
    }

    @Override // defpackage.huo
    public final /* bridge */ /* synthetic */ boolean b(Object obj, hum humVar) throws IOException {
        InputStream inputStream = (InputStream) obj;
        if (!this.d) {
            return true;
        }
        hxl hxlVar = this.e;
        return (hxlVar == null || hdt.q(this.b, inputStream, hxlVar) == ImageHeaderParser.ImageType.UNKNOWN) ? false : true;
    }
}
