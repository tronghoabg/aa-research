package androidx.camera.core.impl;

import androidx.camera.core.CameraFilter;
import java.util.Collections;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public class CameraFilters {
    public static final CameraFilter ANY = new CameraFilter() { // from class: androidx.camera.core.impl.CameraFilters$$ExternalSyntheticLambda0
        @Override // androidx.camera.core.CameraFilter
        public /* synthetic */ Identifier getIdentifier() {
            return CameraFilter.DEFAULT_ID;
        }

        @Override // androidx.camera.core.CameraFilter
        public final List filter(List list) {
            return list;
        }
    };
    public static final CameraFilter NONE = new CameraFilter() { // from class: androidx.camera.core.impl.CameraFilters$$ExternalSyntheticLambda1
        @Override // androidx.camera.core.CameraFilter
        public final List filter(List list) {
            return Collections.EMPTY_LIST;
        }

        @Override // androidx.camera.core.CameraFilter
        public /* synthetic */ Identifier getIdentifier() {
            return CameraFilter.DEFAULT_ID;
        }
    };

    private CameraFilters() {
    }

    static /* synthetic */ List lambda$static$0(List list) {
        return list;
    }
}
