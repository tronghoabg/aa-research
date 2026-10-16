package j$.nio.file;

import java.nio.file.OpenOption;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class t implements v {
    public final /* synthetic */ OpenOption a;

    public /* synthetic */ t(OpenOption openOption) {
        this.a = openOption;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [j$.nio.file.v, java.nio.file.StandardOpenOption] */
    /* JADX WARN: Type inference failed for: r1v4, types: [j$.nio.file.v, java.nio.file.LinkOption] */
    public static /* synthetic */ v a(OpenOption openOption) {
        if (openOption == 0) {
            return null;
        }
        return openOption instanceof u ? ((u) openOption).a : openOption instanceof LinkOption ? a.c((LinkOption) openOption) : openOption instanceof g0 ? a.e((g0) openOption) : new t(openOption);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        OpenOption openOption = this.a;
        if (obj instanceof t) {
            obj = ((t) obj).a;
        }
        return openOption.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
