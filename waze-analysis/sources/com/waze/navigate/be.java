package com.waze.navigate;

import com.waze.navigate.DriveToNativeManager;
import com.waze.navigate.social.EndDriveData;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class be implements com.waze.jni.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h.g.a.l f31082a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f31083b;

    public /* synthetic */ be(h.g.a.l lVar, int i2) {
        this.f31083b = i2;
        this.f31082a = lVar;
    }

    @Override // com.waze.jni.a
    public final void a(Object obj) {
        switch (this.f31083b) {
            case 0:
                this.f31082a.invoke((DriveToNativeManager.AddressItemAppData) obj);
                break;
            case 1:
                this.f31082a.invoke((h.ab) obj);
                break;
            case 2:
                this.f31082a.invoke((h.ab) obj);
                break;
            case 3:
                this.f31082a.invoke((String) obj);
                break;
            case 4:
                this.f31082a.invoke((h.ab) obj);
                break;
            case 5:
                this.f31082a.invoke((h.ab) obj);
                break;
            case 6:
                bt.getRoutingRequestParams$lambda$1(this.f31082a, (byte[]) obj);
                break;
            case 7:
                bt.getRoutingLocationInfo$lambda$1(this.f31082a, (byte[]) obj);
                break;
            case 8:
                this.f31082a.invoke((Product) obj);
                break;
            case 9:
                this.f31082a.invoke((Integer) obj);
                break;
            case 10:
                this.f31082a.invoke((Boolean) obj);
                break;
            case 11:
                bt.getRoutingHeadingData$lambda$1(this.f31082a, (byte[]) obj);
                break;
            case 12:
                this.f31082a.invoke((AddressItem) obj);
                break;
            case 13:
                this.f31082a.invoke((h.ab) obj);
                break;
            case 14:
                this.f31082a.invoke((h.ab) obj);
                break;
            case 15:
                this.f31082a.invoke((EndDriveData) obj);
                break;
            case 16:
                this.f31082a.invoke((h.ab) obj);
                break;
            case 17:
                this.f31082a.invoke((h.ab) obj);
                break;
            case 18:
                bt.getDangerZoneEod$lambda$1(this.f31082a, (byte[]) obj);
                break;
            case 19:
                this.f31082a.invoke((h.ab) obj);
                break;
            default:
                this.f31082a.invoke((AddressItem[]) obj);
                break;
        }
    }
}
