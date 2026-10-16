package dg;

import A7.R0;
import Bf.k;
import ad.r;
import cg.C1610B;
import cg.C1618g;
import cg.E;
import cg.y;
import com.applovin.shadow.okhttp3.internal.ws.WebSocketProtocol;
import ef.C2527k;
import ff.AbstractC2640A;
import ff.o;
import java.io.IOException;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.LinkedHashMap;
import ka.AbstractC3256n;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.C;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.G;
import tf.p;

/* loaded from: classes5.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f34289a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static final int a(char c10) {
        if ('0' <= c10 && c10 < ':') {
            return c10 - '0';
        }
        if ('a' <= c10 && c10 < 'g') {
            return c10 - 'W';
        }
        if ('A' <= c10 && c10 < 'G') {
            return c10 - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c10);
    }

    public static final LinkedHashMap b(ArrayList arrayList) {
        String str = y.f19937b;
        y yVarG = r.g("/");
        LinkedHashMap linkedHashMapS = AbstractC2640A.S(new C2527k(yVarG, new f(yVarG)));
        for (f fVar : o.M0(new R0(14), arrayList)) {
            if (((f) linkedHashMapS.put(fVar.f34302a, fVar)) == null) {
                while (true) {
                    y yVar = fVar.f34302a;
                    y yVarB = yVar.b();
                    if (yVarB != null) {
                        f fVar2 = (f) linkedHashMapS.get(yVarB);
                        if (fVar2 != null) {
                            fVar2.f34309h.add(yVar);
                            break;
                        }
                        f fVar3 = new f(yVarB);
                        linkedHashMapS.put(yVarB, fVar3);
                        fVar3.f34309h.add(yVar);
                        fVar = fVar3;
                    }
                }
            }
        }
        return linkedHashMapS;
    }

    public static final String c(int i5) {
        tg.b.t(16);
        String string = Integer.toString(i5, 16);
        AbstractC3340k.d(string, "toString(...)");
        return "0x".concat(string);
    }

    public static final f d(C1610B c1610b) throws IOException {
        Long lValueOf;
        int intLe = c1610b.readIntLe();
        if (intLe != 33639248) {
            throw new IOException("bad zip: expected " + c(33639248) + " but was " + c(intLe));
        }
        c1610b.skip(4L);
        short shortLe = c1610b.readShortLe();
        int i5 = shortLe & 65535;
        if ((shortLe & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + c(i5));
        }
        int shortLe2 = c1610b.readShortLe() & 65535;
        short shortLe3 = c1610b.readShortLe();
        int i10 = shortLe3 & 65535;
        short shortLe4 = c1610b.readShortLe();
        int i11 = shortLe4 & 65535;
        if (i10 == -1) {
            lValueOf = null;
        } else {
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            gregorianCalendar.set(14, 0);
            gregorianCalendar.set(((i11 >> 9) & 127) + 1980, ((i11 >> 5) & 15) - 1, shortLe4 & 31, (i10 >> 11) & 31, (i10 >> 5) & 63, (shortLe3 & 31) << 1);
            lValueOf = Long.valueOf(gregorianCalendar.getTime().getTime());
        }
        Long l10 = lValueOf;
        c1610b.readIntLe();
        F f10 = new F();
        f10.f39739a = c1610b.readIntLe() & 4294967295L;
        F f11 = new F();
        f11.f39739a = c1610b.readIntLe() & 4294967295L;
        int shortLe5 = c1610b.readShortLe() & 65535;
        int shortLe6 = c1610b.readShortLe() & 65535;
        int shortLe7 = c1610b.readShortLe() & 65535;
        c1610b.skip(8L);
        F f12 = new F();
        f12.f39739a = c1610b.readIntLe() & 4294967295L;
        String utf8 = c1610b.readUtf8(shortLe5);
        if (k.o0(utf8, (char) 0)) {
            throw new IOException("bad zip: filename contains 0x00");
        }
        long j8 = f11.f39739a == 4294967295L ? 8 : 0L;
        if (f10.f39739a == 4294967295L) {
            j8 += 8;
        }
        if (f12.f39739a == 4294967295L) {
            j8 += 8;
        }
        C c10 = new C();
        e(c1610b, shortLe6, new g(c10, j8, f11, c1610b, f10, f12));
        if (j8 > 0 && !c10.f39736a) {
            throw new IOException("bad zip: zip64 extra required but absent");
        }
        String utf82 = c1610b.readUtf8(shortLe7);
        String str = y.f19937b;
        return new f(r.g("/").d(utf8), Bf.r.b0(utf8, "/", false), utf82, f10.f39739a, f11.f39739a, shortLe2, l10, f12.f39739a);
    }

    public static final void e(C1610B c1610b, int i5, p pVar) throws IOException {
        long j8 = i5;
        while (j8 != 0) {
            if (j8 < 4) {
                throw new IOException("bad zip: truncated header in extra field");
            }
            int shortLe = c1610b.readShortLe() & 65535;
            long shortLe2 = c1610b.readShortLe() & WebSocketProtocol.PAYLOAD_SHORT_MAX;
            long j10 = j8 - 4;
            if (j10 < shortLe2) {
                throw new IOException("bad zip: truncated value in extra field");
            }
            c1610b.require(shortLe2);
            C1618g c1618g = c1610b.f19864b;
            long j11 = c1618g.f19902b;
            pVar.invoke(Integer.valueOf(shortLe), Long.valueOf(shortLe2));
            long j12 = (c1618g.f19902b + shortLe2) - j11;
            if (j12 < 0) {
                throw new IOException(AbstractC3256n.g(shortLe, "unsupported zip: too many bytes processed for "));
            }
            if (j12 > 0) {
                c1618g.skip(j12);
            }
            j8 = j10 - shortLe2;
        }
    }

    public static final R0.e f(C1610B c1610b, R0.e eVar) throws IOException {
        G g9 = new G();
        g9.f39740a = eVar != null ? (Long) eVar.f10055g : null;
        G g10 = new G();
        G g11 = new G();
        int intLe = c1610b.readIntLe();
        if (intLe != 67324752) {
            throw new IOException("bad zip: expected " + c(67324752) + " but was " + c(intLe));
        }
        c1610b.skip(2L);
        short shortLe = c1610b.readShortLe();
        int i5 = shortLe & 65535;
        if ((shortLe & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + c(i5));
        }
        c1610b.skip(18L);
        long shortLe2 = c1610b.readShortLe() & WebSocketProtocol.PAYLOAD_SHORT_MAX;
        int shortLe3 = c1610b.readShortLe() & 65535;
        c1610b.skip(shortLe2);
        if (eVar == null) {
            c1610b.skip(shortLe3);
            return null;
        }
        e(c1610b, shortLe3, new h(c1610b, g9, g10, g11));
        return new R0.e(eVar.f10050b, eVar.f10051c, null, (Long) eVar.f10053e, (Long) g11.f39740a, (Long) g9.f39740a, (Long) g10.f39740a);
    }

    public static final int g(E e7, int i5) {
        int i10;
        AbstractC3340k.e(e7, "<this>");
        int i11 = i5 + 1;
        int length = e7.f19876e.length;
        int[] iArr = e7.f19877f;
        AbstractC3340k.e(iArr, "<this>");
        int i12 = length - 1;
        int i13 = 0;
        while (true) {
            if (i13 <= i12) {
                i10 = (i13 + i12) >>> 1;
                int i14 = iArr[i10];
                if (i14 >= i11) {
                    if (i14 <= i11) {
                        break;
                    }
                    i12 = i10 - 1;
                } else {
                    i13 = i10 + 1;
                }
            } else {
                i10 = (-i13) - 1;
                break;
            }
        }
        return i10 >= 0 ? i10 : ~i10;
    }
}
