package j$.nio.file.attribute;

import java.nio.file.attribute.FileAttribute;
import java.util.Collections;
import java.util.Set;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public final class s implements r {
    public final /* synthetic */ FileAttribute a;

    public s(FileAttribute fileAttribute) {
        this.a = fileAttribute;
    }

    @Override // j$.nio.file.attribute.r
    public final String name() {
        return "posix:permissions";
    }

    @Override // j$.nio.file.attribute.r
    public final Object value() {
        return Collections.unmodifiableSet(j$.nio.file.a.m((Set) this.a.value()));
    }
}
