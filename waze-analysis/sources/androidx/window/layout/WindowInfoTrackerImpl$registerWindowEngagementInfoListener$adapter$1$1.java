package androidx.window.layout;

import androidx.window.layout.WindowEngagementInfo;
import h.g.a.p;
import h.g.b.u;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final /* synthetic */ class WindowInfoTrackerImpl$registerWindowEngagementInfoListener$adapter$1$1 extends u implements p<WindowLayoutInfo, WindowEngagementInfo.EngagementMode, WindowEngagementInfo> {
    WindowInfoTrackerImpl$registerWindowEngagementInfoListener$adapter$1$1(Object obj) {
        super(2, obj, WindowInfoTrackerImpl.class, "combineEngagementInfo", "combineEngagementInfo(Landroidx/window/layout/WindowLayoutInfo;Landroidx/window/layout/WindowEngagementInfo$EngagementMode;)Landroidx/window/layout/WindowEngagementInfo;", 0);
    }

    @Override // h.g.a.p
    public final WindowEngagementInfo invoke(WindowLayoutInfo windowLayoutInfo, WindowEngagementInfo.EngagementMode engagementMode) {
        x.f(windowLayoutInfo, "p0");
        x.f(engagementMode, "p1");
        return ((WindowInfoTrackerImpl) this.receiver).combineEngagementInfo(windowLayoutInfo, engagementMode);
    }
}
