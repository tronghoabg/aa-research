package J;

import e0.C2465q;
import ef.C2539w;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final long f5530a;

    /* renamed from: b, reason: collision with root package name */
    public final long f5531b;

    public c(long j8, long j10) {
        this.f5530a = j8;
        this.f5531b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return C2465q.b(this.f5530a, cVar.f5530a) && C2465q.b(this.f5531b, cVar.f5531b);
    }

    public final int hashCode() {
        int i5 = C2465q.f34381j;
        return C2539w.a(this.f5531b) + (C2539w.a(this.f5530a) * 31);
    }

    public final String toString() {
        return "SelectionColors(selectionHandleColor=" + ((Object) C2465q.h(this.f5530a)) + ", selectionBackgroundColor=" + ((Object) C2465q.h(this.f5531b)) + ')';
    }
}
