package defpackage;

import java.util.Map;

/* loaded from: classes3.dex */
public final class agfo implements agfc {
    private final Map<ahnj, ahuh<?>> allValueArguments;
    private final afye builtIns;
    private final boolean forcePropagationDeprecationToOverrides;
    private final ahnf fqName;
    private final aezr type$delegate;

    /* JADX WARN: Multi-variable type inference failed */
    public agfo(afye afyeVar, ahnf ahnfVar, Map<ahnj, ? extends ahuh<?>> map, boolean z) {
        afyeVar.getClass();
        ahnfVar.getClass();
        map.getClass();
        this.builtIns = afyeVar;
        this.fqName = ahnfVar;
        this.allValueArguments = map;
        this.forcePropagationDeprecationToOverrides = z;
        this.type$delegate = woy.dH(2, new agfn(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final aigw type_delegate$lambda$0(agfo agfoVar) {
        return agfoVar.builtIns.getBuiltInClassByFqName(agfoVar.getFqName()).getDefaultType();
    }

    @Override // defpackage.agfc
    public Map<ahnj, ahuh<?>> getAllValueArguments() {
        return this.allValueArguments;
    }

    @Override // defpackage.agfc
    public ahnf getFqName() {
        return this.fqName;
    }

    @Override // defpackage.agfc
    public agdx getSource() {
        agdx agdxVar = agdx.NO_SOURCE;
        agdxVar.getClass();
        return agdxVar;
    }

    @Override // defpackage.agfc
    public aigl getType() {
        Object objA = this.type$delegate.a();
        objA.getClass();
        return (aigl) objA;
    }

    public /* synthetic */ agfo(afye afyeVar, ahnf ahnfVar, Map map, boolean z, int i, afeu afeuVar) {
        this(afyeVar, ahnfVar, map, z & ((i & 8) == 0));
    }
}
