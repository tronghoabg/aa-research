package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class agoi implements agny {
    private final List<agpx> extensions;
    private final List<agog> functions = new ArrayList();
    private final List<agoj> properties = new ArrayList();
    private final List<agom> typeAliases = new ArrayList(0);

    public agoi() {
        List<agqf> iNSTANCES$org_jetbrains_kotlin_kotlin_metadata = agqf.Companion.getINSTANCES$org_jetbrains_kotlin_kotlin_metadata();
        ArrayList arrayList = new ArrayList(woy.bp(iNSTANCES$org_jetbrains_kotlin_kotlin_metadata, 10));
        Iterator<T> it = iNSTANCES$org_jetbrains_kotlin_kotlin_metadata.iterator();
        while (it.hasNext()) {
            arrayList.add(((agqf) it.next()).createPackageExtension());
        }
        this.extensions = arrayList;
    }

    public final List<agpx> getExtensions$org_jetbrains_kotlin_kotlin_metadata() {
        return this.extensions;
    }

    @Override // defpackage.agny
    public List<agog> getFunctions() {
        return this.functions;
    }

    @Override // defpackage.agny
    public List<agoj> getProperties() {
        return this.properties;
    }

    @Override // defpackage.agny
    public List<agom> getTypeAliases() {
        return this.typeAliases;
    }
}
