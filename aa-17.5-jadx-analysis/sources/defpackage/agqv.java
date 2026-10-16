package defpackage;

import kotlin.Metadata;

/* loaded from: classes3.dex */
public final class agqv extends agqx {
    private int flags;
    private agoh kmLambda;
    private agqo version;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public agqv(Metadata metadata, boolean z) {
        this(agrk.INSTANCE.readKmLambda$org_jetbrains_kotlin_kotlin_metadata_jvm(metadata), new agqo(metadata.mv()), metadata.xi());
        metadata.getClass();
        setAllowedToWrite$org_jetbrains_kotlin_kotlin_metadata_jvm(!z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agqv(agoh agohVar, agqo agqoVar, int i) {
        super(null);
        agqoVar.getClass();
        this.kmLambda = agohVar;
        this.version = agqoVar;
        this.flags = i;
    }
}
