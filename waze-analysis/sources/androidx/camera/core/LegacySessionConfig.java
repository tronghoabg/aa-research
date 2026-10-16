package androidx.camera.core;

import com.waze.strings.DisplayStrings;
import h.a.i;
import h.g.b.o;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class LegacySessionConfig extends SessionConfig {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LegacySessionConfig(List<? extends UseCase> list, ViewPort viewPort, List<? extends CameraEffect> list2) {
        super(list, viewPort, list2, null, null, null, false, true, 0, false, null, DisplayStrings.DS_FUTURE_DRIVES_PLAN_TRAFFIC_LABEL, null);
        x.f(list, "useCases");
        x.f(list2, "effects");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public LegacySessionConfig(UseCaseGroup useCaseGroup) {
        x.f(useCaseGroup, "useCaseGroup");
        List<UseCase> useCases = useCaseGroup.getUseCases();
        x.e(useCases, "getUseCases(...)");
        ViewPort viewPort = useCaseGroup.getViewPort();
        List<CameraEffect> effects = useCaseGroup.getEffects();
        x.e(effects, "getEffects(...)");
        this(useCases, viewPort, effects);
    }

    public /* synthetic */ LegacySessionConfig(List list, ViewPort viewPort, List list2, int i2, o oVar) {
        this(list, (i2 & 2) != 0 ? null : viewPort, (i2 & 4) != 0 ? i.h() : list2);
    }
}
