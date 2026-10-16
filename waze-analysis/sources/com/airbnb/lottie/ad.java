package com.airbnb.lottie;

import androidx.core.util.Pair;
import j$.util.Objects;
import java.util.Comparator;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class ad implements Comparator {
    ad(ae aeVar) {
        Objects.requireNonNull(aeVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        float fFloatValue = ((Float) ((Pair) obj).second).floatValue();
        float fFloatValue2 = ((Float) ((Pair) obj2).second).floatValue();
        if (fFloatValue2 > fFloatValue) {
            return 1;
        }
        return fFloatValue > fFloatValue2 ? -1 : 0;
    }
}
