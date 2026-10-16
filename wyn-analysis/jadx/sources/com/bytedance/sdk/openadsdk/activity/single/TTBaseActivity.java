package com.bytedance.sdk.openadsdk.activity.single;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.window.OnBackInvokedCallback;
import com.bytedance.sdk.component.utils.dhk;
import com.bytedance.sdk.openadsdk.utils.pz;
import com.bytedance.sdk.openadsdk.utils.rt;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;

/* loaded from: classes3.dex */
public class TTBaseActivity extends Activity {
    protected boolean cz = false;
    private OnBackInvokedCallback uef;
    protected String zjm;

    public static class uef implements OnBackInvokedCallback {
        private final WeakReference<TTBaseActivity> uef;

        public uef(TTBaseActivity tTBaseActivity) {
            this.uef = new WeakReference<>(tTBaseActivity);
        }

        public void onBackInvoked() {
            TTBaseActivity tTBaseActivity = this.uef.get();
            if (tTBaseActivity != null) {
                tTBaseActivity.a_();
            }
        }
    }

    public void a_() {
        onBackPressed();
    }

    @Override // android.app.Activity
    public void finish() {
        try {
            super.finish();
        } catch (Exception unused) {
        }
    }

    public boolean moa() {
        return false;
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (moa() && rt.uef()) {
            this.uef = new uef(this);
            getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, this.uef);
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (!rt.uef() || this.uef == null) {
            return;
        }
        getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.uef);
        this.uef = null;
    }

    @Override // android.app.Activity
    public void onPause() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        if (Build.VERSION.SDK_INT < 33) {
            super.onPause();
            return;
        }
        try {
            try {
                super.onPause();
            } catch (Exception unused) {
            }
        } catch (IllegalArgumentException unused2) {
            Field declaredField = Activity.class.getDeclaredField("mCalled");
            declaredField.setAccessible(true);
            declaredField.set(this, Boolean.TRUE);
        }
    }

    @Override // android.app.Activity
    public void onResume() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        int i5 = Build.VERSION.SDK_INT;
        if (i5 > 28 || i5 < 24) {
            super.onResume();
            return;
        }
        try {
            super.onResume();
        } catch (IllegalArgumentException e7) {
            dhk.uef("TTBaseActivity", "super.onResume() run fail", e7);
            try {
                Field declaredField = Activity.class.getDeclaredField("mCalled");
                declaredField.setAccessible(true);
                declaredField.set(this, Boolean.TRUE);
            } catch (Exception e10) {
                dhk.uef("TTBaseActivity", "onResume set mCalled fail", e10);
            }
        }
    }

    public void xs() {
        try {
            if (!pz.oa() || Build.VERSION.SDK_INT < 29) {
                return;
            }
            getWindow().getDecorView().setForceDarkAllowed(false);
        } catch (Throwable unused) {
        }
    }

    public void yo(boolean z2) {
        this.cz = z2;
    }
}
