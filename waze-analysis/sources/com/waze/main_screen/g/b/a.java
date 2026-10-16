package com.waze.main_screen.g.b;

import com.waze.strings.DisplayStrings;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f26348a;

    /* renamed from: b, reason: collision with root package name */
    public final float f26349b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f26350c;

    /* renamed from: d, reason: collision with root package name */
    public final float f26351d;

    /* renamed from: e, reason: collision with root package name */
    public final float f26352e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f26353f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f26354g;

    /* renamed from: h, reason: collision with root package name */
    public final int f26355h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f26356i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f26357j = false;

    /* renamed from: k, reason: collision with root package name */
    public final int f26358k;

    public a(int i2, float f2, boolean z, float f3, float f4, boolean z2, boolean z3, int i3, boolean z4, int i4) {
        this.f26348a = i2;
        this.f26349b = f2;
        this.f26350c = z;
        this.f26351d = f3;
        this.f26352e = f4;
        this.f26353f = z2;
        this.f26354g = z3;
        this.f26355h = i3;
        this.f26356i = z4;
        this.f26358k = i4;
    }

    public static /* synthetic */ a g(a aVar, int i2, float f2, boolean z, float f3, float f4, boolean z2, boolean z3, int i3, boolean z4, int i4, int i5) {
        if ((i5 & 1) != 0) {
            i2 = aVar.f26348a;
        }
        int i6 = i2;
        if ((i5 & 2) != 0) {
            f2 = aVar.f26349b;
        }
        float f5 = f2;
        if ((i5 & 4) != 0) {
            z = aVar.f26350c;
        }
        boolean z5 = z;
        if ((i5 & 8) != 0) {
            f3 = aVar.f26351d;
        }
        return new a(i6, f5, z5, f3, (i5 & 16) != 0 ? aVar.f26352e : f4, (i5 & 32) != 0 ? aVar.f26353f : z2, (i5 & 64) != 0 ? aVar.f26354g : z3, (i5 & 128) != 0 ? aVar.f26355h : i3, (i5 & 256) != 0 ? aVar.f26356i : z4, (i5 & 1024) != 0 ? aVar.f26358k : i4);
    }

    public final a a(float f2) {
        return g(this, 0, 0.0f, false, f2, 0.0f, false, false, 0, false, 0, DisplayStrings.DS_AUDIO_PANEL_OPEN_APP);
    }

    public final a b(boolean z) {
        return g(this, 0, 0.0f, false, 0.0f, 0.0f, z, false, 0, false, 0, 2015);
    }

    public final a c(float f2) {
        return g(this, 0, f2, false, 0.0f, 0.0f, false, false, 0, false, 0, DisplayStrings.DS_AUDIO_PANEL_CLOSE_PLAYLIST_LIST);
    }

    public final a d(int i2) {
        return g(this, 0, 0.0f, false, 0.0f, 0.0f, false, false, i2, false, 0, DisplayStrings.DS_CUSTOM_PROMPT_EXIT_RIGHT);
    }

    public final a e(boolean z) {
        return g(this, 0, 0.0f, z, 0.0f, 0.0f, false, false, 0, false, 0, 2043);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f26348a != aVar.f26348a || Float.compare(this.f26349b, aVar.f26349b) != 0 || this.f26350c != aVar.f26350c || Float.compare(this.f26351d, aVar.f26351d) != 0 || Float.compare(this.f26352e, aVar.f26352e) != 0 || this.f26353f != aVar.f26353f || this.f26354g != aVar.f26354g || this.f26355h != aVar.f26355h || this.f26356i != aVar.f26356i) {
            return false;
        }
        boolean z = aVar.f26357j;
        return this.f26358k == aVar.f26358k;
    }

    public final a f(boolean z) {
        return g(this, 0, 0.0f, false, 0.0f, 0.0f, false, z, 0, false, 0, DisplayStrings.DS_VOICE_PROMPTS_SHARE_DISCLAIMER_TITLE);
    }

    public final int hashCode() {
        int iFloatToIntBits = (((((((this.f26348a * 31) + Float.floatToIntBits(this.f26349b)) * 31) + a.a.a(this.f26350c)) * 31) + Float.floatToIntBits(this.f26351d)) * 31) + Float.floatToIntBits(this.f26352e);
        boolean z = this.f26356i;
        return (((((((((((iFloatToIntBits * 31) + a.a.a(this.f26353f)) * 31) + a.a.a(this.f26354g)) * 31) + this.f26355h) * 31) + a.a.a(z)) * 31) + a.a.a(false)) * 31) + this.f26358k;
    }

    public final String toString() {
        return "SpeedometerState(mLastSpeed=" + this.f26348a + ", mLastSweep=" + this.f26349b + ", mShouldStop=" + this.f26350c + ", mColorFrom=" + this.f26351d + ", mColorTo=" + this.f26352e + ", mFirstOver=" + this.f26353f + ", mWarningShown=" + this.f26354g + ", mMovingColor=" + this.f26355h + ", mColorFaster=" + this.f26356i + ", mSpeedometerShownOnce=false, mCurrentMaxSpeedRoad=" + this.f26358k + ")";
    }
}
