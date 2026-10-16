package androidx.camera.camera2.impl;

import androidx.camera.camera2.pipe.Metadata;
import androidx.camera.camera2.pipe.RequestMetadata;
import androidx.camera.core.impl.TagBundle;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ComboRequestListenerKt {
    public static final boolean containsTag(RequestMetadata requestMetadata, String str, Object obj) {
        x.f(requestMetadata, "<this>");
        x.f(str, "tagKey");
        x.f(obj, "tagValue");
        return x.n(((TagBundle) requestMetadata.getOrDefault((Metadata.Key<Metadata.Key<TagBundle>>) TagsKt.getCAMERAX_TAG_BUNDLE(), (Metadata.Key<TagBundle>) TagBundle.emptyBundle())).getTag(str), obj);
    }
}
