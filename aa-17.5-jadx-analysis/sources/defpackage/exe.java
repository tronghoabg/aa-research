package defpackage;

import android.view.View;
import android.widget.AdapterView;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import com.google.android.projection.gearhead.companion.devsettings.AppQualityTesterActivity;

/* loaded from: classes2.dex */
public final class exe implements AdapterView.OnItemSelectedListener {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public exe(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        ks ksVar;
        int i2 = this.b;
        if (i2 == 0) {
            if (i >= 0) {
                Object obj = this.a;
                ListPreference listPreference = (ListPreference) obj;
                String string = listPreference.h[i].toString();
                if (string.equals(listPreference.i) || !((Preference) obj).N(string)) {
                    return;
                }
                listPreference.o(string);
                return;
            }
            return;
        }
        if (i2 == 1) {
            if (i == -1 || (ksVar = ((lk) this.a).e) == null) {
                return;
            }
            ksVar.a = false;
            return;
        }
        Object obj2 = this.a;
        if (i2 != 2) {
            ((AppQualityTesterActivity) obj2).t.setSelection(i, true);
        } else {
            ((vlw) obj2).d();
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
