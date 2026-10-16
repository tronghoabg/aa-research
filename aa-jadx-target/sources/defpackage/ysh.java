package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ysh extends defpackage.yrw {
    public static final java.util.Set a;
    public static final defpackage.yrf b;
    public static final defpackage.ysf c;
    private final java.lang.String d;
    private final java.util.logging.Level e;
    private final java.util.Set f;
    private final defpackage.yrf g;
    private final int h;

    static {
        java.util.Set setUnmodifiableSet = j$.util.DesugarCollections.unmodifiableSet(new java.util.HashSet(java.util.Arrays.asList(defpackage.ypk.a, defpackage.yqn.a, defpackage.yqo.a)));
        a = setUnmodifiableSet;
        defpackage.yrb yrbVar = new defpackage.yrb(defpackage.yri.a);
        yrbVar.d = defpackage.yri.b;
        yrbVar.a(setUnmodifiableSet);
        defpackage.yrc yrcVar = new defpackage.yrc(yrbVar);
        b = yrcVar;
        c = new defpackage.ysf("", true, 2, java.util.logging.Level.ALL, setUnmodifiableSet, yrcVar);
    }

    public ysh(java.lang.String str, java.lang.String str2, boolean z, int i, java.util.logging.Level level, java.util.Set set, defpackage.yrf yrfVar) {
        super(str2);
        java.lang.String strE = defpackage.ysr.e(str, str2);
        this.d = z ? strE.substring(0, java.lang.Math.min(strE.length(), 23)) : strE;
        this.h = 2;
        this.e = level;
        this.f = set;
        this.g = yrfVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: yth */
    public static void c(defpackage.yqt yqtVar, java.lang.String str, int i, java.util.logging.Level level, java.util.Set set, defpackage.yrf yrfVar) throws yth {
        java.lang.String string;
        java.lang.Boolean bool = (java.lang.Boolean) yqtVar.c().d(defpackage.yqo.a);
        if (bool == null || !bool.booleanValue()) {
            defpackage.yrp yrpVarG = defpackage.yrp.g(defpackage.yrs.f(), yqtVar.c());
            boolean z = yqtVar.g().intValue() < level.intValue();
            if (z || defpackage.yru.a(yqtVar, yrpVarG, set)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                if (defpackage.ysr.g(2, yqtVar.an(), sb)) {
                    sb.append(" ");
                }
                if (!z || yqtVar.d() == null) {
                    defpackage.ytf.e(yqtVar, sb);
                    defpackage.yru.b(yrpVarG, yrfVar, sb);
                } else {
                    sb.append("(REDACTED) ");
                    sb.append(yqtVar.d().b);
                }
                string = sb.toString();
            } else {
                java.lang.Object objE = yqtVar.e();
                try {
                    string = defpackage.yqw.c(objE);
                } catch (java.lang.RuntimeException e) {
                    string = defpackage.yqw.a(objE, e);
                }
            }
            java.lang.Throwable th = (java.lang.Throwable) yqtVar.c().d(defpackage.ypk.a);
            int iF = defpackage.ysr.f(yqtVar.g());
            if (iF == 2) {
                android.util.Log.v(str, string, th);
                return;
            }
            if (iF == 3) {
                android.util.Log.d(str, string, th);
                return;
            }
            if (iF == 4) {
                android.util.Log.i(str, string, th);
            } else if (iF != 5) {
                android.util.Log.e(str, string, th);
            } else {
                android.util.Log.w(str, string, th);
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: yth */
    @Override // defpackage.yqu
    public final void a(defpackage.yqt yqtVar) throws yth {
        c(yqtVar, this.d, 2, this.e, this.f, this.g);
    }

    @Override // defpackage.yqu
    public final boolean b(java.util.logging.Level level) {
        java.lang.String str = this.d;
        int iF = defpackage.ysr.f(level);
        return android.util.Log.isLoggable(str, iF) || android.util.Log.isLoggable("all", iF);
    }
}
