package defpackage;

import java.util.HashMap;
import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class dpy {
    public static final dpy a;
    public static final dpy b;
    public static final dpy c;
    public static final Map d;
    public static final Map e;
    private static final /* synthetic */ dpy[] f;

    static {
        dpy dpyVar = new dpy("NONE", 0);
        a = dpyVar;
        dpy dpyVar2 = new dpy("CHAIN", 1);
        b = dpyVar2;
        dpy dpyVar3 = new dpy("ALIGNED", 2);
        c = dpyVar3;
        f = new dpy[]{dpyVar, dpyVar2, dpyVar3};
        HashMap map = new HashMap();
        d = map;
        HashMap map2 = new HashMap();
        e = map2;
        map.put("none", dpyVar);
        map.put("chain", dpyVar2);
        map.put("aligned", dpyVar3);
        map2.put("none", 0);
        map2.put("chain", 3);
        map2.put("aligned", 2);
    }

    public static dpy valueOf(String str) {
        return (dpy) Enum.valueOf(dpy.class, str);
    }

    public static dpy[] values() {
        return (dpy[]) f.clone();
    }
}
