package androidx.savedstate.serialization;

import android.os.IBinder;
import android.os.Parcelable;
import androidx.savedstate.serialization.serializers.CharSequenceSerializer;
import androidx.savedstate.serialization.serializers.DefaultParcelableSerializer;
import androidx.savedstate.serialization.serializers.SparseArraySerializer;
import h.g.b.ar;
import h.g.b.m;
import java.io.Serializable;
import kotlinx.b.a.b;
import kotlinx.b.a.q;
import kotlinx.b.f;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class SavedStateCodecUtils_androidKt {
    private static final q charSequenceArrayDescriptor;
    private static final q charSequenceListDescriptor;
    private static final q nullablePolymorphicSparseParcelableArrayDescriptor;
    private static final q parcelableArrayDescriptor;
    private static final q parcelableListDescriptor;
    private static final q polymorphicCharSequenceArrayDescriptor;
    private static final q polymorphicCharSequenceDescriptor;
    private static final q polymorphicCharSequenceListDescriptor;
    private static final q polymorphicIBinderDescriptor;
    private static final q polymorphicJavaSerializableDescriptor;
    private static final q polymorphicParcelableArrayDescriptor;
    private static final q polymorphicParcelableDescriptor;
    private static final q polymorphicParcelableListDescriptor;
    private static final q polymorphicSparseParcelableArrayDescriptor;
    private static final q sparseParcelableArrayDescriptor;

    static {
        int i2 = ar.f48106a;
        polymorphicCharSequenceDescriptor = new f(new m(CharSequence.class)).getDescriptor();
        polymorphicParcelableDescriptor = new f(new m(Parcelable.class)).getDescriptor();
        polymorphicJavaSerializableDescriptor = new f(new m(Serializable.class)).getDescriptor();
        polymorphicIBinderDescriptor = new f(new m(IBinder.class)).getDescriptor();
        parcelableArrayDescriptor = b.c(new m(Parcelable.class), DefaultParcelableSerializer.INSTANCE).getDescriptor();
        polymorphicParcelableArrayDescriptor = b.c(new m(Parcelable.class), new f(new m(Parcelable.class))).getDescriptor();
        parcelableListDescriptor = b.i(DefaultParcelableSerializer.INSTANCE).getDescriptor();
        polymorphicParcelableListDescriptor = b.i(new f(new m(Parcelable.class))).getDescriptor();
        charSequenceArrayDescriptor = b.c(new m(CharSequence.class), CharSequenceSerializer.INSTANCE).getDescriptor();
        polymorphicCharSequenceArrayDescriptor = b.c(new m(CharSequence.class), new f(new m(CharSequence.class))).getDescriptor();
        charSequenceListDescriptor = b.i(CharSequenceSerializer.INSTANCE).getDescriptor();
        polymorphicCharSequenceListDescriptor = b.i(new f(new m(CharSequence.class))).getDescriptor();
        sparseParcelableArrayDescriptor = new SparseArraySerializer(DefaultParcelableSerializer.INSTANCE).getDescriptor();
        polymorphicSparseParcelableArrayDescriptor = new SparseArraySerializer(new f(new m(Parcelable.class))).getDescriptor();
        nullablePolymorphicSparseParcelableArrayDescriptor = new SparseArraySerializer(b.l(new f(new m(Parcelable.class)))).getDescriptor();
    }

    public static final q getCharSequenceArrayDescriptor() {
        return charSequenceArrayDescriptor;
    }

    public static /* synthetic */ void getCharSequenceArrayDescriptor$annotations() {
    }

    public static final q getCharSequenceListDescriptor() {
        return charSequenceListDescriptor;
    }

    public static final q getNullablePolymorphicSparseParcelableArrayDescriptor() {
        return nullablePolymorphicSparseParcelableArrayDescriptor;
    }

    public static final q getParcelableArrayDescriptor() {
        return parcelableArrayDescriptor;
    }

    public static /* synthetic */ void getParcelableArrayDescriptor$annotations() {
    }

    public static final q getParcelableListDescriptor() {
        return parcelableListDescriptor;
    }

    public static final q getPolymorphicCharSequenceArrayDescriptor() {
        return polymorphicCharSequenceArrayDescriptor;
    }

    public static /* synthetic */ void getPolymorphicCharSequenceArrayDescriptor$annotations() {
    }

    public static final q getPolymorphicCharSequenceDescriptor() {
        return polymorphicCharSequenceDescriptor;
    }

    public static final q getPolymorphicCharSequenceListDescriptor() {
        return polymorphicCharSequenceListDescriptor;
    }

    public static final q getPolymorphicIBinderDescriptor() {
        return polymorphicIBinderDescriptor;
    }

    public static final q getPolymorphicJavaSerializableDescriptor() {
        return polymorphicJavaSerializableDescriptor;
    }

    public static final q getPolymorphicParcelableArrayDescriptor() {
        return polymorphicParcelableArrayDescriptor;
    }

    public static /* synthetic */ void getPolymorphicParcelableArrayDescriptor$annotations() {
    }

    public static final q getPolymorphicParcelableDescriptor() {
        return polymorphicParcelableDescriptor;
    }

    public static final q getPolymorphicParcelableListDescriptor() {
        return polymorphicParcelableListDescriptor;
    }

    public static final q getPolymorphicSparseParcelableArrayDescriptor() {
        return polymorphicSparseParcelableArrayDescriptor;
    }

    public static final q getSparseParcelableArrayDescriptor() {
        return sparseParcelableArrayDescriptor;
    }
}
