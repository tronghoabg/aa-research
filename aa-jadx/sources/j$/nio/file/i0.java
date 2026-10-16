package j$.nio.file;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public abstract class i0 {
    public static final j$.nio.file.h0 a = new j$.nio.file.h0((java.lang.Object) "OVERFLOW", (java.lang.Object) java.lang.Object.class, (byte) 0);
    public static final j$.nio.file.h0 b;
    public static final j$.nio.file.h0 c;
    public static final j$.nio.file.h0 d;

    static {
        java.lang.Class<j$.nio.file.Path> cls = j$.nio.file.Path.class;
        b = new j$.nio.file.h0((java.lang.Object) "ENTRY_CREATE", (java.lang.Object) cls, (byte) 0);
        byte b2 = 0;
        c = new j$.nio.file.h0("ENTRY_DELETE", cls, b2);
        d = new j$.nio.file.h0("ENTRY_MODIFY", cls, b2);
    }

    public static /* synthetic */ j$.nio.file.LinkOption[] h(java.nio.file.LinkOption[] linkOptionArr) {
        if (linkOptionArr == null) {
            return null;
        }
        int length = linkOptionArr.length;
        j$.nio.file.LinkOption[] linkOptionArr2 = new j$.nio.file.LinkOption[length];
        for (int i = 0; i < length; i++) {
            linkOptionArr2[i] = linkOptionArr[i] == null ? null : j$.nio.file.LinkOption.NOFOLLOW_LINKS;
        }
        return linkOptionArr2;
    }

    public static /* synthetic */ j$.nio.file.l0[] i(java.nio.file.WatchEvent.Kind[] kindArr) {
        if (kindArr == null) {
            return null;
        }
        int length = kindArr.length;
        j$.nio.file.l0[] l0VarArr = new j$.nio.file.l0[length];
        for (int i = 0; i < length; i++) {
            l0VarArr[i] = j$.nio.file.a.b(kindArr[i]);
        }
        return l0VarArr;
    }

    public static /* synthetic */ j$.nio.file.o0[] j(java.nio.file.WatchEvent.Modifier[] modifierArr) {
        if (modifierArr == null) {
            return null;
        }
        int length = modifierArr.length;
        j$.nio.file.o0[] o0VarArr = new j$.nio.file.o0[length];
        for (int i = 0; i < length; i++) {
            java.nio.file.WatchEvent.Modifier modifier = modifierArr[i];
            o0VarArr[i] = modifier == null ? null : modifier instanceof j$.nio.file.n0 ? ((j$.nio.file.n0) modifier).a : new j$.nio.file.m0(modifier);
        }
        return o0VarArr;
    }

    public static /* synthetic */ java.nio.file.LinkOption[] k(j$.nio.file.LinkOption[] linkOptionArr) {
        if (linkOptionArr == null) {
            return null;
        }
        int length = linkOptionArr.length;
        java.nio.file.LinkOption[] linkOptionArr2 = new java.nio.file.LinkOption[length];
        for (int i = 0; i < length; i++) {
            linkOptionArr2[i] = j$.nio.file.a.c(linkOptionArr[i]);
        }
        return linkOptionArr2;
    }

    public static /* synthetic */ java.nio.file.WatchEvent.Kind[] l(j$.nio.file.l0[] l0VarArr) {
        if (l0VarArr == null) {
            return null;
        }
        int length = l0VarArr.length;
        java.nio.file.WatchEvent.Kind[] kindArr = new java.nio.file.WatchEvent.Kind[length];
        for (int i = 0; i < length; i++) {
            kindArr[i] = j$.nio.file.a.f(l0VarArr[i]);
        }
        return kindArr;
    }

    public static /* synthetic */ java.nio.file.WatchEvent.Modifier[] m(j$.nio.file.o0[] o0VarArr) {
        if (o0VarArr == null) {
            return null;
        }
        int length = o0VarArr.length;
        java.nio.file.WatchEvent.Modifier[] modifierArr = new java.nio.file.WatchEvent.Modifier[length];
        for (int i = 0; i < length; i++) {
            j$.nio.file.o0 o0Var = o0VarArr[i];
            modifierArr[i] = o0Var == null ? null : o0Var instanceof j$.nio.file.m0 ? ((j$.nio.file.m0) o0Var).a : new j$.nio.file.n0(o0Var);
        }
        return modifierArr;
    }

    public abstract java.lang.Object a(java.lang.String str);

    public abstract long b();

    public abstract j$.nio.file.attribute.d0 c(java.lang.Class cls);

    public abstract long d();

    public abstract long e();

    public abstract long f();

    public abstract boolean g();

    public abstract java.lang.String n();

    public abstract boolean o(java.lang.Class cls);

    public abstract boolean p(java.lang.String str);

    public abstract java.lang.String q();
}
