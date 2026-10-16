package androidx.compose.runtime;

import h.ab;
import h.g.a.a;
import h.g.a.p;
import h.k;
import java.util.List;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface ControlledComposition extends Composition {
    void abandonChanges();

    void applyChanges();

    void applyLateChanges();

    void changesApplied();

    void composeContent(p<? super Composer, ? super Integer, ab> pVar);

    <R> R delegateInvalidations(ControlledComposition controlledComposition, int i2, a<? extends R> aVar);

    void disposeUnusedMovableContent(MovableContentState movableContentState);

    ShouldPauseCallback getAndSetShouldPauseCallback(ShouldPauseCallback shouldPauseCallback);

    boolean getHasPendingChanges();

    void insertMovableContent(List<k<MovableContentStateReference, MovableContentStateReference>> list);

    void invalidateAll();

    boolean isComposing();

    boolean observesAnyOf(Set<? extends Object> set);

    void prepareCompose(a<ab> aVar);

    boolean recompose();

    void recordModificationsOf(Set<? extends Object> set);

    void recordReadOf(Object obj);

    void recordWriteOf(Object obj);

    void verifyConsistent();
}
