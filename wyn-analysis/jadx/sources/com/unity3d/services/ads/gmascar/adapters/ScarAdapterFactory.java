package com.unity3d.services.ads.gmascar.adapters;

import A7.AbstractC0279p0;
import D6.c1;
import ad.L;
import com.unity3d.scar.adapter.common.a;
import com.unity3d.scar.adapter.common.b;
import com.unity3d.scar.adapter.common.c;
import com.unity3d.scar.adapter.common.e;
import com.unity3d.services.ads.gmascar.finder.ScarAdapterVersion;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.properties.SdkProperties;
import java.lang.reflect.InvocationTargetException;
import tc.j;
import wb.C4399a;

/* loaded from: classes4.dex */
public class ScarAdapterFactory {

    /* renamed from: com.unity3d.services.ads.gmascar.adapters.ScarAdapterFactory$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$unity3d$services$ads$gmascar$finder$ScarAdapterVersion;

        static {
            int[] iArr = new int[ScarAdapterVersion.values().length];
            $SwitchMap$com$unity3d$services$ads$gmascar$finder$ScarAdapterVersion = iArr;
            try {
                iArr[ScarAdapterVersion.V21.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$unity3d$services$ads$gmascar$finder$ScarAdapterVersion[ScarAdapterVersion.V23.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$unity3d$services$ads$gmascar$finder$ScarAdapterVersion[ScarAdapterVersion.NA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private void reportAdapterFailure(ScarAdapterVersion scarAdapterVersion, c cVar) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        String strL = AbstractC0279p0.l("SCAR version ", scarAdapterVersion.name(), " is not supported.");
        cVar.handleError(new a(b.f32693g, strL, new Object[0]));
        DeviceLog.debug(strL);
    }

    public e createScarAdapter(ScarAdapterVersion scarAdapterVersion, c cVar) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        int i5 = AnonymousClass1.$SwitchMap$com$unity3d$services$ads$gmascar$finder$ScarAdapterVersion[scarAdapterVersion.ordinal()];
        if (i5 == 1) {
            String versionName = SdkProperties.getVersionName();
            pb.b bVar = new pb.b(cVar, 0);
            c1 c1Var = new c1(versionName);
            L l10 = new L(23);
            l10.f17515b = c1Var;
            bVar.f43453f = l10;
            sb.b bVar2 = new sb.b(21);
            bVar2.f45411b = l10;
            bVar.f1970a = bVar2;
            return bVar;
        }
        if (i5 != 2) {
            reportAdapterFailure(scarAdapterVersion, cVar);
            return null;
        }
        String versionName2 = SdkProperties.getVersionName();
        pb.b bVar3 = new pb.b(cVar, 1);
        c1 c1Var2 = new c1(versionName2);
        j jVar = new j();
        jVar.f46015a = c1Var2;
        bVar3.f43453f = jVar;
        C4399a c4399a = new C4399a(21);
        c4399a.f47457b = jVar;
        bVar3.f1970a = c4399a;
        return bVar3;
    }
}
