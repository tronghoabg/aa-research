package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public abstract class aiga extends aijf implements ailv {
    private final aigw lowerBound;
    private final aigw upperBound;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aiga(aigw aigwVar, aigw aigwVar2) {
        super(null);
        aigwVar.getClass();
        aigwVar2.getClass();
        this.lowerBound = aigwVar;
        this.upperBound = aigwVar2;
    }

    @Override // defpackage.aigl
    public List<aiin> getArguments() {
        return getDelegate().getArguments();
    }

    @Override // defpackage.aigl
    public aihr getAttributes() {
        return getDelegate().getAttributes();
    }

    @Override // defpackage.aigl
    public aiid getConstructor() {
        return getDelegate().getConstructor();
    }

    public abstract aigw getDelegate();

    public final aigw getLowerBound() {
        return this.lowerBound;
    }

    @Override // defpackage.aigl
    public ahxe getMemberScope() {
        return getDelegate().getMemberScope();
    }

    public final aigw getUpperBound() {
        return this.upperBound;
    }

    @Override // defpackage.aigl
    public boolean isMarkedNullable() {
        return getDelegate().isMarkedNullable();
    }

    public abstract String render(ahre ahreVar, ahrt ahrtVar);

    public String toString() {
        return ahre.DEBUG_TEXT.renderType(this);
    }
}
