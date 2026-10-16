package androidx.savedstate.serialization;

import android.os.IBinder;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.savedstate.serialization.serializers.CharSequenceArraySerializer;
import androidx.savedstate.serialization.serializers.CharSequenceListSerializer;
import androidx.savedstate.serialization.serializers.CharSequenceSerializer;
import androidx.savedstate.serialization.serializers.DefaultJavaSerializableSerializer;
import androidx.savedstate.serialization.serializers.DefaultParcelableSerializer;
import androidx.savedstate.serialization.serializers.IBinderSerializer;
import androidx.savedstate.serialization.serializers.ParcelableArraySerializer;
import androidx.savedstate.serialization.serializers.ParcelableListSerializer;
import androidx.savedstate.serialization.serializers.SparseParcelableArraySerializer;
import h.g.b.x;
import java.util.List;
import kotlinx.b.a.q;
import kotlinx.b.b.f;
import kotlinx.b.l;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class SavedStateEncoder_androidKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> boolean encodeFormatSpecificTypesOnPlatform(SavedStateEncoder savedStateEncoder, l<? super T> lVar, T t) {
        x.f(savedStateEncoder, "<this>");
        x.f(lVar, "strategy");
        q descriptor = lVar.getDescriptor();
        if (x.n(descriptor, SavedStateCodecUtils_androidKt.getPolymorphicCharSequenceDescriptor())) {
            x.d(t, "null cannot be cast to non-null type kotlin.CharSequence");
            CharSequenceSerializer.INSTANCE.serialize((f) savedStateEncoder, (CharSequence) t);
            return true;
        }
        if (x.n(descriptor, SavedStateCodecUtils_androidKt.getPolymorphicParcelableDescriptor())) {
            x.d(t, "null cannot be cast to non-null type android.os.Parcelable");
            DefaultParcelableSerializer.INSTANCE.serialize((f) savedStateEncoder, (SavedStateEncoder) t);
            return true;
        }
        if (x.n(descriptor, SavedStateCodecUtils_androidKt.getPolymorphicJavaSerializableDescriptor())) {
            x.d(t, "null cannot be cast to non-null type java.io.Serializable");
            DefaultJavaSerializableSerializer.INSTANCE.serialize((f) savedStateEncoder, (SavedStateEncoder) t);
            return true;
        }
        if (x.n(descriptor, SavedStateCodecUtils_androidKt.getPolymorphicIBinderDescriptor())) {
            x.d(t, "null cannot be cast to non-null type android.os.IBinder");
            IBinderSerializer.INSTANCE.serialize((f) savedStateEncoder, (IBinder) t);
            return true;
        }
        if (x.n(descriptor, SavedStateCodecUtils_androidKt.getCharSequenceArrayDescriptor()) || x.n(descriptor, SavedStateCodecUtils_androidKt.getPolymorphicCharSequenceArrayDescriptor())) {
            x.d(t, "null cannot be cast to non-null type kotlin.Array<kotlin.CharSequence>");
            CharSequenceArraySerializer.INSTANCE.serialize((f) savedStateEncoder, (CharSequence[]) t);
            return true;
        }
        if (x.n(descriptor, SavedStateCodecUtils_androidKt.getCharSequenceListDescriptor()) || x.n(descriptor, SavedStateCodecUtils_androidKt.getPolymorphicCharSequenceListDescriptor())) {
            x.d(t, "null cannot be cast to non-null type kotlin.collections.List<kotlin.CharSequence>");
            CharSequenceListSerializer.INSTANCE.serialize((f) savedStateEncoder, (List<? extends CharSequence>) t);
            return true;
        }
        if (x.n(descriptor, SavedStateCodecUtils_androidKt.getParcelableArrayDescriptor()) || x.n(descriptor, SavedStateCodecUtils_androidKt.getPolymorphicParcelableArrayDescriptor())) {
            x.d(t, "null cannot be cast to non-null type kotlin.Array<android.os.Parcelable>");
            ParcelableArraySerializer.INSTANCE.serialize((f) savedStateEncoder, (Parcelable[]) t);
            return true;
        }
        if (x.n(descriptor, SavedStateCodecUtils_androidKt.getParcelableListDescriptor()) || x.n(descriptor, SavedStateCodecUtils_androidKt.getPolymorphicParcelableListDescriptor())) {
            x.d(t, "null cannot be cast to non-null type kotlin.collections.List<android.os.Parcelable>");
            ParcelableListSerializer.INSTANCE.serialize((f) savedStateEncoder, (List<? extends Parcelable>) t);
            return true;
        }
        if (!x.n(descriptor, SavedStateCodecUtils_androidKt.getSparseParcelableArrayDescriptor()) && !x.n(descriptor, SavedStateCodecUtils_androidKt.getPolymorphicSparseParcelableArrayDescriptor()) && !x.n(descriptor, SavedStateCodecUtils_androidKt.getNullablePolymorphicSparseParcelableArrayDescriptor())) {
            return false;
        }
        x.d(t, "null cannot be cast to non-null type android.util.SparseArray<android.os.Parcelable>");
        SparseParcelableArraySerializer.INSTANCE.serialize((f) savedStateEncoder, (SparseArray<Parcelable>) t);
        return true;
    }
}
