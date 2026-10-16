package com.waze.settings.i.a;

import com.waze.ui.af.y;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class d implements g {

    /* renamed from: a, reason: collision with root package name */
    private final y f37404a;

    public d(y yVar) {
        x.f(yVar, "voice");
        this.f37404a = yVar;
    }

    public final y a() {
        return this.f37404a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && x.n(this.f37404a, ((d) obj).f37404a);
    }

    public final int hashCode() {
        return this.f37404a.hashCode();
    }

    public final String toString() {
        return "OpenPromptRecordingActivityToEditVoice(voice=" + this.f37404a + ")";
    }
}
