package com.bytedance.adsdk.uef.oa.moa;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public enum moa implements lw {
    LEFT_PAREN("("),
    RIGHT_PAREN(")"),
    LEFT_BRACKET("["),
    RIGHT_BRACKET("]"),
    COMMA(",");

    private static final Map<String, moa> ivm;
    private final String xs;

    static {
        HashMap map = new HashMap(128);
        ivm = map;
        for (moa moaVar : map.values()) {
            ivm.put(moaVar.uef(), moaVar);
        }
    }

    moa(String str) {
        this.xs = str;
    }

    public static boolean uef(lw lwVar) {
        return lwVar instanceof moa;
    }

    public String uef() {
        return this.xs;
    }
}
