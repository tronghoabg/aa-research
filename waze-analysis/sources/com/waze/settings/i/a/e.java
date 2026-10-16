package com.waze.settings.i.a;

import com.waze.ui.af.y;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class e implements g {

    /* renamed from: a, reason: collision with root package name */
    private final y f37405a;

    public e(y yVar) {
        x.f(yVar, "voice");
        this.f37405a = yVar;
    }

    public final y a() {
        return this.f37405a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && x.n(this.f37405a, ((e) obj).f37405a);
    }

    public final int hashCode() {
        return this.f37405a.hashCode();
    }

    public final String toString() {
        return "OpenPromptRecordingActivityToPreviewVoice(voice=" + this.f37405a + ")";
    }
}
