package i4;

import X3.h;
import android.content.Context;
import android.util.DisplayMetrics;
import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: i4.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2846c implements InterfaceC2850g {

    /* renamed from: a, reason: collision with root package name */
    public final Context f36784a;

    public C2846c(Context context) {
        this.f36784a = context;
    }

    @Override // i4.InterfaceC2850g
    public final Object a(h hVar) {
        DisplayMetrics displayMetrics = this.f36784a.getResources().getDisplayMetrics();
        C2844a c2844a = new C2844a(Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels));
        return new C2849f(c2844a, c2844a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2846c) {
            return AbstractC3340k.a(this.f36784a, ((C2846c) obj).f36784a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f36784a.hashCode();
    }
}
