package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class agyg {
    private final List<agel> descriptors;
    private final boolean hasSynthesizedNames;

    /* JADX WARN: Multi-variable type inference failed */
    public agyg(List<? extends agel> list, boolean z) {
        list.getClass();
        this.descriptors = list;
        this.hasSynthesizedNames = z;
    }

    public final List<agel> getDescriptors() {
        return this.descriptors;
    }

    public final boolean getHasSynthesizedNames() {
        return this.hasSynthesizedNames;
    }
}
