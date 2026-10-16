package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.media.MediaBrowserCompat;
import android.text.TextUtils;
import com.google.android.gms.car.RadioConfiguration;
import com.google.android.gms.car.RadioProgramInfo;
import com.google.android.projection.gearhead.R;
import j$.util.function.Function$CC;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;

/* loaded from: classes.dex */
public final /* synthetic */ class lpc implements Function {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ lpc(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo329andThen(Function function) {
        switch (this.b) {
        }
        return Function$CC.$default$andThen(this, function);
    }

    /* JADX WARN: Type inference failed for: r14v14, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v16, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v18, types: [afec, java.lang.Object] */
    @Override // java.util.function.Function
    public final Object apply(Object obj) throws IOException {
        String strCu;
        switch (this.b) {
            case 0:
                return lpq.h((qrn) this.a, (lpf) obj);
            case 1:
                yph yphVar = lpq.a;
                return new lpo((lmb) this.a);
            case 2:
                yph yphVar2 = lpz.a;
                return new lpr((llu) obj, (ComponentName) this.a);
            case 3:
                int i = 4;
                return tby.C(tby.v(tby.C(((lqv) this.a).a, new lpx(loy.j(), i)), new lqc(i)), new lpx(((llu) obj).i(), 5));
            case 4:
                mct mctVar = mcu.a;
                return this.a.invoke(obj);
            case 5:
                mct mctVar2 = mcu.a;
                return this.a.invoke(obj);
            case 6:
                mct mctVar3 = mcu.a;
                return this.a.invoke(obj);
            case 7:
                RadioProgramInfo radioProgramInfo = (RadioProgramInfo) obj;
                yph yphVar3 = mil.a;
                return new mik(((miv) this.a).u(radioProgramInfo), radioProgramInfo.a);
            case 8:
                RadioProgramInfo radioProgramInfo2 = (RadioProgramInfo) obj;
                yph yphVar4 = mil.a;
                return new mik(((miv) this.a).u(radioProgramInfo2), radioProgramInfo2.a);
            case 9:
                mih mihVar = (mih) obj;
                dc dcVar = new dc();
                RadioConfiguration.RadioBandGroup radioBandGroup = mihVar.c;
                Context context = ((min) this.a).f;
                if (radioBandGroup == null) {
                    strCu = context.getString(R.string.radio_node_favorites_display_name);
                    strCu.getClass();
                } else {
                    List<Integer> list = radioBandGroup.a;
                    list.getClass();
                    if (affa.f(woy.cl(list), mih.a)) {
                        strCu = context.getString(R.string.radio_node_stations_display_name);
                        strCu.getClass();
                    } else {
                        list.getClass();
                        ArrayList arrayList = new ArrayList(woy.bp(list, 10));
                        for (Integer num : list) {
                            arrayList.add((num != null && num.intValue() == 1) ? context.getString(R.string.radio_node_am_display_name) : (num != null && num.intValue() == 2) ? context.getString(R.string.radio_node_fm_display_name) : (num != null && num.intValue() == 3) ? context.getString(R.string.radio_node_dab_display_name) : null);
                        }
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj2 : arrayList) {
                            String str = (String) obj2;
                            if (str != null && str.length() != 0) {
                                arrayList2.add(obj2);
                            }
                        }
                        strCu = woy.cu(arrayList2, " | ", null, null, null, 62);
                    }
                }
                dcVar.b = strCu;
                dcVar.a = mihVar.a();
                String str2 = radioBandGroup != null ? radioBandGroup.c : null;
                Bundle bundle = new Bundle();
                if (mihVar.c()) {
                    bundle.putInt("android.media.browse.CONTENT_STYLE_PLAYABLE_HINT", 2);
                } else if (!TextUtils.isEmpty(str2)) {
                    ArrayList<String> arrayList3 = new ArrayList<>();
                    arrayList3.add(str2);
                    bundle.putStringArrayList("androidx.media.utils.extras.CUSTOM_BROWSER_ACTION_ID_LIST", arrayList3);
                }
                if (radioBandGroup != null) {
                    ArrayList<Integer> arrayList4 = new ArrayList<>();
                    Iterator it = radioBandGroup.a.iterator();
                    while (it.hasNext()) {
                        arrayList4.add((Integer) it.next());
                    }
                    bundle.putIntegerArrayList("com.google.android.apps.auto.radio.CONFIGURED_BANDS", arrayList4);
                }
                if (!bundle.isEmpty()) {
                    dcVar.g = bundle;
                }
                return new MediaBrowserCompat.MediaItem(dcVar.a(), 1);
            case 10:
                return (String) lk$$ExternalSyntheticApiModelOutline0.m352m(obj).apply(this.a);
            case 11:
                return ((mit) this.a).e((RadioProgramInfo) obj);
            case 12:
                return ((mit) this.a).e((RadioProgramInfo) obj);
            case 13:
                return ((mit) this.a).f((RadioProgramInfo) obj);
            case 14:
                return ((mit) this.a).d((RadioProgramInfo) obj);
            case 15:
                return ((mit) this.a).h((RadioProgramInfo) obj);
            case 16:
                return ((mit) this.a).e((RadioProgramInfo) obj);
            case 17:
                return ((mit) this.a).d((RadioProgramInfo) obj);
            case 18:
                return ((mit) this.a).f((RadioProgramInfo) obj);
            case 19:
                return ((mit) this.a).e((RadioProgramInfo) obj);
            default:
                return ((mit) this.a).d((RadioProgramInfo) obj);
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        switch (this.b) {
        }
        return Function$CC.$default$compose(this, function);
    }
}
