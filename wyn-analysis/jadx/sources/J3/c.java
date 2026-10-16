package J3;

import android.net.Uri;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f5552a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f5553b;

    public c(boolean z2, Uri uri) {
        this.f5552a = uri;
        this.f5553b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!c.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        AbstractC3340k.c(obj, "null cannot be cast to non-null type androidx.work.Constraints.ContentUriTrigger");
        c cVar = (c) obj;
        return AbstractC3340k.a(this.f5552a, cVar.f5552a) && this.f5553b == cVar.f5553b;
    }

    public final int hashCode() {
        return (this.f5552a.hashCode() * 31) + (this.f5553b ? 1231 : 1237);
    }
}
