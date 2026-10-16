package com.waze.navigate;

import com.waze.hw;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class bj implements hw {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f31109a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f31110b;

    public /* synthetic */ bj(Object obj, int i2) {
        this.f31110b = i2;
        this.f31109a = obj;
    }

    @Override // com.waze.hw
    public final Object a() {
        switch (this.f31110b) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                bt.searchNearbyStations$lambda$0((bt) this.f31109a);
                break;
            case 3:
                bt.setSearchMode$lambda$0((bt) this.f31109a);
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                bt.editFavoritesDone$lambda$0((bt) this.f31109a);
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                bt.unsetMeeting$lambda$0((bt) this.f31109a);
                break;
            case 12:
                break;
            case 13:
                ds.forceLanesEarlyDisplay$lambda$0((ds) this.f31109a);
                break;
            case 14:
                ds.updateNavigationResult$lambda$0((ds) this.f31109a);
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                eg.clearNavigationStartPointImpl$lambda$0((eg) this.f31109a);
                break;
            default:
                ew.postInit$lambda$0((ew) this.f31109a);
                break;
        }
        return null;
    }
}
