package com.google.android.apps.auto.components.permission.prompt;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.projection.gearhead.R;
import defpackage.ebf;
import defpackage.etb;
import defpackage.lgv;
import defpackage.mdy;
import defpackage.mki;
import defpackage.rrc;
import defpackage.woy;
import defpackage.ype;
import defpackage.yph;
import defpackage.yxy;
import defpackage.yzy;
import defpackage.yzz;

/* loaded from: classes2.dex */
public class PermissionPromptPhoneActivity extends Activity {
    private static final yph a = yph.c("GH.PrmssnPrmptPhnActvty");

    @Override // android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.permission_prompt_phone_activity);
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        for (int i2 = 0; i2 < strArr.length; i2++) {
            ((ype) a.l().ai(4802)).M("onRequestPermissionsResult: permission %s was %s", strArr[i2], iArr[i2] == 0 ? "granted" : "denied");
        }
        etb etbVarA = etb.a(mki.a.c);
        mdy.a();
        etbVarA.d(new Intent("PermissionCarPrompt_intent_filter_action"));
        for (int i3 : iArr) {
            if (i3 == -1) {
                ebf.j().F(rrc.h(yxy.GEARHEAD, yzz.PERMISSION_PHONE_PROMPT, yzy.nP).l());
            } else {
                if (i3 != 0) {
                    throw new IllegalArgumentException(i3 + " is not a valid permission result");
                }
                ebf.j().F(rrc.h(yxy.GEARHEAD, yzz.PERMISSION_PHONE_PROMPT, yzy.nO).l());
            }
        }
        finish();
    }

    @Override // android.app.Activity
    protected final void onResume() {
        super.onResume();
        mdy.a();
        Intent intent = getIntent();
        ((ype) mdy.a.l().ai((char) 4801)).u("getPermissionFromPhoneActivityLaunchIntent");
        ComponentName component = intent.getComponent();
        component.getClass();
        woy.N(component.getClassName().equals(PermissionPromptPhoneActivity.class.getName()));
        String stringExtra = intent.getStringExtra("permission_key");
        stringExtra.getClass();
        lgv.c().d(this, stringExtra);
    }
}
