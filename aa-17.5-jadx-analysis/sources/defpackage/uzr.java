package defpackage;

import android.content.ComponentName;
import android.content.pm.ResolveInfo;
import com.google.android.projection.gearhead.companion.devsettings.AppQualityTesterActivity;
import com.google.android.projection.gearhead.companion.settings.LauncherAppSettingsActivity;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Map;
import java.util.function.Function;

/* loaded from: classes.dex */
public final /* synthetic */ class uzr implements Function {
    private final /* synthetic */ int a;

    public /* synthetic */ uzr(int i) {
        this.a = i;
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo329andThen(Function function) {
        switch (this.a) {
        }
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        int i = 2;
        switch (this.a) {
            case 0:
                return ((uzp) obj).a().m;
            case 1:
                return Integer.toString(((uvo) obj).a());
            case 2:
                return ((uzp) obj).b();
            case 3:
                ajgw ajgwVar = (ajgw) obj;
                return new vpg(ajgwVar, vph.c(ajgwVar.c == 3 ? (ajhb) ajgwVar.d : ajhb.a));
            case 4:
                return vph.d((ajfr) obj);
            case 5:
                ajgw ajgwVar2 = (ajgw) obj;
                return new vpg(ajgwVar2, vph.d(ajgwVar2.c == 1 ? (ajfr) ajgwVar2.d : ajfr.a));
            case 6:
                return vph.c((ajhb) obj);
            case 7:
                return ((vpi) obj).b();
            case 8:
                ajfr ajfrVar = (ajfr) obj;
                return String.format("%s [%s]", Long.valueOf(ajfrVar.b), ajfrVar.c);
            case 9:
                ajfr ajfrVar2 = (ajfr) obj;
                StringBuilder sb = new StringBuilder();
                sb.append(String.format("Trace ID: %s\n", Long.valueOf(ajfrVar2.b)));
                sb.append(String.format("Trace Name: %s\n", ajfrVar2.c));
                sb.append(String.format("Edge Count: %s\n", Integer.valueOf(ajfrVar2.f.size())));
                for (ajfq ajfqVar : ajfrVar2.d) {
                    int iAp = a.ap(ajfqVar.d);
                    if (iAp == 0) {
                        iAp = 1;
                    }
                    if (iAp == 3) {
                        sb.append(String.format("Dapper URL: http://go/trace/0x%X\n", Long.valueOf(ajfqVar.b == 2 ? ((Long) ajfqVar.c).longValue() : 0L)));
                    }
                }
                return sb.toString().trim();
            case 10:
                ajgw ajgwVar3 = (ajgw) obj;
                return ajgwVar3.c == 1 ? (ajfr) ajgwVar3.d : ajfr.a;
            case 11:
                ajgw ajgwVar4 = (ajgw) obj;
                return ajgwVar4.c == 3 ? (ajhb) ajgwVar4.d : ajhb.a;
            case 12:
                ajhb ajhbVar = (ajhb) obj;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(String.format("Trace ID: %s\n", Long.valueOf(ajhbVar.b)));
                sb2.append(String.format("Trace Name: %s\n", vxk.i(ajhbVar)));
                sb2.append(String.format("Span Count: %s\n", Integer.valueOf(ajhbVar.c.size())));
                ArrayList<Long> arrayList = new ArrayList();
                for (ajha ajhaVar : ajhbVar.c) {
                    if ((ajhaVar.b & 2048) != 0) {
                        arrayList.add(Long.valueOf(ajhaVar.g));
                    }
                }
                for (Long l : arrayList) {
                    l.longValue();
                    sb2.append(String.format("Dapper URL: http://go/trace/0x%X\n", l));
                }
                return sb2.toString().trim();
            case 13:
                ajhb ajhbVar2 = (ajhb) obj;
                return String.format("%s [%s]", Long.valueOf(ajhbVar2.b), vxk.i(ajhbVar2));
            case 14:
                ResolveInfo resolveInfo = (ResolveInfo) obj;
                yph yphVar = AppQualityTesterActivity.m;
                return new ComponentName(resolveInfo.serviceInfo.packageName, resolveInfo.serviceInfo.name);
            case 15:
                return ((ComponentName) obj).flattenToShortString();
            case 16:
                LauncherAppSettingsActivity launcherAppSettingsActivity = (LauncherAppSettingsActivity) obj;
                yph yphVar2 = LauncherAppSettingsActivity.m;
                launcherAppSettingsActivity.getClass();
                rbt rbtVar = launcherAppSettingsActivity.s;
                launcherAppSettingsActivity.getClass();
                return omc.b(launcherAppSettingsActivity, rbtVar, new wzf(launcherAppSettingsActivity, i), null, 0);
            case 17:
                return ((mqz) obj).c.a();
            case 18:
                return ((jez) obj).e;
            case 19:
                return ((yfr) obj).a();
            default:
                return ((Map.Entry) obj).getKey();
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        switch (this.a) {
        }
        return Function$CC.$default$compose(this, function);
    }
}
