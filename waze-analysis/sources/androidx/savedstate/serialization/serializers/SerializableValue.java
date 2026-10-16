package androidx.savedstate.serialization.serializers;

import h.g.b.ar;
import h.g.b.m;
import h.l.c;
import java.lang.annotation.Annotation;
import kotlinx.b.b;
import kotlinx.b.c.bm;
import kotlinx.b.i;
import kotlinx.b.j;

/* compiled from: WazeSource */
@j
/* loaded from: classes4.dex */
interface SerializableValue {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: WazeSource */
    public final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final b<SerializableValue> serializer() {
            int i2 = ar.f48106a;
            return new i("androidx.savedstate.serialization.serializers.SerializableValue", new m(SerializableValue.class), new c[]{new m(BooleanArrayValue.class), new m(BooleanValue.class), new m(CharArrayValue.class), new m(CharSequenceArrayValue.class), new m(CharSequenceListValue.class), new m(CharSequenceValue.class), new m(CharValue.class), new m(DoubleArrayValue.class), new m(DoubleValue.class), new m(FloatArrayValue.class), new m(FloatValue.class), new m(IntArrayValue.class), new m(IntListValue.class), new m(IntValue.class), new m(LongArrayValue.class), new m(LongValue.class), new m(NullValue.class), new m(SavedStateArrayValue.class), new m(SavedStateListValue.class), new m(SavedStateValue.class), new m(StringArrayValue.class), new m(StringListValue.class), new m(StringValue.class)}, new b[]{BooleanArrayValue$$serializer.INSTANCE, BooleanValue$$serializer.INSTANCE, CharArrayValue$$serializer.INSTANCE, CharSequenceArrayValue$$serializer.INSTANCE, CharSequenceListValue$$serializer.INSTANCE, CharSequenceValue$$serializer.INSTANCE, CharValue$$serializer.INSTANCE, DoubleArrayValue$$serializer.INSTANCE, DoubleValue$$serializer.INSTANCE, FloatArrayValue$$serializer.INSTANCE, FloatValue$$serializer.INSTANCE, IntArrayValue$$serializer.INSTANCE, IntListValue$$serializer.INSTANCE, IntValue$$serializer.INSTANCE, LongArrayValue$$serializer.INSTANCE, LongValue$$serializer.INSTANCE, new bm(NullValue.INSTANCE, new Annotation[0]), SavedStateArrayValue$$serializer.INSTANCE, SavedStateListValue$$serializer.INSTANCE, SavedStateValue$$serializer.INSTANCE, StringArrayValue$$serializer.INSTANCE, StringListValue$$serializer.INSTANCE, StringValue$$serializer.INSTANCE}, new Annotation[0]);
        }
    }
}
