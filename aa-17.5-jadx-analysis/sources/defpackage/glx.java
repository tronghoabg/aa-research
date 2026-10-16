package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class glx {
    public static final glx a;
    public static final glx b;
    public static final glx c;
    private static final /* synthetic */ glx[] d;

    static {
        glx glxVar = new glx("UNBOUND", 0);
        a = glxVar;
        glx glxVar2 = new glx("BINDING", 1);
        b = glxVar2;
        glx glxVar3 = new glx("BOUND", 2);
        c = glxVar3;
        d = new glx[]{glxVar, glxVar2, glxVar3};
    }

    public static glx valueOf(String str) {
        return (glx) Enum.valueOf(glx.class, str);
    }

    public static glx[] values() {
        return (glx[]) d.clone();
    }
}
