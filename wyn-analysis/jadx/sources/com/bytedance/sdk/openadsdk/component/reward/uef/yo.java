package com.bytedance.sdk.openadsdk.component.reward.uef;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.sdk.component.utils.dhk;
import com.bytedance.sdk.openadsdk.core.cp;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import j$.util.Objects;

/* loaded from: classes3.dex */
public class yo {
    public static void uef(oa oaVar, Intent intent, Bundle bundle) {
        uef(intent, oaVar);
        uef(bundle, oaVar);
    }

    public static void uef(com.bytedance.sdk.openadsdk.component.reward.yo.oa oaVar, Intent intent, Bundle bundle) {
        uef(intent, oaVar);
        uef(bundle, oaVar);
    }

    public static gzw uef(Intent intent, Bundle bundle, com.bytedance.sdk.openadsdk.component.reward.yo.lw lwVar) {
        com.bytedance.sdk.openadsdk.core.model.uef uefVarOa = cp.uef().oa(cp.uef(intent));
        gzw gzwVarZjm = uefVarOa != null ? uefVarOa.zjm() : null;
        if (lwVar != null) {
            lwVar.uef(bundle);
        }
        if (bundle != null) {
            try {
                gzwVarZjm = cp.uef().uef(bundle.getInt("meta_index", -1));
                Objects.toString(gzwVarZjm);
            } catch (Throwable th) {
                dhk.uef("TTAD.RFDM", "", th);
            }
        }
        if (gzwVarZjm != null) {
            gzwVarZjm.uef(gzwVarZjm.hg(), 7);
        }
        return gzwVarZjm;
    }

    public static gzw uef(Intent intent, Bundle bundle, com.bytedance.sdk.openadsdk.core.wk.moa.oa oaVar) {
        com.bytedance.sdk.openadsdk.core.model.uef uefVarOa = cp.uef().oa(cp.uef(intent));
        gzw gzwVarZjm = uefVarOa != null ? uefVarOa.zjm() : null;
        if (oaVar != null) {
            oaVar.uef(bundle);
        }
        cp.uef().lw();
        if (bundle != null) {
            try {
                gzwVarZjm = cp.uef().uef(bundle.getInt("meta_index", -1));
                Objects.toString(gzwVarZjm);
            } catch (Throwable th) {
                dhk.uef("TTAD.RFDM", "", th);
            }
        }
        if (gzwVarZjm != null) {
            gzwVarZjm.uef(gzwVarZjm.hg(), 7);
        }
        return gzwVarZjm;
    }

    public static void uef(Intent intent, oa oaVar) {
        if (intent == null) {
            return;
        }
        oaVar.tpx.yo(intent.getBooleanExtra("video_is_cached", false));
        oaVar.swd = intent.getStringExtra("multi_process_listener_key");
        oaVar.zou = intent.getIntExtra("orientation_angle", 0) == 3;
    }

    public static void uef(Intent intent, com.bytedance.sdk.openadsdk.component.reward.yo.oa oaVar) {
        if (intent == null) {
            return;
        }
        oaVar.oa(intent.getBooleanExtra("video_is_cached", false));
        oaVar.f25461oa = intent.getIntExtra("orientation_angle", 0) == 3;
    }

    public static void uef(Bundle bundle, oa oaVar) {
        if (bundle == null) {
            return;
        }
        oaVar.swd = bundle.getString("multi_process_listener_key");
        oaVar.tpx.yo(bundle.getBoolean("video_is_cached", false));
        oaVar.gem = bundle.getBoolean("is_mute");
        if (bundle.getLong("video_current") > 0) {
            oaVar.tpx.oa(bundle.getLong("video_current", 0L));
        }
        oaVar.uef(bundle.getBoolean("has_show_skip_btn"));
    }

    public static void uef(Bundle bundle, com.bytedance.sdk.openadsdk.component.reward.yo.oa oaVar) {
        if (bundle == null) {
            return;
        }
        oaVar.oa(bundle.getBoolean("video_is_cached", false));
    }

    public static void uef(oa oaVar, Bundle bundle, int i5) {
        if (bundle == null) {
            return;
        }
        try {
            bundle.putInt("meta_index", i5);
            bundle.putString("multi_process_listener_key", oaVar.swd);
            bundle.putBoolean("video_is_cached", oaVar.tpx.lz());
            bundle.putLong("video_current", oaVar.tpx.cq());
            bundle.putBoolean("is_mute", oaVar.gem);
            bundle.putBoolean("has_show_skip_btn", oaVar.nkh);
        } catch (Throwable th) {
            dhk.uef("TTAD.RFDM", "onSaveInstanceState: ", th);
        }
    }

    public static void uef(com.bytedance.sdk.openadsdk.component.reward.yo.oa oaVar, Bundle bundle, int i5) {
        if (bundle == null) {
            return;
        }
        try {
            bundle.putInt("meta_index", i5);
            if (oaVar != null) {
                bundle.putBoolean("video_is_cached", oaVar.dz());
            }
        } catch (Throwable th) {
            dhk.uef("TTAD.RFDM", "onSaveInstanceState: ", th);
        }
    }

    public static void uef(gzw gzwVar, Intent intent, Bundle bundle, int i5) {
        if (bundle == null || gzwVar == null) {
            return;
        }
        try {
            bundle.putInt("meta_index", i5);
            if (intent != null) {
                bundle.putString("multi_process_listener_key", intent.getStringExtra("multi_process_listener_key"));
                bundle.putBoolean("video_is_cached", intent.getBooleanExtra("video_is_cached", false));
            }
        } catch (Throwable th) {
            dhk.uef("TTAD.RFDM", "onSaveInstanceState: ", th);
        }
    }

    public static void uef(Intent intent, Activity activity, boolean z2, com.bytedance.sdk.openadsdk.core.model.uef uefVar, String str) {
        int rotation;
        if (activity == null) {
            intent.addFlags(268435456);
        } else {
            try {
                rotation = activity.getWindowManager().getDefaultDisplay().getRotation();
            } catch (Exception e7) {
                dhk.uef("TTAD.RFDM", "", e7);
            }
            intent.putExtra("orientation_angle", rotation);
            intent.putExtra("video_is_cached", z2);
            cp.uef().lw();
            intent.putExtra("meta_index", cp.uef().uef(uefVar));
            intent.putExtra("single_process_listener_key", str);
        }
        rotation = 0;
        intent.putExtra("orientation_angle", rotation);
        intent.putExtra("video_is_cached", z2);
        cp.uef().lw();
        intent.putExtra("meta_index", cp.uef().uef(uefVar));
        intent.putExtra("single_process_listener_key", str);
    }
}
