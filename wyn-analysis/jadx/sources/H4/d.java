package h4;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes.dex */
public final class d extends i {

    /* renamed from: a, reason: collision with root package name */
    public final Drawable f36071a;

    /* renamed from: b, reason: collision with root package name */
    public final h f36072b;

    /* renamed from: c, reason: collision with root package name */
    public final Throwable f36073c;

    public d(Drawable drawable, h hVar, Throwable th) {
        this.f36071a = drawable;
        this.f36072b = hVar;
        this.f36073c = th;
    }

    @Override // h4.i
    public final h a() {
        return this.f36072b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (AbstractC3340k.a(this.f36071a, dVar.f36071a)) {
            return AbstractC3340k.a(this.f36072b, dVar.f36072b) && AbstractC3340k.a(this.f36073c, dVar.f36073c);
        }
        return false;
    }

    public final int hashCode() {
        Drawable drawable = this.f36071a;
        return this.f36073c.hashCode() + ((this.f36072b.hashCode() + ((drawable != null ? drawable.hashCode() : 0) * 31)) * 31);
    }
}
