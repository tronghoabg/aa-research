package defpackage;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class hpi extends hng {
    public static final hno b = new hno(11);
    private final hpj c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hpi(hpj hpjVar) {
        super(hnh.k);
        hpjVar.getClass();
        this.c = hpjVar;
    }

    @Override // defpackage.hng
    public final void a(Bundle bundle) {
        bundle.putInt("VISUAL_METADATA_HINT__VISUAL_STYLE_KEY", this.c.ordinal());
    }
}
