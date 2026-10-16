package androidx.savedstate.serialization;

import android.os.Parcelable;
import androidx.savedstate.serialization.serializers.CharSequenceArraySerializer;
import androidx.savedstate.serialization.serializers.CharSequenceListSerializer;
import androidx.savedstate.serialization.serializers.CharSequenceSerializer;
import androidx.savedstate.serialization.serializers.DefaultJavaSerializableSerializer;
import androidx.savedstate.serialization.serializers.DefaultParcelableSerializer;
import androidx.savedstate.serialization.serializers.IBinderSerializer;
import androidx.savedstate.serialization.serializers.ParcelableArraySerializer;
import androidx.savedstate.serialization.serializers.ParcelableListSerializer;
import androidx.savedstate.serialization.serializers.SparseParcelableArraySerializer;
import h.g.b.ar;
import h.g.b.m;
import h.g.b.o;
import h.g.b.x;
import h.l.c;
import java.util.Arrays;
import kotlinx.b.a;
import kotlinx.b.a.q;
import kotlinx.b.b.e;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class SavedStateDecoder_androidKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> T decodeFormatSpecificTypesOnPlatform(SavedStateDecoder savedStateDecoder, a<? extends T> aVar) {
        x.f(savedStateDecoder, "<this>");
        x.f(aVar, "strategy");
        q descriptor = aVar.getDescriptor();
        if (x.n(descriptor, SavedStateCodecUtils_androidKt.getPolymorphicCharSequenceDescriptor())) {
            return (T) CharSequenceSerializer.INSTANCE.deserialize((e) savedStateDecoder);
        }
        if (x.n(descriptor, SavedStateCodecUtils_androidKt.getPolymorphicParcelableDescriptor())) {
            return (T) DefaultParcelableSerializer.INSTANCE.deserialize((e) savedStateDecoder);
        }
        if (x.n(descriptor, SavedStateCodecUtils_androidKt.getPolymorphicJavaSerializableDescriptor())) {
            return (T) DefaultJavaSerializableSerializer.INSTANCE.deserialize((e) savedStateDecoder);
        }
        if (x.n(descriptor, SavedStateCodecUtils_androidKt.getPolymorphicIBinderDescriptor())) {
            return (T) IBinderSerializer.INSTANCE.deserialize((e) savedStateDecoder);
        }
        if (x.n(descriptor, SavedStateCodecUtils_androidKt.getCharSequenceArrayDescriptor()) || x.n(descriptor, SavedStateCodecUtils_androidKt.getPolymorphicCharSequenceArrayDescriptor())) {
            return (T) CharSequenceArraySerializer.INSTANCE.deserialize((e) savedStateDecoder);
        }
        if (x.n(descriptor, SavedStateCodecUtils_androidKt.getCharSequenceListDescriptor()) || x.n(descriptor, SavedStateCodecUtils_androidKt.getPolymorphicCharSequenceListDescriptor())) {
            return (T) CharSequenceListSerializer.INSTANCE.deserialize((e) savedStateDecoder);
        }
        if (x.n(descriptor, SavedStateCodecUtils_androidKt.getParcelableArrayDescriptor())) {
            Parcelable[] parcelableArrDeserialize = ParcelableArraySerializer.INSTANCE.deserialize((e) savedStateDecoder);
            return (T) Arrays.copyOf(parcelableArrDeserialize, parcelableArrDeserialize.length, o.w(getArrayKClass(aVar)));
        }
        if (x.n(descriptor, SavedStateCodecUtils_androidKt.getPolymorphicParcelableArrayDescriptor())) {
            return (T) ParcelableArraySerializer.INSTANCE.deserialize((e) savedStateDecoder);
        }
        if (x.n(descriptor, SavedStateCodecUtils_androidKt.getParcelableListDescriptor()) || x.n(descriptor, SavedStateCodecUtils_androidKt.getPolymorphicParcelableListDescriptor())) {
            return (T) ParcelableListSerializer.INSTANCE.deserialize((e) savedStateDecoder);
        }
        if (x.n(descriptor, SavedStateCodecUtils_androidKt.getSparseParcelableArrayDescriptor()) || x.n(descriptor, SavedStateCodecUtils_androidKt.getPolymorphicSparseParcelableArrayDescriptor()) || x.n(descriptor, SavedStateCodecUtils_androidKt.getNullablePolymorphicSparseParcelableArrayDescriptor())) {
            return (T) SparseParcelableArraySerializer.INSTANCE.deserialize((e) savedStateDecoder);
        }
        return null;
    }

    private static final c<Object[]> getArrayKClass(a<?> aVar) {
        Object objDeserialize = aVar.deserialize(EmptyArrayDecoder.INSTANCE);
        x.c(objDeserialize);
        Class<?> cls = objDeserialize.getClass();
        int i2 = ar.f48106a;
        return new m(cls);
    }
}
