package com.waze;

import android.os.Handler;
import android.os.Message;
import com.waze.navigate.AddressItem;
import com.waze.navigate.DriveToNativeManager;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class hy extends Handler {
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        ((DriveToNativeManager) com.waze.web.r.h(DriveToNativeManager.class)).unsetUpdateHandler(DriveToNativeManager.UH_SEARCH_ADD_RESULT, this);
        NativeManager.getInstance().resetSearchHandler();
        if (message.what == DriveToNativeManager.UH_SEARCH_ADD_RESULT) {
            AddressItem addressItem = (AddressItem) message.getData().getParcelable("address_item");
            if (addressItem.getLongitudeInt() == -1 || addressItem.getLatitudeInt() == -1) {
                return;
            }
            t.l(new hn(this, addressItem, 7));
        }
    }
}
