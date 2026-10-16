package defpackage;

import java.util.Collection;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class hnj {
    public final hnm a;
    private final List b = afbe.a;

    public hnj(hnm hnmVar) {
        this.a = hnmVar;
    }

    public abstract Collection a();

    public final String toString() {
        return getClass().getSimpleName() + "(id=" + this.a + ", originHints=[" + a().size() + " items redacted], tokens=" + this.b + ", redacted...)";
    }
}
