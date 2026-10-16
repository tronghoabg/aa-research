package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@java.lang.Deprecated
public final class ura {
    public final android.content.res.Resources a;
    public android.widget.TextView b;
    private final java.lang.StringBuilder c = new java.lang.StringBuilder();

    public ura(android.content.res.Resources resources) {
        this.a = resources;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.String a(java.util.Set set) {
        if (set.isEmpty()) {
            return "";
        }
        java.lang.StringBuilder sb = this.c;
        if (sb.length() > 0) {
            sb.delete(0, sb.length());
        }
        defpackage.aevj aevjVar = new defpackage.aevj((defpackage.aevl) set);
        boolean z = true;
        while (aevjVar.hasNext()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append((java.lang.String) aevjVar.next());
            z = false;
        }
        return sb.toString();
    }

    public final void b(final android.widget.TextView textView, final java.lang.String str, final int i, final int i2) {
        textView.post(new java.lang.Runnable() { // from class: uqz
            @Override // java.lang.Runnable
            public final void run() {
                android.content.res.Resources resources = this.a.a;
                int i3 = i2;
                int color = resources.getColor(i);
                int color2 = resources.getColor(i3);
                float f = resources.getDisplayMetrics().density;
                android.widget.TextView textView2 = textView;
                textView2.setTextColor(color);
                defpackage.urb urbVar = new defpackage.urb(color2, f, textView2.getPaint());
                java.lang.String str2 = str;
                android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(str2);
                spannableStringBuilder.setSpan(urbVar, 0, str2.length(), 33);
                textView2.setText(spannableStringBuilder);
            }
        });
    }
}
