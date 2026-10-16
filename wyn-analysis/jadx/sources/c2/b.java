package C2;

import J5.y;
import N1.B;
import Q1.o;
import ic.d;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class b extends d {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1780b;

    public static D2.a O(o oVar) {
        String strP = oVar.p();
        strP.getClass();
        String strP2 = oVar.p();
        strP2.getClass();
        return new D2.a(strP, strP2, oVar.o(), oVar.o(), Arrays.copyOfRange(oVar.f9702a, oVar.f9703b, oVar.f9704c));
    }

    @Override // ic.d
    public final B p(B2.a aVar, ByteBuffer byteBuffer) {
        boolean z2 = true;
        switch (this.f1780b) {
            case 0:
                if (byteBuffer.get() != 116) {
                    return null;
                }
                y yVar = new y(byteBuffer.array(), byteBuffer.limit(), 1, (byte) 0);
                int i5 = 12;
                yVar.t(12);
                int iF = (yVar.f() + yVar.i(12)) - 4;
                yVar.t(44);
                yVar.u(yVar.i(12));
                yVar.t(16);
                ArrayList arrayList = new ArrayList();
                while (yVar.f() < iF) {
                    yVar.t(48);
                    int i10 = yVar.i(8);
                    yVar.t(4);
                    int iF2 = yVar.f() + yVar.i(i5);
                    String str = null;
                    String str2 = null;
                    while (yVar.f() < iF2) {
                        int i11 = yVar.i(8);
                        int i12 = yVar.i(8);
                        boolean z10 = z2;
                        int iF3 = yVar.f() + i12;
                        if (i11 == 2) {
                            int i13 = yVar.i(16);
                            yVar.t(8);
                            if (i13 == 3) {
                                while (yVar.f() < iF3) {
                                    int i14 = yVar.i(8);
                                    Charset charset = StandardCharsets.US_ASCII;
                                    byte[] bArr = new byte[i14];
                                    yVar.l(i14, bArr);
                                    String str3 = new String(bArr, charset);
                                    int i15 = yVar.i(8);
                                    for (int i16 = 0; i16 < i15; i16++) {
                                        yVar.u(yVar.i(8));
                                    }
                                    str = str3;
                                }
                            }
                        } else if (i11 == 21) {
                            Charset charset2 = StandardCharsets.US_ASCII;
                            byte[] bArr2 = new byte[i12];
                            yVar.l(i12, bArr2);
                            str2 = new String(bArr2, charset2);
                        }
                        yVar.q(iF3 * 8);
                        z2 = z10;
                    }
                    boolean z11 = z2;
                    yVar.q(iF2 * 8);
                    if (str != null && str2 != null) {
                        arrayList.add(new a(i10, str.concat(str2)));
                    }
                    z2 = z11;
                    i5 = 12;
                }
                if (arrayList.isEmpty()) {
                    return null;
                }
                return new B(arrayList);
            default:
                return new B(O(new o(byteBuffer.array(), byteBuffer.limit())));
        }
    }
}
