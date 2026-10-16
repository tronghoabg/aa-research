package androidx.constraintlayout.core.dsl;

import androidx.constraintlayout.core.dsl.Constraint;
import java.util.HashMap;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public class Helper {
    protected static final Map<Constraint.Side, String> sideMap;
    protected static final Map<Type, String> typeMap;
    protected String config;
    protected Map<String, String> configMap;
    protected final String name;
    protected HelperType type;

    /* compiled from: WazeSource */
    public final class HelperType {
        final String mName;

        public HelperType(String str) {
            this.mName = str;
        }

        public String toString() {
            return this.mName;
        }
    }

    /* compiled from: WazeSource */
    public enum Type {
        VERTICAL_GUIDELINE,
        HORIZONTAL_GUIDELINE,
        VERTICAL_CHAIN,
        HORIZONTAL_CHAIN,
        BARRIER
    }

    static {
        HashMap map = new HashMap();
        sideMap = map;
        map.put(Constraint.Side.LEFT, "'left'");
        map.put(Constraint.Side.RIGHT, "'right'");
        map.put(Constraint.Side.TOP, "'top'");
        map.put(Constraint.Side.BOTTOM, "'bottom'");
        map.put(Constraint.Side.START, "'start'");
        map.put(Constraint.Side.END, "'end'");
        map.put(Constraint.Side.BASELINE, "'baseline'");
        HashMap map2 = new HashMap();
        typeMap = map2;
        map2.put(Type.VERTICAL_GUIDELINE, "vGuideline");
        map2.put(Type.HORIZONTAL_GUIDELINE, "hGuideline");
        map2.put(Type.VERTICAL_CHAIN, "vChain");
        map2.put(Type.HORIZONTAL_CHAIN, "hChain");
        map2.put(Type.BARRIER, "barrier");
    }

    public Helper(String str, HelperType helperType, String str2) {
        this.type = null;
        this.configMap = new HashMap();
        this.name = str;
        this.type = helperType;
        this.config = str2;
        this.configMap = convertConfigToMap();
    }

    public static void main(String[] strArr) {
        System.out.println(new Barrier("abc", "['a1', 'b2']").toString());
    }

    public void append(Map<String, String> map, StringBuilder sb) {
        if (map.isEmpty()) {
            return;
        }
        for (String str : map.keySet()) {
            sb.append(str);
            sb.append(":");
            sb.append(map.get(str));
            sb.append(",\n");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0072 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.Map<java.lang.String, java.lang.String> convertConfigToMap() {
        /*
            r10 = this;
            java.lang.String r0 = r10.config
            if (r0 == 0) goto L7d
            int r0 = r0.length()
            if (r0 != 0) goto Lc
            goto L7d
        Lc:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = ""
            r3 = 0
            r5 = r2
            r4 = r3
            r6 = r4
            r7 = r6
        L1d:
            java.lang.String r8 = r10.config
            int r8 = r8.length()
            if (r4 >= r8) goto L75
            java.lang.String r8 = r10.config
            char r8 = r8.charAt(r4)
            r9 = 58
            if (r8 != r9) goto L37
            java.lang.String r5 = r1.toString()
            r1.setLength(r3)
            goto L72
        L37:
            r9 = 44
            if (r8 != r9) goto L4f
            if (r6 != 0) goto L4e
            if (r7 != 0) goto L4d
            java.lang.String r6 = r1.toString()
            r0.put(r5, r6)
            r1.setLength(r3)
            r5 = r2
            r6 = r3
            r7 = r6
            goto L72
        L4d:
            r6 = r3
        L4e:
            r8 = r9
        L4f:
            r9 = 32
            if (r8 == r9) goto L72
            r9 = 91
            if (r8 == r9) goto L6d
            r9 = 93
            if (r8 == r9) goto L6a
            r9 = 123(0x7b, float:1.72E-43)
            if (r8 == r9) goto L67
            r9 = 125(0x7d, float:1.75E-43)
            if (r8 == r9) goto L64
            goto L6f
        L64:
            int r7 = r7 + (-1)
            goto L6f
        L67:
            int r7 = r7 + 1
            goto L6f
        L6a:
            int r6 = r6 + (-1)
            goto L6f
        L6d:
            int r6 = r6 + 1
        L6f:
            r1.append(r8)
        L72:
            int r4 = r4 + 1
            goto L1d
        L75:
            java.lang.String r10 = r1.toString()
            r0.put(r5, r10)
            return r0
        L7d:
            r10 = 0
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.dsl.Helper.convertConfigToMap():java.util.Map");
    }

    public String getConfig() {
        return this.config;
    }

    public String getId() {
        return this.name;
    }

    public HelperType getType() {
        return this.type;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(String.valueOf(this.name).concat(":{\n"));
        if (this.type != null) {
            sb.append("type:'");
            sb.append(this.type.toString());
            sb.append("',\n");
        }
        Map<String, String> map = this.configMap;
        if (map != null) {
            append(map, sb);
        }
        sb.append("},\n");
        return sb.toString();
    }

    public Helper(String str, HelperType helperType) {
        this.type = null;
        this.configMap = new HashMap();
        this.name = str;
        this.type = helperType;
    }
}
