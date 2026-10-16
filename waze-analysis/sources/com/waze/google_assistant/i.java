package com.waze.google_assistant;

import android.os.Handler;
import android.os.Message;
import com.waze.cr;
import com.waze.modules.navigation.bp;
import com.waze.navigate.AddressItem;
import com.waze.navigate.DriveToNativeManager;
import com.waze.strings.DisplayStrings;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class i extends Handler {

    /* renamed from: a, reason: collision with root package name */
    private final DriveToNativeManager f24195a;

    /* renamed from: b, reason: collision with root package name */
    private final bp f24196b;

    /* renamed from: c, reason: collision with root package name */
    private final cr f24197c;

    /* renamed from: d, reason: collision with root package name */
    private final String f24198d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f24199e;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f24200f;

    public i(DriveToNativeManager driveToNativeManager, bp bpVar, cr crVar, String str, boolean z, com.waze.shared_infra.i.e eVar) {
        h.g.b.x.f(driveToNativeManager, "driveToNativeManager");
        h.g.b.x.f(bpVar, "startNavigationCoordinatorFactory");
        h.g.b.x.f(crVar, "helper");
        h.g.b.x.f(eVar, "logger");
        this.f24195a = driveToNativeManager;
        this.f24196b = bpVar;
        this.f24197c = crVar;
        this.f24198d = str;
        this.f24199e = z;
        this.f24200f = eVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        h.g.b.x.f(message, "message");
        int i2 = message.what;
        int i3 = DriveToNativeManager.UH_SEARCH_ADD_RESULT;
        if (i2 == i3) {
            this.f24195a.unsetUpdateHandler(i3, this);
            AddressItem addressItem = (AddressItem) message.getData().getParcelable("address_item");
            if (addressItem != null && addressItem.hasLocation()) {
                this.f24196b.b(new com.waze.modules.navigation.ao(com.waze.modules.navigation.ah.o, new com.waze.modules.navigation.ai(addressItem), null, false, null, null, false, null, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_ENDPOINT_NEW_USER_5));
                return;
            }
            String str = this.f24198d;
            String str2 = str;
            if (str2 == null || str2.length() == 0) {
                this.f24200f.g("can't continue: couldn't find search results from DriveToNativeManager and the fallback search query is null/empty");
            } else {
                this.f24197c.e(str, this.f24199e);
            }
        }
    }
}
