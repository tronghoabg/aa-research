package defpackage;

import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.projection.gearhead.R;
import java.util.List;

/* loaded from: classes3.dex */
public final /* synthetic */ class wjq implements View.OnFocusChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;
    public final /* synthetic */ TextView c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ wjq(wio wioVar, int i, CheckBox checkBox, EditText editText, int i2) {
        this.e = i2;
        this.d = wioVar;
        this.a = i;
        this.c = checkBox;
        this.b = editText;
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.util.List] */
    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        if (this.e == 0) {
            TextView textView = this.c;
            View view2 = this.b;
            if (!z) {
                ((EditText) textView).setHintTextColor(((wjt) view2).getContext().getColor(R.color.survey_hint_text_unfocused_color));
                return;
            }
            int i = this.a;
            ?? r4 = this.d;
            wjt wjtVar = (wjt) view2;
            ((EditText) textView).setHintTextColor(wjtVar.getContext().getColor(R.color.survey_hint_text_color));
            wjtVar.a.a(new ajll(4, "", ((abxl) r4.get(i)).d));
            return;
        }
        View view3 = this.b;
        Object obj = this.d;
        if (!z) {
            ((EditText) view3).setHintTextColor(((wio) obj).getContext().getColor(R.color.survey_hint_text_unfocused_color));
            return;
        }
        TextView textView2 = this.c;
        wio wioVar = (wio) obj;
        wioVar.a[this.a] = true;
        ((CheckBox) textView2).setChecked(true);
        ((EditText) view3).setHintTextColor(wioVar.getContext().getColor(R.color.survey_hint_text_color));
        wioVar.c.a(new aacq(wioVar.b, wioVar.a, (char[]) null));
    }

    public /* synthetic */ wjq(wjt wjtVar, EditText editText, List list, int i, int i2) {
        this.e = i2;
        this.b = wjtVar;
        this.c = editText;
        this.d = list;
        this.a = i;
    }
}
