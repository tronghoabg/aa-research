package cg;

import Va.M6;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Logger;
import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: cg.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1613b {
    static {
        new a4.h();
    }

    public static final C1614c a(File file) {
        Logger logger = w.f19934a;
        AbstractC3340k.e(file, "<this>");
        return new C1614c(1, new FileOutputStream(file, true), new J());
    }

    public static final boolean b(byte[] a5, int i5, byte[] b5, int i10, int i11) {
        AbstractC3340k.e(a5, "a");
        AbstractC3340k.e(b5, "b");
        for (int i12 = 0; i12 < i11; i12++) {
            if (a5[i12 + i5] != b5[i12 + i10]) {
                return false;
            }
        }
        return true;
    }

    public static final C1609A c(F f10) {
        AbstractC3340k.e(f10, "<this>");
        return new C1609A(f10);
    }

    public static final C1610B d(H h10) {
        AbstractC3340k.e(h10, "<this>");
        return new C1610B(h10);
    }

    public static void e(long j8, C1618g c1618g, int i5, ArrayList arrayList, int i10, int i11, ArrayList arrayList2) {
        int i12;
        int i13;
        ArrayList arrayList3;
        long j10;
        int i14;
        int i15 = i5;
        ArrayList arrayList4 = arrayList;
        ArrayList arrayList5 = arrayList2;
        if (i10 >= i11) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        for (int i16 = i10; i16 < i11; i16++) {
            if (((C1621j) arrayList4.get(i16)).d() < i15) {
                throw new IllegalArgumentException("Failed requirement.");
            }
        }
        C1621j c1621j = (C1621j) arrayList.get(i10);
        C1621j c1621j2 = (C1621j) arrayList4.get(i11 - 1);
        if (i15 == c1621j.d()) {
            int iIntValue = ((Number) arrayList5.get(i10)).intValue();
            int i17 = i10 + 1;
            C1621j c1621j3 = (C1621j) arrayList4.get(i17);
            i12 = i17;
            i13 = iIntValue;
            c1621j = c1621j3;
        } else {
            i12 = i10;
            i13 = -1;
        }
        if (c1621j.i(i15) == c1621j2.i(i15)) {
            int iMin = Math.min(c1621j.d(), c1621j2.d());
            int i18 = 0;
            for (int i19 = i15; i19 < iMin && c1621j.i(i19) == c1621j2.i(i19); i19++) {
                i18++;
            }
            long j11 = 4;
            long j12 = (c1618g.f19902b / j11) + j8 + 2 + i18 + 1;
            c1618g.a0(-i18);
            c1618g.a0(i13);
            int i20 = i15 + i18;
            while (i15 < i20) {
                c1618g.a0(c1621j.i(i15) & 255);
                i15++;
            }
            if (i12 + 1 == i11) {
                if (i20 != ((C1621j) arrayList4.get(i12)).d()) {
                    throw new IllegalStateException("Check failed.");
                }
                c1618g.a0(((Number) arrayList5.get(i12)).intValue());
                return;
            } else {
                C1618g c1618g2 = new C1618g();
                c1618g.a0(((int) ((c1618g2.f19902b / j11) + j12)) * (-1));
                e(j12, c1618g2, i20, arrayList4, i12, i11, arrayList5);
                c1618g.q(c1618g2);
                return;
            }
        }
        int i21 = 1;
        for (int i22 = i12 + 1; i22 < i11; i22++) {
            if (((C1621j) arrayList4.get(i22 - 1)).i(i15) != ((C1621j) arrayList4.get(i22)).i(i15)) {
                i21++;
            }
        }
        long j13 = 4;
        long j14 = (c1618g.f19902b / j13) + j8 + 2 + (i21 * 2);
        c1618g.a0(i21);
        c1618g.a0(i13);
        for (int i23 = i12; i23 < i11; i23++) {
            int i24 = ((C1621j) arrayList4.get(i23)).i(i15);
            if (i23 == i12 || i24 != ((C1621j) arrayList4.get(i23 - 1)).i(i15)) {
                c1618g.a0(i24 & 255);
            }
        }
        C1618g c1618g3 = new C1618g();
        int i25 = i12;
        while (i25 < i11) {
            byte bI = ((C1621j) arrayList4.get(i25)).i(i15);
            int i26 = i25 + 1;
            int i27 = i26;
            while (true) {
                if (i27 >= i11) {
                    i27 = i11;
                    break;
                } else if (bI != ((C1621j) arrayList4.get(i27)).i(i15)) {
                    break;
                } else {
                    i27++;
                }
            }
            if (i26 == i27 && i15 + 1 == ((C1621j) arrayList4.get(i25)).d()) {
                c1618g.a0(((Number) arrayList5.get(i25)).intValue());
                arrayList3 = arrayList5;
                j10 = j14;
                i14 = i27;
            } else {
                c1618g.a0(((int) ((c1618g3.f19902b / j13) + j14)) * (-1));
                arrayList3 = arrayList5;
                j10 = j14;
                i14 = i27;
                e(j10, c1618g3, i15 + 1, arrayList, i25, i14, arrayList3);
                arrayList4 = arrayList;
            }
            j14 = j10;
            i25 = i14;
            arrayList5 = arrayList3;
        }
        c1618g.q(c1618g3);
    }

    public static final void f(long j8, long j10, long j11) {
        if ((j10 | j11) < 0 || j10 > j8 || j8 - j10 < j11) {
            StringBuilder sbU = M6.u(j8, "size=", " offset=");
            sbU.append(j10);
            sbU.append(" byteCount=");
            sbU.append(j11);
            throw new ArrayIndexOutOfBoundsException(sbU.toString());
        }
    }

    public static final boolean g(AssertionError assertionError) {
        Logger logger = w.f19934a;
        if (assertionError.getCause() != null) {
            String message = assertionError.getMessage();
            if (message != null ? Bf.k.n0(message, "getsockname failed", false) : false) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c7, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static cg.x h(cg.C1621j... r11) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cg.AbstractC1613b.h(cg.j[]):cg.x");
    }

    public static final int i(int i5) {
        return ((i5 & 255) << 24) | (((-16777216) & i5) >>> 24) | ((16711680 & i5) >>> 8) | ((65280 & i5) << 8);
    }

    public static final C1614c j(Socket socket) throws IOException {
        Logger logger = w.f19934a;
        G g9 = new G(socket);
        OutputStream outputStream = socket.getOutputStream();
        AbstractC3340k.d(outputStream, "getOutputStream(...)");
        return new C1614c(0, g9, new C1614c(1, outputStream, g9));
    }

    public static C1614c k(File file) {
        Logger logger = w.f19934a;
        AbstractC3340k.e(file, "<this>");
        return new C1614c(1, new FileOutputStream(file, false), new J());
    }

    public static final C1615d l(File file) {
        Logger logger = w.f19934a;
        AbstractC3340k.e(file, "<this>");
        return new C1615d(new FileInputStream(file), J.f19879d);
    }

    public static final C1615d m(InputStream inputStream) {
        Logger logger = w.f19934a;
        AbstractC3340k.e(inputStream, "<this>");
        return new C1615d(inputStream, new J());
    }

    public static final C1615d n(Socket socket) throws IOException {
        Logger logger = w.f19934a;
        G g9 = new G(socket);
        InputStream inputStream = socket.getInputStream();
        AbstractC3340k.d(inputStream, "getInputStream(...)");
        return new C1615d(g9, new C1615d(inputStream, g9));
    }
}
