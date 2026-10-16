package androidx.media3.common.text;

import android.os.Bundle;
import androidx.media3.common.util.Util;
import com.google.d.b.an;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class VoiceSpan {
    private static final String FIELD_NAME = Util.intToStringMaxRadix(0);
    public final String name;

    public VoiceSpan(String str) {
        this.name = str;
    }

    public static VoiceSpan fromBundle(Bundle bundle) {
        String string = bundle.getString(FIELD_NAME);
        an.B(string);
        return new VoiceSpan(string);
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putString(FIELD_NAME, this.name);
        return bundle;
    }
}
