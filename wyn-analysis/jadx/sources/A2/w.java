package a2;

import N1.C0764m;
import N1.D;
import Q1.x;
import Va.M6;
import android.text.TextUtils;
import com.applovin.shadow.okio.Segment;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import l8.AbstractC3409K;
import l8.C3407I;
import l8.e0;
import s2.C;
import wa.C4398a;

/* loaded from: classes.dex */
public final class w implements s2.m {

    /* renamed from: i, reason: collision with root package name */
    public static final Pattern f17323i = Pattern.compile("LOCAL:([^,]+)");

    /* renamed from: j, reason: collision with root package name */
    public static final Pattern f17324j = Pattern.compile("MPEGTS:(-?\\d+)");

    /* renamed from: a, reason: collision with root package name */
    public final String f17325a;

    /* renamed from: b, reason: collision with root package name */
    public final Q1.u f17326b;

    /* renamed from: d, reason: collision with root package name */
    public final C4398a f17328d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f17329e;

    /* renamed from: f, reason: collision with root package name */
    public s2.o f17330f;

    /* renamed from: h, reason: collision with root package name */
    public int f17332h;

    /* renamed from: c, reason: collision with root package name */
    public final Q1.o f17327c = new Q1.o();

    /* renamed from: g, reason: collision with root package name */
    public byte[] f17331g = new byte[Segment.SHARE_MINIMUM];

    public w(String str, Q1.u uVar, C4398a c4398a, boolean z2) {
        this.f17325a = str;
        this.f17326b = uVar;
        this.f17328d = c4398a;
        this.f17329e = z2;
    }

    @Override // s2.m
    public final void a(long j8, long j10) {
        throw new IllegalStateException();
    }

    public final C b(long j8) {
        C cMo0m = this.f17330f.mo0m(0, 3);
        C0764m c0764m = new C0764m();
        c0764m.f8194m = N1.C.m("text/vtt");
        c0764m.f8186d = this.f17325a;
        c0764m.f8199r = j8;
        M6.y(c0764m, cMo0m);
        this.f17330f.l();
        return cMo0m;
    }

    @Override // s2.m
    public final void g(s2.o oVar) {
        if (this.f17329e) {
            oVar = new Dd.c(oVar, this.f17328d);
        }
        this.f17330f = oVar;
        oVar.s(new s2.q(-9223372036854775807L));
    }

    @Override // s2.m
    public final s2.m h() {
        return this;
    }

    @Override // s2.m
    public final boolean i(s2.n nVar) {
        s2.j jVar = (s2.j) nVar;
        jVar.c(this.f17331g, 0, 6, false);
        byte[] bArr = this.f17331g;
        Q1.o oVar = this.f17327c;
        oVar.E(6, bArr);
        if (X2.k.a(oVar)) {
            return true;
        }
        jVar.c(this.f17331g, 6, 3, false);
        oVar.E(9, this.f17331g);
        return X2.k.a(oVar);
    }

    @Override // s2.m
    public final List j() {
        C3407I c3407i = AbstractC3409K.f40056b;
        return e0.f40101e;
    }

    @Override // s2.m
    public final int k(s2.n nVar, J5.n nVar2) throws NumberFormatException, EOFException, InterruptedIOException, D {
        String strI;
        this.f17330f.getClass();
        int i5 = (int) ((s2.j) nVar).f44897c;
        int i10 = this.f17332h;
        byte[] bArr = this.f17331g;
        if (i10 == bArr.length) {
            this.f17331g = Arrays.copyOf(bArr, ((i5 != -1 ? i5 : bArr.length) * 3) / 2);
        }
        byte[] bArr2 = this.f17331g;
        int i11 = this.f17332h;
        int i12 = ((s2.j) nVar).read(bArr2, i11, bArr2.length - i11);
        if (i12 != -1) {
            int i13 = this.f17332h + i12;
            this.f17332h = i13;
            if (i5 == -1 || i13 != i5) {
                return 0;
            }
        }
        Q1.o oVar = new Q1.o(this.f17331g);
        X2.k.d(oVar);
        String strI2 = oVar.i(StandardCharsets.UTF_8);
        long jS = 0;
        long jC = 0;
        while (true) {
            Matcher matcher = null;
            if (TextUtils.isEmpty(strI2)) {
                while (true) {
                    String strI3 = oVar.i(StandardCharsets.UTF_8);
                    if (strI3 == null) {
                        break;
                    }
                    if (X2.k.f16077a.matcher(strI3).matches()) {
                        do {
                            strI = oVar.i(StandardCharsets.UTF_8);
                            if (strI != null) {
                            }
                        } while (!strI.isEmpty());
                    } else {
                        Matcher matcher2 = X2.i.f16069a.matcher(strI3);
                        if (matcher2.matches()) {
                            matcher = matcher2;
                            break;
                        }
                    }
                }
                if (matcher == null) {
                    b(0L);
                    return -1;
                }
                String strGroup = matcher.group(1);
                strGroup.getClass();
                long jC2 = X2.k.c(strGroup);
                int i14 = x.f9724a;
                long jB = this.f17326b.b(x.S((jS + jC2) - jC, 90000L, 1000000L, RoundingMode.DOWN) % 8589934592L);
                C cB = b(jB - jC2);
                byte[] bArr3 = this.f17331g;
                int i15 = this.f17332h;
                Q1.o oVar2 = this.f17327c;
                oVar2.E(i15, bArr3);
                cB.e(this.f17332h, oVar2);
                cB.a(jB, 1, this.f17332h, 0, null);
                return -1;
            }
            if (strI2.startsWith("X-TIMESTAMP-MAP")) {
                Matcher matcher3 = f17323i.matcher(strI2);
                if (!matcher3.find()) {
                    throw D.a(null, "X-TIMESTAMP-MAP doesn't contain local timestamp: ".concat(strI2));
                }
                Matcher matcher4 = f17324j.matcher(strI2);
                if (!matcher4.find()) {
                    throw D.a(null, "X-TIMESTAMP-MAP doesn't contain media timestamp: ".concat(strI2));
                }
                String strGroup2 = matcher3.group(1);
                strGroup2.getClass();
                jC = X2.k.c(strGroup2);
                String strGroup3 = matcher4.group(1);
                strGroup3.getClass();
                long j8 = Long.parseLong(strGroup3);
                int i16 = x.f9724a;
                jS = x.S(j8, 1000000L, 90000L, RoundingMode.DOWN);
            }
            strI2 = oVar.i(StandardCharsets.UTF_8);
        }
    }

    @Override // s2.m
    public final void release() {
    }
}
