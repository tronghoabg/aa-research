package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.carstream.tech.R;
import com.carstream.tech.car.player.SeekArea;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class x2 extends ua {
    public ProgressBar f;
    public SeekArea g;
    public ImageView h;
    public TextView i;
    public TextView j;
    public TextView k;
    public TextView l;

    @Override // defpackage.s8
    public final View a(cd cdVar, r8 r8Var) {
        this.b = r8Var;
        Context context = this.a;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.pl_card, (ViewGroup) null, false);
        this.f = (ProgressBar) viewInflate.findViewById(R.id.pl_progress);
        TextView textView = (TextView) viewInflate.findViewById(R.id.pl_text_title);
        this.j = textView;
        if (textView != null) {
            textView.setTypeface(d8.i(context));
        }
        this.k = (TextView) viewInflate.findViewById(R.id.pl_text_meta);
        this.i = (TextView) viewInflate.findViewById(R.id.pl_text_time);
        this.l = (TextView) viewInflate.findViewById(R.id.pl_text_play_label);
        ((TextView) viewInflate.findViewById(R.id.pl_text_now_playing)).setText(R.string.pl_now_playing);
        viewInflate.findViewById(R.id.pl_text_caption).setVisibility(8);
        SeekArea seekArea = (SeekArea) viewInflate.findViewById(R.id.pl_progress_touch);
        this.g = seekArea;
        seekArea.b = new w2(this);
        seekArea.a = new w2(this);
        m(viewInflate, R.id.pl_btn_prev, cdVar, 1);
        View viewM = m(viewInflate, R.id.pl_btn_play, cdVar, 3);
        m(viewInflate, R.id.pl_btn_next, cdVar, 2);
        m(viewInflate, R.id.pl_btn_fullscreen, cdVar, 4);
        if (viewM instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) viewM;
            if (viewGroup.getChildCount() > 0) {
                View childAt = viewGroup.getChildAt(0);
                if (childAt instanceof ImageView) {
                    this.h = (ImageView) childAt;
                }
            }
        }
        TextView textView2 = (TextView) n(viewInflate, R.id.pl_chip_quality, cdVar, R.drawable.ic_hd);
        this.e = textView2;
        if (textView2 != null) {
            textView2.setText(R.string.pl_quality);
        }
        TextView textView3 = (TextView) n(viewInflate, R.id.pl_chip_cc, cdVar, R.drawable.ic_cc);
        if (textView3 != null) {
            textView3.setText(R.string.pl_captions);
        }
        n(viewInflate, R.id.pl_chip_pip, cdVar, R.drawable.ic_mini_player);
        return viewInflate;
    }

    @Override // defpackage.s8
    public final FrameLayout.LayoutParams b(cd cdVar) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 119;
        return layoutParams;
    }

    @Override // defpackage.s8
    public final void f(String str) {
        TextView textView = this.j;
        if (str == null) {
            str = "";
        }
        ua.j(textView, str);
        TextView textView2 = this.k;
        w6 w6VarL = z6.l();
        ua.j(textView2, w6VarL != null ? w6VarL.n : "");
    }

    @Override // defpackage.s8
    public final void g(long j, long j2) {
        if (this.f == null) {
            return;
        }
        this.g.b(j2 > 0);
        this.g.a(j2 > 0 ? j / j2 : 0.0f);
        float fC = this.g.c();
        this.f.setProgress((int) (r5.getMax() * fC));
        ua.k(this.i, fC, j2);
    }

    @Override // defpackage.ua
    public final void i(boolean z) {
        TextView textView = this.l;
        if (textView != null) {
            textView.setText(z ? R.string.pl_pause : R.string.pl_play);
        }
        ImageView imageView = this.h;
        if (imageView != null) {
            imageView.setImageResource(z ? R.drawable.pl_ic_pause : R.drawable.pl_ic_play);
        }
    }
}
