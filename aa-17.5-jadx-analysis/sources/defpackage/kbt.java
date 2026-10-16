package defpackage;

import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public enum kbt {
    KEYBOARD(true, R.string.search_hint),
    VOICE_TRANSCRIPTION(false, R.string.search_hint_transcription),
    VOICE_TRANSCRIPTION_ROTARY(false, R.string.search_hint_transcription_rotary),
    SEARCH_NOT_PERMITTED(true, R.string.search_hint);

    final boolean e;
    final int f;

    kbt(boolean z, int i) {
        this.e = z;
        this.f = i;
    }
}
