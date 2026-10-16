package com.waze.share;

import com.waze.NativeManager;
import com.waze.hw;
import com.waze.user.FriendUserData;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class m {
    public static final int $stable = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void getFriendFromMeeting$default(m mVar, String str, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFriendFromMeeting");
        }
        if ((i2 & 2) != 0) {
            lVar = null;
        }
        mVar.getFriendFromMeeting(str, lVar);
    }

    static final FriendUserData getFriendFromMeeting$lambda$0(m mVar, String str) {
        h.g.b.x.d(mVar, "null cannot be cast to non-null type com.waze.share.ShareNativeManager");
        return ((ShareNativeManager) mVar).getFriendFromMeetingNTV(str);
    }

    public long getEtaInEpochTime() {
        return ((ShareNativeManager) this).getEtaInEpochTimeNTV();
    }

    public void getFriendFromMeeting(final String str, final h.g.a.l<? super FriendUserData, h.ab> lVar) {
        NativeManager.runNativeTask(new hw() { // from class: com.waze.share.k
            @Override // com.waze.hw
            public final Object a() {
                return m.getFriendFromMeeting$lambda$0(this.f37716a, str);
            }
        }, lVar != null ? new com.waze.jni.a() { // from class: com.waze.share.l
            @Override // com.waze.jni.a
            public final void a(Object obj) {
                lVar.invoke((FriendUserData) obj);
            }
        } : null);
    }

    public boolean isMetricUnits() {
        return ((ShareNativeManager) this).isMetricUnitsNTV();
    }

    public final void getFriendFromMeeting(String str) {
        getFriendFromMeeting$default(this, str, null, 2, null);
    }
}
