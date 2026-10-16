package defpackage;

import java.util.logging.Level;

/* loaded from: classes.dex */
public final class yph extends ypf {
    public yph(ypp yppVar) {
        super(yppVar);
    }

    public static yph c(String str) {
        return new yph(yqn.d(str));
    }

    public static yph m() {
        return new yph(yqn.d(yqn.g().b(yph.class)));
    }

    @Override // defpackage.yns
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ype a(Level level) {
        boolean zK = k(level);
        yqn.n(i(), level, zK);
        return !zK ? c : new ypg(this, level);
    }
}
