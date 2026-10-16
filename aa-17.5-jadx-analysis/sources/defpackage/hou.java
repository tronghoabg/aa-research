package defpackage;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class hou extends hng {
    public static final hot b = new hot();
    public final String c;

    public hou(String str) {
        super(hnh.i);
        this.c = str;
    }

    @Override // defpackage.hng
    public final void a(Bundle bundle) {
        bundle.putString("entity_type", this.c);
    }
}
