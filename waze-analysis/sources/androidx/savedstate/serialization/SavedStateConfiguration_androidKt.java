package androidx.savedstate.serialization;

import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import androidx.savedstate.serialization.serializers.SizeFSerializer;
import androidx.savedstate.serialization.serializers.SizeSerializer;
import androidx.savedstate.serialization.serializers.SparseArraySerializer;
import h.a.i;
import h.g.a.l;
import h.g.b.ar;
import h.g.b.m;
import h.g.b.x;
import java.util.List;
import kotlinx.b.b;
import kotlinx.b.e.e;
import kotlinx.b.e.f;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class SavedStateConfiguration_androidKt {
    public static final e getDefaultSerializersModuleOnPlatform() {
        f fVar = new f();
        SizeSerializer sizeSerializer = SizeSerializer.INSTANCE;
        int i2 = ar.f48106a;
        fVar.b(new m(Size.class), sizeSerializer);
        fVar.b(new m(SizeF.class), SizeFSerializer.INSTANCE);
        fVar.a(new m(SparseArray.class), new l() { // from class: androidx.savedstate.serialization.SavedStateConfiguration_androidKt$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return SavedStateConfiguration_androidKt.getDefaultSerializersModuleOnPlatform$lambda$0$0((List) obj);
            }
        });
        return fVar.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b getDefaultSerializersModuleOnPlatform$lambda$0$0(List list) {
        x.f(list, "argSerializers");
        return new SparseArraySerializer((b) i.P(list));
    }
}
