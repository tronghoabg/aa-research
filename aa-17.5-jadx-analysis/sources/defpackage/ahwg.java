package defpackage;

import java.util.Collection;
import java.util.List;

/* loaded from: classes3.dex */
public interface ahwg {
    public static final ahwf Companion = ahwf.$$INSTANCE;

    void generateConstructors(agba agbaVar, List<agaz> list, agvu agvuVar);

    void generateMethods(agba agbaVar, ahnj ahnjVar, Collection<agdv> collection, agvu agvuVar);

    void generateNestedClass(agba agbaVar, ahnj ahnjVar, List<agba> list, agvu agvuVar);

    void generateStaticFunctions(agba agbaVar, ahnj ahnjVar, Collection<agdv> collection, agvu agvuVar);

    List<ahnj> getMethodNames(agba agbaVar, agvu agvuVar);

    List<ahnj> getNestedClassNames(agba agbaVar, agvu agvuVar);

    List<ahnj> getStaticFunctionNames(agba agbaVar, agvu agvuVar);

    agik modifyField(agba agbaVar, agik agikVar, agvu agvuVar);
}
