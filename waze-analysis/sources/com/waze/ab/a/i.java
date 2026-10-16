package com.waze.ab.a;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.res.Configuration;
import android.net.Uri;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.activity.result.PickVisualMediaRequestKt;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.compose.material.ModalBottomSheetState;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class i implements kotlinx.coroutines.b.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f13712a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Configuration f13713b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ n f13714c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ ManagedActivityResultLauncher f13715d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ ModalBottomSheetState f13716e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ ManagedActivityResultLauncher f13717f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ ManagedActivityResultLauncher f13718g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ ManagedActivityResultLauncher f13719h;

    i(Context context, Configuration configuration, n nVar, ManagedActivityResultLauncher managedActivityResultLauncher, ModalBottomSheetState modalBottomSheetState, ManagedActivityResultLauncher managedActivityResultLauncher2, ManagedActivityResultLauncher managedActivityResultLauncher3, ManagedActivityResultLauncher managedActivityResultLauncher4) {
        this.f13712a = context;
        this.f13713b = configuration;
        this.f13714c = nVar;
        this.f13715d = managedActivityResultLauncher;
        this.f13716e = modalBottomSheetState;
        this.f13717f = managedActivityResultLauncher2;
        this.f13718g = managedActivityResultLauncher3;
        this.f13719h = managedActivityResultLauncher4;
    }

    @Override // kotlinx.coroutines.b.l
    public final /* bridge */ /* synthetic */ Object emit(Object obj, h.c.e eVar) {
        x xVar = (x) obj;
        if (!(xVar instanceof r)) {
            if (xVar instanceof s) {
                Object objHide = this.f13716e.hide(eVar);
                if (objHide == h.c.a.a.f48038a) {
                    return objHide;
                }
            } else if (xVar instanceof t) {
                this.f13717f.launch(PickVisualMediaRequestKt.PickVisualMediaRequest$default(ActivityResultContracts.PickVisualMedia.ImageOnly.INSTANCE, 0, false, null, 14, null));
            } else if (xVar instanceof u) {
                this.f13718g.launch("android.permission.CAMERA");
            } else if (xVar instanceof w) {
                this.f13719h.launch(((w) xVar).a());
            } else {
                if (!(xVar instanceof v)) {
                    throw new h.i();
                }
                Object objShow = this.f13716e.show(eVar);
                if (objShow == h.c.a.a.f48038a) {
                    return objShow;
                }
            }
            return h.ab.f48028a;
        }
        r rVar = (r) xVar;
        Uri uriA = rVar.a();
        Uri uriB = rVar.b();
        int iB = rVar.c().b();
        int iA = rVar.c().a();
        rVar.c();
        rVar.c();
        Intent intent = new Intent("com.android.camera.action.CROP");
        intent.setDataAndType(uriA, "image/*");
        intent.putExtra("outputX", iB);
        intent.putExtra("outputY", iA);
        intent.putExtra("aspectX", 1);
        intent.putExtra("aspectY", 1);
        intent.putExtra("scale", true);
        intent.putExtra("return-data", false);
        intent.putExtra("output", uriB);
        intent.addFlags(1);
        Context context = this.f13712a;
        List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 65536);
        h.g.b.x.e(listQueryIntentActivities, "queryIntentActivities(...)");
        int i2 = this.f13713b.orientation;
        if (listQueryIntentActivities.isEmpty() || i2 == 2) {
            this.f13714c.b();
        } else {
            Uri uriB2 = rVar.b();
            Iterator<T> it = listQueryIntentActivities.iterator();
            while (it.hasNext()) {
                context.grantUriPermission(((ResolveInfo) it.next()).activityInfo.packageName, uriB2, 3);
            }
            this.f13715d.launch(intent);
        }
        return h.ab.f48028a;
    }
}
