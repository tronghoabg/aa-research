package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class agfi {
    static final /* synthetic */ agfi $$INSTANCE = new agfi();
    private static final agfk EMPTY = new agfh();

    private agfi() {
    }

    public final agfk create(List<? extends agfc> list) {
        list.getClass();
        return list.isEmpty() ? EMPTY : new agfl(list);
    }

    public final agfk getEMPTY() {
        return EMPTY;
    }
}
