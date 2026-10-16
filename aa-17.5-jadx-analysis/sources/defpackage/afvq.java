package defpackage;

import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class afvq {
    public static final afvp Companion = new afvp(null);
    public static final afvq EMPTY = new afvq(afbe.a, afbf.a, null);
    private final Map<Integer, afic> map;
    private final List<afrv> ownTypeParameters;
    private final afvq parent;

    /* JADX WARN: Multi-variable type inference failed */
    private afvq(List<afrv> list, Map<Integer, ? extends afic> map, afvq afvqVar) {
        this.ownTypeParameters = list;
        this.map = map;
        this.parent = afvqVar;
    }

    public final afic get(int i) {
        afic aficVar = this.map.get(Integer.valueOf(i));
        if (aficVar != null) {
            return aficVar;
        }
        afvq afvqVar = this.parent;
        if (afvqVar == null) {
            return null;
        }
        return afvqVar.get(i);
    }

    public final List<afrv> getOwnTypeParameters() {
        return this.ownTypeParameters;
    }

    public /* synthetic */ afvq(List list, Map map, afvq afvqVar, afeu afeuVar) {
        this(list, map, afvqVar);
    }
}
