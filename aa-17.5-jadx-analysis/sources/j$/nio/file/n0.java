package j$.nio.file;

import java.nio.file.WatchEvent;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class n0 implements WatchEvent.Modifier {
    public final /* synthetic */ o0 a;

    public /* synthetic */ n0(o0 o0Var) {
        this.a = o0Var;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        o0 o0Var = this.a;
        if (obj instanceof n0) {
            obj = ((n0) obj).a;
        }
        return o0Var.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.WatchEvent.Modifier
    public final /* synthetic */ String name() {
        return ((m0) this.a).a();
    }
}
