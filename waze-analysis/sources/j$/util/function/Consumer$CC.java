package j$.util.function;

import j$.nio.file.z;
import j$.util.Objects;
import java.util.function.Consumer;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* renamed from: j$.util.function.Consumer$-CC, reason: invalid class name */
/* loaded from: classes10.dex */
public final /* synthetic */ class Consumer$CC {
    public static Consumer $default$andThen(Consumer consumer, Consumer consumer2) {
        Objects.requireNonNull(consumer2);
        return new z(4, consumer, consumer2);
    }
}
