package androidx.lifecycle;

import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: androidx.lifecycle.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1447k {
    public static EnumC1449m a(EnumC1450n state) {
        AbstractC3340k.e(state, "state");
        int iOrdinal = state.ordinal();
        if (iOrdinal == 2) {
            return EnumC1449m.ON_DESTROY;
        }
        if (iOrdinal == 3) {
            return EnumC1449m.ON_STOP;
        }
        if (iOrdinal != 4) {
            return null;
        }
        return EnumC1449m.ON_PAUSE;
    }
}
