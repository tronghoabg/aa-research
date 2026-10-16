package com.waze;

import com.waze.favorites.AddHomeWorkActivity;
import com.waze.jni.protos.planned_drive.FetchPlannedDriveTimeResponse;
import com.waze.jni.protos.planned_drive.LoadPlannedDriveOptionsResponse;
import com.waze.menus.SideMenuAutoCompleteRecycler;
import com.waze.navigate.AddressItem;
import com.waze.navigate.AutocompleteSearchActivity;
import com.waze.planned_drive.PlannedDriveFragment;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class il implements com.waze.jni.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f24621a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f24622b;

    public /* synthetic */ il(Object obj, int i2) {
        this.f24622b = i2;
        this.f24621a = obj;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v10, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v11, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v12, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v13, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v14, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9, types: [h.g.a.l, java.lang.Object] */
    @Override // com.waze.jni.a
    public final void a(Object obj) {
        switch (this.f24622b) {
            case 0:
                this.f24621a.invoke((h.ab) obj);
                break;
            case 1:
                this.f24621a.invoke((h.ab) obj);
                break;
            case 2:
                this.f24621a.invoke((h.ab) obj);
                break;
            case 3:
                this.f24621a.invoke((Boolean) obj);
                break;
            case 4:
                this.f24621a.invoke((h.ab) obj);
                break;
            case 5:
                this.f24621a.invoke((h.ab) obj);
                break;
            case 6:
                this.f24621a.invoke((h.ab) obj);
                break;
            case 7:
                this.f24621a.invoke((Boolean) obj);
                break;
            case 8:
                this.f24621a.invoke((h.ab) obj);
                break;
            case 9:
                iu.venueProviderGetCategoryGroups$lambda$1(this.f24621a, (byte[]) obj);
                break;
            case 10:
                this.f24621a.invoke((h.ab) obj);
                break;
            case 11:
                this.f24621a.invoke((h.ab) obj);
                break;
            case 12:
                this.f24621a.invoke((h.ab) obj);
                break;
            case 13:
                this.f24621a.invoke((h.ab) obj);
                break;
            case 14:
                AddHomeWorkActivity.m((AddHomeWorkActivity) this.f24621a, (AddressItem) obj);
                break;
            case 15:
                AddHomeWorkActivity.n((AddHomeWorkActivity) this.f24621a, (AddressItem) obj);
                break;
            case 16:
                ((SideMenuAutoCompleteRecycler) this.f24621a).ac = (AddressItem[]) obj;
                break;
            case 17:
                AutocompleteSearchActivity.l((AutocompleteSearchActivity) this.f24621a, (AddressItem[]) obj);
                break;
            case 18:
                new com.waze.mywaze.f(this.f24621a, 17).onClick(null);
                break;
            case 19:
                PlannedDriveFragment.g((PlannedDriveFragment) this.f24621a, (LoadPlannedDriveOptionsResponse) obj);
                break;
            default:
                FetchPlannedDriveTimeResponse fetchPlannedDriveTimeResponse = (FetchPlannedDriveTimeResponse) obj;
                if (fetchPlannedDriveTimeResponse != null) {
                    com.waze.planned_drive.ay.v((com.waze.planned_drive.ay) this.f24621a, fetchPlannedDriveTimeResponse);
                    break;
                }
                break;
        }
    }
}
