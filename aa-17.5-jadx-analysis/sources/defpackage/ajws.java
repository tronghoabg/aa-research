package defpackage;

@Deprecated
/* loaded from: classes2.dex */
public final class ajws extends ajww implements ajpc {
    private final ajpb f;
    private boolean g;

    public ajws(ajpc ajpcVar) throws ajps {
        super(ajpcVar);
        ajpb ajpbVarA = ajpcVar.a();
        this.f = ajpbVarA != null ? new ajwr(this, ajpbVarA) : null;
        this.g = false;
    }

    @Override // defpackage.ajpc
    public final ajpb a() {
        return this.f;
    }

    @Override // defpackage.ajpc
    public final boolean b() {
        ajoy ajoyVarHW = hW("Expect");
        return ajoyVarHW != null && "100-continue".equalsIgnoreCase(ajoyVarHW.c());
    }

    @Override // defpackage.ajww
    public final boolean q() {
        ajpb ajpbVar = this.f;
        return ajpbVar == null || ajpbVar.h() || !this.g;
    }
}
