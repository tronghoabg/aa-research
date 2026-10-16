package com.waze.settings;

import com.waze.hw;
import com.waze.jni.protos.settings.CopilotMarketplaceVoice;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class co implements hw {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f36978a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f36979b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f36980c;

    public /* synthetic */ co(cr crVar, CopilotMarketplaceVoice copilotMarketplaceVoice, int i2) {
        this.f36980c = i2;
        this.f36978a = crVar;
        this.f36979b = copilotMarketplaceVoice;
    }

    @Override // com.waze.hw
    public final Object a() {
        int i2 = this.f36980c;
        if (i2 == 0) {
            cr.setMarketplaceVoiceProto$lambda$0((cr) this.f36978a, (CopilotMarketplaceVoice) this.f36979b);
            return null;
        }
        if (i2 == 1) {
            cr.setSearchVoice$lambda$0((cr) this.f36979b, (String) this.f36978a);
            return null;
        }
        Object obj = this.f36978a;
        if (i2 != 2) {
            return cr.isMarketplaceVoice$lambda$0((cr) this.f36979b, (String) obj);
        }
        cr.setLanguage$lambda$0((cr) this.f36979b, (String) obj);
        return null;
    }

    public /* synthetic */ co(cr crVar, String str, int i2) {
        this.f36980c = i2;
        this.f36979b = crVar;
        this.f36978a = str;
    }
}
