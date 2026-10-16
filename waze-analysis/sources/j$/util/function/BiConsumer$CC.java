package j$.util.function;

import j$.nio.file.z;
import j$.util.Objects;
import java.util.function.BiConsumer;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* renamed from: j$.util.function.BiConsumer$-CC, reason: invalid class name */
/* loaded from: classes10.dex */
public final /* synthetic */ class BiConsumer$CC {
    public static BiConsumer $default$andThen(BiConsumer biConsumer, BiConsumer biConsumer2) {
        Objects.requireNonNull(biConsumer2);
        return new z(2, biConsumer, biConsumer2);
    }
}
