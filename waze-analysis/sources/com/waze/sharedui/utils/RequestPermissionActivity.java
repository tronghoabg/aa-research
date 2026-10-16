package com.waze.sharedui.utils;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import j$.util.Objects;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class RequestPermissionActivity extends Activity {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f39074a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static Runnable f39075b;

    /* renamed from: c, reason: collision with root package name */
    private static final HashMap f39076c = new n();

    /* renamed from: d, reason: collision with root package name */
    private String[] f39077d;

    /* renamed from: e, reason: collision with root package name */
    private m f39078e;

    /* renamed from: f, reason: collision with root package name */
    private m f39079f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f39080g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f39081h;

    public static void b(Runnable runnable) {
        f39075b = runnable;
    }

    public final void a() {
        Runnable runnable = f39075b;
        if (runnable != null) {
            runnable.run();
            f39075b = null;
        }
        m mVar = this.f39078e;
        if (mVar == null) {
            setResult(-1);
            finish();
        } else {
            if (this.f39080g) {
                return;
            }
            startActivityForResult(mVar.o(this), 1002);
            this.f39080g = true;
        }
    }

    @Override // android.app.Activity
    public final void finish() {
        com.waze.shared_infra.i.h.a("finish(this:" + System.identityHashCode(this) + ")");
        super.finish();
    }

    @Override // android.app.Activity
    protected final void onActivityResult(int i2, int i3, Intent intent) {
        com.waze.shared_infra.i.h.a("onActivityResult(this:" + System.identityHashCode(this) + ", resultCode: " + i3 + ")");
        super.onActivityResult(i2, i3, intent);
        if (i2 == 1002) {
            setResult(i3, intent);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f39077d = getIntent().getStringArrayExtra("needed_permissions");
        this.f39078e = (m) getIntent().getParcelableExtra("on_granted");
        this.f39079f = (m) getIntent().getParcelableExtra("on_rejected");
        if (bundle != null) {
            this.f39080g = bundle.getBoolean("KEY_AWAITING_GRANTED_INTENT", false);
            this.f39081h = bundle.getBoolean("KEY_AWAITING_REJECTED_INTENT", false);
        }
        for (String str : this.f39077d) {
            if (ContextCompat.checkSelfPermission(this, str) != 0) {
                com.waze.shared_infra.i.h.b("RequestPermissionActivity", "requestPermissionNeeded: requesting permissions for: ".concat(String.valueOf(Arrays.deepToString(this.f39077d))));
                ActivityCompat.requestPermissions(this, this.f39077d, 1001);
                return;
            }
        }
        a();
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        if (i2 == 1001) {
            if (iArr.length > 0 && iArr[0] == 0) {
                com.waze.shared_infra.i.h.b("RequestPermissionActivity", "requestPermissionNeeded: permission granted");
                for (int i3 = 0; i3 < strArr.length; i3++) {
                    if (iArr[i3] == 0) {
                        String str = strArr[i3];
                        HashMap map = f39076c;
                        if (map.containsKey(str)) {
                            ((com.waze.config.b) Objects.requireNonNull((com.waze.config.b) map.get(str))).d(true);
                        }
                    }
                }
                a();
                return;
            }
            com.waze.shared_infra.i.h.b("RequestPermissionActivity", "requestPermissionNeeded: permission rejected");
            f39075b = null;
            m mVar = this.f39079f;
            if (mVar == null) {
                setResult(0);
                finish();
            } else {
                if (this.f39081h) {
                    return;
                }
                startActivityForResult(mVar.o(this), 1002);
                this.f39081h = true;
            }
        }
    }

    @Override // android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("KEY_AWAITING_GRANTED_INTENT", this.f39080g);
        bundle.putBoolean("KEY_AWAITING_REJECTED_INTENT", this.f39081h);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i2) {
        com.waze.shared_infra.i.h.a("startActivityForResult(this:" + System.identityHashCode(this) + ")");
        super.startActivityForResult(intent, i2);
    }
}
