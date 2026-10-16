package defpackage;

import com.google.android.projection.gearhead.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class pdm {
    public static final pdm a;
    private static final /* synthetic */ pdm[] d;
    public final int c = 2;
    public final int b = R.string.status_phone_wifi_disabled;

    static {
        pdm pdmVar = new pdm();
        a = pdmVar;
        d = new pdm[]{pdmVar};
    }

    private pdm() {
    }

    public static pdm valueOf(String str) {
        return (pdm) Enum.valueOf(pdm.class, str);
    }

    public static pdm[] values() {
        return (pdm[]) d.clone();
    }
}
