package defpackage;

import android.widget.SeekBar;
import android.widget.TextView;
import com.carstream.tech.car.e;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class ca implements SeekBar.OnSeekBarChangeListener {
    public final /* synthetic */ TextView a;
    public final /* synthetic */ String b;
    public final /* synthetic */ fa c;

    public ca(fa faVar, TextView textView, String str) {
        this.c = faVar;
        this.a = textView;
        this.b = str;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        this.a.setText(i + "%");
        fa faVar = this.c;
        xc.n(i, faVar.a, this.b);
        e eVar = faVar.c;
        if (eVar != null) {
            eVar.o();
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
    }
}
