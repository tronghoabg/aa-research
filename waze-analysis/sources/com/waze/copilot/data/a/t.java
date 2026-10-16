package com.waze.copilot.data.a;

import com.waze.MoodManager;
import com.waze.gh;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class t implements s {

    /* renamed from: a, reason: collision with root package name */
    private final MoodManager f22938a;

    public t(MoodManager moodManager) {
        x.f(moodManager, "moodManager");
        this.f22938a = moodManager;
    }

    @Override // com.waze.copilot.data.a.s
    public final String a() {
        String wazerMood = this.f22938a.getWazerMood();
        x.e(wazerMood, "getWazerMood(...)");
        return wazerMood;
    }

    @Override // com.waze.copilot.data.a.s
    public final void b(boolean z) {
        gh.marketplaceMoodRestorePrevious$default(this.f22938a, z, null, 2, null);
    }

    @Override // com.waze.copilot.data.a.s
    public final void c(String str, boolean z) {
        x.f(str, "moodId");
        this.f22938a.setWazerMood(str, true, z);
    }
}
