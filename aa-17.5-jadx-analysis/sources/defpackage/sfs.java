package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final class sfs extends sfx {
    @Override // defpackage.sfx, android.support.v4.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View viewInflate = layoutInflater.inflate(R.layout.reset_usb_connection_dialog, viewGroup);
        qrv.q(viewInflate.getResources(), (ViewGroup) viewInflate).setIndeterminate(true);
        return viewInflate;
    }
}
