package defpackage;

import android.util.Log;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;

/* loaded from: classes.dex */
public final class yrc extends yqr {
    public static final Set a;
    public static final yqa b;
    public static final yra c;
    private final String d;
    private final Level e;
    private final Set f;
    private final yqa g;
    private final int h;

    static {
        Set setUnmodifiableSet = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(yof.a, ypi.a, ypj.a)));
        a = setUnmodifiableSet;
        ypw ypwVar = new ypw(yqd.a);
        ypwVar.d = yqd.b;
        ypwVar.a(setUnmodifiableSet);
        ypx ypxVar = new ypx(ypwVar);
        b = ypxVar;
        c = new yra("", true, 2, Level.ALL, setUnmodifiableSet, ypxVar);
    }

    public yrc(String str, String str2, boolean z, int i, Level level, Set set, yqa yqaVar) {
        super(str2);
        String strE = yrm.e(str, str2);
        this.d = z ? strE.substring(0, Math.min(strE.length(), 23)) : strE;
        this.h = 2;
        this.e = level;
        this.f = set;
        this.g = yqaVar;
    }

    public static void c(ypo ypoVar, String str, int i, Level level, Set set, yqa yqaVar) {
        String string;
        Boolean bool = (Boolean) ypoVar.c().d(ypj.a);
        if (bool == null || !bool.booleanValue()) {
            yqk yqkVarG = yqk.g(yqn.f(), ypoVar.c());
            boolean z = ypoVar.g().intValue() < level.intValue();
            if (z || yqp.a(ypoVar, yqkVarG, set)) {
                StringBuilder sb = new StringBuilder();
                if (yrm.j(2, ypoVar.an(), sb)) {
                    sb.append(" ");
                }
                if (!z || ypoVar.d() == null) {
                    ysa.e(ypoVar, sb);
                    yqp.b(yqkVarG, yqaVar, sb);
                } else {
                    sb.append("(REDACTED) ");
                    sb.append(ypoVar.d().b);
                }
                string = sb.toString();
            } else {
                Object objE = ypoVar.e();
                try {
                    string = ypr.c(objE);
                } catch (RuntimeException e) {
                    string = ypr.a(objE, e);
                }
            }
            Throwable th = (Throwable) ypoVar.c().d(yof.a);
            int iF = yrm.f(ypoVar.g());
            if (iF == 2) {
                Log.v(str, string, th);
                return;
            }
            if (iF == 3) {
                Log.d(str, string, th);
                return;
            }
            if (iF == 4) {
                Log.i(str, string, th);
            } else if (iF != 5) {
                Log.e(str, string, th);
            } else {
                Log.w(str, string, th);
            }
        }
    }

    @Override // defpackage.ypp
    public final void a(ypo ypoVar) {
        c(ypoVar, this.d, 2, this.e, this.f, this.g);
    }

    @Override // defpackage.ypp
    public final boolean b(Level level) {
        String str = this.d;
        int iF = yrm.f(level);
        return Log.isLoggable(str, iF) || Log.isLoggable("all", iF);
    }
}
