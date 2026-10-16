package defpackage;

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
/* loaded from: classes3.dex */
public class xwd {
    public static final xwd a;
    public static final xwd b;
    public static final xwd c;
    public static final xwd d;
    public static final xwd e;
    private static final /* synthetic */ xwd[] f;
    private final xwp g;
    private final String h;

    static {
        final xwi xwiVar = new xwi('-');
        xwd xwdVar = new xwd(xwiVar) { // from class: xwa
            @Override // defpackage.xwd
            public final String a(xwd xwdVar2, String str) {
                return xwdVar2 == b ? str.replace('-', '_') : xwdVar2 == e ? woy.as(str.replace('-', '_')) : super.a(xwdVar2, str);
            }
        };
        a = xwdVar;
        final xwi xwiVar2 = new xwi('_');
        xwd xwdVar2 = new xwd(xwiVar2) { // from class: xwb
            @Override // defpackage.xwd
            public final String a(xwd xwdVar3, String str) {
                return xwdVar3 == a ? str.replace('_', '-') : xwdVar3 == e ? woy.as(str) : super.a(xwdVar3, str);
            }
        };
        b = xwdVar2;
        xwd xwdVar3 = new xwd("LOWER_CAMEL", 2, new xwh('A', 'Z'), "");
        c = xwdVar3;
        xwd xwdVar4 = new xwd("UPPER_CAMEL", 3, new xwh('A', 'Z'), "");
        d = xwdVar4;
        final xwi xwiVar3 = new xwi('_');
        xwd xwdVar5 = new xwd(xwiVar3) { // from class: xwc
            @Override // defpackage.xwd
            public final String a(xwd xwdVar6, String str) {
                return xwdVar6 == a ? woy.ar(str.replace('_', '-')) : xwdVar6 == b ? woy.ar(str) : super.a(xwdVar6, str);
            }
        };
        e = xwdVar5;
        f = new xwd[]{xwdVar, xwdVar2, xwdVar3, xwdVar4, xwdVar5};
    }

    public xwd(String str, int i, xwp xwpVar, String str2) {
        this.g = xwpVar;
        this.h = str2;
    }

    private static String e(String str) {
        if (str.isEmpty()) {
            return str;
        }
        return woy.aq(str.charAt(0)) + woy.ar(str.substring(1));
    }

    public static xwd valueOf(String str) {
        return (xwd) Enum.valueOf(xwd.class, str);
    }

    public static xwd[] values() {
        return (xwd[]) f.clone();
    }

    public String a(xwd xwdVar, String str) {
        StringBuilder sb = null;
        int iF = -1;
        int length = 0;
        while (true) {
            iF = this.g.f(str, iF + 1);
            if (iF == -1) {
                break;
            }
            if (length == 0) {
                StringBuilder sb2 = new StringBuilder(str.length() + (xwdVar.h.length() * 4));
                sb2.append(xwdVar.b(str.substring(0, iF)));
                sb = sb2;
            } else {
                sb.getClass();
                sb.append(xwdVar.c(str.substring(length, iF)));
            }
            sb.append(xwdVar.h);
            length = this.h.length() + iF;
        }
        if (length == 0) {
            return xwdVar.b(str);
        }
        sb.getClass();
        sb.append(xwdVar.c(str.substring(length)));
        return sb.toString();
    }

    final String b(String str) {
        return ordinal() != 2 ? c(str) : woy.ar(str);
    }

    final String c(String str) {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return woy.ar(str);
        }
        if (iOrdinal == 1) {
            return woy.ar(str);
        }
        if (iOrdinal == 2) {
            return e(str);
        }
        if (iOrdinal == 3) {
            return e(str);
        }
        if (iOrdinal == 4) {
            return woy.as(str);
        }
        throw null;
    }

    public final String d(xwd xwdVar, String str) {
        xwdVar.getClass();
        str.getClass();
        return xwdVar == this ? str : a(xwdVar, str);
    }
}
