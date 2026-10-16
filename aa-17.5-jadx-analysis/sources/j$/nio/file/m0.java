package j$.nio.file;

import java.nio.file.WatchEvent;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class m0 implements o0 {
    public final /* synthetic */ WatchEvent.Modifier a;

    public final /* synthetic */ String a() {
        return this.a.name();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        WatchEvent.Modifier modifier = this.a;
        if (obj instanceof m0) {
            obj = ((m0) obj).a;
        }
        return modifier.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
