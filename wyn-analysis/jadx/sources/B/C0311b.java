package B;

import e0.C2454f;
import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: B.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0311b {

    /* renamed from: a, reason: collision with root package name */
    public C2454f f1414a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0311b)) {
            return false;
        }
        C0311b c0311b = (C0311b) obj;
        c0311b.getClass();
        return AbstractC3340k.a(this.f1414a, c0311b.f1414a);
    }

    public final int hashCode() {
        C2454f c2454f = this.f1414a;
        if (c2454f == null) {
            return 0;
        }
        return c2454f.hashCode();
    }

    public final String toString() {
        return "BorderCache(imageBitmap=null, canvas=null, canvasDrawScope=null, borderPath=" + this.f1414a + ')';
    }
}
