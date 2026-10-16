package ga;

import A0.p;
import ea.C2487b;
import ef.C2532p;
import java.util.regex.Pattern;
import jf.InterfaceC3108h;
import kotlin.jvm.internal.AbstractC3340k;
import u1.InterfaceC4220i;

/* renamed from: ga.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2718d {

    /* renamed from: a, reason: collision with root package name */
    public final P9.d f35788a;

    /* renamed from: b, reason: collision with root package name */
    public final G9.e f35789b;

    /* renamed from: c, reason: collision with root package name */
    public final C2532p f35790c;

    /* renamed from: d, reason: collision with root package name */
    public final Nf.d f35791d = Nf.e.a();

    public C2718d(InterfaceC3108h interfaceC3108h, P9.d dVar, C2487b c2487b, G9.e eVar, InterfaceC4220i interfaceC4220i) {
        this.f35788a = dVar;
        this.f35789b = eVar;
        this.f35790c = Fe.c.z(new p(interfaceC4220i, 21));
    }

    public static String c(String str) {
        Pattern patternCompile = Pattern.compile("/");
        AbstractC3340k.d(patternCompile, "compile(...)");
        String strReplaceAll = patternCompile.matcher(str).replaceAll("");
        AbstractC3340k.d(strReplaceAll, "replaceAll(...)");
        return strReplaceAll;
    }

    public final Boolean a() {
        f fVar = b().f35828b;
        if (fVar != null) {
            return fVar.f35797a;
        }
        AbstractC3340k.m("sessionConfigs");
        throw null;
    }

    public final n b() {
        return (n) this.f35790c.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00bf A[Catch: all -> 0x0055, TRY_LEAVE, TryCatch #0 {all -> 0x0055, blocks: (B:21:0x0051, B:43:0x00b3, B:45:0x00bf, B:48:0x00c8, B:35:0x008b, B:37:0x0095, B:40:0x009e), top: B:59:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c8 A[Catch: all -> 0x0055, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0055, blocks: (B:21:0x0051, B:43:0x00b3, B:45:0x00bf, B:48:0x00c8, B:35:0x008b, B:37:0x0095, B:40:0x009e), top: B:59:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Type inference failed for: r8v0, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(jf.InterfaceC3103c r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ga.C2718d.d(jf.c):java.lang.Object");
    }
}
