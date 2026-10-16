package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'a' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes.dex */
final class jiw {
    public static final defpackage.jiw a;
    public static final defpackage.jiw b;
    public static final defpackage.jiw c;
    private static final /* synthetic */ defpackage.jiw[] e;
    public final defpackage.jiy d;

    static {
        final int i = 1;
        final int i2 = 0;
        defpackage.jiw jiwVar = new defpackage.jiw("NONE", 0, new defpackage.jiy() { // from class: jiv
            @Override // defpackage.jiy
            public final float a(float f, float f2) {
                int i3 = i;
                if (i3 == 0) {
                    return java.lang.Math.max(f, f2);
                }
                if (i3 != 1) {
                    return java.lang.Math.min(f, f2);
                }
                defpackage.jiw jiwVar2 = defpackage.jiw.a;
                return com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
            }
        });
        a = jiwVar;
        defpackage.jiw jiwVar2 = new defpackage.jiw("ANIMATE_IN", 1, new defpackage.jiy() { // from class: jiv
            @Override // defpackage.jiy
            public final float a(float f, float f2) {
                int i3 = i2;
                if (i3 == 0) {
                    return java.lang.Math.max(f, f2);
                }
                if (i3 != 1) {
                    return java.lang.Math.min(f, f2);
                }
                defpackage.jiw jiwVar3 = defpackage.jiw.a;
                return com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
            }
        });
        b = jiwVar2;
        final int i3 = 2;
        defpackage.jiw jiwVar3 = new defpackage.jiw("ANIMATE_OUT", 2, new defpackage.jiy() { // from class: jiv
            @Override // defpackage.jiy
            public final float a(float f, float f2) {
                int i4 = i3;
                if (i4 == 0) {
                    return java.lang.Math.max(f, f2);
                }
                if (i4 != 1) {
                    return java.lang.Math.min(f, f2);
                }
                defpackage.jiw jiwVar4 = defpackage.jiw.a;
                return com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
            }
        });
        c = jiwVar3;
        e = new defpackage.jiw[]{jiwVar, jiwVar2, jiwVar3};
    }

    private jiw(java.lang.String str, int i, defpackage.jiy jiyVar) {
        super(str, i);
        this.d = jiyVar;
    }

    public static defpackage.jiw valueOf(java.lang.String str) {
        return (defpackage.jiw) java.lang.Enum.valueOf(defpackage.jiw.class, str);
    }

    public static defpackage.jiw[] values() {
        return (defpackage.jiw[]) e.clone();
    }
}
