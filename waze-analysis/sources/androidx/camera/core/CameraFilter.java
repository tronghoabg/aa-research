package androidx.camera.core;

import androidx.camera.core.impl.Identifier;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface CameraFilter {
    public static final Identifier DEFAULT_ID = Identifier.create(new Object());

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.core.CameraFilter$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
    }

    List<CameraInfo> filter(List<CameraInfo> list);

    Identifier getIdentifier();
}
