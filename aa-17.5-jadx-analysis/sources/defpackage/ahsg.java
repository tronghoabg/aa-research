package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public abstract class ahsg {
    private static final /* synthetic */ afdf $ENTRIES;
    private static final /* synthetic */ ahsg[] $VALUES;
    public static final ahsg HTML;
    public static final ahsg PLAIN;

    private static final /* synthetic */ ahsg[] $values() {
        return new ahsg[]{PLAIN, HTML};
    }

    static {
        final String str = "PLAIN";
        final int i = 0;
        PLAIN = new ahsg(str, i) { // from class: ahsf
            {
                afeu afeuVar = null;
            }

            @Override // defpackage.ahsg
            public String escape(String str2) {
                str2.getClass();
                return str2;
            }
        };
        final String str2 = "HTML";
        final int i2 = 1;
        HTML = new ahsg(str2, i2) { // from class: ahse
            {
                afeu afeuVar = null;
            }

            @Override // defpackage.ahsg
            public String escape(String str3) {
                str3.getClass();
                return afyh.J(afyh.J(str3, "<", "&lt;"), ">", "&gt;");
            }
        };
        ahsg[] ahsgVarArr$values = $values();
        $VALUES = ahsgVarArr$values;
        $ENTRIES = affa.p(ahsgVarArr$values);
    }

    public /* synthetic */ ahsg(String str, int i, afeu afeuVar) {
        this(str, i);
    }

    public static ahsg valueOf(String str) {
        return (ahsg) Enum.valueOf(ahsg.class, str);
    }

    public static ahsg[] values() {
        return (ahsg[]) $VALUES.clone();
    }

    public abstract String escape(String str);

    private ahsg(String str, int i) {
    }
}
