package androidx.compose.runtime.saveable;

import androidx.compose.runtime.Composer;
import h.ab;
import h.g.a.p;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface SaveableStateHolder {
    void SaveableStateProvider(Object obj, p<? super Composer, ? super Integer, ab> pVar, Composer composer, int i2);

    void removeState(Object obj);
}
