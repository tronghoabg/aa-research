package com.waze.uid.state_impl.add_id;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class AddIdParameters extends com.waze.uid.e.d {
    public boolean addEmailToExistingAccount;
    public boolean shouldExitApp;

    @Override // com.waze.uid.e.d
    public void reset() {
        this.addEmailToExistingAccount = false;
        this.shouldExitApp = false;
    }
}
