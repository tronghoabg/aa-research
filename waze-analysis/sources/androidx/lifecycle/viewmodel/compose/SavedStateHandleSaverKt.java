package androidx.lifecycle.viewmodel.compose;

import android.os.Bundle;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.runtime.snapshots.SnapshotMutableState;
import androidx.core.os.BundleKt;
import androidx.lifecycle.SavedStateHandle;
import androidx.savedstate.SavedStateWriter;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;
import h.g.b.ar;
import h.g.b.m;
import h.g.b.x;
import h.i.b;
import h.i.c;
import h.i.d;
import h.k;
import h.l.r;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class SavedStateHandleSaverKt {
    public static /* synthetic */ Object $r8$lambda$J4nWf6sDK0PhIox5IOW80Nt7S1s(Object obj, Object obj2, r rVar) {
        return obj;
    }

    private static final String getSaveableKeyPrefix(Object obj) {
        if (obj == null) {
            return "";
        }
        int i2 = ar.f48106a;
        return String.valueOf(CanonicalName_jvmAndAndroidKt.getCanonicalName(new m(obj.getClass()))).concat(".");
    }

    private static final <T> Saver<MutableState<T>, MutableState> mutableStateSaver(final Saver<T, ? extends Object> saver) {
        x.d(saver, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.lifecycle.viewmodel.compose.SavedStateHandleSaverKt.mutableStateSaver, kotlin.Any>");
        return SaverKt.Saver(new p() { // from class: androidx.lifecycle.viewmodel.compose.SavedStateHandleSaverKt$$ExternalSyntheticLambda0
            @Override // h.g.a.p
            public final Object invoke(Object obj, Object obj2) {
                return SavedStateHandleSaverKt.mutableStateSaver$lambda$0$0(saver, (SaverScope) obj, (MutableState) obj2);
            }
        }, new l() { // from class: androidx.lifecycle.viewmodel.compose.SavedStateHandleSaverKt$$ExternalSyntheticLambda1
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return SavedStateHandleSaverKt.mutableStateSaver$lambda$0$1(saver, (MutableState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableState mutableStateSaver$lambda$0$0(Saver saver, SaverScope saverScope, MutableState mutableState) {
        if (!(mutableState instanceof SnapshotMutableState)) {
            throw new IllegalArgumentException("If you use a custom MutableState implementation you have to write a custom Saver and pass it as a saver param to rememberSaveable()");
        }
        SnapshotMutableState snapshotMutableState = (SnapshotMutableState) mutableState;
        Object objSave = saver.save(saverScope, snapshotMutableState.getValue());
        SnapshotMutationPolicy policy = snapshotMutableState.getPolicy();
        x.d(policy, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<kotlin.Any?>");
        return SnapshotStateKt.mutableStateOf(objSave, policy);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableState mutableStateSaver$lambda$0$1(Saver saver, MutableState mutableState) {
        Object objRestore;
        if (!(mutableState instanceof SnapshotMutableState)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        SnapshotMutableState snapshotMutableState = (SnapshotMutableState) mutableState;
        if (snapshotMutableState.getValue() != 0) {
            T value = snapshotMutableState.getValue();
            x.c(value);
            objRestore = saver.restore(value);
        } else {
            objRestore = null;
        }
        SnapshotMutationPolicy policy = snapshotMutableState.getPolicy();
        x.d(policy, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.lifecycle.viewmodel.compose.SavedStateHandleSaverKt.mutableStateSaver?>");
        return SnapshotStateKt.mutableStateOf(objRestore, policy);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: saveable, reason: collision with other method in class */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> T m11982saveable(androidx.lifecycle.SavedStateHandle r2, java.lang.String r3, final androidx.compose.runtime.saveable.Saver<T, ? extends java.lang.Object> r4, h.g.a.a<? extends T> r5) {
        /*
            java.lang.String r0 = "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.lifecycle.viewmodel.compose.SavedStateHandleSaverKt.saveable, kotlin.Any>"
            h.g.b.x.d(r4, r0)
            java.lang.Object r0 = r2.get(r3)
            android.os.Bundle r0 = (android.os.Bundle) r0
            if (r0 == 0) goto L22
            androidx.savedstate.SavedStateReader.m13269constructorimpl(r0)
            java.util.Map r0 = androidx.savedstate.SavedStateReader.m13350toMapimpl(r0)
            java.lang.String r1 = "value"
            java.lang.Object r0 = r0.get(r1)
            if (r0 == 0) goto L22
            java.lang.Object r0 = r4.restore(r0)
            if (r0 != 0) goto L26
        L22:
            java.lang.Object r0 = r5.invoke()
        L26:
            androidx.lifecycle.viewmodel.compose.SavedStateHandleSaverKt$$ExternalSyntheticLambda4 r5 = new androidx.lifecycle.viewmodel.compose.SavedStateHandleSaverKt$$ExternalSyntheticLambda4
            r5.<init>()
            r2.setSavedStateProvider(r3, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.viewmodel.compose.SavedStateHandleSaverKt.m11982saveable(androidx.lifecycle.SavedStateHandle, java.lang.String, androidx.compose.runtime.saveable.Saver, h.g.a.a):java.lang.Object");
    }

    public static /* synthetic */ b saveable$default(SavedStateHandle savedStateHandle, Saver saver, a aVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            saver = SaverKt.autoSaver();
        }
        return saveable(savedStateHandle, saver, aVar);
    }

    static final Bundle saveable$lambda$1(Saver saver, Object obj) {
        k[] kVarArr;
        Map mapE = h.a.r.e(new k("value", saver.save(new SavedStateHandleSaverKt$saveable$1$1$1(SavedStateHandle.Companion), obj)));
        if (mapE.isEmpty()) {
            kVarArr = new k[0];
        } else {
            ArrayList arrayList = new ArrayList(mapE.size());
            for (Map.Entry entry : mapE.entrySet()) {
                arrayList.add(new k((String) entry.getKey(), entry.getValue()));
            }
            kVarArr = (k[]) arrayList.toArray(new k[0]);
        }
        Bundle bundleBundleOf = BundleKt.bundleOf((k[]) Arrays.copyOf(kVarArr, kVarArr.length));
        SavedStateWriter.m13355constructorimpl(bundleBundleOf);
        return bundleBundleOf;
    }

    static final c saveable$lambda$2(SavedStateHandle savedStateHandle, Saver saver, a aVar, Object obj, r rVar) {
        final Object objM11982saveable = m11982saveable(savedStateHandle, getSaveableKeyPrefix(obj).concat(String.valueOf(rVar.getName())), (Saver<Object, ? extends Object>) saver, (a<? extends Object>) aVar);
        return new c() { // from class: androidx.lifecycle.viewmodel.compose.SavedStateHandleSaverKt$$ExternalSyntheticLambda3
            @Override // h.i.c
            public final Object getValue(Object obj2, r rVar2) {
                return objM11982saveable;
            }
        };
    }

    private static final Object saveable$lambda$2$0(Object obj, Object obj2, r rVar) {
        return obj;
    }

    static final d saveable$lambda$3(SavedStateHandle savedStateHandle, Saver saver, a aVar, Object obj, r rVar) {
        final MutableState mutableStateSaveable = saveable(savedStateHandle, getSaveableKeyPrefix(obj).concat(String.valueOf(rVar.getName())), saver, aVar);
        return new d() { // from class: androidx.lifecycle.viewmodel.compose.SavedStateHandleSaverKt$saveable$3$1
            @Override // h.i.d, h.i.c
            public Object getValue(Object obj2, r rVar2) {
                return mutableStateSaveable.getValue();
            }

            @Override // h.i.d
            public void setValue(Object obj2, r rVar2, Object obj3) {
                mutableStateSaveable.setValue(obj3);
            }
        };
    }

    public static final <T, M extends MutableState<T>> b<Object, d<Object, T>> saveableMutableState(final SavedStateHandle savedStateHandle, final Saver<T, ? extends Object> saver, final a<? extends M> aVar) {
        return new b() { // from class: androidx.lifecycle.viewmodel.compose.SavedStateHandleSaverKt$$ExternalSyntheticLambda5
            public final Object provideDelegate(Object obj, r rVar) {
                return SavedStateHandleSaverKt.saveable$lambda$3(savedStateHandle, saver, aVar, obj, rVar);
            }
        };
    }

    public static /* synthetic */ b saveableMutableState$default(SavedStateHandle savedStateHandle, Saver saver, a aVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            saver = SaverKt.autoSaver();
        }
        return saveableMutableState(savedStateHandle, saver, aVar);
    }

    public static /* synthetic */ Object saveable$default(SavedStateHandle savedStateHandle, String str, Saver saver, a aVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            saver = SaverKt.autoSaver();
        }
        return m11982saveable(savedStateHandle, str, saver, aVar);
    }

    public static final <T> MutableState<T> saveable(SavedStateHandle savedStateHandle, String str, Saver<T, ? extends Object> saver, a<? extends MutableState<T>> aVar) {
        return (MutableState) m11982saveable(savedStateHandle, str, mutableStateSaver(saver), (a) aVar);
    }

    public static final <T> b<Object, c<Object, T>> saveable(final SavedStateHandle savedStateHandle, final Saver<T, ? extends Object> saver, final a<? extends T> aVar) {
        return new b() { // from class: androidx.lifecycle.viewmodel.compose.SavedStateHandleSaverKt$$ExternalSyntheticLambda2
            public final Object provideDelegate(Object obj, r rVar) {
                return SavedStateHandleSaverKt.saveable$lambda$2(savedStateHandle, saver, aVar, obj, rVar);
            }
        };
    }
}
