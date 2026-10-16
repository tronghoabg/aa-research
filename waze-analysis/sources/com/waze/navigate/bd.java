package com.waze.navigate;

import com.waze.hw;
import com.waze.jni.protos.VenueData;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class bd implements hw {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f31079a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f31080b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f31081c;

    public /* synthetic */ bd(bt btVar, String str, int i2) {
        this.f31081c = i2;
        this.f31079a = btVar;
        this.f31080b = str;
    }

    @Override // com.waze.hw
    public final Object a() {
        switch (this.f31081c) {
            case 0:
                break;
            case 1:
                bt.convertFavoriteToRecent$lambda$0((bt) this.f31079a, (String) this.f31080b);
                break;
            case 2:
                bt.setMeeting$lambda$0((bt) this.f31079a, (String) this.f31080b);
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                bt.initMeeting$lambda$0((bt) this.f31079a, (String) this.f31080b);
                break;
            case 7:
                break;
            case 8:
                bt.showVenueOnMap$lambda$0((bt) this.f31080b, (VenueData) this.f31079a);
                break;
            case 9:
                bt.removeEventByLocation$lambda$0((bt) this.f31079a, (String) this.f31080b);
                break;
            default:
                eg.setNavigationStartPointVenue$lambda$0((eg) this.f31080b, (VenueData) this.f31079a);
                break;
        }
        return null;
    }

    public /* synthetic */ bd(Object obj, com.google.v.du duVar, int i2) {
        this.f31081c = i2;
        this.f31080b = obj;
        this.f31079a = duVar;
    }
}
