package androidx.compose.foundation;

import android.os.Build;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpSize;
import h.ab;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class Magnifier_androidKt {
    private static final SemanticsPropertyKey<a<Offset>> MagnifierPositionInRoot = new SemanticsPropertyKey<>("MagnifierPositionInRoot", (p) null, 2, (o) (0 == true ? 1 : 0));

    public static final boolean equalsIncludingNaN(float f2, float f3) {
        return (Float.isNaN(f2) && Float.isNaN(f3)) || f2 == f3;
    }

    public static final SemanticsPropertyKey<a<Offset>> getMagnifierPositionInRoot() {
        return MagnifierPositionInRoot;
    }

    public static final boolean isPlatformMagnifierSupported(int i2) {
        return i2 >= 28;
    }

    public static /* synthetic */ boolean isPlatformMagnifierSupported$default(int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = Build.VERSION.SDK_INT;
        }
        return isPlatformMagnifierSupported(i2);
    }

    /* renamed from: magnifier-UpNRX3w, reason: not valid java name */
    public static final Modifier m2047magnifierUpNRX3w(Modifier modifier, l<? super Density, Offset> lVar, l<? super Density, Offset> lVar2, l<? super DpSize, ab> lVar3, float f2, long j2, float f3, float f4, boolean z) {
        return m2050magnifierjPUL71Q$default(modifier, lVar, lVar2, lVar3, f2, false, j2, f3, f4, z, null, 512, null);
    }

    /* renamed from: magnifier-UpNRX3w$default, reason: not valid java name */
    public static /* synthetic */ Modifier m2048magnifierUpNRX3w$default(Modifier modifier, l lVar, l lVar2, l lVar3, float f2, long j2, float f3, float f4, boolean z, int i2, Object obj) {
        long jM11271getUnspecifiedMYxV2XQ = (i2 & 16) != 0 ? DpSize.Companion.m11271getUnspecifiedMYxV2XQ() : j2;
        float fM11184getUnspecifiedD9Ej5fM = (i2 & 32) != 0 ? Dp.Companion.m11184getUnspecifiedD9Ej5fM() : f3;
        float fM11184getUnspecifiedD9Ej5fM2 = (i2 & 64) != 0 ? Dp.Companion.m11184getUnspecifiedD9Ej5fM() : f4;
        int i3 = i2 & 4;
        int i4 = i2 & 2;
        return m2047magnifierUpNRX3w(modifier, lVar, i4 == 0 ? lVar2 : null, i3 != 0 ? null : lVar3, (i2 & 8) != 0 ? Float.NaN : f2, jM11271getUnspecifiedMYxV2XQ, fM11184getUnspecifiedD9Ej5fM, fM11184getUnspecifiedD9Ej5fM2, (!((i2 & 128) == 0)) | z);
    }

    /* renamed from: magnifier-jPUL71Q, reason: not valid java name */
    public static final Modifier m2049magnifierjPUL71Q(Modifier modifier, l<? super Density, Offset> lVar, l<? super Density, Offset> lVar2, l<? super DpSize, ab> lVar3, float f2, boolean z, long j2, float f3, float f4, boolean z2, PlatformMagnifierFactory platformMagnifierFactory) {
        if (isPlatformMagnifierSupported$default(0, 1, null)) {
            return modifier.then(new MagnifierElement(lVar, lVar2, lVar3, f2, z, j2, f3, f4, z2, platformMagnifierFactory == null ? PlatformMagnifierFactory.Companion.getForCurrentPlatform() : platformMagnifierFactory, null));
        }
        return modifier;
    }

    /* renamed from: magnifier-jPUL71Q$default, reason: not valid java name */
    public static /* synthetic */ Modifier m2050magnifierjPUL71Q$default(Modifier modifier, l lVar, l lVar2, l lVar3, float f2, boolean z, long j2, float f3, float f4, boolean z2, PlatformMagnifierFactory platformMagnifierFactory, int i2, Object obj) {
        long jM11271getUnspecifiedMYxV2XQ = (i2 & 32) != 0 ? DpSize.Companion.m11271getUnspecifiedMYxV2XQ() : j2;
        float fM11184getUnspecifiedD9Ej5fM = (i2 & 64) != 0 ? Dp.Companion.m11184getUnspecifiedD9Ej5fM() : f3;
        float fM11184getUnspecifiedD9Ej5fM2 = (i2 & 128) != 0 ? Dp.Companion.m11184getUnspecifiedD9Ej5fM() : f4;
        int i3 = i2 & 8;
        int i4 = i2 & 4;
        int i5 = i2 & 2;
        boolean z3 = ((i2 & 16) == 0) & z;
        float f5 = i3 != 0 ? Float.NaN : f2;
        l lVar4 = i4 != 0 ? null : lVar3;
        if (i5 != 0) {
            lVar2 = null;
        }
        return m2049magnifierjPUL71Q(modifier, lVar, lVar2, lVar4, f5, z3, jM11271getUnspecifiedMYxV2XQ, fM11184getUnspecifiedD9Ej5fM, fM11184getUnspecifiedD9Ej5fM2, (!((i2 & 256) == 0)) | z2, (i2 & 512) != 0 ? null : platformMagnifierFactory);
    }
}
