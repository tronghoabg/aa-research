package okhttp3.internal.http2;

import Bf.r;
import ab.b;
import cg.C1621j;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import okhttp3.internal.Util;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/internal/http2/Http2;", "", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class Http2 {

    /* renamed from: a, reason: collision with root package name */
    public static final Http2 f42723a = new Http2();

    /* renamed from: b, reason: collision with root package name */
    public static final C1621j f42724b;

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f42725c;

    /* renamed from: d, reason: collision with root package name */
    public static final String[] f42726d;

    /* renamed from: e, reason: collision with root package name */
    public static final String[] f42727e;

    static {
        C1621j c1621j = C1621j.f19903d;
        f42724b = b.c("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
        f42725c = new String[]{"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        f42726d = new String[64];
        String[] strArr = new String[256];
        int i5 = 0;
        for (int i10 = 0; i10 < 256; i10++) {
            String binaryString = Integer.toBinaryString(i10);
            AbstractC3340k.d(binaryString, "toBinaryString(it)");
            strArr[i10] = r.i0(Util.h("%8s", binaryString), ' ', '0');
        }
        f42727e = strArr;
        String[] strArr2 = f42726d;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i11 = iArr[0];
        strArr2[i11 | 8] = AbstractC3340k.k("|PADDED", strArr2[i11]);
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        int i12 = 0;
        while (i12 < 3) {
            int i13 = iArr2[i12];
            i12++;
            int i14 = iArr[0];
            String[] strArr3 = f42726d;
            int i15 = i14 | i13;
            StringBuilder sb2 = new StringBuilder();
            sb2.append((Object) strArr3[i14]);
            sb2.append('|');
            sb2.append((Object) strArr3[i13]);
            strArr3[i15] = sb2.toString();
            strArr3[i15 | 8] = ((Object) strArr3[i14]) + '|' + ((Object) strArr3[i13]) + "|PADDED";
        }
        int length = f42726d.length;
        while (i5 < length) {
            int i16 = i5 + 1;
            String[] strArr4 = f42726d;
            if (strArr4[i5] == null) {
                strArr4[i5] = f42727e[i5];
            }
            i5 = i16;
        }
    }

    private Http2() {
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(boolean r10, int r11, int r12, int r13, int r14) {
        /*
            r0 = 5
            r1 = 3
            r2 = 2
            r3 = 4
            r4 = 0
            r5 = 1
            java.lang.String[] r6 = okhttp3.internal.http2.Http2.f42725c
            int r7 = r6.length
            if (r13 >= r7) goto Le
            r6 = r6[r13]
            goto L1c
        Le:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r13)
            java.lang.Object[] r7 = new java.lang.Object[r5]
            r7[r4] = r6
            java.lang.String r6 = "0x%02x"
            java.lang.String r6 = okhttp3.internal.Util.h(r6, r7)
        L1c:
            if (r14 != 0) goto L21
            java.lang.String r13 = ""
            goto L6a
        L21:
            java.lang.String[] r7 = okhttp3.internal.http2.Http2.f42727e
            if (r13 == r2) goto L68
            if (r13 == r1) goto L68
            if (r13 == r3) goto L60
            r8 = 6
            if (r13 == r8) goto L60
            r8 = 7
            if (r13 == r8) goto L68
            r8 = 8
            if (r13 == r8) goto L68
            java.lang.String[] r8 = okhttp3.internal.http2.Http2.f42726d
            int r9 = r8.length
            if (r14 >= r9) goto L3e
            r7 = r8[r14]
            kotlin.jvm.internal.AbstractC3340k.b(r7)
            goto L40
        L3e:
            r7 = r7[r14]
        L40:
            if (r13 != r0) goto L4f
            r8 = r14 & 4
            if (r8 == 0) goto L4f
            java.lang.String r13 = "HEADERS"
            java.lang.String r14 = "PUSH_PROMISE"
            java.lang.String r13 = Bf.r.h0(r7, r13, r14, r4)
            goto L6a
        L4f:
            if (r13 != 0) goto L5e
            r13 = r14 & 32
            if (r13 == 0) goto L5e
            java.lang.String r13 = "PRIORITY"
            java.lang.String r14 = "COMPRESSED"
            java.lang.String r13 = Bf.r.h0(r7, r13, r14, r4)
            goto L6a
        L5e:
            r13 = r7
            goto L6a
        L60:
            if (r14 != r5) goto L65
            java.lang.String r13 = "ACK"
            goto L6a
        L65:
            r13 = r7[r14]
            goto L6a
        L68:
            r13 = r7[r14]
        L6a:
            if (r10 == 0) goto L6f
            java.lang.String r10 = "<<"
            goto L71
        L6f:
            java.lang.String r10 = ">>"
        L71:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            java.lang.Object[] r14 = new java.lang.Object[r0]
            r14[r4] = r10
            r14[r5] = r11
            r14[r2] = r12
            r14[r1] = r6
            r14[r3] = r13
            java.lang.String r10 = "%s 0x%08x %5d %-13s %s"
            java.lang.String r10 = okhttp3.internal.Util.h(r10, r14)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2.a(boolean, int, int, int, int):java.lang.String");
    }
}
