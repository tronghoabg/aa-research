package j$.nio.file;

import java.nio.file.WatchEvent;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public abstract class i0 {
    public static final h0 a = new h0((Object) "OVERFLOW", (Object) Object.class, (byte) 0);
    public static final h0 b;
    public static final h0 c;
    public static final h0 d;

    static {
        Class<Path> cls = Path.class;
        b = new h0((Object) "ENTRY_CREATE", (Object) cls, (byte) 0);
        byte b2 = 0;
        c = new h0("ENTRY_DELETE", cls, b2);
        d = new h0("ENTRY_MODIFY", cls, b2);
    }

    public static /* synthetic */ LinkOption[] h(java.nio.file.LinkOption[] linkOptionArr) {
        if (linkOptionArr == null) {
            return null;
        }
        int length = linkOptionArr.length;
        LinkOption[] linkOptionArr2 = new LinkOption[length];
        for (int i = 0; i < length; i++) {
            linkOptionArr2[i] = linkOptionArr[i] == null ? null : LinkOption.NOFOLLOW_LINKS;
        }
        return linkOptionArr2;
    }

    public static /* synthetic */ l0[] i(WatchEvent.Kind[] kindArr) {
        if (kindArr == null) {
            return null;
        }
        int length = kindArr.length;
        l0[] l0VarArr = new l0[length];
        for (int i = 0; i < length; i++) {
            l0VarArr[i] = a.b(kindArr[i]);
        }
        return l0VarArr;
    }

    public static /* synthetic */ o0[] j(WatchEvent.Modifier[] modifierArr) {
        if (modifierArr == null) {
            return null;
        }
        int length = modifierArr.length;
        o0[] o0VarArr = new o0[length];
        for (int i = 0; i < length; i++) {
            WatchEvent.Modifier modifier = modifierArr[i];
            o0VarArr[i] = modifier == null ? null : modifier instanceof n0 ? ((n0) modifier).a : new m0(modifier);
        }
        return o0VarArr;
    }

    public static /* synthetic */ java.nio.file.LinkOption[] k(LinkOption[] linkOptionArr) {
        if (linkOptionArr == null) {
            return null;
        }
        int length = linkOptionArr.length;
        java.nio.file.LinkOption[] linkOptionArr2 = new java.nio.file.LinkOption[length];
        for (int i = 0; i < length; i++) {
            linkOptionArr2[i] = a.c(linkOptionArr[i]);
        }
        return linkOptionArr2;
    }

    public static /* synthetic */ WatchEvent.Kind[] l(l0[] l0VarArr) {
        if (l0VarArr == null) {
            return null;
        }
        int length = l0VarArr.length;
        WatchEvent.Kind[] kindArr = new WatchEvent.Kind[length];
        for (int i = 0; i < length; i++) {
            kindArr[i] = a.f(l0VarArr[i]);
        }
        return kindArr;
    }

    public static /* synthetic */ WatchEvent.Modifier[] m(o0[] o0VarArr) {
        if (o0VarArr == null) {
            return null;
        }
        int length = o0VarArr.length;
        WatchEvent.Modifier[] modifierArr = new WatchEvent.Modifier[length];
        for (int i = 0; i < length; i++) {
            o0 o0Var = o0VarArr[i];
            modifierArr[i] = o0Var == null ? null : o0Var instanceof m0 ? ((m0) o0Var).a : new n0(o0Var);
        }
        return modifierArr;
    }

    public abstract Object a(String str);

    public abstract long b();

    public abstract j$.nio.file.attribute.d0 c(Class cls);

    public abstract long d();

    public abstract long e();

    public abstract long f();

    public abstract boolean g();

    public abstract String n();

    public abstract boolean o(Class cls);

    public abstract boolean p(String str);

    public abstract String q();
}
