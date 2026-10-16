package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bef {
    public static final defpackage.bef a = new defpackage.bef();
    private final int b = -1;
    private final java.lang.Boolean c = null;
    private final int d = 0;
    private final int e = -1;
    private final defpackage.djx f = null;
    private final java.lang.Boolean g = null;
    private final defpackage.dkl h = null;

    private bef() {
    }

    public final defpackage.djl a(boolean z) {
        defpackage.djk djkVar = new defpackage.djk(-1);
        if (djkVar.a == -1) {
            djkVar = null;
        }
        return new defpackage.djl(z, djkVar != null ? djkVar.a : 1, defpackage.dkl.a);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.bef)) {
            return false;
        }
        defpackage.bef befVar = (defpackage.bef) obj;
        int i = befVar.b;
        java.lang.Boolean bool = befVar.c;
        int i2 = befVar.d;
        int i3 = befVar.e;
        defpackage.djx djxVar = befVar.f;
        java.lang.Boolean bool2 = befVar.g;
        defpackage.dkl dklVar = befVar.h;
        return true;
    }

    public final int hashCode() {
        return -887533472;
    }

    public final java.lang.String toString() {
        return "KeyboardOptions(capitalization=Unspecified, autoCorrectEnabled=null, keyboardType=" + defpackage.djn.a(0) + ", imeAction=" + defpackage.djk.a(-1) + ", platformImeOptions=nullshowKeyboardOnFocus=null, hintLocales=null)";
    }
}
