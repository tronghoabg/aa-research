package io.ktor.utils.io;

import Va.M6;
import java.io.IOException;
import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: io.ktor.utils.io.q, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2884q {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC2886t f37425a;

    /* renamed from: b, reason: collision with root package name */
    public final Qf.a f37426b;

    /* renamed from: c, reason: collision with root package name */
    public final J f37427c;

    /* renamed from: d, reason: collision with root package name */
    public final long f37428d;

    /* renamed from: e, reason: collision with root package name */
    public final Pf.i f37429e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f37430f;

    /* renamed from: g, reason: collision with root package name */
    public final Pf.a f37431g;

    /* renamed from: h, reason: collision with root package name */
    public long f37432h;

    /* renamed from: i, reason: collision with root package name */
    public int f37433i;

    public C2884q(InterfaceC2886t channel, Qf.a matchString, J writeChannel, long j8) {
        AbstractC3340k.e(channel, "channel");
        AbstractC3340k.e(matchString, "matchString");
        AbstractC3340k.e(writeChannel, "writeChannel");
        this.f37425a = channel;
        this.f37426b = matchString;
        this.f37427c = writeChannel;
        this.f37428d = j8;
        byte[] bArr = matchString.f10005a;
        if (bArr.length <= 0) {
            throw new IllegalArgumentException("Empty match string not permitted for scanning");
        }
        this.f37429e = channel.d();
        int[] iArr = new int[bArr.length];
        int length = bArr.length;
        int i5 = 0;
        for (int i10 = 1; i10 < length; i10++) {
            while (i5 > 0 && matchString.a(i10) != matchString.a(i5)) {
                i5 = iArr[i5 - 1];
            }
            if (matchString.a(i10) == matchString.a(i5)) {
                i5++;
            }
            iArr[i10] = i5;
        }
        this.f37430f = iArr;
        this.f37431g = new Pf.a();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:31:0x0080
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:195)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:62)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:101)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    /* JADX WARN: Path cross not found for [B:37:0x00ad, B:75:0x013a], limit reached: 111 */
    /* JADX WARN: Path cross not found for [B:41:0x00b6, B:36:0x00ac], limit reached: 111 */
    /* JADX WARN: Path cross not found for [B:43:0x00c0, B:67:0x011e], limit reached: 111 */
    /* JADX WARN: Removed duplicated region for block: B:106:0x018c A[EDGE_INSN: B:106:0x018c->B:92:0x018c BREAK  A[LOOP:0: B:30:0x0077->B:88:0x0174], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0174 A[LOOP:0: B:30:0x0077->B:88:0x0174, LOOP_END] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:95:0x01ae -> B:97:0x01b1). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(lf.AbstractC3464c r25) {
        /*
            Method dump skipped, instructions count: 471
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.C2884q.a(lf.c):java.lang.Object");
    }

    public final void b(long j8) throws IOException {
        long j10 = this.f37432h + j8;
        long j11 = this.f37428d;
        if (j10 <= j11) {
            return;
        }
        StringBuilder sbU = M6.u(j11, "Limit of ", " bytes exceeded while searching for \"");
        Qf.a aVar = this.f37426b;
        AbstractC3340k.e(aVar, "<this>");
        sbU.append(Bf.r.h0(Bf.r.a0(aVar.f10005a), "\n", "\\n", false));
        sbU.append('\"');
        throw new IOException(sbU.toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004a, code lost:
    
        if (r15 == r1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00bc, code lost:
    
        if (r15 != r1) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0040 -> B:27:0x005a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x004a -> B:22:0x004e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(lf.AbstractC3464c r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.C2884q.c(lf.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x008a, code lost:
    
        if (r2.e(r0) == r1) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d7, code lost:
    
        if (r11 != r1) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c4 A[PHI: r10
  0x00c4: PHI (r10v2 boolean) = (r10v3 boolean), (r10v7 boolean) binds: [B:27:0x006e, B:22:0x0059] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00d7 -> B:43:0x00da). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(boolean r10, lf.AbstractC3464c r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.C2884q.d(boolean, lf.c):java.lang.Object");
    }
}
