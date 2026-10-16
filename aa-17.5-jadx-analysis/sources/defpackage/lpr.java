package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import com.google.android.apps.auto.components.media.repository.suggestion.AppBrowserMediaSuggestionPayload;
import com.google.android.apps.auto.components.media.repository.suggestion.MediaSuggestionPlaybackPayload;

/* loaded from: classes2.dex */
public final class lpr implements lpt {
    private final ComponentName a;
    private final llu b;

    public lpr(llu lluVar, ComponentName componentName) {
        this.b = lluVar;
        this.a = componentName;
    }

    @Override // defpackage.lpt
    public final ComponentName a() {
        return this.a;
    }

    @Override // defpackage.lpt
    public final Bitmap b() {
        return this.b.h().O();
    }

    @Override // defpackage.lpt
    public final Uri c() {
        return this.b.h().P();
    }

    @Override // defpackage.lpt
    public final MediaSuggestionPlaybackPayload d() {
        return new AppBrowserMediaSuggestionPayload(this.a, this.b.i());
    }

    @Override // defpackage.lpt
    public final CharSequence e(Context context) {
        return this.b.h().R();
    }

    @Override // defpackage.lpt
    public final CharSequence f(Context context) {
        return this.b.h().S();
    }
}
