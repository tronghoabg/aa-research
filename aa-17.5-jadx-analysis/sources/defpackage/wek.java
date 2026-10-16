package defpackage;

import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.libraries.social.licenses.License;
import com.google.android.libraries.social.licenses.LicenseMenuActivity;
import com.google.android.projection.gearhead.R;

/* loaded from: classes3.dex */
public final class wek extends fz {
    private static final gf f = new wej();
    public final LicenseMenuActivity e;

    public wek(LicenseMenuActivity licenseMenuActivity) {
        super(f);
        this.e = licenseMenuActivity;
    }

    @Override // defpackage.lt
    public final /* bridge */ /* synthetic */ mo f(ViewGroup viewGroup, int i) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.libraries_social_licenses_license, viewGroup, false);
        TypedValue typedValue = new TypedValue();
        if (viewGroup.getContext().getTheme().resolveAttribute(android.R.attr.selectableItemBackground, typedValue, true)) {
            viewInflate.setBackgroundResource(typedValue.resourceId);
        }
        return new wor(viewInflate, null);
    }

    @Override // defpackage.lt
    public final /* bridge */ /* synthetic */ void n(mo moVar, int i) {
        wor worVar = (wor) moVar;
        License license = (License) b(i);
        ((TextView) worVar.s).setText(license.a);
        worVar.a.setOnClickListener(new sqd(this, license, 2));
    }
}
