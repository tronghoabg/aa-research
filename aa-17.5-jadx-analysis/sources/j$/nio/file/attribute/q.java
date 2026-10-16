package j$.nio.file.attribute;

import java.nio.file.attribute.FileAttribute;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class q implements FileAttribute {
    public final /* synthetic */ r a;

    public final /* synthetic */ boolean equals(Object obj) {
        r rVar = this.a;
        if (obj instanceof q) {
            obj = ((q) obj).a;
        }
        return rVar.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.attribute.FileAttribute
    public final /* synthetic */ String name() {
        return this.a.name();
    }

    @Override // java.nio.file.attribute.FileAttribute
    public final /* synthetic */ Object value() {
        return this.a.value();
    }
}
