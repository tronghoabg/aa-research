package defpackage;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class hot implements hnf {
    @Override // defpackage.hnf
    public final /* bridge */ /* synthetic */ hng a(Bundle bundle) {
        String string = bundle.getString("entity_type");
        if (string == null) {
            string = "";
        }
        return new hou(string);
    }
}
