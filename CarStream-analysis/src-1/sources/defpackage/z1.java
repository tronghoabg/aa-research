package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.carstream.tech.R;
import com.carstream.tech.car.player.ChapterBarView;
import com.carstream.tech.car.player.SeekArea;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class z1 extends ua {
    public final /* synthetic */ int f;
    public TextView g;
    public View h;
    public View i;
    public View j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z1(Context context, int i) {
        super(context);
        this.f = i;
    }

    @Override // defpackage.s8
    public final View a(cd cdVar, r8 r8Var) {
        switch (this.f) {
            case 0:
                this.b = r8Var;
                View viewInflate = LayoutInflater.from(this.a).inflate(R.layout.pl_capsule, (ViewGroup) null, false);
                this.h = (ProgressBar) viewInflate.findViewById(R.id.pl_progress);
                this.j = viewInflate.findViewById(R.id.pl_progress_knob);
                this.g = (TextView) viewInflate.findViewById(R.id.pl_text_time);
                SeekArea seekArea = (SeekArea) viewInflate.findViewById(R.id.pl_progress_touch);
                this.i = seekArea;
                seekArea.b = new x1(this);
                seekArea.a = new x1(this);
                seekArea.addOnLayoutChangeListener(new y1(this, 0));
                m(viewInflate, R.id.pl_btn_prev, cdVar, 1);
                m(viewInflate, R.id.pl_btn_play, cdVar, 3);
                m(viewInflate, R.id.pl_btn_next, cdVar, 2);
                m(viewInflate, R.id.pl_btn_fullscreen, cdVar, 4);
                this.e = (TextView) n(viewInflate, R.id.pl_chip_quality, cdVar, R.drawable.ic_hd);
                n(viewInflate, R.id.pl_btn_cc, cdVar, R.drawable.ic_cc);
                n(viewInflate, R.id.pl_btn_pip, cdVar, R.drawable.ic_mini_player);
                return viewInflate;
            default:
                this.b = r8Var;
                Context context = this.a;
                View viewInflate2 = LayoutInflater.from(context).inflate(R.layout.pl_full, (ViewGroup) null, false);
                ChapterBarView chapterBarView = (ChapterBarView) viewInflate2.findViewById(R.id.pl_chapter_bar);
                this.h = chapterBarView;
                chapterBarView.a = new p8(this);
                chapterBarView.b = new p8(this);
                TextView textView = (TextView) viewInflate2.findViewById(R.id.pl_text_title);
                this.i = textView;
                if (textView != null) {
                    textView.setTypeface(d8.i(context));
                }
                this.j = (TextView) viewInflate2.findViewById(R.id.pl_text_channel);
                this.g = (TextView) viewInflate2.findViewById(R.id.pl_text_time);
                viewInflate2.findViewById(R.id.pl_text_chapter).setVisibility(4);
                viewInflate2.findViewById(R.id.pl_cc_underline).setVisibility(8);
                viewInflate2.findViewById(R.id.pl_text_caption).setVisibility(8);
                m(viewInflate2, R.id.pl_btn_prev, cdVar, 1);
                m(viewInflate2, R.id.pl_btn_play, cdVar, 3);
                m(viewInflate2, R.id.pl_btn_next, cdVar, 2);
                m(viewInflate2, R.id.pl_btn_fullscreen, cdVar, 4);
                n(viewInflate2, R.id.pl_btn_cc, cdVar, R.drawable.ic_cc);
                n(viewInflate2, R.id.pl_btn_pip, cdVar, R.drawable.ic_mini_player);
                n(viewInflate2, R.id.pl_btn_settings, cdVar, R.drawable.ic_hd);
                TextView textView2 = (TextView) n(viewInflate2, R.id.pl_chip_quality, cdVar, R.drawable.ic_hd);
                this.e = textView2;
                if (textView2 != null) {
                    textView2.setText(R.string.pl_quality);
                }
                TextView textView3 = (TextView) n(viewInflate2, R.id.pl_chip_cc, cdVar, R.drawable.ic_cc);
                if (textView3 != null) {
                    textView3.setText(R.string.pl_captions);
                }
                viewInflate2.findViewById(R.id.pl_btn_mute).setVisibility(8);
                return viewInflate2;
        }
    }

    @Override // defpackage.s8
    public final FrameLayout.LayoutParams b(cd cdVar) {
        switch (this.f) {
            case 0:
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                layoutParams.gravity = 80;
                int iG = k1.g(this.a, 20.0f);
                layoutParams.setMargins(iG, 0, iG, iG);
                return layoutParams;
            default:
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
                layoutParams2.gravity = 119;
                return layoutParams2;
        }
    }

    @Override // defpackage.s8
    public final void f(String str) {
        switch (this.f) {
            case 0:
                break;
            default:
                TextView textView = (TextView) this.i;
                if (str == null) {
                    str = "";
                }
                ua.j(textView, str);
                TextView textView2 = (TextView) this.j;
                w6 w6VarL = z6.l();
                ua.j(textView2, w6VarL != null ? w6VarL.n : "");
                break;
        }
    }

    @Override // defpackage.s8
    public final void g(long j, long j2) {
        switch (this.f) {
            case 0:
                if (((ProgressBar) this.h) != null) {
                    ((SeekArea) this.i).b(j2 > 0);
                    ((SeekArea) this.i).a(j2 > 0 ? j / j2 : 0.0f);
                    float fC = ((SeekArea) this.i).c();
                    o(fC);
                    ua.k(this.g, fC, j2);
                    break;
                }
                break;
            default:
                ChapterBarView chapterBarView = (ChapterBarView) this.h;
                if (chapterBarView != null) {
                    chapterBarView.b(j2 > 0);
                    ((ChapterBarView) this.h).a(j2 > 0 ? j / j2 : 0.0f);
                    ua.k(this.g, ((ChapterBarView) this.h).c(), j2);
                    break;
                }
                break;
        }
    }

    public void o(float f) {
        SeekArea seekArea;
        ProgressBar progressBar = (ProgressBar) this.h;
        if (progressBar == null) {
            return;
        }
        progressBar.setProgress((int) (progressBar.getMax() * f));
        if (this.j == null || (seekArea = (SeekArea) this.i) == null || seekArea.getWidth() <= 0) {
            return;
        }
        this.j.setTranslationX(Math.max(0.0f, ((SeekArea) this.i).getWidth() - k1.g(this.a, 28.0f)) * f);
    }

    private final void p(String str) {
    }
}
