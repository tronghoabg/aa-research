package defpackage;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.projection.gearhead.R;

/* loaded from: classes3.dex */
public final class xek extends qqh {
    @Override // defpackage.qqh
    public final void a(Bundle bundle) {
        v(R.layout.placeholder);
        String stringExtra = q().getStringExtra("placeholder_text");
        if (stringExtra != null) {
            ((TextView) B(R.id.placeholder_text)).setText(getString(R.string.placeholder_text, new Object[]{stringExtra}));
        }
        int intExtra = q().getIntExtra("placeholder_image", 0);
        if (intExtra != 0) {
            ((ImageView) B(R.id.placeholder_image)).setImageDrawable(getResources().getDrawable(intExtra));
        }
    }
}
