package defpackage;

import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.widget.TextView;
import java.util.Set;

@Deprecated
/* loaded from: classes3.dex */
public final class uqd {
    public final Resources a;
    public TextView b;
    private final StringBuilder c = new StringBuilder();

    public uqd(Resources resources) {
        this.a = resources;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String a(Set set) {
        if (set.isEmpty()) {
            return "";
        }
        StringBuilder sb = this.c;
        if (sb.length() > 0) {
            sb.delete(0, sb.length());
        }
        aeuj aeujVar = new aeuj((aeul) set);
        boolean z = true;
        while (aeujVar.hasNext()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append((String) aeujVar.next());
            z = false;
        }
        return sb.toString();
    }

    public final void b(final TextView textView, final String str, final int i, final int i2) {
        textView.post(new Runnable() { // from class: uqc
            @Override // java.lang.Runnable
            public final void run() throws Resources.NotFoundException {
                Resources resources = this.a.a;
                int i3 = i2;
                int color = resources.getColor(i);
                int color2 = resources.getColor(i3);
                float f = resources.getDisplayMetrics().density;
                TextView textView2 = textView;
                textView2.setTextColor(color);
                uqe uqeVar = new uqe(color2, f, textView2.getPaint());
                String str2 = str;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2);
                spannableStringBuilder.setSpan(uqeVar, 0, str2.length(), 33);
                textView2.setText(spannableStringBuilder);
            }
        });
    }
}
