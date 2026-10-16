package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final class sfd extends sfx implements seo {
    public ProgressBar g;
    public seq h;
    public sga i;

    @Override // defpackage.seo
    public final void a(Intent intent) {
        startActivityForResult(intent, 37);
    }

    @Override // defpackage.sfx, android.support.v4.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        this.i = ((sfl) ((bc) requireContext())).B();
        this.h = new seq(this, requireContext().getPackageManager());
        View viewInflate = layoutInflater.inflate(R.layout.download_gearhead_dialog, viewGroup);
        ((TextView) viewInflate.findViewById(R.id.dialog_body)).setText(R.string.presetup_download_in_progress_body);
        this.g = qrv.q(viewInflate.getResources(), (ViewGroup) viewInflate);
        this.h.g.fE(getViewLifecycleOwner(), new ntw(this, 19));
        seq seqVar = this.h;
        ser serVar = (ser) seqVar.g.e();
        serVar.getClass();
        int i = serVar.a;
        if (i != 4 && i != 1 && i != 5) {
            String str = seqVar.b;
            Intent intentA = sev.a(str);
            if (intentA.resolveActivity(seqVar.d) != null) {
                seq.a.f().ai(8843).y("AppInstaller requesting install of pkg=%s", str);
                seqVar.c.a(intentA);
            } else {
                seq.a.h().ai(8842).y("AppInstaller failed install intent unresolved for pkg=%s", str);
                seqVar.a(5);
            }
        }
        Context context = getContext();
        if (context != null) {
            sga sgaVar = this.i;
            SharedPreferences sharedPreferences = context.getSharedPreferences("frx_cookie", 0);
            int i2 = sgaVar.d;
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.putLong("ELAPSED_REALTIME", SystemClock.elapsedRealtime());
            editorEdit.putInt("CONNECTION_TYPE", i2);
            editorEdit.commit();
        }
        return viewInflate;
    }
}
