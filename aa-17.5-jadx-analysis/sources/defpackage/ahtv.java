package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class ahtv extends aigw implements ails {
    private final aihr attributes;
    private final ahtw constructor;
    private final boolean isMarkedNullable;
    private final aiin typeProjection;

    public /* synthetic */ ahtv(aiin aiinVar, ahtw ahtwVar, boolean z, aihr aihrVar, int i, afeu afeuVar) {
        this(aiinVar, (i & 2) != 0 ? new ahtx(aiinVar) : ahtwVar, z & ((i & 4) == 0), (i & 8) != 0 ? aihr.Companion.getEmpty() : aihrVar);
    }

    @Override // defpackage.aigl
    public List<aiin> getArguments() {
        return afbe.a;
    }

    @Override // defpackage.aigl
    public aihr getAttributes() {
        return this.attributes;
    }

    @Override // defpackage.aigl
    public ahxe getMemberScope() {
        return ailm.createErrorScope(aili.CAPTURED_TYPE_SCOPE, true, new String[0]);
    }

    @Override // defpackage.aigl
    public boolean isMarkedNullable() {
        return this.isMarkedNullable;
    }

    @Override // defpackage.aijf
    public ahtv makeNullableAsSpecified(boolean z) {
        return z == isMarkedNullable() ? this : new ahtv(this.typeProjection, getConstructor(), z, getAttributes());
    }

    @Override // defpackage.aijf, defpackage.aigl
    public ahtv refine(aiju aijuVar) {
        aijuVar.getClass();
        aiin aiinVarRefine = this.typeProjection.refine(aijuVar);
        aiinVarRefine.getClass();
        return new ahtv(aiinVarRefine, getConstructor(), isMarkedNullable(), getAttributes());
    }

    @Override // defpackage.aijf
    public aigw replaceAttributes(aihr aihrVar) {
        aihrVar.getClass();
        return new ahtv(this.typeProjection, getConstructor(), isMarkedNullable(), aihrVar);
    }

    @Override // defpackage.aigw
    public String toString() {
        StringBuilder sb = new StringBuilder("Captured(");
        sb.append(this.typeProjection);
        sb.append(')');
        sb.append(true != isMarkedNullable() ? "" : "?");
        return sb.toString();
    }

    @Override // defpackage.aigl
    public ahtw getConstructor() {
        return this.constructor;
    }

    public ahtv(aiin aiinVar, ahtw ahtwVar, boolean z, aihr aihrVar) {
        aiinVar.getClass();
        ahtwVar.getClass();
        aihrVar.getClass();
        this.typeProjection = aiinVar;
        this.constructor = ahtwVar;
        this.isMarkedNullable = z;
        this.attributes = aihrVar;
    }
}
