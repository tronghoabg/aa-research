package j$.nio.file.attribute;

import java.nio.file.attribute.FileAttributeView;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class w implements FileAttributeView {
    public final /* synthetic */ x a;

    public final /* synthetic */ boolean equals(Object obj) {
        x xVar = this.a;
        if (obj instanceof w) {
            obj = ((w) obj).a;
        }
        return xVar.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.attribute.AttributeView
    public final /* synthetic */ String name() {
        return this.a.name();
    }
}
