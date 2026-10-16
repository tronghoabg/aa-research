package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class eyo implements android.widget.SeekBar.OnSeekBarChangeListener {
    final /* synthetic */ androidx.preference.SeekBarPreference a;

    public eyo(androidx.preference.SeekBarPreference seekBarPreference) {
        this.a = seekBarPreference;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(android.widget.SeekBar seekBar, int i, boolean z) {
        if (z) {
            androidx.preference.SeekBarPreference seekBarPreference = this.a;
            if (seekBarPreference.f || !seekBarPreference.c) {
                seekBarPreference.k(seekBar);
                return;
            }
        }
        androidx.preference.SeekBarPreference seekBarPreference2 = this.a;
        seekBarPreference2.l(i + seekBarPreference2.b);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(android.widget.SeekBar seekBar) {
        this.a.c = true;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(android.widget.SeekBar seekBar) {
        androidx.preference.SeekBarPreference seekBarPreference = this.a;
        seekBarPreference.c = false;
        if (seekBar.getProgress() + seekBarPreference.b != seekBarPreference.a) {
            seekBarPreference.k(seekBar);
        }
    }
}
