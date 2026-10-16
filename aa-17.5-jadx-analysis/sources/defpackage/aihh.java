package defpackage;

import java.util.Objects;

/* loaded from: classes3.dex */
public final class aihh {
    private aihh() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void assertRecursionDepth(int i, aged agedVar) {
        if (i <= 100) {
            return;
        }
        ahnj name = agedVar.getName();
        Objects.toString(name);
        throw new AssertionError("Too deep recursion while expanding type alias ".concat(String.valueOf(name)));
    }

    public /* synthetic */ aihh(afeu afeuVar) {
        this();
    }
}
