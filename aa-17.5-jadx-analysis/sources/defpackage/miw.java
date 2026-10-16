package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.apps.auto.components.radio.RadioMediaBrowserService;
import com.google.android.gms.car.RadioConfiguration;
import com.google.android.gms.car.RadioMetadata;
import com.google.android.gms.car.RadioProgramInfo;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.AbstractMap;
import java.util.Map;
import java.util.function.Function;

/* loaded from: classes2.dex */
public final /* synthetic */ class miw implements Function {
    private final /* synthetic */ int a;

    public /* synthetic */ miw(int i) {
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
        switch (this.a) {
            case 0:
                return mit.j((RadioProgramInfo) obj);
            case 1:
                return mit.l((RadioProgramInfo) obj);
            case 2:
                return mit.i((RadioProgramInfo) obj);
            case 3:
                return mit.k((RadioProgramInfo) obj);
            case 4:
                return mit.g((RadioProgramInfo) obj);
            case 5:
                return mit.m((RadioProgramInfo) obj);
            case 6:
                return mit.m((RadioProgramInfo) obj);
            case 7:
                return mit.g((RadioProgramInfo) obj);
            case 8:
                yph yphVar = RadioMediaBrowserService.g;
                return ((RadioConfiguration.RadioBandGroup) obj).c;
            case 9:
                yph yphVar2 = RadioMediaBrowserService.g;
                Bundle bundle = new Bundle();
                bundle.putString("androidx.media.utils.extras.KEY_CUSTOM_BROWSER_ACTION_ID", (String) obj);
                return bundle;
            case 10:
                RadioMetadata radioMetadata = ((RadioProgramInfo) obj).b;
                if (radioMetadata == null) {
                    return null;
                }
                String str = radioMetadata.a;
                return TextUtils.isEmpty(str) ? woy.ak(radioMetadata.h) : woy.ak(str);
            case 11:
                String str2 = (String) obj;
                Map.Entry entryE = tgx.e(str2);
                if (entryE == null) {
                    return null;
                }
                if (((Optional) entryE.getValue()).isPresent()) {
                    return new AbstractMap.SimpleImmutableEntry((String) entryE.getKey(), (Long) ((Optional) entryE.getValue()).get());
                }
                ((ype) ((ype) tgx.a.g()).ai((char) 9031)).y("Expected a package:versionCode string, got %s!", str2);
                return null;
            case 12:
                return ((mqc) obj).a();
            case 13:
                return ((mqz) obj).c.a();
            case 14:
                return mqp.b((mqc) obj);
            case 15:
                return ((mqc) obj).a();
            case 16:
                return jfr.c((String) obj);
            case 17:
                String str3 = (String) obj;
                yph yphVar3 = mqv.a;
                return String.valueOf(woy.as(str3.substring(0, 1))).concat(String.valueOf(woy.ar(str3.substring(1))));
            case 18:
                yph yphVar4 = mrj.a;
                return Base64.encodeToString(((mrg) obj).h(), 2);
            case 19:
                String str4 = (String) obj;
                yph yphVar5 = mrj.a;
                try {
                    return (mrg) abnv.x(mrg.a, Base64.decode(str4, 2));
                } catch (abon e) {
                    ((ype) ((ype) ((ype) mrj.a.g()).p(e)).ai((char) 5219)).u("error decoding shortcut from disk");
                    ebf.j().F(rrc.h(yxy.GEARHEAD, yzz.LAUNCHER_SHORTCUT, yzy.uX).l());
                    return null;
                }
            default:
                return ((mrl) obj).i();
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        switch (this.a) {
        }
        return Function$CC.$default$compose(this, function);
    }
}
