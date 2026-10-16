package xc;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import ba.C1521a;
import java.util.HashMap;
import org.apache.tika.mime.MimeTypes;
import q.s1;
import qc.C3884a;
import qc.InterfaceC3885b;
import rc.InterfaceC3964a;
import rc.InterfaceC3965b;
import tc.g;
import uc.InterfaceC4280q;
import uc.InterfaceC4283t;

/* renamed from: xc.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C4508a implements InterfaceC3885b, InterfaceC3964a, InterfaceC4283t {

    /* renamed from: a, reason: collision with root package name */
    public final PackageManager f47874a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC3965b f47875b;

    /* renamed from: c, reason: collision with root package name */
    public HashMap f47876c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f47877d = new HashMap();

    public C4508a(C1521a c1521a) {
        this.f47874a = (PackageManager) c1521a.f19414b;
        c1521a.f19415c = this;
    }

    public final void a(String str, String str2, boolean z2, g gVar) {
        if (this.f47875b == null) {
            gVar.b("error", "Plugin not bound to an Activity", null);
            return;
        }
        HashMap map = this.f47876c;
        if (map == null) {
            gVar.b("error", "Can not process text actions before calling queryTextActions", null);
            return;
        }
        ResolveInfo resolveInfo = (ResolveInfo) map.get(str);
        if (resolveInfo == null) {
            gVar.b("error", "Text processing activity not found", null);
            return;
        }
        int iHashCode = gVar.hashCode();
        this.f47877d.put(Integer.valueOf(iHashCode), gVar);
        Intent intent = new Intent();
        ActivityInfo activityInfo = resolveInfo.activityInfo;
        intent.setClassName(activityInfo.packageName, activityInfo.name);
        intent.setAction("android.intent.action.PROCESS_TEXT");
        intent.setType(MimeTypes.PLAIN_TEXT);
        intent.putExtra("android.intent.extra.PROCESS_TEXT", str2);
        intent.putExtra("android.intent.extra.PROCESS_TEXT_READONLY", z2);
        ((Activity) ((s1) this.f47875b).f43896a).startActivityForResult(intent, iHashCode);
    }

    public final HashMap b() {
        HashMap map = this.f47876c;
        PackageManager packageManager = this.f47874a;
        if (map == null) {
            this.f47876c = new HashMap();
            int i5 = Build.VERSION.SDK_INT;
            Intent type = new Intent().setAction("android.intent.action.PROCESS_TEXT").setType(MimeTypes.PLAIN_TEXT);
            for (ResolveInfo resolveInfo : i5 >= 33 ? packageManager.queryIntentActivities(type, PackageManager.ResolveInfoFlags.of(0L)) : packageManager.queryIntentActivities(type, 0)) {
                String str = resolveInfo.activityInfo.name;
                resolveInfo.loadLabel(packageManager).toString();
                this.f47876c.put(str, resolveInfo);
            }
        }
        HashMap map2 = new HashMap();
        for (String str2 : this.f47876c.keySet()) {
            map2.put(str2, ((ResolveInfo) this.f47876c.get(str2)).loadLabel(packageManager).toString());
        }
        return map2;
    }

    @Override // uc.InterfaceC4283t
    public final boolean onActivityResult(int i5, int i10, Intent intent) {
        HashMap map = this.f47877d;
        if (!map.containsKey(Integer.valueOf(i5))) {
            return false;
        }
        ((InterfaceC4280q) map.remove(Integer.valueOf(i5))).a(i10 == -1 ? intent.getStringExtra("android.intent.extra.PROCESS_TEXT") : null);
        return true;
    }

    @Override // rc.InterfaceC3964a
    public final void onAttachedToActivity(InterfaceC3965b interfaceC3965b) {
        this.f47875b = interfaceC3965b;
        ((s1) interfaceC3965b).b(this);
    }

    @Override // rc.InterfaceC3964a
    public final void onDetachedFromActivity() {
        ((s1) this.f47875b).m(this);
        this.f47875b = null;
    }

    @Override // rc.InterfaceC3964a
    public final void onDetachedFromActivityForConfigChanges() {
        ((s1) this.f47875b).m(this);
        this.f47875b = null;
    }

    @Override // rc.InterfaceC3964a
    public final void onReattachedToActivityForConfigChanges(InterfaceC3965b interfaceC3965b) {
        this.f47875b = interfaceC3965b;
        ((s1) interfaceC3965b).b(this);
    }

    @Override // qc.InterfaceC3885b
    public final void onAttachedToEngine(C3884a c3884a) {
    }

    @Override // qc.InterfaceC3885b
    public final void onDetachedFromEngine(C3884a c3884a) {
    }
}
