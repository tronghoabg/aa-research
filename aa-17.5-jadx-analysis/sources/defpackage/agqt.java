package defpackage;

import java.util.List;
import kotlin.Metadata;

/* loaded from: classes3.dex */
public final class agqt extends agqx {
    private int flags;
    private List<String> partClassNames;
    private agqo version;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public agqt(Metadata metadata, boolean z) {
        this(woy.cD(metadata.d1()), new agqo(metadata.mv()), metadata.xi());
        metadata.getClass();
        setAllowedToWrite$org_jetbrains_kotlin_kotlin_metadata_jvm(!z);
    }

    public final List<String> getPartClassNames() {
        return this.partClassNames;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agqt(List<String> list, agqo agqoVar, int i) {
        super(null);
        list.getClass();
        agqoVar.getClass();
        this.partClassNames = list;
        this.version = agqoVar;
        this.flags = i;
    }
}
