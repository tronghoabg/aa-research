package defpackage;

import kotlin.Metadata;

/* loaded from: classes3.dex */
public final class agqq extends agqx {
    private int flags;
    private agnq kmClass;
    private agqo version;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public agqq(Metadata metadata, boolean z) {
        this(agrk.INSTANCE.readKmClass$org_jetbrains_kotlin_kotlin_metadata_jvm(metadata), new agqo(metadata.mv()), metadata.xi());
        metadata.getClass();
        setAllowedToWrite$org_jetbrains_kotlin_kotlin_metadata_jvm(!z);
    }

    public final agnq getKmClass() {
        return this.kmClass;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agqq(agnq agnqVar, agqo agqoVar, int i) {
        super(null);
        agnqVar.getClass();
        agqoVar.getClass();
        this.kmClass = agnqVar;
        this.version = agqoVar;
        this.flags = i;
    }
}
