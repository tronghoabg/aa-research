package defpackage;

import android.util.Log;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import com.google.android.projection.gearhead.R;
import j$.util.Objects;

/* loaded from: classes3.dex */
final class wim implements CompoundButton.OnCheckedChangeListener {
    final /* synthetic */ wio a;
    private final int b;

    public wim(wio wioVar, int i) {
        this.a = wioVar;
        this.b = i;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        CheckBox checkBox;
        int i = 0;
        if (Objects.equals(compoundButton.getTag(), "NoneOfTheAbove")) {
            wio wioVar = this.a;
            wioVar.a[this.b] = z;
            if (z) {
                if (wioVar.getChildCount() != wioVar.a.length + 1) {
                    Log.e("SurveyMultipleSelectView", "Number of children (checkboxes) contained in the answers container was not equal to the number of possible responses including \"None of the Above\". Note this is not expected to happen in prod.");
                }
                for (int i2 = 0; i2 < wioVar.getChildCount(); i2++) {
                    CheckBox checkBox2 = (CheckBox) wioVar.getChildAt(i2).findViewById(R.id.survey_multiple_select_checkbox);
                    if (!Objects.equals(checkBox2.getTag(), "NoneOfTheAbove")) {
                        checkBox2.setChecked(false);
                    }
                }
            }
        } else {
            boolean zEquals = Objects.equals(compoundButton.getTag(), "OtherPleaseSpecify");
            wio wioVar2 = this.a;
            if (zEquals) {
                wioVar2.a[this.b] = z;
                if (z) {
                    CheckBox checkBox3 = (CheckBox) wioVar2.findViewWithTag("NoneOfTheAbove");
                    if (checkBox3 != null) {
                        checkBox3.setChecked(false);
                    }
                    while (true) {
                        if (i >= wioVar2.getChildCount()) {
                            break;
                        }
                        EditText editText = (EditText) wioVar2.getChildAt(i).findViewById(R.id.survey_other_option);
                        if (editText != null) {
                            editText.requestFocus();
                            break;
                        }
                        i++;
                    }
                }
            } else {
                wioVar2.a[this.b] = z;
                if (z && (checkBox = (CheckBox) wioVar2.findViewWithTag("NoneOfTheAbove")) != null) {
                    checkBox.setChecked(false);
                }
            }
        }
        wio wioVar3 = this.a;
        wioVar3.c.a(new aacq(wioVar3.b, wioVar3.a, (char[]) null));
    }
}
