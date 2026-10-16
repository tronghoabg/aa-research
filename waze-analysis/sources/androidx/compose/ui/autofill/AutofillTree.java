package androidx.compose.ui.autofill;

import h.ab;
import h.g.a.l;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class AutofillTree {
    public static final int $stable = 8;
    private final Map<Integer, AutofillNode> children = new LinkedHashMap();

    public final Map<Integer, AutofillNode> getChildren() {
        return this.children;
    }

    public final ab performAutofill(int i2, String str) {
        l<String, ab> onFill;
        AutofillNode autofillNode = this.children.get(Integer.valueOf(i2));
        if (autofillNode == null || (onFill = autofillNode.getOnFill()) == null) {
            return null;
        }
        onFill.invoke(str);
        return ab.f48028a;
    }

    public final void plusAssign(AutofillNode autofillNode) {
        this.children.put(Integer.valueOf(autofillNode.getId()), autofillNode);
    }
}
