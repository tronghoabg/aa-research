package u0;

import android.R;
import kotlin.jvm.internal.AbstractC3340k;
import l1.C3373c;
import l1.C3375e;
import org.jetbrains.annotations.NotNull;
import x0.AbstractC4436f;
import x0.C4431a;
import x0.C4441k;

/* renamed from: u0.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4190o {
    public static final void a(@NotNull C3375e info, @NotNull C4441k semanticsNode) {
        AbstractC3340k.e(info, "info");
        AbstractC3340k.e(semanticsNode, "semanticsNode");
        if (Q.a(semanticsNode)) {
            C4431a c4431a = (C4431a) Fe.e.F(semanticsNode.f47603e, AbstractC4436f.f47583e);
            if (c4431a != null) {
                info.b(new C3373c(R.id.accessibilityActionSetProgress, c4431a.f47567a));
            }
        }
    }
}
