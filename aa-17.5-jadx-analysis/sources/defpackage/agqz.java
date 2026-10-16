package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class agqz implements agpr {
    public static final agqy Companion = new agqy(null);
    private static final agpv TYPE = new agpv(affw.b(agqz.class));
    private String anonymousObjectOriginName;
    private int jvmFlags;
    private final List<agoj> localDelegatedProperties = new ArrayList(0);
    private String moduleName;

    public final String getAnonymousObjectOriginName() {
        return this.anonymousObjectOriginName;
    }

    public final int getJvmFlags() {
        return this.jvmFlags;
    }

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

    public final void setAnonymousObjectOriginName(String str) {
        this.anonymousObjectOriginName = str;
    }

    public final void setJvmFlags(int i) {
        this.jvmFlags = i;
    }

    public final void setModuleName(String str) {
        this.moduleName = str;
    }
}
