package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class agon {
    private final List<agqb> extensions;
    private int flags;
    private int id;
    private String name;
    private final List<agol> upperBounds;
    private agor variance;

    public agon(int i, String str, int i2, agor agorVar) {
        str.getClass();
        agorVar.getClass();
        this.flags = i;
        this.name = str;
        this.id = i2;
        this.variance = agorVar;
        this.upperBounds = new ArrayList(1);
        List<agqf> iNSTANCES$org_jetbrains_kotlin_kotlin_metadata = agqf.Companion.getINSTANCES$org_jetbrains_kotlin_kotlin_metadata();
        ArrayList arrayList = new ArrayList(woy.bp(iNSTANCES$org_jetbrains_kotlin_kotlin_metadata, 10));
        Iterator<T> it = iNSTANCES$org_jetbrains_kotlin_kotlin_metadata.iterator();
        while (it.hasNext()) {
            arrayList.add(((agqf) it.next()).createTypeParameterExtension());
        }
        this.extensions = arrayList;
    }

    public final List<agqb> getExtensions$org_jetbrains_kotlin_kotlin_metadata() {
        return this.extensions;
    }

    public final int getFlags$org_jetbrains_kotlin_kotlin_metadata() {
        return this.flags;
    }

    public final int getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final List<agol> getUpperBounds() {
        return this.upperBounds;
    }

    public final agor getVariance() {
        return this.variance;
    }

    public final void setFlags$org_jetbrains_kotlin_kotlin_metadata(int i) {
        this.flags = i;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public agon(String str, int i, agor agorVar) {
        this(0, str, i, agorVar);
        str.getClass();
        agorVar.getClass();
    }
}
