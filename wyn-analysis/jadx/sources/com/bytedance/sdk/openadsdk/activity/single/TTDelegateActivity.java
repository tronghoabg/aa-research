package com.bytedance.sdk.openadsdk.activity.single;

import Va.M6;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Window;
import android.view.WindowManager;
import com.bytedance.sdk.openadsdk.core.cp;
import com.bytedance.sdk.openadsdk.core.ku;
import com.bytedance.sdk.openadsdk.core.moa.xs;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.core.sy;
import com.bytedance.sdk.openadsdk.core.wk;
import com.bytedance.sdk.openadsdk.core.zjm;
import com.unity3d.services.UnityAdsConstants;
import java.util.Map;

/* loaded from: classes3.dex */
public class TTDelegateActivity extends TTBaseActivity {
    private static final Map<String, xs.uef> moa = M6.v();

    /* renamed from: oa, reason: collision with root package name */
    private Intent f25167oa;
    gzw uef = null;
    private ku yo;

    private void lw() {
        int intExtra = this.f25167oa.getIntExtra("type", 0);
        if (intExtra != 1) {
            if (intExtra != 6) {
                finish();
                return;
            }
            if (this.uef == null) {
                this.uef = cp.uef().uef(cp.uef(this.f25167oa));
            }
            gzw gzwVar = this.uef;
            if (gzwVar == null) {
                finish();
            } else {
                uef(gzwVar.em(), com.bytedance.sdk.openadsdk.tool.uef.uef(this.uef.tkg()), this.f25167oa.getStringExtra("closed_listener_key"), this.uef);
            }
        }
    }

    private void yo() {
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.alpha = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        window.setAttributes(attributes);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!wk.lw()) {
            finish();
            return;
        }
        yo();
        this.f25167oa = getIntent();
        if (sy.uef() == null) {
            sy.oa(this);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ku kuVar = this.yo;
        if (kuVar != null) {
            kuVar.oa();
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (sy.uef() == null) {
            sy.oa(this);
        }
        setIntent(intent);
        this.f25167oa = intent;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void onResume() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        super.onResume();
        ku kuVar = this.yo;
        if ((kuVar == null || ((com.bytedance.sdk.openadsdk.yo.yo) kuVar).uef == null || !((com.bytedance.sdk.openadsdk.yo.yo) kuVar).uef.isShowing()) && this.f25167oa != null) {
            lw();
        }
    }

    public static void uef(gzw gzwVar, String str, xs.uef uefVar) {
        if (gzwVar == null) {
            return;
        }
        Intent intent = new Intent(sy.uef(), (Class<?>) TTDelegateActivity.class);
        intent.addFlags(268435456);
        intent.putExtra("type", 6);
        intent.putExtra("closed_listener_key", str);
        intent.putExtra("meta_index", cp.uef().uef(gzwVar));
        if (uefVar != null) {
            moa.put(str, uefVar);
        }
        com.bytedance.sdk.component.utils.oa.uef(sy.uef(), intent, null);
    }

    public static void uef(gzw gzwVar, String str) {
        uef(gzwVar, str, null);
    }

    private void uef(String str, String str2, final String str3, gzw gzwVar) {
        if (str2 != null && str != null && this.yo == null) {
            com.bytedance.sdk.openadsdk.yo.yo yoVar = new com.bytedance.sdk.openadsdk.yo.yo(this, str, com.bytedance.sdk.openadsdk.tool.uef.uef(str2), gzwVar);
            this.yo = yoVar;
            yoVar.uef(new ku.uef() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTDelegateActivity.1
                @Override // com.bytedance.sdk.openadsdk.core.ku.uef
                public void uef(int i5, String str4) {
                    xs.uef uefVarLw;
                    if (TTDelegateActivity.moa != null && TTDelegateActivity.moa.size() > 0 && !TextUtils.isEmpty(str3)) {
                        xs.uef uefVar = (xs.uef) TTDelegateActivity.moa.get(str3);
                        if (uefVar != null) {
                            uefVar.uef();
                        }
                    } else if (!TextUtils.isEmpty(str3) && (uefVarLw = zjm.oa().lw(str3)) != null) {
                        uefVarLw.uef();
                        zjm.oa().ivm(str3);
                    }
                    TTDelegateActivity.this.uef(str3);
                    TTDelegateActivity.this.finish();
                }

                @Override // com.bytedance.sdk.openadsdk.core.ku.uef
                public void uef() {
                    if (!((com.bytedance.sdk.openadsdk.yo.yo) TTDelegateActivity.this.yo).yo()) {
                        TTDelegateActivity.this.uef(str3);
                        TTDelegateActivity.this.finish();
                    }
                    ((com.bytedance.sdk.openadsdk.yo.yo) TTDelegateActivity.this.yo).uef(false);
                }
            });
        }
        ku kuVar = this.yo;
        if (kuVar != null) {
            kuVar.uef();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uef(String str) {
        Map<String, xs.uef> map = moa;
        if (map == null || TextUtils.isEmpty(str)) {
            return;
        }
        map.remove(str);
        if (com.bytedance.sdk.component.utils.wk.yo()) {
            map.size();
        }
    }
}
