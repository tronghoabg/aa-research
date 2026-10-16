package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public abstract class p8 {
    public static j5 a(Spliterator spliterator, boolean z) {
        Objects.requireNonNull(spliterator);
        int i2 = j7.f50471f;
        int iCharacteristics = spliterator.characteristics();
        return new j5(spliterator, ((iCharacteristics & 4) == 0 || spliterator.getComparator() == null) ? i2 & iCharacteristics : i2 & iCharacteristics & (-5), z);
    }
}
