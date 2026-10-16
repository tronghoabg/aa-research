package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class dby implements cyn {
    public final int a;
    public Float b = null;
    public Float c = null;
    public ddp d = null;
    public ddp e = null;
    private final List f;

    public dby(int i, List list) {
        this.a = i;
        this.f = list;
    }

    @Override // defpackage.cyn
    public final boolean w() {
        return this.f.contains(this);
    }
}
