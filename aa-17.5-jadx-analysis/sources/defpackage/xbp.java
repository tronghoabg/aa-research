package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.preference.Preference;
import com.google.android.libraries.social.licenses.LicenseMenuActivity;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.projection.gearhead.R;
import com.google.android.projection.gearhead.companion.settings.LegalInfoActivity;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class xbp extends xas {
    public static final /* synthetic */ int f = 0;
    private static final yph g = yph.c("GH.m3LegalFrag");

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    @Override // defpackage.exv, defpackage.eyc
    public final boolean i(Preference preference) {
        Intent intent = new Intent(requireActivity(), (Class<?>) LegalInfoActivity.class);
        String str = preference.t;
        switch (str.hashCode()) {
            case -2083367419:
                if (str.equals("terms_of_service")) {
                    intent = new Intent("android.intent.action.VIEW");
                    intent.setData(Uri.parse("http://www.google.com/policies/terms/"));
                    break;
                }
                break;
            case -909893934:
                if (str.equals("safety")) {
                    String string = getString(R.string.companion_legal_safety_information_title);
                    String string2 = getString(R.string.safety_notice);
                    intent.putExtra("legal_title_key", string);
                    intent.putExtra("legal_body_key", string2);
                    break;
                }
                break;
            case -77650071:
                if (str.equals("messaging_and_llms")) {
                    String strJ = actj.j();
                    Intent intent2 = new Intent("android.intent.action.VIEW");
                    intent2.setData(Uri.parse(strJ));
                    intent = intent2;
                    break;
                }
                break;
            case -49514576:
                if (str.equals("open_source")) {
                    intent = new Intent(getActivity(), (Class<?>) LicenseMenuActivity.class);
                    break;
                }
                break;
            case 3076010:
                if (str.equals("data")) {
                    String string3 = getString(R.string.companion_legal_data_notice_title);
                    String string4 = getString(R.string.data_notice_content);
                    intent.putExtra("legal_title_key", string3);
                    intent.putExtra("legal_body_key", string4);
                    break;
                }
                break;
        }
        try {
            startActivity(intent);
        } catch (ActivityNotFoundException e) {
            ((ype) ((ype) ((ype) g.h()).p(e)).ai((char) 10035)).u("Failed to open browser for safety, data, and legal notices.");
            Snackbar.k(this.b, R.string.companion_legal_open_error).f();
        }
        return super.i(preference);
    }

    @Override // defpackage.xas
    protected final yzz k() {
        return yzz.SETTINGS_COMMON;
    }

    @Override // defpackage.xas
    protected final Map l() {
        return new HashMap();
    }

    @Override // defpackage.xas, defpackage.exv, android.support.v4.app.Fragment
    /* renamed from: onCreate */
    public final void m107lambda$performCreate$3$androidsupportv4appFragment(Bundle bundle) throws URISyntaxException {
        boolean z;
        super.m107lambda$performCreate$3$androidsupportv4appFragment(bundle);
        c(R.xml.material3_legal_menu);
        boolean z2 = lwi.a().a;
        String strJ = actj.j();
        try {
            new URL(strJ).toURI();
            z = true;
        } catch (MalformedURLException | URISyntaxException unused) {
            z = false;
        }
        if (!strJ.isEmpty() && z && z2) {
            return;
        }
        ((ype) g.l().ai(10034)).N("removing messaging summarization notice preference uri: %s  flag: %b", strJ, z);
        b().Y(a("messaging_and_llms"));
    }
}
