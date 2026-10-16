package io.qonversion.nocodes.internal.screen.view;

import Fe.h;
import android.os.Bundle;
import androidx.fragment.app.C1409a;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.e0;
import com.wynauto.wyn.R;
import ef.C2527k;
import ff.AbstractC2641B;
import java.io.Serializable;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/qonversion/nocodes/internal/screen/view/ScreenActivity;", "Landroidx/fragment/app/FragmentActivity;", "<init>", "()V", "nocodes_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ScreenActivity extends FragmentActivity {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f37467b = 0;

    public ScreenActivity() {
        super(R.layout.nc_activity_screen);
    }

    public final void C(String str, String str2, boolean z2) {
        Bundle bundle = new Bundle();
        bundle.putString("contextKey", str);
        bundle.putString(com.qonversion.android.sdk.automations.mvp.ScreenActivity.INTENT_SCREEN_ID, str2);
        h hVar = new h();
        hVar.setArguments(bundle);
        e0 supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        C1409a c1409a = new C1409a(supportFragmentManager);
        if (z2) {
            c1409a.f18351b = R.anim.nc_slide_in_from_left;
            c1409a.f18352c = R.anim.nc_fade_out;
            c1409a.f18353d = R.anim.nc_fade_in;
            c1409a.f18354e = R.anim.nc_slide_out_to_left;
            if (!c1409a.f18357h) {
                throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
            }
            c1409a.f18356g = true;
            c1409a.f18358i = null;
        }
        c1409a.e(R.id.fragment_container_view, hVar, null, 2);
        c1409a.d(false);
    }

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        Serializable serializableExtra = getIntent().getSerializableExtra(com.qonversion.android.sdk.automations.mvp.ScreenActivity.INTENT_SCREEN_PRESENTATION_STYLE);
        C2527k c2527kX = AbstractC2641B.x(serializableExtra instanceof ae.h ? (ae.h) serializableExtra : null);
        if (c2527kX != null) {
            overridePendingTransition(((Number) c2527kX.f34671a).intValue(), ((Number) c2527kX.f34672b).intValue());
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setFlags(512, 512);
        if (bundle == null) {
            C(getIntent().getStringExtra("contextKey"), null, false);
        }
    }
}
