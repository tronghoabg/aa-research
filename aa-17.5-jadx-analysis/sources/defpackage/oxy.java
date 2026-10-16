package defpackage;

import android.content.Intent;

/* loaded from: classes.dex */
public final class oxy extends oxu {
    @Override // defpackage.oxu
    public final Intent g() {
        Intent intent = new Intent();
        mpt.d();
        return intent.setComponent(mpt.a);
    }

    @Override // defpackage.oxu
    public final Intent h() {
        mpt.d();
        return mpt.e().putExtra("com.google.android.gms.car.EXTRA_CAR_ACTIVITY_FLAGS", 1);
    }

    @Override // defpackage.oxu
    protected final String i() {
        return "CLUSTER display";
    }

    @Override // defpackage.oxu
    protected final tgs k() {
        return msd.a().h();
    }
}
