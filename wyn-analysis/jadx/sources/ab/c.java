package ab;

import android.app.Activity;
import android.content.SharedPreferences;
import ff.m;
import kotlin.jvm.internal.AbstractC3340k;
import tc.g;
import uc.InterfaceC4285v;

/* loaded from: classes4.dex */
public final class c implements InterfaceC4285v {

    /* renamed from: a, reason: collision with root package name */
    public Activity f17486a;

    /* renamed from: b, reason: collision with root package name */
    public Y9.c f17487b;

    @Override // uc.InterfaceC4285v
    public final boolean onRequestPermissionsResult(int i5, String[] permissions, int[] grantResults) {
        SharedPreferences sharedPreferences;
        AbstractC3340k.e(permissions, "permissions");
        AbstractC3340k.e(grantResults, "grantResults");
        if (grantResults.length == 0) {
            Y9.c cVar = this.f17487b;
            if (cVar != null) {
                ((g) cVar.f16739b).b(Ya.a.class.getSimpleName(), new Ya.a("The permission request dialog was closed or the request was cancelled.").getMessage(), null);
            }
            this.f17486a = null;
            this.f17487b = null;
            return false;
        }
        Za.b bVar = Za.b.f17078b;
        if (i5 != 100) {
            return false;
        }
        int iY0 = m.y0("android.permission.POST_NOTIFICATIONS", permissions);
        if (iY0 < 0 || grantResults[iY0] != 0) {
            Activity activity = this.f17486a;
            if (activity != null && !activity.shouldShowRequestPermissionRationale("android.permission.POST_NOTIFICATIONS")) {
                bVar = Za.b.f17079c;
            }
        } else {
            bVar = Za.b.f17077a;
        }
        Activity activity2 = this.f17486a;
        if (activity2 != null && (sharedPreferences = activity2.getSharedPreferences("com.pravera.flutter_foreground_task.prefs.NOTIFICATION_PERMISSION_STATUS", 0)) != null) {
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.putString("android.permission.POST_NOTIFICATIONS", bVar.toString());
            editorEdit.commit();
        }
        Y9.c cVar2 = this.f17487b;
        if (cVar2 != null) {
            ((g) cVar2.f16739b).a(Integer.valueOf(bVar.ordinal()));
        }
        this.f17486a = null;
        this.f17487b = null;
        return true;
    }
}
