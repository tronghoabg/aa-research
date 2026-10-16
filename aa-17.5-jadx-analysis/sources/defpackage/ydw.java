package defpackage;

import java.util.Map;

/* loaded from: classes3.dex */
final class ydw extends ygu {
    static final ydw a = new ydw();
    private static final long serialVersionUID = 0;

    private ydw() {
        super(ylx.a, 0, null);
    }

    private Object readResolve() {
        return a;
    }

    @Override // defpackage.ygm, defpackage.ybu, defpackage.yks
    public final /* synthetic */ Map w() {
        return this.map;
    }
}
