package defpackage;

/* loaded from: classes3.dex */
public final class xuw {
    public static final xuv a = new xux(1);

    public static final xuv a(vky vkyVar) {
        return fdi.b() ? xux.a(vkyVar.a) : a;
    }

    public static final xuv b(String str) {
        return fdi.b() ? xux.a(str) : a;
    }

    public static xuv c(String str, vky vkyVar) {
        return fdi.b() ? xux.a(str.concat(vkyVar.a)) : a;
    }

    public static xuv d(String str, Enum r2) {
        return fdi.b() ? xux.a(str.concat(String.valueOf(r2.name()))) : a;
    }
}
