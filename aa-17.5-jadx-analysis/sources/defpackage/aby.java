package defpackage;

import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final class aby {
    public final acp a;
    public final acq b;
    public final byb c;
    public adi d;

    public /* synthetic */ aby(acp acpVar, acq acqVar, float f, int i) {
        adi adiVar = new adi(true, new abp(1));
        this.a = acpVar;
        this.b = acqVar;
        this.c = new ParcelableSnapshotMutableFloatState((i & 4) != 0 ? BitmapDescriptorFactory.HUE_RED : f);
        this.d = adiVar;
    }
}
