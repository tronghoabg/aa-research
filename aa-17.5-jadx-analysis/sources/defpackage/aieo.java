package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public abstract class aieo extends aigw {
    public static final aien Companion = new aien(null);
    private final boolean isMarkedNullable;
    private final ahxe memberScope;
    private final aikg originalTypeVariable;

    public aieo(aikg aikgVar, boolean z) {
        aikgVar.getClass();
        this.originalTypeVariable = aikgVar;
        this.isMarkedNullable = z;
        this.memberScope = ailm.createErrorScope(aili.STUB_TYPE_SCOPE, aikgVar.toString());
    }

    @Override // defpackage.aigl
    public List<aiin> getArguments() {
        return afbe.a;
    }

    @Override // defpackage.aigl
    public aihr getAttributes() {
        return aihr.Companion.getEmpty();
    }

    @Override // defpackage.aigl
    public ahxe getMemberScope() {
        return this.memberScope;
    }

    public final aikg getOriginalTypeVariable() {
        return this.originalTypeVariable;
    }

    @Override // defpackage.aigl
    public boolean isMarkedNullable() {
        return this.isMarkedNullable;
    }

    @Override // defpackage.aijf
    public aigw makeNullableAsSpecified(boolean z) {
        return z == isMarkedNullable() ? this : materialize(z);
    }

    public abstract aieo materialize(boolean z);

    @Override // defpackage.aijf, defpackage.aigl
    public aieo refine(aiju aijuVar) {
        aijuVar.getClass();
        return this;
    }

    @Override // defpackage.aijf
    public aigw replaceAttributes(aihr aihrVar) {
        aihrVar.getClass();
        return this;
    }
}
