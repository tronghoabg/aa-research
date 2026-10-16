package defpackage;

import android.widget.SeekBar;
import android.widget.TextView;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class na implements SeekBar.OnSeekBarChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ qa b;

    public /* synthetic */ na(qa qaVar, int i) {
        this.a = i;
        this.b = qaVar;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        switch (this.a) {
            case 0:
                int i2 = i + 20;
                qa qaVar = this.b;
                TextView textView = qaVar.l;
                if (textView != null) {
                    textView.setText(i2 + "%");
                }
                if (z) {
                    xc.n(i2, qaVar.a, "speedAlpha");
                    qaVar.d();
                    break;
                }
                break;
            default:
                int i3 = i + 60;
                qa qaVar2 = this.b;
                TextView textView2 = qaVar2.g;
                if (textView2 != null) {
                    textView2.setText(i3 + "%");
                }
                if (z) {
                    xc.n(i3, qaVar2.a, "speedScale");
                    qaVar2.d();
                    break;
                }
                break;
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        int i = this.a;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        int i = this.a;
    }

    private final void a(SeekBar seekBar) {
    }

    private final void b(SeekBar seekBar) {
    }

    private final void c(SeekBar seekBar) {
    }

    private final void d(SeekBar seekBar) {
    }
}
