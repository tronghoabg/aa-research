package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class agod {
    private final List<agms> annotations;
    private final List<agpt> extensions;
    private String name;

    public agod(String str) {
        str.getClass();
        this.name = str;
        this.annotations = new ArrayList(0);
        List<agqf> iNSTANCES$org_jetbrains_kotlin_kotlin_metadata = agqf.Companion.getINSTANCES$org_jetbrains_kotlin_kotlin_metadata();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = iNSTANCES$org_jetbrains_kotlin_kotlin_metadata.iterator();
        while (it.hasNext()) {
            agpt agptVarCreateEnumEntryExtension = ((agqf) it.next()).createEnumEntryExtension();
            if (agptVarCreateEnumEntryExtension != null) {
                arrayList.add(agptVarCreateEnumEntryExtension);
            }
        }
        this.extensions = arrayList;
    }

    public final List<agms> getAnnotations() {
        return this.annotations;
    }

    public String toString() {
        return this.name;
    }
}
