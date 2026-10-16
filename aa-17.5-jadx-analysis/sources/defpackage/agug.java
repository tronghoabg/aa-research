package defpackage;

import com.google.android.sidekick.shared.remoteapi.RemoteApiConstants;
import java.util.Collection;
import java.util.Map;

/* loaded from: classes3.dex */
public class agug implements agvg {
    static final /* synthetic */ afia<Object>[] $$delegatedProperties = {new affn(agug.class, RemoteApiConstants.BROADCAST_INTENT_TYPE_EXTRA, "getType()Lorg/jetbrains/kotlin/types/SimpleType;", 0)};
    private final agzg firstArgument;
    private final ahnf fqName;
    private final boolean isIdeExternalAnnotation;
    private final agdx source;
    private final aiec type$delegate;

    public agug(agvu agvuVar, agzf agzfVar, ahnf ahnfVar) {
        agdx agdxVarSource;
        Collection<agzg> arguments;
        agvuVar.getClass();
        ahnfVar.getClass();
        this.fqName = ahnfVar;
        if (agzfVar == null || (agdxVarSource = agvuVar.getComponents().getSourceElementFactory().source(agzfVar)) == null) {
            agdxVarSource = agdx.NO_SOURCE;
            agdxVarSource.getClass();
        }
        this.source = agdxVarSource;
        this.type$delegate = agvuVar.getStorageManager().createLazyValue(new aguf(agvuVar, this));
        agzg agzgVar = null;
        if (agzfVar != null && (arguments = agzfVar.getArguments()) != null) {
            agzgVar = (agzg) woy.bG(arguments);
        }
        this.firstArgument = agzgVar;
        boolean z = false;
        if (agzfVar != null && agzfVar.isIdeExternalAnnotation()) {
            z = true;
        }
        this.isIdeExternalAnnotation = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final aigw type_delegate$lambda$0(agvu agvuVar, agug agugVar) {
        return agvuVar.getModule().getBuiltIns().getBuiltInClassByFqName(agugVar.getFqName()).getDefaultType();
    }

    @Override // defpackage.agfc
    public Map<ahnj, ahuh<?>> getAllValueArguments() {
        return afbf.a;
    }

    protected final agzg getFirstArgument() {
        return this.firstArgument;
    }

    @Override // defpackage.agfc
    public ahnf getFqName() {
        return this.fqName;
    }

    @Override // defpackage.agfc
    public agdx getSource() {
        return this.source;
    }

    @Override // defpackage.agfc
    public aigw getType() {
        Object value = aieh.getValue((aiec<? extends Object>) this.type$delegate, this, $$delegatedProperties[0]);
        value.getClass();
        return (aigw) value;
    }

    @Override // defpackage.agvg
    public boolean isIdeExternalAnnotation() {
        return this.isIdeExternalAnnotation;
    }
}
