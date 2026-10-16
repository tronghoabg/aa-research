package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class aihw extends defpackage.aikf implements defpackage.aimy, defpackage.aimz {
    public aihw() {
        super(null);
    }

    @Override // defpackage.aikf
    public abstract defpackage.aihw makeNullableAsSpecified(boolean z);

    @Override // defpackage.aikf
    public abstract defpackage.aihw replaceAttributes(defpackage.aiir aiirVar);

    public java.lang.String toString() throws java.io.IOException {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.util.Iterator<defpackage.aggc> it = getAnnotations().iterator();
        while (it.hasNext()) {
            java.lang.String[] strArr = {"[", defpackage.ahse.renderAnnotation$default(defpackage.ahse.DEBUG_TEXT, it.next(), null, 2, null), "] "};
            for (int i = 0; i < 3; i++) {
                sb.append(strArr[i]);
            }
        }
        sb.append(getConstructor());
        if (!getArguments().isEmpty()) {
            defpackage.afga.bn(getArguments(), sb, ", ", "<", ">", -1, "...", null);
        }
        if (isMarkedNullable()) {
            sb.append("?");
        }
        return sb.toString();
    }
}
