package defpackage;

/* loaded from: classes3.dex */
public final class agrf implements agpw {
    public static final agre Companion = new agre(null);
    public static final agpv TYPE = new agpv(affw.b(agrf.class));
    private String lambdaClassOriginName;
    private agqp signature;

    public final String getLambdaClassOriginName() {
        return this.lambdaClassOriginName;
    }

    public final agqp getSignature() {
        return this.signature;
    }

    @Override // defpackage.agpu
    public agpv getType() {
        return TYPE;
    }

    public final void setLambdaClassOriginName(String str) {
        this.lambdaClassOriginName = str;
    }

    public final void setSignature(agqp agqpVar) {
        this.signature = agqpVar;
    }
}
