package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public enum kbv {
    KEYBOARD(true, com.google.android.projection.gearhead.R.string.search_hint),
    VOICE_TRANSCRIPTION(false, com.google.android.projection.gearhead.R.string.search_hint_transcription),
    VOICE_TRANSCRIPTION_ROTARY(false, com.google.android.projection.gearhead.R.string.search_hint_transcription_rotary),
    SEARCH_NOT_PERMITTED(true, com.google.android.projection.gearhead.R.string.search_hint);

    final boolean e;
    final int f;

    kbv(boolean z, int i) {
        this.e = z;
        this.f = i;
    }
}
