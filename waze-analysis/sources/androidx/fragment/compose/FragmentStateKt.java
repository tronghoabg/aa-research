package androidx.fragment.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class FragmentStateKt {
    private static final Saver<FragmentState, ?> fragmentStateSaver() {
        return SaverKt.Saver(new p() { // from class: androidx.fragment.compose.FragmentStateKt$$ExternalSyntheticLambda0
            @Override // h.g.a.p
            public final Object invoke(Object obj, Object obj2) {
                return ((FragmentState) obj2).getState$fragment_compose();
            }
        }, new l() { // from class: androidx.fragment.compose.FragmentStateKt$$ExternalSyntheticLambda1
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return FragmentStateKt.fragmentStateSaver$lambda$1((MutableState) obj);
            }
        });
    }

    static final FragmentState fragmentStateSaver$lambda$1(MutableState mutableState) {
        return new FragmentState(mutableState);
    }

    public static final FragmentState rememberFragmentState(Composer composer, int i2) {
        composer.startReplaceableGroup(-496803845);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-496803845, i2, -1, "androidx.fragment.compose.rememberFragmentState (FragmentState.kt:31)");
        }
        Object[] objArr = new Object[0];
        Saver<FragmentState, ?> saverFragmentStateSaver = fragmentStateSaver();
        composer.startReplaceableGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new a() { // from class: androidx.fragment.compose.FragmentStateKt$$ExternalSyntheticLambda2
                @Override // h.g.a.a
                public final Object invoke() {
                    return FragmentStateKt.rememberFragmentState$lambda$0$0();
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        FragmentState fragmentState = (FragmentState) RememberSaveableKt.m7616rememberSaveable(objArr, (Saver) saverFragmentStateSaver, (String) null, (a) objRememberedValue, composer, 0, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return fragmentState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final FragmentState rememberFragmentState$lambda$0$0() {
        return new FragmentState(null, 1, 0 == true ? 1 : 0);
    }
}
