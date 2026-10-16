package com.waze.ui.af;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class ad implements h.g.a.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f41809a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f41810b;

    public /* synthetic */ ad(q qVar, int i2) {
        this.f41810b = i2;
        this.f41809a = qVar;
    }

    @Override // h.g.a.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        if (this.f41810b != 0) {
            int iIntValue = ((Integer) obj3).intValue();
            return ap.n(this.f41809a, (LazyItemScope) obj, (Composer) obj2, iIntValue);
        }
        int iIntValue2 = ((Integer) obj3).intValue();
        return ap.l(this.f41809a, (ColumnScope) obj, (Composer) obj2, iIntValue2);
    }
}
