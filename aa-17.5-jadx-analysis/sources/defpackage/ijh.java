package defpackage;

import java.util.HashMap;
import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
final class ijh {
    public static final ijh A;
    public static final ijh B;
    public static final ijh C;
    public static final ijh D;
    public static final ijh E;
    public static final ijh F;
    private static final Map G;
    private static final /* synthetic */ ijh[] H;
    public static final ijh a;
    public static final ijh b;
    public static final ijh c;
    public static final ijh d;
    public static final ijh e;
    public static final ijh f;
    public static final ijh g;
    public static final ijh h;
    public static final ijh i;
    public static final ijh j;
    public static final ijh k;
    public static final ijh l;
    public static final ijh m;
    public static final ijh n;
    public static final ijh o;
    public static final ijh p;
    public static final ijh q;
    public static final ijh r;
    public static final ijh s;
    public static final ijh t;
    public static final ijh u;
    public static final ijh v;
    public static final ijh w;
    public static final ijh x;
    public static final ijh y;
    public static final ijh z;

    static {
        ijh ijhVar = new ijh("svg", 0);
        a = ijhVar;
        ijh ijhVar2 = new ijh("a", 1);
        b = ijhVar2;
        ijh ijhVar3 = new ijh("circle", 2);
        c = ijhVar3;
        ijh ijhVar4 = new ijh("clipPath", 3);
        d = ijhVar4;
        ijh ijhVar5 = new ijh("defs", 4);
        e = ijhVar5;
        ijh ijhVar6 = new ijh("desc", 5);
        f = ijhVar6;
        ijh ijhVar7 = new ijh("ellipse", 6);
        g = ijhVar7;
        ijh ijhVar8 = new ijh("g", 7);
        h = ijhVar8;
        ijh ijhVar9 = new ijh("image", 8);
        i = ijhVar9;
        ijh ijhVar10 = new ijh("line", 9);
        j = ijhVar10;
        ijh ijhVar11 = new ijh("linearGradient", 10);
        k = ijhVar11;
        ijh ijhVar12 = new ijh("marker", 11);
        l = ijhVar12;
        ijh ijhVar13 = new ijh("mask", 12);
        m = ijhVar13;
        ijh ijhVar14 = new ijh("path", 13);
        n = ijhVar14;
        ijh ijhVar15 = new ijh("pattern", 14);
        o = ijhVar15;
        ijh ijhVar16 = new ijh("polygon", 15);
        p = ijhVar16;
        ijh ijhVar17 = new ijh("polyline", 16);
        q = ijhVar17;
        ijh ijhVar18 = new ijh("radialGradient", 17);
        r = ijhVar18;
        ijh ijhVar19 = new ijh("rect", 18);
        s = ijhVar19;
        ijh ijhVar20 = new ijh("solidColor", 19);
        t = ijhVar20;
        ijh ijhVar21 = new ijh("stop", 20);
        u = ijhVar21;
        ijh ijhVar22 = new ijh("style", 21);
        v = ijhVar22;
        ijh ijhVar23 = new ijh("SWITCH", 22);
        w = ijhVar23;
        ijh ijhVar24 = new ijh("symbol", 23);
        x = ijhVar24;
        ijh ijhVar25 = new ijh("text", 24);
        y = ijhVar25;
        ijh ijhVar26 = new ijh("textPath", 25);
        z = ijhVar26;
        ijh ijhVar27 = new ijh("title", 26);
        A = ijhVar27;
        ijh ijhVar28 = new ijh("tref", 27);
        B = ijhVar28;
        ijh ijhVar29 = new ijh("tspan", 28);
        C = ijhVar29;
        ijh ijhVar30 = new ijh("use", 29);
        D = ijhVar30;
        ijh ijhVar31 = new ijh("view", 30);
        E = ijhVar31;
        ijh ijhVar32 = new ijh("UNSUPPORTED", 31);
        F = ijhVar32;
        H = new ijh[]{ijhVar, ijhVar2, ijhVar3, ijhVar4, ijhVar5, ijhVar6, ijhVar7, ijhVar8, ijhVar9, ijhVar10, ijhVar11, ijhVar12, ijhVar13, ijhVar14, ijhVar15, ijhVar16, ijhVar17, ijhVar18, ijhVar19, ijhVar20, ijhVar21, ijhVar22, ijhVar23, ijhVar24, ijhVar25, ijhVar26, ijhVar27, ijhVar28, ijhVar29, ijhVar30, ijhVar31, ijhVar32};
        G = new HashMap();
    }

    public static ijh a(String str) {
        Map map = G;
        ijh ijhVar = (ijh) map.get(str);
        if (ijhVar != null) {
            return ijhVar;
        }
        if (str.equals("switch")) {
            ijh ijhVar2 = w;
            map.put(str, ijhVar2);
            return ijhVar2;
        }
        try {
            ijh ijhVarValueOf = valueOf(str);
            if (ijhVarValueOf != w) {
                map.put(str, ijhVarValueOf);
                return ijhVarValueOf;
            }
        } catch (IllegalArgumentException unused) {
        }
        Map map2 = G;
        ijh ijhVar3 = F;
        map2.put(str, ijhVar3);
        return ijhVar3;
    }

    public static ijh valueOf(String str) {
        return (ijh) Enum.valueOf(ijh.class, str);
    }

    public static ijh[] values() {
        return (ijh[]) H.clone();
    }
}
