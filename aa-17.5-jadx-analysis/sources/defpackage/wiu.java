package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.projection.gearhead.R;

/* loaded from: classes3.dex */
public final class wiu extends LinearLayout {
    public wit a;

    public wiu(Context context) {
        super(context);
        setOrientation(1);
        LayoutInflater.from(context).inflate(R.layout.survey_question_open_text_item, (ViewGroup) this, true);
    }

    public final void a(abym abymVar) {
        EditText editText = (EditText) findViewById(R.id.survey_open_text);
        vuf.E(editText, (TextView) findViewById(R.id.survey_open_text_personal_info));
        editText.setSingleLine(false);
        if (!abymVar.b.isEmpty()) {
            editText.setHint(abymVar.b);
        }
        if (!wid.k(getContext())) {
            editText.requestFocus();
        }
        editText.addTextChangedListener(new lbe(this, 3));
    }
}
