package j$.nio.file;

import java.nio.file.WatchEvent;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public abstract class a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final z f49698a = new z(0, "OVERFLOW", Object.class);

    /* renamed from: b, reason: collision with root package name */
    public static final z f49699b;

    /* renamed from: c, reason: collision with root package name */
    public static final z f49700c;

    /* renamed from: d, reason: collision with root package name */
    public static final z f49701d;

    static {
        Class<Path> cls = Path.class;
        f49699b = new z(0, "ENTRY_CREATE", cls);
        int i2 = 0;
        f49700c = new z(i2, "ENTRY_DELETE", cls);
        f49701d = new z(i2, "ENTRY_MODIFY", cls);
    }

    public static /* synthetic */ LinkOption[] h(java.nio.file.LinkOption[] linkOptionArr) {
        if (linkOptionArr == null) {
            return null;
        }
        int length = linkOptionArr.length;
        LinkOption[] linkOptionArr2 = new LinkOption[length];
        for (int i2 = 0; i2 < length; i2++) {
            linkOptionArr2[i2] = linkOptionArr[i2] == null ? null : LinkOption.NOFOLLOW_LINKS;
        }
        return linkOptionArr2;
    }

    public static /* synthetic */ d0[] i(WatchEvent.Kind[] kindArr) {
        if (kindArr == null) {
            return null;
        }
        int length = kindArr.length;
        d0[] d0VarArr = new d0[length];
        for (int i2 = 0; i2 < length; i2++) {
            d0VarArr[i2] = a.b(kindArr[i2]);
        }
        return d0VarArr;
    }

    public static /* synthetic */ g0[] j(WatchEvent.Modifier[] modifierArr) {
        if (modifierArr == null) {
            return null;
        }
        int length = modifierArr.length;
        g0[] g0VarArr = new g0[length];
        for (int i2 = 0; i2 < length; i2++) {
            WatchEvent.Modifier modifier = modifierArr[i2];
            g0VarArr[i2] = modifier == null ? null : modifier instanceof f0 ? ((f0) modifier).f49749a : new e0(modifier);
        }
        return g0VarArr;
    }

    public static /* synthetic */ java.nio.file.LinkOption[] k(LinkOption[] linkOptionArr) {
        if (linkOptionArr == null) {
            return null;
        }
        int length = linkOptionArr.length;
        java.nio.file.LinkOption[] linkOptionArr2 = new java.nio.file.LinkOption[length];
        for (int i2 = 0; i2 < length; i2++) {
            linkOptionArr2[i2] = a.c(linkOptionArr[i2]);
        }
        return linkOptionArr2;
    }

    public static /* synthetic */ WatchEvent.Kind[] l(d0[] d0VarArr) {
        if (d0VarArr == null) {
            return null;
        }
        int length = d0VarArr.length;
        WatchEvent.Kind[] kindArr = new WatchEvent.Kind[length];
        for (int i2 = 0; i2 < length; i2++) {
            kindArr[i2] = a.f(d0VarArr[i2]);
        }
        return kindArr;
    }

    public static /* synthetic */ WatchEvent.Modifier[] m(g0[] g0VarArr) {
        if (g0VarArr == null) {
            return null;
        }
        int length = g0VarArr.length;
        WatchEvent.Modifier[] modifierArr = new WatchEvent.Modifier[length];
        for (int i2 = 0; i2 < length; i2++) {
            g0 g0Var = g0VarArr[i2];
            modifierArr[i2] = g0Var == null ? null : g0Var instanceof e0 ? ((e0) g0Var).f49746a : new f0(g0Var);
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
