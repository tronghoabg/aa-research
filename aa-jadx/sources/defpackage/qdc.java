package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class qdc {
    public static final defpackage.qdc a;
    public static final defpackage.qdc b;
    private static final /* synthetic */ defpackage.qdc[] c;

    static {
        defpackage.qdc qdcVar = new defpackage.qdc("PRIMARY_MAP", 0);
        a = qdcVar;
        defpackage.qdc qdcVar2 = new defpackage.qdc("AUXILIARY_CLUSTER_MAP", 1);
        b = qdcVar2;
        c = new defpackage.qdc[]{qdcVar, qdcVar2};
    }

    public static defpackage.qdc valueOf(java.lang.String str) {
        return (defpackage.qdc) java.lang.Enum.valueOf(defpackage.qdc.class, str);
    }

    public static defpackage.qdc[] values() {
        return (defpackage.qdc[]) c.clone();
    }
}
