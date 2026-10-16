package defpackage;

import java.util.logging.Level;

/* loaded from: classes.dex */
public final class yob extends yns {
    public static final a a = new a();

    final class a extends yoo implements ynz {
    }

    @Deprecated
    public static yob c(String str) {
        return new yob(yqn.d(str.replace('/', '.')));
    }

    @Override // defpackage.yns
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ynz a(Level level) {
        boolean zK = k(level);
        yqn.n(i(), level, zK);
        return !zK ? a : new yoa(this, level);
    }
}
