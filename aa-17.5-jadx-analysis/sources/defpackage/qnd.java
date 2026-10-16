package defpackage;

import java.util.Map;

/* loaded from: classes2.dex */
public final class qnd extends qmf {
    public static qnd a;

    protected static final String e(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        if (!(obj instanceof Long)) {
            return obj instanceof Boolean ? obj.toString() : obj instanceof Throwable ? obj.getClass().getCanonicalName() : "-";
        }
        Long l = (Long) obj;
        if (Math.abs(l.longValue()) < 100) {
            return obj.toString();
        }
        char cCharAt = obj.toString().charAt(0);
        String strValueOf = String.valueOf(Math.abs(l.longValue()));
        String str = cCharAt != '-' ? "" : "-";
        return str + Math.round(Math.pow(10.0d, strValueOf.length() - 1)) + "..." + str + Math.round(Math.pow(10.0d, strValueOf.length()) - 1.0d);
    }

    public final void a(qna qnaVar, String str) {
        super.p(5, "Discarding hit. ".concat(str), qnaVar != null ? qnaVar.toString() : "no hit data", null, null);
    }

    @Override // defpackage.qmf
    protected final void b() {
        synchronized (qnd.class) {
            a = this;
        }
    }

    public final void c(Map map, String str) {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : map.entrySet()) {
            if (sb.length() > 0) {
                sb.append(',');
            }
            sb.append((String) entry.getKey());
            sb.append('=');
            sb.append((String) entry.getValue());
        }
        super.p(5, "Discarding hit. ".concat(str), sb.toString(), null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x006d A[Catch: all -> 0x013a, TryCatch #2 {, blocks: (B:4:0x0003, B:6:0x000c, B:33:0x0064, B:34:0x0065, B:36:0x006d, B:38:0x0078, B:40:0x00b2, B:41:0x00b6, B:43:0x00bd, B:47:0x00c6, B:49:0x00d2, B:52:0x00d9, B:69:0x0137, B:37:0x0073, B:7:0x000d, B:9:0x0011, B:11:0x001f, B:13:0x0023, B:17:0x002c, B:18:0x0032, B:20:0x0036, B:25:0x004a, B:27:0x004e, B:22:0x003e, B:24:0x0046, B:28:0x005f, B:53:0x00da, B:55:0x00ec, B:56:0x0103, B:59:0x0106, B:61:0x0120, B:62:0x0127, B:63:0x0131), top: B:79:0x0003, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0073 A[Catch: all -> 0x013a, TryCatch #2 {, blocks: (B:4:0x0003, B:6:0x000c, B:33:0x0064, B:34:0x0065, B:36:0x006d, B:38:0x0078, B:40:0x00b2, B:41:0x00b6, B:43:0x00bd, B:47:0x00c6, B:49:0x00d2, B:52:0x00d9, B:69:0x0137, B:37:0x0073, B:7:0x000d, B:9:0x0011, B:11:0x001f, B:13:0x0023, B:17:0x002c, B:18:0x0032, B:20:0x0036, B:25:0x004a, B:27:0x004e, B:22:0x003e, B:24:0x0046, B:28:0x005f, B:53:0x00da, B:55:0x00ec, B:56:0x0103, B:59:0x0106, B:61:0x0120, B:62:0x0127, B:63:0x0131), top: B:79:0x0003, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b2 A[Catch: all -> 0x013a, TryCatch #2 {, blocks: (B:4:0x0003, B:6:0x000c, B:33:0x0064, B:34:0x0065, B:36:0x006d, B:38:0x0078, B:40:0x00b2, B:41:0x00b6, B:43:0x00bd, B:47:0x00c6, B:49:0x00d2, B:52:0x00d9, B:69:0x0137, B:37:0x0073, B:7:0x000d, B:9:0x0011, B:11:0x001f, B:13:0x0023, B:17:0x002c, B:18:0x0032, B:20:0x0036, B:25:0x004a, B:27:0x004e, B:22:0x003e, B:24:0x0046, B:28:0x005f, B:53:0x00da, B:55:0x00ec, B:56:0x0103, B:59:0x0106, B:61:0x0120, B:62:0x0127, B:63:0x0131), top: B:79:0x0003, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c6 A[Catch: all -> 0x013a, TryCatch #2 {, blocks: (B:4:0x0003, B:6:0x000c, B:33:0x0064, B:34:0x0065, B:36:0x006d, B:38:0x0078, B:40:0x00b2, B:41:0x00b6, B:43:0x00bd, B:47:0x00c6, B:49:0x00d2, B:52:0x00d9, B:69:0x0137, B:37:0x0073, B:7:0x000d, B:9:0x0011, B:11:0x001f, B:13:0x0023, B:17:0x002c, B:18:0x0032, B:20:0x0036, B:25:0x004a, B:27:0x004e, B:22:0x003e, B:24:0x0046, B:28:0x005f, B:53:0x00da, B:55:0x00ec, B:56:0x0103, B:59:0x0106, B:61:0x0120, B:62:0x0127, B:63:0x0131), top: B:79:0x0003, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0138 A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void d(int r12, java.lang.String r13, java.lang.Object r14, java.lang.Object r15, java.lang.Object r16) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qnd.d(int, java.lang.String, java.lang.Object, java.lang.Object, java.lang.Object):void");
    }
}
