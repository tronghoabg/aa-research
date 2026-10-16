package com.waze.sound.a;

import com.waze.copilot.data.ag;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final ag f39376a;

    /* renamed from: b, reason: collision with root package name */
    private final String f39377b;

    public b(ag agVar, String str) {
        x.f(agVar, "voiceAsset");
        this.f39376a = agVar;
        this.f39377b = str;
    }

    public static /* synthetic */ b c(b bVar, ag agVar, String str, int i2) {
        if ((i2 & 1) != 0) {
            agVar = bVar.f39376a;
        }
        if ((i2 & 2) != 0) {
            str = bVar.f39377b;
        }
        x.f(agVar, "voiceAsset");
        return new b(agVar, str);
    }

    public final ag a() {
        return this.f39376a;
    }

    public final String b() {
        return this.f39377b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return x.n(this.f39376a, bVar.f39376a) && x.n(this.f39377b, bVar.f39377b);
    }

    public final int hashCode() {
        int iHashCode = this.f39376a.hashCode() * 31;
        String str = this.f39377b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "Voice(voiceAsset=" + this.f39376a + ", recordedVoiceId=" + this.f39377b + ")";
    }
}
