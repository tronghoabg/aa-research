package androidx.camera.core.impl;

import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface EncoderProfilesProvider {
    public static final EncoderProfilesProvider EMPTY = new EncoderProfilesProvider() { // from class: androidx.camera.core.impl.EncoderProfilesProvider.1
        @Override // androidx.camera.core.impl.EncoderProfilesProvider
        public EncoderProfilesProxy getAll(int i2) {
            return null;
        }

        @Override // androidx.camera.core.impl.EncoderProfilesProvider
        public boolean hasProfile(int i2) {
            return false;
        }
    };
    public static final List<Integer> QUALITY_HIGH_TO_LOW = DesugarCollections.unmodifiableList(Arrays.asList(13, 10, 8, 11, 6, 5, 4, 9, 3, 7, 2));

    EncoderProfilesProxy getAll(int i2);

    boolean hasProfile(int i2);
}
