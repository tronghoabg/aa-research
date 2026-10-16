package androidx.preference;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import com.google.android.projection.gearhead.R;
import defpackage.exe;
import defpackage.eyg;

/* loaded from: classes2.dex */
public class DropDownPreference extends ListPreference {
    private final Context J;
    private final ArrayAdapter K;
    private Spinner L;
    private final AdapterView.OnItemSelectedListener M;

    public DropDownPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.dropdownPreferenceStyle);
        this.M = new exe(this, 0);
        this.J = context;
        ArrayAdapter arrayAdapter = new ArrayAdapter(context, android.R.layout.simple_spinner_dropdown_item);
        this.K = arrayAdapter;
        arrayAdapter.clear();
        CharSequence[] charSequenceArr = ((ListPreference) this).g;
        if (charSequenceArr != null) {
            for (CharSequence charSequence : charSequenceArr) {
                this.K.add(charSequence.toString());
            }
        }
    }

    @Override // androidx.preference.Preference
    public final void a(eyg eygVar) {
        Spinner spinner = (Spinner) eygVar.a.findViewById(R.id.spinner);
        this.L = spinner;
        spinner.setAdapter((SpinnerAdapter) this.K);
        this.L.setOnItemSelectedListener(this.M);
        Spinner spinner2 = this.L;
        String str = ((ListPreference) this).i;
        CharSequence[] charSequenceArr = ((ListPreference) this).h;
        int i = -1;
        if (str != null && charSequenceArr != null) {
            int length = charSequenceArr.length - 1;
            while (true) {
                if (length < 0) {
                    break;
                }
                if (TextUtils.equals(charSequenceArr[length].toString(), str)) {
                    i = length;
                    break;
                }
                length--;
            }
        }
        spinner2.setSelection(i);
        super.a(eygVar);
    }

    @Override // androidx.preference.DialogPreference, androidx.preference.Preference
    protected final void c() {
        this.L.performClick();
    }

    @Override // androidx.preference.Preference
    public final void d() {
        super.d();
        ArrayAdapter arrayAdapter = this.K;
        if (arrayAdapter != null) {
            arrayAdapter.notifyDataSetChanged();
        }
    }
}
