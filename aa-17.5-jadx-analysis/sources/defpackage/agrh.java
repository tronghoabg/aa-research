package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class agrh implements agpx {
    public static final agrg Companion = new agrg(null);
    public static final agpv TYPE = new agpv(affw.b(agrh.class));
    private final List<agoj> localDelegatedProperties = new ArrayList(0);
    private String moduleName;

    public final List<agoj> getLocalDelegatedProperties() {
        return this.localDelegatedProperties;
    }

    public final String getModuleName() {
        return this.moduleName;
    }

    @Override // defpackage.agpu
    public agpv getType() {
        return TYPE;
    }

    public final void setModuleName(String str) {
        this.moduleName = str;
    }
}
