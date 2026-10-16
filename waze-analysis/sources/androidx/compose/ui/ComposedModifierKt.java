package androidx.compose.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import h.ab;
import h.g.a.l;
import h.g.a.q;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ComposedModifierKt {

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.ComposedModifierKt$materializeImpl$1, reason: invalid class name */
    final class AnonymousClass1 extends y implements l<Modifier.Element, Boolean> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // h.g.a.l
        public final Boolean invoke(Modifier.Element element) {
            return Boolean.valueOf(!(element instanceof ComposedModifier));
        }
    }

    public static final Modifier composed(Modifier modifier, String str, Object obj, Object obj2, Object obj3, l<? super InspectorInfo, ab> lVar, q<? super Modifier, ? super Composer, ? super Integer, ? extends Modifier> qVar) {
        return modifier.then(new KeyedComposedModifier3(str, obj, obj2, obj3, lVar, qVar));
    }

    public static /* synthetic */ Modifier composed$default(Modifier modifier, String str, Object obj, Object obj2, Object obj3, l lVar, q qVar, int i2, Object obj4) {
        if ((i2 & 16) != 0) {
            lVar = InspectableValueKt.getNoInspectorInfo();
        }
        return composed(modifier, str, obj, obj2, obj3, lVar, qVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier materializeImpl(Composer composer, Modifier modifier) {
        if (modifier.all(AnonymousClass1.INSTANCE)) {
            return modifier;
        }
        composer.startReplaceableGroup(1219399079);
        Modifier modifier2 = (Modifier) modifier.foldIn(Modifier.Companion, new ComposedModifierKt$materializeImpl$result$1(composer));
        composer.endReplaceableGroup();
        return modifier2;
    }

    public static final Modifier materializeModifier(Composer composer, Modifier modifier) {
        composer.startReplaceGroup(439770924);
        Modifier modifierMaterializeImpl = materializeImpl(composer, modifier);
        composer.endReplaceGroup();
        return modifierMaterializeImpl;
    }

    public static final Modifier materializeWithCompositionLocalInjectionInternal(Composer composer, Modifier modifier) {
        return modifier == Modifier.Companion ? modifier : materializeModifier(composer, new CompositionLocalMapInjectionElement(composer.getCurrentCompositionLocalMap()).then(modifier));
    }

    public static final Modifier composed(Modifier modifier, String str, Object obj, Object obj2, l<? super InspectorInfo, ab> lVar, q<? super Modifier, ? super Composer, ? super Integer, ? extends Modifier> qVar) {
        return modifier.then(new KeyedComposedModifier2(str, obj, obj2, lVar, qVar));
    }

    public static final Modifier composed(Modifier modifier, String str, Object obj, l<? super InspectorInfo, ab> lVar, q<? super Modifier, ? super Composer, ? super Integer, ? extends Modifier> qVar) {
        return modifier.then(new KeyedComposedModifier1(str, obj, lVar, qVar));
    }

    public static final Modifier composed(Modifier modifier, String str, Object[] objArr, l<? super InspectorInfo, ab> lVar, q<? super Modifier, ? super Composer, ? super Integer, ? extends Modifier> qVar) {
        return modifier.then(new KeyedComposedModifierN(str, objArr, lVar, qVar));
    }

    public static /* synthetic */ Modifier composed$default(Modifier modifier, String str, Object obj, Object obj2, l lVar, q qVar, int i2, Object obj3) {
        if ((i2 & 8) != 0) {
            lVar = InspectableValueKt.getNoInspectorInfo();
        }
        return composed(modifier, str, obj, obj2, lVar, qVar);
    }

    public static final Modifier composed(Modifier modifier, l<? super InspectorInfo, ab> lVar, q<? super Modifier, ? super Composer, ? super Integer, ? extends Modifier> qVar) {
        return modifier.then(new ComposedModifier(lVar, qVar));
    }

    public static /* synthetic */ Modifier composed$default(Modifier modifier, String str, Object obj, l lVar, q qVar, int i2, Object obj2) {
        if ((i2 & 4) != 0) {
            lVar = InspectableValueKt.getNoInspectorInfo();
        }
        return composed(modifier, str, obj, (l<? super InspectorInfo, ab>) lVar, (q<? super Modifier, ? super Composer, ? super Integer, ? extends Modifier>) qVar);
    }

    public static /* synthetic */ Modifier composed$default(Modifier modifier, String str, Object[] objArr, l lVar, q qVar, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            lVar = InspectableValueKt.getNoInspectorInfo();
        }
        return composed(modifier, str, objArr, (l<? super InspectorInfo, ab>) lVar, (q<? super Modifier, ? super Composer, ? super Integer, ? extends Modifier>) qVar);
    }

    public static /* synthetic */ Modifier composed$default(Modifier modifier, l lVar, q qVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            lVar = InspectableValueKt.getNoInspectorInfo();
        }
        return composed(modifier, lVar, qVar);
    }
}
