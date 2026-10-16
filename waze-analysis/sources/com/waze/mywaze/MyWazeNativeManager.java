package com.waze.mywaze;

import com.google.d.b.an;
import com.waze.NativeManager;
import com.waze.uid.FlowContext;
import com.waze.uid.FlowType;
import com.waze.uid.UidModel;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public class MyWazeNativeManager extends y implements n {
    private static MyWazeNativeManager instance;

    /* JADX INFO: Access modifiers changed from: private */
    public native String getFirstNameNTV();

    /* JADX INFO: Access modifiers changed from: private */
    public native String getForgotPasswordUrlNTV();

    public static MyWazeNativeManager getInstance() {
        MyWazeNativeManager myWazeNativeManager = instance;
        if (myWazeNativeManager != null) {
            return myWazeNativeManager;
        }
        MyWazeNativeManager myWazeNativeManager2 = new MyWazeNativeManager();
        instance = myWazeNativeManager2;
        return myWazeNativeManager2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public native String getLastNameNTV();

    private native String getLastShareDriveURLNTV();

    /* JADX INFO: Access modifiers changed from: private */
    public native String getNickNameNTV();

    /* JADX INFO: Access modifiers changed from: private */
    public native String getPasswordNTV();

    /* JADX INFO: Access modifiers changed from: private */
    public native String getSocialMoodNTV();

    private void getUrl(t tVar) {
        NativeManager.Post(new p(this, tVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public native String getUserNameNTV();

    public static void setTestInstance(MyWazeNativeManager myWazeNativeManager) {
        instance = myWazeNativeManager;
    }

    public String GetLastShareURL() {
        return getLastShareDriveURLNTV();
    }

    public void addEmailId(String str) {
        FlowType flowType = FlowType.ADD_ID;
        h.g.b.x.f(flowType, "flowType");
        UidModel uidModelD = com.waze.uid.r.d(flowType, FlowContext.OTHER);
        if (!an.f(str)) {
            uidModelD.getEmailParameters().setEmailAddress(str);
            uidModelD.setFlowContext(FlowContext.WAZE_ONBOARDING);
        }
        com.waze.uid.b.ab.y().A(uidModelD);
    }

    public void getForgotPasswordUrl(t tVar) {
        getUrl(tVar);
    }

    public void getMyWazeData(s sVar) {
        NativeManager.Post(new o(this, sVar));
    }

    public native int getPointsNTV();

    public native String getRealUserNameNTV();

    public native String getUserIdNTV();

    public native String getUserImageUrlNTV();

    public native void initNTV();

    protected native boolean isGuestUserNTV();

    protected native boolean isInvisibleNTV();

    protected native boolean isVerifiedUrlNTV(String str);

    public void launchMyWaze() {
        NativeManager.Post(new q(this));
    }

    public void mood_dialog_show() {
        com.waze.t.l(new r(this, 1, (byte[]) null));
    }

    protected native void setInvisibleNTV(boolean z);

    protected native void setNamesNTV(String str, String str2, String str3, String str4, String str5);

    public void showMyWaze() {
        com.waze.t.l(new r(this, 2, (char[]) null));
    }

    public void showRegister() {
        com.waze.t.l(new r(this, 0));
    }
}
