package defpackage;

import kotlin.Metadata;

/* loaded from: classes3.dex */
public final class agqs extends agqx {
    private int flags;
    private agoi kmPackage;
    private agqo version;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public agqs(Metadata metadata, boolean z) {
        this(agrk.INSTANCE.readKmPackage$org_jetbrains_kotlin_kotlin_metadata_jvm(metadata), new agqo(metadata.mv()), metadata.xi());
        metadata.getClass();
        setAllowedToWrite$org_jetbrains_kotlin_kotlin_metadata_jvm(!z);
    }

    public final agoi getKmPackage() {
        return this.kmPackage;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agqs(agoi agoiVar, agqo agqoVar, int i) {
        super(null);
        agoiVar.getClass();
        agqoVar.getClass();
        this.kmPackage = agoiVar;
        this.version = agqoVar;
        this.flags = i;
    }
}
