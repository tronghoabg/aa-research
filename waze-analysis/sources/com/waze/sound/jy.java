package com.waze.sound;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.ActivityResultLauncher;
import com.waze.google_assistant.SpeechRecognizerActivity;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class jy implements jv {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.sound.f.f f40352a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.google_assistant.aa f40353b;

    /* renamed from: c, reason: collision with root package name */
    private final kotlinx.coroutines.b.k f40354c;

    /* renamed from: d, reason: collision with root package name */
    private ActivityResultLauncher f40355d;

    public jy(com.waze.sound.f.f fVar, com.waze.google_assistant.aa aaVar) {
        h.g.b.x.f(fVar, "voiceSearchStats");
        h.g.b.x.f(aaVar, "googleAssistantManager");
        this.f40352a = fVar;
        this.f40353b = aaVar;
        this.f40354c = kotlinx.coroutines.b.ai.n(new jx(null));
    }

    @Override // com.waze.sound.jv
    public final kotlinx.coroutines.b.k a() {
        return this.f40354c;
    }

    @Override // com.waze.sound.jv
    public final void b(ActivityResultLauncher activityResultLauncher) {
        h.g.b.x.f(activityResultLauncher, "launcher");
        this.f40355d = activityResultLauncher;
    }

    @Override // com.waze.sound.jv
    public final void c(Context context, com.waze.z.a.d.ap apVar) {
        h.g.b.x.f(context, "context");
        h.g.b.x.f(apVar, "voiceSearchType");
        com.waze.z.a.d.ap apVar2 = com.waze.z.a.d.ap.f45939a;
        int iOrdinal = apVar.ordinal();
        if (iOrdinal == 0) {
            this.f40353b.p();
            return;
        }
        if (iOrdinal != 1) {
            throw new h.i();
        }
        if (this.f40353b.B()) {
            com.waze.google_assistant.an.a(context, com.waze.google_assistant.al.f24102c);
            return;
        }
        this.f40352a.a();
        ActivityResultLauncher activityResultLauncher = this.f40355d;
        if (activityResultLauncher != null) {
            Intent intentL = SpeechRecognizerActivity.l(context);
            h.g.b.x.e(intentL, "createIntent(...)");
            activityResultLauncher.launch(intentL);
        }
    }
}
