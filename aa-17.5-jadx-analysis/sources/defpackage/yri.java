package defpackage;

/* loaded from: classes3.dex */
public class yri extends yqn {
    private final yrg a;
    private final yrm b;
    private final yrh c;
    private final yqm d;

    public yri() {
        yrg yrgVar = (yrg) p(yrg.class, "flogger.backend_factory");
        this.a = yrgVar == null ? yrj.a : yrgVar;
        yrm yrmVar = (yrm) p(yrm.class, "flogger.logging_context");
        this.b = yrmVar == null ? yro.a : yrmVar;
        yrh yrhVar = (yrh) p(yrh.class, "flogger.clock");
        this.c = yrhVar == null ? yrl.a : yrhVar;
        this.d = yrk.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00bb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.Object p(java.lang.Class r17, java.lang.String r18) throws java.lang.ClassNotFoundException {
        /*
            Method dump skipped, instructions count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yri.p(java.lang.Class, java.lang.String):java.lang.Object");
    }

    @Override // defpackage.yqn
    protected final long c() {
        return this.c.a();
    }

    @Override // defpackage.yqn
    protected final ypp e(String str) {
        return this.a.a(str);
    }

    @Override // defpackage.yqn
    protected final yqm h() {
        return this.d;
    }

    @Override // defpackage.yqn
    protected final yrm j() {
        return this.b;
    }

    @Override // defpackage.yqn
    protected final String m() {
        return "Platform: " + getClass().getName() + "\nBackendFactory: " + this.a.toString() + "\nClock: " + this.c.toString() + "\nContextDataProvider: " + String.valueOf(this.b) + "\nLogCallerFinder: Default stack-based caller finder\n";
    }
}
