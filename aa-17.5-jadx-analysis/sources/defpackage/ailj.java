package defpackage;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class ailj extends aigw {
    private final List<aiin> arguments;
    private final aiid constructor;
    private final String debugMessage;
    private final String[] formatParams;
    private final boolean isMarkedNullable;
    private final aill kind;
    private final ahxe memberScope;

    /* JADX WARN: Multi-variable type inference failed */
    public ailj(aiid aiidVar, ahxe ahxeVar, aill aillVar, List<? extends aiin> list, boolean z, String... strArr) {
        aiidVar.getClass();
        ahxeVar.getClass();
        aillVar.getClass();
        list.getClass();
        strArr.getClass();
        this.constructor = aiidVar;
        this.memberScope = ahxeVar;
        this.kind = aillVar;
        this.arguments = list;
        this.isMarkedNullable = z;
        this.formatParams = strArr;
        String debugMessage = aillVar.getDebugMessage();
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length);
        String str = String.format(debugMessage, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        str.getClass();
        this.debugMessage = str;
    }

    @Override // defpackage.aigl
    public List<aiin> getArguments() {
        return this.arguments;
    }

    @Override // defpackage.aigl
    public aihr getAttributes() {
        return aihr.Companion.getEmpty();
    }

    @Override // defpackage.aigl
    public aiid getConstructor() {
        return this.constructor;
    }

    public final String getDebugMessage() {
        return this.debugMessage;
    }

    public final aill getKind() {
        return this.kind;
    }

    @Override // defpackage.aigl
    public ahxe getMemberScope() {
        return this.memberScope;
    }

    @Override // defpackage.aigl
    public boolean isMarkedNullable() {
        return this.isMarkedNullable;
    }

    @Override // defpackage.aijf
    public aigw makeNullableAsSpecified(boolean z) {
        String[] strArr = this.formatParams;
        return new ailj(getConstructor(), getMemberScope(), this.kind, getArguments(), z, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @Override // defpackage.aigl
    public /* bridge */ /* synthetic */ aigl refine(aiju aijuVar) {
        refine(aijuVar);
        return this;
    }

    public final ailj replaceArguments(List<? extends aiin> list) {
        list.getClass();
        String[] strArr = this.formatParams;
        return new ailj(getConstructor(), getMemberScope(), this.kind, list, isMarkedNullable(), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @Override // defpackage.aigw, defpackage.aijf
    public aigw replaceAttributes(aihr aihrVar) {
        aihrVar.getClass();
        return this;
    }

    @Override // defpackage.aijf, defpackage.aigl
    public /* bridge */ /* synthetic */ aijf refine(aiju aijuVar) {
        refine(aijuVar);
        return this;
    }

    @Override // defpackage.aijf
    public /* bridge */ /* synthetic */ aijf replaceAttributes(aihr aihrVar) {
        replaceAttributes(aihrVar);
        return this;
    }

    @Override // defpackage.aijf, defpackage.aigl
    public ailj refine(aiju aijuVar) {
        aijuVar.getClass();
        return this;
    }

    public /* synthetic */ ailj(aiid aiidVar, ahxe ahxeVar, aill aillVar, List list, boolean z, String[] strArr, int i, afeu afeuVar) {
        this(aiidVar, ahxeVar, aillVar, (i & 8) != 0 ? afbe.a : list, ((i & 16) == 0) & z, strArr);
    }
}
