package e0;

import android.graphics.Paint;
import android.graphics.Shader;
import c7.C1576l;
import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: e0.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2440C extends AbstractC2461m {

    /* renamed from: a, reason: collision with root package name */
    public Shader f34335a;

    /* renamed from: b, reason: collision with root package name */
    public long f34336b = d0.f.f33950c;

    @Override // e0.AbstractC2461m
    public final void a(float f10, long j8, C1576l c1576l) {
        Shader shaderB = this.f34335a;
        if (shaderB == null || !d0.f.a(this.f34336b, j8)) {
            shaderB = b(j8);
            this.f34335a = shaderB;
            this.f34336b = j8;
        }
        Paint paint = (Paint) c1576l.f19706b;
        AbstractC3340k.e(paint, "<this>");
        long jB = z.b(paint.getColor());
        long j10 = C2465q.f34373b;
        if (!C2465q.b(jB, j10)) {
            c1576l.e(j10);
        }
        if (!AbstractC3340k.a((Shader) c1576l.f19707c, shaderB)) {
            c1576l.f19707c = shaderB;
            Paint paint2 = (Paint) c1576l.f19706b;
            AbstractC3340k.e(paint2, "<this>");
            paint2.setShader(shaderB);
        }
        AbstractC3340k.e((Paint) c1576l.f19706b, "<this>");
        if (r7.getAlpha() / 255.0f == f10) {
            return;
        }
        c1576l.c(f10);
    }

    public abstract Shader b(long j8);
}
