package defpackage;

import android.graphics.Bitmap;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
final class zzx extends hrl {
    private final String n;

    public zzx(String str, hqy hqyVar, String str2) {
        super(str, hqyVar, Bitmap.Config.ARGB_8888, zzz.b);
        this.n = str2;
    }

    @Override // defpackage.hqt
    public final Map d() throws hqg {
        HashMap map = new HashMap();
        map.put("User-Agent", this.n);
        return map;
    }
}
