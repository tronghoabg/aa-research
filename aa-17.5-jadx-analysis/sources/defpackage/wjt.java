package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.projection.gearhead.R;

/* loaded from: classes3.dex */
public final class wjt extends LinearLayout {
    public static final /* synthetic */ int b = 0;
    private static final yfy c = yfy.o(0, 2131233595, 1, 2131233591, 2, 2131233589, 3, 2131233587, 4, 2131233593);
    public wjs a;

    public wjt(Context context) {
        super(context);
        setOrientation(1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(abzd abzdVar) {
        int iAz;
        View[] viewArr;
        wjt wjtVar = this;
        abxm abxmVar = abzdVar.c;
        if (abxmVar == null) {
            abxmVar = abxm.a;
        }
        View[] viewArr2 = new View[abxmVar.b.size()];
        abxm abxmVar2 = abzdVar.c;
        if (abxmVar2 == null) {
            abxmVar2 = abxm.a;
        }
        aboh abohVar = abxmVar2.b;
        int i = abzdVar.d;
        int iAz2 = a.az(i);
        boolean z = ((iAz2 != 0 && iAz2 == 4) || ((iAz = a.az(i)) != 0 && iAz == 5)) && abohVar.size() == 5;
        int i2 = 0;
        while (i2 < abohVar.size()) {
            int i3 = i2 + 1;
            int iAz3 = a.az(((abxl) abohVar.get(i2)).c);
            if (iAz3 != 0 && iAz3 == 4) {
                LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(wjtVar.getContext()).inflate(R.layout.survey_question_single_select_other_entry, (ViewGroup) wjtVar, true);
                EditText editText = (EditText) linearLayout.findViewById(R.id.survey_other_option);
                vuf.E(editText, (TextView) linearLayout.findViewById(R.id.survey_other_option_personal_info));
                linearLayout.findViewById(R.id.survey_other_option_background).setOnClickListener(new sdo(editText, 12));
                editText.addTextChangedListener(new wjr(wjtVar, abohVar, i2, 0));
                editText.setOnFocusChangeListener(new wjq(wjtVar, editText, abohVar, i2, 0));
                viewArr2[i2] = editText;
                viewArr = viewArr2;
            } else {
                LayoutInflater.from(wjtVar.getContext()).inflate(R.layout.survey_question_single_select_item, (ViewGroup) wjtVar, true);
                View childAt = wjtVar.getChildAt(wjtVar.getChildCount() - 1);
                viewArr2[i2] = childAt;
                TextView textView = (TextView) childAt.findViewById(R.id.survey_multiple_choice_text);
                textView.setText(((abxl) abohVar.get(i2)).e);
                textView.setContentDescription(((abxl) abohVar.get(i2)).e);
                ImageView imageView = (ImageView) viewArr2[i2].findViewById(R.id.survey_multiple_choice_icon);
                if (z) {
                    int iAz4 = a.az(abzdVar.d);
                    imageView.setImageDrawable(vuf.F(ca.e(wjtVar.getContext(), ((Integer) c.get(Integer.valueOf((iAz4 != 0 && iAz4 == 5) ? ((ylx) c).d - i3 : i2))).intValue()), wjtVar.getContext(), wjtVar.getContext().getColor(R.color.survey_grey_icon_color)));
                } else {
                    imageView.setVisibility(8);
                }
                viewArr = viewArr2;
                viewArr2[i2].setOnClickListener(new kdy(wjtVar, viewArr, abohVar, i2, 2));
            }
            wjtVar = this;
            viewArr2 = viewArr;
            i2 = i3;
        }
    }
}
