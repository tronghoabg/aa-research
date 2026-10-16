package e0;

import android.graphics.Paint;
import android.graphics.Shader;
import c7.C1576l;
import ef.C2539w;
import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: e0.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2444G extends AbstractC2461m {

    /* renamed from: a, reason: collision with root package name */
    public final long f34350a;

    public C2444G(long j8) {
        this.f34350a = j8;
    }

    @Override // e0.AbstractC2461m
    public final void a(float f10, long j8, C1576l c1576l) {
        c1576l.c(1.0f);
        long jA = this.f34350a;
        if (f10 != 1.0f) {
            jA = C2465q.a(jA, C2465q.c(jA) * f10);
        }
        c1576l.e(jA);
        if (((Shader) c1576l.f19707c) != null) {
            c1576l.f19707c = null;
            Paint paint = (Paint) c1576l.f19706b;
            AbstractC3340k.e(paint, "<this>");
            paint.setShader(null);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2444G) {
            return C2465q.b(this.f34350a, ((C2444G) obj).f34350a);
        }
        return false;
    }

    public final int hashCode() {
        int i5 = C2465q.f34381j;
        return C2539w.a(this.f34350a);
    }

    public final String toString() {
        return "SolidColor(value=" + ((Object) C2465q.h(this.f34350a)) + ')';
    }
}
