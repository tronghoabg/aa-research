package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class aijw extends aigw implements ails {
    private final aihr attributes;
    private final ailq captureStatus;
    private final aikb constructor;
    private final boolean isMarkedNullable;
    private final boolean isProjectionNotNull;
    private final aijf lowerType;

    public /* synthetic */ aijw(ailq ailqVar, aikb aikbVar, aijf aijfVar, aihr aihrVar, boolean z, boolean z2, int i, afeu afeuVar) {
        this(ailqVar, aikbVar, aijfVar, (i & 8) != 0 ? aihr.Companion.getEmpty() : aihrVar, ((i & 16) == 0) & z, ((i & 32) == 0) & z2);
    }

    @Override // defpackage.aigl
    public List<aiin> getArguments() {
        return afbe.a;
    }

    @Override // defpackage.aigl
    public aihr getAttributes() {
        return this.attributes;
    }

    public final ailq getCaptureStatus() {
        return this.captureStatus;
    }

    public final aijf getLowerType() {
        return this.lowerType;
    }

    @Override // defpackage.aigl
    public ahxe getMemberScope() {
        return ailm.createErrorScope(aili.CAPTURED_TYPE_SCOPE, true, new String[0]);
    }

    @Override // defpackage.aigl
    public boolean isMarkedNullable() {
        return this.isMarkedNullable;
    }

    public final boolean isProjectionNotNull() {
        return this.isProjectionNotNull;
    }

    @Override // defpackage.aijf
    public aijw makeNullableAsSpecified(boolean z) {
        return new aijw(this.captureStatus, getConstructor(), this.lowerType, getAttributes(), z, false, 32, null);
    }

    @Override // defpackage.aijf, defpackage.aigl
    public aijw refine(aiju aijuVar) {
        aijuVar.getClass();
        aikb aikbVarRefine = getConstructor().refine(aijuVar);
        aijf aijfVar = this.lowerType;
        return new aijw(this.captureStatus, aikbVarRefine, aijfVar != null ? aijuVar.refineType((ailw) aijfVar).unwrap() : null, getAttributes(), isMarkedNullable(), false, 32, null);
    }

    @Override // defpackage.aijf
    public aigw replaceAttributes(aihr aihrVar) {
        aihrVar.getClass();
        return new aijw(this.captureStatus, getConstructor(), this.lowerType, aihrVar, isMarkedNullable(), this.isProjectionNotNull);
    }

    @Override // defpackage.aigl
    public aikb getConstructor() {
        return this.constructor;
    }

    public aijw(ailq ailqVar, aikb aikbVar, aijf aijfVar, aihr aihrVar, boolean z, boolean z2) {
        ailqVar.getClass();
        aikbVar.getClass();
        aihrVar.getClass();
        this.captureStatus = ailqVar;
        this.constructor = aikbVar;
        this.lowerType = aijfVar;
        this.attributes = aihrVar;
        this.isMarkedNullable = z;
        this.isProjectionNotNull = z2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public aijw(ailq ailqVar, aijf aijfVar, aiin aiinVar, agee ageeVar) {
        this(ailqVar, new aikb(aiinVar, null, null, ageeVar, 6, null), aijfVar, null, false, false, 56, null);
        ailqVar.getClass();
        aiinVar.getClass();
        ageeVar.getClass();
    }
}
