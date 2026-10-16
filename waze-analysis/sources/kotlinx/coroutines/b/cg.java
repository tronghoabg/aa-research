package kotlinx.coroutines.b;

import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import java.io.IOException;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class cg implements bz {

    /* renamed from: b, reason: collision with root package name */
    private final long f51649b;

    /* renamed from: c, reason: collision with root package name */
    private final long f51650c = Long.MAX_VALUE;

    public cg(long j2) {
        this.f51649b = j2;
    }

    @Override // kotlinx.coroutines.b.bz
    public final k a(ch chVar) {
        return z.a(bl.j(at.a(chVar, new ce(this, null)), new cf(null)));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof cg)) {
            return false;
        }
        cg cgVar = (cg) obj;
        if (this.f51649b != cgVar.f51649b) {
            return false;
        }
        long j2 = cgVar.f51650c;
        return true;
    }

    public final int hashCode() {
        return (kotlinx.coroutines.b.a.x.e(this.f51649b) * 31) + kotlinx.coroutines.b.a.x.e(Long.MAX_VALUE);
    }

    public final String toString() throws IOException {
        long j2 = this.f51649b;
        List listC = h.a.i.c(2);
        if (j2 > 0) {
            listC.add("stopTimeout=" + j2 + AccessibilityNodeInfoCompat.MathInfoCompat.MATH_TAG_STRING_LITERAL);
        }
        return "SharingStarted.WhileSubscribed(" + h.a.i.aM(h.a.i.a(listC), null, null, null, 0, null, 63) + ")";
    }
}
