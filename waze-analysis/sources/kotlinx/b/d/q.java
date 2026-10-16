package kotlinx.b.d;

import androidx.media3.extractor.text.ttml.TtmlNode;
import kotlinx.b.d.a.ag;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class q extends y {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f51218a;

    /* renamed from: b, reason: collision with root package name */
    private final String f51219b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(Object obj, boolean z) {
        super(null);
        h.g.b.x.f(obj, TtmlNode.TAG_BODY);
        this.f51218a = z;
        this.f51219b = obj.toString();
    }

    @Override // kotlinx.b.d.y
    public final String a() {
        return this.f51219b;
    }

    public final boolean b() {
        return this.f51218a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            q qVar = (q) obj;
            return this.f51218a == qVar.f51218a && h.g.b.x.n(this.f51219b, qVar.f51219b);
        }
        return false;
    }

    public final int hashCode() {
        return (a.a.a(this.f51218a) * 31) + this.f51219b.hashCode();
    }

    @Override // kotlinx.b.d.y
    public final String toString() {
        boolean z = this.f51218a;
        String str = this.f51219b;
        if (!z) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        ag.a(sb, str);
        return sb.toString();
    }
}
