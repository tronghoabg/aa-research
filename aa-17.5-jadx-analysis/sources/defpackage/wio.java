package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.projection.gearhead.R;

/* loaded from: classes3.dex */
public final class wio extends LinearLayout {
    public boolean[] a;
    public String b;
    public win c;

    public wio(Context context) {
        super(context);
        setOrientation(1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(abyl abylVar, boolean[] zArr) {
        if (zArr == null) {
            abxm abxmVar = abylVar.c;
            if (abxmVar == null) {
                abxmVar = abxm.a;
            }
            this.a = new boolean[abxmVar.b.size()];
        } else {
            this.a = zArr;
        }
        abxm abxmVar2 = abylVar.c;
        if (abxmVar2 == null) {
            abxmVar2 = abxm.a;
        }
        aboh abohVar = abxmVar2.b;
        int i = 0;
        for (int i2 = 0; i2 < abohVar.size(); i2++) {
            int iAz = a.az(((abxl) abohVar.get(i2)).c);
            int i3 = 1;
            if (iAz != 0 && iAz == 4) {
                LayoutInflater.from(getContext()).inflate(R.layout.survey_question_multiple_select_other_option, (ViewGroup) this, true);
                LinearLayout linearLayout = (LinearLayout) getChildAt(i2);
                CheckBox checkBox = (CheckBox) linearLayout.findViewById(R.id.survey_multiple_select_checkbox);
                checkBox.setContentDescription(getResources().getString(R.string.survey_other_option_hint));
                checkBox.setChecked(this.a[i2]);
                checkBox.setOnCheckedChangeListener(new wim(this, i2));
                checkBox.setTag("OtherPleaseSpecify");
                EditText editText = (EditText) linearLayout.findViewById(R.id.survey_other_option);
                vuf.E(editText, (TextView) linearLayout.findViewById(R.id.tv_survey_other_option_pii_info));
                View viewFindViewById = linearLayout.findViewById(R.id.survey_other_option_background);
                viewFindViewById.setOnTouchListener(new wjg(checkBox, viewFindViewById, editText, i3));
                editText.addTextChangedListener(new wjr(this, i2, checkBox, 1));
                editText.setOnFocusChangeListener(new wjq(this, i2, checkBox, editText, 1));
                wox woxVar = wia.c;
                if (adhk.a.gu().a(getContext())) {
                    editText.setFocusable(false);
                    editText.postDelayed(new wil(editText, i), 500L);
                }
            } else {
                boolean z = this.a[i2];
                int iAz2 = a.az(((abxl) abohVar.get(i2)).c);
                if (iAz2 == 0) {
                    iAz2 = 1;
                }
                String str = iAz2 == 5 ? "NoneOfTheAbove" : null;
                String str2 = ((abxl) abohVar.get(i2)).e;
                LayoutInflater.from(getContext()).inflate(R.layout.survey_question_multiple_select_item, (ViewGroup) this, true);
                FrameLayout frameLayout = (FrameLayout) getChildAt(i2);
                CheckBox checkBox2 = (CheckBox) frameLayout.findViewById(R.id.survey_multiple_select_checkbox);
                checkBox2.setText(str2);
                checkBox2.setContentDescription(str2);
                checkBox2.setChecked(z);
                checkBox2.setOnCheckedChangeListener(new wim(this, i2));
                frameLayout.setOnClickListener(new sdo(checkBox2, 8));
                if (str != null) {
                    checkBox2.setTag(str);
                }
            }
        }
    }
}
