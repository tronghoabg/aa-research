package com.waze.trip_overview.views.trip_details_container;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class j implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TripOverviewDetailsBottomSheet f41569a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f41570b;

    public /* synthetic */ j(TripOverviewDetailsBottomSheet tripOverviewDetailsBottomSheet, int i2) {
        this.f41570b = i2;
        this.f41569a = tripOverviewDetailsBottomSheet;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f41570b;
        TripOverviewDetailsBottomSheet tripOverviewDetailsBottomSheet = this.f41569a;
        if (i2 != 0) {
            TripOverviewDetailsBottomSheet.i(tripOverviewDetailsBottomSheet);
        } else {
            TripOverviewDetailsBottomSheet.d(tripOverviewDetailsBottomSheet);
        }
    }
}
