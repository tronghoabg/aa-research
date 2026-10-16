package kotlinx.serialization.json;

import Sf.e;
import Xf.v;
import org.jetbrains.annotations.NotNull;

@e(with = v.class)
/* loaded from: classes5.dex */
public abstract class d extends b {

    @NotNull
    public static final JsonPrimitive$Companion Companion = new JsonPrimitive$Companion();

    public abstract String a();

    public String toString() {
        return a();
    }
}
