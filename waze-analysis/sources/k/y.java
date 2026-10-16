package k;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class y {
    public static final i b(al alVar) {
        h.g.b.x.f(alVar, "<this>");
        return new af(alVar);
    }

    public static final j c(am amVar) {
        return aq.f(amVar);
    }

    public static final al d(Socket socket) throws IOException {
        h.g.b.x.f(socket, "<this>");
        k.a.h hVar = new k.a.h(socket);
        OutputStream outputStream = socket.getOutputStream();
        h.g.b.x.e(outputStream, "getOutputStream(...)");
        aa aaVar = new aa(outputStream, hVar);
        h.g.b.x.f(aaVar, "sink");
        return new c(hVar, aaVar);
    }

    public static final am e(File file) {
        return aq.g(file);
    }

    public static final am f(InputStream inputStream) {
        h.g.b.x.f(inputStream, "<this>");
        return new v(inputStream, new ao());
    }

    public static final am g(Socket socket) throws IOException {
        h.g.b.x.f(socket, "<this>");
        k.a.h hVar = new k.a.h(socket);
        InputStream inputStream = socket.getInputStream();
        h.g.b.x.e(inputStream, "getInputStream(...)");
        v vVar = new v(inputStream, hVar);
        h.g.b.x.f(vVar, "source");
        return new d(hVar, vVar);
    }

    public static final /* synthetic */ int h(char c2) {
        if (c2 >= '0' && c2 < ':') {
            return c2 - '0';
        }
        if (c2 >= 'a' && c2 < 'g') {
            return c2 - 'W';
        }
        if (c2 >= 'A' && c2 < 'G') {
            return c2 - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c2);
    }

    public static final int i(ak akVar, int i2) {
        int i3;
        h.g.b.x.f(akVar, "<this>");
        int[] iArrA = akVar.A();
        int length = akVar.B().length;
        h.g.b.x.f(iArrA, "<this>");
        int i4 = length - 1;
        int i5 = 0;
        while (true) {
            if (i5 <= i4) {
                int i6 = i2 + 1;
                i3 = (i5 + i4) >>> 1;
                int i7 = iArrA[i3];
                if (i7 >= i6) {
                    if (i7 <= i6) {
                        break;
                    }
                    i4 = i3 - 1;
                } else {
                    i5 = i3 + 1;
                }
            } else {
                i3 = (-i5) - 1;
                break;
            }
        }
        return i3 >= 0 ? i3 : ~i3;
    }

    private final void j(long j2, h hVar, int i2, List list, int i3, int i4, List list2) {
        int i5;
        long j3;
        List list3;
        int i6;
        int i7 = i2;
        int i8 = i3;
        List list4 = list2;
        if (i8 >= i4) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        for (int i9 = i8; i9 < i4; i9++) {
            if (((k) list.get(i9)).d() < i7) {
                throw new IllegalArgumentException("Failed requirement.");
            }
        }
        k kVar = (k) list.get(i3);
        k kVar2 = (k) list.get(i4 - 1);
        if (i7 == kVar.d()) {
            int iIntValue = ((Number) list4.get(i8)).intValue();
            i8++;
            i5 = iIntValue;
            kVar = (k) list.get(i8);
        } else {
            i5 = -1;
        }
        int i10 = i8 + 1;
        long j4 = 2;
        if (kVar.a(i7) == kVar2.a(i7)) {
            int iMin = Math.min(kVar.d(), kVar2.d());
            int i11 = 0;
            int i12 = i7;
            while (true) {
                if (i12 >= iMin) {
                    j3 = j4;
                    break;
                }
                j3 = j4;
                if (kVar.a(i12) != kVar2.a(i12)) {
                    break;
                }
                i11++;
                i12++;
                j4 = j3;
            }
            long jK = j2 + k(hVar) + j3;
            long j5 = i11;
            hVar.ah(-i11);
            hVar.ah(i5);
            int i13 = i7 + i11;
            while (i7 < i13) {
                hVar.ah(kVar.a(i7) & 255);
                i7++;
            }
            if (i10 == i4) {
                if (i13 != ((k) list.get(i8)).d()) {
                    throw new IllegalStateException("Check failed.");
                }
                hVar.ah(((Number) list4.get(i8)).intValue());
                return;
            } else {
                long j6 = jK + j5 + 1;
                h hVar2 = new h();
                hVar.ah(-((int) (k(hVar2) + j6)));
                j(j6, hVar2, i13, list, i8, i4, list4);
                hVar.ac(hVar2);
                return;
            }
        }
        int i14 = 1;
        while (i10 < i4) {
            if (((k) list.get(i10 - 1)).a(i7) != ((k) list.get(i10)).a(i7)) {
                i14++;
            }
            i10++;
        }
        long jK2 = j2 + k(hVar) + 2;
        int i15 = i14 + i14;
        hVar.ah(i14);
        hVar.ah(i5);
        for (int i16 = i8; i16 < i4; i16++) {
            byte bA = ((k) list.get(i16)).a(i7);
            if (i16 == i8 || bA != ((k) list.get(i16 - 1)).a(i7)) {
                hVar.ah(bA & 255);
            }
        }
        h hVar3 = new h();
        int i17 = i8;
        while (i17 < i4) {
            int i18 = i7 + 1;
            byte bA2 = ((k) list.get(i17)).a(i7);
            int i19 = i17 + 1;
            int i20 = i19;
            while (true) {
                if (i20 >= i4) {
                    i20 = i4;
                    break;
                } else if (bA2 != ((k) list.get(i20)).a(i7)) {
                    break;
                } else {
                    i20++;
                }
            }
            if (i19 == i20 && i18 == ((k) list.get(i17)).d()) {
                hVar.ah(((Number) list4.get(i17)).intValue());
                list3 = list4;
                i6 = i20;
            } else {
                long j7 = i15 + jK2;
                hVar.ah(-((int) (j7 + k(hVar3))));
                list3 = list4;
                i6 = i20;
                j(j7, hVar3, i18, list, i17, i6, list3);
            }
            i17 = i6;
            list4 = list3;
        }
        hVar.ac(hVar3);
    }

    private static final long k(h hVar) {
        return hVar.q() / 4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b2, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final k.z a(k.k... r12) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k.y.a(k.k[]):k.z");
    }
}
