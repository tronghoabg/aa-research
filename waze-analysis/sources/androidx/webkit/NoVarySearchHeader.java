package androidx.webkit;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class NoVarySearchHeader {
    public final List<String> consideredQueryParameters;
    public final boolean ignoreDifferencesInParameters;
    public final List<String> ignoredQueryParameters;
    public final boolean varyOnKeyOrder;

    private NoVarySearchHeader(boolean z, boolean z2, List<String> list, List<String> list2) {
        this.varyOnKeyOrder = z;
        this.ignoreDifferencesInParameters = z2;
        this.ignoredQueryParameters = DesugarCollections.unmodifiableList(new ArrayList(list));
        this.consideredQueryParameters = DesugarCollections.unmodifiableList(new ArrayList(list2));
    }

    public static NoVarySearchHeader alwaysVaryHeader() {
        return new NoVarySearchHeader(true, false, Collections.EMPTY_LIST, Collections.EMPTY_LIST);
    }

    public static NoVarySearchHeader neverVaryExcept(boolean z, List<String> list) {
        return new NoVarySearchHeader(z, true, Collections.EMPTY_LIST, list);
    }

    public static NoVarySearchHeader neverVaryHeader() {
        return new NoVarySearchHeader(false, true, Collections.EMPTY_LIST, Collections.EMPTY_LIST);
    }

    public static NoVarySearchHeader varyExcept(boolean z, List<String> list) {
        return new NoVarySearchHeader(z, false, list, Collections.EMPTY_LIST);
    }
}
