package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class diy implements defpackage.dhk {
    private final /* synthetic */ int c;
    public static final defpackage.diy b = new defpackage.diy(1);
    public static final defpackage.diy a = new defpackage.diy(0);

    private diy(int i) {
        this.c = i;
    }

    @Override // defpackage.dhk
    public final android.graphics.Typeface a(android.content.Context context, defpackage.dhl dhlVar) {
        if (this.c == 0) {
            java.util.Objects.toString(dhlVar);
            throw new java.lang.IllegalStateException("GoogleFont only support async loading: ".concat(java.lang.String.valueOf(dhlVar)));
        }
        android.graphics.Typeface typefaceT = null;
        defpackage.dhx dhxVar = dhlVar instanceof defpackage.dhx ? (defpackage.dhx) dhlVar : null;
        if (dhxVar == null) {
            return null;
        }
        java.lang.String str = defpackage.dhz.a.f;
        java.lang.String str2 = dhxVar.c;
        int i = dhxVar.e;
        defpackage.dil dilVar = dhxVar.d;
        if (defpackage.afga.f(str2, str)) {
            typefaceT = defpackage.day.t(str, dilVar, i);
        } else {
            java.lang.String str3 = defpackage.dhz.b.f;
            if (defpackage.afga.f(str2, str3)) {
                typefaceT = defpackage.day.t(str3, dilVar, i);
            } else {
                java.lang.String str4 = defpackage.dhz.c.f;
                if (defpackage.afga.f(str2, str4)) {
                    typefaceT = defpackage.day.t(str4, dilVar, i);
                } else {
                    java.lang.String str5 = defpackage.dhz.d.f;
                    if (defpackage.afga.f(str2, str5)) {
                        typefaceT = defpackage.day.t(str5, dilVar, i);
                    } else if (str2.length() != 0) {
                        boolean z = 1 == i;
                        android.graphics.Typeface typefaceT2 = defpackage.day.t(str2, dilVar, i);
                        if (!defpackage.afga.f(typefaceT2, hh$.ExternalSyntheticApiModelOutline0.m(android.graphics.Typeface.DEFAULT, dilVar.o, z)) && !defpackage.afga.f(typefaceT2, defpackage.day.t(null, dilVar, i))) {
                            typefaceT = typefaceT2;
                        }
                    }
                }
            }
        }
        defpackage.dij dijVar = dhxVar.b;
        int i2 = defpackage.diq.a;
        return defpackage.diq.a(typefaceT, dijVar, context);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0061  */
    /* JADX WARN: Code duplicated, block: B:17:0x0064 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x0066  */
    /* JADX WARN: Code duplicated, block: B:19:0x0068  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dhk
    public final java.lang.Object b(android.content.Context context, defpackage.dhl dhlVar, defpackage.afdk afdkVar) {
        int i;
        int i2;
        if (this.c != 0) {
            throw new java.lang.UnsupportedOperationException("All preloaded fonts are optional local.");
        }
        if (!(dhlVar instanceof defpackage.diw)) {
            throw new java.lang.IllegalArgumentException(defpackage.a.bl(dhlVar, "Only GoogleFontImpl supported (actual ", ")"));
        }
        defpackage.diw diwVar = (defpackage.diw) dhlVar;
        java.lang.String str = diwVar.c;
        defpackage.dil dilVar = diwVar.e;
        int i3 = dilVar.o;
        int i4 = diwVar.f;
        java.lang.String str2 = "name=" + str + "&weight=" + i3 + "&italic=" + (defpackage.a.X(i4, 1) ? 1 : 0) + "&besteffort=true";
        defpackage.div divVar = diwVar.d;
        defpackage.dwn dwnVar = new defpackage.dwn(str2, defpackage.day.s(diwVar.b, context));
        boolean zX = defpackage.a.X(i4, 1);
        java.lang.Object[] objArr = dilVar.compareTo(defpackage.dil.n) >= 0;
        if (zX) {
            if (objArr == true) {
                i2 = 3;
            } else {
                objArr = false;
                if (zX) {
                    i2 = 2;
                } else if (objArr == true) {
                    i = 1;
                } else {
                    i = 0;
                }
            }
            i = i2;
        } else if (zX) {
            i2 = 2;
            i = i2;
        } else if (objArr == true) {
            i = 1;
        } else {
            i = 0;
        }
        aiug aiugVar = new aiug(defpackage.afga.s(afdkVar), 1);
        aiugVar.z();
        defpackage.dix dixVar = new defpackage.dix(aiugVar, dhlVar, context);
        android.os.Looper looperMyLooper = android.os.Looper.myLooper();
        if (looperMyLooper == null) {
            looperMyLooper = android.os.Looper.getMainLooper();
        }
        defpackage.dsx.g(context, se.m(new java.lang.Object[]{dwnVar}), i, false, 0, hh$.ExternalSyntheticApiModelOutline0.m(looperMyLooper), dixVar);
        return aiugVar.k();
    }
}
