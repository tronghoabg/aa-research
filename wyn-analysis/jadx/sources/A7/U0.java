package A7;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.unity3d.ads.core.data.datasource.AndroidTcfDataSource;

/* loaded from: classes4.dex */
public final /* synthetic */ class U0 implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ P0 f712a;

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        P0 p02 = this.f712a;
        p02.getClass();
        if (AndroidTcfDataSource.TCF_TCSTRING_KEY.equals(str)) {
            p02.zzj().f612n.c("IABTCF_TCString change picked up in listener.");
            X0 x02 = p02.f667u;
            AbstractC1732v.i(x02);
            x02.b(500L);
        }
    }
}
