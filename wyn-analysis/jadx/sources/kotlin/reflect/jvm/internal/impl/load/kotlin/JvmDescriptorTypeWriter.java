package kotlin.reflect.jvm.internal.impl.load.kotlin;

import Bf.r;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes5.dex */
public class JvmDescriptorTypeWriter<T> {

    @Nullable
    private T jvmCurrentType;
    private int jvmCurrentTypeArrayLevel;

    @NotNull
    private final JvmTypeFactory<T> jvmTypeFactory;

    public void writeArrayEnd() {
    }

    public void writeArrayType() {
        if (this.jvmCurrentType == null) {
            this.jvmCurrentTypeArrayLevel++;
        }
    }

    public void writeClass(@NotNull T objectType) {
        AbstractC3340k.e(objectType, "objectType");
        writeJvmTypeAsIs(objectType);
    }

    public final void writeJvmTypeAsIs(@NotNull T type) {
        AbstractC3340k.e(type, "type");
        if (this.jvmCurrentType == null) {
            if (this.jvmCurrentTypeArrayLevel > 0) {
                type = this.jvmTypeFactory.createFromString(r.g0("[", this.jvmCurrentTypeArrayLevel) + this.jvmTypeFactory.toString(type));
            }
            this.jvmCurrentType = type;
        }
    }

    public void writeTypeVariable(@NotNull Name name, @NotNull T type) {
        AbstractC3340k.e(name, "name");
        AbstractC3340k.e(type, "type");
        writeJvmTypeAsIs(type);
    }
}
