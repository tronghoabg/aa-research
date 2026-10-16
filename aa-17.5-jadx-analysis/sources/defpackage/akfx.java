package defpackage;

import java.util.Collections;
import java.util.Set;

/* loaded from: classes2.dex */
public final class akfx implements akfw {
    private static final Set a = Collections.singleton("UTC");

    @Override // defpackage.akfw
    public final Set a() {
        return a;
    }

    @Override // defpackage.akfw
    public final akcl b(String str) {
        if ("UTC".equalsIgnoreCase(str)) {
            return akcl.a;
        }
        return null;
    }
}
