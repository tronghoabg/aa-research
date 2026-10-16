package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final class msa extends ouv {
    @Override // defpackage.ouv, defpackage.qru, defpackage.qrq, defpackage.qqh
    public final void a(Bundle bundle) throws Resources.NotFoundException {
        super.a(bundle);
        Context baseContext = getBaseContext();
        leh.a();
        baseContext.setTheme(R.style.Theme_Gearhead_Coolwalk_Cluster_Media);
        v(R.layout.activity_cluster_media);
    }
}
