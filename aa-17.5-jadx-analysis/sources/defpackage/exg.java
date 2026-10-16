package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import com.google.android.projection.gearhead.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
final class exg extends Preference {
    private long a;

    public exg(Context context, List list, long j) {
        super(context);
        this.E = R.layout.expand_button;
        Drawable drawableE = ca.e(this.j, R.drawable.ic_arrow_down_24dp);
        if (this.s != drawableE) {
            this.s = drawableE;
            this.r = 0;
            d();
        }
        this.r = R.drawable.ic_arrow_down_24dp;
        I(R.string.expand_button_title);
        F(999);
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        CharSequence string = null;
        while (it.hasNext()) {
            Preference preference = (Preference) it.next();
            CharSequence charSequence = preference.q;
            boolean z = preference instanceof PreferenceGroup;
            if (z && !TextUtils.isEmpty(charSequence)) {
                arrayList.add((PreferenceGroup) preference);
            }
            if (arrayList.contains(preference.G)) {
                if (z) {
                    arrayList.add((PreferenceGroup) preference);
                }
            } else if (!TextUtils.isEmpty(charSequence)) {
                string = string == null ? charSequence : this.j.getString(R.string.summary_collapsed_preference_list, string, charSequence);
            }
        }
        n(string);
        this.a = j + 1000000;
    }

    @Override // androidx.preference.Preference
    public final void a(eyg eygVar) {
        super.a(eygVar);
        eygVar.u = false;
    }

    @Override // androidx.preference.Preference
    public final long eT() {
        return this.a;
    }
}
