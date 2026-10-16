package e0;

import android.graphics.PathMeasure;
import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: e0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2455g {

    /* renamed from: a, reason: collision with root package name */
    public final PathMeasure f34367a;

    public C2455g(PathMeasure pathMeasure) {
        this.f34367a = pathMeasure;
    }

    public final void a(float f10, float f11, C2454f destination) {
        AbstractC3340k.e(destination, "destination");
        this.f34367a.getSegment(f10, f11, destination.f34364a, true);
    }
}
