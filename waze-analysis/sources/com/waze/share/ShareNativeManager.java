package com.waze.share;

import com.waze.user.FriendUserData;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class ShareNativeManager extends m {
    public static final int $stable = 0;

    public final native long getEtaInEpochTimeNTV();

    public final native FriendUserData getFriendFromMeetingNTV(String str);

    public final native void initNativeLayerNTV();

    public final native boolean isMetricUnitsNTV();
}
