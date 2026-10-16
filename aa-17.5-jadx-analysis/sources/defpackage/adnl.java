package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/* loaded from: classes3.dex */
public final class adnl {
    public final String a;
    public final Collection b;

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, java.util.Collection] */
    public adnl(aebg aebgVar) {
        String str = (String) aebgVar.a;
        this.a = str;
        ?? r1 = aebgVar.b;
        HashSet hashSet = new HashSet(r1.size());
        for (admf admfVar : r1) {
            admfVar.getClass();
            String str2 = admfVar.c;
            woy.W(str.equals(str2), "service names %s != %s", str2, str);
            woy.S(hashSet.add(admfVar.b), "duplicate name %s", admfVar.b);
        }
        this.b = DesugarCollections.unmodifiableList(new ArrayList((Collection) aebgVar.b));
    }

    public final String toString() {
        xxg xxgVarAo = woy.ao(this);
        xxgVarAo.b("name", this.a);
        xxgVarAo.b("schemaDescriptor", null);
        xxgVarAo.b("methods", this.b);
        xxgVarAo.c();
        return xxgVarAo.toString();
    }
}
