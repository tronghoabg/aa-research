package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
final class oiy extends ojm {
    final /* synthetic */ oiz a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oiy(oiz oizVar) {
        super(oizVar);
        this.a = oizVar;
    }

    @Override // defpackage.ojm
    public final String a() {
        return this.a.a.a.getString(R.string.bluetooth_connect_permission_resolution_text);
    }

    @Override // defpackage.ojm
    protected final void b(Context context) {
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.fromParts("package", "com.google.android.projection.gearhead", null));
        intent.addFlags(268435456);
        context.startActivity(intent);
    }
}
