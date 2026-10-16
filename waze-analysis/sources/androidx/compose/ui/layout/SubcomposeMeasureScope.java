package androidx.compose.ui.layout;

import androidx.compose.runtime.Composer;
import h.ab;
import h.g.a.p;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface SubcomposeMeasureScope extends MeasureScope {
    List<Measurable> subcompose(Object obj, p<? super Composer, ? super Integer, ab> pVar);
}
