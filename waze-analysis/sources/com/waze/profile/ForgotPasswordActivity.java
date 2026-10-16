package com.waze.profile;

import android.os.Bundle;
import com.waze.R;
import com.waze.mywaze.MyWazeNativeManager;
import com.waze.web.SimpleWebActivity;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public class ForgotPasswordActivity extends SimpleWebActivity implements com.waze.mywaze.t {
    @Override // com.waze.mywaze.t
    public final void a(String str) {
        v(str);
    }

    @Override // com.waze.web.SimpleWebActivity
    protected final boolean br() {
        return false;
    }

    @Override // com.waze.web.SimpleWebActivity
    public final void n() {
        MyWazeNativeManager.getInstance().getForgotPasswordUrl(this);
    }

    @Override // com.waze.web.SimpleWebActivity, com.waze.ifs.ui.a, com.waze.sharedui.a.e, com.waze.app_nav.hub.af, android.support.v4.app.av, androidx.activity.ComponentActivity, android.support.v4.app.dd, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f45476h.C("ForgotPasswordActivity");
        setRequestedOrientation(1);
        x(com.waze.shared_infra.o.b.a().c(R.string.fp_title, new Object[0]), false);
    }
}
