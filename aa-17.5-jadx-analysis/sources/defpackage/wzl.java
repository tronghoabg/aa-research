package defpackage;

import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.projection.gearhead.R;

/* loaded from: classes3.dex */
public final class wzl extends lt {
    Context a;
    private yfq e;

    public wzl(yfq yfqVar) {
        this.e = yfqVar;
    }

    @Override // defpackage.lt
    public final int a() {
        return ((yls) this.e).c;
    }

    public final void b(yfq yfqVar) {
        this.e = yfqVar;
        g();
    }

    @Override // defpackage.lt
    public final /* bridge */ /* synthetic */ mo f(ViewGroup viewGroup, int i) {
        this.a = viewGroup.getContext();
        return new wzk(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.quality_test_report_row, viewGroup, false));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.lt
    public final /* synthetic */ void n(mo moVar, int i) {
        wzk wzkVar = (wzk) moVar;
        kev kevVar = (kev) this.e.get(i);
        int i2 = kevVar.d;
        Context context = this.a;
        int i3 = i2 - 1;
        if (i3 == 1) {
            wzkVar.t.setImageDrawable(context.getDrawable(R.drawable.quality_test_report_fail_icon));
        } else if (i3 != 2) {
            wzkVar.t.setImageDrawable(context.getDrawable(R.drawable.quality_test_report_fail_preconditions_icon));
        } else {
            wzkVar.t.setImageDrawable(context.getDrawable(R.drawable.quality_test_report_pass_icon));
        }
        wzkVar.u.setText(kevVar.a);
        wzkVar.v.setText(kevVar.b);
        TextView textView = wzkVar.w;
        textView.setText(kevVar.c);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setLinkTextColor(-16776961);
        wzkVar.s.setVisibility(0);
    }
}
