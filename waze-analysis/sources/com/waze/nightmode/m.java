package com.waze.nightmode;

import androidx.camera.core.processing.util.GLUtils;
import androidx.compose.runtime.SnapshotIntStateKt;
import com.waze.config.ConfigValues;
import com.waze.search.v2.bt;
import com.waze.search.v2.cu;
import com.waze.search.v2.df;
import java.math.RoundingMode;
import java.text.DecimalFormat;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class m implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f32479a;

    public /* synthetic */ m(int i2) {
        this.f32479a = i2;
    }

    @Override // h.g.a.a
    public final Object invoke() {
        switch (this.f32479a) {
            case 0:
                return t.b();
            case 1:
                return Float.valueOf(ConfigValues.CONFIG_VALUE_SEARCH_DONT_TYPE_WHILE_DRIVING_WARNING_THRESHOLD_SPEED_KPH.b().longValue());
            case 2:
                return SnapshotIntStateKt.mutableIntStateOf(0);
            case 3:
                return h.ab.f48028a;
            case 4:
                return h.ab.f48028a;
            case 5:
                int i2 = bt.f36200a;
                return com.waze.shared_infra.i.a.d("SearchV2Events");
            case 6:
                int i3 = cu.f36302a;
                return h.ab.f48028a;
            case 7:
                int i4 = df.f36355a;
                return new DecimalFormat(GLUtils.VERSION_UNKNOWN);
            case 8:
                int i5 = df.f36355a;
                return new DecimalFormat("###");
            case 9:
                int i6 = df.f36355a;
                DecimalFormat decimalFormat = new DecimalFormat("#.#");
                decimalFormat.setRoundingMode(RoundingMode.DOWN);
                return decimalFormat;
            default:
                int i7 = df.f36355a;
                return new DecimalFormat("########");
        }
    }
}
