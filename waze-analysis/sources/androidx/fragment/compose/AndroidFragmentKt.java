package androidx.fragment.compose;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.ar;
import android.support.v4.app.bv;
import android.support.v4.app.ch;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import h.ab;
import h.g.a.l;
import h.g.b.am;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class AndroidFragmentKt {
    /* JADX WARN: Removed duplicated region for block: B:107:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0174  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T extends android.support.v4.app.ar> void AndroidFragment(final java.lang.Class<T> r21, androidx.compose.ui.Modifier r22, androidx.fragment.compose.FragmentState r23, android.os.Bundle r24, h.g.a.l<? super T, h.ab> r25, androidx.compose.runtime.Composer r26, final int r27, final int r28) {
        /*
            Method dump skipped, instructions count: 574
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.compose.AndroidFragmentKt.AndroidFragment(java.lang.Class, androidx.compose.ui.Modifier, androidx.fragment.compose.FragmentState, android.os.Bundle, h.g.a.l, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab AndroidFragment$lambda$1$0(ar arVar) {
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult AndroidFragment$lambda$4$0(final bv bvVar, FragmentContainerViewFactory fragmentContainerViewFactory, Context context, Class cls, State state, final FragmentState fragmentState, Bundle bundle, int i2, DisposableEffectScope disposableEffectScope) {
        final am amVar = new am();
        final ar arVarG = bvVar.g(fragmentContainerViewFactory.getContainer().getId());
        if (arVarG == null) {
            arVarG = bvVar.o().a(context.getClassLoader(), cls.getName());
            arVarG.setInitialSavedState(fragmentState.getState$fragment_compose().getValue());
            arVarG.setArguments(bundle);
            ch chVarU = bvVar.u();
            chVarU.A();
            chVarU.D(fragmentContainerViewFactory.getContainer(), arVarG, String.valueOf(i2));
            if (bvVar.aO()) {
                amVar.f48101a = true;
                arVarG.getLifecycle().addObserver(new DefaultLifecycleObserver() { // from class: androidx.fragment.compose.AndroidFragmentKt$AndroidFragment$3$1$fragment$1$1
                    @Override // androidx.lifecycle.DefaultLifecycleObserver
                    public /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
                        x.f(lifecycleOwner, "owner");
                    }

                    @Override // androidx.lifecycle.DefaultLifecycleObserver
                    public /* synthetic */ void onDestroy(LifecycleOwner lifecycleOwner) {
                        x.f(lifecycleOwner, "owner");
                    }

                    @Override // androidx.lifecycle.DefaultLifecycleObserver
                    public /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
                        x.f(lifecycleOwner, "owner");
                    }

                    @Override // androidx.lifecycle.DefaultLifecycleObserver
                    public /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
                        x.f(lifecycleOwner, "owner");
                    }

                    @Override // androidx.lifecycle.DefaultLifecycleObserver
                    public void onStart(LifecycleOwner lifecycleOwner) {
                        amVar.f48101a = false;
                        arVarG.getLifecycle().removeObserver(this);
                    }

                    @Override // androidx.lifecycle.DefaultLifecycleObserver
                    public /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
                        x.f(lifecycleOwner, "owner");
                    }
                });
                chVarU.g();
            } else {
                chVarU.f();
            }
        }
        bvVar.at(fragmentContainerViewFactory.getContainer());
        l lVar = (l) state.getValue();
        x.d(arVarG, "null cannot be cast to non-null type T of androidx.fragment.compose.AndroidFragmentKt.AndroidFragment");
        lVar.invoke(arVarG);
        return new DisposableEffectResult() { // from class: androidx.fragment.compose.AndroidFragmentKt$AndroidFragment$lambda$4$0$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                FragmentState fragmentState2 = fragmentState;
                fragmentState2.getState$fragment_compose().setValue(bvVar.d(arVarG));
                boolean z = amVar.f48101a;
                bv bvVar2 = bvVar;
                if (z) {
                    ch chVarU2 = bvVar2.u();
                    x.e(chVarU2, "beginTransaction(...)");
                    chVarU2.n(arVarG);
                    chVarU2.g();
                    return;
                }
                if (bvVar2.aO()) {
                    return;
                }
                ch chVarU3 = bvVar.u();
                x.e(chVarU3, "beginTransaction(...)");
                chVarU3.n(arVarG);
                chVarU3.f();
            }
        };
    }

    static final ab AndroidFragment$lambda$5(Class cls, Modifier modifier, FragmentState fragmentState, Bundle bundle, l lVar, int i2, int i3, Composer composer, int i4) {
        AndroidFragment(cls, modifier, fragmentState, bundle, lVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    public static final /* synthetic */ <T extends ar> void AndroidFragment(Modifier modifier, FragmentState fragmentState, Bundle bundle, l<? super T, ab> lVar, Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(1765406104);
        if ((i3 & 1) != 0) {
            modifier = Modifier.Companion;
        }
        Modifier modifier2 = modifier;
        if ((i3 & 2) != 0) {
            fragmentState = FragmentStateKt.rememberFragmentState(composer, 0);
        }
        FragmentState fragmentState2 = fragmentState;
        if ((i3 & 4) != 0) {
            bundle = Bundle.EMPTY;
        }
        Bundle bundle2 = bundle;
        if ((i3 & 8) != 0) {
            composer.startReplaceableGroup(1849434622);
            AndroidFragmentKt$AndroidFragment$$inlined$cache$lambda$1 androidFragmentKt$AndroidFragment$$inlined$cache$lambda$1RememberedValue = composer.rememberedValue();
            if (androidFragmentKt$AndroidFragment$$inlined$cache$lambda$1RememberedValue == Composer.Companion.getEmpty()) {
                x.i();
                androidFragmentKt$AndroidFragment$$inlined$cache$lambda$1RememberedValue = AndroidFragmentKt$AndroidFragment$$inlined$cache$lambda$1.INSTANCE;
                composer.updateRememberedValue(androidFragmentKt$AndroidFragment$$inlined$cache$lambda$1RememberedValue);
            }
            lVar = (l) androidFragmentKt$AndroidFragment$$inlined$cache$lambda$1RememberedValue;
            composer.endReplaceableGroup();
        }
        x.i();
        AndroidFragment(ar.class, modifier2, fragmentState2, bundle2, lVar, composer, (i2 << 3) & 65520, 0);
        composer.endReplaceableGroup();
    }
}
