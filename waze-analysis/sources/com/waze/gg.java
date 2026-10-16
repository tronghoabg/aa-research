package com.waze;

import com.waze.jni.protos.CopilotMarketplaceMood;
import com.waze.jni.protos.EtaLabelResponse;
import com.waze.jni.protos.GetCurrencyStringResponse;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class gg implements hw {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f24040a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f24041b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f24042c;

    public /* synthetic */ gg(Object obj, Object obj2, int i2) {
        this.f24042c = i2;
        this.f24040a = obj;
        this.f24041b = obj2;
    }

    @Override // com.waze.hw
    public final Object a() {
        switch (this.f24042c) {
            case 0:
                break;
            case 1:
                bc.setMapSkin$lambda$0((bc) this.f24040a, (String) this.f24041b);
                break;
            case 2:
                gh.setMarketplaceMoodProto$lambda$0((gh) this.f24040a, (CopilotMarketplaceMood) this.f24041b);
                break;
            case 3:
                iu.onETALabelGenerated$lambda$0((iu) this.f24040a, (EtaLabelResponse) this.f24041b);
                break;
            case 4:
                iu.UploadProfileImage$lambda$0((iu) this.f24040a, (String) this.f24041b);
                break;
            case 5:
                break;
            case 6:
                iu.venueAddImage$lambda$0((iu) this.f24040a, (String) this.f24041b);
                break;
            case 7:
                break;
            case 8:
                iu.updateClientInfo$lambda$0((iu) this.f24040a, (String) this.f24041b);
                break;
            default:
                iu.onGetCurrencyString$lambda$0((iu) this.f24040a, (GetCurrencyStringResponse) this.f24041b);
                break;
        }
        return null;
    }
}
