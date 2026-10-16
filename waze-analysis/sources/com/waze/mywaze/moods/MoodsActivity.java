package com.waze.mywaze.moods;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.waze.ConfigManager;
import com.waze.MoodManager;
import com.waze.R;
import com.waze.ab.o;
import com.waze.ab.s;
import com.waze.app_nav.hub.b.h;
import com.waze.app_nav.hub.b.i;
import com.waze.app_nav.hub.b.k;
import com.waze.app_nav.hub.b.m;
import com.waze.config.ConfigValues;
import com.waze.design_components.header_view.WazeHeaderView;
import com.waze.gp;
import com.waze.settings.bl;
import com.waze.settings.gw;
import com.waze.shared_infra.g.e;
import java.util.ArrayList;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public class MoodsActivity extends com.waze.ifs.ui.a {

    /* renamed from: f, reason: collision with root package name */
    private boolean f30605f = false;

    /* renamed from: g, reason: collision with root package name */
    private final com.waze.shared_infra.o.a f30606g = com.waze.shared_infra.o.b.a();

    /* renamed from: h, reason: collision with root package name */
    private final MoodManager f30607h = MoodManager.getInstance();

    public static /* synthetic */ i m(MoodsActivity moodsActivity, Context context) {
        o oVar = new o();
        com.waze.shared_infra.o.a aVar = moodsActivity.f30606g;
        oVar.Q(aVar.c(R.string.WANNA_PICK_A_NEW_MOODQ, new Object[0]));
        oVar.P(moodsActivity.f30607h.getNewbieMessage(R.string.YOUSRE_A_BABY_WAZER_NOW_H_BUT_NOT_FOR_LONGE_DRIVE_PD_PS_TO_UNLOCK_MOODS___));
        oVar.M(aVar.c(R.string.OK, new Object[0]));
        s sVar = new s(context, oVar);
        sVar.show();
        return new h(sVar);
    }

    private final String n(String str) {
        String strB = this.f30606g.b(str);
        return strB.endsWith(".") ? strB.substring(0, strB.length() - 1) : strB;
    }

    @Override // com.waze.ifs.ui.a, com.waze.sharedui.a.e, com.waze.app_nav.hub.af, android.support.v4.app.av, androidx.activity.ComponentActivity, android.support.v4.app.dd, android.app.Activity
    protected final void onCreate(Bundle bundle) throws Resources.NotFoundException {
        aE();
        super.onCreate(bundle);
        setContentView(R.layout.moods);
        if (bundle != null && bundle.containsKey("baby_wazer_popup_shown")) {
            this.f30605f = bundle.getBoolean("baby_wazer_popup_shown");
        }
        WazeHeaderView wazeHeaderView = (WazeHeaderView) findViewById(R.id.headerView);
        com.waze.shared_infra.o.a aVar = this.f30606g;
        wazeHeaderView.h(aVar.c(R.string.MY_MOOD, new Object[0]));
        ArrayList arrayList = new ArrayList();
        MoodManager moodManager = this.f30607h;
        if (moodManager.isBaby()) {
            arrayList.add(new a(null, aVar.c(R.string.WAZE_NEWBIE, new Object[0]) + " " + moodManager.getNewbieMessage(R.string.OGOTTA_DRIVE_PDP_PS_TO_ACCESS_OTHER_MOODSU), null, true, false, false));
            arrayList.add(new a(getResources().getString(R.string.babyMood), n(getResources().getString(R.string.babyMoodCaption)), MoodManager.getUpScaledMoodDrawable(this, getResources().getString(R.string.babyMood)), false, true, true));
        }
        arrayList.add(new a(null, aVar.c(R.string.EXCLUSIVES_FOR_MAP_EDITORS, new Object[0]), null, true, false, false));
        String[] stringArray = getResources().getStringArray(R.array.mood_list_exclusive);
        int i2 = 0;
        while (true) {
            int length = stringArray.length;
            if (i2 >= length) {
                break;
            }
            String str = stringArray[i2];
            arrayList.add(new a(str, n(str), MoodManager.getUpScaledMoodDrawable(this, stringArray[i2]), false, moodManager.canSetMood(this, stringArray[i2]), i2 == length + (-1)));
            i2++;
        }
        if (ConfigManager.getInstance().getConfigValueBool(ConfigValues.CONFIG_VALUE_MOODS_BETA_ENABLED)) {
            arrayList.add(new a(null, aVar.c(R.string.BETA_MOODS, new Object[0]), null, true, false, false));
            String[] stringArray2 = getResources().getStringArray(R.array.mood_list_beta);
            int i3 = 0;
            while (true) {
                int length2 = stringArray2.length;
                if (i3 >= length2) {
                    break;
                }
                String str2 = stringArray2[i3];
                arrayList.add(new a(str2, n(str2), MoodManager.getUpScaledMoodDrawable(this, stringArray2[i3]), false, moodManager.canSetMood(this, stringArray2[i3]), i3 == length2 + (-1)));
                i3++;
            }
        }
        MoodManager.Mood[] customMoodsList = MoodManager.getInstance().getCustomMoodsList();
        if (customMoodsList.length > 0) {
            arrayList.add(new a(null, aVar.c(R.string.SPECIAL_MOODS, new Object[0]), null, true, false, false));
            boolean z = true;
            for (int i4 = 0; i4 < customMoodsList.length; i4++) {
                Drawable upScaledMoodDrawable = MoodManager.getUpScaledMoodDrawable(this, customMoodsList[i4].name);
                if (upScaledMoodDrawable != null) {
                    String str3 = customMoodsList[i4].name;
                    arrayList.add(new a(str3, n(str3), upScaledMoodDrawable, false, moodManager.canSetMood(this, customMoodsList[i4].name), false));
                    z = false;
                }
            }
            if (z) {
                arrayList.remove(arrayList.size() - 1);
            } else {
                ((a) arrayList.get(arrayList.size() - 1)).f30613f = true;
            }
        }
        arrayList.add(new a(null, aVar.c(R.string.EVERYDAY_MOODS, new Object[0]) + " " + aVar.c(R.string.OAVAILABLE_TO_ALLU, new Object[0]), null, true, false, false));
        MoodManager.Mood[] defaultMoodsList = MoodManager.getInstance().getDefaultMoodsList();
        for (int i5 = 0; i5 < defaultMoodsList.length; i5++) {
            Drawable upScaledMoodDrawable2 = MoodManager.getUpScaledMoodDrawable(this, defaultMoodsList[i5].name);
            if (upScaledMoodDrawable2 != null) {
                String str4 = defaultMoodsList[i5].name;
                arrayList.add(new a(str4, n(str4), upScaledMoodDrawable2, false, moodManager.canSetMood(this, defaultMoodsList[i5].name), false));
            }
        }
        ((a) arrayList.get(arrayList.size() - 1)).f30613f = true;
        a[] aVarArr = (a[]) arrayList.toArray(new a[0]);
        bl blVar = new bl();
        blVar.c();
        blVar.d();
        gw[] gwVarArr = new gw[aVarArr.length];
        String wazerMood = moodManager.getWazerMood();
        for (int i6 = 0; i6 < aVarArr.length; i6++) {
            a aVar2 = aVarArr[i6];
            String str5 = aVar2.f30608a;
            gw gwVar = new gw(str5, aVar2.f30609b, str5 != null ? str5.equals(wazerMood) : false);
            gwVarArr[i6] = gwVar;
            a aVar3 = aVarArr[i6];
            gwVar.f37352e = aVar3.f30610c;
            gwVar.f37354g = aVar3.f30611d;
        }
        blVar.a(gwVarArr);
        ListView listView = (ListView) findViewById(R.id.moodList);
        listView.setAdapter((ListAdapter) blVar);
        listView.setOnItemClickListener(new b(this, aVarArr, blVar));
        com.waze.shared_infra.i.h.A(listView);
        e.d((ViewGroup) findViewById(R.id.moodsRelativeLayout), listView);
    }

    @Override // com.waze.ifs.ui.a, com.waze.sharedui.a.e, android.support.v4.app.av, android.app.Activity
    protected final void onResume() {
        super.onResume();
        if (!this.f30607h.isBaby() || this.f30605f) {
            return;
        }
        this.f30605f = true;
        m.c().b(new k("showBabyMessage", new gp(this, 7)));
    }

    @Override // androidx.activity.ComponentActivity, android.support.v4.app.dd, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("baby_wazer_popup_shown", this.f30605f);
    }
}
