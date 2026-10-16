package defpackage;

import com.google.android.projection.gearhead.R;

/* loaded from: classes.dex */
public class lcf extends lce {
    /* JADX WARN: Multi-variable type inference failed */
    public lcf(byte[] bArr) {
        super(new lcc(yzy.FV, R.drawable.csat_icon_very_satisfied, R.string.csat_response_very_satisfied, null, null, 24), new lcc(yzy.FU, R.drawable.csat_icon_satisfied, R.string.csat_response_somewhat_satisfied, null, null, 24), new lcc(yzy.FT, R.drawable.csat_icon_neutral, R.string.csat_response_neutral, 0 == true ? 1 : 0, null, 24), new lcc(yzy.FS, R.drawable.csat_icon_dissatisfied, R.string.csat_response_somewhat_dissatisfied, 0 == true ? 1 : 0, null, 24), new lcc(yzy.FR, R.drawable.csat_icon_very_dissatisfied, R.string.csat_response_very_dissatisfied, 0 == true ? 1 : 0, null, 24));
    }

    public lcf() {
        super(new lcc(yzy.FQ, R.drawable.csat_icon_thumbs_up, R.string.csat_response_great, null, 8, 8), new lcc(yzy.FP, R.drawable.csat_icon_thumbs_down, R.string.csat_response_not_great, null, 9, 8));
    }
}
