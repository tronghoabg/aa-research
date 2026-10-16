package androidx.compose.runtime.tooling;

import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ParameterSourceInformation {
    public static final int $stable = 0;
    private final String inlineClass;
    private final String name;
    private final int sortedIndex;

    public /* synthetic */ ParameterSourceInformation(int i2, String str, String str2, int i3, o oVar) {
        this(i2, (i3 & 2) != 0 ? null : str, (i3 & 4) != 0 ? null : str2);
    }

    public final String getInlineClass() {
        return this.inlineClass;
    }

    public final String getName() {
        return this.name;
    }

    public final int getSortedIndex() {
        return this.sortedIndex;
    }

    public ParameterSourceInformation(int i2, String str, String str2) {
        this.sortedIndex = i2;
        this.name = str;
        this.inlineClass = str2;
    }
}
