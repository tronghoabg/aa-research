package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'a' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes.dex */
final class jip {
    public static final jip a;
    public static final jip b;
    public static final jip c;
    private static final /* synthetic */ jip[] e;
    public final jir d;

    static {
        final int i = 1;
        final int i2 = 0;
        jip jipVar = new jip("NONE", 0, new jir() { // from class: jio
            @Override // defpackage.jir
            public final float a(float f, float f2) {
                int i3 = i;
                if (i3 == 0) {
                    return Math.max(f, f2);
                }
                if (i3 != 1) {
                    return Math.min(f, f2);
                }
                jip jipVar2 = jip.a;
                return BitmapDescriptorFactory.HUE_RED;
            }
        });
        a = jipVar;
        jip jipVar2 = new jip("ANIMATE_IN", 1, new jir() { // from class: jio
            @Override // defpackage.jir
            public final float a(float f, float f2) {
                int i3 = i2;
                if (i3 == 0) {
                    return Math.max(f, f2);
                }
                if (i3 != 1) {
                    return Math.min(f, f2);
                }
                jip jipVar22 = jip.a;
                return BitmapDescriptorFactory.HUE_RED;
            }
        });
        b = jipVar2;
        final int i3 = 2;
        jip jipVar3 = new jip("ANIMATE_OUT", 2, new jir() { // from class: jio
            @Override // defpackage.jir
            public final float a(float f, float f2) {
                int i32 = i3;
                if (i32 == 0) {
                    return Math.max(f, f2);
                }
                if (i32 != 1) {
                    return Math.min(f, f2);
                }
                jip jipVar22 = jip.a;
                return BitmapDescriptorFactory.HUE_RED;
            }
        });
        c = jipVar3;
        e = new jip[]{jipVar, jipVar2, jipVar3};
    }

    private jip(String str, int i, jir jirVar) {
        this.d = jirVar;
    }

    public static jip valueOf(String str) {
        return (jip) Enum.valueOf(jip.class, str);
    }

    public static jip[] values() {
        return (jip[]) e.clone();
    }
}
