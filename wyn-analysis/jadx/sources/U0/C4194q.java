package u0;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3340k;
import x0.C4437g;
import x0.C4441k;

/* renamed from: u0.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4194q {

    /* renamed from: a, reason: collision with root package name */
    public final C4437g f46329a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashSet f46330b;

    public C4194q(C4441k semanticsNode, Map currentSemanticsNodes) {
        AbstractC3340k.e(semanticsNode, "semanticsNode");
        AbstractC3340k.e(currentSemanticsNodes, "currentSemanticsNodes");
        this.f46329a = semanticsNode.f47603e;
        this.f46330b = new LinkedHashSet();
        List listE = semanticsNode.e(false);
        int size = listE.size();
        for (int i5 = 0; i5 < size; i5++) {
            C4441k c4441k = (C4441k) listE.get(i5);
            if (currentSemanticsNodes.containsKey(Integer.valueOf(c4441k.f47604f))) {
                this.f46330b.add(Integer.valueOf(c4441k.f47604f));
            }
        }
    }
}
