package com.bytedance.adsdk.uef.oa.moa;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.apache.tika.metadata.TikaCoreProperties;

/* loaded from: classes.dex */
public enum yo implements lw {
    QUESTION("?", 0),
    COLON(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER, 0),
    DOUBLE_AMP("&&", 1),
    DOUBLE_BAR("||", 1),
    EQ("==", 2),
    GT(">", 2),
    LT("<", 2),
    LT_EQ("<=", 2),
    GT_EQ(">=", 2),
    NOT_EQ("!=", 2),
    PLUS("+", 3),
    MINUS("-", 3),
    MULTI("*", 4),
    DIVISION("/", 4),
    MOD("%", 4);

    private final int oib;
    private final String sy;

    /* renamed from: ab, reason: collision with root package name */
    private static final Map<String, yo> f24660ab = new HashMap(128);
    private static final Set<yo> bs = new HashSet();

    static {
        for (yo yoVar : values()) {
            f24660ab.put(yoVar.uef(), yoVar);
            bs.add(yoVar);
        }
    }

    yo(String str, int i5) {
        this.sy = str;
        this.oib = i5;
    }

    public static yo uef(String str) {
        return f24660ab.get(str);
    }

    public int oa() {
        return this.oib;
    }

    public static boolean uef(lw lwVar) {
        return lwVar instanceof yo;
    }

    public String uef() {
        return this.sy;
    }
}
