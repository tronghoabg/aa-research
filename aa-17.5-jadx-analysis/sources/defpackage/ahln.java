package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class ahln {
    public static final ahlm Companion = new ahlm(null);
    private static final ahln EMPTY = new ahln(afbe.a);
    private final List<ahki> infos;

    private ahln(List<ahki> list) {
        this.infos = list;
    }

    public final ahki get(int i) {
        return (ahki) woy.bI(this.infos, i);
    }

    public /* synthetic */ ahln(List list, afeu afeuVar) {
        this(list);
    }
}
