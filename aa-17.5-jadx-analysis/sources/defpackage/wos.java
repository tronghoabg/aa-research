package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.material.focus.FocusRingDrawable;
import com.google.android.projection.gearhead.R;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class wos extends lt {
    public final woa a;

    public wos(woa woaVar) {
        this.a = woaVar;
    }

    @Override // defpackage.lt
    public final int a() {
        return this.a.b.f;
    }

    final int b(int i) {
        return i - this.a.b.a.c;
    }

    @Override // defpackage.lt
    public final /* bridge */ /* synthetic */ mo f(ViewGroup viewGroup, int i) {
        return new wor((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_year, viewGroup, false));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, wui] */
    @Override // defpackage.lt
    public final /* bridge */ /* synthetic */ void n(mo moVar, int i) {
        woa woaVar = this.a;
        int i2 = woaVar.b.a.c;
        View view = ((wor) moVar).s;
        Locale locale = Locale.getDefault();
        int i3 = i2 + i;
        Integer numValueOf = Integer.valueOf(i3);
        TextView textView = (TextView) view;
        textView.setText(String.format(locale, "%d", numValueOf));
        Context context = textView.getContext();
        textView.setContentDescription(woq.d().get(1) == i3 ? String.format(context.getString(R.string.mtrl_picker_navigate_to_current_year_description), numValueOf) : String.format(context.getString(R.string.mtrl_picker_navigate_to_year_description), numValueOf));
        wnr wnrVar = woaVar.d;
        Calendar calendarD = woq.d();
        wnq wnqVar = calendarD.get(1) == i3 ? wnrVar.f : wnrVar.d;
        Iterator it = woaVar.a.a().iterator();
        while (it.hasNext()) {
            calendarD.setTimeInMillis(((Long) it.next()).longValue());
            if (calendarD.get(1) == i3) {
                wnqVar = wnrVar.e;
            }
        }
        wnqVar.d(textView);
        if (!(textView.getForeground() instanceof FocusRingDrawable)) {
            Drawable drawableA = FocusRingDrawable.a(textView.getContext(), textView.getForeground());
            if (drawableA instanceof FocusRingDrawable) {
                FocusRingDrawable focusRingDrawable = (FocusRingDrawable) drawableA;
                focusRingDrawable.e(wnqVar.f);
                focusRingDrawable.c.p = wnqVar.b();
                textView.setForeground(focusRingDrawable);
            }
        }
        textView.setSelected(wnqVar == wnrVar.e);
        textView.setOnClickListener(new jzy(this, i3, 3));
    }
}
