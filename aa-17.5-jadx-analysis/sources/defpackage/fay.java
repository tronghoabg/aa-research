package defpackage;

import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class fay {
    public final String a;
    public final Map b;
    public final Set c;
    public final Set d;

    public fay(String str, Map map, Set set, Set set2) {
        set.getClass();
        this.a = str;
        this.b = map;
        this.c = set;
        this.d = set2;
    }

    public final boolean equals(Object obj) {
        return crt.p(this, obj);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n            |TableInfo {\n            |    name = '");
        sb.append(this.a);
        sb.append("',\n            |    columns = {");
        sb.append(crt.l(woy.cc(this.b.values(), new ail(6))));
        sb.append("\n            |    foreignKeys = {");
        sb.append(crt.l(this.c));
        sb.append("\n            |    indices = {");
        Set set = this.d;
        sb.append(crt.l(set != null ? woy.cc(set, new ail(7)) : afbe.a));
        sb.append("\n            |}\n        ");
        return afyh.Q(sb.toString());
    }
}
