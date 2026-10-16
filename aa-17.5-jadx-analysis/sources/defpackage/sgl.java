package defpackage;

import com.google.android.gms.carsetup.setup.UsbConnectionHelper;
import java.util.List;

/* loaded from: classes2.dex */
public final /* synthetic */ class sgl implements rkz {
    private final /* synthetic */ int a;

    @Override // defpackage.rkz
    public final Object a(pat patVar) {
        if (this.a != 0) {
            yph yphVar = koo.a;
            return 0;
        }
        List list = UsbConnectionHelper.TrackedParcelFileDescriptor.a;
        return Boolean.valueOf(patVar == pat.NO_OP);
    }
}
