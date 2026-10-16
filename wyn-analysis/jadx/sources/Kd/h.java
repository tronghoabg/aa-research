package Kd;

import Cd.U;
import Cd.s0;
import io.ktor.utils.io.Y;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3340k;
import org.apache.tika.metadata.TikaCoreProperties;
import r7.AbstractC3935e;

/* loaded from: classes5.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final Set f6754a = ff.m.P0(new Character[]{'/', '?', '#', '@'});

    /* renamed from: b, reason: collision with root package name */
    public static final int f6755b;

    static {
        List list = Y.f37379b;
        f6755b = 6;
        S3.f.g(AbstractC3935e.D("HTTP/1.0", "HTTP/1.1"), new Ad.g(18), new U(8));
    }

    public static final void a(Ld.c cVar, char c10) {
        throw new s0("Character with code " + (c10 & 255) + " is not allowed in header names, \n" + ((Object) cVar));
    }

    public static final int b(Ld.c cVar, D9.n nVar) {
        int i5 = nVar.f2593c;
        for (int i10 = nVar.f2592b; i10 < i5; i10++) {
            char cCharAt = cVar.charAt(i10);
            if (cCharAt == ':' && i10 != nVar.f2592b) {
                nVar.f2592b = i10 + 1;
                return i10;
            }
            if (AbstractC3340k.g(cCharAt, 32) <= 0 || Bf.k.o0("\"(),/:;<=>?@[\\]{}", cCharAt)) {
                int i11 = nVar.f2592b;
                if (cCharAt == ':') {
                    throw new s0("Empty header names are not allowed as per RFC7230.", false);
                }
                if (i10 == i11) {
                    throw new s0("Multiline headers via line folding is not supported since it is deprecated as per RFC7230.", false);
                }
                a(cVar, cCharAt);
                throw null;
            }
        }
        throw new s0("No colon in HTTP header in " + cVar.subSequence(nVar.f2592b, nVar.f2593c).toString() + " in builder: \n" + ((Object) cVar));
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00c7, code lost:
    
        a(r4, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00ca, code lost:
    
        throw null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0079 A[Catch: all -> 0x007d, TryCatch #0 {all -> 0x007d, blocks: (B:23:0x0070, B:25:0x0079, B:29:0x0081, B:32:0x008c, B:35:0x0098, B:38:0x00a4, B:40:0x00a8, B:56:0x00da, B:19:0x0058, B:43:0x00b1, B:52:0x00c7, B:53:0x00ca, B:54:0x00cb, B:55:0x00d2, B:57:0x00ea, B:58:0x00f1, B:59:0x00f2, B:61:0x00fc), top: B:65:0x0070 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0081 A[Catch: all -> 0x007d, TryCatch #0 {all -> 0x007d, blocks: (B:23:0x0070, B:25:0x0079, B:29:0x0081, B:32:0x008c, B:35:0x0098, B:38:0x00a4, B:40:0x00a8, B:56:0x00da, B:19:0x0058, B:43:0x00b1, B:52:0x00c7, B:53:0x00ca, B:54:0x00cb, B:55:0x00d2, B:57:0x00ea, B:58:0x00f1, B:59:0x00f2, B:61:0x00fc), top: B:65:0x0070 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* JADX WARN: Type inference failed for: r8v4, types: [io.ktor.utils.io.t] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x006b -> B:65:0x0070). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(io.ktor.utils.io.X r18, Ld.c r19, D9.n r20, lf.AbstractC3464c r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Kd.h.c(io.ktor.utils.io.X, Ld.c, D9.n, lf.c):java.lang.Object");
    }

    public static final void d(Ld.b bVar) {
        if (Bf.k.r0(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER, bVar)) {
            throw new s0("Host header with ':' should contains port: " + ((Object) bVar));
        }
        for (int i5 = 0; i5 < bVar.length(); i5++) {
            Character chValueOf = Character.valueOf(bVar.charAt(i5));
            Set set = f6754a;
            if (set.contains(chValueOf)) {
                throw new s0("Host cannot contain any of the following symbols: " + set);
            }
        }
    }
}
