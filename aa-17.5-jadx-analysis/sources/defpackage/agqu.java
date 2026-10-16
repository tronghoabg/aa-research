package defpackage;

import kotlin.Metadata;

/* loaded from: classes3.dex */
public final class agqu extends agqx {
    private String facadeClassName;
    private int flags;
    private agoi kmPackage;
    private agqo version;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public agqu(Metadata metadata, boolean z) {
        this(agrk.INSTANCE.readKmPackage$org_jetbrains_kotlin_kotlin_metadata_jvm(metadata), metadata.xs(), new agqo(metadata.mv()), metadata.xi());
        metadata.getClass();
        setAllowedToWrite$org_jetbrains_kotlin_kotlin_metadata_jvm(!z);
    }

    public final agoi getKmPackage() {
        return this.kmPackage;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agqu(agoi agoiVar, String str, agqo agqoVar, int i) {
        super(null);
        agoiVar.getClass();
        str.getClass();
        agqoVar.getClass();
        this.kmPackage = agoiVar;
        this.facadeClassName = str;
        this.version = agqoVar;
        this.flags = i;
    }
}
