package androidx.compose.runtime;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.compose.runtime.snapshots.SnapshotStateSet;
import h.ab;
import h.c.e;
import h.c.j;
import h.g.a.a;
import h.g.a.p;
import h.l.r;
import java.util.Collection;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.k;

/* loaded from: classes.dex */
public final class SnapshotStateKt {
    public static final <T extends R, R> State<R> collectAsState(k<? extends T> kVar, R r, j jVar, Composer composer, int i2, int i3) {
        return SnapshotStateKt__SnapshotFlowKt.collectAsState(kVar, r, jVar, composer, i2, i3);
    }

    public static final MutableVector<DerivedStateObserver> derivedStateObservers() {
        return SnapshotStateKt__DerivedStateKt.derivedStateObservers();
    }

    public static final <T> State<T> derivedStateOf(SnapshotMutationPolicy<T> snapshotMutationPolicy, a<? extends T> aVar) {
        return SnapshotStateKt__DerivedStateKt.derivedStateOf(snapshotMutationPolicy, aVar);
    }

    public static final <T> T getValue(State<? extends T> state, Object obj, r rVar) {
        return (T) SnapshotStateKt__SnapshotStateKt.getValue(state, obj, rVar);
    }

    public static final <T> SnapshotStateList<T> mutableStateListOf() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateListOf();
    }

    public static final <K, V> SnapshotStateMap<K, V> mutableStateMapOf() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateMapOf();
    }

    public static final <T> MutableState<T> mutableStateOf(T t, SnapshotMutationPolicy<T> snapshotMutationPolicy) {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf(t, snapshotMutationPolicy);
    }

    public static final <T> SnapshotStateSet<T> mutableStateSetOf() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateSetOf();
    }

    public static final <T> SnapshotMutationPolicy<T> neverEqualPolicy() {
        return SnapshotStateKt__SnapshotMutationPolicyKt.neverEqualPolicy();
    }

    public static final <R> void observeDerivedStateRecalculations(DerivedStateObserver derivedStateObserver, a<? extends R> aVar) {
        SnapshotStateKt__DerivedStateKt.observeDerivedStateRecalculations(derivedStateObserver, aVar);
    }

    public static final <T> State<T> produceState(T t, Object obj, Object obj2, Object obj3, p<? super ProduceStateScope<T>, ? super e<? super ab>, ? extends Object> pVar, Composer composer, int i2) {
        return SnapshotStateKt__ProduceStateKt.produceState(t, obj, obj2, obj3, pVar, composer, i2);
    }

    public static final <T> SnapshotMutationPolicy<T> referentialEqualityPolicy() {
        return SnapshotStateKt__SnapshotMutationPolicyKt.referentialEqualityPolicy();
    }

    public static final <T> State<T> rememberUpdatedState(T t, Composer composer, int i2) {
        return SnapshotStateKt__SnapshotStateKt.rememberUpdatedState(t, composer, i2);
    }

    public static final <T> void setValue(MutableState<T> mutableState, Object obj, r rVar, T t) {
        SnapshotStateKt__SnapshotStateKt.setValue(mutableState, obj, rVar, t);
    }

    public static final <T> k<T> snapshotFlow(SnapshotFlowManager snapshotFlowManager, a<? extends T> aVar) {
        return SnapshotStateKt__SnapshotFlowKt.snapshotFlow(snapshotFlowManager, aVar);
    }

    public static final <T> SnapshotMutationPolicy<T> structuralEqualityPolicy() {
        return SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy();
    }

    public static final <T> SnapshotStateList<T> toMutableStateList(Collection<? extends T> collection) {
        return SnapshotStateKt__SnapshotStateKt.toMutableStateList(collection);
    }

    public static final <K, V> SnapshotStateMap<K, V> toMutableStateMap(Iterable<? extends h.k<? extends K, ? extends V>> iterable) {
        return SnapshotStateKt__SnapshotStateKt.toMutableStateMap(iterable);
    }

    public static final <T> State<T> collectAsState(ch<? extends T> chVar, j jVar, Composer composer, int i2, int i3) {
        return SnapshotStateKt__SnapshotFlowKt.collectAsState(chVar, jVar, composer, i2, i3);
    }

    public static final <T> State<T> derivedStateOf(a<? extends T> aVar) {
        return SnapshotStateKt__DerivedStateKt.derivedStateOf(aVar);
    }

    public static final <T> SnapshotStateList<T> mutableStateListOf(T... tArr) {
        return SnapshotStateKt__SnapshotStateKt.mutableStateListOf(tArr);
    }

    public static final <K, V> SnapshotStateMap<K, V> mutableStateMapOf(h.k<? extends K, ? extends V>... kVarArr) {
        return SnapshotStateKt__SnapshotStateKt.mutableStateMapOf(kVarArr);
    }

    public static final <T> SnapshotStateSet<T> mutableStateSetOf(T... tArr) {
        return SnapshotStateKt__SnapshotStateKt.mutableStateSetOf(tArr);
    }

    public static final <T> State<T> produceState(T t, Object obj, Object obj2, p<? super ProduceStateScope<T>, ? super e<? super ab>, ? extends Object> pVar, Composer composer, int i2) {
        return SnapshotStateKt__ProduceStateKt.produceState(t, obj, obj2, pVar, composer, i2);
    }

    public static final <T> k<T> snapshotFlow(a<? extends T> aVar) {
        return SnapshotStateKt__SnapshotFlowKt.snapshotFlow(aVar);
    }

    public static final <T> State<T> produceState(T t, Object obj, p<? super ProduceStateScope<T>, ? super e<? super ab>, ? extends Object> pVar, Composer composer, int i2) {
        return SnapshotStateKt__ProduceStateKt.produceState(t, obj, pVar, composer, i2);
    }

    public static final <T> State<T> produceState(T t, p<? super ProduceStateScope<T>, ? super e<? super ab>, ? extends Object> pVar, Composer composer, int i2) {
        return SnapshotStateKt__ProduceStateKt.produceState(t, pVar, composer, i2);
    }

    public static final <T> State<T> produceState(T t, Object[] objArr, p<? super ProduceStateScope<T>, ? super e<? super ab>, ? extends Object> pVar, Composer composer, int i2) {
        return SnapshotStateKt__ProduceStateKt.produceState((Object) t, objArr, (p) pVar, composer, i2);
    }
}
