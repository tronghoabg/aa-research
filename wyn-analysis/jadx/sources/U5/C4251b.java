package u5;

import android.content.Context;

/* renamed from: u5.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4251b extends AbstractC4252c {

    /* renamed from: a, reason: collision with root package name */
    public final Context f46649a;

    /* renamed from: b, reason: collision with root package name */
    public final C5.a f46650b;

    /* renamed from: c, reason: collision with root package name */
    public final C5.a f46651c;

    /* renamed from: d, reason: collision with root package name */
    public final String f46652d;

    public C4251b(Context context, C5.a aVar, C5.a aVar2, String str) {
        if (context == null) {
            throw new NullPointerException("Null applicationContext");
        }
        this.f46649a = context;
        if (aVar == null) {
            throw new NullPointerException("Null wallClock");
        }
        this.f46650b = aVar;
        if (aVar2 == null) {
            throw new NullPointerException("Null monotonicClock");
        }
        this.f46651c = aVar2;
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f46652d = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC4252c) {
            AbstractC4252c abstractC4252c = (AbstractC4252c) obj;
            if (this.f46649a.equals(((C4251b) abstractC4252c).f46649a)) {
                C4251b c4251b = (C4251b) abstractC4252c;
                if (this.f46650b.equals(c4251b.f46650b) && this.f46651c.equals(c4251b.f46651c) && this.f46652d.equals(c4251b.f46652d)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f46649a.hashCode() ^ 1000003) * 1000003) ^ this.f46650b.hashCode()) * 1000003) ^ this.f46651c.hashCode()) * 1000003) ^ this.f46652d.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CreationContext{applicationContext=");
        sb2.append(this.f46649a);
        sb2.append(", wallClock=");
        sb2.append(this.f46650b);
        sb2.append(", monotonicClock=");
        sb2.append(this.f46651c);
        sb2.append(", backendName=");
        return wg.b.c(sb2, this.f46652d, "}");
    }
}
