package defpackage;

/* loaded from: classes3.dex */
public final class ahrc implements ahrd {
    public static final ahrc INSTANCE = new ahrc();

    private ahrc() {
    }

    @Override // defpackage.ahrd
    public void appendAfterValueParameter(agel agelVar, int i, int i2, StringBuilder sb) {
        agelVar.getClass();
        sb.getClass();
        if (i != i2 - 1) {
            sb.append(", ");
        }
    }

    @Override // defpackage.ahrd
    public void appendAfterValueParameters(int i, StringBuilder sb) {
        sb.getClass();
        sb.append(")");
    }

    @Override // defpackage.ahrd
    public void appendBeforeValueParameter(agel agelVar, int i, int i2, StringBuilder sb) {
        agelVar.getClass();
        sb.getClass();
    }

    @Override // defpackage.ahrd
    public void appendBeforeValueParameters(int i, StringBuilder sb) {
        sb.getClass();
        sb.append("(");
    }
}
