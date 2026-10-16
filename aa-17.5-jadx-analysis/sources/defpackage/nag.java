package defpackage;

import android.content.ComponentName;
import com.google.android.apps.auto.components.media.compat.AaPlaybackState;
import com.google.android.apps.auto.components.media.repository.suggestion.AssistantMediaSuggestionPlaybackPayload;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final /* synthetic */ class nag implements afec {
    private final /* synthetic */ int a;

    public /* synthetic */ nag(int i) {
        this.a = i;
    }

    @Override // defpackage.afec
    public final Object invoke(Object obj) {
        String string;
        String string2;
        String string3;
        String string4;
        switch (this.a) {
            case 0:
                ((cun) obj).getClass();
                return afak.a;
            case 1:
                ((Integer) obj).intValue();
                return afak.a;
            case 2:
                ((cun) obj).getClass();
                return afak.a;
            case 3:
                List list = (List) obj;
                list.getClass();
                return woy.bU(list);
            case 4:
                aezr aezrVar = naq.d;
                return lpz.d().b((ComponentName) obj);
            case 5:
                aezr aezrVar2 = naq.d;
                ((yfq) obj).getClass();
                return Boolean.valueOf(!woy.bU(r10).isEmpty());
            case 6:
                lpt lptVar = (lpt) obj;
                lptVar.getClass();
                return lptVar.d();
            case 7:
                AssistantMediaSuggestionPlaybackPayload assistantMediaSuggestionPlaybackPayload = (AssistantMediaSuggestionPlaybackPayload) obj;
                assistantMediaSuggestionPlaybackPayload.getClass();
                return assistantMediaSuggestionPlaybackPayload.b.c;
            case 8:
                mzb mzbVar = (mzb) obj;
                mzbVar.getClass();
                int iOrdinal = mzbVar.ordinal();
                return iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 4 ? naw.c : naw.d : naw.a : naw.b;
            case 9:
                return Boolean.valueOf(((Float) obj).floatValue() < 0.2f);
            case 10:
                ((Float) obj).getClass();
                return Float.valueOf(afpt.d((r10.floatValue() - 0.4f) / 0.20000002f, BitmapDescriptorFactory.HUE_RED, 1.0f));
            case 11:
                AaPlaybackState aaPlaybackState = (AaPlaybackState) obj;
                aaPlaybackState.getClass();
                return Integer.valueOf(aaPlaybackState.Q());
            case 12:
                Integer num = (Integer) obj;
                num.intValue();
                return Boolean.valueOf(nbb.c.contains(num));
            case 13:
                lmd lmdVar = (lmd) obj;
                lmdVar.getClass();
                String strQ = lmdVar.Q("android.media.metadata.TITLE");
                return (strQ == null || (string = afyh.l(strQ).toString()) == null) ? lnm.h(lmdVar, "com.google.android.apps.auto.radio.HD_SUB_CHANNEL", "com.google.android.apps.auto.radio.STATION_NAME") : string;
            case 14:
                lmd lmdVar2 = (lmd) obj;
                lmdVar2.getClass();
                return lnm.g(lmdVar2, "com.google.android.apps.auto.radio.FREQUENCY", "com.google.android.apps.auto.radio.HD_SUB_CHANNEL");
            case 15:
                lmd lmdVar3 = (lmd) obj;
                lmdVar3.getClass();
                String strQ2 = lmdVar3.Q("android.media.metadata.TITLE");
                return (strQ2 == null || (string2 = afyh.l(strQ2).toString()) == null) ? lnm.g(lmdVar3, "com.google.android.apps.auto.radio.FREQUENCY", "com.google.android.apps.auto.radio.HD_SUB_CHANNEL") : string2;
            case 16:
                lmd lmdVar4 = (lmd) obj;
                lmdVar4.getClass();
                String strQ3 = lmdVar4.Q("android.media.metadata.ARTIST");
                if (strQ3 != null && (string3 = afyh.l(strQ3).toString()) != null) {
                    return string3;
                }
                String strQ4 = lmdVar4.Q("com.google.android.apps.auto.radio.STATION_NAME");
                if (strQ4 != null) {
                    return afyh.l(strQ4).toString();
                }
                return null;
            case 17:
                lmd lmdVar5 = (lmd) obj;
                lmdVar5.getClass();
                String strQ5 = lmdVar5.Q("android.media.metadata.ARTIST");
                if (strQ5 != null && (string4 = afyh.l(strQ5).toString()) != null) {
                    return string4;
                }
                String strQ6 = lmdVar5.Q("com.google.android.apps.auto.radio.MESSAGE");
                if (strQ6 != null) {
                    return afyh.l(strQ6).toString();
                }
                return null;
            case 18:
                int i = nca.a;
                return obj == null ? tby.b : dtx.p((1 & 1) != 0 ? afcp.a : null, (1 & 2) != 0 ? 5000L : 0L, new gqn((afck) null, 4, (int[]) null));
            case 19:
                aezu aezuVar = (aezu) obj;
                nci nciVar = ncj.a;
                aezuVar.getClass();
                Object obj2 = aezuVar.b;
                ComponentName componentName = (ComponentName) aezuVar.a;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : (List) obj2) {
                    moe moeVar = (moe) obj3;
                    if (moeVar.a.getAction() == null) {
                        Objects.toString(moeVar);
                        arrayList.add(String.valueOf(moeVar).concat("'s action is null"));
                    } else {
                        arrayList2.add(obj3);
                    }
                }
                if (!arrayList.isEmpty()) {
                    ((ype) ((ype) ncj.c.f()).l(1, TimeUnit.MINUTES)).D("Ignored %d suggestions: %s", arrayList.size(), arrayList);
                }
                String packageName = componentName != null ? componentName.getPackageName() : null;
                ArrayList arrayList3 = new ArrayList(woy.bp(arrayList2, 10));
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList3.add(new ncf((moe) it.next()));
                }
                return new ncg(packageName, arrayList3);
            default:
                ComponentName componentName2 = (ComponentName) obj;
                nci nciVar2 = ncj.a;
                return Boolean.valueOf(componentName2 != null ? !map.c(componentName2.getPackageName()) : false);
        }
    }
}
