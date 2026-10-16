package defpackage;

import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class ahog {
    private static final ahog EMPTY = new ahog(true);
    private static volatile boolean eagerlyParseMessageSets = false;
    private final Map<ahof, ahop<?, ?>> extensionsByNumber;

    public ahog(ahog ahogVar) {
        if (ahogVar == EMPTY) {
            this.extensionsByNumber = Collections.EMPTY_MAP;
        } else {
            this.extensionsByNumber = DesugarCollections.unmodifiableMap(ahogVar.extensionsByNumber);
        }
    }

    public static ahog getEmptyRegistry() {
        return EMPTY;
    }

    public static ahog newInstance() {
        return new ahog();
    }

    public final void add(ahop<?, ?> ahopVar) {
        this.extensionsByNumber.put(new ahof(ahopVar.getContainingTypeDefaultInstance(), ahopVar.getNumber()), ahopVar);
    }

    public <ContainingType extends ahpg> ahop<ContainingType, ?> findLiteExtensionByNumber(ContainingType containingtype, int i) {
        return (ahop) this.extensionsByNumber.get(new ahof(containingtype, i));
    }

    public ahog getUnmodifiable() {
        return new ahog(this);
    }

    public ahog() {
        this.extensionsByNumber = new HashMap();
    }

    private ahog(boolean z) {
        this.extensionsByNumber = Collections.EMPTY_MAP;
    }
}
