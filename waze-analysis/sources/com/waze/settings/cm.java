package com.waze.settings;

import com.waze.hw;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class cm implements hw {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cr f36974a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f36975b;

    public /* synthetic */ cm(cr crVar, int i2) {
        this.f36975b = i2;
        this.f36974a = crVar;
    }

    @Override // com.waze.hw
    public final Object a() {
        switch (this.f36975b) {
            case 0:
                return cr.getCurrentVoiceId$lambda$0(this.f36974a);
            case 1:
                cr.setSearchVoiceAuto$lambda$0(this.f36974a);
                return null;
            case 2:
                return cr.getSearchByVoiceData$lambda$0(this.f36974a);
            case 3:
                return cr.loadGasTypes$lambda$0(this.f36974a);
            case 4:
                return cr.isMarketplaceVoiceCached$lambda$0(this.f36974a);
            case 5:
                return cr.getNotificationPreferences$lambda$0(this.f36974a);
            case 6:
                return cr.isMarketplaceMoodCached$lambda$0(this.f36974a);
            default:
                return cr.getLanguages$lambda$0(this.f36974a);
        }
    }
}
