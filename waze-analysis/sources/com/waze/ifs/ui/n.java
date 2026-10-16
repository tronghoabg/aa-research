package com.waze.ifs.ui;

import com.waze.settings.gw;
import j$.util.Objects;
import java.util.Comparator;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class n implements Comparator {
    n(o oVar) {
        Objects.requireNonNull(oVar);
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        float f2 = ((gw) obj).f37353f;
        float f3 = ((gw) obj2).f37353f;
        if (f2 > f3) {
            return -1;
        }
        return f2 < f3 ? 1 : 0;
    }
}
