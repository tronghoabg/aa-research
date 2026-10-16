package com.waze.e;

import com.waze.R;
import com.waze.bi;
import com.waze.bj;
import com.waze.config.ConfigValues;
import com.waze.cr;
import com.waze.favorites.k;
import com.waze.google_assistant.ah;
import com.waze.google_assistant.d;
import com.waze.google_assistant.e;
import com.waze.navigate.AddressItem;
import com.waze.search.bn;
import com.waze.sound.SoundNativeManager;
import com.waze.sound.fa;
import h.g.b.x;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public abstract class c implements cr {

    /* renamed from: a, reason: collision with root package name */
    private final bj f23622a;

    /* renamed from: b, reason: collision with root package name */
    private final k f23623b;

    /* renamed from: c, reason: collision with root package name */
    private final SoundNativeManager f23624c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.shared_infra.o.a f23625d;

    /* renamed from: e, reason: collision with root package name */
    private final bn f23626e;

    /* renamed from: f, reason: collision with root package name */
    private final ah f23627f;

    public c(bj bjVar, k kVar, SoundNativeManager soundNativeManager, com.waze.shared_infra.o.a aVar, bn bnVar, b bVar, ah ahVar) {
        x.f(bjVar, "deepLinkController");
        x.f(kVar, "favoritesManager");
        x.f(soundNativeManager, "soundNativeManager");
        x.f(aVar, "stringProvider");
        x.f(bnVar, "searchQueryBroadcaster");
        x.f(bVar, "config");
        x.f(ahVar, "googleAssistantStatHelper");
        this.f23622a = bjVar;
        this.f23623b = kVar;
        this.f23624c = soundNativeManager;
        this.f23625d = aVar;
        this.f23626e = bnVar;
        this.f23627f = ahVar;
    }

    static final void i(c cVar, AddressItem addressItem) {
        cVar.k(addressItem, true);
    }

    static final void j(c cVar, AddressItem addressItem) {
        cVar.k(addressItem, false);
    }

    private final void k(AddressItem addressItem, boolean z) {
        if (addressItem != null) {
            this.f23627f.b(e.f24165d, z ? d.f24155a : d.f24159e);
            this.f23622a.b(new bi(addressItem, false));
            return;
        }
        SoundNativeManager soundNativeManager = this.f23624c;
        com.waze.shared_infra.o.a aVar = this.f23625d;
        SoundNativeManager soundNativeManager2 = soundNativeManager;
        String str = String.format(Locale.US, aVar.c(R.string.ANDROID_AUTO_TTS_NO_HOME_WORK, new Object[0]), Arrays.copyOf(new Object[]{aVar.c(true != z ? R.string.WORK : R.string.HOME, new Object[0])}, 1));
        x.e(str, "format(...)");
        fa.playTts$default(soundNativeManager2, str, null, 2, null);
    }

    @Override // com.waze.cr
    public final void c() {
        this.f23623b.b(new a(this, 1));
    }

    @Override // com.waze.cr
    public final void d() {
        this.f23623b.c(new a(this, 0));
    }

    @Override // com.waze.cr
    public final void e(String str, boolean z) {
        x.f(str, "query");
        this.f23626e.b(str, z, true, null);
        this.f23627f.a(e.f24170i);
    }

    @Override // com.waze.cr
    public final boolean f() {
        Boolean boolB = ConfigValues.CONFIG_VALUE_GOOGLE_ASSISTANT_ANDROID_AUTO_FEATURE_ENABLED.b();
        x.e(boolB, "getValue(...)");
        return boolB.booleanValue();
    }

    @Override // com.waze.cr
    public final boolean g() {
        Boolean boolB = ConfigValues.CONFIG_VALUE_GOOGLE_ASSISTANT_UNIFIED_INTENTS_ENABLED.b();
        x.e(boolB, "getValue(...)");
        return boolB.booleanValue();
    }
}
