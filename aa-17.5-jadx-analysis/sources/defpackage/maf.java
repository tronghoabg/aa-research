package defpackage;

import com.google.android.projection.gearhead.companion.devsettings.DeveloperSettingsActivity;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
public final /* synthetic */ class maf implements Supplier {
    private final /* synthetic */ int a;

    public /* synthetic */ maf(int i) {
        this.a = i;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.a) {
            case 0:
                ThreadLocal threadLocal = mah.a;
                return new DecimalFormat("#0.0#");
            case 1:
                yph yphVar = koo.a;
                return new IllegalStateException("Injection activation requested when config does not exist");
            case 2:
                ThreadLocal threadLocal2 = mah.a;
                return new DecimalFormat("#0.##");
            case 3:
                return new HashMap();
            case 4:
                yph yphVar2 = pgr.a;
                return new IllegalStateException("WPP on TCP config must be present for starting WPP on TCP.");
            case 5:
                ypf ypfVar = qrg.a;
                return true;
            case 6:
                return new ArrayList();
            case 7:
                return Boolean.valueOf(!DeveloperSettingsActivity.g());
            case 8:
                return Boolean.valueOf(!DeveloperSettingsActivity.d());
            case 9:
                yph yphVar3 = DeveloperSettingsActivity.c;
                return Boolean.valueOf(!aclx.c());
            case 10:
                yph yphVar4 = DeveloperSettingsActivity.c;
                return Boolean.valueOf(!a.O());
            case 11:
                yph yphVar5 = DeveloperSettingsActivity.c;
                return Boolean.valueOf(!acrb.z());
            case 12:
                yph yphVar6 = DeveloperSettingsActivity.c;
                return Long.valueOf((int) acxg.b());
            case 13:
                yph yphVar7 = DeveloperSettingsActivity.c;
                return Long.valueOf((int) acxg.e());
            case 14:
                yph yphVar8 = DeveloperSettingsActivity.c;
                return Long.valueOf((int) acxg.f());
            case 15:
                yph yphVar9 = DeveloperSettingsActivity.c;
                return Boolean.valueOf(!acrb.z());
            case 16:
                yph yphVar10 = DeveloperSettingsActivity.c;
                return Boolean.valueOf(!acxg.j());
            case 17:
                yph yphVar11 = DeveloperSettingsActivity.c;
                return Boolean.valueOf(!acvh.o());
            case 18:
                return Boolean.valueOf(!DeveloperSettingsActivity.f());
            case 19:
                return Boolean.valueOf(!DeveloperSettingsActivity.e());
            default:
                return new yfr();
        }
    }
}
