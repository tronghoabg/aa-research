package com.waze.web;

import android.content.Context;
import android.net.Uri;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.PickVisualMediaRequestKt;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.core.content.FileProvider;
import com.waze.camera.WazeCameraIntentsFileProvider;
import com.waze.ix;
import com.waze.sharedui.web.WazeWebView;
import com.waze.sharedui.web.s;
import h.g.b.x;
import java.io.File;
import java.io.IOException;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class k extends com.waze.app_nav.a.b {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f45503a;

    /* renamed from: b, reason: collision with root package name */
    private WazeWebView f45504b;

    /* renamed from: c, reason: collision with root package name */
    private final ActivityResultLauncher f45505c;

    /* renamed from: d, reason: collision with root package name */
    private final ActivityResultLauncher f45506d;

    /* renamed from: e, reason: collision with root package name */
    private final ActivityResultLauncher f45507e;

    public k() {
        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("SimpleWebFragment");
        x.e(eVarD, "create(...)");
        this.f45503a = eVarD;
        final int i2 = 1;
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.PickVisualMedia(), new ActivityResultCallback(this) { // from class: com.waze.web.j

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ k f45501a;

            {
                this.f45501a = this;
            }

            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) throws IOException {
                int i3 = i2;
                if (i3 == 0) {
                    k.q(this.f45501a, (Uri) obj);
                } else if (i3 != 1) {
                    k.r(this.f45501a, ((Boolean) obj).booleanValue());
                } else {
                    k.o(this.f45501a, (Uri) obj);
                }
            }
        });
        x.e(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.f45505c = activityResultLauncherRegisterForActivityResult;
        final int i3 = 0;
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult2 = registerForActivityResult(new l(), new ActivityResultCallback(this) { // from class: com.waze.web.j

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ k f45501a;

            {
                this.f45501a = this;
            }

            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) throws IOException {
                int i32 = i3;
                if (i32 == 0) {
                    k.q(this.f45501a, (Uri) obj);
                } else if (i32 != 1) {
                    k.r(this.f45501a, ((Boolean) obj).booleanValue());
                } else {
                    k.o(this.f45501a, (Uri) obj);
                }
            }
        });
        x.e(activityResultLauncherRegisterForActivityResult2, "registerForActivityResult(...)");
        this.f45506d = activityResultLauncherRegisterForActivityResult2;
        final int i4 = 2;
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult3 = registerForActivityResult(new ActivityResultContracts.RequestPermission(), new ActivityResultCallback(this) { // from class: com.waze.web.j

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ k f45501a;

            {
                this.f45501a = this;
            }

            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) throws IOException {
                int i32 = i4;
                if (i32 == 0) {
                    k.q(this.f45501a, (Uri) obj);
                } else if (i32 != 1) {
                    k.r(this.f45501a, ((Boolean) obj).booleanValue());
                } else {
                    k.o(this.f45501a, (Uri) obj);
                }
            }
        });
        x.e(activityResultLauncherRegisterForActivityResult3, "registerForActivityResult(...)");
        this.f45507e = activityResultLauncherRegisterForActivityResult3;
    }

    static final void o(k kVar, Uri uri) {
        WazeWebView wazeWebView = kVar.f45504b;
        if (wazeWebView != null) {
            wazeWebView.v(uri);
        }
    }

    static final void q(k kVar, Uri uri) {
        WazeWebView wazeWebView = kVar.f45504b;
        if (wazeWebView != null) {
            wazeWebView.v(uri);
        }
    }

    static final void r(k kVar, boolean z) throws IOException {
        Uri uriForFile;
        if (!z) {
            kVar.f45503a.a("Camera permission is not granted, opening settings");
            kVar.startActivity(ix.g(kVar.requireContext()));
            return;
        }
        ActivityResultLauncher activityResultLauncher = kVar.f45506d;
        Context context = kVar.getContext();
        if (context == null) {
            uriForFile = null;
        } else {
            File fileCreateTempFile = File.createTempFile("waze-camera-shot-" + System.currentTimeMillis() + ".tmp", ".png", new File(context.getCacheDir(), "waze_camera_private_folder"));
            x.e(fileCreateTempFile, "createTempFile(...)");
            kVar.f45503a.a("will request capturing an img into ".concat(String.valueOf(fileCreateTempFile.getAbsolutePath())));
            int i2 = WazeCameraIntentsFileProvider.f18798a;
            uriForFile = FileProvider.getUriForFile(context, com.waze.car_lib.b.a(context), fileCreateTempFile);
        }
        activityResultLauncher.launch(uriForFile);
    }

    protected final void n(s sVar) {
        x.f(sVar, "request");
        if (sVar instanceof com.waze.sharedui.web.q) {
            this.f45505c.launch(PickVisualMediaRequestKt.PickVisualMediaRequest$default(ActivityResultContracts.PickVisualMedia.ImageOnly.INSTANCE, 0, false, null, 14, null));
            return;
        }
        if (sVar instanceof com.waze.sharedui.web.r) {
            this.f45505c.launch(PickVisualMediaRequestKt.PickVisualMediaRequest$default(ActivityResultContracts.PickVisualMedia.VideoOnly.INSTANCE, 0, false, null, 14, null));
            return;
        }
        if (sVar instanceof com.waze.sharedui.web.p) {
            this.f45507e.launch("android.permission.CAMERA");
            return;
        }
        if (x.n(sVar, com.waze.sharedui.web.n.f39364a)) {
            this.f45505c.launch(PickVisualMediaRequestKt.PickVisualMediaRequest$default(ActivityResultContracts.PickVisualMedia.ImageAndVideo.INSTANCE, 0, false, null, 14, null));
        } else {
            if (!x.n(sVar, com.waze.sharedui.web.o.f39365a)) {
                throw new h.i();
            }
            com.waze.shared_infra.i.e eVar = this.f45503a;
            Objects.toString(sVar);
            eVar.a("request not supported ".concat(String.valueOf(sVar)));
        }
    }

    protected final void p(WazeWebView wazeWebView) {
        this.f45504b = wazeWebView;
    }
}
