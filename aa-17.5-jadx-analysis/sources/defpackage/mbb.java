package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes.dex */
final class mbb {
    public final List a = new ArrayList();
    public final Map b = new HashMap();
    private final String c;
    private final String d;

    public mbb(String str, String str2) {
        this.d = str;
        this.c = str2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.c);
        sb.append(" | ");
        sb.append(String.format(Locale.US, "%s: SESSION START\n", this.d));
        sb.append("\n# of notifications posted by package name:\n");
        for (Map.Entry entry : this.b.entrySet()) {
            sb.append(String.format(Locale.US, "%s\t%d\n", entry.getKey(), entry.getValue()));
        }
        sb.append("\nListener events:\n");
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            sb.append((mbc) it.next());
            sb.append("\n");
        }
        return sb.toString();
    }
}
