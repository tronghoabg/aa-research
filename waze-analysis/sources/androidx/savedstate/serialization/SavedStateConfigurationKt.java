package androidx.savedstate.serialization;

import android.os.Bundle;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.savedstate.serialization.SavedStateConfiguration;
import androidx.savedstate.serialization.serializers.MutableStateFlowSerializer;
import androidx.savedstate.serialization.serializers.SavedStateSerializer;
import h.ab;
import h.g.a.l;
import h.g.b.ar;
import h.g.b.m;
import h.g.b.x;
import java.util.List;
import kotlinx.b.b;
import kotlinx.b.e.e;
import kotlinx.b.e.f;
import kotlinx.b.e.i;
import kotlinx.coroutines.b.bn;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class SavedStateConfigurationKt {
    private static final e DEFAULT_SERIALIZERS_MODULE;

    static {
        f fVar = new f();
        SavedStateSerializer savedStateSerializer = SavedStateSerializer.INSTANCE;
        int i2 = ar.f48106a;
        fVar.b(new m(Bundle.class), savedStateSerializer);
        fVar.a(new m(bn.class), new l() { // from class: androidx.savedstate.serialization.SavedStateConfigurationKt$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return SavedStateConfigurationKt.DEFAULT_SERIALIZERS_MODULE$lambda$0$0((List) obj);
            }
        });
        e eVarF = fVar.f();
        e defaultSerializersModuleOnPlatform = SavedStateConfiguration_androidKt.getDefaultSerializersModuleOnPlatform();
        int i3 = i.f51249a;
        x.f(eVarF, "<this>");
        x.f(defaultSerializersModuleOnPlatform, "other");
        f fVar2 = new f();
        fVar2.g(eVarF);
        fVar2.g(defaultSerializersModuleOnPlatform);
        DEFAULT_SERIALIZERS_MODULE = fVar2.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b DEFAULT_SERIALIZERS_MODULE$lambda$0$0(List list) {
        x.f(list, "elementSerializers");
        return new MutableStateFlowSerializer((b) h.a.i.P(list));
    }

    public static final SavedStateConfiguration SavedStateConfiguration(SavedStateConfiguration savedStateConfiguration, l<? super SavedStateConfiguration.Builder, ab> lVar) {
        x.f(savedStateConfiguration, TypedValues.TransitionType.S_FROM);
        x.f(lVar, "builderAction");
        SavedStateConfiguration.Builder builder = new SavedStateConfiguration.Builder(savedStateConfiguration);
        lVar.invoke(builder);
        return builder.build$savedstate();
    }

    public static /* synthetic */ SavedStateConfiguration SavedStateConfiguration$default(SavedStateConfiguration savedStateConfiguration, l lVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            savedStateConfiguration = SavedStateConfiguration.DEFAULT;
        }
        return SavedStateConfiguration(savedStateConfiguration, lVar);
    }

    public static final SavedStateConfiguration SavedStateConfiguration(l<? super SavedStateConfiguration.Builder, ab> lVar) {
        x.f(lVar, "builderAction");
        return SavedStateConfiguration$default(null, lVar, 1, null);
    }
}
