package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class agrp implements agqb {
    public static final agro Companion = new agro(null);
    public static final agpv TYPE = new agpv(affw.b(agrp.class));
    private final List<agms> annotations = new ArrayList();

    public final List<agms> getAnnotations() {
        return this.annotations;
    }

    @Override // defpackage.agpu
    public agpv getType() {
        return TYPE;
    }
}
