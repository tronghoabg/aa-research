package defpackage;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import com.google.android.projection.gearhead.companion.RequestNotificationAccessActivity;

/* loaded from: classes3.dex */
public final class xck implements mdl {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public xck(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.mdl
    public final void a() {
        if (this.b != 0) {
            Object obj = this.a;
            Intent intent = new Intent((Context) obj, (Class<?>) RequestNotificationAccessActivity.class);
            intent.addFlags(603979776);
            ((RequestNotificationAccessActivity) obj).startActivity(intent);
            return;
        }
        yph yphVar = xco.a;
        Object obj2 = this.a;
        xco xcoVar = (xco) obj2;
        if (xcoVar.A()) {
            return;
        }
        lvl.E().b(obj2);
        Fragment fragment = (Fragment) obj2;
        Intent intent2 = new Intent(fragment.getActivity(), fragment.getActivity().getClass());
        intent2.setFlags(603979776);
        Intent intent3 = fragment.getActivity().getIntent();
        if (intent3.hasExtra("com.google.android.gearhead.BT_AUTO_LAUNCH_DEVICE_NAME")) {
            intent2.putExtra("com.google.android.gearhead.BT_AUTO_LAUNCH_DEVICE_NAME", intent3.getStringExtra("com.google.android.gearhead.BT_AUTO_LAUNCH_DEVICE_NAME"));
        }
        if (intent3.hasExtra("com.google.android.gearhead.BT_AUTO_LAUNCH_DEVICE_ADDRESS")) {
            intent2.putExtra("com.google.android.gearhead.BT_AUTO_LAUNCH_DEVICE_ADDRESS", intent3.getStringExtra("com.google.android.gearhead.BT_AUTO_LAUNCH_DEVICE_ADDRESS"));
        }
        intent2.setAction(true != xcoVar.b ? "frx_vanagon_start" : "frx_projection_start");
        fragment.startActivity(intent2);
    }

    @Override // defpackage.mdl
    public final void b() {
        if (this.b != 0) {
            ((RequestNotificationAccessActivity) this.a).finish();
        } else {
            yph yphVar = xco.a;
        }
    }
}
