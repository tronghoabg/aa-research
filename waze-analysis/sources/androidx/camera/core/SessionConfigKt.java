package androidx.camera.core;

import androidx.camera.core.SessionConfig;
import h.ab;
import h.g.a.l;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class SessionConfigKt {
    public static final /* synthetic */ SessionConfig sessionConfig(List<? extends UseCase> list, l<? super SessionConfig.Builder, ab> lVar) {
        x.f(list, "useCases");
        x.f(lVar, "block");
        SessionConfig.Builder builder = new SessionConfig.Builder(list);
        lVar.invoke(builder);
        return builder.build();
    }
}
