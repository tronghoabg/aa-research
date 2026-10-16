package androidx.camera.camera2.impl;

import androidx.camera.camera2.pipe.Metadata;
import androidx.camera.core.impl.TagBundle;
import h.g.b.ar;
import h.g.b.m;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class TagsKt {
    private static final Metadata.Key<TagBundle> CAMERAX_TAG_BUNDLE;
    private static final Metadata.Key<Integer> USE_CASE_CAMERA_STATE_CUSTOM_TAG;

    static {
        Metadata.Key.Companion companion = Metadata.Key.Companion;
        int i2 = ar.f48106a;
        CAMERAX_TAG_BUNDLE = companion.create("camerax.tag_bundle", new m(TagBundle.class));
        USE_CASE_CAMERA_STATE_CUSTOM_TAG = Metadata.Key.Companion.create("use_case_camera_state.tag", new m(Integer.class));
    }

    public static final Metadata.Key<TagBundle> getCAMERAX_TAG_BUNDLE() {
        return CAMERAX_TAG_BUNDLE;
    }

    public static final Metadata.Key<Integer> getUSE_CASE_CAMERA_STATE_CUSTOM_TAG() {
        return USE_CASE_CAMERA_STATE_CUSTOM_TAG;
    }
}
