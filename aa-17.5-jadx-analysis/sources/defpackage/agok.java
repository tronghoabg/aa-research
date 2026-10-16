package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class agok {
    private final List<agms> annotations;
    private int flags;

    public agok(int i) {
        this.flags = i;
        this.annotations = new ArrayList(0);
    }

    public final List<agms> getAnnotations() {
        return this.annotations;
    }

    public final int getFlags$org_jetbrains_kotlin_kotlin_metadata() {
        return this.flags;
    }

    public final void setFlags$org_jetbrains_kotlin_kotlin_metadata(int i) {
        this.flags = i;
    }

    public agok() {
        this(0);
    }
}
