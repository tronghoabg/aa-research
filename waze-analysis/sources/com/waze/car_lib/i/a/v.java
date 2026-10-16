package com.waze.car_lib.i.a;

import android.view.View;
import com.waze.config.ConfigValues;
import com.waze.jni.protos.settings.SettingsValueListProto;
import com.waze.jni.protos.settings.SettingsValueProto;
import com.waze.network.f.ak;
import com.waze.planned_drive.af;
import com.waze.settings.ba;
import com.waze.settings.gr;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class v implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f19919a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f19920b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f19921c;

    public /* synthetic */ v(Object obj, Object obj2, int i2) {
        this.f19921c = i2;
        this.f19919a = obj;
        this.f19920b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlinx.coroutines.b.bn] */
    /* JADX WARN: Type inference failed for: r0v18, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlinx.coroutines.b.bn] */
    /* JADX WARN: Type inference failed for: r4v13, types: [com.waze.sound.fm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v19, types: [androidx.compose.runtime.MutableState, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v12, types: [com.waze.settings.de, java.lang.Object] */
    @Override // h.g.a.l
    public final Object invoke(Object obj) {
        ArrayList arrayListH;
        List<SettingsValueProto> valuesList;
        int i2 = this.f19921c;
        if (i2 == 0) {
            return x.f((x) this.f19919a, this.f19920b, (String) obj);
        }
        if (i2 == 1) {
            return t.f((t) this.f19919a, this.f19920b, (String) obj);
        }
        if (i2 == 2) {
            if (h.g.b.x.n((Boolean) obj, true)) {
                ((View) this.f19919a).setOnClickListener(new af(this.f19920b, 17));
            }
            return h.ab.f48028a;
        }
        if (i2 == 3) {
            if (h.g.b.x.n((Boolean) obj, true)) {
                ((View) this.f19919a).setOnClickListener(new af(this.f19920b, 20));
            }
            return h.ab.f48028a;
        }
        if (i2 == 4) {
            int iIntValue = ((Integer) obj).intValue();
            ((gr) this.f19919a).d().f().setConfigValueLong(ConfigValues.CONFIG_VALUE_SOUND_PROMPTS_VOLUME_ANDROID, iIntValue);
            this.f19920b.d(iIntValue);
            return h.ab.f48028a;
        }
        if (i2 != 5) {
            ba baVar = (ba) obj;
            h.g.b.x.f(baVar, "it");
            baVar.z(this.f19920b);
            this.f19919a.setValue(baVar.getTag());
            return h.ab.f48028a;
        }
        SettingsValueListProto settingsValueListProto = (SettingsValueListProto) obj;
        int i3 = com.waze.settings.tree.k.f37573b;
        if (settingsValueListProto == null || (valuesList = settingsValueListProto.getValuesList()) == null) {
            arrayListH = h.a.i.h();
        } else {
            List<SettingsValueProto> list = valuesList;
            ArrayList arrayList = new ArrayList(h.a.i.q(list, 10));
            for (SettingsValueProto settingsValueProto : list) {
                h.g.b.x.c(settingsValueProto);
                arrayList.add(ak.o(settingsValueProto));
            }
            arrayListH = arrayList;
        }
        ?? r5 = this.f19919a;
        ((com.waze.settings.tree.l) this.f19920b).L(arrayListH);
        r5.k().J();
        return h.ab.f48028a;
    }

    public /* synthetic */ v(Object obj, Object obj2, int i2, byte[] bArr) {
        this.f19921c = i2;
        this.f19920b = obj;
        this.f19919a = obj2;
    }
}
