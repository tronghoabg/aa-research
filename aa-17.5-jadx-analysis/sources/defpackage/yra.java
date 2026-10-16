package defpackage;

import java.util.Set;
import java.util.logging.Level;

/* loaded from: classes.dex */
public final class yra implements yqt {
    public final String a;
    public final boolean b;
    public final Level c;
    public final Set d;
    public final yqa e;
    public final int f = 2;

    public yra(String str, boolean z, int i, Level level, Set set, yqa yqaVar) {
        this.a = str;
        this.b = z;
        this.c = level;
        this.d = set;
        this.e = yqaVar;
    }

    @Override // defpackage.yqt
    public final ypp a(String str) {
        return new yrc(this.a, str, this.b, 2, this.c, this.d, this.e);
    }
}
